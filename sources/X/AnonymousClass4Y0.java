package X;

import java.util.List;

/* renamed from: X.4Y0  reason: invalid class name */
public final class AnonymousClass4Y0 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4Y0) && C18070vi.A18(this.A00, ((AnonymousClass4Y0) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4Y0() {
        this(C18460wS.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(subgroups=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass4Y0(List list) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
    }
}
