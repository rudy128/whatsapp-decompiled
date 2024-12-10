package X;

import java.util.List;

/* renamed from: X.21L  reason: invalid class name */
public class AnonymousClass21L extends AnonymousClass206 implements AnonymousClass21K, C438020z {
    public C20285AEt A00;
    public Integer A01;
    public final AnonymousClass25F A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass21L(AnonymousClass205 r2, long j) {
        this(r2, 55, j);
        C18070vi.A0d(r2, 1);
    }

    public final List A17() {
        C692736o r0 = (C692736o) this.A02.A02;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final void A18(List list) {
        this.A02.A02(new C692736o(list));
        List<AnonymousClass206> A17 = A17();
        if (A17 != null) {
            for (AnonymousClass206 r1 : A17) {
                if (r1 instanceof AnonymousClass21Z) {
                    ((AnonymousClass21Z) r1).CIG(this);
                }
            }
        }
    }

    public void CIS(C20285AEt aEt) {
        byte[] A05;
        this.A00 = aEt;
        if (aEt == null || (A05 = aEt.A05()) == null) {
            A0p((byte[]) null);
        } else {
            A15(A05, true);
        }
    }

    public C20285AEt BPK() {
        return this.A00;
    }

    public Integer BXm() {
        return this.A01;
    }

    public AnonymousClass21L(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
        this.A02 = A0N(C692736o.class);
    }
}
