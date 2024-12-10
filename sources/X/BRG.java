package X;

public final class BRG extends C3C {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BRG) && C18070vi.A18(this.A00, ((BRG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BRG(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MemoryLoadEvent(entityId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
