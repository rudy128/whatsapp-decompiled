package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: X.3D1  reason: invalid class name */
public class AnonymousClass3D1 implements Comparator {
    public final int A00;

    public AnonymousClass3D1(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C55142fH r8 = (C55142fH) obj;
                C55142fH r9 = (C55142fH) obj2;
                RecyclerView recyclerView = r8.A03;
                if (AnonymousClass000.A1X(recyclerView) == AnonymousClass000.A1X(r9.A03)) {
                    boolean z = r8.A04;
                    if (z == r9.A04) {
                        int i = r9.A02 - r8.A02;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = r8.A00 - r9.A00;
                        if (i2 == 0) {
                            return 0;
                        }
                        return i2;
                    } else if (z) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                } else {
                    return -1;
                }
            case 1:
                return ((AnonymousClass1XT) obj).A02 - ((AnonymousClass1XT) obj2).A02;
            case 2:
                return (int) (((C41761x1) obj).A05 - ((C41761x1) obj2).A05);
            default:
                C88344Zh r82 = (C88344Zh) obj;
                C88344Zh r92 = (C88344Zh) obj2;
                long j = r82.A01;
                if ((j == 0 && r92.A01 == 0) || (j != 0 && r92.A01 != 0)) {
                    return (r92.A00 > r82.A00 ? 1 : (r92.A00 == r82.A00 ? 0 : -1));
                }
                if (j == 0) {
                    return -1;
                }
                return 1;
        }
    }
}
