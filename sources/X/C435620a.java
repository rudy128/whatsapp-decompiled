package X;

import android.app.ActivityManager;
import android.os.Looper;

/* renamed from: X.20a  reason: invalid class name and case insensitive filesystem */
public final class C435620a implements AnonymousClass1Bh {
    public static final C435620a A00 = new Object();

    public void BJ9(C223419n r4) {
        C18070vi.A0d(r4, 0);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        r4.A00(1, "process_priority", Long.valueOf((long) runningAppProcessInfo.importance));
    }

    public final void A00(AnonymousClass19T r5, int i) {
        r5.markerAnnotate(i, "thread_priority", Thread.currentThread().getPriority());
        boolean z = false;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        }
        r5.markerAnnotate(i, "thread_ui", z);
        r5.Bit(this, i);
    }

    public String BU9() {
        return "process_priority";
    }
}
