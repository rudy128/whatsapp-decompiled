package X;

/* renamed from: X.6Ay  reason: invalid class name and case insensitive filesystem */
public final class C119996Ay extends AnonymousClass6TU {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119996Ay) && C18070vi.A18(this.A00, ((C119996Ay) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C119996Ay(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StartEvent(progress=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C119996Ay() {
        this((Integer) null);
    }
}
