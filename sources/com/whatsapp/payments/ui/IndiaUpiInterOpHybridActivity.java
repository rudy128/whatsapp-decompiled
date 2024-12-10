package com.whatsapp.payments.ui;

import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1PM;
import X.AnonymousClass8BU;
import X.AnonymousClass92p;
import X.C20279AEn;
import X.C31041ev;
import android.content.Intent;
import android.os.Bundle;
import java.math.BigDecimal;

public final class IndiaUpiInterOpHybridActivity extends AnonymousClass92p {
    public AnonymousClass1PM A00;
    public C31041ev A01;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1022) {
            super.onActivityResult(i, i2, intent);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2r3, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BigDecimal bigDecimal = new BigDecimal(0);
        String str = this.A0o;
        if (str != null) {
            bigDecimal = new BigDecimal(str);
        }
        AnonymousClass1KJ r2 = AnonymousClass1KL.A0B;
        AnonymousClass1KN A0H = AnonymousClass8BU.A0H(r2, bigDecimal);
        ? obj = new Object();
        obj.A01(A0H);
        obj.A02 = r2;
        A5o(obj.A00(), (C20279AEn) null);
    }
}
