package X;

import android.os.PowerManager;

/* renamed from: X.9Rv  reason: invalid class name and case insensitive filesystem */
public abstract class C181789Rv {
    public static final PowerManager.WakeLock A00(PowerManager powerManager, String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A14(A10, "com.whatsapp");
        return powerManager.newWakeLock(i, AnonymousClass000.A0y(str, A10));
    }
}
