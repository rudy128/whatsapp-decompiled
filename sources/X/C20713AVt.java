package X;

/* renamed from: X.AVt  reason: case insensitive filesystem */
public final class C20713AVt implements B5K {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20713AVt) && C18070vi.A18(this.A00, ((C20713AVt) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C20713AVt(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessagePollValues(pollType=");
        return C17900vP.A0B(this.A00, A10);
    }
}
