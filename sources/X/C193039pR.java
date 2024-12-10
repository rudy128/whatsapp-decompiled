package X;

/* renamed from: X.9pR  reason: invalid class name and case insensitive filesystem */
public final class C193039pR {
    public final CXL A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193039pR) && C18070vi.A18(this.A00, ((C193039pR) obj).A00));
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A00) + 1000) * 31) + 1231;
    }

    public C193039pR(CXL cxl) {
        this.A00 = cxl;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapViewAction(cameraUpdate=");
        A10.append(this.A00);
        A10.append(", animationTime=");
        A10.append(1000);
        A10.append(", isGPSLocation=");
        return C17900vP.A0F(A10, true);
    }
}
