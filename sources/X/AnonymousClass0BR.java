package X;

import android.graphics.Paint;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0BR  reason: invalid class name */
public final class AnonymousClass0BR extends C01850Ad {
    public static final C16790tE A03;
    public C17670v2 A00;
    public C01880Ag A01;
    public Constraints A02;

    static {
        AnonymousClass0WR r2 = new AnonymousClass0WR();
        r2.CIO(C05100Qk.A02);
        r2.A01.setStrokeWidth(1.0f);
        r2.A01.setStyle(Paint.Style.STROKE);
        A03 = r2;
    }

    public int A0a(C04280Mo r2) {
        C01880Ag r0 = this.A01;
        if (r0 != null) {
            return r0.A0l(r2);
        }
        return AnonymousClass0F1.A00(r2, this);
    }

    public AnonymousClass0XW A0r() {
        return ((AnonymousClass0XW) this.A00).A03;
    }

    public void A17() {
        if (this.A01 == null) {
            this.A01 = new C01860Ae(this);
        }
    }

    public int Bj9(int i) {
        return this.A00.BjB(A1P(), this, i);
    }

    public int BjC(int i) {
        return this.A00.BjE(A1P(), this, i);
    }

    public int Bjv(int i) {
        return this.A00.Bjx(A1P(), this, i);
    }

    public int Bjy(int i) {
        return this.A00.Bk0(A1P(), this, i);
    }

    public AnonymousClass0BR(C17670v2 r2, AnonymousClass0XV r3) {
        super(r3);
        C01860Ae r0;
        this.A00 = r2;
        if (r3.A07 != null) {
            r0 = new C01860Ae(this);
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }

    public void A0Z(C22821Di r2, float f, long j) {
        super.A0Z(r2, f, j);
        if (!A0j()) {
            A15();
            A0c().CBj();
        }
    }

    public C01880Ag A0v() {
        return this.A01;
    }

    public void A1B(C16960tV r2) {
        A1P().A1A(r2);
        if (AnonymousClass0O0.A00(A0t()).getShowLayoutBounds()) {
            A1C(r2, A03);
        }
    }

    public final C17670v2 A1O() {
        return this.A00;
    }

    public final C01850Ad A1P() {
        C01850Ad A0w = A0w();
        C18070vi.A0b(A0w);
        return A0w;
    }

    public AnonymousClass0XJ Bjb(long j) {
        A0X(j);
        A1D(this.A00.Bja(A1P(), this, j));
        A14();
        return this;
    }

    public final void A1Q(C17670v2 r1) {
        this.A00 = r1;
    }
}
