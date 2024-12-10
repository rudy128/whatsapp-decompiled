package X;

import java.util.List;

/* renamed from: X.9rp  reason: invalid class name and case insensitive filesystem */
public final class C194499rp {
    public final long A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194499rp) {
                C194499rp r8 = (C194499rp) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, (AnonymousClass000.A0L(this.A02) + C17900vP.A00(this.A01)) * 31);
    }

    public C194499rp(String str, List list, long j) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CachedDirectoryResults(newsletters=");
        A10.append(this.A02);
        A10.append(", nextPage=");
        A10.append(this.A01);
        A10.append(", validUntil=");
        return C17900vP.A0E(A10, this.A00);
    }
}
