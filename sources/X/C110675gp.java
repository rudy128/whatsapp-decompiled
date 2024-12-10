package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5gp  reason: invalid class name and case insensitive filesystem */
public final class C110675gp extends ScrollView {
    public final ViewStub A00;
    public final ViewStub A01;
    public final RadioButton A02 = ((RadioButton) AnonymousClass1HF.A06(this, 2131433291));
    public final RadioButton A03 = ((RadioButton) AnonymousClass1HF.A06(this, 2131432892));
    public final RadioButton A04 = ((RadioButton) AnonymousClass1HF.A06(this, 2131432891));
    public final WaTextView A05;
    public final WaTextView A06;
    public final WDSButton A07;
    public final WaTextView A08;

    public C110675gp(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), 2131626604, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        setPadding(0, getResources().getDimensionPixelSize(2131168784), 0, getResources().getDimensionPixelSize(2131168777));
        WaTextView A0T = AnonymousClass3MW.A0T(this, 2131435673);
        this.A08 = A0T;
        WaTextView A0T2 = AnonymousClass3MW.A0T(this, 2131430647);
        this.A05 = A0T2;
        WaTextView A0T3 = AnonymousClass3MW.A0T(this, 2131431602);
        this.A06 = A0T3;
        this.A00 = AnonymousClass3MW.A0E(this, 2131435682);
        this.A01 = AnonymousClass3MW.A0E(this, 2131436961);
        this.A07 = AnonymousClass3MW.A0q(this, 2131430124);
        C43421zm.A04(A0T);
        C43421zm.A04(A0T2);
        C43421zm.A04(A0T3);
        this.A04.setText(2131895628);
        this.A02.setText(2131895624);
        this.A03.setText(2131895626);
    }

    public static final void A00(C110675gp r2) {
        r2.A03.setChecked(false);
        r2.A04.setChecked(false);
        r2.A02.setChecked(false);
    }
}
