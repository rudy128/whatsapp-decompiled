package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public final class BGT extends CharacterStyle implements UpdateAppearance {
    public final C02000Cg A00;

    public void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C02000Cg r2 = this.A00;
            if (C18070vi.A18(r2, C016909m.A00)) {
                C108945cZ.A1L(textPaint);
            } else if (r2 instanceof C016809l) {
                AnonymousClass3MW.A1P(textPaint);
                C016809l r22 = (C016809l) r2;
                textPaint.setStrokeWidth(r22.A01);
                textPaint.setStrokeMiter(r22.A00);
                int i = r22.A03;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else {
                    join = Paint.Join.BEVEL;
                }
                textPaint.setStrokeJoin(join);
                int i2 = r22.A02;
                if (i2 != 0) {
                    if (i2 == 1) {
                        cap = Paint.Cap.ROUND;
                    } else if (i2 == 2) {
                        cap = Paint.Cap.SQUARE;
                    }
                    textPaint.setStrokeCap(cap);
                    textPaint.setPathEffect((PathEffect) null);
                }
                cap = Paint.Cap.BUTT;
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect((PathEffect) null);
            }
        }
    }

    public BGT(C02000Cg r1) {
        this.A00 = r1;
    }
}
