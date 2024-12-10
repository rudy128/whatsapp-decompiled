package X;

import android.app.Notification;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.6Fx  reason: invalid class name */
public abstract class AnonymousClass6Fx extends C120876Fz {
    public AnonymousClass1DC A00;
    public AnonymousClass00H A01;
    public int A02 = -1;
    public boolean A03;
    public final String A04;
    public final boolean A05;

    public void onCreate() {
        this.A03 = false;
        super.onCreate();
    }

    public boolean A05() {
        int i;
        if (this.A05) {
            i = -1;
        } else {
            i = this.A02;
        }
        boolean stopSelfResult = stopSelfResult(i);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A04);
        C17900vP.A0n("/Stop service success:", A10, stopSelfResult);
        return stopSelfResult;
    }

    public boolean A06(Notification notification, Integer num, int i, int i2) {
        this.A02 = i;
        try {
            if (!AnonymousClass112.A0A() || num == null) {
                startForeground(i2, notification);
            } else {
                startForeground(i2, notification, num.intValue());
            }
            if (!this.A03) {
                this.A03 = true;
                if (Build.VERSION.SDK_INT >= 26) {
                    ((C139916ze) this.A01.get()).A01(this);
                }
            }
            return true;
        } catch (IllegalStateException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to start foreground service ");
            Log.w(AnonymousClass000.A0y(this.A04, A10), e);
            A05();
            return false;
        }
    }

    public AnonymousClass6Fx(String str, boolean z) {
        this.A04 = str;
        this.A05 = z;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03 = false;
        this.A02 = -1;
    }
}
