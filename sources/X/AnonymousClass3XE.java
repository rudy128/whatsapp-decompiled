package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.info.views.EncryptionInfoView;
import com.whatsapp.info.views.NotificationsAndSoundsInfoView;
import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;
import com.whatsapp.info.views.StarredMessageInfoView;
import com.whatsapp.ui.media.MediaCard;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3XE  reason: invalid class name */
public final class AnonymousClass3XE extends C38391rD {
    public final List A00 = new CopyOnWriteArrayList();
    public final AnonymousClass02n A01;
    public final C81723zh A02;
    public final AnonymousClass1EC A03;
    public final AnonymousClass1EC A04;

    public void Bmc(C42011xT r8, int i) {
        String str;
        AnonymousClass1FU r5;
        AnonymousClass1DS r2;
        Object obj;
        int i2;
        String str2;
        View view;
        View.OnClickListener r3;
        AnonymousClass1FU r32;
        int i3;
        AnonymousClass1DS r1;
        Object r0;
        C18070vi.A0d(r8, 0);
        if (r8 instanceof AnonymousClass3Y7) {
            AnonymousClass1EC r33 = this.A03;
            ((AnonymousClass3Y7) r8).A00.A0A(this.A02, r33, false);
            return;
        }
        if (r8 instanceof AnonymousClass3YE) {
            AnonymousClass1EC r4 = this.A03;
            AnonymousClass1EC r34 = this.A04;
            C819941o r22 = ((AnonymousClass3YE) r8).A00;
            r22.A0A(r4, r34);
            r22.A00 = new C96304nd(r34, r4, r22, 0);
            C27141Uw A0e = AnonymousClass3MW.A0e(r22.getGroupDataObservers$app_product_community_community());
            AnonymousClass3L6 r02 = r22.A00;
            if (r02 == null) {
                str2 = "groupDataObserver";
            } else {
                A0e.A00(r02);
                return;
            }
        } else if (r8 instanceof AnonymousClass3Y6) {
            AnonymousClass1EC r12 = this.A03;
            C819741j r03 = ((AnonymousClass3Y6) r8).A00;
            r03.A00 = r12;
            r03.A0A(r12);
            return;
        } else if (r8 instanceof AnonymousClass3Y5) {
            ((AnonymousClass3Y5) r8).A00.A0A(this.A03);
            return;
        } else {
            if (r8 instanceof AnonymousClass3YH) {
                AnonymousClass1EC r42 = this.A03;
                C81723zh r35 = this.A02;
                C820041q r23 = ((AnonymousClass3YH) r8).A00;
                r23.setupOnClickListener(new AnonymousClass48j(r35, r23, r42, 10));
                r32 = r23.A00;
                C76803oS r04 = (C76803oS) C91774gE.A00(r32, r23.getGroupChatInfoViewModelFactory$app_product_community_community(), r42, 13).A00(C76803oS.class);
                r23.A01 = r04;
                str = "groupChatInfoViewModel";
                if (r04 != null) {
                    i3 = 46;
                    AnonymousClass3MY.A1K(r32, r04.A00, new C105205Rc(r23), 46);
                    C76803oS r05 = r23.A01;
                    if (r05 != null) {
                        r1 = r05.A07;
                        r0 = new C105215Rd(r23);
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            if (r8 instanceof AnonymousClass3Y8) {
                AnonymousClass1EC r6 = this.A03;
                C81723zh r43 = this.A02;
                C76723o1 r36 = ((AnonymousClass3Y8) r8).A00;
                AnonymousClass1FU r52 = r36.A06;
                AnonymousClass3VF r06 = (AnonymousClass3VF) C91784gF.A00(r52, r6, r36.getParticipantsViewModelFactory$app_product_community_community(), r52.A00, 4).A00(AnonymousClass3VF.class);
                r36.A03 = r06;
                if (r06 == null) {
                    str2 = "participantsViewModel";
                } else {
                    r2 = r06.A07;
                    obj = new AnonymousClass5VL(r36, r43, r6);
                    i2 = 42;
                    r5 = r52;
                }
            } else if (r8 instanceof AnonymousClass3YA) {
                AnonymousClass1EC r53 = this.A03;
                AnonymousClass3PT r24 = ((AnonymousClass3YA) r8).A00;
                r32 = r24.A06;
                C18070vi.A0z(r32, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                r24.A01 = r24.getMediaCardUpdateHelperFactory$app_product_community_community().BGv((AnonymousClass1FY) r32, r53, (MediaCard) AnonymousClass3MX.A0D(r24.A07));
                C76803oS r07 = (C76803oS) C91774gE.A00(r32, r24.getGroupChatInfoViewModelFactory$app_product_community_community(), r53, 13).A00(C76803oS.class);
                r24.A03 = r07;
                str = "groupChatInfoViewModel";
                if (r07 != null) {
                    i3 = 44;
                    AnonymousClass3MY.A1K(r32, r07.A00, new C105185Ra(r24), 44);
                    C76803oS r08 = r24.A03;
                    if (r08 != null) {
                        AnonymousClass3MY.A1K(r32, r08.A05, AnonymousClass3MW.A16(r24, 20), 44);
                        C76803oS r09 = r24.A03;
                        if (r09 != null) {
                            r1 = r09.A04;
                            r0 = new C105195Rb(r24);
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            } else if (r8 instanceof AnonymousClass3YB) {
                AnonymousClass1EC r44 = this.A03;
                C74993dF r37 = ((AnonymousClass3YB) r8).A00;
                C107255Yz mediaVisibilityInfoUpdateHelperFactory$app_product_community_community = r37.getMediaVisibilityInfoUpdateHelperFactory$app_product_community_community();
                AnonymousClass1FY r54 = r37.A04;
                r37.A01 = mediaVisibilityInfoUpdateHelperFactory$app_product_community_community.BH4(r37, r54, r44);
                r37.setOnClickListener(new C89894dC(r37, 25));
                r2 = ((CAGInfoChatLockViewModel) AnonymousClass3MW.A0N(r54).A00(CAGInfoChatLockViewModel.class)).A02;
                obj = new C106075Ul(r37, r44);
                i2 = 45;
                r5 = r54;
            } else if (r8 instanceof AnonymousClass3YC) {
                AnonymousClass1EC r55 = this.A03;
                C81723zh r010 = this.A02;
                C75003dG r45 = ((AnonymousClass3YC) r8).A00;
                r45.A06 = r55;
                r45.A05 = r010;
                AnonymousClass4RZ BGm = r45.getMuteNotificationsInfoViewUpdateHelperFactory$app_product_community_community().BGm(AnonymousClass3MY.A04(r45), r45.A0A, r45, r55, new AnonymousClass5Af(r45, 15));
                r45.A02 = BGm;
                BGm.A00();
                r45.A03 = new C95434mE(r45, r55, 0);
                AnonymousClass1NN conversationObservers$app_product_community_community = r45.getConversationObservers$app_product_community_community();
                C25231Nk r011 = r45.A03;
                if (r011 == null) {
                    str2 = "conversationObserver";
                } else {
                    conversationObservers$app_product_community_community.registerObserver(r011);
                    return;
                }
            } else {
                if (r8 instanceof AnonymousClass3YF) {
                    AnonymousClass1EC r25 = this.A03;
                    C81723zh r012 = this.A02;
                    AnonymousClass3PU r13 = ((AnonymousClass3YF) r8).A00;
                    r13.A03 = r25;
                    r13.A02 = r012;
                    view = r13.A06;
                    r3 = new AnonymousClass48m(r13, 12);
                } else if (r8 instanceof AnonymousClass3YD) {
                    AnonymousClass1EC r26 = this.A03;
                    AnonymousClass02n r14 = this.A01;
                    view = ((AnonymousClass3YD) r8).A00;
                    if (r14 != null) {
                        r3 = new AnonymousClass48j(r14, view, r26, 9);
                    } else {
                        view.setVisibility(8);
                        return;
                    }
                } else if (r8 instanceof AnonymousClass3Y9) {
                    AnonymousClass1EC r56 = this.A03;
                    AnonymousClass3PS r46 = ((AnonymousClass3Y9) r8).A00;
                    AnonymousClass1FU r38 = r46.A04;
                    C76803oS r013 = (C76803oS) C91774gE.A00(r38, r46.getGroupChatInfoViewModelFactory$app_product_community_community(), r56, 13).A00(C76803oS.class);
                    r46.A01 = r013;
                    if (r013 == null) {
                        str2 = "groupChatInfoViewModel";
                    } else {
                        AnonymousClass3MY.A1K(r38, r013.A01, new AnonymousClass5RZ(r46), 43);
                        r46.A05.setTitleRowClickListener(r56);
                        return;
                    }
                } else {
                    return;
                }
                view.setOnClickListener(r3);
                return;
            }
            AnonymousClass3MY.A1K(r5, r2, obj, i2);
            return;
            AnonymousClass3MY.A1K(r32, r1, r0, i3);
            return;
        }
        C18070vi.A11(str2);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.FrameLayout, android.view.View, X.3PI, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.3Qa, X.41l, com.whatsapp.info.views.NotificationsAndSoundsInfoView, android.view.View, X.3cj] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.3Qa, X.41q, android.view.View, com.whatsapp.info.views.StarredMessageInfoView] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.3Qa, com.whatsapp.info.views.CustomNotificationsInfoView, android.view.View, X.41j] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.3Qa, X.41o, com.whatsapp.info.views.PhoneNumberPrivacyInfoView] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.3PP, android.widget.FrameLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r2;
        C18070vi.A0d(viewGroup, 0);
        switch (i) {
            case 1:
                r2 = new AnonymousClass3Y7(new EncryptionInfoView(AnonymousClass3MY.A05(viewGroup), (AttributeSet) null));
                break;
            case 2:
                ? phoneNumberPrivacyInfoView = new PhoneNumberPrivacyInfoView(AnonymousClass3MY.A05(viewGroup), (AttributeSet) null);
                phoneNumberPrivacyInfoView.A04();
                r2 = new AnonymousClass3YE(phoneNumberPrivacyInfoView);
                break;
            case 3:
                ? customNotificationsInfoView = new CustomNotificationsInfoView(AnonymousClass3MY.A05(viewGroup), (AttributeSet) null);
                customNotificationsInfoView.A04();
                C72473Md.A0y(customNotificationsInfoView);
                AnonymousClass1FU r3 = customNotificationsInfoView.A01;
                AnonymousClass3MY.A1K(r3, ((AnonymousClass3TH) AnonymousClass3MW.A0N(r3).A00(AnonymousClass3TH.class)).A00, new AnonymousClass5RY(customNotificationsInfoView), 41);
                r2 = new AnonymousClass3Y6(customNotificationsInfoView);
                break;
            case 4:
                r2 = new AnonymousClass3Y5(new C75013dI(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 5:
                ? starredMessageInfoView = new StarredMessageInfoView(AnonymousClass3MY.A05(viewGroup), (AttributeSet) null);
                starredMessageInfoView.A04();
                C72473Md.A0y(starredMessageInfoView);
                r2 = new AnonymousClass3YH(starredMessageInfoView);
                break;
            case 6:
                r2 = new AnonymousClass3Y8(new C76723o1(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 7:
                r2 = new AnonymousClass3YA(new AnonymousClass3PT(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 8:
                r2 = new AnonymousClass3YB(new C74993dF(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 9:
                r2 = new AnonymousClass3YC(new C75003dG(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 10:
            case 11:
            case 12:
            case 16:
                Context A05 = AnonymousClass3MY.A05(viewGroup);
                ? frameLayout = new FrameLayout(A05);
                if (!frameLayout.A01) {
                    frameLayout.A01 = true;
                    frameLayout.generatedComponent();
                }
                View.inflate(A05, 2131624573, frameLayout);
                return new C42011xT(frameLayout);
            case 13:
                r2 = new AnonymousClass3YF(new AnonymousClass3PU(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 14:
                ? notificationsAndSoundsInfoView = new NotificationsAndSoundsInfoView(AnonymousClass3MY.A05(viewGroup), (AttributeSet) null);
                notificationsAndSoundsInfoView.A04();
                C72473Md.A0y(notificationsAndSoundsInfoView);
                notificationsAndSoundsInfoView.A05(2131232143, false);
                r2 = new AnonymousClass3YD(notificationsAndSoundsInfoView);
                break;
            case 15:
                r2 = new AnonymousClass3Y9(new AnonymousClass3PS(AnonymousClass3MY.A05(viewGroup)));
                break;
            case 17:
                List list = C42011xT.A0I;
                View A0R = C72453Mb.A0R(viewGroup);
                A0R.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
                r2 = new AnonymousClass3YG(A0R);
                break;
            default:
                Context A052 = AnonymousClass3MY.A05(viewGroup);
                ? frameLayout2 = new FrameLayout(A052);
                if (!frameLayout2.A06) {
                    frameLayout2.A06 = true;
                    AnonymousClass10E A0O = AnonymousClass3MW.A0O(frameLayout2.generatedComponent());
                    frameLayout2.A02 = AnonymousClass10E.A8r(A0O);
                    frameLayout2.A00 = AnonymousClass3MZ.A0N(A0O);
                    frameLayout2.A03 = AnonymousClass3Ma.A0t(A0O);
                    frameLayout2.A04 = AnonymousClass3MY.A0e(A0O.A00);
                    frameLayout2.A01 = AnonymousClass3Ma.A0a(A0O);
                }
                TextView A0W = C72453Mb.A0W(View.inflate(A052, 2131624406, frameLayout2), 2131428636);
                C36401np linkifier$app_product_community_community = frameLayout2.getLinkifier$app_product_community_community();
                A0W.setText(AnonymousClass3MY.A0A(A0W.getContext(), linkifier$app_product_community_community, new C98764rg((Object) frameLayout2, 9), C17880vN.A0q(A052, "learn-more", new Object[1], 0, 2131887605), "learn-more"));
                Rect rect = C39401t1.A0A;
                AnonymousClass3MZ.A1Q(A0W, frameLayout2.getSystemServices());
                AnonymousClass3Ma.A1I(A0W, frameLayout2.getAbProps$app_product_community_community());
                r2 = new C42011xT(frameLayout2);
                break;
        }
        int dimensionPixelOffset = AnonymousClass000.A0Y(viewGroup).getDimensionPixelOffset(2131167077);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        r2.A0H.setLayoutParams(marginLayoutParams);
        return r2;
    }

    public long A0M(int i) {
        return (long) ((C86614Si) this.A00.get(i)).A00;
    }

    public int A0Q() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        return ((C86614Si) this.A00.get(i)).A00;
    }

    public AnonymousClass3XE(AnonymousClass02n r2, C81723zh r3, AnonymousClass1EC r4, AnonymousClass1EC r5) {
        C72473Md.A1I(r4, r3);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
    }
}
