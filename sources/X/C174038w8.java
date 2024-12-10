package X;

/* renamed from: X.8w8  reason: invalid class name and case insensitive filesystem */
public final class C174038w8 extends C174358we {
    public final C38471rL A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
            return false;
        }
        String str = this.A01;
        String str2 = ((C174038w8) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        if (str.equals(str2)) {
            return true;
        }
    }

    public C174038w8(C38471rL r2, String str) {
        super(26);
        this.A01 = str;
        this.A00 = r2;
    }
}
