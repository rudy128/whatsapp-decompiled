package X;

import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Ny  reason: invalid class name and case insensitive filesystem */
public class C180799Ny {
    public C180709Np A00;
    public String A01;
    public C192349oE A02;

    public C21336AiM A00(Boolean bool, String str, String str2, String str3, JSONObject jSONObject) {
        C21337AiN aiN;
        StringBuilder A10;
        C21336AiM aiM = null;
        try {
            jSONObject.getString("credType");
            String string = jSONObject.getString("txnId");
            String string2 = jSONObject.getString("credential");
            jSONObject.getString("appId");
            jSONObject.getString("deviceId");
            jSONObject.getString("mobileNumber");
            C192349oE r1 = this.A02;
            if (r1 != null) {
                r1.toString();
            }
            String str4 = ((C187049fB) AnonymousClass8BS.A0Y(r1.A00())).A02;
            Matcher A0z = AnonymousClass8BU.A0z(str, "\\{([^}]*)\\}");
            StringBuffer stringBuffer = new StringBuffer();
            if (A0z.find()) {
                String group = A0z.group();
                String substring = group.substring(1, group.length() - 1);
                aiM = null;
                try {
                    if (bool.booleanValue()) {
                        aiM = this.A00.A00(true, "NPCI-LITE", string, string2, substring, str4);
                        aiM.type = str2;
                        aiM.subType = str3;
                        aiN = aiM.data;
                        A10 = AnonymousClass000.A10();
                        A10.append("2.3.lite-v1.8|");
                        A10.append(aiN.encryptedBase64String);
                    } else {
                        aiM = this.A00.A00(AnonymousClass000.A0h(), this.A01, string, string2, substring, str4);
                        aiM.type = str2;
                        aiM.subType = str3;
                        aiN = aiM.data;
                        A10 = AnonymousClass000.A10();
                        A10.append("2.3-v1.8|");
                        A10.append(aiN.encryptedBase64String);
                    }
                    aiN.encryptedBase64String = A10.toString();
                } catch (Exception unused) {
                }
                A0z.appendReplacement(stringBuffer, Matcher.quoteReplacement(aiM.data.encryptedBase64String.replaceAll("\n", "")));
            }
            if (stringBuffer.length() > 0) {
                A0z.appendTail(stringBuffer);
            }
            if (aiM != null) {
                aiM.data.encryptedBase64String = stringBuffer.toString();
            }
            return aiM;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(1:5)|6|7|8|9|10|(1:12)|35|13|14|15|18|19|(1:21)(1:23)|22|24|25|28|29|30|31|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.lang.String r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            java.lang.String r0 = "appId"
            r13.getString(r0)     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r0 = "deviceId"
            r13.getString(r0)     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r0 = "mobileNumber"
            r13.getString(r0)     // Catch:{ JSONException -> 0x00bd }
            X.9oE r0 = r11.A02
            if (r0 == 0) goto L_0x0016
            r0.toString()
        L_0x0016:
            java.util.ArrayList r0 = r0.A00()
            java.lang.Object r0 = X.AnonymousClass8BS.A0Y(r0)
            X.9fB r0 = (X.C187049fB) r0
            java.lang.String r10 = r0.A02
            r6 = 0
            java.lang.String r8 = "|"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00bc }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x00a8 }
            r1.<init>()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            byte[] r3 = X.AnonymousClass8BX.A1b(r0, r1)     // Catch:{ Exception -> 0x00a8 }
            r9 = 2
            java.lang.String r5 = X.C196979vx.A00(r3, r9)     // Catch:{ Exception -> 0x00a8 }
            byte[] r4 = X.C197719x9.A00(r12, r5)     // Catch:{ Exception -> 0x00a8 }
            int r0 = r10.length()     // Catch:{ Exception -> 0x00a8 }
            int r2 = r0 / 2
            byte[] r1 = new byte[r2]     // Catch:{ Exception -> 0x00a8 }
            r0 = 0
        L_0x0046:
            if (r0 >= r2) goto L_0x004e
            X.AnonymousClass8BY.A1L(r10, r1, r0)     // Catch:{ Exception -> 0x00a8 }
            int r0 = r0 + 1
            goto L_0x0046
        L_0x004e:
            javax.crypto.spec.SecretKeySpec r2 = X.AnonymousClass8BS.A0v(r1)     // Catch:{ Exception -> 0x00a8 }
            javax.crypto.Cipher r1 = X.AnonymousClass8BR.A18()     // Catch:{ Exception -> 0x00a8 }
            javax.crypto.spec.GCMParameterSpec r0 = X.AnonymousClass8BT.A11(r3)     // Catch:{ Exception -> 0x00a8 }
            r3 = 1
            byte[] r0 = X.AnonymousClass8BS.A1Q(r2, r0, r1, r4, r3)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = X.C196979vx.A00(r0, r9)     // Catch:{ Exception -> 0x00a8 }
            javax.crypto.SecretKey r2 = X.AnonymousClass8BX.A0r()     // Catch:{ NoSuchAlgorithmException -> 0x0068 }
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            byte[] r1 = r12.getBytes()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "AES"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x00a8 }
            r0.init(r3, r2)     // Catch:{ Exception -> 0x00a8 }
            byte[] r0 = r0.doFinal(r1)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r3 = X.C196979vx.A00(r0, r9)     // Catch:{ Exception -> 0x00a8 }
            byte[] r0 = r2.getEncoded()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = X.C196979vx.A00(r0, r9)     // Catch:{ Exception -> 0x00a8 }
            java.security.cert.Certificate r0 = X.C182179Tj.A00     // Catch:{ Exception -> 0x00a8 }
            if (r0 == 0) goto L_0x0093
            java.security.PublicKey r1 = r0.getPublicKey()     // Catch:{ Exception -> 0x00a8 }
        L_0x008e:
            byte[] r0 = r2.getBytes()     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0095
        L_0x0093:
            r1 = 0
            goto L_0x008e
        L_0x0095:
            byte[] r0 = X.AnonymousClass8BY.A1Y(r1, r0)     // Catch:{ Exception -> 0x009a }
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            java.lang.String r0 = X.C196979vx.A00(r0, r9)     // Catch:{ Exception -> 0x00a8 }
            X.C17890vO.A10(r4, r8, r3, r7)     // Catch:{ Exception -> 0x00a8 }
            r7.append(r8)     // Catch:{ Exception -> 0x00a8 }
            X.C17890vO.A10(r0, r8, r5, r7)     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x00bc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r0 = "2.3-v1.8|"
            r1.append(r0)     // Catch:{ Exception -> 0x00bc }
            r1.append(r6)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00bc }
        L_0x00bc:
            return r6
        L_0x00bd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180799Ny.A01(java.lang.String, org.json.JSONObject):java.lang.String");
    }
}
