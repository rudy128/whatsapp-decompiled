package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1Cw  reason: invalid class name and case insensitive filesystem */
public class C22701Cw {
    public C53422cV A00;
    public C22711Cx A01;
    public C21521AlU A02;
    public boolean A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11P A05;
    public final C19830z4 A06;
    public final C22671Ct A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C18010vc A0A;
    public final AnonymousClass18O A0B;
    public final C22711Cx A0C;
    public final AnonymousClass00H A0D;

    public synchronized C53422cV A0D() {
        return A01();
    }

    public synchronized C21523AlW A0E() {
        C21523AlW alW;
        alW = A01().A01;
        if (alW == null) {
            throw new RuntimeException("AuthKeyStore/failed to get client static key pair");
        }
        return alW;
    }

    public synchronized C21521AlU A0F() {
        C21521AlU alU;
        byte[] decode;
        alU = this.A02;
        if (alU == null) {
            if (!this.A03) {
                String string = this.A0A.A05("keystore").getString("server_static_public", "");
                alU = null;
                try {
                    if (!TextUtils.isEmpty(string) && (decode = Base64.decode(string, 3)) != null) {
                        alU = new C21521AlU(decode);
                    }
                } catch (IllegalArgumentException e) {
                    Log.w("failed to deserialize server public key", e);
                }
                this.A02 = alU;
                this.A03 = true;
            }
        }
        return alU;
    }

    public synchronized void A0G() {
        A07(this);
        Log.i("clearing client static key pair");
        boolean commit = this.A0A.A05("keystore").edit().remove("client_static_keypair_enc").remove("client_static_keypair_pwd_enc").commit();
        C22711Cx r0 = this.A01;
        if (r0 != null) {
            r0.A07();
        }
        this.A07.A04();
        this.A0C.A07();
        this.A00 = null;
        if (!commit) {
            throw new RuntimeException("unable to clear client static keypair");
        }
    }

    public synchronized void A0I(C21521AlU alU) {
        Log.i("saving server static public key");
        if (this.A0A.A05("keystore").edit().putString("server_static_public", Base64.encodeToString(alU.A01, 3)).commit()) {
            this.A02 = alU;
            this.A03 = true;
        } else {
            throw new AssertionError("unable to write server static keypair");
        }
    }

    public synchronized byte[] A0J() {
        C21523AlW alW = A01().A01;
        if (alW == null) {
            return null;
        }
        return alW.A02.A01;
    }

