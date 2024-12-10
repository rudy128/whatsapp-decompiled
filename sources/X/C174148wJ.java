package X;

/* renamed from: X.8wJ  reason: invalid class name and case insensitive filesystem */
public final class C174148wJ extends C174358we {
    public final C38471rL A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C174148wJ(C38471rL r2, String str, String str2, String str3, boolean z) {
        super(31);
        this.A04 = z;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
            return false;
        }
        return C18070vi.A18(this.A01, ((C174148wJ) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
