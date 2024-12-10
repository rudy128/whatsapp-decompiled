package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.3S6  reason: invalid class name */
public final class AnonymousClass3S6 extends ConstraintLayout {
    public final WaImageView A00 = AnonymousClass3MW.A0R(this, 2131428481);
    public final WaTextView A01 = AnonymousClass3MW.A0T(this, 2131428485);
    public final WaTextView A02 = AnonymousClass3MW.A0T(this, 2131428486);

    public AnonymousClass3S6(Context context) {
        super(context, (AttributeSet) null);
        int A012 = AnonymousClass3MW.A01(context.getResources(), 2131169544);
        setPadding(0, A012, 0, A012);
        View.inflate(context, 2131624345, this);
    }

    public final void setViewState(C88494Zy r4) {
        C18070vi.A0d(r4, 0);
        this.A00.setImageResource(r4.A00);
        WaTextView waTextView = this.A02;
        waTextView.setText(r4.A02);
        WaTextView waTextView2 = this.A01;
        CharSequence charSequence = r4.A01;
        waTextView2.setText(charSequence);
        C43531zx.A04(waTextView2, charSequence);
        AnonymousClass1Y5.A09(waTextView, true);
        AnonymousClass1Y5.A09(waTextView2, true);
    }
}
