package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;

/* renamed from: X.3o1  reason: invalid class name and case insensitive filesystem */
public final class C76723o1 extends EphemeralMessagesInfoView {
    public AnonymousClass1KB A00;
    public AnonymousClass1M9 A01;
    public C106935Xt A02;
    public AnonymousClass3VF A03;
    public AnonymousClass10I A04;
    public boolean A05;
    public final AnonymousClass1FU A06;

    public C76723o1(Context context) {
        super(context, (AttributeSet) null);
        A04();
        this.A06 = AnonymousClass3MZ.A0P(context);
        C72473Md.A0y(this);
    }

    public final void setContactManager$app_product_community_community(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setGlobalUI$app_product_community_community(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setParticipantsViewModelFactory$app_product_community_community(C106935Xt r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers$app_product_community_community(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final AnonymousClass1FU getActivity() {
        return this.A06;
    }

    public final AnonymousClass1M9 getContactManager$app_product_community_community() {
        AnonymousClass1M9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI$app_product_community_community() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C106935Xt getParticipantsViewModelFactory$app_product_community_community() {
        C106935Xt r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("participantsViewModelFactory");
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
}
