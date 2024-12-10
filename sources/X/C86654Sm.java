package X;

/* renamed from: X.4Sm  reason: invalid class name and case insensitive filesystem */
public final class C86654Sm {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86654Sm) && C18070vi.A18(this.A00, ((C86654Sm) obj).A00));
    }

    public C86654Sm(Integer num) {
        this.A00 = num;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, 929922144);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RowColor(iconColorRes=");
        A10.append(2131102653);
        A10.append(", textColorRes=");
        A10.append(2131102653);
        A10.append(", titleTextColorRes=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
