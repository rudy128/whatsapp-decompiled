package X;

import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ct  reason: invalid class name and case insensitive filesystem */
public class C120196Ct extends C134066px {
    public A18 A00;
    public AnonymousClass22H A01;
    public final View A02;
    public final CheckBox A03;
    public final ConstraintLayout A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1M9 A06;
    public final C37451pZ A07;
    public final C18000vb A08;
    public final C18030ve A09;
    public final C28931bI A0A;
    public final C28931bI A0B;
    public final C28931bI A0C;
    public final AnonymousClass00H A0D;
    public final boolean A0E;
    public final View A0F;
    public final C33251iW A0G;
    public final C1406072e A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120196Ct(android.view.View r12, X.AnonymousClass11S r13, X.C33251iW r14, X.AnonymousClass1M9 r15, X.C37451pZ r16, X.AnonymousClass11C r17, X.C18000vb r18, X.AnonymousClass1KW r19, X.C18030ve r20, X.C1406072e r21, X.C18010vc r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24, X.AnonymousClass00H r25, java.util.List r26, boolean r27) {
        /*
            r11 = this;
            r5 = r11
            r6 = r12
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r22
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = r20
            r11.A09 = r4
            r0 = r23
            r11.A0J = r0
            r11.A08 = r8
            r11.A05 = r13
            r11.A0G = r14
            r11.A06 = r15
            r0 = r24
            r11.A0I = r0
            r0 = r21
            r11.A0H = r0
            r0 = r16
            r11.A07 = r0
            r11.A02 = r12
            r0 = r25
            r11.A0D = r0
            r0 = 2131433930(0x7f0b19ca, float:1.848966E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r12, r0)
            r11.A0F = r1
            r0 = 2131433934(0x7f0b19ce, float:1.8489668E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r12, r0)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            r11.A03 = r3
            r2 = r27
            r11.A0E = r2
            r0 = 5
            X.C89964dJ.A00(r1, r11, r0)
            r0 = 2131433936(0x7f0b19d0, float:1.8489672E38)
            X.1bI r0 = X.C28931bI.A00(r12, r0)
            r11.A0A = r0
            r0 = 2131433937(0x7f0b19d1, float:1.8489674E38)
            X.1bI r0 = X.C28931bI.A00(r12, r0)
            r11.A0B = r0
            r0 = 2131433938(0x7f0b19d2, float:1.8489676E38)
            X.1bI r0 = X.C28931bI.A00(r12, r0)
            r11.A0C = r0
            r1 = 10256(0x2810, float:1.4372E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            r4 = r26
            if (r0 == 0) goto L_0x008f
            r0 = 4
            X.C1422578t.A00(r3, r4, r11, r0)
        L_0x0076:
            r0 = 2131433932(0x7f0b19cc, float:1.8489664E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r12, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r11.A04 = r1
            if (r27 != 0) goto L_0x008e
            r0 = 0
            r1.setFocusableInTouchMode(r0)
            r1.setFocusable(r0)
            r0 = 2
            r1.setImportantForAccessibility(r0)
        L_0x008e:
            return
        L_0x008f:
            r1 = 46
            X.AFT r0 = new X.AFT
            r0.<init>(r11, r4, r1)
            r3.setOnClickListener(r0)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120196Ct.<init>(android.view.View, X.11S, X.1iW, X.1M9, X.1pZ, X.11C, X.0vb, X.1KW, X.0ve, X.72e, X.0vc, X.00H, X.00H, X.00H, java.util.List, boolean):void");
    }

    public static ArrayList A00(C120196Ct r7, List list) {
        A18 a18;
        A18 a182;
        AnonymousClass22H r0 = r7.A01;
        C17960vV.A07(r0);
        int i = r0.A02;
        ArrayList A13 = AnonymousClass000.A13();
        if (i != 1) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C120196Ct r1 = (C120196Ct) it.next();
                if (r1.A03.isChecked() && (a18 = r1.A00) != null) {
                    long j = a18.A01;
                    if (j != -1) {
                        C17880vN.A1R(A13, j);
                    }
                }
            }
        } else if (r7.A03.isChecked() && (a182 = r7.A00) != null) {
            long j2 = a182.A01;
            if (j2 != -1) {
                C17880vN.A1R(A13, j2);
            }
        }
        return A13;
    }

    public void A04(AnonymousClass22H r14, List list) {
        boolean z;
        int i;
        if (r14 != null) {
            C1406072e r4 = this.A0H;
            if (r14.A17() != null) {
                Iterator it = r14.A17().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    if (A0Y.A0v.A02 && (A0Y instanceof AnonymousClass22E)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            List list2 = list;
            boolean isEmpty = list.isEmpty();
            C1183863g r2 = new C1183863g();
            AnonymousClass205 r1 = r14.A0v;
            AnonymousClass1BI r3 = r1.A00;
            if (isEmpty) {
                if (r3 != null) {
                    C1406072e.A00(r2, r3, r4);
                }
                C1406072e.A02(r2, r14);
                i = 5;
            } else if (z) {
                if (r3 != null) {
                    C1406072e.A00(r2, r3, r4);
                }
                C1406072e.A02(r2, r14);
                i = 7;
            } else {
                if (r3 != null) {
                    C1406072e.A00(r2, r3, r4);
                }
                C1406072e.A02(r2, r14);
                i = 6;
            }
            r2.A04 = Integer.valueOf(i);
            C1406072e.A01(r2, (AnonymousClass1BI) null, r14);
            r4.A00.CC7(r2);
            C33251iW r22 = this.A0G;
            A51 a51 = new A51(r14.A0I(), r1);
            long j = r14.A0x;
            C32801hm r12 = r22.A0z;
            C17960vV.A07(r3);
            AnonymousClass11P r0 = r22.A0K;
            long A012 = AnonymousClass11P.A01(r0);
            long A013 = AnonymousClass11P.A01(r0);
            C18070vi.A0d(r3, 0);
            r22.A0b.A01(new AnonymousClass22E(C17880vN.A0Z(r3, r12.A00), a51, list2, A012, j, A013));
        }
    }

    public static boolean A01(C120196Ct r6, AnonymousClass206 r7) {
        if (!r7.A0w()) {
            return false;
        }
        C17960vV.A07(r7);
        C46162Dk r0 = (C46162Dk) ((AnonymousClass1CJ) r6.A0I.get()).A0A(r7.A0v.A00);
        if (r0 != null && r0.A0P()) {
            if (C18020vd.A05(C18040vf.A02, r6.A09, 6382)) {
                AnonymousClass11P r1 = (AnonymousClass11P) r6.A0J.get();
                C18070vi.A0d(r1, 1);
                if (AnonymousClass3MZ.A05(r1, r7) > 2592000000L) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
