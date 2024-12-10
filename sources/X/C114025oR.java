package X;

import java.util.List;

/* renamed from: X.5oR  reason: invalid class name and case insensitive filesystem */
public final class C114025oR extends C122986Sr {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114025oR) && C18070vi.A18(this.A00, ((C114025oR) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C114025oR(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(aiOutputs=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
