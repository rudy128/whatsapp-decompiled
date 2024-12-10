package X;

import java.util.Map;

/* renamed from: X.36q  reason: invalid class name and case insensitive filesystem */
public final class C692936q implements AnonymousClass229 {
    public final Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C692936q) && C18070vi.A18(this.A00, ((C692936q) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C692936q(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventResponses(eventResponses=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
