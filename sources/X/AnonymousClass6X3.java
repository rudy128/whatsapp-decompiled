package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.6X3  reason: invalid class name */
public abstract class AnonymousClass6X3 {
    public static final void A00(Context context, Intent intent) {
        PendingIntent A01 = C1408573i.A01(context, 0, intent, 0);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = C17880vN.A0D();
        }
        extras.putParcelable("_ci_", A01);
        intent.putExtras(extras);
    }
}
