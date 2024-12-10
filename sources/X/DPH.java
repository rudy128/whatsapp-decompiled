package X;

public final class DPH implements C28583E8u {
    public final C25419CfR A00;

    public DPH(C25419CfR cfR) {
        C18070vi.A0d(cfR, 1);
        this.A00 = cfR;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DPH) && C18070vi.A18(this.A00, ((DPH) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Object BK3(C4Q c4q) {
        Object valueOf;
        if (c4q instanceof C23936BsW) {
            return C173018uO.A00;
        }
        if (c4q instanceof C23931BsR) {
            valueOf = Boolean.valueOf(((C23931BsR) c4q).A00);
        } else if (c4q instanceof C23935BsV) {
            valueOf = ((C23935BsV) c4q).A00;
        } else if (c4q instanceof C23932BsS) {
            byte[] bArr = ((C23932BsS) c4q).A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("$U64$");
            String A0x = AnonymousClass8BT.A0x(bArr);
            C18070vi.A0X(A0x);
            String A0y = AnonymousClass000.A0y(A0x, A10);
            if (!(!(A0y instanceof AnonymousClass1IU))) {
                return A0y;
            }
            try {
                return C181389Qh.A00(A0y);
            } catch (Throwable th) {
                return C108945cZ.A1J(th);
            }
        } else if (c4q instanceof C23934BsU) {
            valueOf = Long.valueOf(((C23934BsU) c4q).A00);
        } else if (!(c4q instanceof C23933BsT)) {
            return C30691eM.A00(new C23943Bsd(c4q));
        } else {
            valueOf = Double.valueOf(((C23933BsT) c4q).A00);
        }
        return C181389Qh.A00(valueOf);
    }

    public Object BK4(C4U c4u) {
        Object valueOf;
        if (c4u instanceof C23955Bsp) {
            valueOf = ((C23955Bsp) c4u).A00;
        } else if (c4u instanceof C23950Bsk) {
            valueOf = Boolean.valueOf(((C23950Bsk) c4u).A00);
        } else if (c4u instanceof C23956Bsq) {
            valueOf = Long.valueOf(((C23956Bsq) c4u).A00);
        } else if (c4u instanceof C23954Bso) {
            valueOf = Double.valueOf(((C23954Bso) c4u).A00);
        } else if (c4u instanceof C23951Bsl) {
            String A0x = AnonymousClass8BT.A0x(((C23951Bsl) c4u).A00);
            C18070vi.A0X(A0x);
            if (!(!(A0x instanceof AnonymousClass1IU))) {
                return A0x;
            }
            try {
                return C181389Qh.A00(A0x);
            } catch (Throwable th) {
                return C108945cZ.A1J(th);
            }
        } else if (c4u instanceof C23953Bsn) {
            String A0x2 = AnonymousClass8BT.A0x(((C23953Bsn) c4u).A00);
            C18070vi.A0X(A0x2);
            if (!(A0x2 instanceof AnonymousClass1IU)) {
                return C181389Qh.A00(A0x2);
            }
            return A0x2;
        } else if (c4u instanceof C23952Bsm) {
            return new C26148CtD(this).A02(((C23952Bsm) c4u).A00);
        } else {
            throw AnonymousClass3MW.A14();
        }
        return C181389Qh.A00(valueOf);
    }

    public Object BK2(C4U c4u, String str) {
        return BK4(c4u);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoJsonScalarEncoderBase64(mode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public DPH() {
        this(C25419CfR.A00);
    }
}
