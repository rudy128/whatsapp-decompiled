package X;

import android.animation.ValueAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4Qi  reason: invalid class name and case insensitive filesystem */
public final class C86134Qi {
    public ValueAnimator A00;
    public TextView A01;
    public final C18000vb A02;
    public final Runnable A03 = new C98554rL(this, 6);

    public C86134Qi(C18000vb r3) {
        C18070vi.A0d(r3, 1);
        this.A02 = r3;
    }

    public final void A00(ViewGroup viewGroup, Toolbar toolbar, C108865cQ r15, Integer num, int i, long j) {
        KeyEvent.Callback callback;
        TextView textView = this.A01;
        C108865cQ r6 = r15;
        if (textView == null) {
            ViewStub viewStub = (ViewStub) r15.findViewById(2131436284);
            textView = null;
            if (viewStub != null) {
                callback = viewStub.inflate();
            } else {
                callback = null;
            }
            if (callback instanceof TextView) {
                textView = (TextView) callback;
            }
            this.A01 = textView;
            if (textView == null) {
                return;
            }
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new C90564eH(childAt, viewGroup2, textView, toolbar, r6, this, num, i, j));
        }
    }
}
