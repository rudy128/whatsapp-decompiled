package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaViewPager;

/* renamed from: X.5nm  reason: invalid class name and case insensitive filesystem */
public abstract class C113805nm extends ViewPager implements AnonymousClass009 {
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

    public C113805nm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WaViewPager) this).A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }
}
