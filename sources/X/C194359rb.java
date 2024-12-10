package X;

import java.util.Set;

/* renamed from: X.9rb  reason: invalid class name and case insensitive filesystem */
public final class C194359rb {
    public final int A00;
    public final int A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194359rb) {
                C194359rb r5 = (C194359rb) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + this.A01) * 31) + this.A00;
    }

    public C194359rb(Set set, int i, int i2) {
        this.A02 = set;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogVariantsRequestData(variantRequestInfoTypes=");
        A10.append(this.A02);
        A10.append(", variantThumbnailWidth=");
        A10.append(this.A01);
        A10.append(", variantThumbnailHeight=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
