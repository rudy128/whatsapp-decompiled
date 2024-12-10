package X;

import java.util.List;

/* renamed from: X.4j2  reason: invalid class name and case insensitive filesystem */
public final class C93474j2 implements AnonymousClass5X1 {
    public final int A00;
    public final AnonymousClass5X0 A01;
    public final AnonymousClass4ZN A02;
    public final List A03;

    public C93474j2(AnonymousClass5X0 r2, AnonymousClass4ZN r3, List list, int i) {
        C18070vi.A0d(list, 3);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = list;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93474j2) {
                C93474j2 r5 = (C93474j2) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02))) + this.A00) * 31;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(textProvider=");
        A10.append(this.A02);
        A10.append(", buttonState=");
        A10.append(this.A01);
        A10.append(", facePile=");
        A10.append(this.A03);
        A10.append(", textAlignment=");
        A10.append(this.A00);
        A10.append(", dividerVisibility=");
        return AnonymousClass001.A1L(A10, 0);
    }
}
