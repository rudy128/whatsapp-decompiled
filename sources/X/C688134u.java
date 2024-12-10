package X;

/* renamed from: X.34u  reason: invalid class name and case insensitive filesystem */
public final class C688134u implements B5K {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C688134u) && C18070vi.A18(this.A00, ((C688134u) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C688134u(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingAppDataValues(metaAppData=");
        return C17900vP.A0B(this.A00, A10);
    }
}
