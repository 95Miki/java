package nestedClasses.localInnerClass;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();

    }
}
class Math{                                     // Division => Деление
    public void getResult(){                    // Dividend => Делимое
        class Division{                         // Divider  => Делитель
            private int Dividend;               // Quotient => Частное (result)
            private  int Divider;               // Remainder => Остаток

            public int getDividend() {
                return Dividend;
            }

            public void setDividend(int dividend) {
                this.Dividend = dividend;
            }

            public int getDivider() {
                return Divider;
            }

            public void setDivider(int divider) {
                Divider = divider;
            }
            public int getQuotient(){
                return Dividend/Divider;
            }
            public int getRemainder(){
                return Dividend%Divider;
            }
        }
        Division division = new Division();
        division.setDividend(21);
        division.setDivider(4);
        System.out.println("Делимое = "+division.getDividend());
        System.out.println("Делитель = "+division.getDivider());
        System.out.println("Частное = "+division.getQuotient());
        System.out.println("Остаток = "+division.getRemainder());
    }
}
