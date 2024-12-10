package X;

import java.util.Map;

/* renamed from: X.0XF  reason: invalid class name */
public final class AnonymousClass0XF implements C16820tH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0XQ A02;
    public final /* synthetic */ AnonymousClass0VQ A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ C22821Di A05;

    public AnonymousClass0XF(AnonymousClass0XQ r1, AnonymousClass0VQ r2, Map map, C22821Di r4, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = map;
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
    }

    public void CBj() {
        C22821Di r1;
        AnonymousClass0AM A0H;
        if (!this.A02.BfO() || (A0H = this.A03.A07.A0H().A0v()) == null) {
            r1 = this.A05;
            A0H = this.A03.A07.A0H();
        } else {
            r1 = this.A05;
        }
        r1.invoke(A0H.A0d());
    }

    public Map BMp() {
        return this.A04;
    }

    public int getHeight() {
        return this.A00;
    }

    public int getWidth() {
        return this.A01;
    }
}
