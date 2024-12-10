package X;

import java.util.List;

/* renamed from: X.0Ju  reason: invalid class name */
public final class AnonymousClass0Ju {
    public final List A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Ju) {
                AnonymousClass0Ju r5 = (AnonymousClass0Ju) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)));
    }

    public AnonymousClass0Ju(List list, List list2, List list3) {
        this.A01 = list;
        this.A00 = list2;
        this.A02 = list3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessApiHomeResult(popularBiz=");
        A10.append(this.A01);
        A10.append(", bizCategories=");
        A10.append(this.A00);
        A10.append(", popularBizCustomLists=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
