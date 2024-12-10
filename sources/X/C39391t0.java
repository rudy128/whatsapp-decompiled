package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.1t0  reason: invalid class name and case insensitive filesystem */
public final class C39391t0 extends C39381sz {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ boolean A01;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39391t0(Context context, Runnable runnable, int i, boolean z) {
        super(context, i);
        this.A00 = runnable;
        this.A01 = z;
    }

    public void onClick(View view) {
        this.A00.run();
    }
}
