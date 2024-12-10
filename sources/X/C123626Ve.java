package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.6Ve  reason: invalid class name and case insensitive filesystem */
public abstract class C123626Ve {
    public static final Intent A00(Intent intent) {
        C18070vi.A0d(intent, 0);
        Intent flags = new Intent(intent).setComponent((ComponentName) null).setFlags(intent.getFlags() & -4);
        C18070vi.A0X(flags);
        return flags;
    }
}
