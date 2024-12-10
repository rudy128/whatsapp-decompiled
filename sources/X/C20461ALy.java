package X;

/* renamed from: X.ALy  reason: case insensitive filesystem */
public final class C20461ALy implements C72353Lp {
    public final /* synthetic */ C199319zn A00;
    public final /* synthetic */ C31761g5 A01;

    public void C8n(String str) {
        C18070vi.A0d(str, 0);
        C63042sP.A01((C63042sP) this.A00.A01.get(), 501817647, 2);
        this.A01.resumeWith(str);
    }

    public C20461ALy(C199319zn r1, C31761g5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void C8m(int i) {
        C63042sP.A01((C63042sP) this.A00.A01.get(), 501817647, 3);
        C17900vP.A0i("MusicAcsRepository ACS token issuance failed, errorCode: ", AnonymousClass000.A10(), i);
        this.A01.resumeWith((Object) null);
    }

    public void C8o(int i) {
        C63042sP.A01((C63042sP) this.A00.A01.get(), 501817647, 3);
        C17900vP.A0i("MusicAcsRepository ACS token not ready, reason: ", AnonymousClass000.A10(), i);
        this.A01.resumeWith((Object) null);
    }
}
