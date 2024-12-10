package X;

import android.util.SparseIntArray;
import java.util.List;

/* renamed from: X.6sd  reason: invalid class name and case insensitive filesystem */
public final class C135706sd {
    public SparseIntArray A00 = null;
    public List A01 = null;
    public List A02 = null;
    public List A03 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135706sd) {
                C135706sd r5 = (C135706sd) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchCombinedItem(mediaCounts=");
        A10.append(this.A00);
        A10.append(", smartFilters=");
        A10.append(this.A03);
        A10.append(", remoteEntityFilters=");
        A10.append(this.A02);
        A10.append(", businessCategoryList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
