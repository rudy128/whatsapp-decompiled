package X;

import java.util.List;

/* renamed from: X.4U1  reason: invalid class name */
public final class AnonymousClass4U1 {
    public final AnonymousClass4T8 A00;
    public final AnonymousClass4EA A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U1) {
                AnonymousClass4U1 r5 = (AnonymousClass4U1) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public AnonymousClass4U1(AnonymousClass4T8 r1, AnonymousClass4EA r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MoreMenuUiState(listItems=");
        A10.append(this.A02);
        A10.append(", networkInfoUiState=");
        A10.append(this.A01);
        A10.append(", headerUiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
