import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class UI extends JFrame {
    private static TableOrdersManager tableManager = new TableOrdersManager(10);
    private static InternetOrdersManager internetManager = new InternetOrdersManager();

    public UI(){
        super("Заказ напитков");
        JPanel win = new JPanel();
        JPanel workArea = new JPanel();
        JPanel buttonArea = new JPanel();
        JButton interOrder = new JButton("Заказать с доставкой");
        JButton tableOrder = new JButton("Заказать в ресторане");
        JLabel choice = new JLabel("Выберите напитки для вашего заказа:");
        JLabel order = new JLabel("Ваш заказ:");
        JButton addIt = new JButton("Добавить в заказ");
        JButton removeIt = new JButton("Убрать из заказа");


        workArea.setLayout(new GridBagLayout());
        buttonArea.setLayout(new GridLayout(2, 1, 5, 8));
        win.setLayout(new FlowLayout(FlowLayout.CENTER));

        setSize(520, 377);

        GridBagConstraints con = new GridBagConstraints();
        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridy = 0;
        con.gridx = 0;

        DefaultListModel<String> listModelOrder = new DefaultListModel<>();
        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        JList<String> allOrder = new JList<>(listModelOrder);
        JList<String> drinks = new JList<>(listModel2);

        allOrder.setFixedCellWidth(230);
        allOrder.setFixedCellHeight(20);
        drinks.setFixedCellHeight(20);
        drinks.setFixedCellWidth(230);

        String[] dr = Arrays.toString(DrinkTypeEnum.values()).split(", ");
        dr[0] = dr[0].substring(1);
        dr[dr.length-1] = dr[dr.length-1].substring(0,dr[dr.length-1].length()-1);
        listModel2.addAll(Arrays.asList(dr));


        addIt.addActionListener(actionEvent -> {
            if(!drinks.isSelectionEmpty()){
            listModelOrder.addElement(Objects.requireNonNull(drinks.getSelectedValue()));
            workArea.revalidate();
            }
        });

        removeIt.addActionListener(actionEvent -> {
            if(!listModelOrder.isEmpty() && !allOrder.isSelectionEmpty()){
            listModelOrder.removeElementAt(allOrder.getSelectedIndex());
            workArea.revalidate();
            }
        });

        tableOrder.addActionListener(actionEvent -> {
            if(listModelOrder.isEmpty())  JOptionPane.showMessageDialog(null, "Ваш заказ пуст!",
                    "Извините!", JOptionPane.INFORMATION_MESSAGE);
            else {
                int m = Integer.parseInt(JOptionPane.showInputDialog("Введите номер желаемого столика. На данный момент свободны: " +
                        Arrays.toString(tableManager.freeTableNumbers())));
                TableOrder ord = (TableOrder)getOrderFromList(listModelOrder,true);
                if(tableManager.add(ord, m)) JOptionPane.showMessageDialog(null, "Ваш заказ скоро принесут! Цена заказа: " +
                        ord.getCost(), "Ожидайте!", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        interOrder.addActionListener(actionEvent -> {
            if(listModelOrder.isEmpty())  JOptionPane.showMessageDialog(null, "Ваш заказ пуст!",
                    "Извините!", JOptionPane.INFORMATION_MESSAGE);
            else {
                JFrame j = new JFrame();
                j.setLayout(new FlowLayout());

                JTextField city = new JTextField(12);
                JTextField index = new JTextField(12);
                JTextField street = new JTextField(12);
                JTextField houseNum = new JTextField(12);
                JTextField buildingLetter = new JTextField(12);
                JTextField apartmentNum = new JTextField(12);
                JButton button = new JButton("ОК");

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        try{
                            Address ad = new Address(city.getText(), Integer.parseInt(index.getText()), street.getText(),
                                    Integer.parseInt(houseNum.getText()), buildingLetter.getText().charAt(0), Integer.parseInt(apartmentNum.getText()));
                            InternetOrder ord = (InternetOrder)getOrderFromList(listModelOrder,false);
                            if(internetManager.add(ord)) JOptionPane.showMessageDialog(null, "Ваш заказ скоро Привезут! Цена заказа: " +
                                    ord.getCost(), "Ожидайте!", JOptionPane.INFORMATION_MESSAGE);
                            j.dispose();
                        }
                        catch (Exception ex){
                            JOptionPane.showMessageDialog(null, "Ошибка при заполнении данных",
                                    "Ошибка!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
                j.setSize(190,380);
                j.setResizable(false);
                j.setTitle("Введите ваш адрес:");
                j.add(new JLabel("Город:"));
                j.add(city);
                j.add(new JLabel("Индекс:"));
                j.add(index);
                j.add(new JLabel("Улица:"));
                j.add(street);
                j.add(new JLabel("Номер дома:"));
                j.add(houseNum);
                j.add(new JLabel("Корпус:"));
                j.add(buildingLetter);
                j.add(new JLabel("Номер квартиры:"));
                j.add(apartmentNum);
                j.add(button);

                j.setLocation(800, 400);
                j.setVisible(true);
            }
        });

        interOrder.setMargin(new Insets(5, 70, 5, 70));
        tableOrder.setMargin(new Insets(5,70,5,70));

        workArea.add(choice, con);
        con.gridx = 2;
        con.ipady = 20;
        workArea.add(order, con);
        con.gridy = 1;
        con.gridx = 0;
        workArea.add(new JScrollPane(drinks, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED), con);
        con.gridx = 2;
        workArea.add(new JScrollPane(allOrder, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED), con);
        con.gridy = 2;
        con.gridx = 0;
        con.ipady = 5;
        workArea.add(addIt, con);
        con.gridx = 2;
        workArea.add(removeIt, con);
        buttonArea.add(interOrder);
        buttonArea.add(tableOrder);
        win.add(workArea);
        win.add(buttonArea);
        setContentPane(win);
        setLocation(700, 400);
        setResizable(false);
        setVisible(true);
    }

    public Order getOrderFromList(DefaultListModel list, boolean table){
        MenuItem el;
        TableOrder n1 = new TableOrder();
        InternetOrder n2 = new InternetOrder();
        for(int i = 0; i < list.size(); i++){
            el = new Drink(list.get(0).toString(), "");
            if(table)n1.add(el);
            else n2.add(el);
        }
        list.removeAllElements();
        if(table) return n1;
        else return n2;
    }

    public static void main(String[] args) {
        new UI();
    }
}
