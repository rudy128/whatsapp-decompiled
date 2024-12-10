package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9zh  reason: invalid class name and case insensitive filesystem */
public final class C199259zh {
    public final AnonymousClass00H A00 = C201811d.A00(49158);
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;

    public final AnonymousClass9MJ A01(BCT bct, UserJid userJid) {
        C18070vi.A0d(bct, 1);
        AnonymousClass9MI A002 = A00((AnonymousClass8oP) null, bct, userJid);
        if (!(A002 instanceof C170078oh)) {
            if (A002 instanceof C170068og) {
                C170068og r1 = (C170068og) A002;
                C46132Da r2 = new C46132Da(r1.A00, r1.A01, System.currentTimeMillis());
                C194339rZ r12 = (C194339rZ) this.A01.get();
                if (C198929z9.A00(r12.A00) && r12.A01(r2)) {
                    bct.CGg(r2);
                    return new C170088oi(r2);
                }
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        return C170098oj.A00;
    }

    public C199259zh(AnonymousClass11P r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A02 = r2;
        this.A01 = r3;
    }

    public static final AnonymousClass9MI A00(AnonymousClass8oP r12, BCT bct, UserJid userJid) {
        String str;
        C46132Da r4 = (C46132Da) bct.BPQ(userJid);
        if (r12 != null && ((str = r12.A01) != null || r12.A02 != null)) {
            if (r4 != null) {
                AnonymousClass8oP r3 = r4.A02;
                String str2 = r3.A01;
                if (C18070vi.A18(str, str2)) {
                    String str3 = r12.A02;
                    String str4 = r3.A02;
                    if (C18070vi.A18(str3, str4)) {
                        UserJid userJid2 = r12.A00;
                        if (str == null) {
                            str = str2;
                        }
                        if (str3 == null) {
                            str3 = str4;
                        }
                        return new C170068og(r4.A01, new AnonymousClass8oP(userJid2, str, str3, r3.A00));
                    }
                }
            }
            return new C170068og(new C196189ub(0, false, false, false, false, false, false, false, false, false, false), r12);
        } else if (r4 == null) {
            return C170078oh.A00;
        } else {
            return new C170068og(r4.A01, r4.A02);
        }
    }
}
