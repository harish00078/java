public class Main{
    public static void main(String[] args) 
    {
        //write code here
        System.out.println("hello world"); // println = ln represent here to jump on next line 
        System.out.println("my name is harish");
        /*
         * variables
         * just like:
         * for water - webucket
         * for store masala - we use boxes
         * for storing lunch - we use lunchbox
         * In java:
         * variables are contains which store data values:
         * string ex("string"),int ex(1,2,3),float ex(0.1,0.2),char ex('harish'),boolean ex(true,false)
         * 
         * # how to declare variables:
         * syntax - <datatype> <variableName> = value;
         */
        String name = "Harry";
        System.out.println(name);
        
        int a = 45, x=56, y=67;
        char grade = 'a';
        float b = 45.22f; // In java we have define the float value by writing a (f) with the value.
        
        boolean isadult = false;
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);

        System.out.println(grade);

        System.out.println(b);
        
        System.out.println(isadult);

        /*
         * rules for constructing name of variables in java
         * 1. can contain digits, underscore, dollar signs, letters
         * 2. we hould begin with a letter, and then we can use $ or _
         * 3. java is case sensitive language which means that harry and Harry are two different variables altogether        
         * 4. should not contain whitespaces -> already know about \n ,\t ,\r and space.
         * 5. you cannot use reserved keywords from java. example of the reserved keyword in java is 
         *  function java() {
            alert("This function can not be called");
            }
         * */


         /*
          * in java we have a two types of data types:
          1. primitive data types  --> (define = primitive data typese are those data types who are already define) In primivite data types we have a limitation.( because we can only stores data in primitive data types acc to there types and there range(range means how much we can go -ve to how much positive we can go + ve))
            => the primitive data types are:
            a. byte = only have one byte(1byte) => range of byte(-128 to +127 this means we can only stores negative 128 to positive 128 numbers in bytes)
            b. short = only have two bytes(2bytes)
            c. int = only have four bytes(4bytes)
            d. long = only have eight bytes(8bytes)
            e. float = only have four bytes(4bytes)
            f. double = only have eight bytes(8bytes)
            g. boolean = only have on bit(1bit)
            h. char = only have two bytes(2bytes)

          2. non - primitive or reference data types  --> (define = non primitive data types those who are not already define.we have d to define them with our self)
            -> defination =  Non-primitive data types or reference data types refer to instances or objects. They cannot store the value of a variable directly in memory. They store a memory address of the variable. Unlike primitive data types, which are defined by Java, non-primitive data types are user-defined. They are created by programmers and can be assigned with null. All non-primitive data types are of equal size.
            -> example of non primitive data type are or we can use these types as non primitive data types:
            a. string
            b. array
            c. interfaces
            d. enum
            e. class


          */


          //examples of primitive data types:
        // 1. byte
        //byte u = 156; (we did not store the 150 in byte because byte have limitation of range -128 to +127)
        double d = 45.64545456d;
        System.out.println(d);
        char character = 'h';
        System.out.println(character);
        //System.out.println(u);
        // soon other types of primitive data types  are also working like byte.


        /*
         *  Operators in java:
         * 
         * operand + operators + operand = result.
         *  ||          ||          ||
         *  4           +            7     = 11
         * 
         * Types of operators in java:
         * 1.> arithmetic operators
         * 2.> unary operators 
         * 3.> assignment operators
         * 4.> logical operators
         * 5.> comparison operators
         */
        
        //arithmetic operators:
        int num1 = 45, num2 = 78;
        // float num1 = 45, num2 = 78; we can use float if we want the result of decimal numbers.
        num1 += 3;
        num2 -= 8;
        System.out.print("the value of the num1 + num2 is ");
        System.out.println(num1 + num2);

        System.out.print("the value of the num1 - num2 is ");
        System.out.println(num1 - num2);

        System.out.print("the value of the num1 * num2 is ");
        System.out.println(num1 * num2);

        System.out.print("the value of the num1 / num2 is ");
        System.out.println(num1 / num2);

        System.out.print("the value of the num1 % num2 is ");
        System.out.println(num1 % num2);   // % this sign is known as  module .it is used for finding a remainder of values or operands

        //unary operators:. Unary Operators: Unary operators need only one operand. They are used to increment, decrement or negate a value. 
        
        // increment or decrement operators.
        // increment operators: used for incrementing the value by 1.
        System.out.println(num1++);
        System.out.println(++num1);
        // decrement operators: used for decrementing the value by 1. 
        System.out.println(num1--);
        System.out.println(--num1);

      // assignment operators: Assignment operator is used to assigning a value to any variable.if we want to add a more value in the particular variable value. there we use the assignment operaotors.
      
      // example of the assignment operators:
      // int num1 = 45; if we want to add more value in this variable then we use the assignment operators.
      // we can add more value in this way:
      /*
       * int num1 = 45,
       * num1 += 3;
       * this will gave me the value of the num1 is 48.
       * In this we can also use other assignment operators.
       */
      /*
       * types of the assignment operators:
        1.> +=, for adding left operand with right operand and then assigning it to the variable on the left.
        2.> -=, for subtracting right operand from left operand and then assigning it to the variable on the left.
        3.> *=, for multiplying left operand with right operand and then assigning it to the variable on the left.
        4.> /=, for dividing left operand by right operand and then assigning it to the variable on the left.
        5.> %=, for assigning modulo of left operand by right operand and then assigning it to the variable on the left.
       */


    }
}