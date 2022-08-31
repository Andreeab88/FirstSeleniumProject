public class Main {
    public static void main(String[] args) {



        LoginTest loginTest = new LoginTest();
        loginTest.validLoginTest();
        loginTest.changeLanguage();

        RegisterTest registerTest = new RegisterTest();
        registerTest.validRegisterTest();


      WhishListTest whishList = new WhishListTest();
      whishList.validWhishList();


        AddProductInWishListTest hoverOverCategory = new AddProductInWishListTest();
        hoverOverCategory.hoverOverCategoryTest();





    }



    public static void wait(int seconds){
        try{
            Thread.sleep(seconds*1000L);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
