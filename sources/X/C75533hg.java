package X;

/* renamed from: X.3hg  reason: invalid class name and case insensitive filesystem */
public final class C75533hg extends C99704tK {
    public final Throwable error;

    public C75533hg() {
        this((Throwable) null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75533hg) && C18070vi.A18(this.error, ((C75533hg) obj).error));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.error);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetadataQueryFailed(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }

    public C75533hg(Throwable th) {
        super((String) null, th, 2);
        this.error = th;
    }
}
