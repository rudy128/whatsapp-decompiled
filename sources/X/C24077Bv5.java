package X;

/* renamed from: X.Bv5  reason: case insensitive filesystem */
public final class C24077Bv5 extends C24440C4a {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C24077Bv5) && C18070vi.A18(this.A00, ((C24077Bv5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C24077Bv5(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(message=");
        return C17900vP.A0B(this.A00, A10);
    }
}
