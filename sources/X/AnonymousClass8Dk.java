package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.8Dk  reason: invalid class name */
public final class AnonymousClass8Dk extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1LU A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;

    public AnonymousClass8Dk(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass3MY.A0Z(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A04 = AnonymousClass1DF.A01(new C21926Auq(this));
        this.A05 = AnonymousClass1DF.A01(new C21930Auu(this));
        this.A06 = AnonymousClass1DF.A01(new C21931Auv(this));
        this.A03 = AnonymousClass1DF.A01(new C21924Auo(this));
        this.A0A = AnonymousClass1DF.A01(new C21929Aut(this));
        this.A08 = AnonymousClass1DF.A01(new C21927Aur(this));
        this.A07 = AnonymousClass1DF.A01(new C21925Aup(this));
        this.A09 = AnonymousClass1DF.A01(new C21928Aus(this));
        View.inflate(getContext(), 2131624184, this);
        setOrientation(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C194439rj r7) {
        /*
            r6 = this;
            r5 = 0
            X.0vl r0 = r6.A05
            android.widget.TextView r1 = X.C72453Mb.A0X(r0)
            X.3Bj r4 = r7.A02
            java.lang.String r0 = r4.A08
            r1.setText(r0)
            X.0vl r0 = r6.A04
            android.widget.TextView r1 = X.C72453Mb.A0X(r0)
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            X.0vl r0 = r6.A03
            android.widget.TextView r1 = X.C72453Mb.A0X(r0)
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            int r1 = r4.A01
            r3 = 1
            if (r1 == r3) goto L_0x00d9
            r0 = 2
            if (r1 == r0) goto L_0x00b0
            r0 = 3
            if (r1 != r0) goto L_0x0059
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231836(0x7f08045c, float:1.8079764E38)
            X.AnonymousClass3MX.A1B(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099708(0x7f06003c, float:1.7811777E38)
            X.AnonymousClass8BW.A10(r1, r2, r0)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
        L_0x0056:
            X.AnonymousClass3MX.A1A(r1, r2, r0)
        L_0x0059:
            android.widget.ImageView r0 = r6.getAlertCloseIcon()
            r1 = 8
            r0.setVisibility(r1)
            int r2 = r7.A00
            android.widget.LinearLayout r0 = r6.getAlertCountLayout()
            if (r2 <= r3) goto L_0x0089
            r0.setVisibility(r5)
            X.0vl r0 = r6.A06
            android.widget.TextView r1 = X.C72453Mb.A0X(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.setText(r0)
            android.view.View r2 = r6.getRootView()
            r0 = 22
            X.4dH r1 = new X.4dH
            r1.<init>(r6, r0)
        L_0x0085:
            r2.setOnClickListener(r1)
            return
        L_0x0089:
            r0.setVisibility(r1)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x00a4
            android.widget.ImageView r0 = r6.getAlertCloseIcon()
            r0.setVisibility(r5)
            android.widget.ImageView r2 = r6.getAlertCloseIcon()
            r1 = 5
            X.78A r0 = new X.78A
            r0.<init>(r6, r7, r7, r1)
            r2.setOnClickListener(r0)
        L_0x00a4:
            android.view.View r2 = r6.getRootView()
            r0 = 31
            X.4dO r1 = new X.4dO
            r1.<init>(r7, r7, r0)
            goto L_0x0085
        L_0x00b0:
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131232438(0x7f0806b6, float:1.8080985E38)
            X.AnonymousClass3MX.A1B(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099707(0x7f06003b, float:1.7811775E38)
            X.AnonymousClass8BW.A10(r1, r2, r0)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099703(0x7f060037, float:1.7811767E38)
            goto L_0x0056
        L_0x00d9:
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231889(0x7f080491, float:1.8079872E38)
            X.AnonymousClass3MX.A1B(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099706(0x7f06003a, float:1.7811773E38)
            X.AnonymousClass8BW.A10(r1, r2, r0)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099702(0x7f060036, float:1.7811765E38)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Dk.A00(X.9rj):void");
    }

    public final void setWaIntents(AnonymousClass1LU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final TextView getAlertActionText() {
        return C72453Mb.A0X(this.A03);
    }

    private final LinearLayout getAlertBannerComponent() {
        return (LinearLayout) AnonymousClass3MX.A14(this.A07);
    }

    private final TextView getAlertBody() {
        return C72453Mb.A0X(this.A04);
    }

    private final ImageView getAlertCloseIcon() {
        return (ImageView) AnonymousClass3MX.A14(this.A08);
    }

    private final LinearLayout getAlertCountLayout() {
        return (LinearLayout) AnonymousClass3MX.A14(this.A09);
    }

    private final ImageView getAlertIcon() {
        return (ImageView) AnonymousClass3MX.A14(this.A0A);
    }

    private final TextView getAlertTitle() {
        return C72453Mb.A0X(this.A05);
    }

    private final TextView getAlertsCount() {
        return C72453Mb.A0X(this.A06);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1LU getWaIntents() {
        AnonymousClass1LU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }
}
