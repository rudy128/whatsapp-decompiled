package X;

import android.net.Uri;

/* renamed from: X.9R4  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass9R4 {
    public static boolean A00(Uri uri, BDQ bdq) {
        String BNS;
        String queryParameter = uri.getQueryParameter(bdq.BOC());
        if (queryParameter == null || queryParameter.length() <= 0 || (BNS = bdq.BNS()) == null || !AnonymousClass1YF.A0Y(BNS, queryParameter, false)) {
            return false;
        }
        return true;
    }
}
