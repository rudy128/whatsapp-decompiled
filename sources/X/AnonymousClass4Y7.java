package X;

import java.util.List;

/* renamed from: X.4Y7  reason: invalid class name */
public final class AnonymousClass4Y7 {
    public final int A00;
    public final List A01;

    public AnonymousClass4Y7(int i, List list) {
        C18070vi.A0d(list, 2);
        this.A00 = i;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Y7) {
                AnonymousClass4Y7 r5 = (AnonymousClass4Y7) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupCallPsaUiState(titleResId=");
        A10.append(this.A00);
        A10.append(", groupSuggestions=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public AnonymousClass4Y7() {
        this(0, C18460wS.A00);
    }
}
