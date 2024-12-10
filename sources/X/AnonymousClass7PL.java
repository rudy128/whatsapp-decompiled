package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7PL  reason: invalid class name */
public final class AnonymousClass7PL implements C1604188j {
    public C1605789a A00;
    public C136056tC A01;
    public boolean A02;
    public final C146367Ov A03 = new C146367Ov(this, 0);
    public final C129896iY A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public final void A00(C122646Re r6) {
        int A042 = C108955ca.A04(r6, 0);
        if (A042 == 0) {
            C136056tC r2 = this.A01;
            if (r2.A00 != C122726Rr.HIDE) {
                r2.A02 = true;
                r2.A04 = false;
                r2.A00 = C122726Rr.SHOW_APP_EXIST_XPOST_DISABLED;
            }
        } else if (A042 == 1) {
            C136056tC r22 = this.A01;
            if (r22.A01 != C122726Rr.HIDE) {
                r22.A02 = true;
                r22.A04 = false;
                r22.A01 = C122726Rr.SHOW_APP_EXIST_XPOST_DISABLED;
            }
        }
        C136056tC r23 = this.A01;
        C122726Rr r0 = r23.A00;
        C122726Rr r1 = C122726Rr.SHOW_APP_EXIST;
        if (!(r0 == r1 || r23.A01 == r1)) {
            r23.A02 = false;
        }
        C1605789a r02 = this.A00;
        if (r02 != null) {
            r02.C5S(r23);
        }
    }

    public void C6Y(List list) {
        AnonymousClass00H r4 = this.A05;
        Set keySet = ((AnonymousClass7FM) r4.get()).A01.keySet();
        C18070vi.A0X(keySet);
        if (!keySet.isEmpty() && this.A01.A01 == C122726Rr.HIDE) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (keySet.contains(Long.valueOf(C17890vO.A07(it)))) {
                        ((AnonymousClass7FM) r4.get()).A02();
                        return;
                    }
                }
            }
        }
    }

    public AnonymousClass7PL(C129896iY r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0k(r8, r9);
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        C122726Rr r1 = C122726Rr.HIDE;
        this.A01 = new C136056tC(r1, r1, false, false, false);
    }
}
