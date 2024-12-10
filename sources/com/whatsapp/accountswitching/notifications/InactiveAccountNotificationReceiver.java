package com.whatsapp.accountswitching.notifications;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass19K;
import X.AnonymousClass1YF;
import X.AnonymousClass8BR;
import X.C000100c;
import X.C02800Fk;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class InactiveAccountNotificationReceiver extends BroadcastReceiver {
    public AnonymousClass11C A00;
    public AnonymousClass19K A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10G.AVS(((AnonymousClass10E) ((C000100c) C02800Fk.A00(context))).Ao8.A00, this);
                    this.A03 = true;
                }
            }
        }
        C18070vi.A0h(context, intent);
        if (C18070vi.A18(intent.getAction(), "com.whatsapp.accountswitching.inactiveaccount.IgnoreCall")) {
            int intExtra = intent.getIntExtra("inactiveAccountNotificationId", -1);
            String stringExtra = intent.getStringExtra("inactiveAccountNotificationTag");
            if (intExtra != -1 && stringExtra != null && !AnonymousClass1YF.A0T(stringExtra)) {
                AnonymousClass11C r0 = this.A00;
                if (r0 != null) {
                    NotificationManager A07 = r0.A07();
                    C17960vV.A07(A07);
                    C18070vi.A0X(A07);
                    A07.cancel(stringExtra, intExtra);
                    AnonymousClass19K r02 = this.A01;
                    if (r02 != null) {
                        AnonymousClass8BR.A0D(r02).A09(stringExtra);
                        return;
                    }
                    str = "workManagerLazy";
                } else {
                    str = "systemServices";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
    }

    public InactiveAccountNotificationReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public InactiveAccountNotificationReceiver() {
        this(0);
    }
}
