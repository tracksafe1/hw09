/*2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
type double.
The class needsto have one constructor with parameter cost of type double and it needsto initialize
the field.
In case the cost parameter islessthan 0 it needsto set the cost field value to 0.
Write the following methods(instance methods):
● Method named getCost without any parameters, it needsto return the value of cost field

 */
package midweekhomework.Q17;

public class Carpet {
    double cost;
    public Carpet(double cost){
        this.cost=(cost<0)?0:cost;
    }
    public double getCost(){
        return cost;
    }
}
