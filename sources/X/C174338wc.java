package X;

/* renamed from: X.8wc  reason: invalid class name and case insensitive filesystem */
public final class C174338wc extends C174358we {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174338wc) && C18070vi.A18(this.A00, ((C174338wc) obj).A00));
    }

    public C174338wc(String str) {
        super(14);
        this.A00 = str;
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoResultViewData(query=");
        return C17900vP.A0B(this.A00, A10);
    }

    public C174338wc() {
        this((String) null);
    }
}
