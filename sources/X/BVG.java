package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

public final class BVG extends BGV {
    public final DOZ A00;
    public final DFL A01;
    public final DFL A02;
    public final E8A A03;
    public final boolean A04;

    public void onClick(View view) {
        Object obj;
        C18070vi.A0d(view, 0);
        C20046A4p a4p = new C20046A4p();
        a4p.A03(this.A02, 0);
        if (!this.A04 || !(view instanceof RCTextView)) {
            obj = this.A00;
        } else {
            RCTextView rCTextView = (RCTextView) view;
            CharSequence charSequence = rCTextView.A03;
            C18070vi.A0z(charSequence, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) charSequence;
            Layout layout = rCTextView.A02;
            C18070vi.A0X(layout);
            int spanStart = (int) ((double) spanned.getSpanStart(this));
            double primaryHorizontal = (double) layout.getPrimaryHorizontal(spanStart);
            double primaryHorizontal2 = (double) layout.getPrimaryHorizontal((int) ((double) spanned.getSpanEnd(this)));
            int lineForOffset = layout.getLineForOffset(spanStart);
            Rect A07 = AnonymousClass3MW.A07();
            layout.getLineBounds(lineForOffset, A07);
            RectF rectF = new RectF(A07);
            float paddingBottom = rectF.left + ((float) (((((double) rCTextView.getPaddingBottom()) + primaryHorizontal) - ((double) rCTextView.getScrollX())) + ((double) rCTextView.A00)));
            rectF.left = paddingBottom;
            rectF.right = (float) ((((double) paddingBottom) + primaryHorizontal2) - primaryHorizontal);
            float scrollY = (float) ((double) (((float) (rCTextView.getScrollY() + rCTextView.getPaddingTop())) + rCTextView.A01));
            rectF.top += scrollY;
            rectF.bottom += scrollY;
            rCTextView.getMatrix().mapRect(rectF);
            rectF.offset((float) rCTextView.getLeft(), (float) rCTextView.getTop());
            obj = new C24954CRe(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
        }
        a4p.A03(obj, 1);
        C25681CkC.A03(this.A00, this.A01, a4p.A02(), this.A03);
    }

    public void updateDrawState(TextPaint textPaint) {
    }

    public BVG(DOZ doz, DFL dfl, DFL dfl2, E8A e8a, String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = e8a;
        this.A02 = dfl;
        this.A01 = dfl2;
        this.A00 = doz;
        this.A04 = z;
    }
}
