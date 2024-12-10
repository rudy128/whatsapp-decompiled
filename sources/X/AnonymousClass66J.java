package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.66J  reason: invalid class name */
public class AnonymousClass66J extends C42061xY {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(java.lang.Integer r10, java.lang.Integer r11, boolean r12) {
        /*
            r9 = this;
            r6 = 0
            int r2 = r10.intValue()
            if (r2 != 0) goto L_0x008f
            android.view.View r3 = r9.A0H
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131168572(0x7f070d3c, float:1.795145E38)
            int r2 = r1.getDimensionPixelSize(r0)
        L_0x0014:
            r5 = 0
        L_0x0015:
            r4 = 8
            android.view.View r1 = r9.A00
            if (r6 == 0) goto L_0x0073
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r0 = r9.A02
            if (r12 == 0) goto L_0x0024
            r4 = 0
        L_0x0024:
            r0.setVisibility(r4)
            android.widget.TextView r6 = r9.A01
            android.content.Context r4 = r6.getContext()
            r1 = 2130971949(0x7f040d2d, float:1.755265E38)
            r0 = 2131103049(0x7f060d49, float:1.7818553E38)
            int r8 = X.AnonymousClass1YL.A00(r4, r1, r0)
            r7 = 2130971888(0x7f040cf0, float:1.7552527E38)
        L_0x003a:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r1 = X.AnonymousClass3Ma.A06(r6)
            r0 = 1
            r1.resolveAttribute(r7, r4, r0)
            int r0 = r4.resourceId
            X.C29261bv.A08(r6, r0)
            android.content.Context r0 = r6.getContext()
            X.AnonymousClass3MX.A1C(r0, r6, r8)
            int r4 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r0 = r3.getPaddingBottom()
            r6.setPadding(r4, r2, r1, r0)
            int r0 = r3.getPaddingLeft()
            X.C72463Mc.A14(r3, r0, r5)
            if (r11 == 0) goto L_0x0072
            int r0 = r11.intValue()
            r6.setText(r0)
        L_0x0072:
            return
        L_0x0073:
            r1.setVisibility(r4)
            android.widget.TextView r0 = r9.A02
            r0.setVisibility(r4)
            android.widget.TextView r6 = r9.A01
            android.content.Context r4 = r6.getContext()
            r1 = 2130971950(0x7f040d2e, float:1.7552653E38)
            r0 = 2131103050(0x7f060d4a, float:1.7818555E38)
            int r8 = X.AnonymousClass1YL.A00(r4, r1, r0)
            r7 = 2130971887(0x7f040cef, float:1.7552525E38)
            goto L_0x003a
        L_0x008f:
            r0 = 2
            android.view.View r3 = r9.A0H
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            if (r2 != r0) goto L_0x00ad
            r0 = 2131168778(0x7f070e0a, float:1.7951867E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r6 = 1
            goto L_0x0015
        L_0x00ad:
            r0 = 2131168571(0x7f070d3b, float:1.7951448E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131168543(0x7f070d1f, float:1.795139E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass66J.A0H(java.lang.Integer, java.lang.Integer, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass66J(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        View view2 = this.A0H;
        TextView A0J = AnonymousClass3MW.A0J(view2, 2131434939);
        this.A01 = A0J;
        this.A02 = AnonymousClass3MW.A0J(view2, 2131436023);
        this.A00 = AnonymousClass1HF.A06(view2, 2131430073);
        A0J.setText(2131895498);
    }
}
