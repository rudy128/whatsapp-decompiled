package com.whatsapp.payments.ui;

import X.A0R;
import X.A27;
import X.A5B;
import X.AGC;
import X.AXR;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass90R;
import X.AnonymousClass91E;
import X.AnonymousClass96M;
import X.C010105w;
import X.C108975cc;
import X.C108985cd;
import X.C137116uw;
import X.C166918eJ;
import X.C17900vP;
import X.C191419mZ;
import X.C196779vd;
import X.C20751AXg;
import X.C29621ca;
import X.C63662tU;
import X.C63932tv;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilDyiReportActivity extends AnonymousClass91E {
    public AXR A00;
    public C20751AXg A01;
    public A27 A02;
    public A0R A03;
    public boolean A04;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            this.A0N = AnonymousClass3MY.A0e(r2);
            this.A03 = C108985cd.A0N(r3);
            this.A0G = (A5B) r2.A9T.get();
            this.A0M = C108975cc.A0O(r3);
            this.A08 = AnonymousClass10E.A6Q(r3);
            this.A0L = AnonymousClass8BT.A0V(r3);
            this.A0E = AnonymousClass3MZ.A0z(r3);
            C166918eJ.A03(r3, r2, AnonymousClass3MZ.A0n(r3), this);
            this.A00 = (AXR) r2.A6y.get();
            this.A02 = AnonymousClass8BU.A0S(r3);
            this.A01 = AnonymousClass1K1.A1M(A002);
            this.A03 = AnonymousClass1K1.A1T(A002);
        }
    }

    public void A4d(String str) {
        FingerprintBottomSheet fingerprintBottomSheet;
        String str2 = this.A0Q;
        String str3 = str;
        if (str2.equals("business")) {
            AnonymousClass96M r3 = this.A0K;
            r3.A0W(new C191419mZ((AnonymousClass1FY) null, (PinBottomSheetDialogFragment) null, r3, (String) null, -1), (C29621ca) null, str3);
        } else if (!str2.equals("personal")) {
            C17900vP.A0e("PAY: DyiReportBaseActivity/dyiReportButtonContainer::onClick - This payment account type is not supported. PaymentAccount = ", str2, AnonymousClass000.A10());
        } else {
            PinBottomSheetDialogFragment A002 = C196779vd.A00();
            if (Build.VERSION.SDK_INT >= 23) {
                fingerprintBottomSheet = FingerprintBottomSheet.A0A.A00();
            } else {
                fingerprintBottomSheet = null;
            }
            this.A0K.A0U(this, fingerprintBottomSheet, new AnonymousClass90R(this.A02, this.A05, this.A0B, this.A0H, this, str3), A002, str3, "DYIREPORT", this.A0X);
        }
    }

    public Dialog onCreateDialog(int i) {
        C010105w A012 = this.A03.A01((Bundle) null, this, i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public BrazilDyiReportActivity(int i) {
        this.A04 = false;
        AGC.A00(this, 15);
    }

    public BrazilDyiReportActivity() {
        this(0);
    }
}
