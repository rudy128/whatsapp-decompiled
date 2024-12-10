package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.5hR  reason: invalid class name and case insensitive filesystem */
public abstract class C110885hR extends C19740yt {
    public static View A0A(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C123516Ut.A00(activity, i);
        }
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass000.A0k("ID does not reference a View inside this Activity");
    }

    public static boolean A0C(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (!TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (i < 32) {
                    if (i == 31) {
                        return C123526Uu.A00(activity, str);
                    }
                    if (i >= 23) {
                        return AnonymousClass70Y.A02(activity, str);
                    }
                }
            }
            return false;
        }
        return C123536Uv.A00(activity, str);
    }

    public static void A0B(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet A12 = C17880vN.A12();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = A12.size();
                if (size > 0) {
                    strArr2 = new String[(length - size)];
                    if (size != length) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < length; i4++) {
                            if (!C108965cb.A1Z(A12, i4)) {
                                strArr2[i3] = strArr[i4];
                                i3++;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    strArr2 = strArr;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass70Y.A00(activity, strArr, i);
                    return;
                } else if (activity instanceof AnonymousClass1FK) {
                    C17890vO.A0D().post(new C21470Akb((Object) activity, i, 0, (Object) strArr2));
                    return;
                } else {
                    return;
                }
            } else if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    C17890vO.A1D(A12, i2);
                }
                i2++;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Permission request for permissions ");
                A10.append(Arrays.toString(strArr));
                throw AnonymousClass001.A12(" must not contain null or empty values", A10);
            }
        }
    }
}
