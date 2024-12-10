package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.9w5  reason: invalid class name and case insensitive filesystem */
public abstract class C197059w5 {
    public static final String A00 = AnonymousClass8BS.A0m("WakeLocks");

    public static final PowerManager.WakeLock A00(Context context, String str) {
        boolean A16 = C18070vi.A16(context, str);
        Object systemService = context.getApplicationContext().getSystemService("power");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String A1H = AnonymousClass001.A1H("WorkManager: ", str, AnonymousClass000.A10());
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(A16 ? 1 : 0, A1H);
        synchronized (C197449wi.A00) {
            C197449wi.A01.put(newWakeLock, A1H);
        }
        C18070vi.A0X(newWakeLock);
        return newWakeLock;
    }
}
