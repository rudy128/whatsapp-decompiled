package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Qh  reason: invalid class name */
public class AnonymousClass8Qh extends A8B {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    public static Intent A00(Context context, Intent intent, AnonymousClass8Qh r7, List list) {
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            ApplicationInfo applicationInfo = componentInfo.applicationInfo;
            if (applicationInfo != null) {
                if (applicationInfo.packageName.equals(context.getPackageName())) {
                    A14.add(componentInfo);
                }
            }
        }
        if (A14.isEmpty()) {
            r7.A01.CFI("InternalIntentScope", "No matching internal components", (Throwable) null);
            return null;
        }
        Collections.sort(A14, new Object());
        A8B.A06(intent, (PackageItemInfo) AnonymousClass8BS.A0Y(A14));
        return intent;
    }
}
