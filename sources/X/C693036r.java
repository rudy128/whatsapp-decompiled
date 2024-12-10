package X;

import java.util.List;

/* renamed from: X.36r  reason: invalid class name and case insensitive filesystem */
public final class C693036r implements AnonymousClass229 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C693036r) && C18070vi.A18(this.A00, ((C693036r) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C693036r(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PollVotes(pollVotes=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
