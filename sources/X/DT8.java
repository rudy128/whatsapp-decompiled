package X;

import android.view.View;
import java.util.List;

public final class DT8 implements Runnable {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ List A02;

    public DT8(DOZ doz, DFL dfl, List list) {
        this.A02 = list;
        this.A01 = dfl;
        this.A00 = doz;
    }

    public final void run() {
        String obj;
        int i = -1;
        for (Object next : this.A02) {
            DFL dfl = this.A01;
            if (next == null) {
                obj = null;
            } else if (next instanceof String) {
                obj = (String) next;
            } else {
                obj = next.toString();
            }
            DFL A002 = DNW.A00(dfl, new C26965DNn(obj), 0);
            if (A002 == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Component with server id: ");
                A10.append(next);
                C25913CoX.A00(this.A00, "AccessibilityUtils", AnonymousClass000.A0y(" not found in hierarchy.", A10), (Throwable) null);
            } else {
                View A06 = A002.A06(this.A00);
                if (A06 != null) {
                    AnonymousClass1HF.A0r(A06, true);
                    if (A06.getId() == -1) {
                        A06.setId(View.generateViewId());
                    }
                    if (i != -1) {
                        A06.setAccessibilityTraversalAfter(i);
                    }
                    i = A06.getId();
                }
            }
        }
    }
}
