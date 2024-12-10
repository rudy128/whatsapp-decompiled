package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9si  reason: invalid class name and case insensitive filesystem */
public final class C195049si {
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01 = C201811d.A00(49505);
    public final AnonymousClass00H A02;
    public final Map A03 = AnonymousClass8BR.A17();

    public final void A00(String str) {
        C18070vi.A0d(str, 0);
        this.A00.CGF(new C21454AkL(this, str, 1, 9));
    }

    public final void A01(String str) {
        C18070vi.A0d(str, 0);
        this.A00.CGF(new C21454AkL(this, str, 0, 9));
    }

    public final void A02(String str, UserJid userJid, int i) {
        this.A01.get();
        Integer A002 = A3X.A00(i);
        if (A002 != null) {
            this.A03.put(str, new C186219dq(userJid, ((C63252sl) this.A02.get()).A02(A002.intValue()), i));
        }
    }

    public C195049si(AnonymousClass10I r2, AnonymousClass00H r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A00 = r2;
    }
}
