package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3tz  reason: invalid class name and case insensitive filesystem */
public class C78953tz extends C78533sx {
    public C19880zA A00;
    public C19880zA A01;
    public AnonymousClass1LA A02;
    public C30801eX A03;
    public C106905Xq A04;
    public AnonymousClass4ZS A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public String A08 = "";
    public boolean A09;
    public boolean A0A;
    public boolean A0B = C22971Dz.A0S(C79103uS.A1D(this));
    public final ShimmerFrameLayout A0C;
    public final TextEmojiLabel A0D;
    public final AnonymousClass4VE A0E;
    public final AnonymousClass3UR A0F;
    public final WDSButton A0G;
    public final WDSButton A0H;
    public final AnonymousClass00H A0I = C217517g.A00(49437);
    public final ViewStub A0J;
    public final WDSButton A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78953tz(Context context, C108875cR r14, AnonymousClass4VE r15, C436420i r16) {
        super(context, r14, r16);
        C18070vi.A0d(context, 1);
        A1M();
        this.A0E = r15;
        C106905Xq fmxViewModelFactory = getFmxViewModelFactory();
        AnonymousClass1BI r10 = this.A0B;
        AnonymousClass1E7 r8 = this.A03;
        C27701Xd r0 = ((C96084nH) fmxViewModelFactory).A00;
        AnonymousClass10E r2 = r0.A00;
        AnonymousClass3UR r5 = new AnonymousClass3UR((AnonymousClass4KO) r0.A01.A05.get(), (AnonymousClass1N4) r2.A8a.get(), r8, AnonymousClass10E.A8r(r2), r10, AnonymousClass10E.AL1(r2));
        this.A0F = r5;
        AnonymousClass1DS r22 = r5.A01;
        AnonymousClass1FY r3 = this.A08;
        C91644g1.A00(r3, r22, new C105405Rw(this), 8);
        C91644g1.A00(r3, r5.A00, new C105415Rx(this), 8);
        WDSButton wDSButton = (WDSButton) AnonymousClass3MX.A0C(this, 2131427579);
        this.A0K = wDSButton;
        this.A0G = (WDSButton) AnonymousClass3MX.A0C(this, 2131428205);
        WDSButton wDSButton2 = (WDSButton) AnonymousClass3MX.A0C(this, 2131434777);
        this.A0H = wDSButton2;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) AnonymousClass3MX.A0C(this, 2131435408);
        this.A0C = shimmerFrameLayout;
        View A062 = AnonymousClass1HF.A06(this, 2131435447);
        C18070vi.A0z(A062, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A062;
        this.A0D = textEmojiLabel;
        this.A0J = (ViewStub) AnonymousClass3MX.A0C(this, 2131431462);
        if (r15.A04) {
            wDSButton2.setIcon(2131233405);
            wDSButton2.setSize(AnonymousClass4D1.SMALL);
            wDSButton.setText(2131890460);
        }
        shimmerFrameLayout.A03();
        textEmojiLabel.setVisibility(8);
        this.A09.setText("");
        C89904dD.A00(this.A06, this, 40);
        A2o();
    }

