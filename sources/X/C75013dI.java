package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;

/* renamed from: X.3dI  reason: invalid class name and case insensitive filesystem */
public final class C75013dI extends ListItemWithLeftIcon {
    public C107235Yx A00;
    public AnonymousClass4XY A01;
    public C106935Xt A02;
    public boolean A03;
    public final AnonymousClass1FU A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5F7(this));

    public C75013dI(Context context) {
        super(context, (AttributeSet) null);
        A04();
        this.A04 = AnonymousClass3MZ.A0P(context);
        setIcon(2131231786);
        C74793cj.A01(context, this, 2131888157);
        setDescription(2131888163);
        C72473Md.A0y(this);
    }

    public final void setChatLockInfoViewUpdateHelperFactory$app_product_community_community(C107235Yx r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setParticipantsViewModelFactory$app_product_community_community(C106935Xt r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final CAGInfoChatLockViewModel getCagInfoChatLockViewModel() {
        return (CAGInfoChatLockViewModel) this.A05.getValue();
    }

    public final AnonymousClass1FU getActivity() {
        return this.A04;
    }

    public final C107235Yx getChatLockInfoViewUpdateHelperFactory$app_product_community_community() {
        C107235Yx r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatLockInfoViewUpdateHelperFactory");
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

    public final void A0A(AnonymousClass1EC r7) {
        C107235Yx chatLockInfoViewUpdateHelperFactory$app_product_community_community = getChatLockInfoViewUpdateHelperFactory$app_product_community_community();
        AnonymousClass1FU r4 = this.A04;
        AnonymousClass4XY BH1 = chatLockInfoViewUpdateHelperFactory$app_product_community_community.BH1(r4, this, r7);
        this.A01 = BH1;
        BH1.A01();
        C18110vm A012 = AnonymousClass1DF.A01(new C104085Mu(this, r7));
        CAGInfoChatLockViewModel cagInfoChatLockViewModel = getCagInfoChatLockViewModel();
        AnonymousClass3VF r2 = (AnonymousClass3VF) A012.getValue();
        C18070vi.A0d(r2, 1);
        cagInfoChatLockViewModel.A01 = r7;
        cagInfoChatLockViewModel.A00 = r2;
        cagInfoChatLockViewModel.A03.registerObserver(cagInfoChatLockViewModel.A04.getValue());
        AnonymousClass3MZ.A1R(r2.A07, cagInfoChatLockViewModel.A02, new AnonymousClass5RW(cagInfoChatLockViewModel), 39);
        AnonymousClass3MY.A1K(r4, getCagInfoChatLockViewModel().A02, new AnonymousClass5RX(this), 40);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CAGInfoChatLockViewModel cagInfoChatLockViewModel = getCagInfoChatLockViewModel();
        AnonymousClass3VF r0 = cagInfoChatLockViewModel.A00;
        if (r0 != null) {
            cagInfoChatLockViewModel.A02.A0G(r0.A07);
        }
        AnonymousClass3MY.A1R(cagInfoChatLockViewModel.A03, cagInfoChatLockViewModel.A04);
    }
}
