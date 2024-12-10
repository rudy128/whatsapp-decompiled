package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: X.3PO  reason: invalid class name */
public final class AnonymousClass3PO extends FrameLayout implements AnonymousClass009 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public C37551pj A04;
    public AnonymousClass1CJ A05;
    public AnonymousClass1LU A06;
    public AnonymousClass031 A07;
    public boolean A08;

    public void setup(C18030ve r11, AnonymousClass01E r12, AnonymousClass1CJ r13, AnonymousClass1FR r14, Runnable runnable, C37551pj r16, C36931oh r17, AnonymousClass1E7 r18) {
        this.A05 = r13;
        C37551pj r4 = r16;
        this.A04 = r4;
        C36931oh r6 = r17;
        AnonymousClass1E7 r3 = r18;
        this.A03.setOnClickListener(new AnonymousClass78S(this, r3, r4, r11, r6, r14, r12, 2));
        C89914dE.A00(this.A02, runnable, 48);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }
}
