package X;

import android.graphics.Canvas;
import android.view.View;
import java.util.List;

public final class BHP extends View {
    public BTS A00;

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        BTS bts = this.A00;
        if (bts != null) {
            List list = bts.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C28554E7f) list.get(i)).BJL(canvas, bts.A00);
            }
        }
    }

    public final BTS getCanvasModel() {
        return this.A00;
    }

    public final void setCanvasModel(BTS bts) {
        if (!C18070vi.A18(this.A00, bts)) {
            this.A00 = bts;
            invalidate();
        }
    }
}
