import java.math.BigDecimal;

import feedback.descriptors.ClassDescriptor;
import feedback.descriptors.ConstructorDescriptor;
import feedback.descriptors.FieldDescriptor;
import feedback.descriptors.MethodDescriptor;
import feedback.descriptors.ParameterDescriptor;
import feedback.descriptors.Test;
import feedback.descriptors.Types;

public class PartyItemDescriptor extends ClassDescriptor {

    public PartyItemDescriptor() {
        super("PartyItem");
        //add some fields to the description
        FieldDescriptor name = new FieldDescriptor("a name for the party item", "name", String.class);
        this.addField(name);
        FieldDescriptor price = new FieldDescriptor("the price per unit of the party item", "price", double.class);
        this.addField(price);
        FieldDescriptor perGuest = new FieldDescriptor("the number needed per guest", "numberPerGuest", double.class);
        this.addField(perGuest);

        //constructor descriptor & tests
        ConstructorDescriptor constructor = new ConstructorDescriptor("create party item with specified name, price and number needed per guest", 
        "public", new ParameterDescriptor("name", String.class), new ParameterDescriptor("price", double.class), new ParameterDescriptor("numberPerGuest", double.class));
        this.addConstructor(constructor);
        constructor.addTest("Create balloons, with a price of £0.10p each, and with 1 needed per guest at the party", (feedback) -> {
            Object obj = constructor.invoke("balloons",0.1,1.0).value;
            return Test.assertFieldEquals(name, obj, "balloons", feedback) &&
                Test.assertFieldNumericEquals(price, obj, 0.1, 2, feedback) &&
                Test.assertFieldNumericEquals(perGuest, obj, 1, 2, feedback);
        });
        constructor.addTest("Create plates of sandwiches, with a price of £1.25, and with 1 plate needed for every 4 guests at the party", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertFieldEquals(name, obj, "plates of sandwiches", feedback) &&
                Test.assertFieldNumericEquals(price, obj, 1.25, 2, feedback) &&
                Test.assertFieldNumericEquals(perGuest, obj, 0.25, 2, feedback);
        });

        //print descriptor & tests
        MethodDescriptor print = new MethodDescriptor(
            "print the details of a party item",
            "print",
            void.class,
            new ParameterDescriptor("guests", int.class)
        );
        this.addMethod(print); 
        print.addTest("Print balloons, with a price of £0.10p each, and with 1 needed per guest at the party for 1 guest", (feedback) -> {
            Object obj = constructor.invoke("balloons",0.1,1.0).value;
            String output = print.invoke(obj,1).output.trim();
            return Test.assertEquals(print.toString(), output, "For 1 guests, you need 1 balloons at a total cost of \u00a30.10", feedback);
        });
        print.addTest("Print plates of sandwiches, with a price of £1.25, and with 1 plate needed for every 4 guests at the party for 1 guest", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            String output = print.invoke(obj,1).output.trim();
            return Test.assertEquals(print.toString(), output, "For 1 guests, you need 1 plates of sandwiches at a total cost of \u00a31.25", feedback);
        });

        //number needed descriptor & tests
        MethodDescriptor needed = new MethodDescriptor(
            "calculate the number of this item you need for a particular number of guests",
            "calculateNumberNeeded",
            int.class,
            new ParameterDescriptor("guests", int.class)
        );
        this.addMethod(needed); 
        needed.addTest("Calculate number needed of item with 1 unit per guest, for 1 guest", (feedback) -> {
            Object obj = constructor.invoke("balloons",0.1,1.0).value;
            return Test.assertMethodNumericEquals(feedback, needed, 1, 0, obj, 1);
        });
        needed.addTest("Calculate number needed of item with 1 unit for every 4 guests, for 1 guest", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertMethodNumericEquals(feedback, needed, 1, 0, obj, 1);
        });
        needed.addTest("Calculate number needed of item with 1 unit for every 4 guests, for 4 guests", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertMethodNumericEquals(feedback, needed, 1, 0, obj, 4);
        });
        needed.addTest("Calculate number needed of item with 1 unit for every 4 guests, for 5 guests", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertMethodNumericEquals(feedback, needed, 2, 0, obj, 5);
        });

        //cost descriptor & tests
        MethodDescriptor cost = new MethodDescriptor(
            "calculate the cost of this item for a particular number of guests",
            "calculateCost",
            double.class,
            new ParameterDescriptor("guests", int.class)
        );
        this.addMethod(cost); 
        cost.addTest("Calculate cost of item with 1 unit per guest, for 1 guest", (feedback) -> {
            Object obj = constructor.invoke("balloons",0.1,1.0).value;
            return Test.assertMethodNumericEquals(feedback, cost, 0.1, 2, obj, 1);
        });
        cost.addTest("Calculate cost of item with 1 unit for every 4 guests, for 1 guest", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertMethodNumericEquals(feedback, cost, 1.25, 2, obj, 1);
        });
        cost.addTest("Calculate cost of item with 1 unit for every 4 guests, for 4 guests", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertMethodNumericEquals(feedback, cost, 1.25, 2, obj, 4);
        });
        cost.addTest("Calculate cost of item with 1 unit for every 4 guests, for 5 guests", (feedback) -> {
            Object obj = constructor.invoke("plates of sandwiches", 1.25, 0.25).value;
            return Test.assertMethodNumericEquals(feedback, cost, 2.50, 2, obj, 5);
        });
    }
}
