package X;

/* renamed from: X.4Td  reason: invalid class name and case insensitive filesystem */
public final class C86804Td {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86804Td) {
                C86804Td r5 = (C86804Td) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A002 = C17900vP.A00(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public C86804Td(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisplayNames(primaryName=");
        A10.append(this.A00);
        A10.append(", secondaryName=");
        return C17900vP.A0B(this.A01, A10);
    }
}
