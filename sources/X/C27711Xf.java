package X;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.MaterialToolbar;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.1Xf  reason: invalid class name and case insensitive filesystem */
public abstract class C27711Xf extends MaterialToolbar implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C27711Xf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            WDSToolbar wDSToolbar = (WDSToolbar) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            wDSToolbar.A03 = (C18030ve) r1.A04.get();
            wDSToolbar.A02 = (C27841Xv) r1.A00.A0M.get();
            wDSToolbar.A04 = (AnonymousClass1DC) r1.A95.get();
        }
    }
}
