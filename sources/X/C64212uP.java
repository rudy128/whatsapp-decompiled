package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.2uP  reason: invalid class name and case insensitive filesystem */
public class C64212uP implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C203211r A01;
    public final /* synthetic */ C36851oZ A02;

    public C64212uP(ConditionVariable conditionVariable, C203211r r2, C36851oZ r3) {
        this.A01 = r2;
        this.A00 = conditionVariable;
        this.A02 = r3;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.open();
        C203211r r2 = this.A01;
        r2.A03.A01(this.A02);
        r2.A02.A04();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
    }
}
