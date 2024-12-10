package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.4HV  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass4HV {
    public static void A00(Activity activity) {
        Intent A0A = C17880vN.A0A();
        A0A.putExtra("has_removed_all_devices", true);
        activity.setResult(-1, A0A);
    }
}
