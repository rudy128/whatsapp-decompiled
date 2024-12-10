package X;

import android.view.View;

/* renamed from: X.4hk  reason: invalid class name and case insensitive filesystem */
public final class C92694hk implements C108825cM {
    public final View.OnClickListener A00;
    public final C86734Sv A01;
    public final AnonymousClass4ZN A02 = AnonymousClass3MX.A0t(2131886691);

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92694hk) && C18070vi.A18(this.A00, ((C92694hk) obj).A00));
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

    public C92694hk(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        this.A01 = new C86734Sv(onClickListener, AnonymousClass3MX.A0t(2131886713));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AllowCameraEffectsBannerContent(retryFlmConsent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
