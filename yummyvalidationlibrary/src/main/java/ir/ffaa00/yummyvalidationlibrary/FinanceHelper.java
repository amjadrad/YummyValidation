package ir.ffaa00.yummyvalidationlibrary;

public class FinanceHelper {

    public static String convertMoneyToWithComma(String prc) {

        StringBuilder stringBuilder = new StringBuilder();

        int counter = 0;
        for (int i = prc.length() - 1; i > -1; i--) {
            if (counter == 3) {
                stringBuilder.append(",");
                stringBuilder.append(prc.charAt(i));
                counter = 1;
                continue;
            }
            counter++;
            stringBuilder.append(prc.charAt(i));
        }


        return stringBuilder.reverse().toString();
    }


    public static String convertWithCommaToWithout(String price) {
        return price.replace(",", "");
    }

}
