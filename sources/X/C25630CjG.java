package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.CjG  reason: case insensitive filesystem */
public final class C25630CjG {
    public static final C25630CjG A00 = new Object();

    public final String A00(Context context) {
        List A002 = CCQ.A00(context, "com.facebook.stella");
        if (A002 == null && (A002 = CCQ.A00(context, "com.facebook.stella_debug")) == null) {
            return "";
        }
        return C108995ce.A0X(".", A002);
    }
}
