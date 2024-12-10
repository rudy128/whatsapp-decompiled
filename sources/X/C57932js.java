package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2js  reason: invalid class name and case insensitive filesystem */
public final class C57932js {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1MZ A02;
    public final AnonymousClass12L A03;
    public final C24901Mc A04;
    public final C25181Nf A05;

    public final boolean A00(AnonymousClass21V r8) {
        AnonymousClass1E7 r4;
        AnonymousClass1BI A002;
        AnonymousClass1BI r1 = r8.A0v.A00;
        if (r1 == null) {
            return false;
        }
        AnonymousClass1E7 A012 = this.A05.A01(r1);
        if (A012.A0F()) {
            AnonymousClass1BI A0H = r8.A0H();
            AnonymousClass1M9 r12 = this.A01;
            UserJid A0K = r12.A0K((GroupJid) A012.A06(GroupJid.class));
            AnonymousClass1E7 r5 = null;
            if (A0K != null) {
                r4 = r12.A0H(A0K);
            } else {
                r4 = null;
            }
            PhoneUserJid A003 = AnonymousClass11S.A00(this.A00);
            if (A0H != null) {
                r5 = r12.A0H(A0H);
            }
            AnonymousClass1EC r13 = (AnonymousClass1EC) A012.A06(AnonymousClass1EC.class);
            if ((r13 == null || !this.A02.A0O(r13)) && ((r4 == null || (r4.A0H == null && !C42171xk.A00(A003, r4.A0J))) && ((r5 == null || r5.A0H == null) && ((A002 = AnonymousClass1E7.A00(A012)) == null || C24901Mc.A00(A002, this.A04) != 1)))) {
                return false;
            }
            return true;
        } else if (A012.A0H != null || C42761yh.A00(A012, this.A03)) {
            return true;
        } else {
            AnonymousClass1BI A004 = AnonymousClass1E7.A00(A012);
            if (A004 == null || C24901Mc.A00(A004, this.A04) != 1) {
                return false;
            }
            return true;
        }
    }

    public C57932js(AnonymousClass11S r2, AnonymousClass1M9 r3, C25181Nf r4, AnonymousClass1MZ r5, AnonymousClass12L r6, C24901Mc r7) {
        C18070vi.A0w(r2, r7, r6, r3, r5);
        C18070vi.A0d(r4, 6);
        this.A00 = r2;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r5;
        this.A05 = r4;
    }
}
