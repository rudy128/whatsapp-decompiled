package X;

import android.content.Context;
import android.os.UserManager;

/* renamed from: X.0wK  reason: invalid class name and case insensitive filesystem */
public abstract class C18390wK {
    public static boolean A00(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
