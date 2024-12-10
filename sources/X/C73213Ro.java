package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.whatsapp.WaImageButton;

/* renamed from: X.3Ro  reason: invalid class name and case insensitive filesystem */
public abstract class C73213Ro extends AppCompatImageButton implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            ((WaImageButton) this).A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
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

    public C73213Ro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
