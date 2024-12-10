package X;

import android.net.Uri;

/* renamed from: X.6US  reason: invalid class name */
public abstract class AnonymousClass6US {
    public boolean A01(Uri uri) {
        String host;
        if (this instanceof C114195qJ) {
            C114195qJ r0 = (C114195qJ) this;
            if (uri == null || (host = uri.getHost()) == null) {
                return false;
            }
            String str = r0.A00[0];
            if (host.equals(str) || host.endsWith(AnonymousClass001.A1H(".", str, AnonymousClass000.A10()))) {
                return true;
            }
            return false;
        } else if (this instanceof C114185qI) {
            C114185qI r02 = (C114185qI) this;
            if (uri != null) {
                return r02.A00.contains(uri.getScheme());
            }
            return false;
        } else {
            C114175qH r03 = (C114175qH) this;
            if (uri == null) {
                return false;
            }
            for (AnonymousClass6US A01 : r03.A00) {
                if (!A01.A01(uri)) {
                    return false;
                }
            }
            return true;
        }
    }
}
