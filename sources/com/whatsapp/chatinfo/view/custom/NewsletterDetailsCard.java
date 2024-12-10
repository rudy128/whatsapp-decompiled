package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1FU;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C29691ci;
import X.C42141xh;
import X.C43421zm;
import X.C46162Dk;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C86454Rr;
import X.C89884dB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.biz.education.Hilt_VerifiedBusinessEducationBottomSheet;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.wds.components.actiontile.WDSActionTile;

public final class NewsletterDetailsCard extends ContactDetailsCard {
    public View A00;
    public View A01;
    public C19880zA A02;
    public AnonymousClass1CJ A03;
    public WDSActionTile A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public View A07;
    public View A08;
    public View A09;
    public C42141xh A0A;
    public AnonymousClass1E7 A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public static final void setSearchClickListener$lambda$0(NewsletterDetailsCard newsletterDetailsCard, View view) {
        C18070vi.A0d(newsletterDetailsCard, 0);
        AnonymousClass1L9 r4 = newsletterDetailsCard.A0E;
        Context context = newsletterDetailsCard.getContext();
        AnonymousClass1LU r2 = newsletterDetailsCard.A0R;
        Context context2 = newsletterDetailsCard.getContext();
        AnonymousClass1E7 r0 = newsletterDetailsCard.A0B;
        if (r0 == null) {
            C18070vi.A11("contact");
            throw null;
        } else {
            r4.A0B(context, AnonymousClass3MY.A06(context2, r2, AnonymousClass1E7.A00(r0)).putExtra("args_conversation_screen_entry_point", 1).putExtra("extra_show_search_on_create", true), "NewsletterInfoActivity");
        }
    }

