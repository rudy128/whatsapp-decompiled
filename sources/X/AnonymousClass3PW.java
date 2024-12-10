package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.3PW  reason: invalid class name */
public final class AnonymousClass3PW extends FrameLayout implements AnonymousClass009 {
    public C28401aA A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final WDSBanner A05;

    public final void setContextualHelpHandler(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setNuxManager(C28401aA r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setParentGroupObservers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getContextualHelpHandler() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contextualHelpHandler");
        throw null;
    }

    public final C28401aA getNuxManager() {
        C28401aA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("nuxManager");
        throw null;
    }

    public final AnonymousClass00H getParentGroupObservers() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("parentGroupObservers");
        throw null;
    }

    public AnonymousClass3PW(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = AnonymousClass3MX.A10(A0O);
            this.A00 = (C28401aA) A0O.A7b.get();
            this.A02 = C000200d.A00(A0O.A7s);
        }
        View.inflate(getContext(), 2131624571, this);
        setId(2131429233);
        C72473Md.A10(this);
        setPadding(getResources().getDimensionPixelSize(2131168774), 0, AnonymousClass3Ma.A02(this, 2131168774), 0);
        WDSBanner wDSBanner = (WDSBanner) C18070vi.A05(this, 2131429232);
        this.A05 = wDSBanner;
        AnonymousClass4XT r2 = new AnonymousClass4XT();
        r2.A02 = new AnonymousClass4AB(new AnonymousClass4AG(2131233223));
        AnonymousClass4XT.A00(wDSBanner, r2, AnonymousClass4W6.A00(context, 2131890159));
        C90004dN.A00(wDSBanner, context, this, 18);
        wDSBanner.setOnDismissListener((C18090vk) new AnonymousClass5FR(this));
    }
}
