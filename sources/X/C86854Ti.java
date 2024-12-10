package X;

import java.util.List;

/* renamed from: X.4Ti  reason: invalid class name and case insensitive filesystem */
public final class C86854Ti {
    public Long A00;
    public final List A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86854Ti) && C18070vi.A18(this.A01, ((C86854Ti) obj).A01));
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C86854Ti(List list) {
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupMemberSuggestionsBucketResult(contacts=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
