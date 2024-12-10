package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Dr6  reason: case insensitive filesystem */
public final class C28092Dr6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $alpha = 255;
    public final /* synthetic */ C3E $borderOptions = null;
    public final /* synthetic */ C3G $borderShape = null;
    public final /* synthetic */ Rect $bounds;
    public final /* synthetic */ RectF $imageClipRect;
    public final /* synthetic */ C22821Di $imageRenderCommand;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28092Dr6(Rect rect, RectF rectF, C22821Di r5) {
        super(1);
        this.$bounds = rect;
        this.$imageClipRect = rectF;
        this.$imageRenderCommand = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Canvas canvas = (Canvas) obj;
        C18070vi.A0d(canvas, 0);
        int save = canvas.save();
        canvas.clipRect(this.$bounds);
        RectF rectF = this.$imageClipRect;
        if (rectF != null) {
            canvas.clipRect(rectF);
        }
        this.$imageRenderCommand.invoke(canvas);
        canvas.restoreToCount(save);
        return C27621Wu.A00;
    }
}
