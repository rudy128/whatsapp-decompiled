package X;

import java.util.List;

/* renamed from: X.7LE  reason: invalid class name */
public final class AnonymousClass7LE implements AnonymousClass229 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7LE) && C18070vi.A18(this.A00, ((AnonymousClass7LE) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass7LE(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TranscriptionSegmentList(segments=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
