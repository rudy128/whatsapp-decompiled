package androidx.work.impl.background.systemalarm;

import X.A5Z;
import X.B4O;
import X.C161088Bj;
import X.C20351AHh;
import android.content.Intent;

public class SystemAlarmService extends C161088Bj implements B4O {
    public static final String A02 = A5Z.A01("SystemAlarmService");
    public C20351AHh A00;
    public boolean A01;

    public void onCreate() {
        super.onCreate();
        C20351AHh aHh = new C20351AHh(this);
        this.A00 = aHh;
        if (aHh.A02 != null) {
            A5Z.A00().A04(C20351AHh.A0B, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            aHh.A02 = this;
        }
        this.A01 = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = true;
        C20351AHh aHh = this.A00;
        A5Z.A00().A03(C20351AHh.A0B, "Destroying SystemAlarmDispatcher");
        aHh.A04.A03(aHh);
        aHh.A02 = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A01) {
            A5Z.A00().A05(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C20351AHh aHh = this.A00;
            A5Z A002 = A5Z.A00();
            String str = C20351AHh.A0B;
            A002.A03(str, "Destroying SystemAlarmDispatcher");
            aHh.A04.A03(aHh);
            aHh.A02 = null;
            C20351AHh aHh2 = new C20351AHh(this);
            this.A00 = aHh2;
            if (aHh2.A02 != null) {
                A5Z.A00().A04(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                aHh2.A02 = this;
            }
            this.A01 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A00.A02(intent, i2);
        return 3;
    }
}
