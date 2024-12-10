package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Dqx  reason: case insensitive filesystem */
public final class C28083Dqx extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Matrix $imageTransformation;
    public final /* synthetic */ Paint $paint;
    public final /* synthetic */ C3G $shape;
    public final /* synthetic */ C22829BRh $this_createRenderCommand;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28083Dqx(Matrix matrix, Paint paint, C22829BRh bRh, C3G c3g) {
        super(1);
        this.$this_createRenderCommand = bRh;
        this.$imageTransformation = matrix;
        this.$shape = c3g;
        this.$paint = paint;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Canvas canvas = (Canvas) obj;
        C18070vi.A0d(canvas, 0);
        C22829BRh bRh = this.$this_createRenderCommand;
        int i2 = bRh.A01;
        if (i2 <= 0 || (i = bRh.A00) <= 0) {
            Drawable drawable = bRh.A02;
            RectF rectF = ((C22830BRi) this.$shape).A00;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        } else {
            bRh.A02.setBounds(0, 0, i2, i);
            canvas.concat(this.$imageTransformation);
        }
        this.$this_createRenderCommand.A02.setColorFilter(this.$paint.getColorFilter());
        this.$this_createRenderCommand.A02.setAlpha(this.$paint.getAlpha());
        this.$this_createRenderCommand.A02.draw(canvas);
        return C27621Wu.A00;
    }
}
