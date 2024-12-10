package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1v8  reason: invalid class name and case insensitive filesystem */
public final class C40701v8 {
    public final C18030ve A00;

    public C40701v8(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.1vM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: long[]} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C40861vP A04(org.json.JSONObject r12) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.String r0 = "start"
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            X.1vL r9 = A01(r0)
            java.lang.String r0 = "duration"
            org.json.JSONObject r4 = r12.optJSONObject(r0)
            r10 = 0
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = "static"
            r1 = -1
            int r0 = r4.optInt(r0, r1)
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == r1) goto L_0x0047
            long r2 = (long) r0
            long r2 = r2 * r7
        L_0x0027:
            java.lang.String r0 = "repeat"
            org.json.JSONArray r6 = r4.optJSONArray(r0)
            if (r6 == 0) goto L_0x004a
            int r0 = r6.length()
            long[] r10 = new long[r0]
            int r5 = r6.length()
            r4 = 0
        L_0x003a:
            if (r4 >= r5) goto L_0x004a
            int r0 = r6.getInt(r4)
            long r0 = (long) r0
            long r0 = r0 * r7
            r10[r4] = r0
            int r4 = r4 + 1
            goto L_0x003a
        L_0x0047:
            r2 = -1
            goto L_0x0027
        L_0x004a:
            X.1vM r0 = new X.1vM
            r0.<init>(r10, r2)
            r10 = r0
        L_0x0050:
            java.lang.String r0 = "end"
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            X.1vL r2 = A01(r0)
            java.lang.String r0 = "activation"
            java.lang.String r1 = r12.optString(r0)
            X.C18070vi.A0b(r1)
            X.1vP r0 = new X.1vP
            r0.<init>(r10, r9, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40701v8.A04(org.json.JSONObject):X.1vP");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Failed to parse user notice content for notice id: ");
        r1.append(r3);
        com.whatsapp.util.Log.e(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a A[ExcHandler: IOException | JSONException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C59762mq A00(X.C40701v8 r19, org.json.JSONObject r20, int r21) {
        /*
            java.lang.String r18 = "default"
            java.lang.String r0 = "Failed to parse user notice content for notice id: "
            r3 = r21
            java.lang.String r2 = "policyVersion"
            r1 = r20
            int r20 = r1.getInt(r2)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r5 = "banner"
            boolean r4 = r1.has(r5)     // Catch:{ IOException | JSONException -> 0x011a }
            r9 = 0
            r2 = r19
            if (r4 == 0) goto L_0x008d
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ IOException | JSONException -> 0x011a }
            if (r5 == 0) goto L_0x008d
            java.lang.String r4 = "text"
            java.lang.String r13 = r5.getString(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r4 = "iconDescription"
            java.lang.String r16 = r5.getString(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r4 = "action"
            java.lang.String r17 = r5.getString(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            X.0ve r9 = r2.A00     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r4 = "icon"
            org.json.JSONObject r8 = r5.getJSONObject(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r7 = "v2"
            boolean r4 = r8.has(r7)     // Catch:{ IOException | JSONException -> 0x011a }
            r12 = 0
            if (r4 == 0) goto L_0x00fa
            r6 = 6674(0x1a12, float:9.352E-42)
            X.0vf r4 = X.C18040vf.A02     // Catch:{ IOException | JSONException -> 0x011a }
            boolean r4 = X.C18020vd.A05(r4, r9, r6)     // Catch:{ IOException | JSONException -> 0x011a }
            if (r4 == 0) goto L_0x00fa
            org.json.JSONObject r6 = r8.getJSONObject(r7)     // Catch:{ IOException | JSONException -> 0x011a }
        L_0x0052:
            java.lang.String r7 = "light"
            if (r6 != 0) goto L_0x00f4
            java.lang.String r14 = r8.getString(r7)     // Catch:{ IOException | JSONException -> 0x011a }
        L_0x005a:
            java.lang.String r4 = "dark"
            if (r6 != 0) goto L_0x00cb
            java.lang.String r15 = r8.getString(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            r11 = r12
        L_0x0063:
            X.C18070vi.A0b(r14)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r15)     // Catch:{ IOException | JSONException -> 0x011a }
            r4 = 1
            X.C18070vi.A0d(r14, r4)     // Catch:{ IOException | JSONException -> 0x011a }
            r4 = 2
            X.C18070vi.A0d(r15, r4)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r4 = "timing"
            org.json.JSONObject r4 = r5.getJSONObject(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            X.1vP r10 = r2.A04(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r13)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r16)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r17)     // Catch:{ IOException | JSONException -> 0x011a }
            X.2Lt r9 = new X.2Lt     // Catch:{ IOException | JSONException -> 0x011a }
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException | JSONException -> 0x011a }
        L_0x008d:
            java.lang.String r5 = "modal"
            r4 = 1
            X.2Lu r15 = r2.A02(r5, r1, r4)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r5 = "blocking-modal"
            r4 = 0
            X.2Lu r16 = r2.A02(r5, r1, r4)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r5 = "badged-notice"
            boolean r4 = r1.has(r5)     // Catch:{ IOException | JSONException -> 0x011a }
            r8 = 0
            if (r4 == 0) goto L_0x010f
            org.json.JSONObject r7 = r1.optJSONObject(r5)     // Catch:{ IOException | JSONException -> 0x011a }
            if (r7 == 0) goto L_0x010f
            java.lang.String r1 = "text"
            java.lang.String r6 = r7.getString(r1)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r1 = "action"
            java.lang.String r5 = r7.getString(r1)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r1 = "timing"
            org.json.JSONObject r1 = r7.getJSONObject(r1)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r1)     // Catch:{ IOException | JSONException -> 0x011a }
            X.1vP r4 = r2.A04(r1)     // Catch:{ IOException | JSONException -> 0x011a }
            java.lang.String r2 = "badgeExpirationInHours"
            int r1 = X.C62302rB.A06     // Catch:{ IOException | JSONException -> 0x011a }
            r8 = r1
            goto L_0x00fd
        L_0x00cb:
            java.lang.String r15 = X.A6n.A02(r4, r6)     // Catch:{ IOException | JSONException -> 0x011a }
            if (r15 != 0) goto L_0x00d5
            java.lang.String r15 = r6.getString(r7)     // Catch:{ IOException | JSONException -> 0x011a }
        L_0x00d5:
            java.lang.String r4 = "role"
            java.lang.String r4 = X.A6n.A02(r4, r6)     // Catch:{ IOException | JSONException -> 0x011a }
            X.4DO r11 = X.AnonymousClass4HG.A00(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            if (r11 != 0) goto L_0x00e3
            X.4DO r11 = X.AnonymousClass4DO.DEFAULT     // Catch:{ IOException | JSONException -> 0x011a }
        L_0x00e3:
            java.lang.String r4 = "style"
            java.lang.String r4 = X.A6n.A02(r4, r6)     // Catch:{ IOException | JSONException -> 0x011a }
            X.4DP r12 = X.AnonymousClass4HH.A00(r4)     // Catch:{ IOException | JSONException -> 0x011a }
            if (r12 != 0) goto L_0x0063
            X.4DP r12 = X.AnonymousClass4DP.PLAIN     // Catch:{ IOException | JSONException -> 0x011a }
            goto L_0x0063
        L_0x00f4:
            java.lang.String r14 = r6.getString(r7)     // Catch:{ IOException | JSONException -> 0x011a }
            goto L_0x005a
        L_0x00fa:
            r6 = r12
            goto L_0x0052
        L_0x00fd:
            int r1 = r7.getInt(r2)     // Catch:{ JSONException -> 0x0104, IOException | JSONException -> 0x011a }
            if (r1 >= 0) goto L_0x0104
            r1 = r8
        L_0x0104:
            X.C18070vi.A0b(r6)     // Catch:{ IOException | JSONException -> 0x011a }
            X.C18070vi.A0b(r5)     // Catch:{ IOException | JSONException -> 0x011a }
            X.2ma r8 = new X.2ma     // Catch:{ IOException | JSONException -> 0x011a }
            r8.<init>(r4, r6, r5, r1)     // Catch:{ IOException | JSONException -> 0x011a }
        L_0x010f:
            X.2mq r13 = new X.2mq     // Catch:{ IOException | JSONException -> 0x011a }
            r14 = r9
            r17 = r8
            r19 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ IOException | JSONException -> 0x011a }
            return r13
        L_0x011a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40701v8.A00(X.1v8, org.json.JSONObject, int):X.2mq");
    }

    public static final C40831vL A01(JSONObject jSONObject) {
        TimeZone timeZone;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("time");
        String string2 = jSONObject.getString("reference");
        C18070vi.A0b(string);
        C18070vi.A0d(string, 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        if ("utc".equalsIgnoreCase(string2)) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        C18070vi.A0X(timeZone);
        try {
            simpleDateFormat.setTimeZone(timeZone);
            Date parse = simpleDateFormat.parse(string);
            if (parse != null) {
                return new C40831vL(parse.getTime());
            }
            throw new IllegalStateException("Required value was null.");
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeTiming/getDate/Unable to parse date: ");
            sb.append(string);
            sb.append(" reference: ");
            sb.append(string2);
            Log.e(sb.toString());
            throw new RuntimeException(e);
        }
    }

    private final C48262Lu A02(String str, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        String string;
        String A02;
        AnonymousClass4DO A002;
        String str2;
        String str3;
        String str4 = str;
        JSONObject jSONObject3 = jSONObject;
        if (!jSONObject3.has(str4) || (optJSONObject = jSONObject3.optJSONObject(str4)) == null) {
            return null;
        }
        String string2 = optJSONObject.getString("title");
        String string3 = optJSONObject.getString("iconDescription");
        String string4 = optJSONObject.getString("buttonText");
        C18030ve r5 = this.A00;
        JSONObject jSONObject4 = optJSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        AnonymousClass4DP r21 = null;
        if (!jSONObject4.has("v2") || !C18020vd.A05(C18040vf.A02, r5, 6674)) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject4.getJSONObject("v2");
        }
        if (jSONObject2 == null) {
            string = jSONObject4.getString("light");
        } else {
            string = jSONObject2.getString("light");
        }
        if (jSONObject2 == null) {
            A02 = jSONObject4.getString("dark");
            A002 = null;
        } else {
            A02 = A6n.A02("dark", jSONObject2);
            if (A02 == null) {
                A02 = jSONObject2.getString("light");
            }
            A002 = AnonymousClass4HG.A00(A6n.A02("role", jSONObject2));
            if (A002 == null) {
                A002 = AnonymousClass4DO.DEFAULT;
            }
            r21 = AnonymousClass4HH.A00(A6n.A02("style", jSONObject2));
            if (r21 == null) {
                r21 = AnonymousClass4DP.PLAIN;
            }
        }
        C18070vi.A0b(string);
        C18070vi.A0b(A02);
        C18070vi.A0d(string, 1);
        C18070vi.A0d(A02, 2);
        JSONObject jSONObject5 = optJSONObject.getJSONObject("timing");
        C18070vi.A0b(jSONObject5);
        C40861vP A04 = A04(jSONObject5);
        C18070vi.A0b(string3);
        C18070vi.A0b(string2);
        C18070vi.A0b(string4);
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C18070vi.A0d(string3, 3);
        C18070vi.A0d(string2, 4);
        C18070vi.A0d(string4, 5);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = optJSONObject.getJSONArray("bullets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject6 = jSONArray.getJSONObject(i);
            String string5 = jSONObject6.getString("text");
            JSONObject optJSONObject2 = jSONObject6.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            if (optJSONObject2 != null) {
                str3 = optJSONObject2.getString("light");
                str2 = optJSONObject2.getString("dark");
            } else {
                str2 = null;
                str3 = null;
            }
            C18070vi.A0b(string5);
            arrayList.add(new C59432mI(string5, str3, str2));
        }
        String optString = optJSONObject.optString("body");
        if (!(optString == null || optString.length() == 0)) {
            str5 = optString;
        }
        String optString2 = optJSONObject.optString("footer");
        if (!(optString2 == null || optString2.length() == 0)) {
            str7 = optString2;
        }
        if (z) {
            str6 = optJSONObject.getString("dismissText");
            C18070vi.A0b(str6);
            C18070vi.A0d(str6, 0);
        }
        return new C48262Lu(A04, A002, r21, string, A02, string3, string2, string4, str5, str7, str6, arrayList);
    }

    public final C59762mq A03(InputStream inputStream, int i) {
        try {
            JSONObject A01 = AnonymousClass1EY.A01(inputStream);
            C17960vV.A07(A01);
            C18070vi.A0X(A01);
            return A00(this, A01, i);
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse user notice content for notice id: ");
            sb.append(i);
            Log.e(sb.toString(), e);
            return null;
        }
    }
}
