package X;

import android.content.ContentProviderClient;
import android.database.Cursor;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.9wf  reason: invalid class name and case insensitive filesystem */
public abstract class C197419wf {
    public static final Map A00 = Collections.unmodifiableMap(new C27316Dbn());

    public static final Cursor A00(ContentProviderClient contentProviderClient, C188979iJ r17, Enum enumR, Integer num, String str, C192589oe r21) {
        String str2;
        C192589oe r2 = r21;
        C192509oW r0 = r2.A02;
        try {
            return contentProviderClient.query(r2.A00, r0.A02, r0.A01, C17880vN.A1b((Object) null, str, 2, 1), (String) null);
        } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
            if (!(enumR instanceof AnonymousClass9IX)) {
                return null;
            }
            String[] strArr = new String[6];
            strArr[0] = "resolver_name";
            if (num.intValue() != 0) {
                str2 = "LITE_PROVIDER";
            } else {
                str2 = "LEGACY_PROVIDER";
            }
            strArr[1] = str2;
            strArr[2] = "failure_reason";
            AnonymousClass8BU.A1L(e, strArr);
            strArr[5] = str;
            r17.A00(strArr);
            return null;
        }
    }
}
