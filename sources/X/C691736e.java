package X;

/* renamed from: X.36e  reason: invalid class name and case insensitive filesystem */
public final class C691736e implements AnonymousClass25D {
    public final String A00;

    public C691736e(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C691736e) && C18070vi.A18(this.A00, ((C691736e) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMessageDisclaimer(disclaimerText=");
        return C17900vP.A0B(this.A00, A10);
    }
}
