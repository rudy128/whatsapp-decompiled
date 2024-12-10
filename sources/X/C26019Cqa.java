package X;

/* renamed from: X.Cqa  reason: case insensitive filesystem */
public final class C26019Cqa {
    public static final C26019Cqa A01 = new C26019Cqa(17170444);
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26019Cqa) && C18070vi.A18(this.A00, ((C26019Cqa) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C26019Cqa(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProgressbarConfig(overrideColor=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C26019Cqa() {
        this((Integer) null);
    }
}
