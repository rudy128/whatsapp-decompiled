package X;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;
import android.view.animation.LinearInterpolator;

/* renamed from: X.Cxr  reason: case insensitive filesystem */
public final class C26334Cxr implements DialogInterface.OnShowListener {
    public final /* synthetic */ BF6 A00;

    public C26334Cxr(BF6 bf6) {
        this.A00 = bf6;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Window window;
        if (dialogInterface != null && (window = ((Dialog) dialogInterface).getWindow()) != null) {
            BF6 bf6 = this.A00;
            window.setBackgroundDrawable(bf6);
            ValueAnimator valueAnimator = new ValueAnimator();
            C26323Cxg.A00(valueAnimator, bf6, 2);
            valueAnimator.setRepeatCount(0);
            valueAnimator.setDuration(200);
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.start();
        }
    }
}
