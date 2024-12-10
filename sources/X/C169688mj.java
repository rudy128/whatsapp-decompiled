package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8mj  reason: invalid class name and case insensitive filesystem */
public final class C169688mj extends C169708ml {
    public final AnonymousClass11P A00;
    public final C218217n A01;
    public final C18030ve A02;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        AnonymousClass1BI A022;
        AnonymousClass9KE r9;
        C18070vi.A0d(a6u, 2);
        C166378cn r4 = a6u.A03;
        if (r4 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "notificationActivitySetting") || strArr.length != 2 || !C18070vi.A18(a6u.A01, C62382rJ.A03) || !AnonymousClass8BW.A1Q(r4.bitField0_) || (r4.bitField1_ & 4194304) == 0 || (A022 = AnonymousClass1BI.A00.A02(strArr[1])) == null) {
            return null;
        }
        long j = r4.timestamp_;
        C19999A2n a2n = a6u.A02;
        AnonymousClass8YB r0 = r4.notificationActivitySettingAction_;
        if (r0 == null) {
            r0 = AnonymousClass8YB.DEFAULT_INSTANCE;
        }
        int i = r0.notificationActivitySetting_;
        if (i != 0) {
            if (i == 1) {
                r9 = AnonymousClass9KE.ALL_MESSAGES;
            } else if (i == 2) {
                r9 = AnonymousClass9KE.HIGHLIGHTS;
            } else if (i == 3) {
                r9 = AnonymousClass9KE.DEFAULT_HIGHLIGHTS;
            }
            return new C170438pr(a2n, A022, r9, str, j, z);
        }
        r9 = AnonymousClass9KE.DEFAULT_ALL_MESSAGES;
        return new C170438pr(a2n, A022, r9, str, j, z);
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A02, 12206);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169688mj(C26371Rw r1, AnonymousClass1S4 r2, AnonymousClass11P r3, AnonymousClass1CJ r4, C26331Rs r5, C18030ve r6, C218217n r7) {
        super(r1, r2, r4, r5);
        C18070vi.A0w(r4, r1, r2, r5, r3);
        C18070vi.A0l(r6, r7);
        this.A00 = r3;
        this.A02 = r6;
        this.A01 = r7;
    }

    public String A0D() {
        return "regular";
    }

    public String A0E() {
        return "notificationActivitySetting";
    }

    public List A0F(boolean z) {
        AnonymousClass201 r1;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1CJ r0 = this.A02;
        AnonymousClass1CJ.A01(r0);
        ArrayList A132 = AnonymousClass000.A13();
        for (C29691ci A08 : r0.A0H()) {
            AnonymousClass1BI A082 = A08.A08();
            C18070vi.A0X(A082);
            if (C22971Dz.A0e(A082) && (r1 = this.A01.A04.A0a(A082).A0A) != AnonymousClass201.DEFAULT_ALL_MESSAGES) {
                AnonymousClass1D6.A02(A082, r1, A132);
            }
        }
        Iterator it = A132.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r02 = (AnonymousClass1D6) it.next();
            A13.add(new C170438pr((C19999A2n) null, (AnonymousClass1BI) r02.first, C181309Py.A00((AnonymousClass201) r02.second), (String) null, AnonymousClass11P.A01(this.A00), false));
        }
        return A13;
    }
}
