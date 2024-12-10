package X;

/* renamed from: X.9pT  reason: invalid class name and case insensitive filesystem */
public final class C193059pT {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193059pT) && C18070vi.A18(this.A00, ((C193059pT) obj).A00));
    }

    public C193059pT(String str) {
        this.A00 = str;
    }

    public int hashCode() {
        return -656875146 + C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CriticalEvent(criticalEvent=");
        A10.append("participant-attribute-parser");
        A10.append(", debugInfo=");
        return C17900vP.A0B(this.A00, A10);
    }
}
