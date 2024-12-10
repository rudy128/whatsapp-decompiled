package X;

import android.os.Bundle;
import java.util.HashMap;

public class A27 {
    public HashMap A00;
    public boolean A01 = false;
    public final AnonymousClass118 A02;
    public final AnonymousClass1QD A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1QO A05;

    /* JADX WARNING: type inference failed for: r0v29, types: [X.9Nx, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:50|(6:51|52|53|54|55|(4:57|58|59|(3:61|62|63)))|71|72|103) */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ef, code lost:
        if (r5.isEmpty() != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f1, code lost:
        r5 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00eb */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071 A[Catch:{ JSONException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb A[EDGE_INSN: B:77:0x00eb->B:78:? ?: BREAK  
    EDGE_INSN: B:76:0x00e8->B:77:0x00eb ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.A27 r15) {
        /*
            boolean r0 = r15.A01
            r3 = 1
            if (r0 == 0) goto L_0x000d
            java.util.HashMap r0 = r15.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0145
        L_0x000d:
            java.lang.String r1 = "payments_error_map.json"
            monitor-enter(r15)
            X.118 r0 = r15.A02     // Catch:{ all -> 0x0134 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0134 }
            java.io.File r1 = X.AnonymousClass8BU.A0f(r0, r1)     // Catch:{ all -> 0x0134 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0134 }
            monitor-exit(r15)
            if (r0 != 0) goto L_0x0021
            goto L_0x012d
        L_0x0021:
            java.io.FileInputStream r0 = X.C108945cZ.A18(r1)     // Catch:{ FileNotFoundException -> 0x0121 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.io.BufferedReader r2 = X.AnonymousClass8BW.A0W(r0)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x0045 }
        L_0x002d:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0037
            r4.append(r0)     // Catch:{ all -> 0x003b }
            goto L_0x002d
        L_0x0037:
            r2.close()     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x0045 }
            goto L_0x0057
        L_0x003b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x0045 }
        L_0x0044:
            throw r1     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x0045 }
        L_0x0045:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/IOException: "
            goto L_0x0054
        L_0x004d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/FileNotFoundException: "
        L_0x0054:
            X.C17900vP.A0X(r2, r0, r1)
        L_0x0057:
            java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x0114 }
            org.json.JSONObject r7 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0114 }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ JSONException -> 0x0137 }
            r15.A00 = r0     // Catch:{ JSONException -> 0x0137 }
            r15.A01 = r3     // Catch:{ JSONException -> 0x0137 }
            java.util.Iterator r14 = r7.keys()     // Catch:{ JSONException -> 0x0137 }
        L_0x006b:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0137 }
            if (r0 == 0) goto L_0x0145
            java.lang.Object r0 = r14.next()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r6 = r0.toString()     // Catch:{ JSONException -> 0x0137 }
            r8 = 0
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x00f3 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r12 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x00f3 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x00f3 }
            X.00H r0 = r15.A04     // Catch:{ Exception | JSONException -> 0x00eb }
            r0.get()     // Catch:{ Exception | JSONException -> 0x00eb }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ Exception | JSONException -> 0x00eb }
            r10 = 0
        L_0x0092:
            int r0 = r12.length()     // Catch:{ Exception | JSONException -> 0x00eb }
            if (r10 >= r0) goto L_0x00e8
            r13 = 0
            org.json.JSONObject r1 = r12.getJSONObject(r10)     // Catch:{ JSONException -> 0x00e0, Exception | JSONException -> 0x00eb }
            if (r1 == 0) goto L_0x00e5
            java.lang.String r0 = "type"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x00cf, Exception | JSONException -> 0x00eb }
            java.lang.String r0 = "name"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x00cd, Exception | JSONException -> 0x00eb }
            if (r9 == 0) goto L_0x00d1
            java.lang.String r0 = "FAQ"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x00d1, Exception | JSONException -> 0x00eb }
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "faq_data"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x00c2, Exception | JSONException -> 0x00eb }
            java.lang.String r0 = "faq_article_id"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ JSONException -> 0x00c2, Exception | JSONException -> 0x00eb }
            goto L_0x00d1
        L_0x00c2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x00d1, Exception | JSONException -> 0x00eb }
            java.lang.String r0 = "PAY/ ErrorMapObject/ No article_id present. Exception: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ JSONException -> 0x00d1, Exception | JSONException -> 0x00eb }
            goto L_0x00d1
        L_0x00cd:
            r4 = r8
            goto L_0x00d1
        L_0x00cf:
            r9 = r8
            r4 = r8
        L_0x00d1:
            X.9Nx r0 = new X.9Nx     // Catch:{ Exception | JSONException -> 0x00eb }
            r0.<init>()     // Catch:{ Exception | JSONException -> 0x00eb }
            r0.A02 = r9     // Catch:{ Exception | JSONException -> 0x00eb }
            r0.A01 = r4     // Catch:{ Exception | JSONException -> 0x00eb }
            r0.A00 = r13     // Catch:{ Exception | JSONException -> 0x00eb }
            r11.add(r0)     // Catch:{ Exception | JSONException -> 0x00eb }
            goto L_0x00e5
        L_0x00e0:
            java.lang.String r0 = "PAY/ ErrorMapObject/ Action not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception | JSONException -> 0x00eb }
        L_0x00e5:
            int r10 = r10 + 1
            goto L_0x0092
        L_0x00e8:
            r5.addAll(r11)     // Catch:{ Exception | JSONException -> 0x00eb }
        L_0x00eb:
            boolean r0 = r5.isEmpty()     // Catch:{ JSONException -> 0x0137 }
            if (r0 == 0) goto L_0x00f4
            r5 = r8
            goto L_0x00f4
        L_0x00f3:
            r5 = r8
        L_0x00f4:
            java.util.HashMap r4 = r15.A00     // Catch:{ JSONException -> 0x0137 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r0 = "error_title"
            java.lang.String r2 = r1.optString(r0, r8)     // Catch:{ JSONException -> 0x0137 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0137 }
            X.9df r0 = new X.9df     // Catch:{ JSONException -> 0x0137 }
            r0.<init>(r2, r1, r5)     // Catch:{ JSONException -> 0x0137 }
            r4.put(r6, r0)     // Catch:{ JSONException -> 0x0137 }
            goto L_0x006b
        L_0x0114:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/JSONException: "
            X.C17900vP.A0X(r2, r0, r1)
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/ JSONObject is null"
            goto L_0x0142
        L_0x0121:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: ErrorMapMetadata/getMessage/ FileNotFoundException: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            goto L_0x012f
        L_0x012d:
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/ file name is empty"
        L_0x012f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0134:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0137:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/JSONException: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
        L_0x0142:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0145:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A27.A00(X.A27):boolean");
    }

    public String A01(int i) {
        if (C18020vd.A05(C18040vf.A02, this.A05.A02, 698)) {
            return A03(String.valueOf(i));
        }
        return null;
    }

    public String A02(Bundle bundle, String str) {
        String A032;
        if (bundle != null) {
            if (!C18020vd.A05(C18040vf.A02, this.A05.A02, 698) || (A032 = A03(String.valueOf(bundle.getInt("error_code")))) == null) {
                return str;
            }
            return A032;
        }
        return str;
    }

    public A27(AnonymousClass118 r2, AnonymousClass1QD r3, AnonymousClass1QO r4, AnonymousClass00H r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
    }

    public String A03(String str) {
        if (A00(this)) {
            if (this.A00.containsKey(str)) {
                C186109df r0 = (C186109df) this.A00.get(str);
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                C17900vP.A0e("PAY: ErrorMapMetadata/getMessage/Error code not found. Error code: ", str, AnonymousClass000.A10());
            }
        }
        return null;
    }
}
