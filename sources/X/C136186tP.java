package X;

import java.util.List;

/* renamed from: X.6tP  reason: invalid class name and case insensitive filesystem */
public final class C136186tP {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136186tP) {
                C136186tP r5 = (C136186tP) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A05, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A04, C17890vO.A02(this.A02, C17890vO.A02(this.A00, C17880vN.A03(this.A01))))));
    }

    public C136186tP(String str, String str2, String str3, List list, List list2, List list3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A04 = list;
        this.A03 = list2;
        this.A05 = list3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchContent(engine=");
        A10.append(this.A01);
        A10.append(", attributionLink=");
        A10.append(this.A00);
        A10.append(", searchQuery=");
        A10.append(this.A02);
        A10.append(", links=");
        A10.append(this.A04);
        A10.append(", linkTitles=");
        A10.append(this.A03);
        A10.append(", thumbnailUrls=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
