package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DOZ implements E6Q {
    public final Context A00;
    public final SparseArray A01;
    public final CXY A02;
    public final boolean A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap(4));
    public final Map A05 = new HashMap(4);

    public static Object A00(DOZ doz, int i) {
        return doz.A01.get(i);
    }

    public Object A02(E6A e6a, DFL dfl, int i) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i2 = dfl.A04;
        synchronized (this) {
            Map map = this.A05;
            valueOf = Integer.valueOf(i2);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = C17880vN.A0p();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A04;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i);
            if (obj2 == null) {
                obj2 = e6a.BkI(this, dfl);
            }
            sparseArray.put(i, obj2);
        }
        return obj2;
    }

    public boolean BeR() {
        return this.A03;
    }

    public DOZ(Context context, SparseArray sparseArray, CXY cxy) {
        this.A00 = context;
        this.A02 = cxy;
        this.A03 = ((DNI) cxy.A01).A03;
        this.A01 = sparseArray;
    }

    public Object A01(int i) {
        Object A002 = A00(this, i);
        if (A002 != null) {
            return A002;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Null value associated with key: ");
        throw AnonymousClass000.A0s(AnonymousClass000.A0y(this.A00.getResources().getResourceEntryName(i), A10));
    }
}
