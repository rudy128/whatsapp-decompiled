package X;

import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4Bz  reason: invalid class name */
public final class AnonymousClass4Bz extends WDSButton implements AnonymousClass5ZD {
    public C32101gd A00;
    public C203411t A01;
    public AnonymousClass10I A02;
    public AnonymousClass00H A03;
    public boolean A04;

    public final void setCommunityMembersManager(C32101gd r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityNavigator(C203411t r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCommunityWamEventHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final C32101gd getCommunityMembersManager() {
        C32101gd r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityMembersManager");
        throw null;
    }

    public final C203411t getCommunityNavigator() {
        C203411t r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityNavigator");
        throw null;
    }

    public final AnonymousClass00H getCommunityWamEventHelper() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityWamEventHelper");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public List getCTAViews() {
        return C18070vi.A0M(this);
    }
}
