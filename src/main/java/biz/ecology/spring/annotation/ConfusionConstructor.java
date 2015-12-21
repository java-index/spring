package biz.ecology.spring.annotation;

public class ConfusionConstructor {
    String strValue;
    int intValue = 0;

    ConfusionConstructor(){}

    ConfusionConstructor(String value){
        this.strValue = value;
        System.out.println("Called string");
    }

    ConfusionConstructor(int value){
        this.intValue = value;
        System.out.println("Called int");
    }
}
