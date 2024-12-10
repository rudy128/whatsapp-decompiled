package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

/* renamed from: X.5tE  reason: invalid class name and case insensitive filesystem */
public abstract class C115035tE extends WaImageView {
    public boolean A00;

    public void A05() {
        if (!this.A00) {
            this.A00 = true;
            C72483Me.A0x(this);
        }
    }

    public C115035tE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }
}
