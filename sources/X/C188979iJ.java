package X;

import java.util.LinkedHashMap;

/* renamed from: X.9iJ  reason: invalid class name and case insensitive filesystem */
public final class C188979iJ {
    public void A00(String... strArr) {
        LinkedHashMap A13 = C17880vN.A13();
        int length = strArr.length;
        if (length % 2 == 0) {
            int i = length - 1;
            int i2 = 0;
            if (0 < i) {
                int i3 = i % 2;
                if (i3 < 0) {
                    i3 += 2;
                }
                int i4 = i3 % 2;
                if (i4 < 0) {
                    i4 += 2;
                }
                i -= i4;
            }
            if (i >= 0) {
                while (true) {
                    String str = strArr[i2];
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    String str3 = strArr[i2 + 1];
                    if (str3 != null) {
                        str2 = str3;
                    }
                    A13.put(str, str2);
                    if (i2 != i) {
                        i2 += 2;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
