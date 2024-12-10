package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9nk  reason: invalid class name and case insensitive filesystem */
public final class C192069nk {
    public final List A00 = AnonymousClass8BR.A14();

    public final void A01() {
        this.A00.add("profile_pic");
    }

    public final JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("requested_fields", new JSONArray(this.A00));
        return A15;
    }
}
