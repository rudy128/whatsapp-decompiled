package X;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: X.CnR  reason: case insensitive filesystem */
public abstract class C25862CnR {
    public static void A01(View view, E3a e3a, String[] strArr) {
        view.setOnReceiveContentListener(strArr, new C26563D4d(e3a));
    }

    public static C25997CqD A00(View view, C25997CqD cqD) {
        ContentInfo A02 = cqD.A02();
        ContentInfo performReceiveContent = view.performReceiveContent(A02);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == A02) {
            return cqD;
        }
        return C25997CqD.A01(performReceiveContent);
    }

    public static String[] A02(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
