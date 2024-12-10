package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.8gt  reason: invalid class name and case insensitive filesystem */
public final class C167748gt extends C180279Lx {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C18070vi.A14(this, obj) && this.A00 == ((C167748gt) obj).A00;
        }
        return true;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return C108955ca.A12(locale, "MediaRestorePreparationStatus/progress %d%%", Arrays.copyOf(A1a, 1));
    }

    public C167748gt(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }
}
