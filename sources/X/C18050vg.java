package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.0vg  reason: invalid class name and case insensitive filesystem */
public abstract class C18050vg {
    public static final void A02(Intent intent) {
        C18070vi.A0d(intent, 0);
        if (!A04(intent)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Intent ");
            sb.append(intent);
            sb.append(" is implicit. For apps targeting API 34+ (Android 14+) implicit broadcasts will NOT be delivered to un-exported internal broadcast receivers. So, if thisbroadcast is meant for an unexported internal receiver make the receiver exported or make the Intent explicit. More information here https://fburl.com/dxdppmde");
            Log.w(sb.toString());
        }
    }

    public static final void A03(Intent intent) {
        C18070vi.A0d(intent, 1);
    }

    public static final boolean A04(Intent intent) {
        C18070vi.A0d(intent, 0);
        String str = intent.getPackage();
        if ((str == null || str.length() == 0) && intent.getComponent() == null) {
            return false;
        }
        return true;
    }

    public static final Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final Activity A01(Context context, Class cls) {
        Activity A00 = A00(context);
        if (A00 == null || !cls.isAssignableFrom(A00.getClass())) {
            return null;
        }
        return A00;
    }
}
