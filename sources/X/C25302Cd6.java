package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;

/* renamed from: X.Cd6  reason: case insensitive filesystem */
public abstract class C25302Cd6 {
    public static final void A00(DOZ doz, DFL dfl, List list) {
        String obj;
        View A06;
        C18070vi.A0d(list, 2);
        if (Build.VERSION.SDK_INT >= 22 && AnonymousClass000.A1a(list)) {
            for (Object next : list) {
                if (next == null) {
                    obj = null;
                } else if (next instanceof String) {
                    obj = (String) next;
                } else {
                    obj = next.toString();
                }
                DFL A00 = DNW.A00(dfl, new C26965DNn(obj), 0);
                if (A00 != null && (A06 = A00.A06(doz)) != null) {
                    A06.setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }

    public static final void A01(DOZ doz, DFL dfl, List list) {
        C18070vi.A0d(list, 2);
        if (Build.VERSION.SDK_INT >= 22 && AnonymousClass000.A1a(list)) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).post(new DT8(doz, dfl, list));
                return;
            }
            throw C17880vN.A0g();
        }
    }
}
