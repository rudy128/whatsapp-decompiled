package X;

import android.util.Log;

/* renamed from: X.DFy  reason: case insensitive filesystem */
public final class C26842DFy implements BA8 {
    public void CFI(String str, String str2, Throwable th) {
        C18070vi.A0d(str2, 1);
        StringBuilder A11 = AnonymousClass000.A11(str2);
        A11.append(" [");
        A11.append(str);
        Log.e("WearableSecureContext", C17890vO.A0c(A11, ']'), th);
    }

    public void CFL() {
        Log.e("WearableSecureContext", "Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
    }
}
