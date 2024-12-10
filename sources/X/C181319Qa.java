package X;

import com.whatsapp.util.Log;

/* renamed from: X.9Qa  reason: invalid class name and case insensitive filesystem */
public abstract class C181319Qa {
    public static final String A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 300) {
                return str;
            }
            int i = parseInt / 100;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(i);
            A10.append('.');
            A10.append(parseInt - (i * 100));
            return A10.toString();
        } catch (NumberFormatException e) {
            Log.e("convertDataApiVersionToRequiredFormatForDataChannelRequest() -- failed to parse data api version", e);
            return str;
        }
    }
}
