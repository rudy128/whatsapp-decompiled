package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.Dqj  reason: case insensitive filesystem */
public final class C28069Dqj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ Matrix $imageTransformation;
    public final /* synthetic */ Paint $paint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28069Dqj(Bitmap bitmap, Matrix matrix, Paint paint) {
        super(1);
        this.$imageTransformation = matrix;
        this.$bitmap = bitmap;
        this.$paint = paint;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Canvas canvas = (Canvas) obj;
        C18070vi.A0d(canvas, 0);
        canvas.concat(this.$imageTransformation);
        canvas.drawBitmap(this.$bitmap, 0.0f, 0.0f, this.$paint);
        return C27621Wu.A00;
    }
}
