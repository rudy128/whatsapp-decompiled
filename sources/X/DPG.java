package X;

import java.io.ByteArrayInputStream;

public final class DPG implements C28583E8u {
    public Object BK4(C4U c4u) {
        Object valueOf;
        C18070vi.A0d(c4u, 0);
        if (c4u instanceof C23955Bsp) {
            valueOf = ((C23955Bsp) c4u).A00;
        } else if (c4u instanceof C23950Bsk) {
            valueOf = Boolean.valueOf(((C23950Bsk) c4u).A00);
        } else if (c4u instanceof C23956Bsq) {
            valueOf = Long.valueOf(((C23956Bsq) c4u).A00);
        } else if (c4u instanceof C23954Bso) {
            valueOf = Double.valueOf(((C23954Bso) c4u).A00);
        } else if (c4u instanceof C23951Bsl) {
            return C30691eM.A00(new C23944Bse(c4u));
        } else {
            if (c4u instanceof C23953Bsn) {
                return C30691eM.A00(new C23944Bse(c4u));
            }
            if (c4u instanceof C23952Bsm) {
                return new C26148CtD(this).A02(((C23952Bsm) c4u).A00);
            }
            throw AnonymousClass3MW.A14();
        }
        return C181389Qh.A00(valueOf);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof DPG);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1en, java.lang.Object] */
    public Object BK2(C4U c4u, String str) {
        if (!str.endsWith("JID")) {
            return BK4(c4u);
        }
        boolean z = c4u instanceof C23951Bsl;
        Object obj = c4u;
        if (z) {
            ByteArrayInputStream A0h = BE6.A0h(((C23951Bsl) c4u).A00);
            try {
                String A08 = new C30971eo((AnonymousClass190) null, new Object(), (C54002dR) null).A08(A0h, A0h.read());
                if (A08 != null) {
                    obj = new C23955Bsp(A08);
                } else {
                    throw new C23896Brs(c4u);
                }
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
        }
        if (!(!(obj instanceof AnonymousClass1IU))) {
            return obj;
        }
        try {
            Object BK4 = BK4((C4U) obj);
            C30691eM.A01(BK4);
            return (C180759Nu) BK4;
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
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
            return C30691eM.A00(new C23943Bsd(c4q));
        } else {
            if (c4q instanceof C23934BsU) {
                valueOf = Long.valueOf(((C23934BsU) c4q).A00);
            } else if (!(c4q instanceof C23933BsT)) {
                return C30691eM.A00(new C23943Bsd(c4q));
            } else {
                valueOf = Double.valueOf(((C23933BsT) c4q).A00);
            }
        }
        return C181389Qh.A00(valueOf);
    }

    public int hashCode() {
        return 1231;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "MexArgoJsonScalarEncoder(fallback=");
        A10.append(", jid=");
        return C17900vP.A0F(A10, true);
    }
}
