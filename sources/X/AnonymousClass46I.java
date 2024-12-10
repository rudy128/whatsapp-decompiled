package X;

import java.util.List;

/* renamed from: X.46I  reason: invalid class name */
public final class AnonymousClass46I extends AnonymousClass4F3 {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass46I) {
                AnonymousClass46I r5 = (AnonymousClass46I) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public AnonymousClass46I(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportedLanguages(languages=");
        A10.append(this.A01);
        A10.append(", defaultLanguagePosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
