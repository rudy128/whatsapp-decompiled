package X;

/* renamed from: X.4Qg  reason: invalid class name and case insensitive filesystem */
public final class C86124Qg {
    public final int A00;
    public final C54732ec A01;
    public final String A02;
    public final String A03;

    public C86124Qg(C54732ec r1, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CollectionError{code=");
        A10.append(this.A00);
        A10.append(", text='");
        A10.append(this.A03);
        A10.append(", collection='");
        A10.append(this.A02);
        return C17890vO.A0c(A10, '}');
    }
}
