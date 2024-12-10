package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8lo  reason: invalid class name and case insensitive filesystem */
public final class C169518lo extends AnonymousClass9XC {
    public final List A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169518lo) {
                C169518lo r5 = (C169518lo) obj;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169518lo(List list, Map map) {
        super(list);
        C18070vi.A0j(list, map);
        this.A00 = list;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CategoryGroupsWithChildItems(catalogCategoryGroups=");
        A10.append(this.A00);
        A10.append(", parentCategoryToChildItemMap=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
