package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.74E  reason: invalid class name */
public class AnonymousClass74E {
    public static volatile C123396Uh A00;
    public static volatile List A01;

    public static void A06(Context context, C139656zE r4) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            if ((r4.A01 & 1) != 0) {
                return;
            }
            if (i < 26) {
                if (A08(context)) {
                    Intent A0G = C108945cZ.A0G("com.android.launcher.action.INSTALL_SHORTCUT");
                    r4.A02(A0G);
                    context.sendBroadcast(A0G);
                    return;
                }
                return;
            }
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(r4.A01(), (IntentSender) null);
    }

    public static Intent A01(Context context, C139656zE r3) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26 || (intent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(r3.A01())) == null) {
            intent = C17880vN.A0A();
        }
        r3.A02(intent);
        return intent;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.6Uh] */
    public static C123396Uh A02(Context context) {
        if (A00 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    A00 = (C123396Uh) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, AnonymousClass74E.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                } catch (Exception unused) {
                }
            }
            if (A00 == null) {
                A00 = new Object();
            }
        }
        return A00;
    }

    public static List A03(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList A14 = AnonymousClass000.A14(dynamicShortcuts);
            for (ShortcutInfo r1 : dynamicShortcuts) {
                A14.add(new AnonymousClass71Y(context, r1).A00());
            }
            return A14;
        }
        try {
            return A02(context).A00();
        } catch (Exception unused) {
            return AnonymousClass000.A13();
        }
    }

    public static List A04(Context context) {
        Bundle bundle;
        String string;
        if (A01 == null) {
            ArrayList A13 = AnonymousClass000.A13();
            PackageManager packageManager = context.getPackageManager();
            Intent A0G = C108945cZ.A0G("androidx.core.content.pm.SHORTCUT_LISTENER");
            A0G.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(A0G, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        Class.forName(string, false, AnonymousClass74E.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                        A13.add((Object) null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (A01 == null) {
                A01 = A13;
            }
        }
        return A01;
    }

    public static void A05(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        A02(context).A01();
        Iterator it = A04(context).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("onAllShortcutsRemoved");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(android.content.Context r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L_0x0013:
            java.lang.String r4 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r0 = X.C19740yt.A01(r5, r4)
            r3 = 0
            if (r0 != 0) goto L_0x004c
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r0 = "com.android.launcher.action.INSTALL_SHORTCUT"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.permission
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004a
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x002e
        L_0x004a:
            r0 = 1
            return r0
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74E.A08(android.content.Context):boolean");
    }

    public static int A00(Context context) {
        C28111Yx.A02(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r6 >= 25) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(android.content.Context r7, java.util.List<X.C139656zE> r8) {
        /*
            r8.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 32
            if (r1 > r0) goto L_0x0028
            java.util.ArrayList r3 = X.C17880vN.A10(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            X.6zE r1 = (X.C139656zE) r1
            int r0 = r1.A01
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0011
            r3.remove(r1)
            goto L_0x0011
        L_0x0027:
            r8 = r3
        L_0x0028:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r6 > r0) goto L_0x0075
            java.util.ArrayList r0 = X.C17880vN.A10(r8)
            java.util.Iterator r5 = r0.iterator()
        L_0x0036:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r4 = r5.next()
            X.6zE r4 = (X.C139656zE) r4
            androidx.core.graphics.drawable.IconCompat r2 = r4.A09
            if (r2 == 0) goto L_0x006d
            int r3 = r2.A02
            r1 = 6
            if (r3 == r1) goto L_0x004f
            r0 = 4
            if (r3 == r0) goto L_0x004f
            goto L_0x0036
        L_0x004f:
            java.io.InputStream r0 = r2.A0D(r7)
            if (r0 == 0) goto L_0x006d
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0)
            if (r2 == 0) goto L_0x006d
            if (r3 != r1) goto L_0x0068
            r1 = 5
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r1)
            r0.A06 = r2
        L_0x0065:
            r4.A09 = r0
            goto L_0x0036
        L_0x0068:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r2)
            goto L_0x0065
        L_0x006d:
            r8.remove(r4)
            goto L_0x0036
        L_0x0071:
            r0 = 25
            if (r6 < r0) goto L_0x0091
        L_0x0075:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r8.iterator()
        L_0x007d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.6zE r0 = (X.C139656zE) r0
            android.content.pm.ShortcutInfo r0 = r0.A01()
            r2.add(r0)
            goto L_0x007d
        L_0x0091:
            X.6Uh r0 = A02(r7)
            r0.A02(r8)
            java.util.List r0 = A04(r7)
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00be
            r1.next()
            java.lang.String r0 = "onShortcutAdded"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00b0:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r7.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.addDynamicShortcuts(r2)
            if (r0 != 0) goto L_0x0091
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74E.A07(android.content.Context, java.util.List):void");
    }
}
