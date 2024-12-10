package X;

import android.content.Intent;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Qi  reason: invalid class name */
public class AnonymousClass8Qi extends A8B {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if ((r2 & r1) != r1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r6, android.content.pm.ComponentInfo r7, X.AnonymousClass8Qi r8, java.lang.String r9) {
        /*
            boolean r0 = r7.exported
            r5 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0039
            X.C18070vi.A0d(r6, r4)     // Catch:{ NameNotFoundException -> 0x001a }
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001a }
            android.content.pm.PermissionInfo r0 = r0.getPermissionInfo(r9, r4)     // Catch:{ NameNotFoundException -> 0x001a }
            X.C18070vi.A0X(r0)     // Catch:{ NameNotFoundException -> 0x001a }
            int r2 = r0.protectionLevel     // Catch:{ NameNotFoundException -> 0x001a }
            goto L_0x0021
        L_0x001a:
            X.9xA r0 = r8.A00
            monitor-enter(r0)
            monitor-exit(r0)
            monitor-enter(r0)
            monitor-exit(r0)
            return r4
        L_0x0021:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0037
            int r1 = X.C180879Oh.A00()
        L_0x002b:
            r0 = r2 & 2
            if (r0 == r5) goto L_0x0032
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0039
        L_0x0032:
            X.9xA r0 = r8.A00
            monitor-enter(r0)
            monitor-exit(r0)
            return r4
        L_0x0037:
            r1 = 3
            goto L_0x002b
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Qi.A01(android.content.Context, android.content.pm.ComponentInfo, X.8Qi, java.lang.String):boolean");
    }

    public static Intent A00(Intent intent, AnonymousClass8Qi r5, List list, boolean z) {
        if (list.isEmpty()) {
            r5.A01.CFI("AccessibleByAnyAppIntentScope", "No matching public components.", (Throwable) null);
            return null;
        }
        if (z) {
            if (list.size() > 1) {
                BA8 ba8 = r5.A01;
                synchronized (r5.A00) {
                }
                C180889Oi.A00(intent, ba8);
                ArrayList A14 = AnonymousClass000.A14(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PackageItemInfo packageItemInfo = (PackageItemInfo) it.next();
                    Intent intent2 = new Intent(intent);
                    A8B.A06(intent2, packageItemInfo);
                    intent2.setPackage(packageItemInfo.packageName);
                    A14.add(intent2);
                }
                return A8B.A02(A14);
            }
            A8B.A06(intent, (PackageItemInfo) C108955ca.A0p(list));
        }
        BA8 ba82 = r5.A01;
        synchronized (r5.A00) {
        }
        C180889Oi.A00(intent, ba82);
        return intent;
    }
}
