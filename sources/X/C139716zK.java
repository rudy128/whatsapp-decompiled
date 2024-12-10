package X;

/* renamed from: X.6zK  reason: invalid class name and case insensitive filesystem */
public final class C139716zK {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C139716zK) && C18070vi.A18(this.A00, ((C139716zK) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C139716zK(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineSuggestionsParams(numSuggestions=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C139716zK() {
        this((Integer) null);
    }
}
