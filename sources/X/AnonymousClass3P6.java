package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

/* renamed from: X.3P6  reason: invalid class name */
public final class AnonymousClass3P6 extends FrameLayout {
    public final ViewGroup.MarginLayoutParams A00;
    public final WaTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3P6(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        View.inflate(getContext(), 2131624603, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A00 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        WaTextView A0N = AnonymousClass3Ma.A0N(this, 2131436208);
        this.A01 = A0N;
        C43421zm.A04(A0N);
        AnonymousClass1HF.A0q(this, true);
        AnonymousClass1HF.A0f(this, new AnonymousClass3SN(1));
    }
}
