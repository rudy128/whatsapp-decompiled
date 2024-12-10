package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.whatsapp.collections.observablelistview.ObservableListView;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
public abstract class C38571rV extends ListView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            ((ObservableListView) this).A0A = (AnonymousClass1DC) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A95.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38571rV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
