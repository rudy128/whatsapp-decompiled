package X;

import android.widget.FrameLayout;

/* renamed from: X.3PP  reason: invalid class name */
public final class AnonymousClass3PP extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1L9 A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public AnonymousClass129 A03;
    public C36401np A04;
    public AnonymousClass031 A05;
    public boolean A06;

    public final void setAbProps$app_product_community_community(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setActivityUtils$app_product_community_community(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setFaqLinkFactory$app_product_community_community(AnonymousClass129 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setLinkifier$app_product_community_community(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps$app_product_community_community() {
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1L9 getActivityUtils$app_product_community_community() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass129 getFaqLinkFactory$app_product_community_community() {
        AnonymousClass129 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("faqLinkFactory");
        throw null;
    }

    public final C36401np getLinkifier$app_product_community_community() {
        C36401np r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }
}
