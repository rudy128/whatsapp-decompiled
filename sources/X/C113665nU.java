package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;

/* renamed from: X.5nU  reason: invalid class name and case insensitive filesystem */
public abstract class C113665nU extends RecyclerView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A14() {
        if (!this.A01) {
            this.A01 = true;
            AutoFitGridRecyclerView autoFitGridRecyclerView = (AutoFitGridRecyclerView) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            autoFitGridRecyclerView.A02 = AnonymousClass10E.A8r(r1);
            autoFitGridRecyclerView.A01 = AnonymousClass10E.A6Q(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C113665nU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A14();
    }
}
