import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chair {
    int idChair;
    String typeChair;
    String colorChair;
    String materialChair;
    boolean softChair;

    public Chair(int idChair, String typeChair, String colorChair, String materialChair, boolean softChair) {
        this.idChair = idChair;
        this.typeChair = typeChair;
        this.colorChair = colorChair;
        this.materialChair = materialChair;
        this.softChair = softChair;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "idChair=" + idChair +
                ", typeChair='" + typeChair + '\'' +
                ", colorChair='" + colorChair + '\'' +
                ", materialChair='" + materialChair + '\'' +
                ", softChair=" + softChair +
                '}';
    }


    public static void chairsColl (String[] args) {

        Map hmChairs = new HashMap();

        List chairs = new ArrayList<String>();
        chairs.add("sdr");
        chairs.add("fgf");
        chairs.add(8);
        chairs.add(5.122);
        chairs.add(false);
        hmChairs.put(new String("fgfgfg"), chairs);

        //hmChairs.get("fgfgfg");
        System.out.println(hmChairs.get("fgfgfg"));


    }
}