    private int A00(SharedPreferences sharedPreferences, C21523AlW alW, C21523AlW alW2, int i) {
        if (alW2 == null || alW != null) {
            return i;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A08, 377)) {
            return i;
        }
        Log.w("AuthKeyStore/recovering PWD key");
        A06(sharedPreferences, this, alW2.A02());
        C21523AlW A022 = A02(sharedPreferences);
        sharedPreferences.edit().remove("client_static_keypair_enc_success").remove("client_static_keypair_enc_failed").apply();
        if (A022 != null) {
            return 5;
        }
        throw new RuntimeException("AuthKeyStore/failed to get client static key pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (A0B(r9, r7.A02()) != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0131 A[Catch:{ JSONException -> 0x0079 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized X.C53422cV A01() {
        /*
            r25 = this;
            r9 = r25
            monitor-enter(r9)
            A07(r9)     // Catch:{ all -> 0x0256 }
            X.2cV r1 = r9.A00     // Catch:{ all -> 0x0256 }
            if (r1 == 0) goto L_0x000e
            X.AlW r0 = r1.A01     // Catch:{ all -> 0x0256 }
            if (r0 != 0) goto L_0x0254
        L_0x000e:
            X.0vc r1 = r9.A0A     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "keystore"
            android.content.SharedPreferences r8 = r1.A05(r0)     // Catch:{ all -> 0x0256 }
            X.AlW r7 = r9.A02(r8)     // Catch:{ all -> 0x0256 }
            java.lang.String r11 = "can_user_android_key_store"
            boolean r0 = r8.contains(r11)     // Catch:{ all -> 0x0256 }
            r10 = 1
            if (r0 != 0) goto L_0x002e
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ all -> 0x0256 }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r11, r10)     // Catch:{ all -> 0x0256 }
            r0.commit()     // Catch:{ all -> 0x0256 }
        L_0x002e:
            X.1Cx r0 = r9.A01     // Catch:{ all -> 0x0256 }
            r2 = 0
            if (r0 == 0) goto L_0x020c
            boolean r0 = r8.getBoolean(r11, r2)     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x020c
            X.0ve r13 = r9.A08     // Catch:{ all -> 0x0256 }
            r0 = 375(0x177, float:5.25E-43)
            X.0vf r12 = X.C18040vf.A02     // Catch:{ all -> 0x0256 }
            int r24 = X.C18020vd.A00(r12, r13, r0)     // Catch:{ all -> 0x0256 }
            r0 = 384(0x180, float:5.38E-43)
            int r23 = X.C18020vd.A00(r12, r13, r0)     // Catch:{ all -> 0x0256 }
            r0 = 378(0x17a, float:5.3E-43)
            boolean r22 = X.C18020vd.A05(r12, r13, r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r14 = "client_static_keypair_enc"
            boolean r0 = r8.contains(r14)     // Catch:{ all -> 0x0256 }
            if (r0 != 0) goto L_0x0069
            if (r7 == 0) goto L_0x0069
            java.lang.String r0 = "AuthKeyStore/storing AndroidKeyStore key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            byte[] r0 = r7.A02()     // Catch:{ all -> 0x0256 }
            boolean r0 = A0B(r9, r0)     // Catch:{ all -> 0x0256 }
            r15 = 1
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r15 = 0
        L_0x006a:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0256 }
            X.AlW r6 = r9.A03(r0)     // Catch:{ JSONException -> 0x0073 }
            if (r6 != 0) goto L_0x007f
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            X.AlW r6 = r9.A03(r0)     // Catch:{ JSONException -> 0x0079 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = "read invalid json"
            X.C22711Cx.A00(r0, r1)     // Catch:{ all -> 0x0256 }
        L_0x007f:
            java.lang.String r21 = "client_static_keypair_enc_success"
            r0 = 0
            r2 = r21
            long r4 = r8.getLong(r2, r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r20 = "client_static_keypair_enc_failed"
            r2 = r20
            long r2 = r8.getLong(r2, r0)     // Catch:{ all -> 0x0256 }
            r0 = 831(0x33f, float:1.164E-42)
            boolean r0 = X.C18020vd.A05(r12, r13, r0)     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x00b8
            int r2 = r9.A00(r8, r7, r6, r15)     // Catch:{ all -> 0x0256 }
            if (r7 != 0) goto L_0x00a9
            r0 = 5
            if (r2 == r0) goto L_0x00a9
            java.lang.String r0 = "AuthKeyStore/stopUsingAndroidKeyStore/cant stop using AndroidKeyStore"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0236
        L_0x00a9:
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x0256 }
            r0 = 0
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r11, r0)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
            r2 = 6
            goto L_0x0236
        L_0x00b8:
            r18 = 1
            r17 = 2
            if (r7 == 0) goto L_0x0170
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0256 }
            r1.<init>()     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/accessed = "
            r1.append(r0)     // Catch:{ all -> 0x0256 }
            r1.append(r4)     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0256 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            if (r6 != 0) goto L_0x00da
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/read failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0139
        L_0x00da:
            byte[] r1 = r7.A02()     // Catch:{ all -> 0x0256 }
            byte[] r0 = r6.A02()     // Catch:{ all -> 0x0256 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x0134
            long r4 = r4 + r18
            r0 = r24
            long r0 = (long) r0     // Catch:{ all -> 0x0256 }
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x010e
            r0 = r23
            long r0 = (long) r0     // Catch:{ all -> 0x0256 }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x010e
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            if (r22 == 0) goto L_0x010e
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
            r15 = 4
            goto L_0x010f
        L_0x010e:
            r15 = 3
        L_0x010f:
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x0256 }
            r0 = r21
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
            X.2FP r10 = new X.2FP     // Catch:{ all -> 0x0256 }
            r10.<init>()     // Catch:{ all -> 0x0256 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0256 }
            r10.A01 = r0     // Catch:{ all -> 0x0256 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0256 }
            r10.A02 = r0     // Catch:{ all -> 0x0256 }
            r1 = 3
            r0 = 5
            if (r15 != r1) goto L_0x0214
            r0 = 4
            goto L_0x0214
        L_0x0134:
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/read wrong key"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
        L_0x0139:
            r0 = r15
            r15 = 1
            if (r0 == r10) goto L_0x013e
            r15 = 2
        L_0x013e:
            long r2 = r2 + r18
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x0256 }
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
            X.2FO r1 = new X.2FO     // Catch:{ all -> 0x0256 }
            r1.<init>()     // Catch:{ all -> 0x0256 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0256 }
            r1.A01 = r0     // Catch:{ all -> 0x0256 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0256 }
            r1.A02 = r0     // Catch:{ all -> 0x0256 }
            r0 = 3
            if (r15 != r10) goto L_0x0162
            r0 = 2
        L_0x0162:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0256 }
            r1.A00 = r0     // Catch:{ all -> 0x0256 }
            X.18K r0 = r9.A09     // Catch:{ all -> 0x0256 }
            r0.CC4(r1)     // Catch:{ all -> 0x0256 }
            r6 = 0
            goto L_0x021f
        L_0x0170:
            r0 = 0
            if (r6 == 0) goto L_0x0177
            r15 = 4
            goto L_0x021f
        L_0x0177:
            boolean r16 = r8.contains(r14)     // Catch:{ all -> 0x0256 }
            if (r16 != 0) goto L_0x01a4
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore enabled, but have no keys, need to generate one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            r0 = r24
            long r0 = (long) r0     // Catch:{ all -> 0x0256 }
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0193
            r0 = r23
            long r0 = (long) r0     // Catch:{ all -> 0x0256 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0193
            if (r22 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r10 = 0
        L_0x0194:
            X.AlW r7 = r9.A04(r10)     // Catch:{ all -> 0x0256 }
            boolean r0 = r8.contains(r14)     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x01a0
            r17 = 4
        L_0x01a0:
            r15 = r17
            goto L_0x0232
        L_0x01a4:
            boolean r2 = r8.contains(r14)     // Catch:{ all -> 0x0256 }
            if (r2 == 0) goto L_0x021f
            java.lang.String r4 = "android_key_store_verified_failures"
            long r0 = r8.getLong(r4, r0)     // Catch:{ all -> 0x0256 }
            long r0 = r0 + r18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0256 }
            r3.<init>()     // Catch:{ all -> 0x0256 }
            java.lang.String r2 = "AuthKeyStore/failed to load auth key in \"verified\" AndroidKeyStore state/ failedCount = "
            r3.append(r2)     // Catch:{ all -> 0x0256 }
            r3.append(r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0256 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0256 }
            r2 = 376(0x178, float:5.27E-43)
            int r3 = X.C18020vd.A00(r12, r13, r2)     // Catch:{ all -> 0x0256 }
            r2 = -1
            if (r3 == r2) goto L_0x020a
            long r2 = (long) r3     // Catch:{ all -> 0x0256 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ff
            if (r22 == 0) goto L_0x01ff
            java.lang.String r0 = "AuthKeyStore/failed too much must recover"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            r9.A0G()     // Catch:{ all -> 0x0256 }
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x0256 }
            r0 = r21
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch:{ all -> 0x0256 }
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0256 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x0256 }
            r1 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r11, r1)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
            X.AlW r7 = r9.A04(r1)     // Catch:{ all -> 0x0256 }
            goto L_0x020a
        L_0x01ff:
            android.content.SharedPreferences$Editor r2 = r8.edit()     // Catch:{ all -> 0x0256 }
            android.content.SharedPreferences$Editor r0 = r2.putLong(r4, r0)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
        L_0x020a:
            r15 = 2
            goto L_0x0232
        L_0x020c:
            if (r7 != 0) goto L_0x0212
            X.AlW r7 = r9.A04(r2)     // Catch:{ all -> 0x0256 }
        L_0x0212:
            r6 = 0
            goto L_0x0236
        L_0x0214:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0256 }
            r10.A00 = r0     // Catch:{ all -> 0x0256 }
            X.18K r0 = r9.A09     // Catch:{ all -> 0x0256 }
            r0.CC7(r10)     // Catch:{ all -> 0x0256 }
        L_0x021f:
            java.lang.String r1 = "android_key_store_verified_failures"
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x0232
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ all -> 0x0256 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch:{ all -> 0x0256 }
            r0.apply()     // Catch:{ all -> 0x0256 }
        L_0x0232:
            int r2 = r9.A00(r8, r7, r6, r15)     // Catch:{ all -> 0x0256 }
        L_0x0236:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0256 }
            r1.<init>()     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "AuthKeyStore/current AES state = "
            r1.append(r0)     // Catch:{ all -> 0x0256 }
            r1.append(r2)     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0256 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0256 }
            if (r7 != 0) goto L_0x024d
            r7 = r6
        L_0x024d:
            X.2cV r1 = new X.2cV     // Catch:{ all -> 0x0256 }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0256 }
            r9.A00 = r1     // Catch:{ all -> 0x0256 }
        L_0x0254:
            monitor-exit(r9)
            return r1
        L_0x0256:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22701Cw.A01():X.2cV");
    }

    private C21523AlW A02(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("client_static_keypair_pwd_enc", (String) null);
        if (string == null) {
            return null;
        }
        try {
            this.A0D.get();
            C191309mN A002 = C196639vO.A00(new JSONArray(string));
            if (A002 == null) {
                return null;
            }
            if (A002.A00 != 2) {
                Log.e("AuthKeyStore/readClientStaticKeypairEnc 3 not expected type");
                return null;
            }
            byte[] A082 = this.A0C.A08(A002, AnonymousClass00R.A01);
            Log.i("AuthKeyStore/readClientStaticKeypairEnc 3");
            if (A082 != null) {
                return C21523AlW.A01(A082);
            }
            Log.e("AuthKeyStore/readClientStaticKeypairEnc/failed to read data");
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private C21523AlW A03(Integer num) {
        C22711Cx r0;
        SharedPreferences A052 = this.A0A.A05("keystore");
        String string = A052.getString("client_static_keypair_enc", (String) null);
        if (string == null) {
            return null;
        }
        this.A0D.get();
        C191309mN A002 = C196639vO.A00(new JSONArray(string));
        if (A002 == null) {
            return null;
        }
        if (A002.A00 != 0) {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc not supported type");
            A05(A052);
        } else if (Build.VERSION.SDK_INT < 23 || (r0 = this.A01) == null) {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/not supported sdk for type");
            A05(A052);
            return null;
        } else {
            byte[] A082 = r0.A08(A002, num);
            Log.i("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc");
            if (A082 != null) {
                return C21523AlW.A01(A082);
            }
        }
        Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/failed to read data");
        return null;
    }

    private C21523AlW A04(boolean z) {
        SharedPreferences A052 = this.A0A.A05("keystore");
        StringBuilder sb = new StringBuilder();
        sb.append("AuthKeyStore/generating new client static keypair/store 1 = ");
        sb.append(z);
        Log.i(sb.toString());
        C21523AlW A002 = C21523AlW.A00();
        byte[] A022 = A002.A02();
        if (!z || !A0B(this, A022)) {
            A06(A052, this, A022);
        }
        C19830z4.A00(this.A06).putInt("connection_lc", 0).apply();
        return A002;
    }

    public static void A07(C22701Cw r6) {
        C170668qT r0;
        if (r6.A01 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                C18010vc r4 = r6.A0A;
                SharedPreferences A052 = r4.A05("keystore");
                C18030ve r3 = r6.A08;
                String A012 = C18020vd.A01(C18040vf.A02, r3, 388);
                StringBuilder sb = new StringBuilder();
                sb.append(Build.MANUFACTURER);
                sb.append(";");
                if (!A012.contains(sb.toString()) || !A052.contains("client_static_keypair_pwd_enc")) {
                    r0 = new C170668qT(r6.A04, r6.A0B, r3, r4);
                    r6.A01 = r0;
                }
            }
            r0 = null;
            r6.A01 = r0;
        }
    }

    private boolean A09(SharedPreferences sharedPreferences, byte[] bArr) {
        C21523AlW A022;
        if (!A0C(this.A0C.A06(bArr), "client_static_keypair_pwd_enc") || (A022 = A02(sharedPreferences)) == null || !Arrays.equals(bArr, A022.A02())) {
            C22711Cx.A00("failed to store and read correct key", new RuntimeException());
            return false;
        }
        Log.i("AuthKeyStore/storedAndCanRead/3");
        return true;
    }

    public static boolean A0A(C22701Cw r2, C21523AlW alW) {
        try {
            A06(r2.A0A.A05("keystore"), r2, alW.A02());
            return true;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("authkeystore/overwriteExistingKeypairPwd: ");
            sb.append(e);
            Log.e(sb.toString());
            return false;
        }
    }

    public static boolean A0B(C22701Cw r3, byte[] bArr) {
        SharedPreferences A052 = r3.A0A.A05("keystore");
        if (!TextUtils.isEmpty(A052.getString("client_static_keypair_enc", (String) null))) {
            return false;
        }
        C22711Cx r0 = r3.A01;
        if (r0 != null && (r3.A08(A052, r0, bArr) || r3.A08(A052, r3.A01, bArr))) {
            return true;
        }
        Log.w("AuthKeyStore/ensureEncKeyStored/failed to use enc csk");
        return false;
    }

    private boolean A0C(C191309mN r3, String str) {
        String A002;
        SharedPreferences A052 = this.A0A.A05("keystore");
        if (r3 == null || (A002 = r3.A00()) == null) {
            Log.e("AuthKeyStore/failed to store clientStaticKeypair/cant generate json");
            return false;
        }
        boolean commit = A052.edit().putString(str, A002).commit();
        if (!commit) {
            Log.e("AuthKeyStore/failed to store clientStaticKeypair");
        }
        return commit;
    }

    public void A0H(int i) {
        SharedPreferences A052 = this.A0A.A05("keystore");
        if (i > 5) {
            i = 5;
        } else if (i < 0) {
            i = 0;
        }
        A052.edit().putInt("remaining_auth_key_rotation_attempts", i).apply();
    }

    public C22701Cw(AnonymousClass190 r2, AnonymousClass18O r3, AnonymousClass11P r4, C19830z4 r5, C22671Ct r6, C22661Cs r7, C18030ve r8, AnonymousClass18K r9, C18010vc r10, AnonymousClass00H r11) {
        this.A05 = r4;
        this.A08 = r8;
        this.A04 = r2;
        this.A09 = r9;
        this.A0B = r3;
        this.A0D = r11;
        this.A06 = r5;
        this.A0A = r10;
        this.A07 = r6;
        this.A0C = new C22721Cy(r2, r3, r7, r10);
    }

    public static void A05(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.edit().remove("client_static_keypair_enc").commit()) {
            Log.w("AuthKeyStore/failed to clear key pair");
        }
    }

    public static void A06(SharedPreferences sharedPreferences, C22701Cw r2, byte[] bArr) {
        if (!r2.A09(sharedPreferences, bArr) && !r2.A09(sharedPreferences, bArr)) {
            throw new RuntimeException("unable to write client static keypair");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (java.util.Arrays.equals(r5, r0.A02()) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        com.whatsapp.util.Log.i("AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        X.C22711Cx.A00("read invalid json", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 == null) goto L_0x0031;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08(android.content.SharedPreferences r3, X.C22711Cx r4, byte[] r5) {
        /*
            r2 = this;
            X.9mN r1 = r4.A06(r5)
            java.lang.String r0 = "client_static_keypair_enc"
            boolean r0 = r2.A0C(r1, r0)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.AlW r0 = r2.A03(r1)     // Catch:{ JSONException -> 0x0014 }
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            X.AlW r0 = r2.A03(r1)     // Catch:{ JSONException -> 0x002b }
            if (r0 == 0) goto L_0x0031
        L_0x001a:
            byte[] r0 = r0.A02()
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            return r0
        L_0x002b:
            r1 = move-exception
            java.lang.String r0 = "read invalid json"
            X.C22711Cx.A00(r0, r1)
        L_0x0031:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            java.lang.String r0 = "failed to store and read correct key"
            X.C22711Cx.A00(r0, r1)
            A05(r3)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22701Cw.A08(android.content.SharedPreferences, X.1Cx, byte[]):boolean");
    }
}
