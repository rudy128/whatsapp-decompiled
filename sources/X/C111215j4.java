package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5j4  reason: invalid class name and case insensitive filesystem */
public final class C111215j4 extends AnonymousClass1J2 {
    public int A00 = -1;
    public final C33251iW A01;
    public final AnonymousClass1BI A02;
    public final C191569mo A03;
    public final C133866pd A04;
    public final C32021gV A05;
    public final C41111vp A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C41731wy A08 = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final AnonymousClass1W6 A0D;

    public static final AnonymousClass206 A00(C111215j4 r0, long j) {
        return r0.A0D.A01.A03(j);
    }

    public static final C133866pd A03(AnonymousClass7PX r3, C111215j4 r4) {
        for (C133866pd r1 : AnonymousClass3MW.A10(r4.A06)) {
            if (AnonymousClass3MW.A10(r1.A02).contains(r3)) {
                return r1;
            }
        }
        return null;
    }

    public static final void A04(C133866pd r7, C111215j4 r8) {
        if (C108975cc.A02(r7.A02) == 0) {
            ArrayList A13 = AnonymousClass000.A13();
            C41111vp r5 = r8.A06;
            int i = 1;
            for (C133866pd r2 : AnonymousClass3MW.A10(r5)) {
                if (C18070vi.A18(r7.A03, r2.A03)) {
                    r8.A00 = i;
                } else {
                    r2.A00 = i;
                    A13.add(r2);
                    i++;
                }
            }
            r5.A0F(A13);
        }
    }

    public final AnonymousClass7PX A0T(AnonymousClass11S r5) {
        C41111vp r3 = this.A04.A02;
        int A022 = C108975cc.A02(r3);
        for (int i = 0; i < A022; i++) {
            if (r5.A0O(((AnonymousClass7PX) AnonymousClass3MW.A10(r3).get(i)).A04)) {
                return (AnonymousClass7PX) AnonymousClass3MW.A10(r3).get(i);
            }
        }
        return null;
    }

    public final void A0U(AnonymousClass7PX r5) {
        boolean A012 = this.A04.A01(r5);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Reaction=");
        A10.append(r5);
        C17960vV.A0F(A012, AnonymousClass000.A0y(" was not removed from allTab!", A10));
        C133866pd A032 = A03(r5, this);
        if (A032 == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Could not find emoji tab for reaction=");
            A102.append(r5);
            C17960vV.A0F(false, AnonymousClass000.A0y(". That should not happen.", A102));
            return;
        }
        boolean A013 = A032.A01(r5);
        StringBuilder A11 = AnonymousClass000.A11("Reaction=");
        A11.append(r5);
        C17960vV.A0F(A013, AnonymousClass001.A1E(A032, " was not removed from emojiTab=", A11));
        AnonymousClass206 A002 = A00(this, r5.A00);
        if (A002 != null) {
            this.A01.A0r(A002, "", true);
        }
    }

    public C111215j4(C33251iW r8, AnonymousClass8BG r9, AnonymousClass1CJ r10, AnonymousClass1BI r11, C191569mo r12, AnonymousClass1W6 r13, C32021gV r14, AnonymousClass10I r15, boolean z) {
        String str;
        this.A0D = r13;
        this.A05 = r14;
        this.A01 = r8;
        this.A02 = r11;
        this.A03 = r12;
        this.A09 = r15;
        this.A0B = z;
        this.A04 = new C133866pd(this, "", C1409073n.A03(r9.BMh()), 0);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator BMh = r9.BMh();
        int i = 1;
        while (BMh.hasNext()) {
            Object next = BMh.next();
            C18070vi.A0X(next);
            AnonymousClass7PW r0 = (AnonymousClass7PW) next;
            ArrayList A0s = C72463Mc.A0s(r0);
            Iterator descendingIterator = r0.A04.descendingIterator();
            C18070vi.A0X(descendingIterator);
            while (descendingIterator.hasNext()) {
                Object next2 = descendingIterator.next();
                C18070vi.A0X(next2);
                A0s.add(C1409073n.A00((AnonymousClass7PX) next2));
            }
            if (A0s.isEmpty() || (str = ((AnonymousClass7PX) C29431cG.A0b(A0s)).A05) == null) {
                str = "";
            }
            A13.add(new C133866pd(this, str, A0s, i));
            i++;
        }
        this.A06 = AnonymousClass3MW.A0n(A13);
        AnonymousClass1BI r1 = this.A02;
        C42941yz r02 = AnonymousClass1EC.A01;
        AnonymousClass1EC A002 = C42941yz.A00(r1);
        boolean z2 = false;
        if (A002 != null && r10.A06(A002) == 3) {
            z2 = true;
        }
        this.A0A = z2;
        this.A0C = C22971Dz.A0d(this.A02);
    }
}
