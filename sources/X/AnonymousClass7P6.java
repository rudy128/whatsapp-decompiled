package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.7P6  reason: invalid class name */
public final class AnonymousClass7P6 implements C22486B9s {
    public AnonymousClass1CJ A00;

    public AnonymousClass7P6(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean BCL(C186309dz r7, C22484B9q b9q, AnonymousClass5YR r9) {
        C136546tz r0;
        ArrayList A16 = C108955ca.A16(r9, 0);
        AnonymousClass9ZF r02 = ((C21319Ai4) r9).A06;
        if (r02 != null) {
            Map map = r02.A00;
            if (map.get("wa_push_psa_recently_joined_contacts_wids") != null) {
                JSONArray jSONArray = new JSONArray(C17880vN.A0s("wa_push_psa_recently_joined_contacts_wids", map));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
                    UserJid A02 = C22941Dw.A02((String) obj);
                    if (A02 != null && !this.A00.A0P(A02)) {
                        A16.add(A02);
                    }
                }
                if ((b9q instanceof AnonymousClass7P5) && (r0 = ((AnonymousClass7P5) b9q).A00) != null) {
                    r0.A04 = A16;
                }
                return C17880vN.A1X(A16);
            }
        }
        return false;
    }
}
