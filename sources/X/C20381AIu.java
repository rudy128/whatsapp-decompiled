package X;

import android.util.Log;

/* renamed from: X.AIu  reason: case insensitive filesystem */
public class C20381AIu implements BA8 {
    public void CFL() {
        Log.e("Security-LocalReporter", "Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
    }

    public void CFI(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
