package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.community.CommunityMembersViewModel;

/* renamed from: X.3RZ  reason: invalid class name */
public final class AnonymousClass3RZ extends RelativeLayout implements AnonymousClass009 {
    public AnonymousClass5X7 A00;
    public CommunityMembersViewModel A01;
    public AnonymousClass1EC A02;
    public AnonymousClass1EC A03;
    public AnonymousClass10I A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public final View A07;
    public final C18100vl A08;

    public final void setCommunityMembersViewModelFactory$app_product_community_community(AnonymousClass5X7 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWaWorkers$app_product_community_community(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A08.getValue();
    }

    public final AnonymousClass5X7 getCommunityMembersViewModelFactory$app_product_community_community() {
        AnonymousClass5X7 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityMembersViewModelFactory");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers$app_product_community_community() {
        AnonymousClass10I r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public AnonymousClass3RZ(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A00 = (AnonymousClass5X7) r1.A0z.A1W.get();
            this.A04 = AnonymousClass10E.AL1(r1.A10);
        }
        this.A08 = AnonymousClass1DF.A01(new C101825Ec(context));
        View inflate = View.inflate(context, 2131624134, this);
        C18070vi.A0X(inflate);
        this.A07 = inflate;
    }
}
