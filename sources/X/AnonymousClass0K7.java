package X;

import java.util.List;

/* renamed from: X.0K7  reason: invalid class name */
public final class AnonymousClass0K7 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public AnonymousClass0K7(String str, String str2, String str3, List list) {
        C18070vi.A0d(str, 1);
        C18070vi.A0d(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0K7) {
                AnonymousClass0K7 r5 = (AnonymousClass0K7) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PopularBizCustomListInfo(categoryId=");
        A10.append(this.A00);
        A10.append(", listName=");
        A10.append(this.A01);
        A10.append(", minifiedBusinessProfileList=");
        A10.append(this.A03);
        A10.append(", moduleName=");
        A10.append(this.A02);
        return AnonymousClass001.A1J(A10);
    }
}
