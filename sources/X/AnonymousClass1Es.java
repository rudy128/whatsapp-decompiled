package X;

import android.content.SharedPreferences;

/* renamed from: X.1Es  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass1Es {
    public static int A00(AnonymousClass18H r2) {
        SharedPreferences sharedPreferences = (SharedPreferences) r2.A00.getValue();
        C18070vi.A0X(sharedPreferences);
        return sharedPreferences.getInt("wam_migrated_version", 0);
    }
}
