package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;

/* renamed from: X.BTo  reason: case insensitive filesystem */
public final class C22877BTo extends C3J implements C28554E7f {
    public final int A00;
    public final E1F A01;
    public final BTM A02;
    public final E1G A03;

    public void BJL(Canvas canvas, C25741ClB clB) {
        BTM btm;
        E1F e1f;
        C18070vi.A0d(clB, 1);
        Paint paint = clB.A00;
        if (paint == null) {
            paint = C108945cZ.A0K(7);
            C108945cZ.A1L(paint);
            clB.A00 = paint;
        }
        BTM btm2 = this.A02;
        C22877BTo bTo = clB.A03;
        if (bTo != null) {
            btm = bTo.A02;
        } else {
            btm = null;
        }
        if (!C18070vi.A18(btm2, btm)) {
            if (btm2 != null) {
                paint.setShadowLayer(btm2.A02, btm2.A00, btm2.A01, btm2.A03);
            } else {
                paint.clearShadowLayer();
            }
        }
        int i = this.A00;
        C22877BTo bTo2 = clB.A03;
        if (bTo2 == null || i != bTo2.A00) {
            C25904CoG.A01(i, paint);
        }
        E1F e1f2 = this.A01;
        C22877BTo bTo3 = clB.A03;
        if (bTo3 != null) {
            e1f = bTo3.A01;
        } else {
            e1f = null;
        }
        if (!C18070vi.A18(e1f2, e1f)) {
            if (e1f2 instanceof BU2) {
                if (paint.getShader() != null) {
                    paint.setShader((Shader) null);
                }
                int color = paint.getColor();
                int i2 = ((BU2) e1f2).A00;
                if (color != i2) {
                    paint.setColor(i2);
                }
            } else if (e1f2 instanceof BU1) {
                paint.setShader(((BU1) e1f2).A00.CPS());
            }
        }
        clB.A03 = this;
        E1G e1g = this.A03;
        if (e1g instanceof BU3) {
            canvas.drawPath(clB.A00((BU3) e1g, (BUD) null), paint);
        } else if (!(e1g instanceof EDM)) {
        } else {
            if (e1g instanceof BU6) {
                AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, "CanvasFill", "A Line shape cannot be 'filled'. Ignoring.", (Throwable) null);
            } else {
                ((EDM) e1g).BJK(canvas, paint);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22877BTo) {
                C22877BTo bTo = (C22877BTo) obj;
                if (!C18070vi.A18(this.A03, bTo.A03) || !C18070vi.A18(this.A01, bTo.A01) || this.A00 != bTo.A00 || !C18070vi.A18(this.A02, bTo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean BkE() {
        BTM btm = this.A02;
        int i = this.A00;
        C18460wS r2 = C18460wS.A00;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        if (i == 16 || i == 17 || i == 15 || btm != null) {
            return true;
        }
        if (r2.isEmpty()) {
            return false;
        }
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            if (((C28554E7f) it.next()).BkE()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A03)) + this.A00) * 31) + AnonymousClass001.A0k(this.A02);
    }

    public C22877BTo(E1F e1f, BTM btm, E1G e1g, int i) {
        this.A03 = e1g;
        this.A01 = e1f;
        this.A00 = i;
        this.A02 = btm;
    }
}
