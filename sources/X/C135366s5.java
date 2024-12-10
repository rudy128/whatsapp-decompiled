package X;

import java.util.List;

/* renamed from: X.6s5  reason: invalid class name and case insensitive filesystem */
public final class C135366s5 {
    public String A00;
    public final AnonymousClass6B2 A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135366s5) {
                C135366s5 r5 = (C135366s5) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A01) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C108955ca.A06(this.A00);
    }

    public C135366s5(AnonymousClass6B2 r1, String str, List list) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectoryCategoriesState(recommendedNewslettersListDataItem=");
        A10.append(this.A01);
        A10.append(", directoryCategoriesPreviewList=");
        A10.append(this.A02);
        A10.append(", countrySelected=");
        return C17900vP.A0B(this.A00, A10);
    }
}
