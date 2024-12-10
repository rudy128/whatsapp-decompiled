package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.8DZ  reason: invalid class name */
public class AnonymousClass8DZ extends LinearLayout implements AnonymousClass009 {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C37451pZ A09;
    public C27201Vd A0A;
    public AnonymousClass1QJ A0B;
    public AnonymousClass1R2 A0C;
    public AnonymousClass031 A0D;
    public boolean A0E;

    public void A00(AnonymousClass1E7 r6, String str, String str2) {
        this.A03.setVisibility(0);
        this.A00.setVisibility(0);
        this.A09.A07(this.A02, r6);
        this.A08.setText(str);
        this.A07.setText(AnonymousClass3MW.A0x(getResources(), str2, AnonymousClass3MW.A1a(), 0, 2131898300));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0D;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public void setScanQrText(int i) {
        this.A06.setText(i);
    }

    public LinearLayout getProfileContainer() {
        return this.A03;
    }

    public LinearLayout getScanQrContainer() {
        return this.A04;
    }

    public LinearLayout getSendPaymentContainer() {
        return this.A05;
    }
}
