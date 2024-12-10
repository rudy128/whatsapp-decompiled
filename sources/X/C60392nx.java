package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2nx  reason: invalid class name and case insensitive filesystem */
public abstract class C60392nx {
    public static final void A00(Context context, Intent intent) {
        C18070vi.A0d(context, 0);
        intent.setPackage(context.getPackageName());
        Intent A0A = C17880vN.A0A();
        A0A.setComponent(new ComponentName(context.getPackageName(), "FakeClass"));
        intent.putExtra("authentication_token", C1408573i.A00(context.getApplicationContext(), 0, A0A, 0));
    }

    public static final boolean A01(Context context, Intent intent) {
        C18070vi.A0d(context, 0);
        if (intent.hasExtra("authentication_token")) {
            try {
                Intent A0A = C17880vN.A0A();
                A0A.setComponent(new ComponentName(context.getPackageName(), "FakeClass"));
                return C18070vi.A18(C1408573i.A00(context.getApplicationContext(), 0, A0A, 0), (PendingIntent) intent.getParcelableExtra("authentication_token"));
            } catch (Exception e) {
                Log.e("conversation/unable to verify intent", e);
            }
        }
        return false;
    }
}
