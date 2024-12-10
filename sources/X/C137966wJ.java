package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6wJ  reason: invalid class name and case insensitive filesystem */
public final class C137966wJ {
    public final AnonymousClass18K A00;
    public final C189399jB A01;

    public static final void A00(C137966wJ r2, UserJid userJid, int i) {
        AnonymousClass62F r1 = new AnonymousClass62F();
        r1.A00 = Integer.valueOf(i);
        if (userJid != null) {
            try {
                r1.A01 = C108965cb.A0m(r2.A01.A00(userJid));
            } catch (NumberFormatException e) {
                Log.e((Throwable) e);
            }
        }
        r2.A00.CC7(r1);
    }

    public C137966wJ(AnonymousClass18K r1, C189399jB r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
