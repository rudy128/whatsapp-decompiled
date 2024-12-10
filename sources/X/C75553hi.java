package X;

/* renamed from: X.3hi  reason: invalid class name and case insensitive filesystem */
public final class C75553hi extends C99704tK {
    public final Throwable error;

    public C75553hi() {
        this((Throwable) null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75553hi) && C18070vi.A18(this.error, ((C75553hi) obj).error));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.error);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RendererSetUpFailed(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }

    public C75553hi(Throwable th) {
        super((String) null, th, 2);
        this.error = th;
    }
}
