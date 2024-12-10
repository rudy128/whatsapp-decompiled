package com.whatsapp.safetycheck.ui;

import X.AFS;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MW;
import X.AnonymousClass1NI;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CG;
import X.AnonymousClass4DG;
import X.AnonymousClass7AS;
import X.AnonymousClass7S8;
import X.AnonymousClass7SB;
import X.C108995ce;
import X.C111105iK;
import X.C111975kj;
import X.C122556Qv;
import X.C124946aF;
import X.C135496sI;
import X.C146767Qn;
import X.C146777Qo;
import X.C147967gg;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C24921Me;
import X.C27201Vd;
import X.C27881Xz;
import X.C34511kb;
import X.C34591kk;
import X.C36531o3;
import X.C38541rS;
import X.C39351sv;
import X.C42941yz;
import X.C43531zx;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.conversation.carousel.CarouselView;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhoto;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.List;

public final class SafetyCheckBottomSheet extends Hilt_SafetyCheckBottomSheet {
    public C124946aF A00;
    public C34511kb A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C27201Vd A04;
    public C36531o3 A05;
    public AnonymousClass11P A06;
    public C18000vb A07;
    public AnonymousClass1CJ A08;
    public C34591kk A09;
    public C18030ve A0A;
    public AnonymousClass1LU A0B;
    public AnonymousClass1EC A0C;
    public C111105iK A0D;
    public C38541rS A0E;
    public AnonymousClass10I A0F;

    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass1M9 r0 = this.A02;
        if (r0 != null) {
            AnonymousClass1EC r1 = this.A0C;
            if (r1 != null) {
                AnonymousClass1E7 A0A2 = r0.A03.A0A(r1);
                WDSTextLayout wDSTextLayout = (WDSTextLayout) view.findViewById(2131434774);
                if (A0A2 != null) {
                    C18070vi.A0b(wDSTextLayout);
                    A01(A0A2, this, wDSTextLayout);
                }
                C111105iK r02 = this.A0D;
                if (r02 != null) {
                    AnonymousClass7AS.A00(this, r02.A01, new AnonymousClass7S8(wDSTextLayout, this, 8), 14);
                    GroupPhoto groupPhoto = (GroupPhoto) view.findViewById(2131434776);
                    C27201Vd r5 = this.A04;
                    if (r5 != null) {
                        groupPhoto.A06(A0A2, r5.A06(A14(), "safety-check-bottom-sheet"));
                        C18070vi.A0b(wDSTextLayout);
                        View A092 = AnonymousClass3MX.A09(A16(), wDSTextLayout, 2131626763);
                        ((ShimmerFrameLayout) A092.findViewById(2131435414)).A03();
                        CarouselView carouselView = (CarouselView) A092.findViewById(2131434775);
                        C135496sI[] r10 = new C135496sI[4];
                        r10[0] = A00(new C146767Qn(this, 48), 2131233343, 2131899562, 2131899561);
                        r10[1] = A00(new C146767Qn(this, 49), 2131232065, 2131899566, 2131899565);
                        r10[2] = A00(new C146777Qo((Object) this, 0), 2131232094, 2131899568, 2131899567);
                        List A0O = C18070vi.A0O(A00(new C146777Qo((Object) this, 1), 2131232042, 2131899564, 2131899563), r10, 3);
                        carouselView.A14();
                        carouselView.setAdapter(new C111975kj(this, A0O));
                        wDSTextLayout.setContent(new AnonymousClass4CG(A092));
                        C111105iK r03 = this.A0D;
                        if (r03 != null) {
                            AnonymousClass7AS.A00(this, r03.A02, AnonymousClass7SB.A00(this, 48), 14);
                            C111105iK r3 = this.A0D;
                            if (r3 != null) {
                                AnonymousClass3MZ.A1U(r3.A08, r3, 2);
                                View findViewById = view.findViewById(2131430949);
                                C18070vi.A0b(findViewById);
                                int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169533);
                                ViewGroup.MarginLayoutParams A0L = C108995ce.A0L(findViewById);
                                if (A0L != null) {
                                    i = A0L.topMargin;
                                } else {
                                    i = 0;
                                }
                                C39351sv r32 = new C39351sv(dimensionPixelSize, i, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169533), C108995ce.A02(findViewById));
                                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                                if (layoutParams != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    marginLayoutParams.setMarginStart(r32.A01);
                                    marginLayoutParams.topMargin = r32.A03;
                                    marginLayoutParams.setMarginEnd(r32.A02);
                                    marginLayoutParams.bottomMargin = r32.A00;
                                    findViewById.setLayoutParams(marginLayoutParams);
                                    WDSButtonGroup wDSButtonGroup = (WDSButtonGroup) view.findViewById(2131428603);
                                    wDSButtonGroup.setOrientationMode(C122556Qv.AUTO);
                                    WDSButton A0r = AnonymousClass3MW.A0r(wDSButtonGroup, 2131434059);
                                    C27881Xz r12 = C27881Xz.OUTLINE;
                                    A0r.setVariant(r12);
                                    A0r.setAction(AnonymousClass4DG.DESTRUCTIVE);
                                    WDSButton A0r2 = AnonymousClass3MW.A0r(wDSButtonGroup, 2131435001);
                                    A0r2.setVariant(r12);
                                    A0r.setIcon(2131231896);
                                    AnonymousClass1CJ r13 = this.A08;
                                    if (r13 != null) {
                                        AnonymousClass1EC r04 = this.A0C;
                                        if (r04 != null) {
                                            boolean A0R = r13.A0R(r04);
                                            Context A14 = A14();
                                            int i2 = 2131890194;
                                            if (A0R) {
                                                i2 = 2131890178;
                                            }
                                            wDSTextLayout.setPrimaryButtonText(A14.getString(i2));
                                            wDSTextLayout.setPrimaryButtonClickListener(new AFS(this, 46));
                                            wDSTextLayout.setSecondaryButtonText(A14().getString(2131899355));
                                            A0r2.setIcon(2131231627);
                                            wDSTextLayout.setSecondaryButtonClickListener(new AFS(this, 47));
                                            C43531zx.A06(new C147967gg(this, 8), C18070vi.A05(view, 2131430489));
                                            return;
                                        }
                                    } else {
                                        str = "chatsCache";
                                    }
                                } else {
                                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                }
                            }
                        }
                    } else {
                        str = "contactPhotos";
                    }
                }
                str = "viewModel";
            }
            str = "groupJid";
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    private final C135496sI A00(Runnable runnable, int i, int i2, int i3) {
        C38541rS r3 = this.A0E;
        if (r3 != null) {
            Context A14 = A14();
            String A16 = AnonymousClass3MX.A16(this, "learn-more", AnonymousClass3MW.A1a(), 0, i3);
            C18070vi.A0X(A16);
            return new C135496sI(r3.A04(A14, runnable, A16, "learn-more", AnonymousClass1YL.A00(A14(), 2130968627, 2131099690)), C18070vi.A0F(A14(), i2), i);
        }
        C18070vi.A11("linkifierUtils");
        throw null;
    }

    public static final void A01(AnonymousClass1E7 r5, SafetyCheckBottomSheet safetyCheckBottomSheet, WDSTextLayout wDSTextLayout) {
        String str;
        CharSequence headlineText = wDSTextLayout.getHeadlineText();
        if (headlineText == null || headlineText.length() == 0) {
            AnonymousClass1CJ r1 = safetyCheckBottomSheet.A08;
            if (r1 != null) {
                AnonymousClass1EC r0 = safetyCheckBottomSheet.A0C;
                if (r0 != null) {
                    int i = 2131898691;
                    if (r1.A0R(r0)) {
                        i = 2131898692;
                    }
                    Context A14 = safetyCheckBottomSheet.A14();
                    Object[] A1a = AnonymousClass3MW.A1a();
                    C24921Me r02 = safetyCheckBottomSheet.A03;
                    if (r02 != null) {
                        wDSTextLayout.setHeadlineText(C17880vN.A0q(A14, r02.A0H(r5, false).A01, A1a, 0, i));
                        return;
                    }
                    str = "waContactNames";
                } else {
                    str = "groupJid";
                }
            } else {
                str = "chatsCache";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle A15 = A15();
        C42941yz r0 = AnonymousClass1EC.A01;
        AnonymousClass1EC A012 = C42941yz.A01(A15.getString("groupJid"));
        this.A0C = A012;
        C124946aF r02 = this.A00;
        if (r02 != null) {
            AnonymousClass10E r1 = r02.A00.A02;
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
            this.A0D = new C111105iK(AnonymousClass10E.A4z(r1), AnonymousClass3MZ.A0g(r1), (AnonymousClass1NI) r1.A4i.get(), (AnonymousClass1MW) r1.A7u.get(), A012, AL1);
            return;
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }
}
