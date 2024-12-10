package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9kh  reason: invalid class name and case insensitive filesystem */
public final class C190299kh {
    public final AnonymousClass00H A00;
    public final ConcurrentHashMap A01 = AnonymousClass8BR.A17();

    public C190299kh(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(UserJid userJid, int i) {
        Number number = (Number) AnonymousClass8BT.A0r(this.A01, i);
        if (number != null) {
            ((C63252sl) this.A00.get()).A03(new C55062f9(userJid, (String) null, false, false), number.intValue(), i);
        }
    }
}
