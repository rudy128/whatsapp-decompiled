package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9ra  reason: invalid class name and case insensitive filesystem */
public final class C194349ra {
    public final AnonymousClass1E2 A00;
    public final UserJid A01;
    public final JSONObject A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194349ra) {
                C194349ra r5 = (C194349ra) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31);
    }

    public C194349ra(AnonymousClass1E2 r1, UserJid userJid, JSONObject jSONObject) {
        C72473Md.A1I(userJid, jSONObject);
        this.A01 = userJid;
        this.A00 = r1;
        this.A02 = jSONObject;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaTrustSignalInfo(jid=");
        A10.append(this.A01);
        A10.append(", lid=");
        A10.append(this.A00);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
