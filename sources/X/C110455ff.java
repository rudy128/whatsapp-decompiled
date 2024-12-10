package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: X.5ff  reason: invalid class name and case insensitive filesystem */
public final class C110455ff extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final ViewGroup.MarginLayoutParams A02;
    public final TextView A03;
    public final Context A04;

    public final void A00(String str, boolean z, int i) {
        C18070vi.A0d(str, 0);
        this.A03.setText(str);
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A02;
        if (z) {
            marginLayoutParams.bottomMargin = 0;
        } else {
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(2131168543) - C62762rw.A01(this.A04, (float) i);
        }
        setLayoutParams(marginLayoutParams);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C110455ff(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A04 = context;
        View.inflate(getContext(), 2131626792, this);
        this.A03 = AnonymousClass3Ma.A0E(this, 2131436208);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A02 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        C108995ce.A0u(this);
    }
}
