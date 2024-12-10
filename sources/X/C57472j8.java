package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2j8  reason: invalid class name and case insensitive filesystem */
public final class C57472j8 {
    public final C18030ve A00;
    public final C18100vl A01 = new C18110vm(new AnonymousClass3HG(this));
    public final AnonymousClass1PM A02;

    public final boolean A00(AnonymousClass1E7 r9) {
        UserJid userJid;
        C42731ye A002;
        C18070vi.A0d(r9, 0);
        AnonymousClass1BI r1 = r9.A0J;
        if (r1 instanceof UserJid) {
            userJid = (UserJid) r1;
        } else {
            userJid = null;
        }
        if (r9.A0C() && userJid != null && this.A02.A04(userJid) && (A002 = C42721yd.A00(userJid.user)) != null) {
            List<C70543Bm> list = (List) this.A01.getValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C70543Bm r4 : list) {
                    long j = A002.A00;
                    if (AnonymousClass04C.A00(65536, j) <= 0 && AnonymousClass04C.A00(j, r4.A01) <= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C57472j8(AnonymousClass1PM r3, C18030ve r4) {
        C18070vi.A0j(r4, r3);
        this.A00 = r4;
        this.A02 = r3;
    }
}
