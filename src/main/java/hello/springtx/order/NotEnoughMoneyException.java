package hello.springtx.order;

// 체크 예외, 롤백 안하고 싶음
public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
