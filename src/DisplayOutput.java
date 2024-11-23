public class DisplayOutput {

    public void display(int inputNumber ,boolean isPrimary){


        if (isPrimary){
            System.out.println("The Number:" + " " + inputNumber + " is Primary Number ✔️ " );
        }else {
            System.out.println("The Number:" +" " + inputNumber + "is not Primary Number ❌ " );
        }

    }
}
