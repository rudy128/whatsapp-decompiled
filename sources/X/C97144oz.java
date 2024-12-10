package X;

import java.util.List;

/* renamed from: X.4oz  reason: invalid class name and case insensitive filesystem */
public final class C97144oz implements AnonymousClass5YD {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97144oz) && C18070vi.A18(this.A00, ((C97144oz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97144oz(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(alerts=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
