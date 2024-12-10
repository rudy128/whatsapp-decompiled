package X;

import java.util.List;

/* renamed from: X.8vo  reason: invalid class name and case insensitive filesystem */
public abstract class C173838vo extends AnonymousClass43F {
    public final C1600887b A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C173838vo r4 = (C173838vo) obj;
            if (this.A00 != r4.A00 || !C18070vi.A18(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public C173838vo(C1600887b r1, C107525aA r2, List list, int i) {
        super(r2, i);
        this.A01 = list;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
