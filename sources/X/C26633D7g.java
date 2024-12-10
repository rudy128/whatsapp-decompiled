package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.D7g  reason: case insensitive filesystem */
public class C26633D7g implements C28645ECd, E3k, C28647ECf {
    public boolean A00;
    public final C38631rd A01;
    public final Path A02 = C108945cZ.A0L();
    public final C25042CUw A03 = new C25042CUw();
    public final C26049CrJ A04;
    public final C26049CrJ A05;
    public final C26647D7u A06;
    public final String A07;

    public void C9s() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    public void CIY(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            E7G e7g = (E7G) list.get(i);
            if ((e7g instanceof D7c) && ((D7c) e7g).A03 == AnonymousClass00R.A00) {
                D7c d7c = (D7c) e7g;
                this.A03.A00.add(d7c);
                d7c.A04.add(this);
            }
        }
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26049CrJ crJ;
        if (obj == EBL.A02) {
            crJ = this.A05;
        } else if (obj == EBL.A03) {
            crJ = this.A04;
        } else {
            return;
        }
        crJ.A0B(ckt);
    }

    public Path BWP() {
        float f;
        float f2;
        Path path;
        float f3;
        float f4;
        boolean z = this.A00;
        Path path2 = this.A02;
        if (!z) {
            path2.reset();
            C26647D7u d7u = this.A06;
            if (!d7u.A03) {
                PointF A022 = C26049CrJ.A02(this.A05);
                float f5 = A022.x / 2.0f;
                float f6 = A022.y / 2.0f;
                float f7 = f5 * 0.55228f;
                float f8 = 0.55228f * f6;
                path2.reset();
                float f9 = -f6;
                if (d7u.A04) {
                    path2.moveTo(0.0f, f9);
                    float f10 = 0.0f - f7;
                    float f11 = -f5;
                    f = 0.0f - f8;
                    path2.cubicTo(f10, f9, f11, f, f11, 0.0f);
                    f2 = f8 + 0.0f;
                    path = path2;
                    f3 = 0.0f;
                    path.cubicTo(f11, f2, f10, f6, 0.0f, f6);
                    f4 = f7 + 0.0f;
                } else {
                    path2.moveTo(0.0f, f9);
                    float f12 = f7 + 0.0f;
                    f = 0.0f - f8;
                    path2.cubicTo(f12, f9, f5, f, f5, 0.0f);
                    f2 = f8 + 0.0f;
                    path = path2;
                    f3 = 0.0f;
                    path.cubicTo(f5, f2, f12, f6, 0.0f, f6);
                    f4 = 0.0f - f7;
                    f5 = -f5;
                }
                path2.cubicTo(f4, f6, f5, f2, f5, 0.0f);
                path.cubicTo(f5, f, f4, f9, f3, f9);
                PointF A023 = C26049CrJ.A02(this.A04);
                path2.offset(A023.x, A023.y);
                path2.close();
                this.A03.A00(path2);
            }
            this.A00 = true;
        }
        return path2;
    }

    public String getName() {
        return this.A07;
    }

    public C26633D7g(C38631rd r3, C26647D7u d7u, C26642D7p d7p) {
        this.A07 = d7u.A02;
        this.A01 = r3;
        C26049CrJ BHA = d7u.A00.BHA();
        this.A05 = BHA;
        C26049CrJ BHA2 = d7u.A01.BHA();
        this.A04 = BHA2;
        this.A06 = d7u;
        d7p.A0C(BHA);
        d7p.A0C(BHA2);
        BHA.A0A(this);
        BHA2.A0A(this);
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
    }
}