    public static final void setupMVEducationIfNeeded$lambda$3(NewsletterDetailsCard newsletterDetailsCard, View view) {
        C18070vi.A0d(newsletterDetailsCard, 0);
        PhoneUserJid jid = newsletterDetailsCard.getJid();
        Hilt_VerifiedBusinessEducationBottomSheet hilt_VerifiedBusinessEducationBottomSheet = new Hilt_VerifiedBusinessEducationBottomSheet();
        C72463Mc.A11(C17880vN.A0D(), hilt_VerifiedBusinessEducationBottomSheet, jid, "biz_owner_jid");
        ((AnonymousClass1FU) C72453Mb.A0L(newsletterDetailsCard)).CMk(hilt_VerifiedBusinessEducationBottomSheet, (String) null);
    }

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r2 != true) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContact(X.AnonymousClass1E7 r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r4.A0B = r5
            X.2Dk r0 = r4.getNewsletter()
            if (r0 != 0) goto L_0x0014
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r4)
            r0.finish()
            return
        L_0x0014:
            X.1xh r1 = r4.A0A
            java.lang.String r0 = "titleViewController"
            if (r1 == 0) goto L_0x0065
            r1.A05(r5)
            X.1xh r3 = r4.A0A
            if (r3 == 0) goto L_0x0065
            X.2Dk r0 = r4.getNewsletter()
            if (r0 == 0) goto L_0x0033
            X.9IW r1 = r0.A05
            X.9IW r0 = X.AnonymousClass9IW.VERIFIED
            boolean r2 = X.AnonymousClass000.A1Z(r1, r0)
            r1 = 1
            r0 = 2
            if (r2 == r1) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3.A03(r0)
            X.2Dk r0 = r4.getNewsletter()
            if (r0 == 0) goto L_0x0061
            X.9IW r1 = r0.A05
            X.9IW r0 = X.AnonymousClass9IW.VERIFIED
            boolean r1 = X.AnonymousClass000.A1Z(r1, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0061
            X.0ve r2 = r4.A0P
            r1 = 5295(0x14af, float:7.42E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.TextEmojiLabel r2 = r4.A0I
            r1 = 39
            X.4dB r0 = new X.4dB
            r0.<init>(r4, r1)
        L_0x005d:
            r2.setOnClickListener(r0)
            return
        L_0x0061:
            com.whatsapp.TextEmojiLabel r2 = r4.A0I
            r0 = 0
            goto L_0x005d
        L_0x0065:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard.setContact(X.1E7):void");
    }

    public final void setFollowUnfollowButton(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        View view = this.A00;
        if (view == null) {
            C18070vi.A11("followUnfollowButton");
            throw null;
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void setForwardClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        View view = this.A08;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            View view2 = this.A08;
            if (view2 != null) {
                AnonymousClass3MW.A1Q(view2);
                return;
            }
        }
        C18070vi.A11("forwardButton");
        throw null;
    }

    public final void setNewsletterSuspensionUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setShareClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        View view = this.A09;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            View view2 = this.A09;
            if (view2 != null) {
                AnonymousClass3MW.A1Q(view2);
                return;
            }
        }
        C18070vi.A11("shareButton");
        throw null;
    }

    public final void setWamoSubIntegrationInterface(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setupActionButtons(C46162Dk r4) {
        String str;
        C18070vi.A0d(r4, 0);
        int i = 8;
        if (r4.A0A || ((C86454Rr) getNewsletterSuspensionUtils().get()).A00(r4)) {
            View view = this.A07;
            if (view == null) {
                str = "actionsSection";
            } else {
                view.setVisibility(8);
                return;
            }
        } else {
            View view2 = this.A00;
            if (view2 == null) {
                str = "followUnfollowButton";
            } else {
                if (!r4.A0P()) {
                    i = 0;
                }
                view2.setVisibility(i);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    private final PhoneUserJid getJid() {
        PhoneUserJid A012 = AnonymousClass11S.A01(this.A0H);
        C18070vi.A0X(A012);
        return A012;
    }

    public final void A05() {
        View view = this.A00;
        if (view == null) {
            C18070vi.A11("followUnfollowButton");
            throw null;
        }
        view.setVisibility(0);
        AnonymousClass3MY.A0w(view.getContext(), view, 2131890498);
        C72473Md.A1G(view, 2131231806, 2131890498);
        AnonymousClass3MW.A1Q(view);
        AnonymousClass1Y5.A02(view, 2131897305);
    }

    public final void A06() {
        View view = this.A00;
        if (view == null) {
            C18070vi.A11("followUnfollowButton");
            throw null;
        }
        view.setVisibility(0);
        AnonymousClass3MY.A0w(view.getContext(), view, 2131890489);
        C72473Md.A1G(view, 2131231657, 2131890489);
        AnonymousClass3MW.A1Q(view);
        AnonymousClass1Y5.A02(view, 2131890489);
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass00H getNewsletterSuspensionUtils() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterSuspensionUtils");
        throw null;
    }

    public final C19880zA getWamoSubIntegrationInterface() {
        C19880zA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("wamoSubIntegrationInterface");
        throw null;
    }

    private final C46162Dk getNewsletter() {
        AnonymousClass1CJ chatsCache = getChatsCache();
        AnonymousClass1E7 r0 = this.A0B;
        if (r0 == null) {
            C18070vi.A11("contact");
            throw null;
        }
        C29691ci A0A2 = chatsCache.A0A(r0.A0J);
        if (A0A2 instanceof C46162Dk) {
            return (C46162Dk) A0A2;
        }
        return null;
    }

    public void onFinishInflate() {
        int i;
        super.onFinishInflate();
        this.A00 = C18070vi.A05(this, 2131427495);
        this.A08 = C18070vi.A05(this, 2131427496);
        this.A09 = C18070vi.A05(this, 2131427524);
        View A052 = C18070vi.A05(this, 2131427519);
        this.A01 = A052;
        if (C18020vd.A05(C18040vf.A02, this.A0P, 11266)) {
            View view = this.A01;
            if (view == null) {
                C18070vi.A11("searchButton");
                throw null;
            } else {
                C89884dB.A00(view, this, 40);
                i = 0;
            }
        } else {
            i = 8;
        }
        A052.setVisibility(i);
        this.A07 = C18070vi.A05(this, 2131432999);
        this.A04 = (WDSActionTile) C18070vi.A05(this, 2131427544);
        C42141xh BGE = this.A0J.BGE(getContext(), this.A0I);
        this.A0A = BGE;
        C43421zm.A04(BGE.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A02();
        this.A0m = false;
        this.A0k = false;
        this.A0l = false;
        this.A0n = false;
    }

    public /* synthetic */ NewsletterDetailsCard(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
