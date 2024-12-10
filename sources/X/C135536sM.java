package X;

import java.util.List;

/* renamed from: X.6sM  reason: invalid class name and case insensitive filesystem */
public final class C135536sM {
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135536sM) {
                C135536sM r5 = (C135536sM) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A01);
        Integer num = this.A00;
        return C17880vN.A01((A0L + C72453Mb.A0E(num, C124236Xo.A00(num))) * 31, this.A02);
    }

    public C135536sM(Integer num, List list, boolean z) {
        this.A01 = list;
        this.A00 = num;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoteSearchResults(newsletters=");
        A10.append(this.A01);
        A10.append(", state=");
        A10.append(C124236Xo.A00(this.A00));
        A10.append(", resetScroll=");
        return C17900vP.A0F(A10, this.A02);
    }
}
