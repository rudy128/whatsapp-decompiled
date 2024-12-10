package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Executor;

/* renamed from: X.0yt  reason: invalid class name and case insensitive filesystem */
public abstract class C19740yt {
    public static int A00(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass1YK.A00(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int A01(Context context, String str) {
        C30701eN.A00(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        if (new C27311Vp(context).A01()) {
            return 0;
        }
        return -1;
    }

    public static Context A02(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C19750yu.A00(context);
        }
        return null;
    }

    public static Display A05(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AnonymousClass2SP.A00(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Object A06(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass1YK.A01(context, cls);
        }
        String str = (String) AnonymousClass2VM.A00.get(cls);
        if (str != null) {
            return context.getSystemService(str);
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:54|(2:56|57)|58|59) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00b5 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x00b5=Splitter:B:58:0x00b5, B:45:0x009d=Splitter:B:45:0x009d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(android.content.Context r8, int r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0051
            java.lang.Object r0 = X.AnonymousClass2SK.A00(r8)
            if (r0 == 0) goto L_0x004e
            android.os.LocaleList r0 = X.AnonymousClass2SJ.A00(r0)
            X.1HD r4 = X.AnonymousClass1HD.A01(r0)
        L_0x0014:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 32
            if (r3 > r0) goto L_0x003a
            X.1Jj r2 = r4.A00
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x003a
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>(r0)
            r0 = 24
            if (r3 < r0) goto L_0x003f
            X.C60222nb.A01(r1, r4)
        L_0x0036:
            android.content.Context r8 = r8.createConfigurationContext(r1)
        L_0x003a:
            java.lang.String r0 = r8.getString(r9)
            return r0
        L_0x003f:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0036
            r0 = 0
            java.util.Locale r0 = r2.BME(r0)
            r1.setLocale(r0)
            goto L_0x0036
        L_0x004e:
            X.1HD r4 = X.AnonymousClass1HD.A01
            goto L_0x0014
        L_0x0051:
            java.lang.Object r7 = X.AnonymousClass2VL.A00
            monitor-enter(r7)
            java.lang.String r6 = ""
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x00a8 }
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            java.lang.String r0 = "UTF-8"
            r5.setInput(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            int r4 = r5.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
        L_0x0069:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            r0 = 1
            if (r1 == r0) goto L_0x0098
            r0 = 3
            if (r1 != r0) goto L_0x007a
            int r0 = r5.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            if (r0 <= r4) goto L_0x0098
            goto L_0x0069
        L_0x007a:
            r0 = 4
            if (r1 == r0) goto L_0x0069
            java.lang.String r1 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            java.lang.String r0 = "locales"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = "application_locales"
            r0 = 0
            java.lang.String r6 = r5.getAttributeValue(r0, r1)     // Catch:{ IOException | XmlPullParserException -> 0x0091 }
            goto L_0x0098
        L_0x0091:
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r0 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x00af }
        L_0x0098:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ IOException -> 0x009d }
        L_0x009d:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a6
            r8.deleteFile(r3)     // Catch:{ all -> 0x00b6 }
        L_0x00a6:
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            goto L_0x00a9
        L_0x00a8:
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
        L_0x00a9:
            X.1HD r4 = X.AnonymousClass1HD.A02(r6)
            goto L_0x0014
        L_0x00af:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19740yt.A07(android.content.Context, int):java.lang.String");
    }

    public static Executor A08(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass2SO.A00(context);
        }
        return new C27133DVu(new Handler(context.getMainLooper()));
    }

    public static void A09(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass2SN.A00(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static ColorStateList A03(Context context, int i) {
        return AnonymousClass1YH.A02(context.getTheme(), context.getResources(), i);
    }

    public static Drawable A04(Context context, int i) {
        return C24261Jm.A00(context, i);
    }
}
