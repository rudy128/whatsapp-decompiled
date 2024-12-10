package X;

import java.util.Set;

/* renamed from: X.8ko  reason: invalid class name and case insensitive filesystem */
public final class C169298ko extends C180589Nd {
    public final Set A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169298ko) {
                C169298ko r5 = (C169298ko) obj;
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

    public C169298ko(Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupedCategoriesChip(categories=");
        A10.append(this.A00);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A01);
    }
}
