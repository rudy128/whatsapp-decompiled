package X;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.1Ej  reason: invalid class name and case insensitive filesystem */
public class C23061Ej {
    public static Context A00;
    public static JSONObject A01 = new JSONObject();
    public static boolean A02;
    public static boolean A03;

    public static synchronized JSONObject A00() {
        JSONObject jSONObject;
        synchronized (C23061Ej.class) {
            jSONObject = A01;
            jSONObject.length();
        }
        return jSONObject;
    }

    public static void A01(Context context) {
        String str;
        Log.w("EndToEnd-Test", "Prepare");
        A00 = context;
        A00();
        if (A00().has("systemproperties")) {
            try {
                JSONObject jSONObject = A00().getJSONObject("systemproperties");
                StringBuilder sb = new StringBuilder();
                sb.append("Setting E2E system properties: ");
                sb.append(jSONObject);
                Log.w("EndToEnd-Test", sb.toString());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (jSONObject.isNull(next)) {
                        str = null;
                    } else {
                        str = jSONObject.getString(next);
                    }
                    System.setProperty(next, str);
                }
            } catch (Exception e) {
                Log.e("EndToEnd-Test", "Failed to set E2E system properties", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ("true".equals(java.lang.System.getProperty("fb.running_e2e")) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A02() {
        /*
            java.lang.Class<X.1Ej> r4 = X.C23061Ej.class
            monitor-enter(r4)
            A00()     // Catch:{ all -> 0x0037 }
            boolean r0 = A02     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0033
            java.lang.String r3 = "true"
            java.lang.String r1 = "fb.running_e2e"
            java.lang.String r0 = X.C222919i.A02(r1)     // Catch:{ all -> 0x0037 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0037 }
            r2 = 1
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0037 }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x0037 }
            r0 = 0
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            A03 = r0     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0037 }
        L_0x0031:
            A02 = r2     // Catch:{ all -> 0x0037 }
        L_0x0033:
            boolean r0 = A03     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)
            return r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23061Ej.A02():boolean");
    }
}
