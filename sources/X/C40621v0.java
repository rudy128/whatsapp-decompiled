package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.community.CommunityFragment;

/* renamed from: X.1v0  reason: invalid class name and case insensitive filesystem */
public abstract class C40621v0 extends C40611uz {
    public final Rect A00 = new Rect();
    public final Drawable A01;

    public boolean A06(int i, int i2) {
        C45902Cc r1 = (C45902Cc) this;
        if (r1.A00 != 0) {
            if (i != 7) {
                return false;
            }
            C18030ve r0 = ((CommunityFragment) r1.A01).A0D;
            if (r0 != null) {
                if (AnonymousClass1J8.A08(r0)) {
                    return false;
                }
                if (i2 == 3 || i2 == 12) {
                    return true;
                }
                return false;
            }
        } else if (i2 == -1) {
            if (i == 9) {
                return false;
            }
            return true;
        } else if (i2 != 7) {
            return false;
        } else {
            C18030ve r02 = ((CommunityFragment) r1.A01).A0D;
            if (r02 != null) {
                if (!AnonymousClass1J8.A08(r02)) {
                    return true;
                }
                return false;
            }
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public C40621v0(Drawable drawable) {
        this.A01 = drawable;
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        View childAt;
        canvas.save();
        if (recyclerView.A0N) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            if (i2 == childCount - 1) {
                childAt = null;
            } else {
                childAt = recyclerView.getChildAt(i2 + 1);
            }
            if (A06(recyclerView.A0B.getItemViewType(RecyclerView.A00(childAt2)), recyclerView.A0B.getItemViewType(RecyclerView.A00(childAt)))) {
                Rect rect = this.A00;
                RecyclerView.A09(childAt2, rect);
                int round = rect.bottom + Math.round(childAt2.getTranslationY());
                Drawable drawable = this.A01;
                drawable.setBounds(i, round - drawable.getIntrinsicHeight(), width, round);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void A05(Rect rect, View view, C38021qZ r7, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        if (A06(recyclerView.A0B.getItemViewType(A002), recyclerView.A0B.getItemViewType(A002 + 1))) {
            rect.set(0, 0, 0, this.A01.getIntrinsicHeight());
        } else {
            rect.setEmpty();
        }
    }
}
