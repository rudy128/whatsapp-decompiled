package X;

/* renamed from: X.3he  reason: invalid class name and case insensitive filesystem */
public final class C75513he extends C99704tK {
    public final Throwable error;

    public C75513he() {
        this((Throwable) null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75513he) && C18070vi.A18(this.error, ((C75513he) obj).error));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.error);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArDeliveryFailed(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }

    public C75513he(Throwable th) {
        super((String) null, th, 2);
        this.error = th;
    }
}
