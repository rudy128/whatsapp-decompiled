package X;

import java.util.ArrayList;

/* renamed from: X.7LF  reason: invalid class name */
public final class AnonymousClass7LF implements AnonymousClass229 {
    public final ArrayList A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7LF) && C18070vi.A18(this.A00, ((AnonymousClass7LF) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass7LF(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FutureProofedChildMessages(messages=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
