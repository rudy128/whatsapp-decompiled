package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

/* renamed from: X.3gs  reason: invalid class name and case insensitive filesystem */
public abstract class C75313gs extends WaImageView {
    public boolean A00;

    public void A05() {
        if (this instanceof AnonymousClass3gh) {
            AnonymousClass3gh r1 = (AnonymousClass3gh) this;
            if (!r1.A00) {
                r1.A00 = true;
                C72483Me.A0x(r1);
            }
        } else if (this instanceof AnonymousClass3gi) {
            AnonymousClass3gi r12 = (AnonymousClass3gi) this;
            if (!r12.A00) {
                r12.A00 = true;
                C72483Me.A0x(r12);
            }
        } else if (!this.A00) {
            this.A00 = true;
            C72483Me.A0x(this);
        }
    }

    public C75313gs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }
}
