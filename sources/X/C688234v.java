package X;

/* renamed from: X.34v  reason: invalid class name and case insensitive filesystem */
public final class C688234v implements B5K {
    public final C42691ya A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C688234v) && C18070vi.A18(this.A00, ((C688234v) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C688234v(C42691ya r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingPrivacyModeValues(privacyMode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
