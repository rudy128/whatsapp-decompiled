package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.3mL  reason: invalid class name and case insensitive filesystem */
public final class C76023mL extends C73953Xy {
    public final C18000vb A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C22821Di A0A;
    public final AnonymousClass1OS A0B;

    public static final void A00(C93374is r2, C76023mL r3, boolean z, boolean z2) {
        int A002;
        boolean z3 = r2.A0D;
        View view = r3.A0H;
        if (z3) {
            A002 = 2131231281;
        } else if (z) {
            A002 = AnonymousClass1YL.A00(view.getContext(), 2130970064, 2131101205);
        } else if (z2) {
            C42491yG.A03(view);
            return;
        } else {
            C42491yG.A02(view);
            return;
        }
        view.setBackgroundResource(A002);
    }

    public static final boolean A01(C76023mL r1, boolean z) {
        C18100vl r12 = r1.A07;
        if ((AnonymousClass3MX.A0v(r12).A00 != null || z) && ((SelectionCheckView) C72463Mc.A0O(r12)).A0D != z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r4 == null) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0B(java.lang.Object r9) {
        /*
            r8 = this;
            X.4is r9 = (X.C93374is) r9
            r2 = 0
            X.C18070vi.A0d(r9, r2)
            X.0vl r0 = r8.A05
            java.lang.Object r5 = X.AnonymousClass3MX.A14(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r3 = r8.A0H
            android.content.Context r4 = r3.getContext()
            int r1 = r9.A00
            int r0 = r9.A01
            X.AnonymousClass4aX.A0B(r4, r5, r1, r0)
            X.0vl r6 = r8.A06
            android.widget.TextView r1 = X.C72453Mb.A0X(r6)
            X.4ZN r0 = r9.A04
            X.AnonymousClass4ZN.A02(r3, r1, r0)
            java.lang.Integer r5 = r9.A08
            if (r5 == 0) goto L_0x003d
            android.widget.TextView r4 = X.C72453Mb.A0X(r6)
            android.view.View r0 = X.C72453Mb.A0T(r6)
            android.content.Context r1 = r0.getContext()
            int r0 = r5.intValue()
            X.AnonymousClass3MX.A1C(r1, r4, r0)
        L_0x003d:
            java.lang.Integer r4 = r9.A07
            if (r4 == 0) goto L_0x0054
            int r1 = r4.intValue()
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x0054
            X.0vl r0 = r8.A01
            android.view.View r0 = X.C72463Mc.A0O(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r1)
        L_0x0054:
            X.0vl r0 = r8.A01
            X.1bI r1 = X.AnonymousClass3MX.A0v(r0)
            boolean r0 = r9.A0C
            r6 = 1
            if (r0 != 0) goto L_0x0062
            r0 = 1
            if (r4 != 0) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r4 = 8
            int r0 = X.C72453Mb.A0J(r0)
            r1.A04(r0)
            X.4ZN r5 = r9.A03
            if (r5 == 0) goto L_0x0079
            X.0vl r0 = r8.A03
            android.widget.TextView r0 = X.C72453Mb.A0X(r0)
            X.AnonymousClass4ZN.A02(r3, r0, r5)
        L_0x0079:
            X.0vl r0 = r8.A03
            android.view.View r1 = X.C72453Mb.A0T(r0)
            r0 = 8
            if (r5 == 0) goto L_0x0084
            r0 = 0
        L_0x0084:
            r1.setVisibility(r0)
            java.lang.String r5 = r9.A09
            if (r5 == 0) goto L_0x0096
            X.0vl r0 = r8.A02
            android.view.View r0 = X.C72463Mc.A0O(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r5)
        L_0x0096:
            X.0vl r0 = r8.A02
            X.1bI r1 = X.AnonymousClass3MX.A0v(r0)
            r0 = 8
            if (r5 == 0) goto L_0x00a1
            r0 = 0
        L_0x00a1:
            r1.A04(r0)
            X.0vl r7 = r8.A04
            android.view.View r0 = X.C72453Mb.A0T(r7)
            android.content.Context r5 = r0.getContext()
            long r0 = r9.A02
            java.lang.String r6 = android.text.format.DateUtils.formatDateTime(r5, r0, r6)
            X.4ZN r0 = r9.A05
            if (r0 == 0) goto L_0x014a
            java.lang.CharSequence r0 = X.AnonymousClass4ZN.A00(r3, r0)
            if (r0 == 0) goto L_0x014a
            java.lang.String r5 = r0.toString()
            if (r5 == 0) goto L_0x014a
            int r0 = r5.length()
            if (r0 == 0) goto L_0x014a
            android.widget.TextView r1 = X.C72453Mb.A0X(r7)
            X.0vb r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass1EG.A04(r0, r6, r5)
            r1.setText(r0)
        L_0x00d7:
            X.1D6 r5 = r9.A0A
            if (r5 == 0) goto L_0x0106
            X.0vl r6 = r8.A08
            android.view.View r1 = X.C72463Mc.A0O(r6)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r5.second
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setImageResource(r0)
            X.0vl r0 = r8.A09
            android.view.View r1 = X.C72463Mc.A0O(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = X.AnonymousClass3MZ.A04(r5)
            r1.setText(r0)
            android.view.View r1 = X.C72463Mc.A0O(r6)
            int r0 = X.AnonymousClass3MZ.A04(r5)
            X.AnonymousClass1Y5.A03(r1, r0)
        L_0x0106:
            X.0vl r0 = r8.A08
            X.1bI r1 = X.AnonymousClass3MX.A0v(r0)
            r0 = 8
            if (r5 == 0) goto L_0x0111
            r0 = 0
        L_0x0111:
            r1.A04(r0)
            X.0vl r0 = r8.A09
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            if (r5 == 0) goto L_0x011d
            r4 = 0
        L_0x011d:
            r0.A04(r4)
            r0 = 19
            X.C89994dM.A00(r3, r8, r9, r0)
            r0 = 2
            X.C90284dp.A00(r3, r8, r9, r0)
            X.1Di r1 = r9.A0B
            X.9Bw r0 = r9.A06
            java.lang.Object r0 = r1.invoke(r0)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            A00(r9, r8, r1, r2)
            boolean r0 = A01(r8, r1)
            if (r0 == 0) goto L_0x0149
            X.0vl r0 = r8.A07
            android.view.View r0 = X.C72463Mc.A0O(r0)
            com.whatsapp.components.SelectionCheckView r0 = (com.whatsapp.components.SelectionCheckView) r0
            r0.A04(r1, r2)
        L_0x0149:
            return
        L_0x014a:
            android.widget.TextView r0 = X.C72453Mb.A0X(r7)
            r0.setText(r6)
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76023mL.A0B(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76023mL(View view, C18000vb r4, C22821Di r5, AnonymousClass1OS r6) {
        super(view);
        C18070vi.A0s(view, r4, r6, r5);
        this.A00 = r4;
        this.A0B = r6;
        this.A0A = r5;
        Integer num = AnonymousClass00R.A0C;
        this.A05 = AnonymousClass1DF.A00(num, new C101285Ca(view));
        this.A06 = AnonymousClass1DF.A00(num, new C101295Cb(view));
        this.A07 = AnonymousClass1DF.A00(num, new C101305Cc(view));
        this.A08 = AnonymousClass1DF.A00(num, new C101315Cd(view));
        this.A09 = AnonymousClass1DF.A00(num, new C101325Ce(view));
        this.A03 = AnonymousClass1DF.A00(num, new AnonymousClass5CY(view));
        this.A01 = AnonymousClass1DF.A00(num, new AnonymousClass5CW(view));
        this.A04 = AnonymousClass1DF.A00(num, new AnonymousClass5CZ(view));
        this.A02 = AnonymousClass1DF.A00(num, new AnonymousClass5CX(view));
    }
}
