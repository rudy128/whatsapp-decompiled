package X;

import android.content.Context;
import android.os.PowerManager;

public final class CR1 {
    public PowerManager.WakeLock A00;
    public boolean A01;
    public boolean A02;
    public final PowerManager A03;

    public CR1(Context context) {
        this.A03 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
