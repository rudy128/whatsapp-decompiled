package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.71C  reason: invalid class name */
public final class AnonymousClass71C {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final UserJid A00(AnonymousClass71C r2, JSONObject jSONObject) {
        C22941Dw r1;
        String str;
        if (((C131916ls) r2.A01.get()).A00()) {
            if (jSONObject != null) {
                r1 = UserJid.Companion;
                str = "lid";
            }
            return null;
        }
        if (jSONObject != null) {
            r1 = UserJid.Companion;
            str = "jid";
        }
        return null;
        return r1.A04(C20064A5n.A01(str, (String) null, jSONObject));
    }

    public static final void A01(AnonymousClass71C r2, String str, boolean z) {
        AnonymousClass62J r1 = new AnonymousClass62J();
        r1.A00 = Integer.valueOf(AnonymousClass000.A1O(z ? 1 : 0) ? 1 : 0);
        if (!((C131916ls) r2.A01.get()).A00()) {
            r1.A01 = str;
        }
        C108965cb.A1F(r1, r2.A03);
    }

    public AnonymousClass71C(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }
}
