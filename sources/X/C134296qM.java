package X;

import java.util.List;

/* renamed from: X.6qM  reason: invalid class name and case insensitive filesystem */
public final class C134296qM {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134296qM) && C18070vi.A18(this.A00, ((C134296qM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134296qM(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineSuggestionsModel(responseList=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
