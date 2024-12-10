package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6yr  reason: invalid class name and case insensitive filesystem */
public final class C139446yr {
    public static final C137306vF A01 = new Object();
    public final List A00 = AnonymousClass000.A13();

    public final C1409773u A00(List list) {
        C18070vi.A0d(list, 0);
        List list2 = this.A00;
        if (!list2.isEmpty()) {
            C123436Ul r2 = (C123436Ul) C50582Uz.A00(list2);
            r2.A01(list);
            if ((r2 instanceof AnonymousClass69j) && AnonymousClass000.A1a(list2)) {
                C123436Ul r1 = (C123436Ul) C29431cG.A0d(list2);
                if ((r1 instanceof C1196769k) && r1.A00 == r2.A00) {
                    A00(list);
                }
            } else if (r2 instanceof C1196469g) {
                return r2.A00;
            }
        }
        return null;
    }

    public final String A01(List list) {
        C18070vi.A0d(list, 0);
        JSONArray jSONArray = new JSONArray();
        for (C123436Ul r3 : this.A00) {
            JSONObject A15 = C17880vN.A15();
            A15.put("shape_index", list.indexOf(r3.A00));
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A00());
            r3.A02(list, A15);
            jSONArray.put(A15);
        }
        JSONObject A0h = C108995ce.A0h();
        A0h.put("actions", jSONArray);
        return C18070vi.A0H(A0h);
    }
}
