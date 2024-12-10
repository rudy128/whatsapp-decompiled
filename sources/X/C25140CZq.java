package X;

import java.util.Map;

/* renamed from: X.CZq  reason: case insensitive filesystem */
public final class C25140CZq {
    public final Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25140CZq) && C18070vi.A18(this.A00, ((C25140CZq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C25140CZq(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksFunctionTable(entries=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
