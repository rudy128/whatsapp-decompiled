package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;

public class DEX implements EBS {
    public static final Map A01 = Collections.emptyMap();
    public final SparseArray A00 = BE6.A0Q();

    public DEX(C24331BzS bzS, C24331BzS bzS2, C25028CUf cUf, E9B e9b, boolean z, boolean z2) {
        A00(EBS.A0W, bzS);
        A00(EBS.A0b, bzS2);
        A00(EBS.A0Z, e9b);
        A00(EBS.A0F, cUf);
        A00(EBS.A0K, false);
        A00(EBS.A0X, false);
        A00(EBS.A0L, Boolean.valueOf(z));
        A00(EBS.A05, Boolean.valueOf(z2));
    }

    public void A00(C25525ChN chN, Object obj) {
        this.A00.put(chN.A00, obj);
    }

    public Object BMB(C25525ChN chN) {
        Object obj = this.A00.get(chN.A00);
        if (obj == null) {
            return chN.A01;
        }
        return obj;
    }
}
