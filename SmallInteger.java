/**
 * A class for working with integers that do not exceed 10^4 in absolute value
 *@author Mokhova Yuliya
 * */
public class SmallInteger {

    private int value;
    //private String Name;

    public SmallInteger () {
        value = 0;
    }
    public SmallInteger (int x)  throws MyException {
        int val = x;
        if (val > 10000 || val < -10000){
            throw new MyException ("Значение вышло за диапазон представления");
        } else {
            value = val;
        }
    }

    public SmallInteger ( byte[] x)  throws MyException {
        int val = 0;
        for (int i = 0; i < x.length; i++){
            val = val + x[i] * (int)Math.pow(10,x.length - i - 1);
        }
        if (val > 10000 || val < -10000){
            throw new MyException ("Значение вышло за диапазон представления");
        } else {
            value = val;
        }
    }

    /**
     * Add two numbers not exceeding 10^4
     * @author Mokhova Yuliya
     * @param val the object whose value is being added
     * @throws MyException  The number is greater than 10^4
     * @return addition the sum of the value of the object calling the method and the value of val
     * */
    public SmallInteger add (SmallInteger val) throws MyException {
        int new_value = this.value + val.value;
        if (new_value > 10000 || new_value < - 10000) {
            throw new MyException ("Значение вышло за диапазон представления");
        } else { this.value = new_value;
            return this; }
    }

    /**
     * Subtract two numbers not exceeding 10^4
     * @author Mokhova Yuliya
     * @param val the object whose value is being deducted
     * @throws MyException  The number is greater than 10^4
     * @return the difference between the value of the object calling the method and the value of val
     * */
    public SmallInteger sub (SmallInteger val) throws MyException {
        int new_value = this.value - val.value;
        if (new_value > 10000 || new_value < - 10000){
            throw new MyException ("Значение вышло за диапазон представления");
        } else { this.value = new_value;
            return this; }
    }

    /**
     * Multiplication two numbers not exceeding 10^4
     * @author Mokhova Yuliya
     * @param val the object whose value is being multiplied
     * @throws MyException  The number is greater than 10^4
     * @return multiplication the sum of the value of the object calling the method and the value of val
     * */
    public SmallInteger mul (SmallInteger val) throws MyException {
        int new_value = this.value * val.value;
        if (new_value > 10000 || new_value < - 10000){
            throw new MyException ("Значение вышло за диапазон представления");
        } else { this.value = new_value;
            return this; }
    }

    /**
     * Multiplication two numbers not exceeding 10^4
     * @author Mokhova Yuliya
     * @param val the object whose value is being multiplied
     * @throws MyException  The number is greater than 10^4
     * @return multiplication the sum of the value of the object calling the method and the value of val
     * */
    public SmallInteger div (SmallInteger val) throws MyException {
        int new_value = this.value / val.value;
        if (new_value > 10000 || new_value < - 10000){
            throw new MyException ("Значение вышло за диапазон представления");
        } else { this.value = new_value;
            return this; }
    }

    /**
     * Multiplication two numbers not exceeding 10^4
     * @author Mokhova Yuliya
     * @param val the object whose value is being multiplied
     * @throws MyException  The number is greater than 10^4
     * @return multiplication the sum of the value of the object calling the method and the value of val
     * */
    public SmallInteger mod (SmallInteger val) throws MyException {
        int new_value = (this.value % val.value);
        if (new_value > 10000 || new_value < - 10000){
            throw new MyException ("Значение вышло за диапазон представления");
        } else { this.value = new_value;
            return this; }
    }

    /**
     * Getter value
     * @author Mokhova Yuliya
     * @return returns the value of the object's value
     * */
    public int GetValue (){
        return this.value;
    }


}
