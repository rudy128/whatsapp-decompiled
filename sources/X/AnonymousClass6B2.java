package X;

import java.util.List;

/* renamed from: X.6B2  reason: invalid class name */
public final class AnonymousClass6B2 extends AnonymousClass6TV {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6B2) && C18070vi.A18(this.A00, ((AnonymousClass6B2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6B2(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecommendedNewsletterListDataItem(recommendedNewsletters=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
