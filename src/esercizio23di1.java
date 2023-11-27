public class esercizio23di1 {
        public static void main(String[] args) {
            System.out.println(checkRange(1,10, 9));

        }

        static boolean checkRange(int primero, int ultimo, int control){
            if ((control >= primero) && (control <= ultimo)){
                return true;
            } else {
                throw new ArithmeticException("el numero no esta en el rango");
            }
        }
    }

