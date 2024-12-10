package com.whatsapp.inorganicnotifications;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.C108965cb;
import X.C108975cc;
import X.C133946pl;
import X.C17880vN;
import X.C18070vi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class InorganicNotificationDismissedReceiver extends BroadcastReceiver {
    public AnonymousClass00H A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    AnonymousClass10G.AVc(AnonymousClass10E.A10(context), this);
                    this.A02 = true;
                }
            }
        }
        C18070vi.A0d(context, 0);
        if (intent != null && (stringExtra = intent.getStringExtra("inorganic_notification_id")) != null && (stringExtra2 = intent.getStringExtra("inorganic_notification_type")) != null) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                String stringExtra3 = intent.getStringExtra("inorganic_notification_promotion_id");
                ((C133946pl) r0.get()).A01(C108965cb.A0Q(intent, AnonymousClass1BI.A00, "inorganic_notification_chat_jid"), Long.valueOf(C108975cc.A06(intent, "inorganic_notification_thread_count")), stringExtra, stringExtra2, stringExtra3, 2);
                return;
            }
            C18070vi.A11("inorganicNotificationLogger");
            throw null;
        }
    }

    public InorganicNotificationDismissedReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public InorganicNotificationDismissedReceiver() {
        this(0);
    }
}
