package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: X.8I6  reason: invalid class name */
public final class AnonymousClass8I6 extends C40611uz {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2 = canvas;
        C18070vi.A0h(canvas, recyclerView);
        Iterator it = new C99434so(recyclerView, 1).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (A00(view, recyclerView)) {
                canvas2.drawLine((float) (recyclerView.getLeft() + recyclerView.getPaddingLeft()), (float) (view.getTop() - this.A00), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), (float) view.getTop(), this.A02);
            }
        }
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0o(view, recyclerView, r6);
        if (A00(view, recyclerView)) {
            rect.set(0, this.A00 + this.A01, 0, 0);
        } else {
            super.A05(rect, view, r6, recyclerView);
        }
    }

    public static final boolean A00(View view, RecyclerView recyclerView) {
        Object obj;
        C38391rD r1 = recyclerView.A0B;
        if (r1 == null) {
            return false;
        }
        try {
            obj = Integer.valueOf(r1.getItemViewType(RecyclerView.A00(view)));
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        if (obj instanceof AnonymousClass1IU) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number == null || number.intValue() != 2) {
            return false;
        }
        return true;
    }

    public AnonymousClass8I6(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167278);
        this.A00 = dimensionPixelSize;
        this.A01 = context.getResources().getDimensionPixelSize(2131169545);
        Paint paint = new Paint();
        paint.setColor(AnonymousClass3Ma.A00(context, 2130969386, 2131100378));
        paint.setStrokeWidth((float) dimensionPixelSize);
        this.A02 = paint;
    }
}
