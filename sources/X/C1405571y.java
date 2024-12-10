package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.71y  reason: invalid class name and case insensitive filesystem */
public final class C1405571y {
    public final AnonymousClass1KB A00;
    public final C18030ve A01;
    public final C36401np A02;
    public final AnonymousClass6pB A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (r0 == true) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.view.View r13, X.C72083Ko r14, X.C122646Re r15, int r16, int r17) {
        /*
            r12 = this;
            r10 = r12
            X.00H r0 = r12.A04
            r8 = r15
            X.77e r0 = X.C108975cc.A0K(r15, r0)
            r4 = 1
            r3 = 0
            r7 = 1
            if (r0 != 0) goto L_0x001f
            r7 = 0
            int r1 = r15.ordinal()
            X.0vl r0 = r12.A05
            java.lang.Object r0 = r0.getValue()
            X.2mM r0 = (X.C59472mM) r0
            if (r1 == r3) goto L_0x009b
            r0.A02(r3)
        L_0x001f:
            int r5 = r15.ordinal()
            r0 = 2131435679(0x7f0b209f, float:1.8493207E38)
            if (r5 == r3) goto L_0x002b
            r0 = 2131435680(0x7f0b20a0, float:1.849321E38)
        L_0x002b:
            r9 = r13
            android.view.View r2 = X.C18070vi.A05(r13, r0)
            r0 = 2131429863(0x7f0b09e7, float:1.848141E38)
            android.widget.ImageView r6 = X.AnonymousClass3MW.A0H(r2, r0)
            r0 = r16
            r6.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            X.C108995ce.A0j(r1, r6, r0)
            r0 = 2131429865(0x7f0b09e9, float:1.8481415E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r2, r0)
            r1 = r17
            r0.setText(r1)
            r0 = 2131429864(0x7f0b09e8, float:1.8481413E38)
            X.C108975cc.A0t(r2, r0)
            r0 = 2131427926(0x7f0b0256, float:1.8477482E38)
            X.AnonymousClass3MY.A1B(r2, r0, r3)
            r0 = 2131427923(0x7f0b0253, float:1.8477476E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            if (r7 == 0) goto L_0x0099
            X.0vl r0 = r12.A05
            java.lang.Object r0 = r0.getValue()
            X.2mM r0 = (X.C59472mM) r0
            X.6zR r0 = r0.A00()
            if (r5 == r3) goto L_0x0096
            boolean r0 = r0.A01
        L_0x0079:
            if (r0 != r4) goto L_0x0099
        L_0x007b:
            r1.setChecked(r4)
            if (r7 == 0) goto L_0x008e
            r0 = 44
            X.78A r6 = new X.78A
            r6.<init>(r1, r15, r12, r0)
        L_0x0087:
            r2.setOnClickListener(r6)
            r2.setVisibility(r3)
            return
        L_0x008e:
            r11 = 6
            X.48k r6 = new X.48k
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0087
        L_0x0096:
            boolean r0 = r0.A00
            goto L_0x0079
        L_0x0099:
            r4 = 0
            goto L_0x007b
        L_0x009b:
            r0.A01(r3)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1405571y.A00(android.view.View, X.3Ko, X.6Re, int, int):void");
    }

    public final void A02(AnonymousClass02n r17, AnonymousClass1FU r18, AnonymousClass77S r19, C1605989c r20) {
        C38471rL r9;
        int i;
        int ordinal = ((AnonymousClass72B) this.A06.getValue()).A02(false).ordinal();
        AnonymousClass02n r92 = r17;
        AnonymousClass1FU r10 = r18;
        AnonymousClass77S r12 = r19;
        C1605989c r14 = r20;
        if (ordinal != 1) {
            if (ordinal == 2) {
                A03(r92, r10, r12, r14);
                View view = r10.A00;
                C18070vi.A0X(view);
                C122646Re r11 = C122646Re.INSTAGRAM;
                AnonymousClass7DE r8 = new AnonymousClass7DE(r92, r10, r11, r12, this, r14, false);
                if (C108975cc.A0K(r11, this.A04) != null) {
                    r9 = new AnonymousClass6LG(this, 2);
                    i = 2131896375;
                } else {
                    r9 = new AnonymousClass48k(r8, r11, view, this, 6);
                    i = 2131896376;
                }
                A01(view, r11, r9, AnonymousClass3Ma.A11(view, i), 2131233618, 2131896373);
            } else if (ordinal == 3) {
                View view2 = r10.A00;
                C18070vi.A0X(view2);
                C17880vN.A0E(view2, 2131435678).setText(2131896369);
                TextView A0E = C17880vN.A0E(view2, 2131435677);
                A0E.setVisibility(0);
                SpannableStringBuilder A052 = this.A02.A05(A0E.getContext(), new C146527Pl(this, view2, 46), C17880vN.A0q(view2.getContext(), "waffle-main-settings", new Object[1], 0, 2131896368), "waffle-main-settings");
                C18070vi.A0X(A052);
                A0E.setText(A052);
                AnonymousClass3Ma.A1I(A0E, this.A01);
                C122646Re r112 = C122646Re.FACEBOOK;
                A00(view2, new AnonymousClass7DE(r92, r10, r112, r12, this, r14, true), r112, 2131233617, 2131896372);
                C122646Re r113 = C122646Re.INSTAGRAM;
                A00(view2, new AnonymousClass7DE(r92, r10, r113, r12, this, r14, true), r113, 2131233618, 2131896374);
            }
        } else if (((C133776pT) C108945cZ.A12(this.A09).A0C.get()).A00()) {
            A03(r92, r10, r12, r14);
        }
    }

    public final void A03(AnonymousClass02n r12, AnonymousClass1FU r13, AnonymousClass77S r14, C1605989c r15) {
        C38471rL r7;
        C98494rF A002 = C98494rF.A00();
        if (((C35511mM) this.A07.getValue()).A06(AnonymousClass00R.A0J)) {
            C20017A3j.A01(new AnonymousClass7wB(r13, r14, A002), 2);
            r7 = new AnonymousClass6LF(r13, r12, 26);
        } else {
            A002.element = r13.getString(2131889249);
            r7 = new AnonymousClass48j(r13, this, r15, 30);
        }
        View view = r13.A00;
        C18070vi.A0X(view);
        A01(view, C122646Re.FACEBOOK, r7, (String) A002.element, 2131233617, 2131896371);
    }

    public C1405571y(AnonymousClass1KB r2, C18030ve r3, C36401np r4, AnonymousClass6pB r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r6, r7, r8, r9, r10);
        C18070vi.A0x(r11, r5, r4, r3, r2);
        this.A09 = r10;
        this.A04 = r11;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = AnonymousClass1DF.A01(new C153677pu(r6));
        this.A08 = AnonymousClass1DF.A01(new C153687pv(r7));
        this.A06 = AnonymousClass1DF.A01(new C153667pt(r8));
        this.A05 = AnonymousClass1DF.A01(new C153657ps(r9));
    }

    private final void A01(View view, C122646Re r7, C38471rL r8, String str, int i, int i2) {
        int i3 = 2131435679;
        if (r7.ordinal() != 0) {
            i3 = 2131435680;
        }
        View A052 = C18070vi.A05(view, i3);
        ImageView A0H = AnonymousClass3MW.A0H(A052, 2131429863);
        TextView A0E = C17880vN.A0E(A052, 2131429865);
        TextView A0E2 = C17880vN.A0E(A052, 2131429864);
        A0H.setImageResource(i);
        A0E.setText(i2);
        A052.setOnClickListener(r8);
        A052.setVisibility(0);
        A0E2.setVisibility(0);
        A0E2.setText(str);
    }
}
