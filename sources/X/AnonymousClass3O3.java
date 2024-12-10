package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3O3  reason: invalid class name */
public class AnonymousClass3O3 extends View {
    public final Rect A00 = AnonymousClass3MW.A07();
    public final /* synthetic */ AnonymousClass4XZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3O3(Context context, AnonymousClass4XZ r3) {
        super(context);
        this.A01 = r3;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass4XZ r1 = this.A01;
        C79073uJ r2 = r1.A0D;
        C108875cR r0 = r2.A0k;
        if ((r0 == null || r0.Bjq()) && isSelected()) {
            StickerView stickerView = r1.A0A;
            Rect rect = this.A00;
            stickerView.getDrawingRect(rect);
            canvas.drawRect(rect, r2.A0l.BRs());
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        StickerView stickerView = this.A01.A0A;
        int measuredHeight = stickerView.getMeasuredHeight();
        int measuredWidth = stickerView.getMeasuredWidth();
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(measuredWidth, size);
            } else {
                size = measuredWidth;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, measuredHeight);
            } else {
                size2 = measuredHeight;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
