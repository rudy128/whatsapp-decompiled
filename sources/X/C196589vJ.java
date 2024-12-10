package X;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;

/* renamed from: X.9vJ  reason: invalid class name and case insensitive filesystem */
public abstract class C196589vJ {
    public static String A01(Context context, C20079A6f a6f) {
        String str = a6f.A07;
        if (a6f.A08() && TextUtils.isEmpty(str)) {
            return context.getString(2131887116);
        }
        if (a6f.A07() && !TextUtils.isEmpty(str)) {
            return str.trim();
        }
        int i = 2131887161;
        if (a6f.A05()) {
            i = 2131887159;
        }
        return C17890vO.A0R(context, str, 1, 0, i);
    }

    public static String A00(Context context, Address address, float f) {
        String thoroughfare = address.getThoroughfare();
        if (((double) f) <= 200.0d && !TextUtils.isEmpty(thoroughfare)) {
            String subThoroughfare = address.getSubThoroughfare();
            if (TextUtils.isEmpty(subThoroughfare)) {
                return thoroughfare;
            }
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(thoroughfare, subThoroughfare, A1b);
            return context.getString(2131887017, A1b);
        } else if (!TextUtils.isEmpty(address.getSubLocality())) {
            return address.getSubLocality();
        } else {
            if (!TextUtils.isEmpty(address.getLocality())) {
                return address.getLocality();
            }
            if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                return address.getSubAdminArea();
            }
            return null;
        }
    }
}
