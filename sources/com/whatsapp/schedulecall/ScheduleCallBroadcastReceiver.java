package com.whatsapp.schedulecall;

import X.A8I;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass121;
import X.AnonymousClass190;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1Nb;
import X.AnonymousClass1TC;
import X.AnonymousClass1VW;
import X.AnonymousClass2FD;
import X.C000200d;
import X.C146487Ph;
import X.C17880vN;
import X.C18000vb;
import X.C27081Uq;
import X.C27201Vd;
import X.C27301Vn;
import X.C35311m1;
import X.C52602bB;
import X.C57992jy;
import X.DTY;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScheduleCallBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass190 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1TC A02;
    public C57992jy A03;
    public AnonymousClass11P A04;
    public C18000vb A05;
    public AnonymousClass121 A06;
    public C27081Uq A07;
    public C35311m1 A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public final Object A0C;
    public volatile boolean A0D;

    public void onReceive(Context context, Intent intent) {
        boolean z;
        AnonymousClass190 r1;
        String str;
        if (!this.A0D) {
            synchronized (this.A0C) {
                if (!this.A0D) {
                    AnonymousClass10G A10 = AnonymousClass10E.A10(context);
                    AnonymousClass10E r2 = A10.AJU;
                    this.A04 = (AnonymousClass11P) r2.AAv.get();
                    this.A01 = (AnonymousClass1KB) r2.A4b.get();
                    this.A00 = (AnonymousClass190) r2.A31.get();
                    this.A09 = (AnonymousClass10I) r2.AC1.get();
                    this.A05 = (C18000vb) r2.ABz.get();
                    this.A08 = (C35311m1) r2.A9e.get();
                    this.A07 = (C27081Uq) r2.A9g.get();
                    this.A0A = C000200d.A00(r2.A9f);
                    this.A06 = (AnonymousClass121) r2.A2y.get();
                    this.A0B = C000200d.A00(A10.A4M);
                    this.A02 = (AnonymousClass1TC) r2.A1j.get();
                    C27201Vd r5 = (C27201Vd) r2.A2j.get();
                    this.A03 = new C57992jy((AnonymousClass1VW) r2.A2d.get(), (AnonymousClass1M9) r2.A2f.get(), r5, (AnonymousClass118) r2.ABY.get(), (C27301Vn) r2.A9A.get(), (C18000vb) r2.ABz.get(), (AnonymousClass1Nb) r2.A2E.get());
                    this.A0D = true;
                }
            }
        }
        Intent intent2 = intent;
        String action = intent2.getAction();
        long longExtra = intent2.getLongExtra("extra_message_row_id", -1);
        boolean z2 = false;
        if (longExtra == -1) {
            r1 = this.A00;
            str = "scheduled-call-broadcast-receiver-no-row-id";
        } else if (action == null) {
            r1 = this.A00;
            str = "scheduled-call-broadcast-receiver-null-action";
        } else {
            switch (action.hashCode()) {
                case 181260125:
                    z = action.equals("action_schedule_call_advance_alert");
                    break;
                case 348840125:
                    z = action.equals("action_schedule_call");
                    break;
                case 1085261791:
                    if (action.equals("action_schedule_call_timeout")) {
                        this.A09.CGN(new C146487Ph(this, longExtra, 22));
                        return;
                    }
                    return;
                default:
                    return;
            }
            if (z) {
                long longExtra2 = intent2.getLongExtra("extra_scheduled_call_timestamp_ms", -1);
                if (longExtra2 == -1) {
                    r1 = this.A00;
                    str = "scheduled-call-broadcast-receiver-no-scheduled-timestamp";
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - longExtra2;
                    A8I.A00(this.A05, currentTimeMillis);
                    A8I.A00(this.A05, longExtra2);
                    if (j > 900000) {
                        z2 = true;
                    }
                    boolean equals = "action_schedule_call".equals(action);
                    AnonymousClass10I r0 = this.A09;
                    if (equals) {
                        r0.CGN(new DTY(this, 6, longExtra, z2));
                        AnonymousClass2FD r12 = new AnonymousClass2FD();
                        r12.A01 = Long.valueOf(j);
                        ((C52602bB) this.A0B.get()).A00.CC7(r12);
                        return;
                    }
                    r0.CGN(new DTY(this, 5, longExtra, z2));
                    return;
                }
            } else {
                return;
            }
        }
        r1.A0G(str, (String) null, false);
    }

    public ScheduleCallBroadcastReceiver(int i) {
        this.A0D = false;
        this.A0C = C17880vN.A0p();
    }

    public ScheduleCallBroadcastReceiver() {
        this(0);
    }
}
