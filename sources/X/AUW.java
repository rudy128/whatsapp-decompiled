package X;

import com.facebook.msys.mci.DefaultCrypto;

public final class AUW implements C22511BAs {
    public final C26031Qo A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public AUW(C26031Qo r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void C1A(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        Object obj;
        C18070vi.A0h(r7, r6);
        try {
            if (C18020vd.A05(C18040vf.A02, this.A01, 6578)) {
                ((C26041Qp) this.A02.get()).A04(r7);
                C20948Ac2 A002 = C196899vp.A00(r7);
                if (A002 != null) {
                    byte[] bArr = A002.A03;
                    int length = bArr.length;
                    if (length != 0) {
                        AnonymousClass8WJ r3 = (AnonymousClass8WJ) AnonymousClass8YY.DEFAULT_INSTANCE.A0N();
                        C23581BmB A012 = DSQ.A01(bArr, 0, length);
                        AnonymousClass8YY r1 = (AnonymousClass8YY) C17880vN.A0G(r3);
                        r1.bitField0_ |= 1;
                        r1.reportingTag_ = A012;
                        AnonymousClass8YY r0 = (AnonymousClass8YY) r3.A0C();
                        C166388co A0X = C17880vN.A0X(r6);
                        r0.getClass();
                        A0X.reportingTokenInfo_ = r0;
                        A0X.bitField1_ |= DefaultCrypto.BUFFER_SIZE;
                    }
                    obj = C27621Wu.A00;
                    Throwable A003 = C30671eK.A00(obj);
                    if (A003 != null) {
                        this.A00.A01(AnonymousClass8oI.A00, (String) null, A003);
                    }
                }
            }
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
    }

    public void C1B(C193069pU r10, C166388co r11, AnonymousClass206 r12) {
        Object obj;
        DSQ dsq;
        C18070vi.A0h(r11, r12);
        try {
            if (C18020vd.A05(C18040vf.A02, this.A01, 6578)) {
                AnonymousClass8YY r0 = r11.reportingTokenInfo_;
                if ((r0 != null || (r0 = AnonymousClass8YY.DEFAULT_INSTANCE) != null) && (dsq = r0.reportingTag_) != null) {
                    byte[] A06 = dsq.A06();
                    C18070vi.A0b(A06);
                    if (A06.length != 0) {
                        String str = r12.A0v.A01;
                        C18070vi.A0X(str);
                        C196899vp.A01(r12, new C20948Ac2((Integer) null, str, A06, (byte[]) null, (byte[]) null, (byte[]) null, r12.A0I));
                    }
                    obj = C27621Wu.A00;
                    Throwable A002 = C30671eK.A00(obj);
                    if (A002 != null) {
                        this.A00.A01(AnonymousClass8oI.A00, (String) null, A002);
                    }
                }
            }
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
    }
}
