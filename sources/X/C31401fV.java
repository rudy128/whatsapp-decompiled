package X;

import android.content.pm.Signature;

/* renamed from: X.1fV  reason: invalid class name and case insensitive filesystem */
public class C31401fV {
    public Signature A00;
    public String A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass11E A08;
    public final AnonymousClass11R A09;
    public final AnonymousClass11C A0A;
    public final C19830z4 A0B;
    public final C18000vb A0C;
    public final C29791cs A0D;
    public final C31391fU A0E;
    public final C18010vc A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    private int[] A00() {
        String[] split = "2.24.24.78".split("\\.", 4);
        int length = split.length;
        if (length >= 3) {
            int[] iArr = new int[length];
            int i = 0;
            while (i < length) {
                try {
                    iArr[i] = Integer.parseInt(split[i]);
                    i++;
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("non numeric portion of version name; VERSION_NAME=");
                    sb.append("2.24.24.78");
                    AssertionError assertionError = new AssertionError(sb.toString());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            return iArr;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected at least three parts in version name; VERSION_NAME=");
        sb2.append("2.24.24.78");
        throw new AssertionError(sb2.toString());
    }

    public C31401fV(AnonymousClass11S r2, AnonymousClass11E r3, AnonymousClass11R r4, AnonymousClass11C r5, AnonymousClass118 r6, C19830z4 r7, C18000vb r8, C18030ve r9, C29791cs r10, C31391fU r11, C18010vc r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        this.A02 = r6;
        this.A03 = r9;
        this.A07 = r2;
        this.A04 = r13;
        this.A0E = r11;
        this.A0A = r5;
        this.A0C = r8;
        this.A0I = r14;
        this.A0H = r15;
        this.A0D = r10;
        this.A0B = r7;
        this.A09 = r4;
        this.A0G = r16;
        this.A0F = r12;
        this.A08 = r3;
        this.A05 = r17;
        this.A06 = r18;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x06dd A[SYNTHETIC, Splitter:B:122:0x06dd] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0781  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0680  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2BY A01(X.C53412cU r15, com.whatsapp.jid.UserJid r16, X.C54412e6 r17, int r18, int r19, long r20, boolean r22) {
        /*
            r14 = this;
            r10 = 1
            r13 = 0
            r5 = r16
            if (r16 != 0) goto L_0x0007
            r13 = 1
        L_0x0007:
            X.2BY r0 = X.AnonymousClass2BY.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            if (r13 != 0) goto L_0x0047
            java.lang.String r0 = X.AnonymousClass17K.A04(r5)     // Catch:{ NumberFormatException -> 0x002a }
            X.C17960vV.A07(r0)     // Catch:{ NumberFormatException -> 0x002a }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x002a }
            r4.A0E()     // Catch:{ NumberFormatException -> 0x002a }
            X.Bm6 r3 = r4.A00     // Catch:{ NumberFormatException -> 0x002a }
            X.2BY r3 = (X.AnonymousClass2BY) r3     // Catch:{ NumberFormatException -> 0x002a }
            int r0 = r3.bitField0_     // Catch:{ NumberFormatException -> 0x002a }
            r0 = r0 | 1
            r3.bitField0_ = r0     // Catch:{ NumberFormatException -> 0x002a }
            r3.username_ = r1     // Catch:{ NumberFormatException -> 0x002a }
            goto L_0x0047
        L_0x002a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "jid prefix not numeric; prefix="
            r1.append(r0)
            java.lang.String r0 = r5.user
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x0047:
            r4.A0E()
            X.Bm6 r1 = r4.A00
            X.2BY r1 = (X.AnonymousClass2BY) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r0 = r22
            r1.passive_ = r0
            X.11S r6 = r14.A07
            java.lang.String r2 = r6.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0076
            r4.A0E()
            X.Bm6 r1 = r4.A00
            X.2BY r1 = (X.AnonymousClass2BY) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.pushName_ = r2
        L_0x0076:
            r4.A0E()
            X.Bm6 r1 = r4.A00
            X.2BY r1 = (X.AnonymousClass2BY) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r0 = r18
            r1.sessionId_ = r0
            X.1cs r1 = r14.A0D
            boolean r3 = r1.A03()
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r0 = r2.bitField0_
            r0 = r0 | 64
            r2.bitField0_ = r0
            r2.shortConnect_ = r3
            boolean r0 = r6.A0N()
            if (r0 == 0) goto L_0x00be
            X.11R r0 = r14.A09
            X.11O r0 = r0.A01
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r2 = "registration_device_id"
            r0 = 0
            int r3 = r3.getInt(r2, r0)
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.device_ = r3
        L_0x00be:
            X.Bm6 r0 = r4.A00
            X.2BY r0 = (X.AnonymousClass2BY) r0
            X.2BX r0 = r0.userAgent_
            if (r0 != 0) goto L_0x00c8
            X.2BX r0 = X.AnonymousClass2BX.DEFAULT_INSTANCE
        L_0x00c8:
            X.Bmt r8 = r0.A0O()
            X.2RH r3 = X.AnonymousClass2RH.A01
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            int r0 = X.AnonymousClass2BX.APP_VERSION_FIELD_NUMBER
            int r0 = r3.value
            r2.platform_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            int[] r3 = r14.A00()
            X.Bm6 r0 = r8.A00
            X.2BX r0 = (X.AnonymousClass2BX) r0
            X.2B2 r0 = r0.appVersion_
            if (r0 != 0) goto L_0x00ef
            X.2B2 r0 = X.AnonymousClass2B2.DEFAULT_INSTANCE
        L_0x00ef:
            X.Bmt r6 = r0.A0O()
            r0 = 0
            r7 = r3[r0]
            r6.A0E()
            X.Bm6 r2 = r6.A00
            X.2B2 r2 = (X.AnonymousClass2B2) r2
            int r0 = X.AnonymousClass2B2.PRIMARY_FIELD_NUMBER
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            r2.primary_ = r7
            r7 = r3[r10]
            r6.A0E()
            X.Bm6 r2 = r6.A00
            X.2B2 r2 = (X.AnonymousClass2B2) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.secondary_ = r7
            r0 = 2
            r7 = r3[r0]
            r6.A0E()
            X.Bm6 r2 = r6.A00
            X.2B2 r2 = (X.AnonymousClass2B2) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.tertiary_ = r7
            int r2 = r3.length
            r0 = 4
            if (r2 != r0) goto L_0x0140
            r0 = 3
            r3 = r3[r0]
            r6.A0E()
            X.Bm6 r2 = r6.A00
            X.2B2 r2 = (X.AnonymousClass2B2) r2
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.quaternary_ = r3
        L_0x0140:
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            X.Bm6 r0 = r6.A0C()
            X.2B2 r0 = (X.AnonymousClass2B2) r0
            r0.getClass()
            r2.appVersion_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            X.11C r6 = r14.A0A
            android.telephony.TelephonyManager r0 = r6.A0K()
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r0.getNetworkOperator()
            X.A6P r7 = X.A6P.A00(r0)
            java.lang.String r3 = r7.A00
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.mcc_ = r3
            java.lang.String r3 = r7.A01
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.mnc_ = r3
        L_0x0190:
            X.00H r3 = r14.A04
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r7 = r0.A05
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r7.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 16
            r2.bitField0_ = r0
            r2.osVersion_ = r7
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r7 = r0.A03
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r7.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 32
            r2.bitField0_ = r0
            r2.manufacturer_ = r7
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r7 = r0.A00
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r7.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 64
            r2.bitField0_ = r0
            r2.device_ = r7
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r7 = r0.A02
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r7.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r0
            r2.osBuildNumber_ = r7
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r7 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x021a
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r7.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r2.bitField0_ = r0
            r2.deviceBoard_ = r7
        L_0x021a:
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r9 = r0.A04
            r8.A0E()
            X.Bm6 r7 = r8.A00
            X.2BX r7 = (X.AnonymousClass2BX) r7
            r9.getClass()
            int r2 = r7.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r0
            r7.bitField0_ = r2
            r7.deviceModelType_ = r9
            X.1fU r0 = r14.A0E
            X.2iV r0 = r0.BX3()
            java.lang.String r7 = r0.A01
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r7.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r2.bitField0_ = r0
            r2.phoneId_ = r7
            X.0z4 r7 = r14.A0B
            java.lang.String r0 = r7.A0j()
            byte[] r2 = X.A9B.A0Y(r0)
            r0 = 11
            java.lang.String r9 = android.util.Base64.encodeToString(r2, r0)
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            r9.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r2.bitField0_ = r0
            r2.deviceExpId_ = r9
            X.00H r0 = r14.A0G
            java.lang.Object r0 = r0.get()
            X.1Hf r0 = (X.C23681Hf) r0
            java.lang.Integer r0 = r0.A00()
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x028b;
                case 1: goto L_0x028e;
                case 2: goto L_0x0291;
                case 3: goto L_0x0294;
                case 4: goto L_0x028b;
                case 5: goto L_0x028b;
                default: goto L_0x0285;
            }
        L_0x0285:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x028b:
            X.2RA r0 = X.AnonymousClass2RA.PHONE
            goto L_0x0296
        L_0x028e:
            X.2RA r0 = X.AnonymousClass2RA.TABLET
            goto L_0x0296
        L_0x0291:
            X.2RA r0 = X.AnonymousClass2RA.VR
            goto L_0x0296
        L_0x0294:
            X.2RA r0 = X.AnonymousClass2RA.DESKTOP
        L_0x0296:
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            int r0 = r0.value
            r2.deviceType_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r2.bitField0_ = r0
            X.0vb r11 = r14.A0C
            java.lang.String r9 = r11.A05()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "zz"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x02cb
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            int r0 = r2.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.bitField0_ = r0
            r2.localeLanguageIso6391_ = r9
        L_0x02cb:
            java.lang.String r9 = r11.A04()
            java.lang.String r0 = "ZZ"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x02e6
            r8.A0E()
            X.Bm6 r2 = r8.A00
            X.2BX r2 = (X.AnonymousClass2BX) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.localeCountryIso31661Alpha2_ = r9
        L_0x02e6:
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            X.Bm6 r0 = r8.A0C()
            X.2BX r0 = (X.AnonymousClass2BX) r0
            r0.getClass()
            r2.userAgent_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            X.11E r0 = r14.A08
            X.1LR r2 = r0.A04()
            if (r2 == 0) goto L_0x06a5
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x069c
            X.2RC r0 = X.AnonymousClass2RC.WIFI_UNKNOWN
        L_0x030c:
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r0 = r0.value
            r2.connectType_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r0
            X.118 r0 = r14.A02
            android.content.Context r2 = r0.A00
            long r11 = X.C24201Jg.A00(r2)
            r8 = 1
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x032c
            r10 = 0
        L_0x032c:
            r4.A0E()
            X.Bm6 r9 = r4.A00
            X.2BY r9 = (X.AnonymousClass2BY) r9
            int r8 = r9.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r0
            r9.bitField0_ = r8
            r9.oc_ = r10
            int r8 = r15.A00
            if (r8 != 0) goto L_0x0680
            X.2R9 r9 = X.AnonymousClass2R9.SYSTEM
        L_0x0342:
            X.8Zf r0 = X.C164538Zf.DEFAULT_INSTANCE
            X.Bmt r10 = r0.A0N()
            r10.A0E()
            X.Bm6 r8 = r10.A00
            X.8Zf r8 = (X.C164538Zf) r8
            int r0 = r9.value
            r8.dnsMethod_ = r0
            int r0 = r8.bitField0_
            r0 = r0 | 1
            r8.bitField0_ = r0
            boolean r9 = r15.A01
            r10.A0E()
            X.Bm6 r8 = r10.A00
            X.8Zf r8 = (X.C164538Zf) r8
            int r0 = r8.bitField0_
            r0 = r0 | 2
            r8.bitField0_ = r0
            r8.appCached_ = r9
            X.Bm6 r0 = r10.A0C()
            X.8Zf r0 = (X.C164538Zf) r0
            r4.A0E()
            X.Bm6 r8 = r4.A00
            X.2BY r8 = (X.AnonymousClass2BY) r8
            r0.getClass()
            r8.dnsSource_ = r0
            int r0 = r8.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r8.bitField0_ = r0
        L_0x0382:
            r4.A0E()
            X.Bm6 r8 = r4.A00
            X.2BY r8 = (X.AnonymousClass2BY) r8
            int r0 = r8.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r8.bitField0_ = r0
            r0 = r19
            r8.connectAttemptCount_ = r0
            X.00H r0 = r7.A00
            java.lang.Object r8 = r0.get()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r7 = "connection_lc"
            r0 = 0
            int r9 = r8.getInt(r7, r0)
            r4.A0E()
            X.Bm6 r8 = r4.A00
            X.2BY r8 = (X.AnonymousClass2BY) r8
            int r7 = r8.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r0
            r8.bitField0_ = r7
            r8.lc_ = r9
            X.1ct r9 = r1.A00()
            X.2RB r0 = X.AnonymousClass2RB.UNKNOWN
            r4.A0E()
            X.Bm6 r1 = r4.A00
            X.2BY r1 = (X.AnonymousClass2BY) r1
            int r0 = r0.value
            r1.connectReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0409
            long r0 = r9.A02
            r10 = 0
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0409
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            long r20 = r20 - r0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r7 = r7.toMillis(r0)
            int r0 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0409
            int r1 = r9.A00
            r0 = 1
            if (r1 == r0) goto L_0x067c
            r0 = 2
            if (r1 != r0) goto L_0x0409
            X.2RB r0 = X.AnonymousClass2RB.PUSH
        L_0x03f8:
            r4.A0E()
            X.Bm6 r1 = r4.A00
            X.2BY r1 = (X.AnonymousClass2BY) r1
            int r0 = r0.value
            r1.connectReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
        L_0x0409:
            if (r13 == 0) goto L_0x066b
            r12 = r17
            X.C17960vV.A07(r12)
            X.2eE r11 = r12.A00
            byte[] r9 = r12.A01
            X.Bm6 r0 = r4.A00
            X.2BY r0 = (X.AnonymousClass2BY) r0
            X.2BS r0 = r0.devicePairingData_
            if (r0 != 0) goto L_0x041e
            X.2BS r0 = X.AnonymousClass2BS.DEFAULT_INSTANCE
        L_0x041e:
            X.Bmt r7 = r0.A0O()
            r10 = 1
            byte[] r8 = new byte[r10]
            r0 = 5
            r1 = 0
            r8[r1] = r0
            X.BmB r13 = X.DSQ.A01(r8, r1, r10)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = X.AnonymousClass2BS.BUILD_HASH_FIELD_NUMBER
            int r0 = r8.bitField0_
            r0 = r0 | 2
            r8.bitField0_ = r0
            r8.eKeytype_ = r13
            int r0 = r9.length
            X.BmB r9 = X.DSQ.A01(r9, r1, r0)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = r8.bitField0_
            r0 = r0 | 4
            r8.bitField0_ = r0
            r8.eIdent_ = r9
            byte[] r8 = r12.A02
            r0 = 4
            X.BmB r9 = X.DSQ.A01(r8, r1, r0)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = r8.bitField0_
            r0 = r0 | 1
            r8.bitField0_ = r0
            r8.eRegid_ = r9
            byte[] r8 = r11.A01
            int r0 = r8.length
            X.BmB r9 = X.DSQ.A01(r8, r1, r0)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = r8.bitField0_
            r0 = r0 | 8
            r8.bitField0_ = r0
            r8.eSkeyId_ = r9
            byte[] r8 = r11.A00
            int r0 = r8.length
            X.BmB r9 = X.DSQ.A01(r8, r1, r0)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = r8.bitField0_
            r0 = r0 | 16
            r8.bitField0_ = r0
            r8.eSkeyVal_ = r9
            byte[] r8 = r11.A02
            int r0 = r8.length
            X.BmB r9 = X.DSQ.A01(r8, r1, r0)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = r8.bitField0_
            r0 = r0 | 32
            r8.bitField0_ = r0
            r8.eSkeySig_ = r9
            java.lang.String r0 = "2.24.24.78"
            java.lang.String r0 = X.C17970vW.A04(r0)
            byte[] r8 = android.util.Base64.decode(r0, r1)
            int r0 = r8.length
            X.BmB r9 = X.DSQ.A01(r8, r1, r0)
            r7.A0E()
            X.Bm6 r8 = r7.A00
            X.2BS r8 = (X.AnonymousClass2BS) r8
            int r0 = r8.bitField0_
            r0 = r0 | 64
            r8.bitField0_ = r0
            r8.buildHash_ = r9
            X.2BN r0 = X.AnonymousClass2BN.DEFAULT_INSTANCE
            X.Bmt r8 = r0.A0N()
            int[] r9 = r14.A00()
            X.Bm6 r0 = r8.A00
            X.2BN r0 = (X.AnonymousClass2BN) r0
            X.2B1 r0 = r0.version_
            if (r0 != 0) goto L_0x04dc
            X.2B1 r0 = X.AnonymousClass2B1.DEFAULT_INSTANCE
        L_0x04dc:
            X.Bmt r11 = r0.A0O()
            r12 = r9[r1]
            r11.A0E()
            X.Bm6 r1 = r11.A00
            X.2B1 r1 = (X.AnonymousClass2B1) r1
            int r0 = X.AnonymousClass2B1.PRIMARY_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.primary_ = r12
            r12 = r9[r10]
            r11.A0E()
            X.Bm6 r1 = r11.A00
            X.2B1 r1 = (X.AnonymousClass2B1) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.secondary_ = r12
            r0 = 2
            r12 = r9[r0]
            r11.A0E()
            X.Bm6 r1 = r11.A00
            X.2B1 r1 = (X.AnonymousClass2B1) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.tertiary_ = r12
            int r1 = r9.length
            r0 = 4
            if (r1 != r0) goto L_0x052c
            r0 = 3
            r9 = r9[r0]
            r11.A0E()
            X.Bm6 r1 = r11.A00
            X.2B1 r1 = (X.AnonymousClass2B1) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.quaternary_ = r9
        L_0x052c:
            r8.A0E()
            X.Bm6 r1 = r8.A00
            X.2BN r1 = (X.AnonymousClass2BN) r1
            X.Bm6 r0 = r11.A0C()
            X.2B1 r0 = (X.AnonymousClass2B1) r0
            r0.getClass()
            r1.version_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            java.lang.Object r0 = r3.get()
            X.2g7 r0 = (X.C55632g7) r0
            java.lang.String r3 = r0.A05
            r8.A0E()
            X.Bm6 r1 = r8.A00
            X.2BN r1 = (X.AnonymousClass2BN) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.os_ = r3
            X.00H r0 = r14.A05
            java.lang.Object r0 = r0.get()
            X.2km r0 = (X.C58492km) r0
            java.lang.Integer r0 = r0.A00()
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0678
            r0 = 2
            if (r1 == r0) goto L_0x0674
            X.2RG r0 = X.AnonymousClass2RG.ANDROID_TABLET
        L_0x0576:
            r8.A0E()
            X.Bm6 r1 = r8.A00
            X.2BN r1 = (X.AnonymousClass2BN) r1
            int r0 = r0.value
            r1.platformType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r8.A0E()
            X.Bm6 r1 = r8.A00
            X.2BN r1 = (X.AnonymousClass2BN) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.requireFullSync_ = r10
            X.2BW r0 = X.AnonymousClass2BW.DEFAULT_INSTANCE
            X.Bmt r9 = r0.A0N()
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.supportCagReactionsAndPolls_ = r10
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.inlineInitialPayloadInE2EeMsg_ = r10
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.supportCallLogHistory_ = r10
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.supportBotUserAgentChatHistory_ = r10
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.supportFbidBotChatHistory_ = r10
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.supportHostedGroupMsg_ = r10
            X.0ve r11 = r14.A03
            r0 = 11648(0x2d80, float:1.6322E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r10, r11, r0)
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.supportMessageAssociation_ = r3
            r0 = 8756(0x2234, float:1.227E-41)
            boolean r3 = X.C18020vd.A05(r10, r11, r0)
            r9.A0E()
            X.Bm6 r1 = r9.A00
            X.2BW r1 = (X.AnonymousClass2BW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.supportAddOnHistorySyncMigration_ = r3
            r8.A0E()
            X.Bm6 r1 = r8.A00
            X.2BN r1 = (X.AnonymousClass2BN) r1
            X.Bm6 r0 = r9.A0C()
            X.2BW r0 = (X.AnonymousClass2BW) r0
            r0.getClass()
            r1.historySyncConfig_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            X.Bm6 r0 = r8.A0C()
            X.BmB r3 = r0.A0K()
            r7.A0E()
            X.Bm6 r1 = r7.A00
            X.2BS r1 = (X.AnonymousClass2BS) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.deviceProps_ = r3
            r4.A0E()
            X.Bm6 r1 = r4.A00
            X.2BY r1 = (X.AnonymousClass2BY) r1
            X.Bm6 r0 = r7.A0C()
            X.2BS r0 = (X.AnonymousClass2BS) r0
            r0.getClass()
            r1.devicePairingData_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
        L_0x066b:
            X.Bm6 r0 = r4.A00
            X.2BY r0 = (X.AnonymousClass2BY) r0
            boolean r0 = r0.oc_
            if (r0 == 0) goto L_0x071e
            goto L_0x06dd
        L_0x0674:
            X.2RG r0 = X.AnonymousClass2RG.ANDROID_AMBIGUOUS
            goto L_0x0576
        L_0x0678:
            X.2RG r0 = X.AnonymousClass2RG.ANDROID_PHONE
            goto L_0x0576
        L_0x067c:
            X.2RB r0 = X.AnonymousClass2RB.USER_ACTIVATED
            goto L_0x03f8
        L_0x0680:
            r0 = 1
            if (r8 != r0) goto L_0x0687
            X.2R9 r9 = X.AnonymousClass2R9.GOOGLE
            goto L_0x0342
        L_0x0687:
            r0 = 2
            if (r8 != r0) goto L_0x068e
            X.2R9 r9 = X.AnonymousClass2R9.HARDCODED
            goto L_0x0342
        L_0x068e:
            r0 = 3
            if (r8 != r0) goto L_0x0695
            X.2R9 r9 = X.AnonymousClass2R9.OVERRIDE
            goto L_0x0342
        L_0x0695:
            r0 = 4
            if (r8 != r0) goto L_0x0382
            X.2R9 r9 = X.AnonymousClass2R9.FALLBACK
            goto L_0x0342
        L_0x069c:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x06a5
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x06d9;
                case 2: goto L_0x06d5;
                case 3: goto L_0x06d1;
                case 4: goto L_0x06cd;
                case 5: goto L_0x06c9;
                case 6: goto L_0x06c9;
                case 7: goto L_0x06c5;
                case 8: goto L_0x06c1;
                case 9: goto L_0x06bd;
                case 10: goto L_0x06b9;
                case 11: goto L_0x06b5;
                case 12: goto L_0x06c9;
                case 13: goto L_0x06b1;
                case 14: goto L_0x06ad;
                case 15: goto L_0x06a9;
                default: goto L_0x06a5;
            }
        L_0x06a5:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_UNKNOWN
            goto L_0x030c
        L_0x06a9:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_HSPAP
            goto L_0x030c
        L_0x06ad:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_EHRPD
            goto L_0x030c
        L_0x06b1:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_LTE
            goto L_0x030c
        L_0x06b5:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_IDEN
            goto L_0x030c
        L_0x06b9:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_HSPA
            goto L_0x030c
        L_0x06bd:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_HSUPA
            goto L_0x030c
        L_0x06c1:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_HSDPA
            goto L_0x030c
        L_0x06c5:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_1XRTT
            goto L_0x030c
        L_0x06c9:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_EVDO
            goto L_0x030c
        L_0x06cd:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_CDMA
            goto L_0x030c
        L_0x06d1:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_UMTS
            goto L_0x030c
        L_0x06d5:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_EDGE
            goto L_0x030c
        L_0x06d9:
            X.2RC r0 = X.AnonymousClass2RC.CELLULAR_GPRS
            goto L_0x030c
        L_0x06dd:
            android.content.pm.Signature r0 = r14.A00     // Catch:{ Exception -> 0x071a }
            if (r0 != 0) goto L_0x06f3
            java.lang.String r0 = r2.getPackageName()     // Catch:{ Exception -> 0x071a }
            r14.A01 = r0     // Catch:{ Exception -> 0x071a }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ Exception -> 0x071a }
            java.lang.String r0 = r14.A01     // Catch:{ Exception -> 0x071a }
            android.content.pm.Signature r0 = X.C20070A5v.A00(r1, r0)     // Catch:{ Exception -> 0x071a }
            r14.A00 = r0     // Catch:{ Exception -> 0x071a }
        L_0x06f3:
            X.00H r0 = r14.A06     // Catch:{ Exception -> 0x071a }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x071a }
            X.2qV r2 = (X.C61922qV) r2     // Catch:{ Exception -> 0x071a }
            android.content.pm.Signature r0 = r14.A00     // Catch:{ Exception -> 0x071a }
            byte[] r1 = r0.toByteArray()     // Catch:{ Exception -> 0x071a }
            java.lang.String r0 = r14.A01     // Catch:{ Exception -> 0x071a }
            boolean r0 = r2.A00(r0, r1)     // Catch:{ Exception -> 0x071a }
            r3 = r0 ^ 1
            r4.A0E()     // Catch:{ Exception -> 0x071a }
            X.Bm6 r2 = r4.A00     // Catch:{ Exception -> 0x071a }
            X.2BY r2 = (X.AnonymousClass2BY) r2     // Catch:{ Exception -> 0x071a }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x071a }
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x071a }
            r2.oc_ = r3     // Catch:{ Exception -> 0x071a }
            goto L_0x071e
        L_0x071a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x071e:
            X.0ve r2 = r14.A03
            r1 = 1722(0x6ba, float:2.413E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r2, r1)
            r0 = -1
            if (r2 == r0) goto L_0x0749
            byte[] r1 = new byte[r2]
            java.security.SecureRandom r0 = X.C22691Cv.A00()
            r0.nextBytes(r1)
            r0 = 0
            X.BmB r3 = X.DSQ.A01(r1, r0, r2)
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.paddingBytes_ = r3
        L_0x0749:
            X.0vc r0 = r14.A0F
            int r3 = X.C24191Jf.A02(r6, r0)
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r1 = r2.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.yearClass_ = r3
            int r3 = X.C24161Jc.A00(r6)
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r1 = r2.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.memClass_ = r3
            X.00H r0 = r14.A0I
            java.lang.Object r0 = r0.get()
            X.1Si r0 = (X.C26491Si) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x079c
            X.2R5 r0 = X.AnonymousClass2R5.STANDARD
        L_0x0783:
            r4.A0E()
            X.Bm6 r2 = r4.A00
            X.2BY r2 = (X.AnonymousClass2BY) r2
            int r0 = r0.value
            r2.trafficAnonymization_ = r0
            int r1 = r2.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r2.bitField0_ = r1
            X.Bm6 r0 = r4.A0C()
            X.2BY r0 = (X.AnonymousClass2BY) r0
            return r0
        L_0x079c:
            X.2R5 r0 = X.AnonymousClass2R5.OFF
            goto L_0x0783
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31401fV.A01(X.2cU, com.whatsapp.jid.UserJid, X.2e6, int, int, long, boolean):X.2BY");
    }
}
