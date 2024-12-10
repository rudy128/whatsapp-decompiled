package X;

import android.graphics.Path;

/* renamed from: X.D7z  reason: case insensitive filesystem */
public class C26650D7z implements C40681v6 {
    public final Path.FillType A00;
    public final C41971xP A01;
    public final C40541us A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public E7G CPB(C39801tf r2, C38631rd r3, C26642D7p d7p) {
        return new C26640D7n(r3, this, d7p);
    }

    public C26650D7z(Path.FillType fillType, C41971xP r2, C40541us r3, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A00 = fillType;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShapeFill{color=, fillEnabled=");
        A10.append(this.A05);
        return C17890vO.A0b(A10);
    }
}
