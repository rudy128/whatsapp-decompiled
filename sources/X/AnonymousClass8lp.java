package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8lp  reason: invalid class name */
public final class AnonymousClass8lp extends AnonymousClass9XC {
    public final List A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8lp) {
                AnonymousClass8lp r5 = (AnonymousClass8lp) obj;
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

    public AnonymousClass8lp(List list, Map map) {
        super(list);
        this.A00 = list;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CategoryGroupsWithLoadingChildItems(catalogCategoryGroups=");
        A10.append(this.A00);
        A10.append(", parentCategoryToChildItemMap=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
