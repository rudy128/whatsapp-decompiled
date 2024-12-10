package com.whatsapp.notification;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass11T;
import X.AnonymousClass1BI;
import X.AnonymousClass3C3;
import X.C000200d;
import X.C17880vN;
import X.C19830z4;
import X.C22931Dv;
import X.C32291gx;
import X.C55412fj;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Locale;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = C000200d.A00(r1.A6X);
                    this.A02 = C000200d.A00(r1.ABl);
                    this.A01 = C000200d.A00(r1.A6W);
                    this.A04 = true;
                }
            }
        }
        if (intent.hasExtra("chat_jid")) {
            long longExtra = intent.getLongExtra("last_message_time", -1);
            String stringExtra = intent.getStringExtra("chat_jid");
            String.format(Locale.US, "%s child notification: chatJid=%s, last_message_time=%d", new Object[]{"messagenotificationdismissedreceiver/onreceive", stringExtra, Long.valueOf(longExtra)});
            C55412fj r3 = (C55412fj) this.A01.get();
            String stringExtra2 = intent.getStringExtra("chat_jid");
            long longExtra2 = intent.getLongExtra("last_message_time", -1);
            try {
                C22931Dv r0 = AnonymousClass1BI.A00;
                AnonymousClass1BI A012 = C22931Dv.A01(stringExtra2);
                r3.A03.put(A012, Long.valueOf(longExtra2));
                r3.A02.CGF(new AnonymousClass3C3(r3, A012, 14, longExtra2));
            } catch (AnonymousClass11T unused) {
                Log.e("messagenotificationdismisshelper/handleDismissIntent: Invalid Jid stored in intent");
            }
        } else {
            String stringExtra3 = intent.getStringExtra("notification_hash");
            C17880vN.A1E(C19830z4.A00(C17880vN.A0K(this.A02)), "notification_hash", stringExtra3);
            String.format("%s summary notification: notification_hash=%s", new Object[]{"messagenotificationdismissedreceiver/onreceive", stringExtra3});
            ((C32291gx) this.A00.get()).A07();
        }
    }

    public MessageNotificationDismissedReceiver(int i) {
        this.A04 = false;
        this.A03 = C17880vN.A0p();
    }

    public MessageNotificationDismissedReceiver() {
        this(0);
    }
}
