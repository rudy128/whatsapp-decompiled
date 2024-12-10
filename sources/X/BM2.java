package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class BM2 extends C40611uz {
    public int A00;
    public boolean A01;
    public View A02;
    public final Rect A03 = AnonymousClass3MW.A07();
    public final LruCache A04 = new LruCache(50);
    public final C40391ud A05;

    public static void A00(BM2 bm2, int i, int i2) {
        LruCache lruCache = bm2.A04;
        if (lruCache.size() != 0) {
            for (int i3 = i; i3 <= i + i2; i3++) {
                lruCache.remove(Integer.valueOf(i3));
            }
        }
    }

    public void A03(Canvas canvas, C38021qZ r11, RecyclerView recyclerView) {
        C38251qy layoutManager;
        int i;
        C40391ud r7 = this.A05;
        if (r7.CM0() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int i2 = 0;
            if (r7.Be5()) {
                i = layoutManager.A0J() - 1;
            } else {
                i = 0;
            }
            View A0P = layoutManager.A0P(i);
            if (A0P != null) {
                int A002 = RecyclerView.A00(A0P);
                if (A002 == -1) {
                    View view = this.A02;
                    canvas.save();
                    canvas.translate((float) this.A03.left, 0.0f);
                    view.draw(canvas);
                } else {
                    int BSO = r7.BSO(A002);
                    if (BSO == -1) {
                        this.A01 = true;
                        return;
                    }
                    this.A01 = false;
                    if (A002 == BSO) {
                        layoutManager.A0X(A0P, this.A03);
                    }
                    LruCache lruCache = this.A04;
                    Integer valueOf = Integer.valueOf(BSO);
                    View view2 = (View) lruCache.get(valueOf);
                    if (view2 == null) {
                        C42011xT BqY = r7.BqY(recyclerView, r7.getItemViewType(BSO));
                        r7.Bmc(BqY, BSO);
                        view2 = BqY.A0H;
                        lruCache.put(valueOf, view2);
                    }
                    Rect rect = this.A03;
                    view2.measure(ViewGroup.getChildMeasureSpec(BE7.A06(recyclerView.getWidth()), C72453Mb.A0C(recyclerView), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), BE9.A08(recyclerView), view2.getLayoutParams().height));
                    this.A00 = view2.getMeasuredHeight() + rect.bottom + rect.top;
                    view2.layout(0, 0, view2.getMeasuredWidth() + rect.left + rect.right, this.A00);
                    this.A02 = view2;
                    int bottom = view2.getBottom() - rect.top;
                    while (i2 < recyclerView.getChildCount()) {
                        View childAt = recyclerView.getChildAt(i2);
                        Rect A07 = AnonymousClass3MW.A07();
                        RecyclerView.A09(childAt, A07);
                        if (A07.bottom <= bottom || A07.top > bottom) {
                            i2++;
                        } else if (childAt != null) {
                            int A003 = RecyclerView.A00(childAt);
                            if (A003 == -1 || !r7.Bex(A003)) {
                                canvas.save();
                                canvas.translate((float) rect.left, 0.0f);
                            } else {
                                canvas.save();
                                canvas.translate((float) rect.left, (float) (childAt.getTop() - view2.getHeight()));
                            }
                            view2.draw(canvas);
                        } else {
                            return;
                        }
                    }
                    return;
                }
                canvas.restore();
            }
        }
    }

    public BM2(Context context, RecyclerView recyclerView, E6R e6r, C40391ud r7) {
        this.A05 = r7;
        recyclerView.A12.add(new D72(new CIZ(context, new BH0(e6r, this), (Handler) null), e6r, r7, this));
        r7.CDq(new C22710BLv(this, 1));
    }
}
