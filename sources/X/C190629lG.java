package X;

/* renamed from: X.9lG  reason: invalid class name and case insensitive filesystem */
public class C190629lG {
    public final String A00;
    public final String A01;
    public final String A02;

    public C190629lG(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyInfo{version='");
        A10.append(this.A02);
        A10.append('\'');
        A10.append(", accountHashBase64='");
        A10.append(this.A00);
        A10.append('\'');
        A10.append(", serverSaltBase64='");
        A10.append(this.A01);
        A10.append('\'');
        return C17890vO.A0b(A10);
    }
}
