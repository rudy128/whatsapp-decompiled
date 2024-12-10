package com.whatsapp.payments.receiver;

import X.A8C;
import X.AGC;
import X.AXS;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass190;
import X.AnonymousClass1K1;
import X.AnonymousClass1QL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C189689je;
import X.C20118A8b;
import X.C20151A9n;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class IndiaUpiPayIntentReceiverActivity extends AnonymousClass91T {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
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
        }
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        int i2;
        int i3;
        if (i == 10000) {
            r2 = AnonymousClass4a6.A00(this);
            r2.A0E(2131893637);
            r2.A0D(2131893638);
            i2 = 2131899286;
            i3 = 42;
        } else if (i != 10001) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass4a6.A00(this);
            r2.A0E(2131893637);
            r2.A0D(2131893639);
            i2 = 2131899286;
            i3 = 43;
        }
        C20151A9n.A00(r2, this, i3, i2);
        r2.A0T(false);
        return r2.create();
    }

    public IndiaUpiPayIntentReceiverActivity(int i) {
        this.A00 = false;
        AGC.A00(this, 12);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1020) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle A09;
        super.onCreate(bundle);
        C189689je r6 = new C189689je(this.A0K);
        if (C18020vd.A05(C18040vf.A02, this.A0E, 10572) && (A09 = AnonymousClass3MY.A09(this)) != null && !A09.getBoolean("launching_upi_intent_from_wa", false) && "android.intent.action.VIEW".equals(getIntent().getAction())) {
            for (ActivityManager.AppTask next : ((ActivityManager) getSystemService("activity")).getAppTasks()) {
                AnonymousClass190 r2 = this.A03;
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = next.getTaskInfo().toString();
                r2.A0G("removing-background-task-for-pay-deeplink", String.format("top activity in the task: %s ", A1a), false);
                next.finishAndRemoveTask();
            }
        }
        C20118A8b A002 = C20118A8b.A00(AnonymousClass8BT.A06(this), "DEEP_LINK");
        if (!(AnonymousClass8BT.A06(this) == null || A002 == null)) {
            AnonymousClass1QL r1 = r6.A00;
            if (r1.A0E()) {
                Uri A06 = AnonymousClass8BT.A06(this);
                String obj = A06.toString();
                if (obj != null && obj.startsWith("upi://mandate")) {
                    if (!A8C.A03(this.A0E, C20118A8b.A00(A06, "SCANNED_QR_CODE"), AXS.A02(this))) {
                        setResult(0);
                    }
                }
                Context applicationContext = getApplicationContext();
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(applicationContext.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity");
                A0A.setData(A06);
                startActivityForResult(A0A, 1020);
                return;
            }
            boolean A0F = r1.A0F();
            int i = SearchActionVerificationClientService.NOTIFICATION_ID;
            if (A0F) {
                i = 10001;
            }
            AnonymousClass4Yv.A01(this, i);
            return;
        }
        finish();
    }

    public IndiaUpiPayIntentReceiverActivity() {
        this(0);
    }
}
