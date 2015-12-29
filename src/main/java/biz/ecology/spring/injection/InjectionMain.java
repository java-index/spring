package biz.ecology.spring.injection;

public abstract class InjectionMain implements DemoBean {

    public abstract MyHelper getMyHelper();

    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
