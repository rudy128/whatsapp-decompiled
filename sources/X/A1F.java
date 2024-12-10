package X;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class A1F {
    public final C24921Me A00;
    public final C18000vb A01;
    public final AnonymousClass1L9 A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1VW A04;
    public final AnonymousClass11C A05;
    public final C18030ve A06;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r8 = (X.AnonymousClass8pQ) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.app.Activity r6, android.view.View r7, X.C20284AEs r8, X.A1F r9) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass8pQ
            if (r0 == 0) goto L_0x0062
            X.8pQ r8 = (X.AnonymousClass8pQ) r8
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x0062
            r0 = 2131433252(0x7f0b1724, float:1.8488284E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r7, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r4 = r0.inflate()
            r5 = 2131888709(0x7f120a45, float:1.941206E38)
            java.lang.String r0 = "cashback"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r5 = 2131888708(0x7f120a44, float:1.9412059E38)
        L_0x0025:
            r0 = 2131433254(0x7f0b1726, float:1.8488288E38)
            android.widget.TextView r3 = X.AnonymousClass3MW.A0J(r4, r0)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.77e r0 = r8.A09
            java.lang.Object r1 = r0.A00
            r0 = 0
            r2[r0] = r1
            X.AnonymousClass3MY.A0y(r6, r3, r2, r5)
            java.lang.String r1 = "percentage"
            java.lang.String r0 = r8.A03
            boolean r1 = r1.equals(r0)
            r0 = 2131433251(0x7f0b1723, float:1.8488282E38)
            android.widget.TextView r3 = X.AnonymousClass3MW.A0J(r4, r0)
            if (r1 == 0) goto L_0x0063
            X.0vb r0 = r9.A01
            java.text.NumberFormat r2 = r0.A0M()
            java.lang.String r0 = r8.A06
            float r1 = java.lang.Float.parseFloat(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            java.lang.String r0 = r2.format(r0)
        L_0x005f:
            r3.setText(r0)
        L_0x0062:
            return
        L_0x0063:
            java.lang.String r0 = r8.A06
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1F.A00(android.app.Activity, android.view.View, X.AEs, X.A1F):void");
    }

    public void A02(Activity activity, ViewGroup viewGroup, AnonymousClass1KJ r20, AnonymousClass1KN r21, AnonymousClass1KN r22, C20284AEs aEs) {
        Activity activity2 = activity;
        ViewGroup viewGroup2 = viewGroup;
        View inflate = activity2.getLayoutInflater().inflate(2131624627, viewGroup2, true);
        TextView A0J = AnonymousClass3MW.A0J(inflate, 2131429548);
        C18000vb r2 = this.A01;
        AnonymousClass1KJ r7 = r20;
        A0J.setText(r7.BLc(r2, r22));
        AnonymousClass3MW.A0J(inflate, 2131427786).setText(r7.BLc(r2, r21));
        C18030ve r14 = this.A06;
        AnonymousClass1KB r11 = this.A03;
        AnonymousClass1L9 r10 = this.A02;
        AnonymousClass11C r13 = this.A05;
        C26302CxJ.A0K(activity2, Uri.parse("https://faq.whatsapp.com/3314129148717498"), r10, r11, AnonymousClass3MX.A0V(viewGroup2, 2131429549), r13, r14, C17880vN.A0q(activity2, "learn-more", new Object[1], 0, 2131888703), "learn-more");
        A00(activity2, inflate, aEs, this);
    }

    public A1F(AnonymousClass1L9 r1, AnonymousClass1KB r2, AnonymousClass1VW r3, C24921Me r4, AnonymousClass11C r5, C18000vb r6, C18030ve r7) {
        this.A06 = r7;
        this.A03 = r2;
        this.A02 = r1;
        this.A05 = r5;
        this.A04 = r3;
        this.A00 = r4;
        this.A01 = r6;
    }

    public void A01(Activity activity, View.OnClickListener onClickListener, ViewGroup viewGroup, C37451pZ r12, AnonymousClass1E7 r13, C1418477e r14, C1418477e r15, boolean z, boolean z2) {
        String A0I;
        View inflate = activity.getLayoutInflater().inflate(2131625613, viewGroup, true);
        ImageView A0G = AnonymousClass3MW.A0G(inflate, 2131433642);
        TextView A0J = AnonymousClass3MW.A0J(inflate, 2131433641);
        TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131433643);
        View A062 = AnonymousClass1HF.A06(inflate, 2131430710);
        if (z) {
            A062.setVisibility(0);
        } else {
            A062.setVisibility(8);
        }
        inflate.setOnClickListener(onClickListener);
        if (r13 != null) {
            r12.A07(A0G, r13);
            if (r14 == null || !z2) {
                A0I = this.A00.A0I(r13);
            } else {
                A0I = (String) r14.A00;
            }
            if (A0I == null) {
                A0I = "";
            }
            A0J.setText(A0I);
            if (C20061A5k.A02(r15)) {
                A0J2.setVisibility(8);
                return;
            }
        } else {
            this.A04.A09(A0G, 2131231047);
            if (!C20061A5k.A02(r14)) {
                AnonymousClass8BR.A1E(A0J, AnonymousClass8BT.A0q(r14));
            } else {
                A0J.setVisibility(8);
            }
        }
        Object obj = r15.A00;
        C17960vV.A07(obj);
        AnonymousClass3MY.A0y(activity, A0J2, new Object[]{obj}, 2131891338);
    }
}
