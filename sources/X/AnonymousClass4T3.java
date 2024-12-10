package X;

import java.util.List;

/* renamed from: X.4T3  reason: invalid class name */
public final class AnonymousClass4T3 {
    public final List A00;
    public final boolean A01;

    public AnonymousClass4T3(List list, boolean z) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T3) {
                AnonymousClass4T3 r5 = (AnonymousClass4T3) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantList(items=");
        A10.append(this.A00);
        A10.append(", skipAnimations=");
        return C17900vP.A0F(A10, this.A01);
    }
}
