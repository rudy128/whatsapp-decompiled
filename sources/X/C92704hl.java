package X;

import android.view.View;

/* renamed from: X.4hl  reason: invalid class name and case insensitive filesystem */
public final class C92704hl implements C108825cM {
    public final View.OnClickListener A00;
    public final C86734Sv A01;
    public final AnonymousClass4ZN A02 = AnonymousClass3MX.A0t(2131886698);

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92704hl) && C18070vi.A18(this.A00, ((C92704hl) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4ZN BNZ() {
        return this.A02;
    }

    public C86734Sv BNt() {
        return this.A01;
    }

    public C92704hl(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        this.A01 = new C86734Sv(onClickListener, AnonymousClass3MX.A0t(2131886712));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlmConsentErrorBannerContent(retryFlmConsent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
