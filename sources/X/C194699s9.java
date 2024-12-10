package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: X.9s9  reason: invalid class name and case insensitive filesystem */
public class C194699s9 {
    public static String A03;
    public static C194699s9 A04;
    public Context A00;
    public SecretKey A01;
    public A8J A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(1:4)(1:5)|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            android.content.Context r2 = r8.A00     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "VAULT"
            r0 = 0
            android.content.SharedPreferences r7 = r2.getSharedPreferences(r1, r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = A03     // Catch:{ all -> 0x0090 }
            r3 = 0
            java.lang.String r2 = r7.getString(r0, r3)     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = A03     // Catch:{ all -> 0x0090 }
            r1.append(r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "IV"
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r1)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r7.getString(r0, r3)     // Catch:{ all -> 0x0090 }
            r4 = 2
            if (r2 == 0) goto L_0x0045
            byte[] r3 = android.util.Base64.decode(r2, r4)     // Catch:{ all -> 0x0090 }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ all -> 0x0090 }
            javax.crypto.Cipher r2 = X.AnonymousClass8BR.A18()     // Catch:{ all -> 0x0090 }
            javax.crypto.SecretKey r1 = r8.A01     // Catch:{ all -> 0x0090 }
            javax.crypto.spec.GCMParameterSpec r0 = X.AnonymousClass8BT.A11(r0)     // Catch:{ all -> 0x0090 }
            byte[] r2 = X.AnonymousClass8BS.A1Q(r1, r0, r2, r3, r4)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0090 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0047
        L_0x0045:
            java.lang.String r0 = "{}"
        L_0x0047:
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            org.json.JSONObject r0 = X.C17880vN.A15()     // Catch:{ all -> 0x0090 }
        L_0x0050:
            java.lang.String r1 = X.AnonymousClass8BS.A0k(r9, r10, r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "UTF-8"
            byte[] r6 = r1.getBytes(r0)     // Catch:{ all -> 0x0090 }
            javax.crypto.Cipher r2 = X.AnonymousClass8BR.A18()     // Catch:{ all -> 0x0090 }
            javax.crypto.SecretKey r1 = r8.A01     // Catch:{ all -> 0x0090 }
            r0 = 1
            r2.init(r0, r1)     // Catch:{ all -> 0x0090 }
            byte[] r3 = r2.getIV()     // Catch:{ all -> 0x0090 }
            byte[] r0 = r2.doFinal(r6)     // Catch:{ all -> 0x0090 }
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = A03     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ all -> 0x0090 }
            X.C17880vN.A1E(r2, r1, r0)     // Catch:{ all -> 0x0090 }
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = A03     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ all -> 0x0090 }
            X.C17880vN.A1E(r2, r1, r0)     // Catch:{ all -> 0x0090 }
            monitor-exit(r8)
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194699s9.A03(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.9s9, java.lang.Object] */
    public static C194699s9 A00(Context context, String str) {
        C194699s9 r5 = A04;
        boolean A1X = AnonymousClass000.A1X(r5) | (true ^ str.equals(A03));
        C194699s9 r52 = r5;
        if (A1X) {
            ? obj = new Object();
            obj.A02 = new A8J();
            A03 = str;
            obj.A00 = context;
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                obj.A01 = (SecretKey) instance.getKey(AnonymousClass000.A0y("-NPCI-Vault", AnonymousClass000.A11(str)), (char[]) null);
                Cipher.getInstance("AES/GCM/NoPadding").init(1, obj.A01);
            } catch (InvalidKeyException unused) {
                obj.A02();
            }
            A04 = obj;
            r52 = obj;
        }
        return r52;
    }

    public String A01(String str) {
        try {
            SharedPreferences sharedPreferences = this.A00.getSharedPreferences("VAULT", 0);
            String string = sharedPreferences.getString(A03, (String) null);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A03);
            String string2 = sharedPreferences.getString(AnonymousClass000.A0y("IV", A10), (String) null);
            if (string != null) {
                byte[] decode = Base64.decode(string, 2);
                byte[] decode2 = Base64.decode(string2, 2);
                return AnonymousClass8BW.A0x(AnonymousClass8BS.A1Q(this.A01, AnonymousClass8BT.A11(decode2), AnonymousClass8BR.A18(), decode, 2)).optString(str, "");
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void A02() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A03);
        this.A01 = A8J.A03(AnonymousClass000.A0y("-NPCI-Vault", A10));
        Cipher A18 = AnonymousClass8BR.A18();
        A18.init(1, this.A01);
        byte[] iv = A18.getIV();
        byte[] doFinal = A18.doFinal("{}".getBytes(DefaultCrypto.UTF_8));
        SharedPreferences sharedPreferences = this.A00.getSharedPreferences("VAULT", 0);
        C17880vN.A1E(sharedPreferences.edit(), A03, Base64.encodeToString(doFinal, 2));
        SharedPreferences.Editor edit = sharedPreferences.edit();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(A03);
        C17880vN.A1E(edit, AnonymousClass000.A0y("IV", A102), Base64.encodeToString(iv, 2));
    }
}
