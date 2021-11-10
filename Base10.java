//方法覆盖与异常
public class Base10 {
    public static void main(String[] args) {

    }
}
interface UserManger{
    public void login()throws UserNotFoundException1;


}
class UserNotFoundException1 extends Exception {
}
class UserMangerImpl1 implements UserManger{

    @Override
    public void login() throws UserNotFoundException1 {

    }
}
class UserMangerImpl2 implements UserManger{
    @Override
    public void login() throws UserNotFoundException1 {

    }

//    @Override
//    public void login() throws UserNotFoundException,PasswordFailureException {


//    }
 class UserMangerImpl3 implements UserManger {
//正确，因为MyException 是UserNotFoundException的子类
//    MyException没有超出接口的要求
    @Override
    public void login() throws UserNotFoundException1,MyException1 {


    }
}

}
class PasswordFailureException extends Exception {
}
class MyException1 extends UserNotFoundException1{

}