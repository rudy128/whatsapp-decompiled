package X;

import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/* renamed from: X.9k2  reason: invalid class name and case insensitive filesystem */
public final class C189899k2 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public final C167958i3 A00(C195679tj r6, UserJid userJid) {
        BigDecimal bigDecimal;
        A6S a6s;
        try {
            List list = (List) ((A8S) this.A00.get()).A08(userJid).get();
            AnonymousClass00H r0 = this.A01;
            r0.get();
            C18070vi.A0b(list);
            BigDecimal A02 = A6E.A02(list);
            r0.get();
            BigDecimal A012 = A6E.A01(new Date(), list);
            if (A012 == null) {
                A012 = BigDecimal.ZERO;
            }
            if (A02 != null) {
                bigDecimal = A02.subtract(A012);
            } else {
                bigDecimal = null;
            }
            C194209rM r02 = (C194209rM) C29431cG.A0c(list);
            if (!(r02 == null || (a6s = r02.A01.A07) == null)) {
                BigDecimal A002 = C197309wU.A00(a6s, r6.A01);
                if (bigDecimal == null || bigDecimal.compareTo(A002) < 0) {
                    return new C167958i3(a6s, A002);
                }
                return null;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public C189899k2(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
