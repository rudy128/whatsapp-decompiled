package X;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.9sw  reason: invalid class name and case insensitive filesystem */
public final class C195189sw {
    public int A00;
    public final C193609qN A01;
    public final C188619hi A02;
    public final String A03;
    public final Set A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195189sw) {
                C195189sw r5 = (C195189sw) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C195189sw(C193609qN r19, String str, int i) {
        C193609qN r3 = r19;
        C188619hi r6 = null;
        LinkedHashSet A14 = (i & 4) != 0 ? C17880vN.A14() : null;
        r3 = (i & 8) != 0 ? null : r3;
        r6 = (i & 16) != 0 ? new C188619hi(new A1Z((List) null, (List) null), (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), 0) : r6;
        String str2 = str;
        C72473Md.A1I(str2, A14);
        C18070vi.A0d(r6, 5);
        this.A03 = str2;
        this.A00 = 0;
        this.A04 = A14;
        this.A01 = r3;
        this.A02 = r6;
    }

    public int hashCode() {
        Set set = this.A04;
        return AnonymousClass000.A0O(this.A02, (AnonymousClass000.A0N(set, (C17880vN.A03(this.A03) + this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextSearchResult(query=");
        A10.append(this.A03);
        A10.append(", statusCode=");
        A10.append(this.A00);
        A10.append(", fulfilledRequests=");
        A10.append(this.A04);
        A10.append(", recentSearch=");
        A10.append(this.A01);
        A10.append(", response=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
