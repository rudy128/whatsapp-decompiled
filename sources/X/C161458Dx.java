package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.sql.Date;
import org.json.JSONObject;

/* renamed from: X.8Dx  reason: invalid class name and case insensitive filesystem */
public class C161458Dx extends AnonymousClass01E {
    public Context A00;
    public String A01;
    public JSONObject A02;
    public A8J A03;
    public C192349oE A04;
    public C194699s9 A05;

    public static boolean A0I() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance.initialize(new KeyGenParameterSpec.Builder("demo_key", 1).build());
            PrivateKey privateKey = instance.generateKeyPair().getPrivate();
            return ((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void A00(String str, C161458Dx r13) {
        Boolean bool;
        String A012 = r13.A05.A01("ServerRiskParams");
        String A013 = r13.A05.A01("ClientRiskRules");
        if (A012.equals("")) {
            r13.A05.A03(str, "ServerRiskParams");
            if (A013.equals("")) {
                r13.A05.A03("{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}", "ClientRiskRules");
            }
        } else {
            try {
                bool = C20010A3a.A00(C17880vN.A16(A012));
            } catch (Exception unused) {
                bool = AnonymousClass000.A0h();
            }
            if (bool.booleanValue()) {
                Date date = new Date(Long.parseLong(AnonymousClass8BW.A0x(Base64.decode(C17880vN.A16(A012).getString("riskRules"), 2)).getString("timestamp")));
                JSONObject A0x = AnonymousClass8BW.A0x(Base64.decode(C17880vN.A16(str).getString("riskRules"), 2));
                r13.A02 = A0x;
                if (new Date(Long.parseLong(A0x.getString("timestamp"))).after(date)) {
                    r13.A05.A03(str, "ServerRiskParams");
                    if (A013.equals("")) {
                        A013 = "{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}";
                    }
                    JSONObject A16 = C17880vN.A16(A013);
                    A16.put("OTC", "0");
                    r13.A05.A03(AnonymousClass8BS.A0k("0", "COTA", A16), "ClientRiskRules");
                } else {
                    throw new Exception("Could not update State");
                }
            } else {
                throw new Exception("Could not update State");
            }
        }
        r13.A05.A03("", "PendingTxn");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        if (0 == 0) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03() {
        /*
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0022
        L_0x000c:
            r0 = 1
        L_0x000d:
            r4 = 1
            r3 = r0 ^ 1
            boolean r0 = A0I()
            r3 = r3 & r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 23
            boolean r0 = X.C108975cc.A1C(r2, r0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0099
            return r4
        L_0x0022:
            r0 = 10
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "/system/app/Superuser.apk"
            r5 = 0
            r3[r5] = r0
            java.lang.String r0 = "/sbin/su"
            r4 = 1
            r3[r4] = r0
            r1 = 2
            java.lang.String r0 = "/system/bin/su"
            r3[r1] = r0
            r1 = 3
            java.lang.String r0 = "/system/xbin/su"
            r3[r1] = r0
            r1 = 4
            java.lang.String r0 = "/data/local/xbin/su"
            r3[r1] = r0
            r1 = 5
            java.lang.String r0 = "/data/local/bin/su"
            r3[r1] = r0
            r1 = 6
            java.lang.String r0 = "/system/sd/xbin/su"
            r3[r1] = r0
            r1 = 7
            java.lang.String r0 = "/system/bin/failsafe/su"
            r3[r1] = r0
            r1 = 8
            java.lang.String r0 = "/data/local/su"
            r3[r1] = r0
            r1 = 9
            java.lang.String r0 = "/su/bin/su"
            r3[r1] = r0
            r2 = 10
            r1 = 0
        L_0x005d:
            r0 = r3[r1]
            boolean r0 = X.C108975cc.A1M(r0)
            if (r0 != 0) goto L_0x000c
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x005d
            r3 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0091 }
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "/system/xbin/which"
            r1[r5] = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "su"
            r1[r4] = r0     // Catch:{ all -> 0x0091 }
            java.lang.Process r3 = r2.exec(r1)     // Catch:{ all -> 0x0091 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x0091 }
            java.io.BufferedReader r0 = X.AnonymousClass8BW.A0W(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.readLine()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0093
            r3.destroy()
            goto L_0x000c
        L_0x0091:
            if (r3 == 0) goto L_0x0096
        L_0x0093:
            r3.destroy()
        L_0x0096:
            r0 = 0
            goto L_0x000d
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161458Dx.A03():boolean");
    }

    public boolean A2x(String str, String str2, String str3) {
        String A14 = C108955ca.A14(A8J.A04(C17900vP.A0H(str2, str, str3).toString()));
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry(A14);
            C194699s9 A002 = C194699s9.A00(this.A00, A14);
            this.A05 = A002;
            A002.A02();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
