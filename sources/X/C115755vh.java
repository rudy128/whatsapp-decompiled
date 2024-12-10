package X;

import java.util.List;

/* renamed from: X.5vh  reason: invalid class name and case insensitive filesystem */
public final class C115755vh extends C123056Sy {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115755vh) && C18070vi.A18(this.A00, ((C115755vh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C115755vh(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LongClickEditing(memoryIdsToDelete=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
