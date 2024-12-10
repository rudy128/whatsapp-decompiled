package X;

import java.util.List;

/* renamed from: X.9qP  reason: invalid class name and case insensitive filesystem */
public final class C193629qP {
    public final Boolean A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193629qP) {
                C193629qP r5 = (C193629qP) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C193629qP(Boolean bool, List list) {
        this.A01 = list;
        this.A00 = bool;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessResult(searchItems=");
        A10.append(this.A01);
        A10.append(", isFetchedFromNetwork=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
