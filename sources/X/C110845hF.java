package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.5hF  reason: invalid class name and case insensitive filesystem */
public abstract class C110845hF extends ConstraintLayout implements AnonymousClass009 {
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

    public C110845hF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            wDSSectionHeader.A01 = AnonymousClass10E.A8r(r1);
            wDSSectionHeader.A00 = AnonymousClass10E.A6Q(r1);
        }
    }
}
