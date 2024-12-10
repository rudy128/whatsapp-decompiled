package X;

import android.content.Context;

/* renamed from: X.9js  reason: invalid class name and case insensitive filesystem */
public class C189799js {
    public Context A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.put("Latitude", "");
        r2.put("Longitude", "");
        r2.put("Provider", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject A00() {
        /*
            r10 = this;
            java.lang.String r9 = ""
            android.content.Context r1 = r10.A00
            if (r1 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            java.lang.String r0 = "location"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.location.LocationManager r4 = (android.location.LocationManager) r4
            java.util.List r3 = r4.getAllProviders()
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = r5.checkPermission(r0, r1)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = r5.checkPermission(r0, r1)
            org.json.JSONObject r8 = X.C17880vN.A15()
            java.lang.String r0 = "Latitude"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Longitude"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Provider"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
        L_0x003b:
            if (r2 == 0) goto L_0x003f
            if (r1 != 0) goto L_0x0087
        L_0x003f:
            int r2 = r3.size()     // Catch:{ Exception -> 0x0087 }
        L_0x0043:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0087
            java.lang.String r1 = X.C17880vN.A0w(r3, r2)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r0 = "network"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0087 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = X.C17880vN.A0w(r3, r2)     // Catch:{ Exception -> 0x0087 }
            android.location.Location r7 = r4.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x0087 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r6 = X.C17880vN.A0w(r3, r2)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r5 = "Provider"
            java.lang.String r4 = "Longitude"
            java.lang.String r3 = "Latitude"
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ Exception -> 0x0087 }
            double r0 = r7.getLatitude()     // Catch:{ Exception -> 0x007d }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x007d }
            double r0 = r7.getLongitude()     // Catch:{ Exception -> 0x007d }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x007d }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x007d }
            return r2
        L_0x007d:
            r2.put(r3, r9)     // Catch:{ JSONException -> 0x0086 }
            r2.put(r4, r9)     // Catch:{ JSONException -> 0x0086 }
            r2.put(r5, r9)     // Catch:{ JSONException -> 0x0086 }
        L_0x0086:
            return r2
        L_0x0087:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189799js.A00():org.json.JSONObject");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(134:0|1|2|3|4|5|6|7|8|9|(2:10|(2:12|(2:13|(3:15|(2:17|(2:214|19)(1:218))(1:217)|215)(1:216)))(2:213|20))|21|22|23|24|(1:26)|27|28|29|30|(1:32)|33|34|35|36|(1:38)|39|40|41|42|(1:44)|45|46|47|48|(1:50)|51|52|53|54|(1:56)|57|58|59|60|(1:62)|63|64|67|(2:69|70)(2:71|(1:73)(3:74|(1:77)|78))|81|82|83|(1:85)(1:89)|86|(3:88|90|(2:92|(2:94|(1:96))(1:97))(1:98))(1:99)|100|101|102|103|(1:105)|106|107|108|109|(1:111)|112|113|114|115|(1:117)|118|119|120|121|(1:123)|124|125|126|127|(1:129)|130|131|132|133|(1:135)|136|137|138|139|(1:141)|142|143|144|145|148|149|(2:150|151)|154|155|156|157|160|161|(4:162|163|(1:173)(2:167|(3:169|(2:172|170)|219))|(2:175|176))|177|179|180|(1:182)|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|(1:202)|203|(2:204|205)|208|209|210|212) */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x01e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x01fb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x020d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x021f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x0231 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x0247 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x0261 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0277 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x0327 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:190:0x0395 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x010c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x011e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0130 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0142 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01ba */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f3 A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0205 A[Catch:{ Exception -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0217 A[Catch:{ Exception -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0229 A[Catch:{ Exception -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x023b A[Catch:{ Exception -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0092 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0255 A[Catch:{ Exception -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x026b A[Catch:{ Exception -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02d4 A[Catch:{ Exception -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x030c A[Catch:{ Exception -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x030f A[SYNTHETIC, Splitter:B:175:0x030f] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x031f A[Catch:{ Exception -> 0x0327 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0400 A[Catch:{ JSONException -> 0x0445 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0104 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0116 A[Catch:{ Exception -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0128 A[Catch:{ Exception -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013a A[Catch:{ Exception -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014c A[Catch:{ Exception -> 0x0154 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015e A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a A[Catch:{ Exception -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c8 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d2 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d3 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e7 A[Catch:{ Exception -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01() {
        /*
            r11 = this;
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r1 = "platform"
            java.lang.String r0 = "ANDROID"
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "deviceModel"
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "os"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "osName"
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "locale"
            android.content.Context r0 = r11.A00     // Catch:{ JSONException -> 0x0445 }
            android.content.res.Configuration r0 = X.C108965cb.A03(r0)     // Catch:{ JSONException -> 0x0445 }
            java.util.Locale r0 = r0.locale     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "timeZone"
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = r0.getID()     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "advertisingId"
            java.lang.String r10 = ""
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r4 = "screenResolution"
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ JSONException -> 0x0445 }
            r3.<init>()     // Catch:{ JSONException -> 0x0445 }
            android.content.Context r0 = r11.A00     // Catch:{ JSONException -> 0x0445 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ JSONException -> 0x0445 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ JSONException -> 0x0445 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ JSONException -> 0x0445 }
            r0.getMetrics(r3)     // Catch:{ JSONException -> 0x0445 }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "width"
            int r0 = r3.widthPixels     // Catch:{ Exception -> 0x0069 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "height"
            int r0 = r3.heightPixels     // Catch:{ Exception -> 0x0069 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            X.AnonymousClass8BS.A1C(r2, r4, r5)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "deviceName"
            android.content.Context r3 = r11.A00     // Catch:{ JSONException -> 0x0445 }
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "device_name"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r6 = "ipAddress"
            r4 = r10
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x00c4 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x00c4 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x00c4 }
        L_0x008c:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x00c4 }
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch:{ Exception -> 0x00c4 }
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch:{ Exception -> 0x00c4 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x00c4 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x00c4 }
        L_0x00a4:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x00c4 }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ Exception -> 0x00c4 }
            boolean r0 = r1.isLoopbackAddress()     // Catch:{ Exception -> 0x00c4 }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r4 = r1.getHostAddress()     // Catch:{ Exception -> 0x00c4 }
            r0 = 58
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x00c4 }
            if (r0 >= 0) goto L_0x00a4
            goto L_0x00c4
        L_0x00c3:
            r4 = r10
        L_0x00c4:
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "latitude"
            org.json.JSONObject r1 = r11.A00()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "Latitude"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "longitude"
            org.json.JSONObject r1 = r11.A00()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "Longitude"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r4 = "deviceId"
            r2 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x00fa }
            if (r0 == 0) goto L_0x00fa
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x00fa }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ Exception -> 0x00fa }
        L_0x00fa:
            r5.put(r4, r2)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "subscriberId"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x010c }
            if (r0 == 0) goto L_0x010c
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x010c }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "imie"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x011e }
            if (r0 == 0) goto L_0x011e
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x011e }
        L_0x011e:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "networkCountryISO"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0130
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r1 = r0.getNetworkCountryIso()     // Catch:{ Exception -> 0x0130 }
        L_0x0130:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "networkOperator"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0142 }
            if (r0 == 0) goto L_0x0142
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r1 = r0.getNetworkOperator()     // Catch:{ Exception -> 0x0142 }
        L_0x0142:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "networkOperatorName"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0154
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r1 = r0.getNetworkOperatorName()     // Catch:{ Exception -> 0x0154 }
        L_0x0154:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "networkType"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x016b }
            if (r0 == 0) goto L_0x0166
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x016b }
            int r1 = r0.getNetworkType()     // Catch:{ Exception -> 0x016b }
        L_0x0166:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0445 }
            goto L_0x016f
        L_0x016b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0445 }
        L_0x016f:
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r4 = "phoneCount"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0445 }
            r0 = 23
            r6 = 1
            if (r1 < r0) goto L_0x018a
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x01ba }
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x01ba }
            int r6 = r0.getPhoneCount()     // Catch:{ Exception -> 0x01ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01be
        L_0x018a:
            r0 = 22
            if (r1 < r0) goto L_0x01a1
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x01ba }
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r0)     // Catch:{ Exception -> 0x01ba }
            java.util.List r0 = r0.getActiveSubscriptionInfoList()     // Catch:{ Exception -> 0x01ba }
            int r6 = r0.size()     // Catch:{ Exception -> 0x01ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01be
        L_0x01a1:
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x01ba }
            android.telephony.TelephonyManager r2 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x01ba }
            r0 = 0
            java.lang.String r1 = r2.getDeviceId(r0)     // Catch:{ Exception -> 0x01ba }
            java.lang.String r0 = r2.getDeviceId(r6)     // Catch:{ Exception -> 0x01ba }
            if (r1 == 0) goto L_0x01b5
            if (r0 == 0) goto L_0x01b5
            r6 = 2
        L_0x01b5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01be
        L_0x01ba:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x0445 }
        L_0x01be:
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r4 = "phoneType"
            r2 = r10
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01d3
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x01e9 }
        L_0x01cc:
            int r1 = r0.getPhoneType()     // Catch:{ Exception -> 0x01e9 }
            if (r1 == 0) goto L_0x01e7
            goto L_0x01d5
        L_0x01d3:
            r0 = 0
            goto L_0x01cc
        L_0x01d5:
            r0 = 1
            if (r1 == r0) goto L_0x01e4
            r0 = 2
            if (r1 == r0) goto L_0x01e1
            r0 = 3
            if (r1 != r0) goto L_0x01e9
            java.lang.String r2 = "SIP"
            goto L_0x01e9
        L_0x01e1:
            java.lang.String r2 = "CDMA"
            goto L_0x01e9
        L_0x01e4:
            java.lang.String r2 = "GSM"
            goto L_0x01e9
        L_0x01e7:
            java.lang.String r2 = "NONE"
        L_0x01e9:
            r5.put(r4, r2)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "simCountryISO"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x01fb }
            if (r0 == 0) goto L_0x01fb
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r1 = r0.getSimCountryIso()     // Catch:{ Exception -> 0x01fb }
        L_0x01fb:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "simOperator"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x020d }
            if (r0 == 0) goto L_0x020d
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x020d }
            java.lang.String r1 = r0.getSimOperator()     // Catch:{ Exception -> 0x020d }
        L_0x020d:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "simOperatorName"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x021f }
            if (r0 == 0) goto L_0x021f
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = r0.getSimOperatorName()     // Catch:{ Exception -> 0x021f }
        L_0x021f:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "simSerialNumber"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0231 }
            if (r0 == 0) goto L_0x0231
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r1 = r0.getSimSerialNumber()     // Catch:{ Exception -> 0x0231 }
        L_0x0231:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "simState"
            r1 = 0
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x0247
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0247 }
            int r0 = r0.getSimState()     // Catch:{ Exception -> 0x0247 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0247 }
        L_0x0247:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "isNetworkRoaming"
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()     // Catch:{ JSONException -> 0x0445 }
            r4 = r1
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0261 }
            if (r0 == 0) goto L_0x0261
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0261 }
            boolean r0 = r0.isNetworkRoaming()     // Catch:{ Exception -> 0x0261 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0261 }
        L_0x0261:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "isSmsCapable"
            r1 = r4
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0277 }
            if (r0 == 0) goto L_0x0277
            android.telephony.TelephonyManager r0 = X.AnonymousClass8BR.A09(r0)     // Catch:{ Exception -> 0x0277 }
            boolean r0 = r0.isSmsCapable()     // Catch:{ Exception -> 0x0277 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0277 }
        L_0x0277:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "wifiMacAddress"
            android.content.Context r1 = r11.A00     // Catch:{ Exception -> 0x028f }
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x028f }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x028f }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x028f }
            java.lang.String r0 = r0.getMacAddress()     // Catch:{ Exception -> 0x028f }
            goto L_0x0290
        L_0x028f:
            r0 = 0
        L_0x0290:
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "bssid"
            android.content.Context r1 = r11.A00     // Catch:{ Exception -> 0x02a8 }
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x02a8 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x02a8 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x02a8 }
            java.lang.String r0 = r0.getBSSID()     // Catch:{ Exception -> 0x02a8 }
            goto L_0x02a9
        L_0x02a8:
            r0 = 0
        L_0x02a9:
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "ssid"
            android.content.Context r1 = r11.A00     // Catch:{ Exception -> 0x02c1 }
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x02c1 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x02c1 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x02c1 }
            java.lang.String r0 = r0.getSSID()     // Catch:{ Exception -> 0x02c1 }
            goto L_0x02c2
        L_0x02c1:
            r0 = 0
        L_0x02c2:
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r9 = "bondedDevice"
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0313 }
            r8 = 0
            if (r1 == 0) goto L_0x030c
            boolean r0 = r1.isEnabled()     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x030c
            java.util.Set r1 = r1.getBondedDevices()     // Catch:{ Exception -> 0x0313 }
            org.json.JSONArray r7 = X.AnonymousClass8BR.A1A()     // Catch:{ Exception -> 0x0313 }
            int r0 = r1.size()     // Catch:{ Exception -> 0x0313 }
            if (r0 <= 0) goto L_0x030d
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x0313 }
        L_0x02e6:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x030d
            java.lang.Object r2 = r6.next()     // Catch:{ Exception -> 0x0313 }
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2     // Catch:{ Exception -> 0x0313 }
            org.json.JSONObject r8 = X.C17880vN.A15()     // Catch:{ Exception -> 0x0313 }
            java.lang.String r1 = "bluetoothName"
            java.lang.String r0 = r2.getName()     // Catch:{ Exception -> 0x0313 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r1 = "bluetoothMacAddress"
            java.lang.String r0 = r2.getAddress()     // Catch:{ Exception -> 0x0313 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0313 }
            r7.put(r8)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02e6
        L_0x030c:
            r7 = r8
        L_0x030d:
            if (r8 == 0) goto L_0x0313
            java.lang.String r10 = r7.toString()     // Catch:{ JSONException -> 0x0445 }
        L_0x0313:
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "bluetoothIsEnabled"
            r1 = r4
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0327 }
            if (r0 == 0) goto L_0x0327
            boolean r0 = r0.isEnabled()     // Catch:{ Exception -> 0x0327 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0327 }
        L_0x0327:
            r5.put(r2, r1)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "fingerprint"
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "hardware"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "id"
            java.lang.String r0 = android.os.Build.ID     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "manufacturer"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "product"
            java.lang.String r0 = android.os.Build.PRODUCT     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "radio"
            java.lang.String r0 = android.os.Build.RADIO     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "serial"
            java.lang.String r0 = android.os.Build.SERIAL     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "user"
            java.lang.String r0 = android.os.Build.USER     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "securityPatch"
            java.lang.String r0 = android.os.Build.VERSION.SECURITY_PATCH     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "androidID"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "isDataRoaming"
            android.content.Context r0 = r11.A00     // Catch:{ Exception -> 0x0395 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = "data_roaming"
            int r0 = android.provider.Settings.Secure.getInt(r1, r0)     // Catch:{ Exception -> 0x0395 }
            boolean r0 = X.C108975cc.A1B(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0395 }
        L_0x0395:
            r5.put(r2, r4)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "autoTime"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "auto_time"
            java.lang.String r0 = android.provider.Settings.Global.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            r6 = 1
            java.lang.String r4 = "1"
            boolean r0 = X.AnonymousClass000.A1Z(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "autoTimeZone"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "auto_time_zone"
            java.lang.String r0 = android.provider.Settings.Global.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            boolean r0 = X.AnonymousClass000.A1Z(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "developmentSettingsEnabled"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "development_settings_enabled"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            boolean r0 = X.AnonymousClass000.A1Z(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "httpProxy"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "http_proxy"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "networkPreference"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "network_preference"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r2 = "usbMassStorageEnabled"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r0 = "usb_mass_storage_enabled"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            if (r0 == r4) goto L_0x0401
            r6 = 0
        L_0x0401:
            r5.put(r2, r6)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "is24HoursFormat"
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r3)     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "isSafeMode"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ JSONException -> 0x0445 }
            boolean r0 = r0.isSafeMode()     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r1 = "systemAvailableFeature"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ JSONException -> 0x0445 }
            android.content.pm.FeatureInfo[] r0 = r0.getSystemAvailableFeatures()     // Catch:{ JSONException -> 0x0445 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0445 }
            java.lang.String r4 = "totalBytes"
            java.io.File r0 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x0440 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0440 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x0440 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0440 }
            long r2 = r0.getBlockSizeLong()     // Catch:{ Exception -> 0x0440 }
            long r0 = r0.getBlockCountLong()     // Catch:{ Exception -> 0x0440 }
            long r0 = r0 * r2
            goto L_0x0442
        L_0x0440:
            r0 = -1
        L_0x0442:
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0445 }
        L_0x0445:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189799js.A01():java.lang.String");
    }
}
