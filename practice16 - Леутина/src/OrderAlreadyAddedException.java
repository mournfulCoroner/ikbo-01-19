public class OrderAlreadyAddedException extends Exception{
    public OrderAlreadyAddedException(){
        super("К столику или адресу уже привязан заказ");
    }
}
