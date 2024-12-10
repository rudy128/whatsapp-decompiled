package X;

/* renamed from: X.3xp  reason: invalid class name and case insensitive filesystem */
public final class C80713xp extends AnonymousClass4ET {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C80713xp) && C18070vi.A18(this.A00, ((C80713xp) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C80713xp(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(taskId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
