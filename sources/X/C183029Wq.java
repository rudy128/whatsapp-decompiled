package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Wq  reason: invalid class name and case insensitive filesystem */
public final class C183029Wq {
    public List A00;

    public C183029Wq(String str) {
        JSONObject A15;
        if (str == null || str.length() == 0) {
            A15 = C17880vN.A15();
        } else {
            A15 = C17880vN.A16(str);
        }
        ArrayList A13 = AnonymousClass000.A13();
        JSONArray optJSONArray = A15.optJSONArray("actions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C189059iR r0 = A2Y.A02;
                C18070vi.A0b(optJSONObject);
                A2Y A002 = r0.A00(optJSONObject);
                if (A002 != null) {
                    A13.add(A002);
                }
            }
        }
        this.A00 = A13;
    }
}
