package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

public class A7J {
    public static final byte[] A07 = {69, 68, 0, 1};
    public final AnonymousClass11P A00;
    public final C24521Kq A01;
    public final AnonymousClass2BY A02;
    public final C31321fN A03;
    public final AnonymousClass9HS A04;
    public final C55522fv A05;
    public final A42 A06;

    private byte[] A02() {
        return new byte[]{87, 65, 6, 3};
    }

    private C165068aX A00() {
        A42 a42 = this.A06;
        byte[] bArr = new byte[3];
        A42.A00(a42, bArr);
        if (!Arrays.equals(A42.A01, bArr)) {
            byte[] bArr2 = new byte[A8G.A00(bArr)];
            A42.A00(a42, bArr2);
            C165078aY r1 = (C165078aY) C23577Bm6.A07(C165078aY.DEFAULT_INSTANCE, bArr2);
            if ((r1.bitField0_ & 2) != 0) {
                C165068aX r0 = r1.serverHello_;
                if (r0 == null) {
                    return C165068aX.DEFAULT_INSTANCE;
                }
                return r0;
            }
            throw C17880vN.A0f("Handshake message does not contain server hello!");
        }
        throw new C31721g1();
    }

    private C55522fv A01(C165068aX r11, C21523AlW alW, C21523AlW alW2, C19987A1y a1y) {
        C165478bD r5;
        C165478bD r2;
        String str;
        try {
            byte[] A062 = r11.ephemeral_.A06();
            a1y.A03.A00(A062);
            C21521AlU alU = new C21521AlU(A062);
            C21520AlT alT = alW.A01;
            a1y.A00(C181939Sk.A00(alT, alU));
            C21521AlU alU2 = new C21521AlU(a1y.A01(r11.static_.A06()));
            a1y.A00(C181939Sk.A00(alT, alU2));
            try {
                C164278Yf r0 = (C164278Yf) C23577Bm6.A07(C164278Yf.DEFAULT_INSTANCE, a1y.A01(r11.payload_.A06()));
                if (r0 != null) {
                    C164268Ye r8 = r0.intermediate_;
                    if (r8 == null) {
                        r8 = C164268Ye.DEFAULT_INSTANCE;
                    }
                    C164268Ye r9 = r0.leaf_;
                    if (!((r9 == null && (r9 = C164268Ye.DEFAULT_INSTANCE) == null) || r8 == null)) {
                        try {
                            r5 = (C165478bD) C23577Bm6.A07(C165478bD.DEFAULT_INSTANCE, r9.details_.A06());
                        } catch (AnonymousClass1PN e) {
                            Log.e("wa6 certificate details parsing failed", e);
                            r5 = null;
                        }
                        try {
                            r2 = (C165478bD) C23577Bm6.A07(C165478bD.DEFAULT_INSTANCE, r8.details_.A06());
                        } catch (AnonymousClass1PN e2) {
                            Log.e("wa6 certificate details parsing failed", e2);
                            r2 = null;
                        }
                        if (!(r5 == null || r2 == null)) {
                            int i = r2.bitField0_;
                            if (!((i & 1) == 0 || (r5.bitField0_ & 2) == 0 || r2.serial_ != r5.issuerSerial_ || (i & 2) == 0 || r2.issuerSerial_ != 0)) {
                                if (!Arrays.equals(r5.key_.A06(), alU2.A01)) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("wa6: noise certificate key does not match proposed server static key; issuer=");
                                    str = C17880vN.A0t(A10, r5.issuerSerial_);
                                } else {
                                    byte[] A063 = r2.key_.A06();
                                    C21521AlU alU3 = (C21521AlU) AnonymousClass9U0.A00.get("WhatsAppLongTerm1");
                                    if (alU3 == null) {
                                        str = "wa6: intermediate cert key is missing";
                                    } else {
                                        boolean A012 = C19945A0c.A00().A01(new C21521AlU(A063).A01, r5.A0M(), r9.signature_.A06());
                                        boolean A013 = C19945A0c.A00().A01(alU3.A01, r8.details_.A06(), r8.signature_.A06());
                                        if (!A012 || !A013) {
                                            str = "wa6: invalid signature on noise certificate";
                                        } else {
                                            byte[] A022 = a1y.A02(alW2.A02.A01);
                                            a1y.A00(C181939Sk.A00(alW2.A01, alU));
                                            byte[] A023 = a1y.A02(this.A02.A0M());
                                            C23624Bmt A0N = C164548Zg.DEFAULT_INSTANCE.A0N();
                                            C23581BmB A032 = C17900vP.A03(A0N, A022);
                                            C164548Zg r1 = (C164548Zg) A0N.A00;
                                            r1.bitField0_ |= 1;
                                            r1.static_ = A032;
                                            C23581BmB A033 = C17900vP.A03(A0N, A023);
                                            C164548Zg r12 = (C164548Zg) A0N.A00;
                                            r12.bitField0_ |= 2;
                                            r12.payload_ = A033;
                                            C164548Zg r4 = (C164548Zg) A0N.A0C();
                                            C23624Bmt A08 = AnonymousClass8BS.A08(C165078aY.DEFAULT_INSTANCE);
                                            C165078aY r13 = (C165078aY) A08.A00;
                                            r4.getClass();
                                            r13.clientFinish_ = r4;
                                            r13.bitField0_ |= 4;
                                            this.A04.write(A08.A0C().A0M());
                                            byte[][] A034 = C20058A5h.A03(new byte[0], a1y.A02);
                                            return new C55522fv(alU2, A034[0], A034[1]);
                                        }
                                    }
                                }
                                Log.e(str);
                            }
                        }
                    }
                }
            } catch (AnonymousClass1PN e3) {
                Log.e("wa6 noise certificate parsing failed", e3);
            }
            throw new C31741g3(this);
        } catch (C30981ep e4) {
            throw new AnonymousClass2QS(e4);
        }
    }

    public C54002dR A03() {
        C55522fv r2 = this.A05;
        r2.getClass();
        return new C54002dR(r2, this.A06);
    }

    public C54012dS A04() {
        C55522fv r2 = this.A05;
        r2.getClass();
        return new C54012dS(this.A04, r2);
    }

    public C21521AlU A05() {
        return this.A05.A02;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.9HS, java.io.FilterOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01c2, code lost:
        throw new X.AnonymousClass2QS(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01c4, code lost:
        r3 = r0.serverHello;
        r2 = new X.C19987A1y(X.C19987A1y.A04, A02());
        r2.A03.A00(r4.A02.A01);
        r2 = A01(r3, r4, r5, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0070, B:11:0x00cc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A7J(X.AnonymousClass11P r14, X.C24521Kq r15, X.AnonymousClass2BY r16, X.C31321fN r17, java.io.InputStream r18, java.io.OutputStream r19, X.C21523AlW r20, X.C21521AlU r21) {
        /*
            r13 = this;
            r13.<init>()
            r13.A00 = r14
            r13.A01 = r15
            r0 = r17
            r13.A03 = r0
            X.AlW r4 = X.C21523AlW.A00()
            X.1fN r0 = r13.A03
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "routing_info"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = r19
            if (r0 != 0) goto L_0x004c
            r1 = 3
            byte[] r6 = android.util.Base64.decode(r2, r1)
            if (r6 == 0) goto L_0x004c
            int r5 = r6.length
            if (r5 <= 0) goto L_0x004c
            byte[] r0 = A07
            r3.write(r0)
            byte[] r2 = new byte[r1]
            r1 = 2
            byte r0 = (byte) r5
            r2[r1] = r0
            int r0 = r5 >> 8
            byte r1 = (byte) r0
            r0 = 1
            r2[r0] = r1
            int r0 = r5 >> 16
            byte r1 = (byte) r0
            r0 = 0
            r2[r0] = r1
            r3.write(r2)
            r3.write(r6)
        L_0x004c:
            byte[] r0 = r13.A02()
            r3.write(r0)
            r0 = r16
            X.C17960vV.A07(r0)
            r13.A02 = r0
            X.A42 r0 = new X.A42
            r1 = r18
            r0.<init>(r1)
            r13.A06 = r0
            X.9HS r0 = new X.9HS
            r0.<init>(r3)
            r13.A04 = r0
            r5 = r20
            r3 = r21
            if (r21 != 0) goto L_0x00cc
            byte[] r1 = X.C19987A1y.A05     // Catch:{ 9L8 -> 0x01c3 }
            byte[] r0 = r13.A02()     // Catch:{ 9L8 -> 0x01c3 }
            X.A1y r6 = new X.A1y     // Catch:{ 9L8 -> 0x01c3 }
            r6.<init>(r1, r0)     // Catch:{ 9L8 -> 0x01c3 }
            X.AlU r0 = r4.A02     // Catch:{ 9L8 -> 0x01c3 }
            byte[] r1 = r0.A01     // Catch:{ 9L8 -> 0x01c3 }
            X.9Nj r0 = r6.A03     // Catch:{ 9L8 -> 0x01c3 }
            r0.A00(r1)     // Catch:{ 9L8 -> 0x01c3 }
            X.8aW r0 = X.C165058aW.DEFAULT_INSTANCE     // Catch:{ 9L8 -> 0x01c3 }
            X.Bmt r3 = r0.A0N()     // Catch:{ 9L8 -> 0x01c3 }
            X.BmB r2 = X.C17900vP.A03(r3, r1)     // Catch:{ 9L8 -> 0x01c3 }
            X.Bm6 r1 = r3.A00     // Catch:{ 9L8 -> 0x01c3 }
            X.8aW r1 = (X.C165058aW) r1     // Catch:{ 9L8 -> 0x01c3 }
            int r0 = r1.bitField0_     // Catch:{ 9L8 -> 0x01c3 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 9L8 -> 0x01c3 }
            r1.ephemeral_ = r2     // Catch:{ 9L8 -> 0x01c3 }
            X.Bm6 r3 = r3.A0C()     // Catch:{ 9L8 -> 0x01c3 }
            X.8aW r3 = (X.C165058aW) r3     // Catch:{ 9L8 -> 0x01c3 }
            X.8aY r0 = X.C165078aY.DEFAULT_INSTANCE     // Catch:{ 9L8 -> 0x01c3 }
            X.Bmt r2 = X.AnonymousClass8BS.A08(r0)     // Catch:{ 9L8 -> 0x01c3 }
            X.Bm6 r1 = r2.A00     // Catch:{ 9L8 -> 0x01c3 }
            X.8aY r1 = (X.C165078aY) r1     // Catch:{ 9L8 -> 0x01c3 }
            r3.getClass()     // Catch:{ 9L8 -> 0x01c3 }
            r1.clientHello_ = r3     // Catch:{ 9L8 -> 0x01c3 }
            int r0 = r1.bitField0_     // Catch:{ 9L8 -> 0x01c3 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 9L8 -> 0x01c3 }
            X.Bm6 r0 = r2.A0C()     // Catch:{ 9L8 -> 0x01c3 }
            X.9HS r1 = r13.A04     // Catch:{ 9L8 -> 0x01c3 }
            byte[] r0 = r0.A0M()     // Catch:{ 9L8 -> 0x01c3 }
            r1.write(r0)     // Catch:{ 9L8 -> 0x01c3 }
            X.8aX r0 = r13.A00()     // Catch:{ 9L8 -> 0x01c3 }
            X.2fv r2 = r13.A01(r0, r4, r5, r6)     // Catch:{ 9L8 -> 0x01c3 }
            goto L_0x01de
        L_0x00cc:
            byte[] r1 = X.C19987A1y.A06     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r13.A02()     // Catch:{ 1ep -> 0x01bc }
            X.A1y r2 = new X.A1y     // Catch:{ 1ep -> 0x01bc }
            r2.<init>(r1, r0)     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r3.A01     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r2.A01(r0)     // Catch:{ 1ep -> 0x01bc }
            X.AlU r6 = new X.AlU     // Catch:{ 1ep -> 0x01bc }
            r6.<init>(r0)     // Catch:{ 1ep -> 0x01bc }
            X.AlU r0 = r4.A02     // Catch:{ 1ep -> 0x01bc }
            byte[] r1 = r0.A01     // Catch:{ 1ep -> 0x01bc }
            X.9Nj r9 = r2.A03     // Catch:{ 1ep -> 0x01bc }
            r9.A00(r1)     // Catch:{ 1ep -> 0x01bc }
            X.AlT r8 = r4.A01     // Catch:{ 1ep -> 0x01bc }
            X.C18070vi.A0W(r8)     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = X.C181939Sk.A00(r8, r6)     // Catch:{ 1ep -> 0x01bc }
            r2.A00(r0)     // Catch:{ 1ep -> 0x01bc }
            X.AlU r0 = r5.A02     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r0.A01     // Catch:{ 1ep -> 0x01bc }
            byte[] r12 = r2.A02(r0)     // Catch:{ 1ep -> 0x01bc }
            X.AlT r7 = r5.A01     // Catch:{ 1ep -> 0x01bc }
            X.C18070vi.A0W(r7)     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = X.C181939Sk.A00(r7, r6)     // Catch:{ 1ep -> 0x01bc }
            r2.A00(r0)     // Catch:{ 1ep -> 0x01bc }
            X.2BY r0 = r13.A02     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r0.A0M()     // Catch:{ 1ep -> 0x01bc }
            byte[] r11 = r2.A02(r0)     // Catch:{ 1ep -> 0x01bc }
            X.8aW r0 = X.C165058aW.DEFAULT_INSTANCE     // Catch:{ 1ep -> 0x01bc }
            X.Bmt r10 = r0.A0N()     // Catch:{ 1ep -> 0x01bc }
            X.BmB r3 = X.C17900vP.A03(r10, r1)     // Catch:{ 1ep -> 0x01bc }
            X.Bm6 r1 = r10.A00     // Catch:{ 1ep -> 0x01bc }
            X.8aW r1 = (X.C165058aW) r1     // Catch:{ 1ep -> 0x01bc }
            int r0 = r1.bitField0_     // Catch:{ 1ep -> 0x01bc }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 1ep -> 0x01bc }
            r1.ephemeral_ = r3     // Catch:{ 1ep -> 0x01bc }
            X.BmB r3 = X.C17900vP.A03(r10, r12)     // Catch:{ 1ep -> 0x01bc }
            X.Bm6 r1 = r10.A00     // Catch:{ 1ep -> 0x01bc }
            X.8aW r1 = (X.C165058aW) r1     // Catch:{ 1ep -> 0x01bc }
            int r0 = r1.bitField0_     // Catch:{ 1ep -> 0x01bc }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ 1ep -> 0x01bc }
            r1.static_ = r3     // Catch:{ 1ep -> 0x01bc }
            X.BmB r3 = X.C17900vP.A03(r10, r11)     // Catch:{ 1ep -> 0x01bc }
            X.Bm6 r1 = r10.A00     // Catch:{ 1ep -> 0x01bc }
            X.8aW r1 = (X.C165058aW) r1     // Catch:{ 1ep -> 0x01bc }
            int r0 = r1.bitField0_     // Catch:{ 1ep -> 0x01bc }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ 1ep -> 0x01bc }
            r1.payload_ = r3     // Catch:{ 1ep -> 0x01bc }
            X.Bm6 r10 = r10.A0C()     // Catch:{ 1ep -> 0x01bc }
            X.8aW r10 = (X.C165058aW) r10     // Catch:{ 1ep -> 0x01bc }
            X.8aY r0 = X.C165078aY.DEFAULT_INSTANCE     // Catch:{ 1ep -> 0x01bc }
            X.Bmt r3 = X.AnonymousClass8BS.A08(r0)     // Catch:{ 1ep -> 0x01bc }
            X.Bm6 r1 = r3.A00     // Catch:{ 1ep -> 0x01bc }
            X.8aY r1 = (X.C165078aY) r1     // Catch:{ 1ep -> 0x01bc }
            r10.getClass()     // Catch:{ 1ep -> 0x01bc }
            r1.clientHello_ = r10     // Catch:{ 1ep -> 0x01bc }
            int r0 = r1.bitField0_     // Catch:{ 1ep -> 0x01bc }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 1ep -> 0x01bc }
            X.Bm6 r0 = r3.A0C()     // Catch:{ 1ep -> 0x01bc }
            X.9HS r1 = r13.A04     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r0.A0M()     // Catch:{ 1ep -> 0x01bc }
            r1.write(r0)     // Catch:{ 1ep -> 0x01bc }
            X.8aX r3 = r13.A00()     // Catch:{ 1ep -> 0x01bc }
            int r0 = r3.bitField0_     // Catch:{ 1ep -> 0x01bc }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0183
            X.9L8 r0 = new X.9L8     // Catch:{ 1ep -> 0x01bc }
            r0.<init>(r3)     // Catch:{ 1ep -> 0x01bc }
            throw r0     // Catch:{ 1ep -> 0x01bc }
        L_0x0183:
            X.DSQ r0 = r3.ephemeral_     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r0.A06()     // Catch:{ 1ep -> 0x01bc }
            r9.A00(r0)     // Catch:{ 1ep -> 0x01bc }
            X.AlU r1 = new X.AlU     // Catch:{ 1ep -> 0x01bc }
            r1.<init>(r0)     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = X.C181939Sk.A00(r8, r1)     // Catch:{ 1ep -> 0x01bc }
            r2.A00(r0)     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = X.C181939Sk.A00(r7, r1)     // Catch:{ 1ep -> 0x01bc }
            r2.A00(r0)     // Catch:{ 1ep -> 0x01bc }
            X.DSQ r0 = r3.payload_     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r0.A06()     // Catch:{ 1ep -> 0x01bc }
            r2.A01(r0)     // Catch:{ 1ep -> 0x01bc }
            r3 = 0
            byte[] r1 = new byte[r3]     // Catch:{ 1ep -> 0x01bc }
            byte[] r0 = r2.A02     // Catch:{ 1ep -> 0x01bc }
            byte[][] r2 = X.C20058A5h.A03(r1, r0)     // Catch:{ 1ep -> 0x01bc }
            r0 = 1
            r1 = r2[r3]     // Catch:{ 1ep -> 0x01bc }
            r0 = r2[r0]     // Catch:{ 1ep -> 0x01bc }
            X.2fv r2 = new X.2fv     // Catch:{ 1ep -> 0x01bc }
            r2.<init>(r6, r1, r0)     // Catch:{ 1ep -> 0x01bc }
            goto L_0x01de
        L_0x01bc:
            r1 = move-exception
            X.2QS r0 = new X.2QS     // Catch:{ 9L8 -> 0x01c3 }
            r0.<init>(r1)     // Catch:{ 9L8 -> 0x01c3 }
            throw r0     // Catch:{ 9L8 -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            X.8aX r3 = r0.serverHello
            byte[] r1 = X.C19987A1y.A04
            byte[] r0 = r13.A02()
            X.A1y r2 = new X.A1y
            r2.<init>(r1, r0)
            X.AlU r0 = r4.A02
            byte[] r1 = r0.A01
            X.9Nj r0 = r2.A03
            r0.A00(r1)
            X.2fv r2 = r13.A01(r3, r4, r5, r2)
        L_0x01de:
            r13.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7J.<init>(X.11P, X.1Kq, X.2BY, X.1fN, java.io.InputStream, java.io.OutputStream, X.AlW, X.AlU):void");
    }
}
