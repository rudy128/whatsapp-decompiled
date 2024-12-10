package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Jc  reason: invalid class name and case insensitive filesystem */
public class C47622Jc extends C37061ou {
    public final C192259o4 A00;

    public C127316e9 A00(AnonymousClass206 r6, C60012nF r7) {
        if (!(r6 instanceof AnonymousClass23N)) {
            return null;
        }
        JSONObject A15 = C17880vN.A15();
        String str = ((AnonymousClass23N) r6).A01;
        C17960vV.A07(str);
        AnonymousClass205 r0 = r6.A0v;
        try {
            A15.put("message_id", this.A00.A01(AnonymousClass205.A01(r0.A00, str, r0.A02), r7));
            return new C127316e9("message_revoked", A15);
        } catch (JSONException unused) {
            return null;
        }
    }

    public C47622Jc(C192259o4 r1) {
        this.A00 = r1;
    }
}
