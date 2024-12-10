package X;

import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.41o  reason: invalid class name and case insensitive filesystem */
public final class C819941o extends PhoneNumberPrivacyInfoView {
    public AnonymousClass3L6 A00;
    public AnonymousClass00H A01;
    public boolean A02;

    public final void setGroupDataObservers$app_product_community_community(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final AnonymousClass00H getGroupDataObservers$app_product_community_community() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupDataObservers");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27141Uw A0e = AnonymousClass3MW.A0e(getGroupDataObservers$app_product_community_community());
        AnonymousClass3L6 r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("groupDataObserver");
            throw null;
        } else {
            A0e.A01(r0);
        }
    }
}
