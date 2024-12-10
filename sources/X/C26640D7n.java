package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.D7n  reason: case insensitive filesystem */
public class C26640D7n implements E3k, C28646ECe, C28647ECf {
    public float A00;
    public C26049CrJ A01;
    public C26049CrJ A02;
    public C26638D7l A03;
    public final Paint A04;
    public final Path A05;
    public final C38631rd A06;
    public final C26049CrJ A07;
    public final C26049CrJ A08;
    public final C26642D7p A09;
    public final String A0A;
    public final List A0B = AnonymousClass000.A13();
    public final boolean A0C;

    public void CIY(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof C28645ECd) {
                this.A0B.add(obj);
            }
        }
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26642D7p d7p;
        C26049CrJ crJ;
        C26638D7l d7l;
        C26049CrJ crJ2;
        C26638D7l d7l2;
        C26638D7l d7l3;
        C26638D7l d7l4;
        C26638D7l d7l5;
        if (obj == EBL.A0Z) {
            crJ2 = this.A07;
        } else if (obj == EBL.A0b) {
            crJ2 = this.A08;
        } else {
            if (obj == EBL.A01) {
                C26049CrJ crJ3 = this.A02;
                if (crJ3 != null) {
                    this.A09.A0M.remove(crJ3);
                }
                if (ckt == null) {
                    this.A02 = null;
                    return;
                }
                C22732BMv bMv = new C22732BMv(ckt, (Object) null);
                this.A02 = bMv;
                bMv.A0A(this);
                d7p = this.A09;
                crJ = this.A02;
            } else if (obj == EBL.A0A) {
                crJ2 = this.A01;
                if (crJ2 == null) {
                    C22732BMv bMv2 = new C22732BMv(ckt, (Object) null);
                    this.A01 = bMv2;
                    bMv2.A0A(this);
                    d7p = this.A09;
                    crJ = this.A01;
                }
            } else if (obj == EBL.A0a && (d7l5 = this.A03) != null) {
                crJ2 = d7l5.A01;
            } else if (obj == EBL.A0E && (d7l4 = this.A03) != null) {
                d7l4.A01(ckt);
                return;
            } else if (obj == EBL.A0C && (d7l3 = this.A03) != null) {
                crJ2 = d7l3.A02;
            } else if (obj == EBL.A0D && (d7l2 = this.A03) != null) {
                crJ2 = d7l2.A03;
            } else if (obj == EBL.A0F && (d7l = this.A03) != null) {
                crJ2 = d7l.A04;
            } else {
                return;
            }
            d7p.A0C(crJ);
            return;
        }
        crJ2.A0B(ckt);
    }

    public void BJJ(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (!this.A0C) {
            AnonymousClass29J r2 = (AnonymousClass29J) this.A07;
            int A0C2 = r2.A0C(r2.A06.BPw(), r2.A03());
            int A012 = (int) (BE7.A01(((float) i) / 255.0f, (float) AnonymousClass000.A0M(this.A08.A05())) * 255.0f);
            Paint paint = this.A04;
            int i2 = 0;
            PointF pointF = C40761vE.A00;
            paint.setColor((BE8.A07(255, A012, 0) << 24) | (A0C2 & 16777215));
            BEA.A13(paint, this.A02);
            C26049CrJ crJ = this.A01;
            if (crJ != null) {
                float A013 = C26049CrJ.A01(crJ);
                if (A013 == 0.0f) {
                    blurMaskFilter = null;
                } else {
                    if (A013 != this.A00) {
                        C26642D7p d7p = this.A09;
                        if (d7p.A00 == A013) {
                            blurMaskFilter = d7p.A01;
                        } else {
                            blurMaskFilter = new BlurMaskFilter(A013 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            d7p.A01 = blurMaskFilter;
                            d7p.A00 = A013;
                        }
                    }
                    this.A00 = A013;
                }
                paint.setMaskFilter(blurMaskFilter);
                this.A00 = A013;
            }
            C26638D7l d7l = this.A03;
            if (d7l != null) {
                d7l.A00(paint);
            }
            Path path = this.A05;
            path.reset();
            while (true) {
                List list = this.A0B;
                if (i2 < list.size()) {
                    BEA.A11(matrix, path, list, i2);
                    i2++;
                } else {
                    canvas.drawPath(path, paint);
                    return;
                }
            }
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0B;
            if (i < list.size()) {
                BEA.A11(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                BEA.A14(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void C9s() {
        this.A06.invalidateSelf();
    }

    public String getName() {
        return this.A0A;
    }

    public C26640D7n(C38631rd r7, C26650D7z d7z, C26642D7p d7p) {
        Integer num;
        Path A0L = C108945cZ.A0L();
        this.A05 = A0L;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A09 = d7p;
        this.A0A = d7z.A03;
        this.A0C = d7z.A04;
        this.A06 = r7;
        C24747CIj A082 = d7p.A08();
        if (A082 != null) {
            C26049CrJ BHA = A082.A00.BHA();
            this.A01 = BHA;
            BHA.A0A(this);
            d7p.A0C(this.A01);
        }
        CS8 A092 = d7p.A09();
        if (A092 != null) {
            this.A03 = new C26638D7l(this, d7p, A092);
        }
        C41971xP r3 = d7z.A01;
        if (r3 != null) {
            C40541us r2 = d7z.A02;
            int intValue = d7p.A0L.A0G.intValue();
            if (intValue == 2) {
                num = AnonymousClass00R.A06;
            } else if (intValue == 3) {
                num = AnonymousClass00R.A07;
            } else if (intValue == 4) {
                num = AnonymousClass00R.A08;
            } else if (intValue == 5) {
                num = AnonymousClass00R.A09;
            } else if (intValue != 16) {
                num = null;
            } else {
                num = AnonymousClass00R.A04;
            }
            C25898Co9.A00(paint, num);
            A0L.setFillType(d7z.A00);
            C26049CrJ BHA2 = r3.BHA();
            this.A07 = BHA2;
            BHA2.A0A(this);
            d7p.A0C(BHA2);
            C26049CrJ BHA3 = r2.BHA();
            this.A08 = BHA3;
            BHA3.A0A(this);
            d7p.A0C(BHA3);
            return;
        }
        this.A07 = null;
        this.A08 = null;
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
    }
}
