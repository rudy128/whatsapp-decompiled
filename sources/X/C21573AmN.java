package X;

/* renamed from: X.AmN  reason: case insensitive filesystem */
public class C21573AmN implements C72333Ln {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C62202r0 A03;
    public final C21344AiX A04;
    public final C21575AmP A05;
    public final AnonymousClass3BW A06;
    public final byte[] A07;

    public int getType() {
        return 3;
    }

    public C21573AmN(byte[] bArr) {
        Throwable th;
        AnonymousClass3BW r0;
        try {
            int i = (bArr[0] & 255) >> 4;
            this.A02 = i;
            if (i > 3) {
                th = new AnonymousClass1PA(AnonymousClass001.A1I("Unknown version: ", AnonymousClass000.A10(), i));
            } else if (i >= 3) {
                C165738bg r2 = (C165738bg) C23577Bm6.A02(DSQ.A01(bArr, 1, bArr.length - 1), C165738bg.DEFAULT_INSTANCE);
                int i2 = r2.bitField0_;
                if ((i2 & 4) == 0 || (i2 & 8) == 0 || (i2 & 16) == 0 || (i2 & 32) == 0) {
                    th = new AnonymousClass1P5("Incomplete message.");
                } else {
                    this.A07 = bArr;
                    this.A00 = r2.registrationId_;
                    if ((i2 & 2) != 0) {
                        Integer valueOf = Integer.valueOf(r2.preKeyId_);
                        if (valueOf != null) {
                            r0 = new AnonymousClass3K3(valueOf);
                        } else {
                            throw new NullPointerException();
                        }
                    } else {
                        r0 = AnonymousClass3K4.A00;
                    }
                    this.A06 = r0;
                    this.A01 = r2.signedPreKeyId_;
                    this.A04 = C20065A5o.A00(r2.baseKey_);
                    this.A03 = new C62202r0(C20065A5o.A00(r2.identityKey_));
                    this.A05 = new C21575AmP(r2.message_.A06());
                    return;
                }
            } else {
                th = new AnonymousClass1P4(AnonymousClass001.A1I("Legacy version: ", AnonymousClass000.A10(), i));
            }
            throw th;
        } catch (AnonymousClass1P4 | AnonymousClass1P8 | AnonymousClass1PN e) {
            throw new AnonymousClass1P5(e);
        }
    }

    public byte[] CHg() {
        return this.A07;
    }

    public C21573AmN(C62202r0 r6, C21344AiX aiX, C21575AmP amP, AnonymousClass3BW r9, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A06 = r9;
        this.A01 = i3;
        this.A04 = aiX;
        this.A03 = r6;
        this.A05 = amP;
        C23624Bmt A08 = AnonymousClass8BS.A08(C165738bg.DEFAULT_INSTANCE);
        C165738bg r2 = (C165738bg) A08.A00;
        r2.bitField0_ |= 4;
        r2.signedPreKeyId_ = i3;
        C23581BmB A032 = C17900vP.A03(A08, aiX.A00());
        C165738bg r22 = (C165738bg) A08.A00;
        r22.bitField0_ |= 8;
        r22.baseKey_ = A032;
        C23581BmB A033 = C17900vP.A03(A08, r6.A00.A00());
        C165738bg r23 = (C165738bg) A08.A00;
        r23.bitField0_ |= 16;
        r23.identityKey_ = A033;
        C23581BmB A034 = C17900vP.A03(A08, amP.A04);
        C165738bg r24 = (C165738bg) A08.A00;
        r24.bitField0_ |= 32;
        r24.message_ = A034;
        C165738bg r25 = (C165738bg) C17880vN.A0G(A08);
        r25.bitField0_ |= 1;
        r25.registrationId_ = i2;
        if (r9 instanceof AnonymousClass3K3) {
            int A0M = AnonymousClass000.A0M(r9.A00());
            C165738bg r26 = (C165738bg) C17880vN.A0G(A08);
            r26.bitField0_ |= 2;
            r26.preKeyId_ = A0M;
        }
        this.A07 = C20011A3b.A00(new byte[]{(byte) (((i << 4) | 3) & 255)}, AnonymousClass8BT.A1Z(A08));
    }
}
