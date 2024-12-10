package X;

import android.net.Uri;

/* renamed from: X.6WU  reason: invalid class name */
public abstract class AnonymousClass6WU {
    public static final String A00(String str, String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            C17900vP.A0i("gdrive-util/append-query-parameters/odd number of params - ", AnonymousClass000.A10(), length);
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (int i = 0; i < length; i += 2) {
            buildUpon.appendQueryParameter(strArr[i], strArr[i + 1]);
        }
        return C18070vi.A0H(buildUpon.build());
    }
}
