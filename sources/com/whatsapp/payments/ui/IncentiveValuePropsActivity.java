package com.whatsapp.payments.ui;

import X.AGC;
import X.AH1;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DT;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass8FQ;
import X.C003401n;
import X.C137116uw;
import X.C188889iA;
import X.C19740yt;
import X.C198179xu;
import X.C20087A6p;
import X.C20112A7u;
import X.C20337AGt;
import X.C36401np;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

public class IncentiveValuePropsActivity extends AnonymousClass1FY {
    public View A00;
    public View A01;
    public Button A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public WaTextView A05;
    public AnonymousClass8FQ A06;
    public C188889iA A07;
    public C36401np A08;
    public boolean A09;

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A08 = AnonymousClass3MY.A0e(r1);
            this.A07 = (C188889iA) r1.AEY.get();
        }
    }

    public IncentiveValuePropsActivity(int i) {
        this.A09 = false;
        AGC.A00(this, 36);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625594);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(2131626292, A0G, false);
        C72463Mc.A0y(this, textView, 2130970928, 2131102377);
        textView.setText(2131893788);
        A0G.addView(textView);
        C003401n A0K = AnonymousClass3MY.A0K(this, A0G);
        if (A0K != null) {
            AnonymousClass8BU.A17(A0K, 2131893788);
            AnonymousClass8BX.A0y(this, A0G);
            AnonymousClass8BY.A0d(this, A0K, C19740yt.A00(this, 2131102007));
            A0K.A0Y(false);
        }
        this.A05 = (WaTextView) findViewById(2131431600);
        this.A03 = AnonymousClass8BR.A0H(this, 2131431599);
        this.A00 = findViewById(2131431596);
        this.A01 = findViewById(2131433628);
        this.A02 = (Button) findViewById(2131431598);
        WaImageView waImageView = (WaImageView) findViewById(2131431597);
        this.A04 = waImageView;
        AnonymousClass8BS.A10(this, waImageView, 2131102102);
        PaymentIncentiveViewModel A0M = AnonymousClass8BX.A0M(this);
        AnonymousClass1DT r2 = A0M.A01;
        C198179xu.A00(r2, A0M.A06.A01(), (Throwable) null, 0);
        C20337AGt.A00(this, r2, 5);
        AnonymousClass8FQ r0 = (AnonymousClass8FQ) AnonymousClass8BR.A0C(new AH1(this.A07, 4), this).A00(AnonymousClass8FQ.class);
        this.A06 = r0;
        C20337AGt.A00(this, r0.A00, 6);
        AnonymousClass8FQ r4 = this.A06;
        String A0o = AnonymousClass8BV.A0o(this);
        C20112A7u A022 = C20112A7u.A02();
        A022.A08("is_payment_account_setup", r4.A01.A0D());
        C20087A6p.A03(A022, AnonymousClass8BT.A0U(r4.A02), "incentive_value_prop", A0o);
    }

    public IncentiveValuePropsActivity() {
        this(0);
    }
}
