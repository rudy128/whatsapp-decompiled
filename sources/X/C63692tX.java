package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.Locale;

/* renamed from: X.2tX  reason: invalid class name and case insensitive filesystem */
public abstract class C63692tX {
    public static Locale A00;
    public static final AnonymousClass00O A01 = new AnonymousClass00O(0);

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r5, java.lang.String r6) {
        /*
            X.00O r3 = A01
            monitor-enter(r3)
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x0090 }
            android.content.res.Configuration r4 = r0.getConfiguration()     // Catch:{ all -> 0x0090 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0090 }
            r0 = 24
            if (r1 < r0) goto L_0x0038
            android.os.LocaleList r0 = X.C60222nb.A00(r4)     // Catch:{ all -> 0x0090 }
            X.1HD r0 = X.AnonymousClass1HD.A01(r0)     // Catch:{ all -> 0x0090 }
        L_0x0019:
            r1 = 0
            X.1Jj r0 = r0.A00     // Catch:{ all -> 0x0090 }
            java.util.Locale r1 = r0.BME(r1)     // Catch:{ all -> 0x0090 }
            java.util.Locale r0 = A00     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x002d
            r3.clear()     // Catch:{ all -> 0x0090 }
            A00 = r1     // Catch:{ all -> 0x0090 }
        L_0x002d:
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x006e
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00     // Catch:{ all -> 0x0090 }
            goto L_0x0045
        L_0x0038:
            r0 = 1
            java.util.Locale[] r2 = new java.util.Locale[r0]     // Catch:{ all -> 0x0090 }
            r1 = 0
            java.util.Locale r0 = r4.locale     // Catch:{ all -> 0x0090 }
            r2[r1] = r0     // Catch:{ all -> 0x0090 }
            X.1HD r0 = X.AnonymousClass1HD.A03(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x0019
        L_0x0045:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0050 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r2 = r1.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            r4 = 0
            if (r2 == 0) goto L_0x006e
            java.lang.String r1 = "string"
            java.lang.String r0 = "com.google.android.gms"
            int r0 = r2.getIdentifier(r6, r1, r0)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r2 = "GoogleApiAvailability"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "Missing resource: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)     // Catch:{ all -> 0x0090 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0090 }
        L_0x006e:
            monitor-exit(r3)     // Catch:{ all -> 0x0090 }
            goto L_0x008a
        L_0x0070:
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x0090 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r2 = "GoogleApiAvailability"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "Got empty resource: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)     // Catch:{ all -> 0x0090 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0090 }
            goto L_0x006e
        L_0x008a:
            return r4
        L_0x008b:
            r3.put(r6, r1)     // Catch:{ all -> 0x0090 }
            monitor-exit(r3)     // Catch:{ all -> 0x0090 }
            return r1
        L_0x0090:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0090 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63692tX.A03(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C41401wK.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i == 1) {
            i2 = 2131898792;
        } else if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    str = "common_google_play_services_invalid_account_text";
                } else if (i == 7) {
                    str = "common_google_play_services_network_error_text";
                } else if (i == 9) {
                    i2 = 2131898797;
                } else if (i != 20) {
                    switch (i) {
                        case 16:
                            str = "common_google_play_services_api_unavailable_text";
                            break;
                        case 17:
                            str = "common_google_play_services_sign_in_failed_text";
                            break;
                        case 18:
                            i2 = 2131898801;
                            break;
                        default:
                            i2 = 2131898796;
                            break;
                    }
                } else {
                    str = "common_google_play_services_restricted_profile_text";
                }
                Resources resources2 = context.getResources();
                String A03 = A03(context, str);
                if (A03 == null) {
                    A03 = resources2.getString(2131898796);
                }
                return String.format(resources2.getConfiguration().locale, A03, new Object[]{A002});
            }
            i2 = 2131898789;
        } else if (DeviceProperties.A00(context)) {
            return resources.getString(2131898802);
        } else {
            i2 = 2131898799;
        }
        return resources.getString(i2, new Object[]{A002});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        return A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        android.util.Log.e("GoogleApiAvailability", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r1 = r4.getResources()
            r3 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r5) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004f;
                case 3: goto L_0x004b;
                case 4: goto L_0x0017;
                case 5: goto L_0x003f;
                case 6: goto L_0x0017;
                case 7: goto L_0x0037;
                case 8: goto L_0x0024;
                case 9: goto L_0x0021;
                case 10: goto L_0x001e;
                case 11: goto L_0x001b;
                case 12: goto L_0x000a;
                case 13: goto L_0x000a;
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0018;
                case 17: goto L_0x002f;
                case 18: goto L_0x0017;
                case 19: goto L_0x000a;
                case 20: goto L_0x0027;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected error code "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
        L_0x0014:
            android.util.Log.e(r2, r0)
        L_0x0017:
            return r3
        L_0x0018:
            java.lang.String r0 = "One of the API components you attempted to connect to is not available."
            goto L_0x0014
        L_0x001b:
            java.lang.String r0 = "The application is not licensed to the user."
            goto L_0x0014
        L_0x001e:
            java.lang.String r0 = "Developer error occurred. Please see logs for detailed information"
            goto L_0x0014
        L_0x0021:
            java.lang.String r0 = "Google Play services is invalid. Cannot recover."
            goto L_0x0014
        L_0x0024:
            java.lang.String r0 = "Internal error occurred. Please see logs for detailed information"
            goto L_0x0014
        L_0x0027:
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_restricted_profile_title"
            goto L_0x0046
        L_0x002f:
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_sign_in_failed_title"
            goto L_0x0046
        L_0x0037:
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_network_error_title"
            goto L_0x0046
        L_0x003f:
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_invalid_account_title"
        L_0x0046:
            java.lang.String r0 = A03(r4, r0)
            return r0
        L_0x004b:
            r0 = 2131898790(0x7f1231a6, float:1.9432508E38)
            goto L_0x0056
        L_0x004f:
            r0 = 2131898800(0x7f1231b0, float:1.9432528E38)
            goto L_0x0056
        L_0x0053:
            r0 = 2131898793(0x7f1231a9, float:1.9432514E38)
        L_0x0056:
            java.lang.String r0 = r1.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63692tX.A02(android.content.Context, int):java.lang.String");
    }
}
