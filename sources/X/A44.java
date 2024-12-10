package X;

import java.util.regex.Pattern;
import org.json.JSONObject;

public class A44 {
    public final Pattern A00;
    public final boolean A01;

    public static A44 A00(Object obj) {
        Pattern compile = Pattern.compile("");
        boolean z = false;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("pattern")) {
                compile = Pattern.compile(jSONObject.getString("pattern"), 32);
                if (jSONObject.has("negation") && jSONObject.getString("negation").equalsIgnoreCase("true")) {
                    z = true;
                }
            }
        } else if (obj instanceof String) {
            compile = Pattern.compile((String) obj, 32);
        }
        return new A44(compile, z);
    }

    public A44(Pattern pattern, boolean z) {
        this.A00 = pattern;
        this.A01 = z;
    }

    public A44() {
        this(Pattern.compile(""), false);
    }
}
