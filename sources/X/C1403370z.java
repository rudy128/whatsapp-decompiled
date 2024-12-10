package X;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.70z  reason: invalid class name and case insensitive filesystem */
public abstract class C1403370z {
    public static final Uri A00 = Uri.parse("");
    public static final Uri A01 = Uri.parse("*");

    public static PackageInfo A00() {
        if (Build.VERSION.SDK_INT >= 26) {
            return AnonymousClass6VN.A00();
        }
        try {
            return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.PackageInfo A01(android.content.Context r4) {
        /*
            android.content.pm.PackageInfo r0 = A00()
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            r3 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
            r2 = 0
            r0 = 23
            if (r1 > r0) goto L_0x001e
            java.lang.String r0 = "android.webkit.WebViewFactory"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
            java.lang.String r0 = "getWebViewPackageName"
            java.lang.Object r1 = X.C108995ce.A0V(r1, r3, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
            goto L_0x002c
        L_0x001e:
            java.lang.String r0 = "android.webkit.WebViewUpdateService"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
            java.lang.String r0 = "getCurrentWebViewPackageName"
            java.lang.Object r1 = X.C108995ce.A0V(r1, r3, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0036 }
        L_0x002c:
            if (r1 == 0) goto L_0x0036
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r1, r2)     // Catch:{  }
        L_0x0036:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403370z.A01(android.content.Context):android.content.pm.PackageInfo");
    }
}
