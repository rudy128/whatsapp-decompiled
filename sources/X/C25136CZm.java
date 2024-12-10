package X;

import java.util.List;

/* renamed from: X.CZm  reason: case insensitive filesystem */
public final class C25136CZm {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25136CZm) && C18070vi.A18(this.A00, ((C25136CZm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C25136CZm(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksComponentQueryNetworkParseResponse(results=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
