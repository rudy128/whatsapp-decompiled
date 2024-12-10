package X;

/* renamed from: X.7Jw  reason: invalid class name and case insensitive filesystem */
public final class C145097Jw implements AnonymousClass8AS {
    public final int A00;
    public final int A01;
    public final AnonymousClass19T A02;

    public void Bir(String str, String str2) {
        C18070vi.A0d(str2, 1);
        this.A02.markerAnnotate(this.A01, this.A00, str, str2);
    }

    public void Biz(String str) {
        C18070vi.A0d(str, 0);
        this.A02.markerPoint(this.A01, this.A00, str);
    }

    public void Bis(String str, boolean z) {
        this.A02.markerAnnotate(this.A01, this.A00, str, z);
    }

    public void Biu(short s) {
        this.A02.markerEnd(this.A01, this.A00, s);
    }

    public void Bj0() {
        this.A02.Bj1(this.A01, this.A00, false);
    }

    public C145097Jw(AnonymousClass19T r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }
}
