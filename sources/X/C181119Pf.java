package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.9Pf  reason: invalid class name and case insensitive filesystem */
public abstract class C181119Pf {
    public static C25813CmQ A00(Fragment fragment, C26235CvV cvV, CXY cxy, Map map) {
        Map map2 = map;
        AnonymousClass1FL A1D = fragment.A1D();
        Map emptyMap = Collections.emptyMap();
        SparseArray sparseArray = new SparseArray();
        if (map == null) {
            map2 = C17880vN.A11();
        }
        C25344Ce3.A00(A1D);
        C25344Ce3.A00(cvV);
        C25344Ce3.A00(cxy);
        return new C25813CmQ(A1D, sparseArray, cvV, cxy, map2, emptyMap);
    }
}
