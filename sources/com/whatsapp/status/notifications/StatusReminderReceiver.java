package com.whatsapp.status.notifications;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1E5;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1MW;
import X.AnonymousClass205;
import X.AnonymousClass3C5;
import X.AnonymousClass4aU;
import X.C000200d;
import X.C146527Pl;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C21454AkL;
import X.C24886COe;
import X.C25241Nl;
import X.C27301Vn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class StatusReminderReceiver extends BroadcastReceiver {
    public AnonymousClass1KB A00;
    public AnonymousClass11P A01;
    public C27301Vn A02;
    public C19830z4 A03;
    public AnonymousClass1MW A04;
    public C18030ve A05;
    public AnonymousClass18K A06;
    public C25241Nl A07;
    public AnonymousClass1LU A08;
    public C24886COe A09;
    public AnonymousClass10I A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public final Object A0D;
    public final String A0E;
    public volatile boolean A0F;

    public static final boolean A00(StatusReminderReceiver statusReminderReceiver, int i, long j) {
        if (j == 0) {
            return true;
        }
        AnonymousClass11P r0 = statusReminderReceiver.A01;
        if (r0 == null) {
            C18070vi.A11("time");
            throw null;
        } else if (AnonymousClass11P.A01(r0) - j < C17890vO.A03(i)) {
            return false;
        } else {
            return true;
        }
    }

    public final C24886COe A01() {
        C24886COe cOe = this.A09;
        if (cOe != null) {
            return cOe;
        }
        C18070vi.A11("statusSharedPreferences");
        throw null;
    }

    public final void A02(String str, int i) {
        AnonymousClass10I r2 = this.A0A;
        if (r2 != null) {
            r2.CGF(new C21454AkL(this, str, i, 12));
        } else {
            C18070vi.A11("waWorkers");
            throw null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A0F) {
            synchronized (this.A0D) {
                if (!this.A0F) {
                    AnonymousClass10E r2 = AnonymousClass10E.A10(context).AJU;
                    this.A05 = (C18030ve) r2.A04.get();
                    this.A0B = C000200d.A00(r2.A0K);
                    this.A0C = C000200d.A00(r2.A3w);
                    this.A00 = (AnonymousClass1KB) r2.A4b.get();
                    this.A04 = (AnonymousClass1MW) r2.A7u.get();
                    this.A09 = (C24886COe) r2.AAH.get();
                    this.A01 = (AnonymousClass11P) r2.AAv.get();
                    this.A08 = (AnonymousClass1LU) r2.ABd.get();
                    this.A02 = (C27301Vn) r2.A9A.get();
                    this.A03 = (C19830z4) r2.ABl.get();
                    this.A0A = (AnonymousClass10I) r2.AC1.get();
                    this.A06 = (AnonymousClass18K) r2.A9B.get();
                    this.A07 = (C25241Nl) r2.ABr.get();
                    this.A0F = true;
                }
            }
        }
        C18070vi.A0h(context, intent);
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -617305060) {
                if (hashCode != -373801894) {
                    if (hashCode == 141180535 && action.equals("com.whatsapp.alarm.STATUS_REMINDER_NOTIFICATION")) {
                        AnonymousClass10I r22 = this.A0A;
                        if (r22 != null) {
                            r22.CGF(new AnonymousClass3C5(this, intent, context, 47));
                            return;
                        }
                        str = "waWorkers";
                    } else {
                        return;
                    }
                } else if (action.equals("com.whatsapp.status.STATUS_REMINDER_CLICKED")) {
                    AnonymousClass205 A022 = AnonymousClass4aU.A02(intent);
                    if (this.A08 != null) {
                        Intent A0j = AnonymousClass1LU.A0j(context, AnonymousClass1E5.A00, true, false, false);
                        if (A022 != null) {
                            AnonymousClass4aU.A00(A0j, A022);
                        }
                        A0j.addFlags(268435456);
                        AnonymousClass1KB r23 = this.A00;
                        if (r23 != null) {
                            r23.A0J(new C146527Pl(context, A0j, 49));
                            A02(this.A0E, 3);
                            return;
                        }
                        str = "globalUI";
                    } else {
                        str = "waIntents";
                    }
                } else {
                    return;
                }
            } else if (action.equals("com.whatsapp.status.STATUS_REMINDER_DISMISSED")) {
                AnonymousClass11P r0 = this.A01;
                if (r0 != null) {
                    AnonymousClass11P.A01(r0);
                    intent.getLongExtra("EXTRA_TIMEOUT_TIMESTAMP_MS", 0);
                    A02(this.A0E, 2);
                    return;
                }
                str = "time";
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public StatusReminderReceiver(int i) {
        this.A0F = false;
        this.A0D = C17880vN.A0p();
    }

    public StatusReminderReceiver() {
        this(0);
        String A0Q = C17890vO.A0Q();
        C18070vi.A0X(A0Q);
        this.A0E = A0Q;
    }
}
