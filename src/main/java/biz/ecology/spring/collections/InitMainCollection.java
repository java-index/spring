package biz.ecology.spring.collections;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

@Component("initmaincollection")
public class InitMainCollection {

    @Resource(name="map")
    private Map<String, String> map;

    @Resource(name="list")
    private List<String> list;

    @Resource(name="set")
    private Set<String> set;

    @Resource(name="props")
    private Properties properties;

    public InitMainCollection(){
        System.out.println("it works");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-collection-annotation-config.xml");
        ctx.refresh();
        InitMainCollection mainCollection = ctx.getBean("initmaincollection", InitMainCollection.class);
        mainCollection.displayInfo();
    }

    public void displayInfo(){
        System.out.println("List:");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("\nSet:");
        for(String s : set){
            System.out.println(s);
        }

        System.out.println("\nMap:");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        System.out.println("\nProperties");
        for(Map.Entry<Object, Object> props : properties.entrySet()){
            System.out.println("Key: " + props.getKey() + "; Value: " + props.getValue());
        }
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
