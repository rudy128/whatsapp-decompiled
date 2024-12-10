package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.0Fk  reason: invalid class name and case insensitive filesystem */
public abstract class C02800Fk {
    public static Object A00(Context context) {
        Application A00 = AnonymousClass00g.A00(context.getApplicationContext());
        boolean z = A00 instanceof AnonymousClass009;
        Object[] objArr = {A00.getClass()};
        if (z) {
            return ((AnonymousClass009) A00).generatedComponent();
        }
        throw AnonymousClass000.A0k(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }
}
