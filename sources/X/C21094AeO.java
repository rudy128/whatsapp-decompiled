package X;

import java.util.Map;

/* renamed from: X.AeO  reason: case insensitive filesystem */
public final class C21094AeO implements C22396B5z {
    public Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21094AeO) && C18070vi.A18(this.A00, ((C21094AeO) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BkMockGalaxyActionEvent(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
