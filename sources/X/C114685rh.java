package X;

import com.whatsapp.RollingCounterView;

/* renamed from: X.5rh  reason: invalid class name and case insensitive filesystem */
public final class C114685rh extends RollingCounterView implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }
}
