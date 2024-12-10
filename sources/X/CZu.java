package X;

public final class CZu {
    public final String A00;

    public CZu(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CZu) && C18070vi.A18(this.A00, ((CZu) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AltLinkingPrefillRequest(wearOsAppVersion=");
        return C17900vP.A0B(this.A00, A10);
    }
}
