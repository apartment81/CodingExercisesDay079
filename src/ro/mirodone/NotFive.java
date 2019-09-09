package ro.mirodone;

 class NotFive {

         int dontGiveMeFive ( int start, int end){

            int five = 5;
            int count = 0;

            // Check all numbers one by one
            for (int i = start; i <= end; i++) {

                count++;
                // checking for digit
                if (i == five || i == -five || isDigitPresent(i, five))
                    count--;
              //  System.out.println(i);
            }


            return count;
        }

        private boolean isDigitPresent(int x, int d){
            //  loop if d is present as digit
            while (x > 0) {
                if (x % 10 == d)
                    break;

                x = x / 10;
            }

            return (x > 0);
        }
    }
