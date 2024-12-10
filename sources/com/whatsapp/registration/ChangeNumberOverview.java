package com.whatsapp.registration;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C18070vi;
import X.C19880zA;
import X.C36401np;
import X.C72473Md;
import X.C72483Me;
import X.C90664eR;
import X.C91024f1;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ScrollView;

public final class ChangeNumberOverview extends AnonymousClass1FY {
    public ScrollView A00;
    public C19880zA A01;
    public AnonymousClass1LU A02;
    public AnonymousClass1QO A03;
    public AnonymousClass1QS A04;
    public AnonymousClass129 A05;
    public C36401np A06;
    public AnonymousClass00H A07;
    public int A08;
    public View A09;
    public boolean A0A;

    public ChangeNumberOverview() {
        this(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A00;
        if (scrollView == null) {
            C18070vi.A11("scrollView");
            throw null;
        } else {
            C90664eR.A00(scrollView.getViewTreeObserver(), this, 7);
        }
    }

    public static final void A03(ChangeNumberOverview changeNumberOverview) {
        String str;
        float f;
        ScrollView scrollView = changeNumberOverview.A00;
        if (scrollView == null) {
            str = "scrollView";
        } else {
            boolean canScrollVertically = scrollView.canScrollVertically(1);
            str = "bottomButtonContainer";
            View view = changeNumberOverview.A09;
            if (canScrollVertically) {
                if (view != null) {
                    f = (float) changeNumberOverview.A08;
                }
            } else if (view != null) {
                f = 0.0f;
            }
            view.setElevation(f);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A05 = AnonymousClass3Ma.A0t(A0L);
            this.A07 = C000200d.A00(A0L.A5U);
            this.A06 = AnonymousClass3MY.A0e(r1);
            this.A03 = AnonymousClass3Ma.A0q(A0L);
            this.A04 = AnonymousClass3MZ.A0z(A0L);
            this.A01 = (C19880zA) A0L.A7k.get();
            this.A02 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131888080(0x7f1207d0, float:1.9410785E38)
            r4.setTitle(r0)
            X.01n r0 = r4.getSupportActionBar()
            X.C72473Md.A16(r0)
            r0.A0G()
            r0 = 2131624515(0x7f0e0243, float:1.8876212E38)
            r4.setContentView((int) r0)
            android.view.View r1 = r4.A00
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r4.A00 = r0
            android.view.View r1 = r4.A00
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            r4.A09 = r0
            X.1QO r0 = r4.A03
            if (r0 == 0) goto L_0x00e7
            boolean r3 = r0.A03()
            if (r3 == 0) goto L_0x00da
            X.1QO r0 = r4.A03
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x00da
            r0 = 2131428976(0x7f0b0670, float:1.8479612E38)
            android.view.View r0 = r4.findViewById(r0)
            r2 = 0
            r0.setVisibility(r2)
            r0 = 2131428975(0x7f0b066f, float:1.847961E38)
            X.C72463Mc.A19(r4, r0)
            r0 = 2131428973(0x7f0b066d, float:1.8479606E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131888065(0x7f1207c1, float:1.9410755E38)
            java.lang.String r0 = X.C18070vi.A0F(r4, r0)
            X.C72483Me.A0d(r4, r1, r0)
            r0 = 2131428974(0x7f0b066e, float:1.8479608E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r4, r0)
            r1.setVisibility(r2)
            r0 = 2131888066(0x7f1207c2, float:1.9410757E38)
            java.lang.String r0 = X.C18070vi.A0F(r4, r0)
            X.C72483Me.A0d(r4, r1, r0)
            r0 = 2131428977(0x7f0b0671, float:1.8479614E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131888039(0x7f1207a7, float:1.9410702E38)
            java.lang.String r0 = X.C18070vi.A0F(r4, r0)
            X.C72483Me.A0d(r4, r1, r0)
            r0 = 2131428978(0x7f0b0672, float:1.8479616E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131888040(0x7f1207a8, float:1.9410704E38)
            java.lang.String r0 = X.C18070vi.A0F(r4, r0)
            X.C72483Me.A0d(r4, r1, r0)
        L_0x00a3:
            r0 = 2131433119(0x7f0b169f, float:1.8488015E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 40
            X.AnonymousClass3Ma.A1A(r1, r4, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168631(0x7f070d77, float:1.795157E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.A08 = r0
            android.widget.ScrollView r0 = r4.A00
            if (r0 == 0) goto L_0x00ea
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 4
            X.4eT r0 = new X.4eT
            r0.<init>(r4, r1)
            r2.addOnScrollChangedListener(r0)
            android.widget.ScrollView r0 = r4.A00
            if (r0 == 0) goto L_0x00ea
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 7
            X.C90664eR.A00(r1, r4, r0)
            return
        L_0x00da:
            X.10I r2 = r4.A05
            r1 = 31
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.CGF(r0)
            goto L_0x00a3
        L_0x00e7:
            java.lang.String r0 = "paymentsGatingManager"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r0 = "scrollView"
        L_0x00ec:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.ChangeNumberOverview.onCreate(android.os.Bundle):void");
    }

    public ChangeNumberOverview(int i) {
        this.A0A = false;
        C91024f1.A00(this, 45);
    }
}
