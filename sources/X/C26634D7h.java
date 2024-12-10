package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.D7h  reason: case insensitive filesystem */
public class C26634D7h implements C28645ECd, E3k, C28647ECf {
    public boolean A00;
    public C26049CrJ A01 = null;
    public final C38631rd A02;
    public final Path A03 = C108945cZ.A0L();
    public final RectF A04 = AnonymousClass3MW.A08();
    public final C25042CUw A05 = new C25042CUw();
    public final C26049CrJ A06;
    public final C26049CrJ A07;
    public final C26049CrJ A08;
    public final String A09;
    public final boolean A0A;

    public void C9s() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    public void CIY(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            E7G e7g = (E7G) list.get(i);
            if ((e7g instanceof D7c) && ((D7c) e7g).A03 == AnonymousClass00R.A00) {
                D7c d7c = (D7c) e7g;
                this.A05.A00.add(d7c);
                d7c.A04.add(this);
            } else if (e7g instanceof D7b) {
                this.A01 = ((D7b) e7g).A01;
            }
        }
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26049CrJ crJ;
        if (obj == EBL.A04) {
            crJ = this.A08;
        } else if (obj == EBL.A03) {
            crJ = this.A07;
        } else if (obj == EBL.A0B) {
            crJ = this.A06;
        } else {
            return;
        }
        crJ.A0B(ckt);
    }

    public Path BWP() {
        C26049CrJ crJ;
        boolean z = this.A00;
        Path path = this.A03;
        if (!z) {
            path.reset();
            if (!this.A0A) {
                PointF A022 = C26049CrJ.A02(this.A08);
                float f = A022.x / 2.0f;
                float f2 = A022.y / 2.0f;
                float A0C = ((C22735BMy) this.A06).A0C();
                if (A0C == 0.0f && (crJ = this.A01) != null) {
                    A0C = Math.min(C26049CrJ.A01(crJ), Math.min(f, f2));
                }
                float min = Math.min(f, f2);
                if (A0C > min) {
                    A0C = min;
                }
                PointF A023 = C26049CrJ.A02(this.A07);
                path.moveTo(A023.x + f, (A023.y - f2) + A0C);
                path.lineTo(A023.x + f, (A023.y + f2) - A0C);
                if (A0C > 0.0f) {
                    RectF rectF = this.A04;
                    float f3 = A023.x + f;
                    float f4 = A0C * 2.0f;
                    float f5 = A023.y + f2;
                    rectF.set(f3 - f4, f5 - f4, f3, f5);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
                path.lineTo((A023.x - f) + A0C, A023.y + f2);
                if (A0C > 0.0f) {
                    RectF rectF2 = this.A04;
                    float f6 = A023.x - f;
                    float f7 = A023.y + f2;
                    float f8 = A0C * 2.0f;
                    rectF2.set(f6, f7 - f8, f8 + f6, f7);
                    path.arcTo(rectF2, 90.0f, 90.0f, false);
                }
                path.lineTo(A023.x - f, (A023.y - f2) + A0C);
                if (A0C > 0.0f) {
                    RectF rectF3 = this.A04;
                    float f9 = A023.x - f;
                    float f10 = A023.y - f2;
                    float f11 = A0C * 2.0f;
                    rectF3.set(f9, f10, f9 + f11, f11 + f10);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                }
                path.lineTo((A023.x + f) - A0C, A023.y - f2);
                if (A0C > 0.0f) {
                    RectF rectF4 = this.A04;
                    float f12 = A023.x + f;
                    float f13 = A0C * 2.0f;
                    float f14 = A023.y - f2;
                    rectF4.set(f12 - f13, f14, f12, f14 + f13);
                    path.arcTo(rectF4, 270.0f, 90.0f, false);
                }
                path.close();
                this.A05.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    public String getName() {
        return this.A09;
    }

    public C26634D7h(C38631rd r4, C42881yt r5, C26642D7p d7p) {
        this.A09 = r5.A03;
        this.A0A = r5.A04;
        this.A02 = r4;
        C26049CrJ BHA = r5.A01.BHA();
        this.A07 = BHA;
        C26049CrJ BHA2 = r5.A02.BHA();
        this.A08 = BHA2;
        C26049CrJ BHA3 = r5.A00.BHA();
        this.A06 = BHA3;
        d7p.A0C(BHA);
        d7p.A0C(BHA2);
        d7p.A0C(BHA3);
        BHA.A0A(this);
        BHA2.A0A(this);
        BHA3.A0A(this);
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
    }
}
