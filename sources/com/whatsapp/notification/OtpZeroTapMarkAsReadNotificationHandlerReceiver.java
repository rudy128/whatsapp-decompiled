package com.whatsapp.notification;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass7Pq;
import X.C000200d;
import X.C17880vN;
import X.C18070vi;
import X.C32791hl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class OtpZeroTapMarkAsReadNotificationHandlerReceiver extends BroadcastReceiver {
    public C32791hl A00;
    public AnonymousClass10I A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (C32791hl) r1.A2t.get();
                    this.A02 = C000200d.A00(r1.A3w);
                    this.A03 = C000200d.A00(r1.A7q);
                    this.A01 = (AnonymousClass10I) r1.AC1.get();
                    this.A05 = true;
                }
            }
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_remote_jid");
            String stringExtra2 = intent.getStringExtra("extra_message_key_id");
            if (stringExtra != null && stringExtra2 != null) {
                AnonymousClass10I r2 = this.A01;
                if (r2 != null) {
                    r2.CGF(new AnonymousClass7Pq(this, stringExtra, stringExtra2, 15));
                } else {
                    C18070vi.A11("waWorkers");
                    throw null;
                }
            }
        }
    }

    public OtpZeroTapMarkAsReadNotificationHandlerReceiver(int i) {
        this.A05 = false;
        this.A04 = C17880vN.A0p();
    }

    public OtpZeroTapMarkAsReadNotificationHandlerReceiver() {
        this(0);
    }
}
