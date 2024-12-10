package X;

import java.util.Set;

/* renamed from: X.4TK  reason: invalid class name */
public final class AnonymousClass4TK {
    public final Set A00;
    public final C18090vk A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TK) {
                AnonymousClass4TK r5 = (AnonymousClass4TK) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public AnonymousClass4TK(Set set, C18090vk r2) {
        this.A00 = set;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunitySuspendActionModeUiState(selectedJids=");
        A10.append(this.A00);
        A10.append(", clear=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
