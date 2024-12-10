package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Cb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70673Cb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C29691ci A03;
    public final /* synthetic */ C22621Co A04;
    public final /* synthetic */ AnonymousClass1BI A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public final void run() {
        Set emptySet;
        C28781at r15;
        C22621Co r13 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A08;
        AnonymousClass1BI r3 = this.A05;
        C29691ci r7 = this.A03;
        long j = this.A01;
        int i = this.A00;
        boolean z3 = this.A09;
        long j2 = this.A02;
        boolean z4 = this.A0A;
        boolean z5 = this.A07;
        if (!z || !z2) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = C17880vN.A0M(r13.A01).A02.A09(r3, true);
        }
        AnonymousClass00H r14 = r13.A01;
        C17880vN.A0M(r14).A07.A0H(r7);
        C17880vN.A0M(r14).A02.A0R(emptySet);
        ArrayList A002 = C17880vN.A0M(r14).A0E.A00(r3, j, false);
        if (r13.A00.A0A(r3) != null) {
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0M(r14).A0G, 7115)) {
                boolean A042 = C17880vN.A0M(r14).A0H.A04(r3);
                boolean A2U = C17880vN.A0M(r14).A06.A2U();
                ArrayList A13 = AnonymousClass000.A13();
                if (A042) {
                    A13.addAll(A002);
                } else if (A2U) {
                    A13.addAll(C17880vN.A0M(r14).A0E.A00(r3, j, true));
                }
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    if (A0Y.A0y > j) {
                        A132.add(A0Y);
                    }
                }
                C17880vN.A0M(r14).A0K.CGF(new C21365Aiu(r13, r3, A132, i, 18));
            }
        }
        if (z3) {
            AnonymousClass1WM r6 = C17880vN.A0M(r14).A0F;
            HashSet A12 = C17880vN.A12();
            long A092 = r6.A04.A09(r3);
            r15 = r6.A09.get();
            try {
                for (Integer intValue : C63792th.A00) {
                    A12.addAll(AnonymousClass1WM.A05(r15, r6, intValue.intValue(), A092, j2, false));
                }
                r15.close();
                AnonymousClass1WM.A02(r6, A12);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        if (z4) {
            AnonymousClass1WM r62 = C17880vN.A0M(r14).A0F;
            HashSet A122 = C17880vN.A12();
            long A093 = r62.A04.A09(r3);
            r15 = r62.A09.get();
            A122.addAll(AnonymousClass1WM.A05(r15, r62, 74, A093, j2, true));
            r15.close();
            HashSet A123 = C17880vN.A12();
            Iterator it2 = A122.iterator();
            while (it2.hasNext()) {
                AnonymousClass206 A0Y2 = C17880vN.A0Y(it2);
                if (A0Y2 instanceof AnonymousClass212) {
                    AnonymousClass1W6 A0c = C17880vN.A0c(r62.A0F);
                    AnonymousClass206 A032 = A0c.A01.A03(((AnonymousClass212) A0Y2).A02);
                    if (A032 != null) {
                        A123.add(A032);
                    }
                }
            }
            A002.addAll(A123);
        }
        ((AnonymousClass1Q1) C17880vN.A0M(r14).A0N.get()).A02(r3, A002, i, z5);
    }

    public /* synthetic */ C70673Cb(C29691ci r1, C22621Co r2, AnonymousClass1BI r3, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = r2;
        this.A06 = z;
        this.A08 = z2;
        this.A05 = r3;
        this.A03 = r1;
        this.A01 = j;
        this.A00 = i;
        this.A09 = z3;
        this.A02 = j2;
        this.A0A = z4;
        this.A07 = z5;
    }
}
