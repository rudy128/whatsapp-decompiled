package com.whatsapp.notification;

import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1KB;
import X.AnonymousClass1W6;
import X.AnonymousClass70P;
import X.C146597Pw;
import X.C17880vN;
import X.C18070vi;
import X.C32791hl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class MessageOtpNotificationBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass1KB A00;
    public C32791hl A01;
    public AnonymousClass70P A02;
    public AnonymousClass1W6 A03;
    public AnonymousClass10I A04;
    public final Object A05;
    public volatile boolean A06;

    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        Context context2 = context;
        if (!this.A06) {
            synchronized (this.A05) {
                if (!this.A06) {
                    AnonymousClass10E r2 = AnonymousClass10E.A10(context).AJU;
                    this.A01 = (C32791hl) r2.A2t.get();
                    this.A03 = (AnonymousClass1W6) r2.A3w.get();
                    this.A00 = (AnonymousClass1KB) r2.A4b.get();
                    this.A02 = (AnonymousClass70P) r2.A7q.get();
                    this.A04 = (AnonymousClass10I) r2.AC1.get();
                    this.A06 = true;
                }
            }
        }
        C18070vi.A0h(context, intent);
        String stringExtra2 = intent.getStringExtra("extra_remote_jid");
        if (stringExtra2 != null && (stringExtra = intent.getStringExtra("extra_message_key_id")) != null) {
            AnonymousClass10I r0 = this.A04;
            if (r0 != null) {
                r0.CGF(new C146597Pw(this, context2, stringExtra2, stringExtra, 8));
            } else {
                C18070vi.A11("waWorkers");
                throw null;
            }
        }
    }

    public MessageOtpNotificationBroadcastReceiver(int i) {
        this.A06 = false;
        this.A05 = C17880vN.A0p();
    }

    public MessageOtpNotificationBroadcastReceiver() {
        this(0);
    }
}
