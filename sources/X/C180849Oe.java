package X;

import android.content.pm.PackageInfo;
import java.util.HashSet;

/* renamed from: X.9Oe  reason: invalid class name and case insensitive filesystem */
public abstract class C180849Oe {
    public static HashSet A00(PackageInfo packageInfo) {
        int[] iArr;
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null || (iArr = packageInfo.requestedPermissionsFlags) == null || strArr.length != iArr.length) {
            return C17880vN.A12();
        }
        HashSet A12 = C17880vN.A12();
        int i = 0;
        while (true) {
            String[] strArr2 = packageInfo.requestedPermissions;
            if (i >= strArr2.length) {
                return A12;
            }
            String str = strArr2[i];
            if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                A12.add(str);
            }
            i++;
        }
    }
}
