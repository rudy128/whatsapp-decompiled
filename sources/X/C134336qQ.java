package X;

/* renamed from: X.6qQ  reason: invalid class name and case insensitive filesystem */
public final class C134336qQ {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134336qQ) && C18070vi.A18(this.A00, ((C134336qQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134336qQ(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsNativeComponentCancelParams(inputName=");
        return C17900vP.A0B(this.A00, A10);
    }
}
