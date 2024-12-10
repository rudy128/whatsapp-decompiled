package X;

import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.D7l  reason: case insensitive filesystem */
public class C26638D7l implements E3k {
    public boolean A00 = true;
    public final C26049CrJ A01;
    public final C26049CrJ A02;
    public final C26049CrJ A03;
    public final C26049CrJ A04;
    public final E3k A05;
    public final C26049CrJ A06;

    public void C9s() {
        this.A00 = true;
        this.A05.C9s();
    }

    public void A00(Paint paint) {
        if (this.A00) {
            this.A00 = false;
            double A012 = ((double) C26049CrJ.A01(this.A02)) * 0.017453292519943295d;
            float A013 = C26049CrJ.A01(this.A03);
            float sin = ((float) Math.sin(A012)) * A013;
            float cos = ((float) Math.cos(A012 + 3.141592653589793d)) * A013;
            int A0M = AnonymousClass000.A0M(this.A01.A05());
            paint.setShadowLayer(C26049CrJ.A01(this.A04), sin, cos, Color.argb(Math.round(C26049CrJ.A01(this.A06)), Color.red(A0M), Color.green(A0M), Color.blue(A0M)));
        }
    }

    public void A01(C25723Ckt ckt) {
        if (ckt == null) {
            this.A06.A0B((C25723Ckt) null);
        } else {
            this.A06.A0B(new BN6(this, ckt, 1));
        }
    }

    public C26638D7l(E3k e3k, C26642D7p d7p, CS8 cs8) {
        this.A05 = e3k;
        C26049CrJ BHA = cs8.A00.BHA();
        this.A01 = BHA;
        BHA.A0A(this);
        d7p.A0C(BHA);
        C26049CrJ BHA2 = cs8.A03.BHA();
        this.A06 = BHA2;
        BHA2.A0A(this);
        d7p.A0C(BHA2);
        C26049CrJ BHA3 = cs8.A01.BHA();
        this.A02 = BHA3;
        BHA3.A0A(this);
        d7p.A0C(BHA3);
        C26049CrJ BHA4 = cs8.A02.BHA();
        this.A03 = BHA4;
        BHA4.A0A(this);
        d7p.A0C(BHA4);
        C26049CrJ BHA5 = cs8.A04.BHA();
        this.A04 = BHA5;
        BHA5.A0A(this);
        d7p.A0C(BHA5);
    }
}
