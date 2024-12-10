package X;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import java.util.List;

public final class D5A implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BJ9 A01;
    public final /* synthetic */ C24906COz A02;

    public D5A(BJ9 bj9, C24906COz cOz, int i) {
        this.A01 = bj9;
        this.A02 = cOz;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        int A002;
        List list;
        BJ9 bj9 = this.A01;
        AnonymousClass3MY.A1D(bj9, this);
        C24487C6e c6e = this.A02.A02;
        if (!(c6e == null || (list = c6e.A04) == null)) {
            bj9.A03(list);
        }
        Drawable progressDrawable = bj9.getProgressDrawable();
        int i = bj9.getProgressDrawable().getBounds().left;
        int A003 = bj9.getProgressDrawable().getBounds().left + BJ9.A00(AnonymousClass3MY.A04(bj9), 4);
        int i2 = bj9.getProgressDrawable().getBounds().right;
        int i3 = this.A00;
        if (i3 == 0) {
            A002 = bj9.getProgressDrawable().getBounds().bottom;
        } else {
            A002 = i3 - BJ9.A00(AnonymousClass3MY.A04(bj9), 4);
        }
        progressDrawable.setBounds(i, A003, i2, A002);
    }
}
