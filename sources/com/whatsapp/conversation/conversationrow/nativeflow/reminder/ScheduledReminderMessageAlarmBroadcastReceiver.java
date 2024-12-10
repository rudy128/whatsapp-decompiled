package com.whatsapp.conversation.conversationrow.nativeflow.reminder;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass121;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1PQ;
import X.AnonymousClass205;
import X.AnonymousClass3CI;
import X.AnonymousClass4aU;
import X.C000200d;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27301Vn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class ScheduledReminderMessageAlarmBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass1M9 A00;
    public AnonymousClass1PM A01;
    public AnonymousClass11P A02;
    public C27301Vn A03;
    public C18000vb A04;
    public AnonymousClass122 A05;
    public AnonymousClass121 A06;
    public C18030ve A07;
    public AnonymousClass1PQ A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public final Object A0E;
    public volatile boolean A0F;

    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        Bundle extras;
        Context context2 = context;
        if (!this.A0F) {
            synchronized (this.A0E) {
                if (!this.A0F) {
                    AnonymousClass10E r2 = AnonymousClass10E.A10(context).AJU;
                    this.A07 = (C18030ve) r2.A04.get();
                    this.A00 = (AnonymousClass1M9) r2.A2f.get();
                    this.A05 = (AnonymousClass122) r2.A2y.get();
                    this.A06 = (AnonymousClass121) r2.A2y.get();
                    this.A0A = C000200d.A00(r2.A3w);
                    this.A0B = C000200d.A00(r2.A5R);
                    this.A0C = C000200d.A00(r2.A9W);
                    this.A0D = C000200d.A00(r2.A9i);
                    this.A08 = (AnonymousClass1PQ) r2.AAn.get();
                    this.A02 = (AnonymousClass11P) r2.AAv.get();
                    this.A01 = (AnonymousClass1PM) r2.ABM.get();
                    this.A03 = (C27301Vn) r2.A9A.get();
                    this.A09 = (AnonymousClass10I) r2.AC1.get();
                    this.A04 = (C18000vb) r2.ABz.get();
                    this.A0F = true;
                }
            }
        }
        C18070vi.A0d(context, 0);
        C18030ve r22 = this.A07;
        if (r22 == null) {
            str = "abProps";
        } else if (C18020vd.A05(C18040vf.A02, r22, 5075)) {
            AnonymousClass1BI r6 = null;
            if (intent != null) {
                str2 = intent.getAction();
            } else {
                str2 = null;
            }
            if (C18070vi.A18(str2, "scheduled_reminder_message_broadcast_action") && (extras = intent.getExtras()) != null) {
                long j = extras.getLong("scheduled_time_in_ms", -1);
                if (j >= 0) {
                    AnonymousClass205 A022 = AnonymousClass4aU.A02(intent);
                    if (A022 != null) {
                        r6 = A022.A00;
                    }
                    if (this.A02 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        AnonymousClass10I r0 = this.A09;
                        if (r0 != null) {
                            r0.CGF(new AnonymousClass3CI(context2, this, r6, A022, currentTimeMillis, j));
                            return;
                        }
                        str = "waWorkers";
                    } else {
                        str = "time";
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public ScheduledReminderMessageAlarmBroadcastReceiver(int i) {
        this.A0F = false;
        this.A0E = C17880vN.A0p();
    }

    public ScheduledReminderMessageAlarmBroadcastReceiver() {
        this(0);
    }
}
