package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

public abstract class BJT extends ConstraintLayout implements AnonymousClass009 {
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

    public BJT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            WDSListItem wDSListItem = (WDSListItem) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            wDSListItem.A07 = AnonymousClass10E.A8q(r1);
            wDSListItem.A08 = (AnonymousClass1LT) r1.A00.A59.get();
            wDSListItem.A06 = AnonymousClass10E.A6R(r1);
        }
    }
}
