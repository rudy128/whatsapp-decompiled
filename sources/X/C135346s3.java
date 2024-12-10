package X;

import java.util.List;

/* renamed from: X.6s3  reason: invalid class name and case insensitive filesystem */
public final class C135346s3 {
    public final C179619Ir A00;
    public final String A01;
    public final List A02;

    public C135346s3(C179619Ir r2, String str, List list) {
        C18070vi.A0d(list, 3);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135346s3) {
                C135346s3 r5 = (C135346s3) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectoryCategoryPreview(category=");
        A10.append(this.A00);
        A10.append(", categoryTitle=");
        A10.append(this.A01);
        A10.append(", newsletters=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
