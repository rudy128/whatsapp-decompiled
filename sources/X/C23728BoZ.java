package X;

import android.util.SparseArray;
import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.BoZ  reason: case insensitive filesystem */
public final class C23728BoZ extends C25754ClP {
    public final SparseArray A00 = BE6.A0Q();

    public void A03(DOZ doz, DFL dfl, DFL dfl2, Object obj) {
        View view = (View) obj;
        int i = dfl.A05;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            ((C25141CZr) sparseArray.get(i)).A01(view, doz, dfl, dfl2);
        }
        super.A03(doz, dfl, dfl2, obj);
    }

    public void A04(DOZ doz, DFL dfl, DFL dfl2, Object obj) {
        View view = (View) obj;
        int i = dfl.A05;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            ((C25141CZr) sparseArray.get(i)).A02(view, doz, dfl, dfl2);
        }
        super.A04(doz, dfl, dfl2, obj);
    }

    public Object A02(DOZ doz, DFL dfl) {
        int i = dfl.A05;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            return ((C25141CZr) sparseArray.get(i)).A00(doz);
        }
        return super.A02(doz, dfl);
    }

    public C23728BoZ(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C25141CZr cZr = (C25141CZr) it.next();
            this.A00.put(cZr.A00, cZr);
        }
    }
}
