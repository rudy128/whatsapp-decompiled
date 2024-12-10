package X;

import android.graphics.Bitmap;
import java.util.HashMap;

public abstract class BSZ extends C22848BSa {
    public int A00;
    public boolean A01;
    public final C25798CmA A02;
    public final C26024Cqi A03;
    public final ECs A04;
    public final C28605E9w A05;
    public final /* synthetic */ DDE A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.BSZ r2, boolean r3) {
        /*
            monitor-enter(r2)
            if (r3 == 0) goto L_0x001b
            boolean r0 = r2.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x001b
            X.CcD r1 = r2.A00     // Catch:{ all -> 0x0018 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A05(r0)     // Catch:{ all -> 0x0018 }
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            X.Cqi r0 = r2.A03
            r0.A02()
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001b:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSZ.A03(X.BSZ, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x015a, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x015c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00ff, code lost:
        if (r6.A05 == 6) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0103, code lost:
        if (r6.A01 == r4) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0105, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(X.DRJ r16, int r17) {
        /*
            r15 = this;
            r14 = r15
            boolean r0 = r15 instanceof X.BSP
            r2 = r16
            r3 = r17
            if (r0 == 0) goto L_0x015e
            r5 = r15
            X.BSP r5 = (X.BSP) r5
            monitor-enter(r14)
            r7 = 0
            if (r16 == 0) goto L_0x015b
            X.Cqi r0 = r5.A03     // Catch:{ all -> 0x016b }
            boolean r13 = r0.A04(r2, r3)     // Catch:{ all -> 0x016b }
            r1 = 1
            r0 = r17 & 1
            if (r0 != r1) goto L_0x0021
            r1 = 8
            r0 = r17 & 8
            if (r0 != r1) goto L_0x0159
        L_0x0021:
            r1 = 4
            r0 = r17 & 4
            if (r0 == r1) goto L_0x0159
            boolean r0 = r2.A0A()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0159
            X.DRJ.A03(r2)     // Catch:{ all -> 0x016b }
            X.Clu r1 = r2.A07     // Catch:{ all -> 0x016b }
            X.Clu r0 = X.CIN.A06     // Catch:{ all -> 0x016b }
            if (r1 != r0) goto L_0x0159
            X.CTV r6 = r5.A00     // Catch:{ all -> 0x016b }
            int r1 = r6.A05     // Catch:{ all -> 0x016b }
            r0 = 6
            if (r1 == r0) goto L_0x015b
            int r1 = r2.A05()     // Catch:{ all -> 0x016b }
            int r0 = r6.A02     // Catch:{ all -> 0x016b }
            if (r1 <= r0) goto L_0x015b
            java.io.InputStream r2 = r2.A08()     // Catch:{ all -> 0x016b }
            X.C26208Cuj.A01(r2)     // Catch:{ all -> 0x016b }
            X.BSI r1 = r6.A07     // Catch:{ all -> 0x016b }
            r0 = 16384(0x4000, float:2.2959E-41)
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x016b }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x016b }
            X.BxX r3 = new X.BxX     // Catch:{ all -> 0x016b }
            r3.<init>(r1, r2, r0)     // Catch:{ all -> 0x016b }
            int r0 = r6.A02     // Catch:{ IOException -> 0x014e }
            long r0 = (long) r0     // Catch:{ IOException -> 0x014e }
            X.BSP.A00(r3, r0)     // Catch:{ IOException -> 0x014e }
            int r4 = r6.A01     // Catch:{ IOException -> 0x014e }
        L_0x0062:
            r1 = 0
            r12 = 1
            r2 = 6
            int r0 = r6.A05     // Catch:{ IOException -> 0x0148 }
            if (r0 == r2) goto L_0x00fd
            int r8 = r3.read()     // Catch:{ IOException -> 0x0148 }
            r0 = -1
            if (r8 == r0) goto L_0x00fd
            int r0 = r6.A02     // Catch:{ IOException -> 0x0148 }
            int r11 = r0 + 1
            r6.A02 = r11     // Catch:{ IOException -> 0x0148 }
            boolean r0 = r6.A06     // Catch:{ IOException -> 0x0148 }
            if (r0 == 0) goto L_0x0080
            r6.A05 = r2     // Catch:{ IOException -> 0x0148 }
            r6.A06 = r7     // Catch:{ IOException -> 0x0148 }
            goto L_0x0106
        L_0x0080:
            int r10 = r6.A05     // Catch:{ IOException -> 0x0148 }
            r1 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x00cc
            r9 = 2
            if (r10 == r12) goto L_0x00c7
            r0 = 3
            if (r10 == r9) goto L_0x00c2
            r2 = 4
            if (r10 == r0) goto L_0x00a5
            r0 = 5
            if (r10 == r2) goto L_0x00c4
            if (r10 == r0) goto L_0x0095
            goto L_0x00f8
        L_0x0095:
            int r0 = r6.A03     // Catch:{ IOException -> 0x0148 }
            int r2 = r0 << 8
            int r2 = r2 + r8
            int r2 = r2 - r9
            long r0 = (long) r2     // Catch:{ IOException -> 0x0148 }
            X.BSP.A00(r3, r0)     // Catch:{ IOException -> 0x0148 }
            int r0 = r6.A02     // Catch:{ IOException -> 0x0148 }
            int r0 = r0 + r2
            r6.A02 = r0     // Catch:{ IOException -> 0x0148 }
            goto L_0x00f2
        L_0x00a5:
            if (r8 == r1) goto L_0x00c4
            if (r8 == 0) goto L_0x00f2
            r0 = 217(0xd9, float:3.04E-43)
            if (r8 != r0) goto L_0x00ae
            goto L_0x00e2
        L_0x00ae:
            r0 = 218(0xda, float:3.05E-43)
            if (r8 != r0) goto L_0x00b3
            goto L_0x00d1
        L_0x00b3:
            if (r8 == r12) goto L_0x00f2
            r0 = 208(0xd0, float:2.91E-43)
            if (r8 < r0) goto L_0x00df
            r0 = 215(0xd7, float:3.01E-43)
            if (r8 <= r0) goto L_0x00f2
            r0 = 216(0xd8, float:3.03E-43)
            if (r8 == r0) goto L_0x00f2
            goto L_0x00df
        L_0x00c2:
            if (r8 != r1) goto L_0x00f4
        L_0x00c4:
            r6.A05 = r0     // Catch:{ IOException -> 0x0148 }
            goto L_0x00f4
        L_0x00c7:
            r0 = 216(0xd8, float:3.03E-43)
            if (r8 != r0) goto L_0x00df
            goto L_0x00f2
        L_0x00cc:
            if (r8 != r1) goto L_0x00df
            r6.A05 = r12     // Catch:{ IOException -> 0x0148 }
            goto L_0x00f4
        L_0x00d1:
            int r0 = r11 + -2
            int r1 = r6.A04     // Catch:{ IOException -> 0x0148 }
            if (r1 <= 0) goto L_0x00d9
            r6.A00 = r0     // Catch:{ IOException -> 0x0148 }
        L_0x00d9:
            int r0 = r1 + 1
            r6.A04 = r0     // Catch:{ IOException -> 0x0148 }
            r6.A01 = r1     // Catch:{ IOException -> 0x0148 }
        L_0x00df:
            r6.A05 = r2     // Catch:{ IOException -> 0x0148 }
            goto L_0x00f4
        L_0x00e2:
            r6.A06 = r12     // Catch:{ IOException -> 0x0148 }
            int r0 = r11 + -2
            int r1 = r6.A04     // Catch:{ IOException -> 0x0148 }
            if (r1 <= 0) goto L_0x00ec
            r6.A00 = r0     // Catch:{ IOException -> 0x0148 }
        L_0x00ec:
            int r0 = r1 + 1
            r6.A04 = r0     // Catch:{ IOException -> 0x0148 }
            r6.A01 = r1     // Catch:{ IOException -> 0x0148 }
        L_0x00f2:
            r6.A05 = r9     // Catch:{ IOException -> 0x0148 }
        L_0x00f4:
            r6.A03 = r8     // Catch:{ IOException -> 0x0148 }
            goto L_0x0062
        L_0x00f8:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ IOException -> 0x0148 }
            throw r0     // Catch:{ IOException -> 0x0148 }
        L_0x00fd:
            int r0 = r6.A05     // Catch:{ IOException -> 0x014e }
            if (r0 == r2) goto L_0x0106
            int r0 = r6.A01     // Catch:{ IOException -> 0x014e }
            if (r0 == r4) goto L_0x0106
            r1 = 1
        L_0x0106:
            X.C26075Crp.A01(r3)     // Catch:{ all -> 0x016b }
            if (r1 == 0) goto L_0x015b
            int r4 = r6.A01     // Catch:{ all -> 0x016b }
            int r3 = r5.A00     // Catch:{ all -> 0x016b }
            if (r4 <= r3) goto L_0x015b
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x016b }
            if (r2 == 0) goto L_0x0138
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x016b }
            if (r0 != 0) goto L_0x0138
            r1 = 0
        L_0x011c:
            int r0 = r2.size()     // Catch:{ all -> 0x016b }
            if (r1 >= r0) goto L_0x013b
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x016b }
            int r0 = X.BE6.A0F(r0)     // Catch:{ all -> 0x016b }
            if (r0 <= r3) goto L_0x0135
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x016b }
            int r0 = X.BE6.A0F(r0)     // Catch:{ all -> 0x016b }
            goto L_0x013e
        L_0x0135:
            int r1 = r1 + 1
            goto L_0x011c
        L_0x0138:
            int r0 = r3 + 1
            goto L_0x013e
        L_0x013b:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x013e:
            if (r4 >= r0) goto L_0x0145
            boolean r0 = r6.A06     // Catch:{ all -> 0x016b }
            if (r0 != 0) goto L_0x0145
            goto L_0x015b
        L_0x0145:
            r5.A00 = r4     // Catch:{ all -> 0x016b }
            goto L_0x0159
        L_0x0148:
            r0 = move-exception
            X.C24546C8r.A00(r0)     // Catch:{ IOException -> 0x014e }
            r0 = 0
            throw r0     // Catch:{ IOException -> 0x014e }
        L_0x014e:
            r0 = move-exception
            X.C24546C8r.A00(r0)     // Catch:{ all -> 0x0154 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            X.C26075Crp.A01(r3)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ all -> 0x016b }
        L_0x0159:
            monitor-exit(r14)
            return r13
        L_0x015b:
            monitor-exit(r14)
            r13 = 0
            return r13
        L_0x015e:
            monitor-enter(r14)
            r1 = 1
            r0 = r17 & 1
            if (r0 != r1) goto L_0x016e
            X.Cqi r0 = r15.A03     // Catch:{ all -> 0x016b }
            boolean r0 = r0.A04(r2, r3)     // Catch:{ all -> 0x016b }
            goto L_0x016f
        L_0x016b:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x016e:
            r0 = 0
        L_0x016f:
            monitor-exit(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSZ.A0A(X.DRJ, int):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BSZ(C25268CcD ccD, DDE dde, ECs eCs) {
        super(ccD);
        this.A06 = dde;
        this.A04 = eCs;
        DDI ddi = (DDI) eCs;
        this.A05 = ddi.A05;
        C25798CmA cmA = ddi.A07.A04;
        C18070vi.A0X(cmA);
        this.A02 = cmA;
        this.A03 = new C26024Cqi(new C26770DCz(this, dde, 0), dde.A03);
        eCs.BB2(new C22851BSd(this));
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.HashMap, X.Dbi] */
    private final C27311Dbi A01(C28672EDo eDo, C25112CYh cYh, String str, String str2, String str3, long j, boolean z) {
        HashMap hashMap;
        Object obj;
        C28672EDo eDo2 = eDo;
        String str4 = null;
        if (!this.A05.CFc(this.A04, "DecodeProducer")) {
            return null;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(cYh.A02);
        String valueOf3 = String.valueOf(z);
        if (!(eDo == null || (obj = eDo2.BRV().get("non_fatal_decode_error")) == null)) {
            str4 = obj.toString();
        }
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (eDo2 instanceof BSF) {
            Bitmap bitmap = ((BSF) eDo2).A04;
            StringBuilder A15 = C108955ca.A15(bitmap);
            A15.append(bitmap.getWidth());
            A15.append('x');
            String A0t = C17880vN.A0t(A15, bitmap.getHeight());
            hashMap = new HashMap(8);
            hashMap.put("bitmapSize", A0t);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str6);
            hashMap.put("imageFormat", str5);
            hashMap.put("requestedImageSize", "unknown");
            hashMap.put("sampleSize", str7);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(bitmap.getByteCount());
            hashMap.put("byteCount", AnonymousClass000.A0y("", A10));
        } else {
            hashMap = new HashMap(7);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str6);
            hashMap.put("imageFormat", str5);
            hashMap.put("requestedImageSize", "unknown");
            hashMap.put("sampleSize", str7);
        }
        if (str4 != null) {
            hashMap.put("non_fatal_decode_error", str4);
        }
        return new HashMap(hashMap);
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [X.CYh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v3, types: [X.CYh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c1, code lost:
        if ((r4 & 8) == 8) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0140 A[Catch:{ Exception -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188 A[Catch:{ all -> 0x01cf, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019c A[Catch:{ all -> 0x01cf, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b3 A[Catch:{ all -> 0x01cf, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bf A[Catch:{ all -> 0x01cf, all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ca A[SYNTHETIC, Splitter:B:74:0x01ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.DRJ r21, X.BSZ r22, int r23, int r24) {
        /*
            r10 = r21
            r4 = r23
            X.DRJ.A03(r10)
            X.Clu r1 = r10.A07
            X.Clu r0 = X.CIN.A06
            if (r1 == r0) goto L_0x0012
            r1 = 1
            r0 = r23 & 1
            if (r0 != r1) goto L_0x0088
        L_0x0012:
            r9 = r22
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x0088
            boolean r0 = r10.A0A()
            if (r0 == 0) goto L_0x0088
            X.DRJ.A03(r10)
            X.Clu r1 = r10.A07
            X.Clu r0 = X.CIN.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            r5 = 0
            java.lang.String r8 = "DecodeProducer"
            if (r0 == 0) goto L_0x0089
            X.CmA r6 = r9.A02
            X.DRJ.A03(r10)
            int r0 = r10.A05
            long r2 = (long) r0
            X.DRJ.A03(r10)
            int r0 = r10.A01
            long r0 = (long) r0
            android.graphics.Bitmap$Config r6 = r6.A02
            int r7 = X.C26077Crr.A00(r6)
            long r2 = r2 * r0
            long r0 = (long) r7
            long r2 = r2 * r0
            r11 = 104857600(0x6400000, double:5.1806538E-316)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Image is too big to attempt decoding: w = "
            r1.append(r0)
            X.DRJ.A03(r10)
            int r0 = r10.A05
            r1.append(r0)
            java.lang.String r0 = ", h = "
            r1.append(r0)
            X.DRJ.A03(r10)
            int r0 = r10.A01
            r1.append(r0)
            java.lang.String r0 = ", pixel config = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", max bitmap size = 104857600"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0o(r0, r1)
            X.E9w r1 = r9.A05
            X.ECs r0 = r9.A04
            r1.C1p(r0, r8, r2, r5)
            r0 = 1
            A03(r9, r0)
            X.CcD r0 = r9.A00
            r0.A08(r2)
        L_0x0088:
            return
        L_0x0089:
            X.DRJ.A03(r10)
            X.Clu r0 = r10.A07
            X.C18070vi.A0X(r0)
            java.lang.String r0 = r0.A00
            r22 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.DRJ.A03(r10)
            int r0 = r10.A05
            r1.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r1.append(r0)
            X.DRJ.A03(r10)
            int r0 = r10.A01
            java.lang.String r19 = X.C17880vN.A0t(r1, r0)
            int r0 = r10.A03
            java.lang.String r20 = java.lang.String.valueOf(r0)
            boolean r23 = X.BE9.A1Q(r4)
            r3 = 1
            if (r23 == 0) goto L_0x00c3
            r1 = 8
            r0 = r4 & 8
            r11 = 1
            if (r0 != r1) goto L_0x00c4
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            r1 = 4
            r0 = r4 & 4
            boolean r6 = X.AnonymousClass000.A1T(r0, r1)
            X.ECs r7 = r9.A04
            r0 = r7
            X.DDI r0 = (X.DDI) r0
            X.Cbv r5 = r0.A07
            X.Cqi r2 = r9.A03     // Catch:{ all -> 0x0281 }
            monitor-enter(r2)     // Catch:{ all -> 0x0281 }
            long r14 = r2.A01     // Catch:{ all -> 0x027a }
            long r0 = r2.A02     // Catch:{ all -> 0x027a }
            long r14 = r14 - r0
            monitor-exit(r2)     // Catch:{ all -> 0x0281 }
            android.net.Uri r0 = r5.A03     // Catch:{ all -> 0x0281 }
            java.lang.String r13 = X.C18070vi.A0H(r0)     // Catch:{ all -> 0x0281 }
            if (r11 != 0) goto L_0x00e6
            if (r6 != 0) goto L_0x00e6
            goto L_0x00ef
        L_0x00e6:
            int r5 = r10.A05()     // Catch:{ all -> 0x0281 }
            if (r11 != 0) goto L_0x011b
            if (r6 == 0) goto L_0x00fa
            goto L_0x011b
        L_0x00ef:
            boolean r0 = r9 instanceof X.BSP     // Catch:{ all -> 0x0281 }
            if (r0 == 0) goto L_0x0109
            r0 = r9
            X.BSP r0 = (X.BSP) r0     // Catch:{ all -> 0x0281 }
            X.CTV r0 = r0.A00     // Catch:{ all -> 0x0281 }
            int r5 = r0.A00     // Catch:{ all -> 0x0281 }
        L_0x00fa:
            boolean r0 = r9 instanceof X.BSP     // Catch:{ all -> 0x0281 }
            if (r0 == 0) goto L_0x0110
            r0 = r9
            X.BSP r0 = (X.BSP) r0     // Catch:{ all -> 0x0281 }
            X.CTV r0 = r0.A00     // Catch:{ all -> 0x0281 }
            int r2 = r0.A01     // Catch:{ all -> 0x0281 }
            r1 = 0
            if (r2 < r1) goto L_0x011e
            goto L_0x010e
        L_0x0109:
            int r5 = r10.A05()     // Catch:{ all -> 0x0281 }
            goto L_0x00fa
        L_0x010e:
            r1 = 1
            goto L_0x011e
        L_0x0110:
            r0 = 0
            X.CYh r12 = new X.CYh     // Catch:{ all -> 0x0281 }
            r12.<init>()     // Catch:{ all -> 0x0281 }
            r12.A00 = r0     // Catch:{ all -> 0x0281 }
            r12.A02 = r0     // Catch:{ all -> 0x0281 }
            goto L_0x0128
        L_0x011b:
            X.CYh r12 = X.C25112CYh.A03     // Catch:{ all -> 0x0281 }
            goto L_0x012a
        L_0x011e:
            r0 = 0
            X.CYh r12 = new X.CYh     // Catch:{ all -> 0x0281 }
            r12.<init>()     // Catch:{ all -> 0x0281 }
            r12.A00 = r2     // Catch:{ all -> 0x0281 }
            r12.A02 = r1     // Catch:{ all -> 0x0281 }
        L_0x0128:
            r12.A01 = r0     // Catch:{ all -> 0x0281 }
        L_0x012a:
            X.E9w r11 = r9.A05     // Catch:{ all -> 0x0281 }
            r11.C1r(r7, r8)     // Catch:{ all -> 0x0281 }
            X.C18070vi.A0b(r12)     // Catch:{ DZu -> 0x01d9 }
            X.DDE r2 = r9.A06     // Catch:{ DZu -> 0x01d9 }
            X.E4U r1 = r2.A02     // Catch:{ OutOfMemoryError -> 0x01d7 }
            X.CmA r0 = r9.A02     // Catch:{ OutOfMemoryError -> 0x01d7 }
            X.EDo r0 = r1.BI4(r0, r10, r12, r5)     // Catch:{ OutOfMemoryError -> 0x01d7 }
            int r1 = r10.A03     // Catch:{ Exception -> 0x01d4 }
            if (r1 == r3) goto L_0x0142
            r4 = r4 | 16
        L_0x0142:
            r16 = r0
            r17 = r12
            r18 = r22
            r21 = r14
            r15 = r9
            X.Dbi r1 = r15.A01(r16, r17, r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0281 }
            r11.C1q(r7, r8, r1)     // Catch:{ all -> 0x0281 }
            X.DRJ.A03(r10)     // Catch:{ all -> 0x0281 }
            int r1 = r10.A05     // Catch:{ all -> 0x0281 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "encoded_width"
            r7.CD2(r1, r5)     // Catch:{ all -> 0x0281 }
            X.DRJ.A03(r10)     // Catch:{ all -> 0x0281 }
            int r1 = r10.A01     // Catch:{ all -> 0x0281 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "encoded_height"
            r7.CD2(r1, r5)     // Catch:{ all -> 0x0281 }
            int r1 = r10.A05()     // Catch:{ all -> 0x0281 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "encoded_size"
            r7.CD2(r1, r5)     // Catch:{ all -> 0x0281 }
            java.lang.String r5 = "image_color_space"
            android.graphics.ColorSpace r1 = r10.A06()     // Catch:{ all -> 0x0281 }
            r7.CD2(r5, r1)     // Catch:{ all -> 0x0281 }
            boolean r1 = r0 instanceof X.BSF     // Catch:{ all -> 0x0281 }
            if (r1 == 0) goto L_0x019a
            r1 = r0
            X.BSF r1 = (X.BSF) r1     // Catch:{ all -> 0x0281 }
            android.graphics.Bitmap r1 = r1.A04     // Catch:{ all -> 0x0281 }
            android.graphics.Bitmap$Config r1 = r1.getConfig()     // Catch:{ all -> 0x0281 }
            java.lang.String r5 = "bitmap_config"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0281 }
            r7.CD2(r5, r1)     // Catch:{ all -> 0x0281 }
        L_0x019a:
            if (r0 == 0) goto L_0x01a3
            java.util.Map r1 = r7.BRV()     // Catch:{ all -> 0x0281 }
            r0.CD3(r1)     // Catch:{ all -> 0x0281 }
        L_0x01a3:
            java.lang.String r5 = "last_scan_num"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0281 }
            r7.CD2(r5, r1)     // Catch:{ all -> 0x0281 }
            X.CJu r1 = r2.A00     // Catch:{ all -> 0x0281 }
            X.E4L r5 = r1.A00     // Catch:{ all -> 0x0281 }
            r2 = 0
            if (r0 == 0) goto L_0x01ba
            X.E4M r1 = X.DRN.A05     // Catch:{ all -> 0x0281 }
            X.DRN r2 = new X.DRN     // Catch:{ all -> 0x0281 }
            r2.<init>((X.E4L) r5, (X.E4M) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0281 }
        L_0x01ba:
            r1 = 1
            r0 = r4 & 1
            if (r0 == r3) goto L_0x01c0
            r1 = 0
        L_0x01c0:
            A03(r9, r1)     // Catch:{ all -> 0x01cf }
            X.CcD r0 = r9.A00     // Catch:{ all -> 0x01cf }
            r0.A07(r2, r4)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x0276
            r2.close()     // Catch:{ all -> 0x0281 }
            goto L_0x0276
        L_0x01cf:
            r0 = move-exception
            if (r2 == 0) goto L_0x0280
            goto L_0x027d
        L_0x01d4:
            r1 = move-exception
            goto L_0x025a
        L_0x01d7:
            r0 = move-exception
            throw r0     // Catch:{ DZu -> 0x01d9 }
        L_0x01d9:
            r6 = move-exception
            X.DRJ r0 = r6.encodedImage     // Catch:{ Exception -> 0x0258 }
            r21 = r0
            java.lang.String r18 = "ProgressiveDecoder"
            java.lang.String r17 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
            java.lang.Object[] r5 = X.BE6.A1a()     // Catch:{ Exception -> 0x0258 }
            java.lang.String r0 = r6.getMessage()     // Catch:{ Exception -> 0x0258 }
            X.AnonymousClass3MY.A1V(r0, r13, r5)     // Catch:{ Exception -> 0x0258 }
            r1 = 10
            r0 = r21
            X.DRN r0 = r0.A0B     // Catch:{ Exception -> 0x0258 }
            if (r0 == 0) goto L_0x0208
            X.DRN r13 = r0.A04()     // Catch:{ Exception -> 0x0258 }
        L_0x01f9:
            java.lang.String r2 = ""
            if (r13 == 0) goto L_0x0246
            int r0 = r21.A05()     // Catch:{ Exception -> 0x0258 }
            int r4 = java.lang.Math.min(r0, r1)     // Catch:{ Exception -> 0x0258 }
            byte[] r3 = new byte[r4]     // Catch:{ Exception -> 0x0258 }
            goto L_0x020a
        L_0x0208:
            r13 = 0
            goto L_0x01f9
        L_0x020a:
            java.lang.Object r0 = r13.A05()     // Catch:{ all -> 0x023d }
            X.DRG r0 = (X.DRG) r0     // Catch:{ all -> 0x023d }
            if (r0 != 0) goto L_0x0216
            r13.close()     // Catch:{ Exception -> 0x0258 }
            goto L_0x0246
        L_0x0216:
            r2 = 0
            r0.A03(r2, r3, r2, r4)     // Catch:{ all -> 0x023d }
            r13.close()     // Catch:{ Exception -> 0x0258 }
            int r0 = r4 * 2
            java.lang.StringBuilder r16 = X.BE6.A0t(r0)     // Catch:{ Exception -> 0x0258 }
            r1 = 0
        L_0x0224:
            if (r1 >= r4) goto L_0x0242
            byte r13 = r3[r1]     // Catch:{ Exception -> 0x0258 }
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x0258 }
            X.BE6.A1S(r0, r13, r2)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r13 = "%02X"
            java.lang.String r13 = java.lang.String.format(r13, r0)     // Catch:{ Exception -> 0x0258 }
            r0 = r16
            r0.append(r13)     // Catch:{ Exception -> 0x0258 }
            int r1 = r1 + 1
            goto L_0x0224
        L_0x023d:
            r0 = move-exception
            r13.close()     // Catch:{ Exception -> 0x0258 }
            throw r0     // Catch:{ Exception -> 0x0258 }
        L_0x0242:
            java.lang.String r2 = r16.toString()     // Catch:{ Exception -> 0x0258 }
        L_0x0246:
            r0 = 2
            r5[r0] = r2     // Catch:{ Exception -> 0x0258 }
            int r0 = r21.A05()     // Catch:{ Exception -> 0x0258 }
            X.C17890vO.A1G(r5, r0)     // Catch:{ Exception -> 0x0258 }
            r1 = r18
            r0 = r17
            X.C26265CwA.A06(r1, r0, r5)     // Catch:{ Exception -> 0x0258 }
            throw r6     // Catch:{ Exception -> 0x0258 }
        L_0x0258:
            r1 = move-exception
            r0 = 0
        L_0x025a:
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x0281 }
            r16 = r0
            r17 = r12
            r18 = r22
            r21 = r14
            r15 = r9
            X.Dbi r0 = r15.A01(r16, r17, r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0281 }
            r11.C1p(r7, r8, r1, r0)     // Catch:{ all -> 0x0281 }
            r0 = 1
            A03(r9, r0)     // Catch:{ all -> 0x0281 }
            X.CcD r0 = r9.A00     // Catch:{ all -> 0x0281 }
            r0.A08(r1)     // Catch:{ all -> 0x0281 }
        L_0x0276:
            r10.close()
            return
        L_0x027a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0281 }
            goto L_0x0280
        L_0x027d:
            r2.close()     // Catch:{ all -> 0x0281 }
        L_0x0280:
            throw r0     // Catch:{ all -> 0x0281 }
        L_0x0281:
            r0 = move-exception
            r10.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSZ.A02(X.DRJ, X.BSZ, int, int):void");
    }

    public void A09(float f) {
        super.A09(f * 0.99f);
    }
}