    public final void setBenefitsAccessManager(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setCountryPhoneInfo(AnonymousClass1LA r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setEntrypointConversionManager(C30801eX r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setFmxChatAttributionViewUtil(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setFmxViewModelFactory(C106905Xq r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setIntegratorManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setInteropImageLoader(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setLargeNumberFormatterUtil(AnonymousClass4ZS r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setTrustSignals(String str) {
        C18070vi.A0d(str, 0);
        this.A08 = str;
    }

    public static final void A05(C78953tz r3, Integer num, int i) {
        r3.A0E.A02(r3.A0F, num, i, 0);
    }

    public static final void setupChatAttributionView$lambda$6$lambda$5(C106495Wb r0, C78953tz r1, View view) {
        throw AnonymousClass000.A0s("getChatAttributionBottomSheet");
    }

    public C23581Gv A2m() {
        return new C78523sw(this);
    }

    public final void A2o() {
        C60082nM A022;
        C27641Ww.A05(this, this.A0D, 0, 0);
        boolean z = this.A0B;
        AnonymousClass3UR r4 = this.A0F;
        AnonymousClass4KO r1 = r4.A04;
        AnonymousClass1E7 r13 = r4.A06;
        C99244sV A002 = C99244sV.A00(r4, 29);
        AnonymousClass10E r12 = r1.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r12);
        AnonymousClass48s r7 = new AnonymousClass48s(AnonymousClass10E.A17(r12), (C26911Ty) r12.A1J.get(), (A1E) r12.A0t.get(), (C184019aH) r12.A0u.get(), AnonymousClass3MZ.A0g(r12), r13, A8r, (AnonymousClass1UL) r12.A4x.get(), A002);
        AnonymousClass10I r6 = r4.A09;
        AnonymousClass3MW.A1T(r7, r6, 0);
        r6.CGF(new C146747Ql(r4, 35));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131169505);
        this.A0A.A0A(this.A0C, this.A03, dimensionPixelSize);
        if (z) {
            AnonymousClass3MW.A1T(new C826849i((Object) this, 0), this.A1X, 0);
        }
        A2q();
        Boolean bool = (Boolean) r4.A00.A06();
        if (bool == null) {
            bool = false;
        }
        A2s(bool.booleanValue());
        C18030ve r14 = this.A0F;
        C18040vf r3 = C18040vf.A02;
        if (!C18020vd.A05(r3, r14, 6140)) {
            return;
        }
        if (C18020vd.A05(r3, this.A0F, 11420)) {
            C98784ri.A00(this.A1X, this, 8);
            return;
        }
        UserJid A1D = C79103uS.A1D(this);
        if (A1D != null && (A022 = getEntrypointConversionManager().A02(A1D)) != null && "business_search".equals(A022.A08) && getFmxChatAttributionViewUtil().A07()) {
            getFmxChatAttributionViewUtil().A03();
            throw AnonymousClass000.A0s("getAttributionTextLayoutId");
        }
    }

    public void A2q() {
        C42141xh r2 = this.A07;
        r2.A05(this.A03);
        this.A06.setContentDescription(r2.A01.getText());
        if (this.A0B) {
            UserJid A1D = C79103uS.A1D(this);
            C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            String A002 = ((C34651kr) getIntegratorManager().get()).A00((AnonymousClass1ED) A1D);
            if (A002 == null || A002.length() == 0) {
                Log.w("ConversationRowFX/updateInteropContactName no display name");
            } else {
                this.A09.setText(A002);
            }
        }
        if (this.A03.A0A()) {
            A2p(50);
        }
    }

    public final void A2r() {
        Jid A0m = C72453Mb.A0m(this.A03);
        C18070vi.A0X(A0m);
        AnonymousClass1FY r3 = this.A08;
        r3.startActivity(AnonymousClass1LU.A1D(r3, (UserJid) A0m, C17880vN.A0i(), true, false), (Bundle) null);
    }

    public void A2s(boolean z) {
        WDSButton wDSButton;
        int i;
        if (this.A0B) {
            this.A0K.setVisibility(8);
            UserJid A1D = C79103uS.A1D(this);
            C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            C18070vi.A0d(A1D, 0);
            boolean contains = ((C132786na) this.A22.get()).A02.contains(A1D);
            wDSButton = this.A0G;
            if (contains) {
                wDSButton.setVisibility(8);
            } else {
                wDSButton.setVisibility(0);
                wDSButton.setAction(AnonymousClass4DG.DESTRUCTIVE);
                i = 41;
                C89904dD.A00(wDSButton, this, i);
            }
        } else {
            if (AnonymousClass3MW.A0V(this.A1g).A0P(C79103uS.A1D(this))) {
                this.A0G.setVisibility(8);
            } else {
                WDSButton wDSButton2 = this.A0G;
                wDSButton2.setVisibility(0);
                wDSButton2.setAction(AnonymousClass4DG.DESTRUCTIVE);
                C89904dD.A00(wDSButton2, this, 36);
                if (z) {
                    wDSButton = this.A0K;
                    wDSButton.setVisibility(0);
                    wDSButton.setIcon(2131232337);
                    wDSButton.setText(2131895992);
                    i = 37;
                } else if (!this.A0U.A0N()) {
                    wDSButton = this.A0K;
                    wDSButton.setVisibility(0);
                    i = 38;
                }
                C89904dD.A00(wDSButton, this, i);
            }
            this.A0K.setVisibility(8);
        }
        C89904dD.A00(this.A0H, this, 39);
    }

    public final WDSButton getAddBtn() {
        return this.A0K;
    }

    public final AnonymousClass00H getAddFmxContactObservable() {
        return this.A0I;
    }

    public final C19880zA getBenefitsAccessManager() {
        C19880zA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("benefitsAccessManager");
        throw null;
    }

    public final WDSButton getBlockBtn() {
        return this.A0G;
    }

    public final ViewStub getChatAttributionHintViewStub() {
        return this.A0J;
    }

    public final AnonymousClass1LA getCountryPhoneInfo() {
        AnonymousClass1LA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("countryPhoneInfo");
        throw null;
    }

    public final C30801eX getEntrypointConversionManager() {
        C30801eX r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("entrypointConversionManager");
        throw null;
    }

    public final C19880zA getFmxChatAttributionViewUtil() {
        C19880zA r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fmxChatAttributionViewUtil");
        throw null;
    }

    public final AnonymousClass4VE getFmxManager() {
        return this.A0E;
    }

    public final C106905Xq getFmxViewModelFactory() {
        C106905Xq r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fmxViewModelFactory");
        throw null;
    }

    public final AnonymousClass00H getIntegratorManager() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("integratorManager");
        throw null;
    }

    public final AnonymousClass00H getInteropImageLoader() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("interopImageLoader");
        throw null;
    }

    public final AnonymousClass4ZS getLargeNumberFormatterUtil() {
        AnonymousClass4ZS r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("largeNumberFormatterUtil");
        throw null;
    }

    public final WDSButton getSafetyTipsBtn() {
        return this.A0H;
    }

    public final ShimmerFrameLayout getShimmerLayout() {
        return this.A0C;
    }

    public final TextEmojiLabel getSignals() {
        return this.A0D;
    }

    public final String getTrustSignals() {
        return this.A08;
    }

    public final AnonymousClass3UR getViewModel() {
        return this.A0F;
    }

    public final void setCardViewLogged(boolean z) {
        this.A0A = z;
    }

    public final void setContactAdded(boolean z) {
        this.A09 = z;
    }

    public int getLayout() {
        return 2131624828;
    }
}
