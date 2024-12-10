package X;

import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4Bx  reason: invalid class name */
public final class AnonymousClass4Bx extends WDSButton implements AnonymousClass5ZD {
    public AnonymousClass5XN A00;
    public AnonymousClass3Ut A01;
    public boolean A02;

    public final void setViewModelFactory(AnonymousClass5XN r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass5XN getViewModelFactory() {
        AnonymousClass5XN r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }

    public List getCTAViews() {
        return C18070vi.A0M(this);
    }
}
