package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: X.A6y  reason: case insensitive filesystem */
public class C20095A6y {
    public static C22533BBq A00;
    public static final C182359Ub A01;
    public static final C22533BBq A02;
    public static final C22533BBq A03 = new C20384AIx(0);

    static {
        C20384AIx aIx = new C20384AIx(1);
        A02 = aIx;
        A01 = new C182359Ub(aIx);
    }

    public static SharedPreferences A00(Context context) {
        try {
            return context.getSharedPreferences("com.facebook.secure.switchoff", 0);
        } catch (Throwable th) {
            Log.w("DefaultSwitchOffs", "Could not load SharedPreferences", th);
            return null;
        }
    }

    public static synchronized C22533BBq A01() {
        C22533BBq bBq;
        synchronized (C20095A6y.class) {
            bBq = A00;
            if (bBq == null) {
                throw new IllegalStateException();
            }
        }
        return bBq;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:13|(3:17|(1:19)|(2:21|25))|26|(3:27|28|(1:30)(3:31|(4:33|(1:35)(4:37|(2:39|(2:41|(4:100|43|59|63))(5:49|50|(1:52)(3:53|54|55)|56|57))|44|(6:46|(1:48)|50|(0)(0)|56|57)(3:101|60|63))|36|58)|99))|68|(3:70|71|(9:74|(1:76)|77|(1:79)|80|(2:83|81)|102|84|72))|85|86|87|88|(1:90)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r4 == null) goto L_0x004b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0177 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0 A[Catch:{ IOException | IllegalArgumentException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[Catch:{ IOException | IllegalArgumentException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A02(android.content.Context r17) {
        /*
            java.lang.Class<X.A6y> r16 = X.C20095A6y.class
            monitor-enter(r16)
            X.BBq r0 = A00     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x018f
            android.os.StrictMode$ThreadPolicy r15 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0191 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x018a }
            r0 = 24
            java.lang.String r1 = "com.facebook.secure.switchoff"
            r3 = r17
            if (r2 < r0) goto L_0x0045
            boolean r0 = r3.isDeviceProtectedStorage()     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0045
            android.content.Context r2 = r3.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x004b
            android.content.SharedPreferences r4 = A00(r2)     // Catch:{ all -> 0x018a }
            if (r4 == 0) goto L_0x0031
            java.util.Map r0 = r4.getAll()     // Catch:{ all -> 0x018a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x005e
        L_0x0031:
            boolean r0 = r2.moveSharedPreferencesFrom(r3, r1)     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "DefaultSwitchOffs"
            java.lang.String r0 = "Moved configs SharedPreferences from CE to DE"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x018a }
            android.content.SharedPreferences r4 = A00(r2)     // Catch:{ all -> 0x018a }
        L_0x0042:
            if (r4 == 0) goto L_0x004b
            goto L_0x0054
        L_0x0045:
            android.content.SharedPreferences r4 = A00(r3)     // Catch:{ all -> 0x018a }
            if (r4 != 0) goto L_0x005e
        L_0x004b:
            java.lang.String r1 = "DefaultSwitchOffs"
            java.lang.String r0 = "Could not load last config"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x018a }
            goto L_0x017e
        L_0x0054:
            android.content.SharedPreferences$Editor r2 = r4.edit()     // Catch:{ all -> 0x018a }
            java.lang.String r1 = "marker"
            r0 = 1
            X.C17880vN.A1C(r2, r1, r0)     // Catch:{ all -> 0x018a }
        L_0x005e:
            java.lang.String r0 = "last_criteria"
            java.lang.String r2 = ""
            java.lang.String r1 = r4.getString(r0, r2)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "last_custom_config"
            java.lang.String r14 = r4.getString(r0, r2)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "last_deeplink_config"
            java.lang.String r13 = r4.getString(r0, r2)     // Catch:{ all -> 0x018a }
            android.content.ContentResolver r9 = r3.getContentResolver()     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            r8 = 0
            if (r0 == 0) goto L_0x0081
            X.9y3[] r11 = new X.C198259y3[r8]     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            goto L_0x0114
        L_0x0081:
            java.lang.String r0 = "\\^\\^\\^"
            java.lang.String[] r7 = r1.split(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            int r6 = r7.length     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            X.9y3[] r11 = new X.C198259y3[r6]     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
        L_0x008a:
            if (r8 >= r6) goto L_0x0114
            r12 = r7[r8]     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            if (r0 == 0) goto L_0x009c
            X.9y3 r0 = new X.9y3     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            r0.<init>()     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
        L_0x0099:
            r11[r8] = r0     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            goto L_0x00f3
        L_0x009c:
            r5 = 0
            int r10 = r12.codePointAt(r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            java.lang.String r3 = "Criteria specification is not valid"
            r2 = 33
            r1 = 1
            if (r10 == r2) goto L_0x00b1
            r0 = 42
            if (r10 == r0) goto L_0x00c5
            r0 = 58
            if (r10 == r0) goto L_0x00b1
            goto L_0x00f6
        L_0x00b1:
            int r0 = r12.indexOf(r10, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            if (r0 < 0) goto L_0x00fb
            java.lang.String r4 = r12.substring(r1, r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            int r0 = r0 + 1
            java.lang.String r3 = r12.substring(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            if (r10 != r2) goto L_0x00ca
            r5 = 1
            goto L_0x00ca
        L_0x00c5:
            java.lang.String r3 = r12.substring(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            r4 = 0
        L_0x00ca:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            if (r0 == 0) goto L_0x00d2
            r2 = 0
            goto L_0x00ed
        L_0x00d2:
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            r2.<init>()     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
            r0.setNamespaceAware(r1)     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
            org.xmlpull.v1.XmlPullParser r1 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
            r1.setInput(r0)     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
            r2.readFromXml(r1)     // Catch:{ XmlPullParserException -> 0x0100, IOException | IllegalArgumentException -> 0x0109 }
        L_0x00ed:
            X.9y3 r0 = new X.9y3     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            r0.<init>(r9, r2, r4, r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            goto L_0x0099
        L_0x00f3:
            int r8 = r8 + 1
            goto L_0x008a
        L_0x00f6:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            goto L_0x0108
        L_0x00fb:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            goto L_0x0108
        L_0x0100:
            r2 = move-exception
            java.lang.String r1 = "Something went wrong with the parser"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
            r0.<init>(r1, r2)     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
        L_0x0108:
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0109 }
        L_0x0109:
            r2 = move-exception
            java.lang.String r1 = "IntentCriteria"
            java.lang.String r0 = "Error parsing switch-off criteria."
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x018a }
            r0 = 0
            X.9y3[] r11 = new X.C198259y3[r0]     // Catch:{ all -> 0x018a }
        L_0x0114:
            X.A4Z[] r10 = X.A4Z.A00(r14)     // Catch:{ all -> 0x018a }
            java.lang.String r9 = "enforce_scheme_and_authority"
            java.lang.String r8 = "enforce_scheme"
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ all -> 0x018a }
            if (r13 == 0) goto L_0x0177
            org.json.JSONObject r6 = X.C17880vN.A16(r13)     // Catch:{ JSONException -> 0x0177 }
            java.util.Iterator r12 = r6.keys()     // Catch:{ JSONException -> 0x0177 }
        L_0x012a:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0177 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r5 = X.C17880vN.A0v(r12)     // Catch:{ JSONException -> 0x0177 }
            org.json.JSONObject r1 = r6.getJSONObject(r5)     // Catch:{ JSONException -> 0x0177 }
            boolean r0 = r1.has(r8)     // Catch:{ JSONException -> 0x0177 }
            if (r0 == 0) goto L_0x0141
            r1.getBoolean(r8)     // Catch:{ JSONException -> 0x0177 }
        L_0x0141:
            boolean r0 = r1.has(r9)     // Catch:{ JSONException -> 0x0177 }
            if (r0 == 0) goto L_0x014a
            r1.getBoolean(r9)     // Catch:{ JSONException -> 0x0177 }
        L_0x014a:
            java.lang.String r0 = "whitelist"
            org.json.JSONObject r4 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0177 }
            java.util.Iterator r3 = r4.keys()     // Catch:{ JSONException -> 0x0177 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ JSONException -> 0x0177 }
        L_0x0158:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0177 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r1 = X.C17880vN.A0v(r3)     // Catch:{ JSONException -> 0x0177 }
            java.lang.String r0 = r4.getString(r1)     // Catch:{ JSONException -> 0x0177 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ JSONException -> 0x0177 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0177 }
            goto L_0x0158
        L_0x016e:
            X.9Ua r0 = new X.9Ua     // Catch:{ JSONException -> 0x0177 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0177 }
            r7.put(r5, r0)     // Catch:{ JSONException -> 0x0177 }
            goto L_0x012a
        L_0x0177:
            X.AIy r0 = new X.AIy     // Catch:{ all -> 0x018a }
            r0.<init>(r7, r11, r10)     // Catch:{ all -> 0x018a }
            A00 = r0     // Catch:{ all -> 0x018a }
        L_0x017e:
            android.os.StrictMode.setThreadPolicy(r15)     // Catch:{ all -> 0x0191 }
            X.BBq r0 = A00     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x018f
            X.BBq r0 = A03     // Catch:{ all -> 0x0191 }
            A00 = r0     // Catch:{ all -> 0x0191 }
            goto L_0x018f
        L_0x018a:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r15)     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x018f:
            monitor-exit(r16)
            return
        L_0x0191:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20095A6y.A02(android.content.Context):void");
    }
}
