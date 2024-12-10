package X;

import java.util.ArrayList;

/* renamed from: X.7LD  reason: invalid class name */
public final class AnonymousClass7LD implements AnonymousClass229 {
    public final ArrayList A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7LD) && C18070vi.A18(this.A00, ((AnonymousClass7LD) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass7LD(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusEmbeddedLink(assocMessages=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
