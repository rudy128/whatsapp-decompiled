package X;

/* renamed from: X.7Jv  reason: invalid class name and case insensitive filesystem */
public final class C145087Jv implements AnonymousClass8AS {
    public final AnonymousClass8AS A00;
    public final String A01;

    public void Bir(String str, String str2) {
        C18070vi.A0d(str2, 1);
        this.A00.Bir(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("/markerAnnotate/");
        A10.append(str);
        A10.append('/');
        C17890vO.A1A(A10, str2);
    }

    public void Biz(String str) {
        C18070vi.A0d(str, 0);
        this.A00.Biz(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        C17900vP.A0f("/markerPoint/", str, A10);
    }

    public void Bis(String str, boolean z) {
        this.A00.Bis(str, z);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("/markerAnnotate/");
        A10.append(str);
        A10.append('/');
        C17900vP.A0r(A10, z);
    }

    public void Biu(short s) {
        this.A00.Biu(s);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        C17900vP.A0j("/markerEnd/", A10, s);
    }

    public void Bj0() {
        this.A00.Bj0();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        C17890vO.A1A(A10, "/markerStart");
    }

    public C145087Jv(AnonymousClass8AS r3, String str) {
        this.A00 = r3;
        this.A01 = AnonymousClass001.A1H("MlDownloader/", str, AnonymousClass000.A10());
    }
}
