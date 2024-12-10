package X;

import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2sp  reason: invalid class name and case insensitive filesystem */
public class C63292sp {
    public C59312m6 A00;
    public AnonymousClass37B A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1U3 A03;
    public final C56772i0 A04 = new C56772i0(this);
    public final C138556xH A05;
    public final C54712ea A06;
    public final C26711Te A07;
    public final C26691Tc A08;
    public final C26811To A09;
    public final C26371Rw A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass1RK A0C;
    public final C35831ms A0D;
    public final AnonymousClass10I A0E;
    public final C19880zA A0F;
    public final AnonymousClass190 A0G;
    public final C57652jQ A0H;
    public final C19830z4 A0I;
    public final C18030ve A0J;
    public final AnonymousClass1OZ A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r1 == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C129996ii r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            r6 = r11
            X.37B r0 = r11.A01
            if (r0 == 0) goto L_0x000a
            boolean r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r5 = 0
            if (r0 != 0) goto L_0x0059
            X.1RK r0 = r11.A0C
            java.lang.Object r1 = r0.A0M
            monitor-enter(r1)
            X.2m6 r0 = r0.A00     // Catch:{ all -> 0x0056 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0059
            X.1U3 r0 = r11.A03
            long r3 = r0.A01()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "CompanionDeviceQrHandler/startPairDevice invalid local ts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.6xH r3 = r11.A05
            X.BCS r2 = r3.A04
            r1 = -8
            r0 = 1
            r2.BiF(r0, r1)
            X.5bt r0 = r3.A05
            r0.Bw6()
            return
        L_0x003c:
            X.6xH r0 = r11.A05
            r7 = r12
            r0.A01 = r12
            r9 = r14
            r0.A00 = r14
            r8 = r13
            r0.A02 = r13
            r11.A04(r5)
            X.10I r0 = r11.A0E
            r10 = 6
            X.3Cm r5 = new X.3Cm
            r5.<init>(r6, r7, r8, r9, r10)
            r0.CGF(r5)
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0059:
            java.lang.String r0 = "CompanionDeviceQrHandler/startPairDevice/request already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r2 = r11.A0G
            X.1RK r0 = r11.A0C
            java.lang.Object r1 = r0.A0M
            monitor-enter(r1)
            X.2m6 r0 = r0.A00     // Catch:{ all -> 0x0076 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "CompanionDeviceQrHandler/request already in progress"
            r2.A0G(r0, r1, r5)
            return
        L_0x0076:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0076 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63292sp.A03(X.6ii, java.lang.String, int):void");
    }

    public static void A00(C63292sp r1) {
        AnonymousClass37B r12 = r1.A01;
        if (r12 != null) {
            r12.A03 = false;
        }
    }

    public static void A01(C63292sp r17, C129996ii r18, AnonymousClass2RD r19, long j, boolean z) {
        Throwable th;
        byte[] bArr;
        C63292sp r13 = r17;
        C19830z4 r0 = r13.A0I;
        int A032 = r0.A03();
        int A022 = r0.A02();
        AnonymousClass1U3 r5 = r13.A03;
        C129996ii r15 = r18;
        AnonymousClass2RD r2 = r15.A01;
        C23624Bmt A0N = AnonymousClass2BM.DEFAULT_INSTANCE.A0N();
        AnonymousClass2BM r1 = (AnonymousClass2BM) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.rawId_ = A032;
        AnonymousClass2BM r12 = (AnonymousClass2BM) C17880vN.A0G(A0N);
        r12.bitField0_ |= 4;
        r12.keyIndex_ = A022;
        AnonymousClass2BM r14 = (AnonymousClass2BM) C17880vN.A0G(A0N);
        r14.bitField0_ |= 2;
        r14.timestamp_ = j;
        AnonymousClass2BM r16 = (AnonymousClass2BM) C17880vN.A0G(A0N);
        r16.deviceType_ = r2.value;
        r16.bitField0_ |= 16;
        AnonymousClass2BM r110 = (AnonymousClass2BM) C17880vN.A0G(A0N);
        AnonymousClass2RD r142 = r19;
        r110.accountType_ = r142.value;
        r110.bitField0_ |= 8;
        AnonymousClass2BM r111 = (AnonymousClass2BM) A0N.A0C();
        try {
            C58252kO r02 = r15.A00;
            C17960vV.A07(r02);
            byte[] bArr2 = r02.A00.A00;
            C53272cG A002 = AnonymousClass1U3.A00(r5);
            C17960vV.A07(A002);
            C58242kN r11 = A002.A00;
            C33801jP r122 = A002.A01.A00;
            byte[] bArr3 = C19620yd.A0E;
            AnonymousClass2RD r10 = AnonymousClass2RD.HOSTED;
            AnonymousClass2RD A003 = AnonymousClass2RD.A00(r111.deviceType_);
            if (A003 == null || A003 != r10) {
                byte[][] bArr4 = new byte[3][];
                AnonymousClass001.A1Q(bArr3, r111.A0M(), bArr4);
                bArr4[2] = bArr2;
                byte[] A052 = A8G.A05(bArr4);
                AnonymousClass2AV r8 = (AnonymousClass2AV) AnonymousClass2BI.DEFAULT_INSTANCE.A0N();
                C23581BmB A0K2 = r111.A0K();
                AnonymousClass2BI r112 = (AnonymousClass2BI) C17880vN.A0G(r8);
                r112.bitField0_ |= 1;
                r112.details_ = A0K2;
                C23581BmB A033 = C17900vP.A03(r8, r122.A00);
                AnonymousClass2BI r113 = (AnonymousClass2BI) r8.A00;
                r113.bitField0_ |= 2;
                r113.accountSignatureKey_ = A033;
                C23581BmB A034 = C17900vP.A03(r8, C63962tz.A09(r11, A052));
                AnonymousClass2BI r114 = (AnonymousClass2BI) r8.A00;
                r114.bitField0_ |= 4;
                r114.accountSignature_ = A034;
                AnonymousClass2BI r82 = (AnonymousClass2BI) r8.A0C();
                byte[] bArr5 = r15.A04;
                C17960vV.A07(bArr5);
                if (r142 == r10) {
                    bArr = A8G.A05(C19620yd.A0F, r82.A0M());
                } else {
                    bArr = r82.A0M();
                }
                try {
                    byte[] A004 = AnonymousClass9QC.A00(bArr, bArr5);
                    AnonymousClass2AW r22 = (AnonymousClass2AW) AnonymousClass2BA.DEFAULT_INSTANCE.A0N();
                    C23581BmB A0K3 = r82.A0K();
                    AnonymousClass2BA r115 = (AnonymousClass2BA) C17880vN.A0G(r22);
                    r115.bitField0_ |= 1;
                    r115.details_ = A0K3;
                    C23581BmB A035 = C17900vP.A03(r22, A004);
                    AnonymousClass2BA r116 = (AnonymousClass2BA) r22.A00;
                    r116.bitField0_ |= 2;
                    r116.hmac_ = A035;
                    AnonymousClass2BA r117 = (AnonymousClass2BA) C17880vN.A0G(r22);
                    r117.accountType_ = r142.value;
                    r117.bitField0_ |= 4;
                    AnonymousClass2BR A023 = r5.A02(r142, A032, A022, j);
                    r13.A02.A0J(new AnonymousClass3CS(r13, r142, r15, A023, (AnonymousClass2BA) r22.A0C(), r5.A03(A023), 1, z));
                } catch (Exception e) {
                    th = new RuntimeException("Failed to calculate hmac-sha256", e);
                }
            } else {
                th = AnonymousClass000.A0k("doesn't support pairing hosted device with e2ee account");
                throw th;
            }
        } catch (Exception e2) {
            Log.e("CompanionDeviceQrHandler/handleQrCode", e2);
            if ((e2 instanceof ExecutionException) || (e2 instanceof InterruptedException) || (e2 instanceof IllegalArgumentException)) {
                r13.A02.A0J(new C98764rg((Object) r13, 19));
                return;
            }
            throw new RuntimeException("Failed to generate adv protobufs", e2);
        }
    }

    public void A04(boolean z) {
        C138556xH r4 = this.A05;
        r4.A05.BrR();
        C129996ii r3 = r4.A01;
        if (r3 != null) {
            BCS bcs = r4.A04;
            C17960vV.A07(r3);
            bcs.C2p(r3, r4.A02, r4.A00);
        } else {
            r4.A03.A0G(C17900vP.A0D("companion-pairing/missing_pairing_log: ", AnonymousClass000.A10(), z), (String) null, false);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CompanionDeviceQrHandler/notifyOnDevicePairingRequested/missing pairing data: ");
            A10.append(z);
            C17890vO.A0w(A10);
        }
        AnonymousClass11P r42 = this.A0B;
        AnonymousClass1KB r2 = this.A02;
        this.A01 = new AnonymousClass37B(this.A0G, r2, this.A04, r42, this.A0K);
    }

    public C63292sp(C19880zA r3, AnonymousClass190 r4, AnonymousClass1KB r5, AnonymousClass1U3 r6, C57652jQ r7, C54712ea r8, C26711Te r9, C26691Tc r10, C130006ij r11, C26811To r12, C26371Rw r13, AnonymousClass11P r14, C19830z4 r15, AnonymousClass1RK r16, C18030ve r17, AnonymousClass1OZ r18, C108555bt r19, C35831ms r20, AnonymousClass10I r21) {
        this.A0B = r14;
        this.A0J = r17;
        this.A02 = r5;
        this.A0G = r4;
        this.A0E = r21;
        this.A09 = r12;
        this.A0K = r18;
        this.A0A = r13;
        this.A0I = r15;
        this.A0C = r16;
        this.A03 = r6;
        this.A07 = r9;
        this.A08 = r10;
        this.A0H = r7;
        this.A0F = r3;
        this.A0D = r20;
        this.A06 = r8;
        this.A05 = new C138556xH(r4, r7, r11, r19);
    }

    public void A02() {
        A00(this);
        AnonymousClass1RK r2 = this.A0C;
        synchronized (r2.A0M) {
            r2.A01 = null;
        }
    }
}
