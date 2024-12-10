package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.1cJ  reason: invalid class name and case insensitive filesystem */
public abstract class C29461cJ extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            ((WaImageView) this).A00 = (C18000vb) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.ABz.get();
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

    public C29461cJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }
}
