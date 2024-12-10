package X;

import android.os.Handler;

/* renamed from: X.DDj  reason: case insensitive filesystem */
public final class C26779DDj implements E98 {
    public DE4 A00;
    public DDn A01;
    public boolean A02;
    public boolean A03;
    public final C26359CyL A04;
    public final CJU A05;
    public final C25639CjS A06;
    public final DDn A07;
    public final boolean A08;
    public final C24855CMy A09;

    public void Bd8(C26045Cr9 cr9) {
        C18070vi.A0d(cr9, 0);
        cr9.A03(this.A07);
        cr9.A03(this.A01);
    }

    public void BIY() {
        C26359CyL cyL = this.A04;
        cyL.A0G = false;
        cyL.A08.post(cyL.A0A);
    }

    public void release() {
    }

    public C26779DDj(Handler handler, CJU cju, C25639CjS cjS, boolean z) {
        DE4 A002;
        this.A06 = cjS;
        this.A08 = z;
        this.A05 = cju;
        C24855CMy cMy = new C24855CMy(this);
        this.A09 = cMy;
        this.A04 = new C26359CyL(handler, cMy, BE8.A1S(z ? 1 : 0), z);
        this.A07 = new DDn(cjS);
        this.A01 = new DDn(cjS);
        if (z) {
            A002 = null;
        } else {
            A002 = DE4.A00(cjS, false);
        }
        this.A00 = A002;
    }

    public void BCi(EAJ eaj) {
    }
}
