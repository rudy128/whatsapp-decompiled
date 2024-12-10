package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.insights.InsightsTileView;

/* renamed from: X.3QV  reason: invalid class name */
public abstract class AnonymousClass3QV extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3QV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            InsightsTileView insightsTileView = (InsightsTileView) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            insightsTileView.A01 = (AnonymousClass4ZS) r1.A00.A2v.get();
            insightsTileView.A00 = AnonymousClass10E.A6Q(r1);
        }
    }
}
