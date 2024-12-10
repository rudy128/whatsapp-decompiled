package X;

/* renamed from: X.3qb  reason: invalid class name and case insensitive filesystem */
public class C77563qb extends C77573qc {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77563qb(C24921Me r2, C18000vb r3, C77773rQ r4) {
        super(r2, r3);
        this.A01 = r4;
        C18070vi.A0b(r2);
        C18070vi.A0b(r3);
        C18070vi.A0j(r2, r3);
    }

    public int A00(AnonymousClass1E7 r4, AnonymousClass1E7 r5) {
        int A05;
        if (this.A00 != 0) {
            C18070vi.A0h(r4, r5);
            A05 = ((C77773rQ) this.A01).A00.A05(r4.A0J, r5.A0J);
        } else {
            C53792d6 r1 = r4.A0L;
            C53792d6 r0 = r5.A0L;
            if (r1 == null) {
                if (r0 != null) {
                    return -1;
                }
            } else if (r0 == null) {
                return 1;
            } else {
                AnonymousClass1EC r12 = r1.A01;
                AnonymousClass1EC r02 = r0.A01;
                if (r12 != null) {
                    if (r02 == null) {
                        return 1;
                    }
                } else if (r02 != null) {
                    return -1;
                }
            }
            if (C83804Gs.A00(r4) && !C83804Gs.A00(r5)) {
                return 1;
            }
            if (!C83804Gs.A00(r4) && C83804Gs.A00(r5)) {
                return -1;
            }
            A05 = ((C77793rS) this.A01).A01.A05(r4.A0J, r5.A0J);
        }
        if (A05 == 0) {
            return super.A00(r4, r5);
        }
        return A05;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((AnonymousClass1E7) obj, (AnonymousClass1E7) obj2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77563qb(C77793rS r2, C24921Me r3, C18000vb r4) {
        super(r3, r4);
        this.A01 = r2;
        C18070vi.A0j(r3, r4);
    }
}
