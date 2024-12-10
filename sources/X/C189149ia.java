package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.9ia  reason: invalid class name and case insensitive filesystem */
public final class C189149ia {
    public HashMap A00(String str) {
        String str2;
        int i;
        String str3;
        HashMap A11 = C17880vN.A11();
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                int length = str.length();
                if (i2 >= length) {
                    break;
                }
                int i3 = i2 + 2;
                if (i3 < length) {
                    str2 = str.substring(i2, i3);
                } else {
                    str2 = null;
                }
                i2 += 2;
                int i4 = i2 + 2;
                if (i4 < length) {
                    i = Integer.parseInt(str.substring(i2, i4));
                } else {
                    i = -1;
                }
                if (!(str2 == null || i == -1)) {
                    i2 += 2;
                    int i5 = i2 + i;
                    if (i5 <= length) {
                        str3 = str.substring(i2, i5);
                    } else {
                        str3 = null;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        A11.put(str2, str3);
                        i2 += i;
                    }
                }
            }
        }
        return A11;
    }
}
