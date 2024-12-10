package com.whatsapp.payments.ui.widget;

import X.A3H;
import X.AFR;
import X.AFX;
import X.AGA;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass18O;
import X.AnonymousClass1HF;
import X.AnonymousClass1KI;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KN;
import X.AnonymousClass1QE;
import X.AnonymousClass1QJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.C17880vN;
import X.C18000vb;
import X.C187419fm;
import X.C20452ALp;
import X.C20867Aaj;
import X.C21422Ajp;
import X.C25088CWz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.QrImageView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import java.math.BigDecimal;

public class IndiaUpiDisplaySecureQrCodeView extends LinearLayout implements AnonymousClass009 {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C25088CWz A09;
    public QrImageView A0A;
    public AnonymousClass18O A0B;
    public C18000vb A0C;
    public AnonymousClass1KI A0D;
    public AnonymousClass1QJ A0E;
    public PaymentAmountInputField A0F;
    public IndiaUpiSecureQrCodeViewModel A0G;
    public AnonymousClass031 A0H;
    public boolean A0I;
    public final AnonymousClass1QE A0J;

    public void A01() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A0B = AnonymousClass3MZ.A0S(A0O);
            this.A0C = AnonymousClass10E.A6Q(A0O);
            this.A0E = AnonymousClass8BV.A0G(A0O);
            this.A0D = AnonymousClass8BT.A0I(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0H;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public String getUserInputAmount() {
        return AnonymousClass3Ma.A12(this.A0F);
    }

    public void setup(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel) {
        this.A0G = indiaUpiSecureQrCodeViewModel;
        AFR.A00(this.A03, indiaUpiSecureQrCodeViewModel, 35);
        this.A08.setText(A3H.A02(getContext(), new C21422Ajp(47), getContext().getString(2131897634), "try-again"));
        AFR.A00(this.A08, indiaUpiSecureQrCodeViewModel, 36);
        this.A0F.A04 = findViewById(2131435181);
        AFX.A00(this.A0F, this, 9);
        this.A0F.setErrorTextView(this.A07);
        this.A0F.setOnEditorActionListener(new AGA(this, 3));
        this.A0F.A00 = new C20452ALp(this);
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A0J = AnonymousClass1QE.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A00();
    }

    private void A00() {
        AnonymousClass3MZ.A0D(this).inflate(2131625619, this, true);
        setOrientation(1);
        this.A0A = (QrImageView) findViewById(2131434246);
        this.A05 = AnonymousClass3MW.A0J(this, 2131427576);
        this.A06 = AnonymousClass3MW.A0J(this, 2131430068);
        this.A07 = AnonymousClass3MW.A0J(this, 2131427789);
        this.A02 = AnonymousClass3MW.A0G(this, 2131429770);
        this.A0F = (PaymentAmountInputField) AnonymousClass1HF.A06(this, 2131436638);
        AnonymousClass1KJ A012 = this.A0D.A01("INR");
        PaymentAmountInputField paymentAmountInputField = this.A0F;
        paymentAmountInputField.A0A = A012;
        paymentAmountInputField.A03 = 1;
        AnonymousClass1KN A0H2 = AnonymousClass8BU.A0H(A012, new BigDecimal(this.A0B.A04(AnonymousClass18O.A1E)));
        this.A0F.A0C = new C20867Aaj(getContext(), this.A0C, A012, A0H2, A0H2, A0H2, (C187419fm) null);
        this.A03 = AnonymousClass3MX.A0K(this, 2131427623);
        this.A00 = AnonymousClass1HF.A06(this, 2131436603);
        this.A04 = AnonymousClass8BR.A0A(this, 2131434254);
        this.A08 = C17880vN.A0E(this, 2131434253);
        this.A01 = (FrameLayout) findViewById(2131434187);
    }

    public C25088CWz getQrCode() {
        return this.A09;
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A0J = AnonymousClass1QE.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A00();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0J = AnonymousClass1QE.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A00();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context) {
        super(context);
        A01();
        this.A0J = AnonymousClass1QE.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A00();
    }
}
