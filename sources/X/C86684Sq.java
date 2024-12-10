package X;

import java.util.Set;

/* renamed from: X.4Sq  reason: invalid class name and case insensitive filesystem */
public final class C86684Sq {
    public final Set A00;

    public C86684Sq(Set set) {
        C18070vi.A0d(set, 1);
        this.A00 = set;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86684Sq) && C18070vi.A18(this.A00, ((C86684Sq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterGeosuspendedInfo(countries=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
