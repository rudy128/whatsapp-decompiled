package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.DqK  reason: case insensitive filesystem */
public final class C28045DqK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Paint $paint;
    public final /* synthetic */ C3G $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28045DqK(Paint paint, C3G c3g) {
        super(1);
        this.$shape = c3g;
        this.$paint = paint;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Canvas canvas = (Canvas) obj;
        C18070vi.A0d(canvas, 0);
        C3G c3g = this.$shape;
        Paint paint = this.$paint;
        C18070vi.A0d(paint, 1);
        canvas.drawRect(((C22830BRi) c3g).A00, paint);
        return C27621Wu.A00;
    }
}
