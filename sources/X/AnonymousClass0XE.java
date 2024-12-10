package X;

import java.util.Map;

/* renamed from: X.0XE  reason: invalid class name */
public class AnonymousClass0XE implements C16820tH {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass0XE(AnonymousClass0VQ r1, C16820tH r2, C16820tH r3, int i, int i2) {
        this.A00 = i2;
        this.A04 = r1;
        this.A01 = i;
        this.A03 = r3;
        this.A02 = r2;
    }

    public Map BMp() {
        return ((C16820tH) this.A02).BMp();
    }

    public void CBj() {
        int i = this.A00;
        AnonymousClass0VQ r1 = (AnonymousClass0VQ) this.A04;
        int i2 = this.A01;
        if (i != 0) {
            r1.A00 = i2;
            ((C16820tH) this.A03).CBj();
            r1.A0F(r1.A00);
            return;
        }
        r1.A01 = i2;
        ((C16820tH) this.A03).CBj();
        AnonymousClass0VQ.A08(r1);
    }

    public int getHeight() {
        return ((C16820tH) this.A02).getHeight();
    }

    public int getWidth() {
        return ((C16820tH) this.A02).getWidth();
    }
}
