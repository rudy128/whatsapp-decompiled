package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.8va  reason: invalid class name and case insensitive filesystem */
public abstract class C173698va extends AnonymousClass99y {
    public AnonymousClass11C A00;
    public AnonymousClass118 A01;
    public C189489jK A02;
    public AnonymousClass10I A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String str;
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        if (action.equals("com.whatsapp.migration.START")) {
            AnonymousClass118 r0 = this.A01;
            if (r0 != null) {
                Context context = r0.A00;
                AnonymousClass11C r02 = this.A00;
                if (r02 != null) {
                    C39571tI.A00(context, r02);
                    C189489jK r03 = this.A02;
                    if (r03 != null) {
                        startForeground(56, r03.A00());
                        AnonymousClass10I r2 = this.A03;
                        if (r2 != null) {
                            r2.CGN(new C21458AkP(this, intent, 4));
                        }
                        str = "waWorkers";
                    } else {
                        str = "chatTransferNotificationManager";
                    }
                } else {
                    str = "systemServices";
                }
            } else {
                str = "waContext";
            }
            C18070vi.A11(str);
            throw null;
        } else if (action.equals("com.whatsapp.migration.STOP")) {
            AnonymousClass10I r22 = this.A03;
            if (r22 != null) {
                r22.CGF(new C21356Ail(this, 6));
            }
            str = "waWorkers";
            C18070vi.A11(str);
            throw null;
        }
        return 1;
    }

    public void onDestroy() {
        super.onDestroy();
        if (AnonymousClass112.A02()) {
            stopForeground(1);
        } else {
            stopForeground(true);
        }
    }
}
