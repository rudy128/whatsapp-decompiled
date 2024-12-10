package X;

/* renamed from: X.8wd  reason: invalid class name and case insensitive filesystem */
public final class C174348wd extends C174358we {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174348wd) && this.A00 == ((C174348wd) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C174348wd(int i) {
        super(AnonymousClass00R.A0Y);
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SecondaryTextHeaderListItemData(headerType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C174348wd() {
        this(0);
    }
}
