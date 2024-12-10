package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.CUf  reason: case insensitive filesystem */
public class C25028CUf {
    public int[] A00(List list) {
        int A0I;
        Iterator it = list.iterator();
        int[] iArr = null;
        int i = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            if (iArr2[1] >= 30000 && (A0I = BE6.A0I(iArr2)) < i) {
                iArr = iArr2;
                i = A0I;
            }
        }
        if (iArr == null) {
            return (int[]) list.get(AnonymousClass3MX.A02(list, 1));
        }
        return iArr;
    }
}
