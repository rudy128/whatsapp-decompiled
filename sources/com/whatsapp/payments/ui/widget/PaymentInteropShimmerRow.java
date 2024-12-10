package com.whatsapp.payments.ui.widget;

import X.AFR;
import X.AQF;
import X.AW0;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aX;
import X.C161408Db;
import X.C22519BBc;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class PaymentInteropShimmerRow extends C161408Db implements C22519BBc {
    public AW0 A00;
    public AnonymousClass1QS A01;
    public AQF A02;
    public View A03;
    public View A04;

    /* renamed from: A02 */
    public void BDE(AW0 aw0) {
        boolean contains;
        this.A00 = aw0;
        AQF aqf = this.A02;
        String str = aw0.A0K;
        if (TextUtils.isEmpty(str)) {
            contains = false;
        } else {
            contains = aqf.A00.contains(str);
        }
        View view = this.A03;
        if (contains) {
            view.setVisibility(8);
            this.A04.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public void CEO() {
        AW0 aw0 = this.A00;
        if (aw0 != null) {
            BDE(aw0);
        }
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00();
    }

    private void A00() {
        AnonymousClass3MZ.A0D(this).inflate(2131626427, this);
        setOrientation(1);
        this.A03 = findViewById(2131433669);
        this.A04 = findViewById(2131435608);
        AnonymousClass4aX.A0D(AnonymousClass3MW.A0H(this, 2131436367), AnonymousClass3MZ.A02(getContext(), getContext(), 2130970707, 2131102119));
        setOnClickListener(new AFR(this, 40));
    }

    public PaymentInteropShimmerRow(Context context) {
        super(context);
        A01();
        A00();
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
