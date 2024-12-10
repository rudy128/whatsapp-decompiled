package X;

import android.view.View;

/* renamed from: X.7rB  reason: invalid class name and case insensitive filesystem */
public final class C154467rB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C121386Jl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154467rB(C121386Jl r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CharSequence text = this.this$0.A09.getText();
        this.this$0.A09.setText(2131886521);
        this.this$0.A09.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.this$0.A09.getMeasuredHeight();
        this.this$0.A09.setText(text);
        return Integer.valueOf(measuredHeight);
    }
}
