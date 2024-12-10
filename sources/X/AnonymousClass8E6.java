package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.8E6  reason: invalid class name */
public final class AnonymousClass8E6 extends C194149rF {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final PowerManager.WakeLock A03;
    public final PowerManager.WakeLock A04;

    public AnonymousClass8E6(ComponentName componentName, Context context) {
        super(componentName);
        this.A02 = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(componentName.getClassName());
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, AnonymousClass000.A0y(":launch", A10));
        this.A03 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(componentName.getClassName());
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, AnonymousClass000.A0y(":run", A102));
        this.A04 = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }
}
