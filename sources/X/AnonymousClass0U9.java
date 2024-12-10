package X;

import java.util.Iterator;

/* renamed from: X.0U9  reason: invalid class name */
public final class AnonymousClass0U9 implements C16830tI {
    public AnonymousClass0D0 A00;
    public AnonymousClass0D0 A01;
    public AnonymousClass0D0 A02;
    public final C16010rZ A03;

    public long BR0(AnonymousClass0D0 r9, AnonymousClass0D0 r10, AnonymousClass0D0 r11) {
        Iterator it = C28851b7.A08(0, r9.A01()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int A002 = ((AnonymousClass20T) it).A00();
            j = Math.max(j, this.A03.BLz(A002).BQz(r9.A00(A002), r10.A00(A002), r11.A00(A002)));
        }
        return j;
    }

    public AnonymousClass0D0 BRK(AnonymousClass0D0 r9, AnonymousClass0D0 r10, AnonymousClass0D0 r11) {
        AnonymousClass0D0 r0 = this.A00;
        if (r0 == null) {
            r0 = C03860Kx.A01(r11);
            this.A00 = r0;
        }
        int A012 = r0.A01();
        int i = 0;
        while (true) {
            if (i < A012) {
                AnonymousClass0D0 r4 = this.A00;
                if (r4 == null) {
                    break;
                }
                r4.A04(i, this.A03.BLz(i).BRJ(r9.A00(i), r10.A00(i), r11.A00(i)));
                i++;
            } else {
                AnonymousClass0D0 r02 = this.A00;
                if (r02 != null) {
                    return r02;
                }
            }
        }
        C18070vi.A11("endVelocityVector");
        throw null;
    }

    public AnonymousClass0D0 BbF(AnonymousClass0D0 r12, AnonymousClass0D0 r13, AnonymousClass0D0 r14, long j) {
        AnonymousClass0D0 r0 = this.A01;
        if (r0 == null) {
            r0 = C03860Kx.A01(r12);
            this.A01 = r0;
        }
        int A012 = r0.A01();
        int i = 0;
        while (true) {
            if (i < A012) {
                AnonymousClass0D0 r1 = this.A01;
                if (r1 == null) {
                    break;
                }
                r1.A04(i, this.A03.BLz(i).BbE(r12.A00(i), r13.A00(i), r14.A00(i), j));
                i++;
            } else {
                AnonymousClass0D0 r02 = this.A01;
                if (r02 != null) {
                    return r02;
                }
            }
        }
        C18070vi.A11("valueVector");
        throw null;
    }

    public AnonymousClass0D0 BbK(AnonymousClass0D0 r12, AnonymousClass0D0 r13, AnonymousClass0D0 r14, long j) {
        AnonymousClass0D0 r0 = this.A02;
        if (r0 == null) {
            r0 = C03860Kx.A01(r14);
            this.A02 = r0;
        }
        int A012 = r0.A01();
        int i = 0;
        while (true) {
            if (i < A012) {
                AnonymousClass0D0 r1 = this.A02;
                if (r1 == null) {
                    break;
                }
                r1.A04(i, this.A03.BLz(i).BbJ(r12.A00(i), r13.A00(i), r14.A00(i), j));
                i++;
            } else {
                AnonymousClass0D0 r02 = this.A02;
                if (r02 != null) {
                    return r02;
                }
            }
        }
        C18070vi.A11("velocityVector");
        throw null;
    }

    public AnonymousClass0U9(C16010rZ r1) {
        this.A03 = r1;
    }

    public /* synthetic */ boolean Bf5() {
        return false;
    }
}
