package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.1XS  reason: invalid class name */
public class AnonymousClass1XS implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C37811qA r1 = (C37811qA) ((View) obj).getLayoutParams();
        C37811qA r3 = (C37811qA) ((View) obj2).getLayoutParams();
        boolean z = r1.A04;
        if (z == r3.A04) {
            return r1.A03 - r3.A03;
        }
        if (z) {
            return 1;
        }
        return -1;
    }
}
