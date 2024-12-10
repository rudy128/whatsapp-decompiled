package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.CpN  reason: case insensitive filesystem */
public class C25955CpN {
    public static final Set A06 = C17880vN.A12();
    public Uri A00 = null;
    public C25798CmA A01 = C25798CmA.A04;
    public C24271ByU A02 = C24271ByU.HIGH;
    public C25786Clx A03 = null;
    public C24256ByE A04 = C24256ByE.DEFAULT;
    public C24330BzR A05 = C24330BzR.FULL_FETCH;

    public static boolean A00(Uri uri) {
        Set set = A06;
        if (uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (C17880vN.A0v(it).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }
}
