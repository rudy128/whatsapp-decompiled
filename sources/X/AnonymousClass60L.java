package X;

import java.util.List;

/* renamed from: X.60L  reason: invalid class name */
public final class AnonymousClass60L extends AnonymousClass6TG {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public AnonymousClass60L(String str, List list, boolean z) {
        C18070vi.A0d(str, 2);
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60L) {
                AnonymousClass60L r5 = (AnonymousClass60L) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A00, AnonymousClass000.A0L(this.A01)), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowSearchResults(funStickers=");
        A10.append(this.A01);
        A10.append(", prompt=");
        A10.append(this.A00);
        A10.append(", cached=");
        return C17900vP.A0F(A10, this.A02);
    }
}
