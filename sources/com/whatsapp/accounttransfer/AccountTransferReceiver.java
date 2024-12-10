package com.whatsapp.accounttransfer;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1YF;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C41371wF;
import X.C70613Bu;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public final class AccountTransferReceiver extends BroadcastReceiver {
    public AnonymousClass11C A00;
    public AnonymousClass10I A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        KeyguardManager A06;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (AnonymousClass11C) r1.AAp.get();
                    this.A01 = (AnonymousClass10I) r1.AC1.get();
                    this.A03 = true;
                }
            }
        }
        boolean A16 = C18070vi.A16(context, intent);
        String action = intent.getAction();
        C17900vP.A0f("AccountTransferReceiver/onReceive/action=", action, AnonymousClass000.A10());
        if (action == null || AnonymousClass1YF.A0T(action) != A16) {
            AnonymousClass11C r2 = this.A00;
            if (r2 == null) {
                str = "systemServices";
            } else if (Build.VERSION.SDK_INT < 23 || (A06 = r2.A06()) == null || !A06.isDeviceSecure() || C41371wF.A00(context) != 0) {
                str2 = "AccountTransferReceiver/onReceive/disabled";
            } else if (C18070vi.A18(action, "com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
                AnonymousClass10I r22 = this.A01;
                if (r22 != null) {
                    r22.CGF(new C70613Bu(context, 29));
                    return;
                }
                str = "waWorkers";
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
        str2 = "AccountTransferReceiver/onReceive/action is empty";
        Log.i(str2);
    }

    public AccountTransferReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public AccountTransferReceiver() {
        this(0);
    }
}
