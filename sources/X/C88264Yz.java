package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.whatsapp.util.Log;

/* renamed from: X.4Yz  reason: invalid class name and case insensitive filesystem */
public abstract class C88264Yz {
    public static int A00(Context context) {
        int i;
        int i2;
        Point BPP;
        try {
            if (context instanceof C008603v) {
                context = A02((C008603v) context);
            }
            if ((context instanceof C23191Fb) && (BPP = ((C23191Fb) context).BPP()) != null) {
                i = BPP.x;
                i2 = BPP.y;
                return Math.min(i, i2);
            }
        } catch (NullPointerException e) {
            Log.e("ConversationRowWidths/getMaxRowWidth/null view while getting row width", e);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        i = displayMetrics.widthPixels;
        i2 = displayMetrics.heightPixels;
        return Math.min(i, i2);
    }

    public static int A01(Context context, int i) {
        C17960vV.A0C(AnonymousClass000.A1O(i));
        int A00 = A00(context);
        C17960vV.A0C(AnonymousClass000.A1O(i));
        return Math.round((((float) A00) * ((float) i)) / 100.0f);
    }

    public static Context A02(C008603v r1) {
        Context baseContext = r1.getBaseContext();
        if (baseContext instanceof Activity) {
            return baseContext;
        }
        if (baseContext instanceof C008603v) {
            return A02((C008603v) baseContext);
        }
        return null;
    }
}
