package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9l3  reason: invalid class name and case insensitive filesystem */
public class C190499l3 {
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public C190499l3(Integer num, List list, boolean z) {
        this.A01 = list;
        this.A00 = num;
        this.A02 = z;
    }

    public JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        if (this.A02) {
            A15.put("has_catalog", 1);
        }
        Integer num = this.A00;
        if (num != null) {
            A15.put("opening_hours", num);
        }
        List list = this.A01;
        if (list != null) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (int i = 0; i < list.size(); i++) {
                A1A.put(list.get(i));
            }
            A15.put("subcategories", A1A);
        }
        if (A15.length() == 0) {
            return null;
        }
        return A15;
    }
}
