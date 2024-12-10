package X;

/* renamed from: X.9kO  reason: invalid class name and case insensitive filesystem */
public final class C190109kO {
    public final String A00;
    public final String A01;

    public C190109kO(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncFileInfo{remotePath='");
        A10.append(this.A01);
        A10.append("', ivBase64='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
