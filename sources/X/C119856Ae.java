package X;

/* renamed from: X.6Ae  reason: invalid class name and case insensitive filesystem */
public final class C119856Ae extends AnonymousClass6SD {
    public final String reason;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119856Ae) && C18070vi.A18(this.reason, ((C119856Ae) obj).reason));
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public C119856Ae(String str) {
        this.reason = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModelNotFound(reason=");
        return C17900vP.A0B(this.reason, A10);
    }
}
