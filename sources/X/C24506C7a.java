package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.C7a  reason: case insensitive filesystem */
public abstract class C24506C7a {
    public static final C25643CjW A00(Context context) {
        try {
            PackageManager.Property property = context.getPackageManager().getProperty("android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED", context.getPackageName());
            C18070vi.A0X(property);
            if (property.isBoolean()) {
                if (property.getBoolean()) {
                    return C25643CjW.A01;
                }
                return C25643CjW.A03;
            }
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return C25643CjW.A02;
    }
}
