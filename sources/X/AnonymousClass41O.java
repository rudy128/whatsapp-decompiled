package X;

/* renamed from: X.41O  reason: invalid class name */
public final class AnonymousClass41O extends C83194Ee {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass41O) && C18070vi.A18(this.A00, ((AnonymousClass41O) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass41O(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(taskId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
