package X;

/* renamed from: X.2m9  reason: invalid class name and case insensitive filesystem */
public final class C59342m9 {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59342m9) {
                C59342m9 r5 = (C59342m9) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A002 = ((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public C59342m9(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InitialsCacheKey(firstName=");
        A10.append(this.A00);
        A10.append(", lastName=");
        A10.append(this.A01);
        A10.append(", pushName=");
        return C17900vP.A0B(this.A02, A10);
    }
}
