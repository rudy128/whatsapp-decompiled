package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9sA  reason: invalid class name and case insensitive filesystem */
public final class C194709sA {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C194709sA) {
            C194709sA r6 = (C194709sA) obj;
            if (this.A03 == r6.A03 && C18070vi.A18(this.A02, r6.A02) && C18070vi.A18(this.A00, r6.A00)) {
                String str = this.A01;
                boolean A0A = AnonymousClass1YE.A0A(str, "index_", false);
                String str2 = r6.A01;
                if (A0A) {
                    return AnonymousClass1YE.A0A(str2, "index_", false);
                }
                return C18070vi.A18(str, str2);
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A01;
        if (AnonymousClass1YE.A0A(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A02, ((hashCode * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    public C194709sA(String str, List list, List list2, boolean z) {
        C108985cd.A1D(list, list2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList A0z = C17880vN.A0z(size);
            for (int i = 0; i < size; i++) {
                A0z.add("ASC");
            }
            arrayList = A0z;
        }
        this.A00 = arrayList;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Index{name='");
        A10.append(this.A01);
        A10.append("', unique=");
        A10.append(this.A03);
        A10.append(", columns=");
        A10.append(this.A02);
        A10.append(", orders=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
