package androidx.work.impl.foreground;

import X.A5Z;
import X.BA1;
import X.C161088Bj;
import X.C17890vO;
import X.C20352AHi;
import X.C70823Cq;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;

public class SystemForegroundService extends C161088Bj implements BA1 {
    public static SystemForegroundService A04;
    public static final String A05 = A5Z.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public C20352AHi A02;
    public boolean A03;

    public void CNp(int i, Notification notification, int i2) {
        this.A01.post(new C70823Cq((Object) this, i, (Object) notification, i2, 0));
    }

    public void stop() {
        this.A03 = true;
        A5Z.A00().A03(A05, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        A04 = null;
        stopSelf();
    }

    private void A00() {
        this.A01 = C17890vO.A0D();
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C20352AHi aHi = new C20352AHi(getApplicationContext());
        this.A02 = aHi;
        if (aHi.A01 != null) {
            A5Z.A00().A04(C20352AHi.A0A, "A callback already exists.");
        } else {
            aHi.A01 = this;
        }
    }

    public void onCreate() {
        super.onCreate();
        A04 = this;
        A00();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A03) {
            A5Z.A00().A05(A05, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A02.A01(intent);
        return 3;
    }
}
