package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextPaint;

public final class BGL extends TextPaint {
    public AnonymousClass0NG A00 = AnonymousClass0NG.A03;
    public C02000Cg A01;
    public C25827Cme A02 = C25827Cme.A02;
    public final C16790tE A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0tE, X.0WR, java.lang.Object] */
    public BGL(float f) {
        super(1);
        this.density = f;
        ? obj = new Object();
        obj.A01 = this;
        obj.A00 = 3;
        this.A03 = obj;
    }

    public final void A00(C03380Hv r6, float f, long j) {
        float A022;
        if (((r6 instanceof AnonymousClass09Y) && ((AnonymousClass09Y) r6).A00 != C05100Qk.A05) || ((r6 instanceof C016009d) && j != AnonymousClass0QG.A01)) {
            C16790tE r2 = this.A03;
            if (Float.isNaN(f)) {
                A022 = ((float) ((AnonymousClass0WR) r2).A01.getAlpha()) / 255.0f;
            } else {
                A022 = C28851b7.A02(f, 0.0f, 1.0f);
            }
            r6.A00(r2, A022, j);
        } else if (r6 == null) {
            AnonymousClass0WR r0 = (AnonymousClass0WR) this.A03;
            r0.A02 = null;
            r0.A01.setShader((Shader) null);
        }
    }

    public final void A01(AnonymousClass0NG r7) {
        if (r7 != null && !C18070vi.A18(this.A00, r7)) {
            this.A00 = r7;
            if (r7.equals(AnonymousClass0NG.A03)) {
                clearShadowLayer();
                return;
            }
            AnonymousClass0NG r5 = this.A00;
            float f = r5.A00;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            long j = r5.A02;
            setShadowLayer(f, AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j), AnonymousClass0Oy.A00(r5.A01));
        }
    }

    public final void A02(C02000Cg r5) {
        Paint.Cap cap;
        if (r5 != null && !C18070vi.A18(this.A01, r5)) {
            this.A01 = r5;
            if (r5.equals(C016909m.A00)) {
                C108945cZ.A1L(((AnonymousClass0WR) this.A03).A01);
            } else if (r5 instanceof C016809l) {
                C16790tE r2 = this.A03;
                AnonymousClass0WR r3 = (AnonymousClass0WR) r2;
                AnonymousClass3MW.A1P(r3.A01);
                C016809l r52 = (C016809l) r5;
                r3.A01.setStrokeWidth(r52.A01);
                r3.A01.setStrokeMiter(r52.A00);
                r2.CKv(r52.A03);
                int i = r52.A02;
                Paint paint = r3.A01;
                if (i == 2) {
                    cap = Paint.Cap.SQUARE;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                paint.setStrokeCap(cap);
                r3.A01.setPathEffect((PathEffect) null);
            }
        }
    }

    public final void A03(C25827Cme cme) {
        if (cme != null && !C18070vi.A18(this.A02, cme)) {
            this.A02 = cme;
            int i = cme.A00;
            setUnderlineText(AnonymousClass000.A1T(1 | i, i));
            int i2 = this.A02.A00;
            setStrikeThruText(AnonymousClass000.A1T(2 | i2, i2));
        }
    }
}
