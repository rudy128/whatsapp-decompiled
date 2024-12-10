package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.security.KeyStore;
import java.security.Signature;
import java.security.cert.Certificate;

/* renamed from: X.1Ct  reason: invalid class name and case insensitive filesystem */
public class C22671Ct {
    public final C19830z4 A00;
    public final AnonymousClass19D A01;
    public final C18030ve A02;
    public final AnonymousClass1CM A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass18K A06;

    private String A00() {
        String A012 = C18020vd.A01(C18040vf.A02, this.A02, 2074);
        if (A012 == null) {
            A012 = "my_personal_mini_pony";
        }
        String string = ((SharedPreferences) this.A00.A00.get()).getString("ka_key_store_dynamic_alias_suffix", (String) null);
        if (TextUtils.isEmpty(string)) {
            return A012;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A012);
        sb.append("_");
        sb.append(string);
        return sb.toString();
    }

    private String A01() {
        StringBuilder sb = new StringBuilder();
        sb.append(C18020vd.A01(C18040vf.A02, this.A02, 2074));
        sb.append("_static");
        String obj = sb.toString();
        if (obj == null) {
            obj = "my_personal_mini_pony_static";
        }
        String string = ((SharedPreferences) this.A00.A00.get()).getString("ka_key_store_static_alias_suffix", (String) null);
        if (TextUtils.isEmpty(string)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("_");
        sb2.append(string);
        return sb2.toString();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[Catch:{ Exception -> 0x0247, all -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8 A[SYNTHETIC, Splitter:B:36:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010d A[Catch:{ Exception -> 0x0247, all -> 0x028f }] */
    private void A02(java.lang.Integer r22, byte[] r23) {
        /*
            r21 = this;
            r5 = r23
            java.lang.String r12 = "AndroidKeyStore"
            java.lang.String r9 = "att-gen"
            r4 = r21
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x02a8
            X.11P r13 = r4.A05
            long r15 = android.os.SystemClock.elapsedRealtime()
            java.security.KeyStore r8 = java.security.KeyStore.getInstance(r12)     // Catch:{ Exception -> 0x0247 }
            r0 = 0
            r8.load(r0)     // Catch:{ Exception -> 0x0247 }
            java.lang.Integer r3 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x0247 }
            r6 = r22
            if (r6 != r3) goto L_0x0033
            java.lang.String r7 = r4.A01()     // Catch:{ Exception -> 0x0247 }
        L_0x0026:
            java.security.KeyStore$Entry r2 = r8.getEntry(r7, r0)     // Catch:{ Exception -> 0x0247 }
            boolean r10 = r2 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ Exception -> 0x0247 }
            boolean r0 = r4.A06()     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x0046
            goto L_0x0038
        L_0x0033:
            java.lang.String r7 = r4.A00()     // Catch:{ Exception -> 0x0247 }
            goto L_0x0026
        L_0x0038:
            if (r6 != r3) goto L_0x0043
            X.1CM r0 = r4.A03     // Catch:{ Exception -> 0x0247 }
            boolean r0 = r0.A04()     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            if (r10 == 0) goto L_0x00ad
            goto L_0x0049
        L_0x0046:
            if (r10 != 0) goto L_0x0277
            goto L_0x0064
        L_0x0049:
            X.0ve r11 = r4.A02     // Catch:{ Exception -> 0x0247 }
            r1 = 2076(0x81c, float:2.909E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0247 }
            java.lang.String r1 = X.C18020vd.A01(r0, r11, r1)     // Catch:{ Exception -> 0x0247 }
            r0 = r2
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch:{ Exception -> 0x0247 }
            java.security.PrivateKey r0 = r0.getPrivateKey()     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = r0.getAlgorithm()     // Catch:{ Exception -> 0x0247 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0247 }
            if (r0 != 0) goto L_0x00ad
        L_0x0064:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x0247 }
            if (r6 != r0) goto L_0x00f6
            X.0z4 r11 = r4.A00     // Catch:{ Exception -> 0x0247 }
            X.00H r0 = r11.A00     // Catch:{ Exception -> 0x0247 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0247 }
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14     // Catch:{ Exception -> 0x0247 }
            java.lang.String r10 = "ka_retried_ts"
            r0 = 0
            long r19 = r14.getLong(r10, r0)     // Catch:{ Exception -> 0x0247 }
            X.0ve r14 = r4.A02     // Catch:{ Exception -> 0x0247 }
            r1 = 2427(0x97b, float:3.401E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0247 }
            int r0 = X.C18020vd.A00(r0, r14, r1)     // Catch:{ Exception -> 0x0247 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0247 }
            long r19 = r19 + r0
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0247 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 / r0
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x0277
            boolean r0 = r4.A06()     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x00f6
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0247 }
            r17 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r17
            android.content.SharedPreferences$Editor r11 = X.C19830z4.A00(r11)     // Catch:{ Exception -> 0x0247 }
            android.content.SharedPreferences$Editor r0 = r11.putLong(r10, r0)     // Catch:{ Exception -> 0x0247 }
            r0.apply()     // Catch:{ Exception -> 0x0247 }
            goto L_0x00f6
        L_0x00ad:
            X.0z4 r0 = r4.A00     // Catch:{ Exception -> 0x0247 }
            if (r6 != r3) goto L_0x00db
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x0247 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0247 }
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14     // Catch:{ Exception -> 0x0247 }
            java.lang.String r11 = "ka_static_refresh_ts"
            r0 = 0
            long r19 = r14.getLong(r11, r0)     // Catch:{ Exception -> 0x0247 }
            X.19D r11 = r4.A01     // Catch:{ Exception -> 0x0247 }
            r1 = 4878(0x130e, float:6.836E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0247 }
            int r0 = X.C18020vd.A00(r0, r11, r1)     // Catch:{ Exception -> 0x0247 }
        L_0x00cb:
            long r0 = (long) r0     // Catch:{ Exception -> 0x0247 }
            long r19 = r19 + r0
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0247 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 / r0
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x0046
            goto L_0x0064
        L_0x00db:
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x0247 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0247 }
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14     // Catch:{ Exception -> 0x0247 }
            java.lang.String r11 = "ka_refresh_ts"
            r0 = 0
            long r19 = r14.getLong(r11, r0)     // Catch:{ Exception -> 0x0247 }
            X.0ve r11 = r4.A02     // Catch:{ Exception -> 0x0247 }
            r1 = 2079(0x81f, float:2.913E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0247 }
            int r0 = X.C18020vd.A00(r0, r11, r1)     // Catch:{ Exception -> 0x0247 }
            goto L_0x00cb
        L_0x00f6:
            if (r2 == 0) goto L_0x0101
            r8.deleteEntry(r7)     // Catch:{ Exception -> 0x00fc }
            goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "blacknoise/error deleting previous pair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0247 }
        L_0x0101:
            X.0ve r14 = r4.A02     // Catch:{ Exception -> 0x0247 }
            r0 = 2076(0x81c, float:2.909E-42)
            X.0vf r11 = X.C18040vf.A02     // Catch:{ Exception -> 0x0247 }
            java.lang.String r10 = X.C18020vd.A01(r11, r14, r0)     // Catch:{ Exception -> 0x0247 }
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "EC"
        L_0x010f:
            java.security.KeyPairGenerator r2 = java.security.KeyPairGenerator.getInstance(r10, r12)     // Catch:{ Exception -> 0x0247 }
            java.util.Date r12 = new java.util.Date     // Catch:{ Exception -> 0x0247 }
            r12.<init>()     // Catch:{ Exception -> 0x0247 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0247 }
            r7 = 2079(0x81f, float:2.913E-42)
            int r7 = X.C18020vd.A00(r11, r14, r7)     // Catch:{ Exception -> 0x0247 }
            long r7 = (long) r7     // Catch:{ Exception -> 0x0247 }
            r17 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r17
            long r0 = r0 + r7
            r12.setTime(r0)     // Catch:{ Exception -> 0x0247 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0247 }
            if (r6 != r3) goto L_0x0140
            X.0z4 r8 = r4.A00     // Catch:{ all -> 0x0244 }
            X.00H r0 = r8.A00     // Catch:{ all -> 0x0244 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0244 }
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "ka_key_store_static_alias_suffix"
            r0 = 0
            java.lang.String r0 = r7.getString(r1, r0)     // Catch:{ all -> 0x0244 }
            goto L_0x0151
        L_0x0140:
            X.0z4 r8 = r4.A00     // Catch:{ all -> 0x0244 }
            X.00H r0 = r8.A00     // Catch:{ all -> 0x0244 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0244 }
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "ka_key_store_dynamic_alias_suffix"
            r0 = 0
            java.lang.String r0 = r7.getString(r1, r0)     // Catch:{ all -> 0x0244 }
        L_0x0151:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0244 }
            if (r0 != 0) goto L_0x0163
            if (r6 != r3) goto L_0x015e
            java.lang.String r3 = r4.A01()     // Catch:{ all -> 0x0244 }
            goto L_0x0190
        L_0x015e:
            java.lang.String r3 = r4.A00()     // Catch:{ all -> 0x0244 }
            goto L_0x0190
        L_0x0163:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0244 }
            if (r6 != r3) goto L_0x017f
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r8)     // Catch:{ all -> 0x0244 }
            java.lang.String r0 = "ka_key_store_static_alias_suffix"
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r1)     // Catch:{ all -> 0x0244 }
            r0.apply()     // Catch:{ all -> 0x0244 }
            java.lang.String r3 = r4.A01()     // Catch:{ all -> 0x0244 }
            goto L_0x0190
        L_0x017f:
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r8)     // Catch:{ all -> 0x0244 }
            java.lang.String r0 = "ka_key_store_dynamic_alias_suffix"
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r1)     // Catch:{ all -> 0x0244 }
            r0.apply()     // Catch:{ all -> 0x0244 }
            java.lang.String r3 = r4.A00()     // Catch:{ all -> 0x0244 }
        L_0x0190:
            monitor-exit(r4)     // Catch:{ Exception -> 0x0247 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0247 }
            r1.<init>()     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = "blacknoise/generating key pair with alias="
            r1.append(r0)     // Catch:{ Exception -> 0x0247 }
            r1.append(r3)     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0247 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0247 }
            r0 = 4
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x0247 }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x0247 }
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0247 }
            java.lang.String r3 = "SHA-256"
            r7 = 0
            r0[r7] = r3     // Catch:{ Exception -> 0x0247 }
            java.lang.String r3 = "SHA-512"
            r8 = 1
            r0[r8] = r3     // Catch:{ Exception -> 0x0247 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setDigests(r0)     // Catch:{ Exception -> 0x0247 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setUserAuthenticationRequired(r7)     // Catch:{ Exception -> 0x0247 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r0.setCertificateNotAfter(r12)     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = "RSA"
            boolean r0 = r10.equals(r0)     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = "PKCS1"
            r1[r7] = r0     // Catch:{ Exception -> 0x0247 }
            r3.setSignaturePaddings(r1)     // Catch:{ Exception -> 0x0247 }
        L_0x01d5:
            boolean r0 = X.AnonymousClass112.A02()     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x0212
            if (r23 != 0) goto L_0x01ec
            java.security.SecureRandom r1 = X.C22691Cv.A00()     // Catch:{ Exception -> 0x0247 }
            r0 = 2078(0x81e, float:2.912E-42)
            int r0 = X.C18020vd.A00(r11, r14, r0)     // Catch:{ Exception -> 0x0247 }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0247 }
            r1.nextBytes(r5)     // Catch:{ Exception -> 0x0247 }
        L_0x01ec:
            long r0 = X.AnonymousClass11P.A01(r13)     // Catch:{ Exception -> 0x0247 }
            long r0 = r0 / r17
            int r10 = r5.length     // Catch:{ Exception -> 0x0247 }
            int r10 = r10 + 8
            int r10 = r10 + 1
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r10)     // Catch:{ Exception -> 0x0247 }
            java.nio.ByteOrder r10 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0247 }
            r11.order(r10)     // Catch:{ Exception -> 0x0247 }
            r11.putLong(r0)     // Catch:{ Exception -> 0x0247 }
            r0 = 31
            r11.put(r0)     // Catch:{ Exception -> 0x0247 }
            r11.put(r5)     // Catch:{ Exception -> 0x0247 }
            byte[] r0 = r11.array()     // Catch:{ Exception -> 0x0247 }
            r3.setAttestationChallenge(r0)     // Catch:{ Exception -> 0x0247 }
        L_0x0212:
            boolean r0 = X.AnonymousClass112.A08()     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x021b
            r3.setDevicePropertiesAttestationIncluded(r8)     // Catch:{ Exception -> 0x0247 }
        L_0x021b:
            android.security.keystore.KeyGenParameterSpec r0 = r3.build()     // Catch:{ ProviderException -> 0x0226 }
            r2.initialize(r0)     // Catch:{ ProviderException -> 0x0226 }
            r2.generateKeyPair()     // Catch:{ ProviderException -> 0x0226 }
            goto L_0x023a
        L_0x0226:
            r1 = move-exception
            boolean r0 = X.AnonymousClass112.A08()     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x023e
            r3.setDevicePropertiesAttestationIncluded(r7)     // Catch:{ all -> 0x023f }
            android.security.keystore.KeyGenParameterSpec r0 = r3.build()     // Catch:{ all -> 0x023f }
            r2.initialize(r0)     // Catch:{ all -> 0x023f }
            r2.generateKeyPair()     // Catch:{ all -> 0x023f }
        L_0x023a:
            r4.A05(r6)     // Catch:{ Exception -> 0x0247 }
            goto L_0x0277
        L_0x023e:
            throw r1     // Catch:{ all -> 0x023f }
        L_0x023f:
            r0 = move-exception
            r4.A05(r6)     // Catch:{ Exception -> 0x0247 }
            goto L_0x0246
        L_0x0244:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0247 }
        L_0x0246:
            throw r0     // Catch:{ Exception -> 0x0247 }
        L_0x0247:
            r5 = move-exception
            java.lang.String r1 = "blacknoise/exception on pair creation"
            java.lang.Throwable r0 = r5.getCause()     // Catch:{ all -> 0x028f }
            if (r0 == 0) goto L_0x0275
            java.lang.Throwable r0 = r5.getCause()     // Catch:{ all -> 0x028f }
        L_0x0254:
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x028f }
            X.190 r3 = r4.A04     // Catch:{ all -> 0x028f }
            java.lang.String r2 = "attestation-creation"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x028f }
            r1.<init>()     // Catch:{ all -> 0x028f }
            java.lang.String r0 = "unable to create attestation: "
            r1.append(r0)     // Catch:{ all -> 0x028f }
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x028f }
            r1.append(r0)     // Catch:{ all -> 0x028f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x028f }
            r3.A0E(r2, r0, r5)     // Catch:{ all -> 0x028f }
            goto L_0x0277
        L_0x0275:
            r0 = r5
            goto L_0x0254
        L_0x0277:
            X.1Cu r2 = new X.1Cu
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r15
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A02 = r9
            X.18K r0 = r4.A06
            r0.CC7(r2)
            return
        L_0x028f:
            r3 = move-exception
            X.1Cu r2 = new X.1Cu
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r15
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A02 = r9
            X.18K r0 = r4.A06
            r0.CC7(r2)
            throw r3
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22671Ct.A02(java.lang.Integer, byte[]):void");
    }

    public byte[] A07(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (!A06()) {
            return null;
        }
        A02(AnonymousClass00R.A01, bArr2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.Entry entry = instance.getEntry(A01(), (KeyStore.ProtectionParameter) null);
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                Log.e("blacknoise/Not an instance of a PKEntry");
                this.A04.A0G("attestation-nosign", "cannot sign payload, att pair missing", true);
            } else {
                Signature instance2 = Signature.getInstance(C18020vd.A01(C18040vf.A02, this.A02, 2075));
                instance2.initSign(((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
                instance2.update(bArr);
                bArr3 = instance2.sign();
            }
        } catch (Exception e) {
            Log.e("blacknoise/exception on pair sign", e);
            AnonymousClass190 r2 = this.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("unable to sign payload: ");
            sb.append(e.getMessage());
            r2.A0E("attestation-nosign", sb.toString(), e);
        } catch (Throwable th) {
            C22681Cu r22 = new C22681Cu();
            r22.A00 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
            r22.A02 = "att-sign";
            this.A06.CC7(r22);
            throw th;
        }
        C22681Cu r23 = new C22681Cu();
        r23.A00 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        r23.A02 = "att-sign";
        this.A06.CC7(r23);
        return bArr3;
    }

    public C22671Ct(AnonymousClass190 r1, AnonymousClass11P r2, C19830z4 r3, AnonymousClass19D r4, C18030ve r5, AnonymousClass18K r6, AnonymousClass1CM r7) {
        this.A02 = r5;
        this.A04 = r1;
        this.A00 = r3;
        this.A06 = r6;
        this.A05 = r2;
        this.A03 = r7;
        this.A01 = r4;
    }

    public static byte[] A03(C22671Ct r5, Integer num, byte[] bArr) {
        String A002;
        if (!r5.A06()) {
            return null;
        }
        r5.A02(num, bArr);
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (num == AnonymousClass00R.A01) {
                A002 = r5.A01();
            } else {
                A002 = r5.A00();
            }
            Certificate[] certificateChain = instance.getCertificateChain(A002);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (certificateChain != null) {
                for (int length = certificateChain.length - 1; length >= 0; length--) {
                    byteArrayOutputStream.write(certificateChain[length].getEncoded());
                }
            }
            byteArrayOutputStream.size();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Log.e("blacknoise/exception on certificate chain retrieval", e);
            AnonymousClass190 r2 = r5.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("unable to retrieve certificate chain: ");
            sb.append(e.getMessage());
            r2.A0E("attestation-nocertchain", sb.toString(), e);
            return null;
        }
    }

    public void A04() {
        if (A06()) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                instance.deleteEntry(A00());
                instance.deleteEntry(A01());
            } catch (Exception e) {
                Log.e("blacknoise/exception on certificate wipe", e);
            } catch (Throwable th) {
                C19830z4 r5 = this.A00;
                C19830z4.A00(r5).putLong("ka_retried_ts", 0).apply();
                C19830z4.A00(r5).putLong("ka_static_refresh_ts", 0).apply();
                C19830z4.A00(r5).putLong("ka_refresh_ts", 0).apply();
                C19830z4.A00(r5).putString("ka_key_store_static_alias_suffix", (String) null).apply();
                C19830z4.A00(r5).putString("ka_key_store_dynamic_alias_suffix", (String) null).apply();
                throw th;
            }
            C19830z4 r52 = this.A00;
            C19830z4.A00(r52).putLong("ka_retried_ts", 0).apply();
            C19830z4.A00(r52).putLong("ka_static_refresh_ts", 0).apply();
            C19830z4.A00(r52).putLong("ka_refresh_ts", 0).apply();
            C19830z4.A00(r52).putString("ka_key_store_static_alias_suffix", (String) null).apply();
            C19830z4.A00(r52).putString("ka_key_store_dynamic_alias_suffix", (String) null).apply();
        }
    }

    public void A05(Integer num) {
        String str;
        if (A06()) {
            Integer num2 = AnonymousClass00R.A01;
            C19830z4 r0 = this.A00;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor A002 = C19830z4.A00(r0);
            if (num == num2) {
                str = "ka_static_refresh_ts";
            } else {
                str = "ka_refresh_ts";
            }
            A002.putLong(str, currentTimeMillis).apply();
        }
    }

    public boolean A06() {
        if (AnonymousClass112.A01()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 1934)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
