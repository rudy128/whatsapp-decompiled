package com.whatsapp.status.notifications;

import X.AnonymousClass10E;
import X.C17880vN;
import X.C18070vi;
import X.C49002Ou;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class StatusNotificationDismissReceiver extends BroadcastReceiver {
    public C49002Ou A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = AnonymousClass10E.AK0(AnonymousClass10E.A10(context).AJU);
                    this.A02 = true;
                }
            }
        }
        int intExtra = intent.getIntExtra("notification_id", C18070vi.A15(context, intent) ? 1 : 0);
        String stringExtra = intent.getStringExtra("notification_tag");
        if (this.A00 != null) {
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (intExtra == 89) {
                C49002Ou.A03.remove(stringExtra);
            } else if (intExtra == 90) {
                C49002Ou.A03.clear();
            }
        } else {
            C18070vi.A11("statusReactionsNotificationsHelper");
            throw null;
        }
    }

    public StatusNotificationDismissReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public StatusNotificationDismissReceiver() {
        this(0);
    }
}
