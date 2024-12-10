package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.72a  reason: invalid class name and case insensitive filesystem */
public abstract class C1405772a {
    public static final AtomicInteger A00 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static String A01(Context context, Bundle bundle, String str) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(str)) {
                        if (notificationManager.getNotificationChannel(str) == null) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Notification Channel requested (");
                            A10.append(str);
                            Log.w("FirebaseMessaging", AnonymousClass000.A0y(") has not been created by the app. Manifest configuration, or default, value will be used.", A10));
                        }
                        return str;
                    }
                    str = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(str)) {
                        if (notificationManager.getNotificationChannel(str) == null) {
                            str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                        }
                        return str;
                    }
                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                    Log.w("FirebaseMessaging", str2);
                    str = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel(str) == null) {
                        int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = context.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel(str, string, 3));
                    }
                    return str;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean A02(Resources resources, int i) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                if (resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable) {
                    Log.e("FirebaseMessaging", AnonymousClass001.A1I("Adaptive icons cannot be used in notifications. Ignoring icon id: ", AnonymousClass000.A10(), i));
                    return false;
                }
            } catch (Resources.NotFoundException unused) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Couldn't find resource ");
                A10.append(i);
                Log.e("FirebaseMessaging", AnonymousClass000.A0y(", treating it as an invalid icon", A10));
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03c9, code lost:
        if (r2 == 0) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        if (r7 != 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0220, code lost:
        if (A02(r10, r7) == false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0222, code lost:
        r7 = 17301651;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x030b A[SYNTHETIC, Splitter:B:131:0x030b] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x034f A[SYNTHETIC, Splitter:B:142:0x034f] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0227 A[SYNTHETIC, Splitter:B:93:0x0227] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024e A[SYNTHETIC, Splitter:B:99:0x024e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C126896dT A00(android.content.Context r11, X.AnonymousClass72P r12) {
        /*
            android.content.pm.PackageManager r2 = r11.getPackageManager()
            java.lang.String r1 = r11.getPackageName()
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r0 == 0) goto L_0x0025
            android.os.Bundle r3 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0015:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r1)
        L_0x0025:
            android.os.Bundle r3 = android.os.Bundle.EMPTY
        L_0x0027:
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r12.A05(r0)
            java.lang.String r0 = A01(r11, r3, r0)
            java.lang.String r9 = r11.getPackageName()
            android.content.res.Resources r10 = r11.getResources()
            android.content.pm.PackageManager r8 = r11.getPackageManager()
            X.73t r6 = new X.73t
            r6.<init>(r11, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r1 = r12.A04(r10, r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0051
            r6.A0E(r1)
        L_0x0051:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r1 = r12.A04(r10, r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0063
            r6.A0D(r1)
            X.C17900vP.A0L(r6, r1)
        L_0x0063:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r4 = r12.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r2 = "FirebaseMessaging"
            if (r0 != 0) goto L_0x01f6
            java.lang.String r0 = "drawable"
            int r7 = r10.getIdentifier(r4, r0, r9)
            if (r7 == 0) goto L_0x01d1
            boolean r0 = A02(r10, r7)
            if (r0 == 0) goto L_0x01d1
        L_0x007f:
            android.app.Notification r5 = r6.A08
            r5.icon = r7
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r4 = r12.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r4 = r12.A05(r0)
        L_0x0095:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01ca
            java.lang.String r0 = "raw"
            int r0 = r10.getIdentifier(r4, r0, r9)
            if (r0 == 0) goto L_0x01ca
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "android.resource://"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "/raw/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x00c1:
            if (r0 == 0) goto L_0x00c6
            r6.A0A(r0)
        L_0x00c6:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r1 = r12.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0141
            android.content.Intent r8 = X.C108945cZ.A0G(r1)
            r8.setPackage(r9)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r8.setFlags(r0)
        L_0x00de:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r8.addFlags(r0)
            android.os.Bundle r0 = r12.A00
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r0)
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x00f2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.String r1 = X.C17880vN.A0v(r7)
            java.lang.String r0 = "google.c."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "gcm.n."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "gcm.notification."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f2
        L_0x0114:
            r4.remove(r1)
            goto L_0x00f2
        L_0x0118:
            r8.putExtras(r4)
            java.lang.String r0 = "google.c.a.e"
            boolean r0 = r12.A07(r0)
            if (r0 == 0) goto L_0x012c
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r0 = r12.A02()
            r8.putExtra(r1, r0)
        L_0x012c:
            java.util.concurrent.atomic.AtomicInteger r0 = A00
            int r7 = r0.incrementAndGet()
            r4 = 1073741824(0x40000000, float:2.0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x013c
            r4 = 1140850688(0x44000000, float:512.0)
        L_0x013c:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r11, r7, r8, r4)
            goto L_0x0179
        L_0x0141:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r1 = r12.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r1 = r12.A05(r0)
        L_0x0153:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x016d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            if (r1 == 0) goto L_0x016d
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r8 = X.C108945cZ.A0G(r0)
            r8.setPackage(r9)
            r8.setData(r1)
            goto L_0x00de
        L_0x016d:
            android.content.Intent r8 = r8.getLaunchIntentForPackage(r9)
            if (r8 != 0) goto L_0x00de
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r2, r0)
            r0 = 0
        L_0x0179:
            r6.A0A = r0
            java.lang.String r0 = "google.c.a.e"
            boolean r0 = r12.A07(r0)
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            android.os.Bundle r0 = r12.A02()
            android.content.Intent r4 = r1.putExtras(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = A00
            int r8 = r0.incrementAndGet()
            java.lang.String r0 = "com.google.android.c2dm.intent.RECEIVE"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = r11.getPackageName()
            android.content.Intent r1 = r1.setPackage(r0)
            java.lang.String r0 = "wrapped_intent"
            android.content.Intent r7 = r1.putExtra(r0, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x01b5
            r4 = 1140850688(0x44000000, float:512.0)
        L_0x01b5:
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r11, r8, r7, r4)
            if (r0 == 0) goto L_0x01bd
            r5.deleteIntent = r0
        L_0x01bd:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r4 = r12.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0245
            goto L_0x0227
        L_0x01ca:
            r0 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r0)
            goto L_0x00c1
        L_0x01d1:
            java.lang.String r0 = "mipmap"
            int r7 = r10.getIdentifier(r4, r0, r9)
            if (r7 == 0) goto L_0x01e1
            boolean r0 = A02(r10, r7)
            if (r0 == 0) goto L_0x01e1
            goto L_0x007f
        L_0x01e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Icon resource "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " not found. Notification will use default icon."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x01f6:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            r1 = 0
            int r7 = r3.getInt(r0, r1)
            if (r7 == 0) goto L_0x0205
            boolean r0 = A02(r10, r7)
            if (r0 != 0) goto L_0x021c
        L_0x0205:
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo(r9, r1)     // Catch:{ NameNotFoundException -> 0x020c }
            int r7 = r0.icon     // Catch:{ NameNotFoundException -> 0x020c }
            goto L_0x021a
        L_0x020c:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            android.util.Log.w(r2, r0)
        L_0x021a:
            if (r7 == 0) goto L_0x0222
        L_0x021c:
            boolean r0 = A02(r10, r7)
            if (r0 != 0) goto L_0x007f
        L_0x0222:
            r7 = 17301651(0x1080093, float:2.4979667E-38)
            goto L_0x007f
        L_0x0227:
            int r0 = android.graphics.Color.parseColor(r4)     // Catch:{ IllegalArgumentException -> 0x0230 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0230 }
            goto L_0x0256
        L_0x0230:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Color is invalid: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ". Notification will use default color."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x0245:
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_color"
            r0 = 0
            int r0 = r3.getInt(r1, r0)
            if (r0 == 0) goto L_0x0264
            int r0 = X.C19740yt.A00(r11, r0)     // Catch:{ NotFoundException -> 0x025f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x025f }
        L_0x0256:
            if (r0 == 0) goto L_0x0264
            int r0 = r0.intValue()
            r6.A00 = r0
            goto L_0x0264
        L_0x025f:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r2, r0)
        L_0x0264:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r12.A07(r0)
            r7 = 1
            r0 = r0 ^ 1
            r6.A0G(r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r12.A07(r0)
            r6.A0W = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r12.A05(r0)
            if (r0 == 0) goto L_0x0283
            r6.A0F(r0)
        L_0x0283:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r3 = r12.A03(r0)
            if (r3 == 0) goto L_0x0297
            int r1 = r3.intValue()
            r0 = -2
            if (r1 < r0) goto L_0x02f5
            r0 = 2
            if (r1 > r0) goto L_0x02f5
            r6.A03 = r1
        L_0x0297:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r3 = r12.A03(r0)
            if (r3 == 0) goto L_0x02aa
            int r1 = r3.intValue()
            r0 = -1
            if (r1 < r0) goto L_0x02dd
            if (r1 > r7) goto L_0x02dd
            r6.A06 = r1
        L_0x02aa:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r3 = r12.A03(r0)
            if (r3 == 0) goto L_0x02cd
            int r0 = r3.intValue()
            if (r0 >= 0) goto L_0x02da
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "notificationCount is invalid: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Skipping setting notificationCount."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x02cd:
            java.lang.String r3 = "gcm.n.event_time"
            java.lang.String r2 = r12.A05(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0347
            goto L_0x030b
        L_0x02da:
            r6.A02 = r0
            goto L_0x02cd
        L_0x02dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "visibility is invalid: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Skipping setting visibility."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r1)
            goto L_0x02aa
        L_0x02f5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "notificationPriority is invalid "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Skipping setting notificationPriority."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.w(r2, r0)
            goto L_0x0297
        L_0x030b:
            long r0 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x031b }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x031b }
            if (r2 == 0) goto L_0x0347
            r6.A0Y = r7
            r6.A09(r0)
            goto L_0x0347
        L_0x031b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Couldn't parse value of "
            r1.append(r0)
            java.lang.String r0 = "gcm.n."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0331
            r0 = 6
            java.lang.String r3 = r3.substring(r0)
        L_0x0331:
            r1.append(r3)
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") into a long"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r1)
        L_0x0347:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r8 = r12.A06(r0)
            if (r8 == 0) goto L_0x0389
            int r0 = r8.length()     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            if (r0 <= r7) goto L_0x036a
            int r4 = r8.length()     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            long[] r3 = new long[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            r2 = 0
        L_0x035c:
            if (r2 >= r4) goto L_0x0367
            long r0 = r8.optLong(r2)     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            r3[r2] = r0     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            int r2 = r2 + 1
            goto L_0x035c
        L_0x0367:
            r5.vibrate = r3
            goto L_0x0389
        L_0x036a:
            java.lang.String r1 = "vibrateTimings have invalid length"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            r0.<init>(r1)     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
            throw r0     // Catch:{ NumberFormatException | JSONException -> 0x0372 }
        L_0x0372:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "User defined vibrateTimings is invalid: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ". Skipping setting vibrateTimings."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r1)
        L_0x0389:
            java.lang.String r4 = ". Skipping setting LightSettings"
            java.lang.String r11 = "LightSettings is invalid: "
            java.lang.String r3 = "NotificationParams"
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r8 = r12.A06(r0)
            if (r8 == 0) goto L_0x0404
            r1 = 3
            int[] r10 = new int[r1]
            int r0 = r8.length()     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            if (r0 != r1) goto L_0x03db
            r9 = 0
            java.lang.String r0 = r8.optString(r9)     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            int r1 = android.graphics.Color.parseColor(r0)     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == r0) goto L_0x03d4
            r10[r9] = r1     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            int r0 = r8.optInt(r7)     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            r10[r7] = r0     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            r0 = 2
            int r2 = r8.optInt(r0)     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            r10[r0] = r2     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            r1 = r10[r9]
            r0 = r10[r7]
            r5.ledARGB = r1
            r5.ledOnMS = r0
            r5.ledOffMS = r2
            if (r0 == 0) goto L_0x03cb
            r1 = 1
            if (r2 != 0) goto L_0x03cc
        L_0x03cb:
            r1 = 0
        L_0x03cc:
            int r0 = r5.flags
            r0 = r0 & -2
            r1 = r1 | r0
            r5.flags = r1
            goto L_0x0404
        L_0x03d4:
            java.lang.String r0 = "Transparent color is invalid"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            goto L_0x03e2
        L_0x03db:
            java.lang.String r1 = "lightSettings don't have all three fields"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
        L_0x03e2:
            throw r0     // Catch:{ JSONException -> 0x03e3, IllegalArgumentException -> 0x03ef }
        L_0x03e3:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r11)
            r0.append(r8)
            java.lang.String r0 = X.AnonymousClass000.A0y(r4, r0)
            goto L_0x0401
        L_0x03ef:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            r1.append(r8)
            java.lang.String r0 = ". "
            java.lang.String r0 = X.C108955ca.A10(r0, r1, r2)
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
        L_0x0401:
            android.util.Log.w(r3, r0)
        L_0x0404:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r12.A07(r0)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r12.A07(r0)
            if (r0 == 0) goto L_0x0418
            r1 = r1 | 2
        L_0x0418:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r12.A07(r0)
            if (r0 == 0) goto L_0x0422
            r1 = r1 | 4
        L_0x0422:
            r6.A06(r1)
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r1 = r12.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0442
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FCM-Notification:"
            r2.append(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r1 = X.C17880vN.A0u(r2, r0)
        L_0x0442:
            X.6dT r0 = new X.6dT
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1405772a.A00(android.content.Context, X.72P):X.6dT");
    }
}
