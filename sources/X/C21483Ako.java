package X;

import android.content.pm.PackageItemInfo;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.Ako  reason: case insensitive filesystem */
public class C21483Ako implements Comparator {
    public static final Set A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        PackageItemInfo packageItemInfo = (PackageItemInfo) obj;
        PackageItemInfo packageItemInfo2 = (PackageItemInfo) obj2;
        String str = packageItemInfo.packageName;
        Set set = BVK.A03;
        if (C180939On.A00(str)) {
            i = A00.contains(str);
        } else {
            i = 2;
        }
        Integer valueOf = Integer.valueOf(i);
        String str2 = packageItemInfo2.packageName;
        if (C180939On.A00(str2)) {
            i2 = A00.contains(str2);
        } else {
            i2 = 2;
        }
        int compareTo = valueOf.compareTo(Integer.valueOf(i2));
        if (compareTo == 0) {
            return packageItemInfo.packageName.compareTo(packageItemInfo2.packageName);
        }
        return compareTo;
    }

    static {
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "com.facebook.lite";
        A1b[1] = "com.facebook.liteqa";
        A00 = C17900vP.A0I("com.instagram.lite", A1b, 2);
    }
}
