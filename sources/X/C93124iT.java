package X;

/* renamed from: X.4iT  reason: invalid class name and case insensitive filesystem */
public final class C93124iT implements C107135Yn {
    public final String A00;

    public boolean Beh(C107135Yn r2) {
        return false;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93124iT) && C18070vi.A18(this.A00, ((C93124iT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C93124iT(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ResumeAll(productSessionId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
