package X;

/* renamed from: X.Ac7  reason: case insensitive filesystem */
public final class C20953Ac7 implements AnonymousClass229 {
    public final String A00;

    public C20953Ac7(AnonymousClass8XV r4) {
        C18070vi.A0d(r4, 1);
        String str = r4.progressDescription_;
        String str2 = null;
        if (str != null) {
            String A0I = AnonymousClass1YF.A0I(C29361c9.A0Q(str, 100));
            if (A0I.length() != 0) {
                str2 = A0I;
            }
        }
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20953Ac7) && C18070vi.A18(this.A00, ((C20953Ac7) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotProgressIndicatorMetadata(progressDescription=");
        return C17900vP.A0B(this.A00, A10);
    }
}
