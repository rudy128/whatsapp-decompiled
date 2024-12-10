package X;

import java.util.List;

/* renamed from: X.9pG  reason: invalid class name and case insensitive filesystem */
public final class C192929pG {
    public final List A00;

    public C192929pG(List list) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C192929pG) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return C29431cG.A0g(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, (C22821Di) null);
    }
}
