package com.whatsapp.payments.ui;

import X.AFP;
import X.AFT;
import X.AGD;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass91K;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C171858sO;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C196079uQ;
import X.C198769ys;
import X.C21447AkE;
import X.C36401np;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class IndiaUpiIncentivesValuePropsActivity extends AnonymousClass91K {
    public C36401np A00;
    public boolean A01;

    public void A51() {
        this.A03 = 1;
        super.A51();
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            AnonymousClass91U.A1Z(r1, this);
            this.A00 = AnonymousClass3MY.A0e(r1);
        }
    }

    public IndiaUpiIncentivesValuePropsActivity(int i) {
        this.A01 = false;
        AGD.A00(this, 4);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i;
        View.OnClickListener afp;
        super.onCreate(bundle);
        setContentView(2131625594);
        A4s(2131893788, 2131433707);
        C198769ys A02 = this.A0T.A02();
        if (A02 == null || (str = A02.A0F) == null || (str2 = A02.A0B) == null) {
            Log.e("PAY: IndiaUpiIncentivesValuePropsActivity/PaymentIncentiveOfferInfo is null or has null items in it");
            finish();
            return;
        }
        TextView A0L = AnonymousClass3MX.A0L(this, 2131431600);
        TextEmojiLabel A0H = AnonymousClass8BR.A0H(this, 2131431599);
        A0L.setText(str);
        String str3 = A02.A0C;
        if (!TextUtils.isEmpty(str3)) {
            String[] strArr = new String[1];
            AnonymousClass8BW.A17(this.A03, str3, strArr, 0);
            Runnable[] runnableArr = {C21447AkE.A00(this, 30)};
            SpannableString A04 = this.A00.A04(A0H.getContext(), C17890vO.A0R(this, str2, 1, 0, 2131891316), runnableArr, new String[]{"incentive-blurb-cashback-terms"}, strArr);
            AnonymousClass3Ma.A1K(A0H, this.A08);
            AnonymousClass3Ma.A1L(this.A0E, A0H);
            A0H.setText(A04);
        } else {
            A0H.setText(str2);
        }
        View findViewById = findViewById(2131431596);
        View findViewById2 = findViewById(2131433628);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131431598);
        C196079uQ BWi = AnonymousClass8BU.A0U(this.A0Q).BWi();
        if (BWi != null) {
            if (C18020vd.A05(C18040vf.A02, BWi.A07, 979)) {
                afp = new AFT(this, BWi, 12);
                A0L2.setOnClickListener(afp);
                C171858sO A07 = this.A0S.A07(0, (Integer) null, "incentive_value_prop", this.A0g);
                A07.A01 = Boolean.valueOf(AnonymousClass8BR.A1P(this));
                AZ6.A02(A07, this);
                this.A0Q.A09();
            }
        }
        if (AnonymousClass8BR.A1P(this)) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            A0L2.setText(2131894026);
            i = 2;
        } else {
            findViewById.setVisibility(0);
            AnonymousClass8BS.A10(this, AnonymousClass3MX.A0I(this, 2131431597), 2131102102);
            findViewById2.setVisibility(0);
            A0L2.setText(2131891317);
            i = 3;
        }
        afp = new AFP(this, i);
        A0L2.setOnClickListener(afp);
        C171858sO A072 = this.A0S.A07(0, (Integer) null, "incentive_value_prop", this.A0g);
        A072.A01 = Boolean.valueOf(AnonymousClass8BR.A1P(this));
        AZ6.A02(A072, this);
        this.A0Q.A09();
    }

    public IndiaUpiIncentivesValuePropsActivity() {
        this(0);
    }
}
