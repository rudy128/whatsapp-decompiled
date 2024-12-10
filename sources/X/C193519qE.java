package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9qE  reason: invalid class name and case insensitive filesystem */
public final class C193519qE {
    public final C195139sr A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193519qE) {
                C193519qE r5 = (C193519qE) obj;
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

    public C193519qE(C195139sr r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        for (C195139sr r0 : this.A01) {
            A10.append(r0.A01);
            A10.append(",");
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(this.A00.A01, A10, A1b);
        String format = String.format("CategoryResponse{responseCategoryId=%s, subCategories=%s}", Arrays.copyOf(A1b, 2));
        C18070vi.A0X(format);
        return format;
    }
}
