package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1OB;
import X.AnonymousClass1SB;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YF;
import X.AnonymousClass1ZU;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z0;
import X.AnonymousClass60G;
import X.AnonymousClass60J;
import X.AnonymousClass60K;
import X.AnonymousClass60L;
import X.AnonymousClass60N;
import X.AnonymousClass6a5;
import X.AnonymousClass757;
import X.AnonymousClass75C;
import X.AnonymousClass778;
import X.AnonymousClass78O;
import X.AnonymousClass79Y;
import X.AnonymousClass7AT;
import X.AnonymousClass7z6;
import X.AnonymousClass7z7;
import X.AnonymousClass7z8;
import X.AnonymousClass7z9;
import X.AnonymousClass7zA;
import X.AnonymousClass7zB;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C111635k2;
import X.C111825kU;
import X.C114315qV;
import X.C121196Ih;
import X.C133806pW;
import X.C135246rt;
import X.C1411074h;
import X.C1422478s;
import X.C147977gh;
import X.C148027gm;
import X.C148037gn;
import X.C150227kL;
import X.C150237kM;
import X.C150247kN;
import X.C150257kO;
import X.C150267kP;
import X.C150277kQ;
import X.C155737tE;
import X.C155747tF;
import X.C155757tG;
import X.C155767tH;
import X.C155777tI;
import X.C15930rR;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C29431cG;
import X.C30391dr;
import X.C38251qy;
import X.C41561wd;
import X.C72453Mb;
import X.C72473Md;
import X.C73193Ri;
import X.C88414Zp;
import X.C99274sY;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$logRetryClicked$1;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onDismiss$1;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;
import com.whatsapp.media.share.ShareMediaViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SearchFunStickersBottomSheet extends Hilt_SearchFunStickersBottomSheet implements C15930rR {
    public ViewGroup A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public ConstraintLayout A04;
    public CoordinatorLayout A05;
    public NestedScrollView A06;
    public RecyclerView A07;
    public LottieAnimationView A08;
    public AnonymousClass6a5 A09;
    public WaEditText A0A;
    public WaImageButton A0B;
    public WaImageView A0C;
    public WaImageView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public WaTextView A0I;
    public AnonymousClass11C A0J;
    public AnonymousClass11P A0K;
    public C111825kU A0L;
    public C18030ve A0M;
    public AnonymousClass778 A0N;
    public C28931bI A0O;
    public C28931bI A0P;
    public AnonymousClass00H A0Q;
    public Integer A0R;
    public String A0S;
    public final int A0T;
    public final C114315qV A0U;
    public final C121196Ih A0V;
    public final Map A0W = C17880vN.A13();
    public final C18100vl A0X;
    public final C18100vl A0Y;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = X.AnonymousClass1YE.A07(X.AnonymousClass1YF.A0I(r4), "\"", "", false).length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0C(java.lang.String r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x001f
            int r0 = r4.length()
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = X.AnonymousClass1YF.A0I(r4)
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass1YE.A07(r2, r1, r0, r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x001f
            r0 = 3
            if (r1 < r0) goto L_0x001f
            r3 = 1
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A0C(java.lang.String):boolean");
    }

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        float f;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        this.A0N = (AnonymousClass778) AnonymousClass3Ma.A0y(AnonymousClass00R.A0C, new C155737tE(this));
        this.A0R = (Integer) C88414Zp.A03(this, "stickerOrigin", 10).getValue();
        C18100vl r4 = this.A0Y;
        SearchFunStickersViewModel searchFunStickersViewModel = (SearchFunStickersViewModel) r4.getValue();
        AnonymousClass778 r0 = this.A0N;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        searchFunStickersViewModel.A03 = str;
        FrameLayout A0P2 = C108945cZ.A0P(view2, 2131433361);
        A0P2.setEnabled(false);
        A0P2.setVisibility(8);
        AnonymousClass1Y5.A07(A0P2, "Button");
        this.A02 = A0P2;
        this.A05 = (CoordinatorLayout) AnonymousClass1HF.A06(view2, 2131431039);
        this.A0D = AnonymousClass3MW.A0R(view2, 2131432786);
        WaEditText waEditText = (WaEditText) AnonymousClass1HF.A06(view2, 2131434882);
        waEditText.setImeOptions(2);
        waEditText.setRawInputType(1);
        waEditText.requestFocus();
        waEditText.A0I(false);
        this.A0A = waEditText;
        this.A08 = (LottieAnimationView) AnonymousClass1HF.A06(view2, 2131431037);
        WaTextView A0T2 = AnonymousClass3MW.A0T(view2, 2131434783);
        AnonymousClass1Y5.A07(A0T2, "Button");
        this.A0H = A0T2;
        this.A0C = AnonymousClass3MW.A0R(view2, 2131429142);
        this.A01 = C108945cZ.A0P(view2, 2131429143);
        this.A07 = C108945cZ.A0U(view2, 2131431041);
        this.A06 = (NestedScrollView) AnonymousClass1HF.A06(view2, 2131431043);
        this.A0F = AnonymousClass3MW.A0T(view2, 2131430532);
        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass1HF.A06(view2, 2131430520);
        C18070vi.A0b(constraintLayout);
        constraintLayout.setVisibility(8);
        this.A04 = constraintLayout;
        WaTextView A0T3 = AnonymousClass3MW.A0T(view2, 2131436208);
        AnonymousClass1Y5.A0A(A0T3, true);
        this.A0I = A0T3;
        this.A0P = C28931bI.A00(view2, 2131435861);
        this.A00 = AnonymousClass3MW.A0C(view2, 2131434904);
        this.A0O = C28931bI.A00(view2, 2131434539);
        WaTextView A0T4 = AnonymousClass3MW.A0T(view2, 2131434675);
        C18070vi.A0b(A0T4);
        A0T4.setVisibility(8);
        this.A0G = A0T4;
        WaImageButton waImageButton = (WaImageButton) AnonymousClass1HF.A06(view2, 2131429125);
        AnonymousClass1Y5.A07(waImageButton, "Button");
        C18070vi.A0b(waImageButton);
        waImageButton.setVisibility(8);
        AnonymousClass78O.A00(waImageButton, this, 32);
        this.A0B = waImageButton;
        this.A03 = C108945cZ.A0P(view2, 2131435758);
        this.A0E = AnonymousClass3MW.A0T(view2, 2131429723);
        Iterator it = ((SearchFunStickersViewModel) r4.getValue()).A0R.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C135246rt r6 = (C135246rt) next;
                    View inflate = LayoutInflater.from(A14()).inflate(2131627109, this.A03, false);
                    C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.WaNetworkResourceImageView");
                    WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) inflate;
                    waNetworkResourceImageView.setImageResource(r6.A00);
                    AnonymousClass00H r02 = this.A0Q;
                    if (r02 == null) {
                        str2 = "manager";
                        break;
                    }
                    C133806pW r1 = (C133806pW) r02.get();
                    if (r1.A00()) {
                        if (C18020vd.A05(C18040vf.A02, r1.A03, 3005)) {
                            waNetworkResourceImageView.A06(r6.A02, false);
                        }
                    }
                    if (i == 0) {
                        A01(this.A0H, this, r6.A01);
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    waNetworkResourceImageView.setAlpha(f);
                    FrameLayout frameLayout = this.A03;
                    if (frameLayout != null) {
                        frameLayout.addView(waNetworkResourceImageView);
                    }
                    this.A0W.put(Integer.valueOf(i), waNetworkResourceImageView);
                    i = i2;
                } else {
                    AnonymousClass1ZU.A0B();
                    break;
                }
            } else {
                WaEditText waEditText2 = this.A0A;
                if (waEditText2 != null) {
                    waEditText2.addTextChangedListener(this.A0V);
                    waEditText2.setOnEditorActionListener(new AnonymousClass79Y(this, 0));
                    C1422478s.A00(waEditText2, 4);
                }
                FrameLayout frameLayout2 = this.A03;
                if (frameLayout2 != null) {
                    AnonymousClass78O.A00(frameLayout2, this, 35);
                }
                WaTextView waTextView = this.A0G;
                if (waTextView != null) {
                    AnonymousClass78O.A00(waTextView, this, 36);
                }
                WaTextView waTextView2 = this.A0H;
                if (waTextView2 != null) {
                    AnonymousClass78O.A00(waTextView2, this, 37);
                }
                FrameLayout frameLayout3 = this.A01;
                if (frameLayout3 != null) {
                    AnonymousClass78O.A00(frameLayout3, this, 29);
                }
                FrameLayout frameLayout4 = this.A02;
                if (frameLayout4 != null) {
                    AnonymousClass78O.A00(frameLayout4, this, 30);
                }
                ((SearchFunStickersViewModel) AnonymousClass7AT.A00(A1G(), ((SearchFunStickersViewModel) AnonymousClass7AT.A00(A1G(), ((SearchFunStickersViewModel) AnonymousClass7AT.A00(A1G(), ((SearchFunStickersViewModel) AnonymousClass7AT.A00(A1G(), ((SearchFunStickersViewModel) AnonymousClass7AT.A00(A1G(), ((SearchFunStickersViewModel) AnonymousClass7AT.A00(A1G(), ((SearchFunStickersViewModel) r4.getValue()).A0A, r4, new AnonymousClass7z6(this), 26)).A09, r4, new AnonymousClass7z7(this), 26)).A0K, r4, new AnonymousClass7z8(this), 26)).A0D, r4, new AnonymousClass7z9(this), 26)).A0C, r4, new AnonymousClass7zA(this), 26)).A0B, r4, new AnonymousClass7zB(this), 26)).A0U(true);
                ((SearchFunStickersViewModel) r4.getValue()).A02 = this.A0R;
                AnonymousClass6a5 r3 = this.A09;
                if (r3 != null) {
                    AnonymousClass778 r8 = this.A0N;
                    C147977gh A1K = C108945cZ.A1K(this, 17);
                    C148037gn r14 = new C148037gn(this, 1);
                    C148027gm r13 = new C148027gm(this, 3);
                    C147977gh A1K2 = C108945cZ.A1K(this, 18);
                    C147977gh A1K3 = C108945cZ.A1K(this, 19);
                    AnonymousClass10E r32 = r3.A00.A02;
                    AnonymousClass1KB A12 = AnonymousClass10E.A12(r32);
                    AnonymousClass10I AL1 = AnonymousClass10E.AL1(r32);
                    C111825kU r33 = new C111825kU(A12, (C133806pW) r32.A00.A2J.get(), C108965cb.A0a(r32), (AnonymousClass1SB) r32.AAS.get(), r8, AL1, A1K, A1K2, A1K3, r13, r14);
                    r33.A02 = true;
                    this.A0L = r33;
                    RecyclerView recyclerView = this.A07;
                    if (recyclerView != null) {
                        recyclerView.setAdapter(r33);
                        Context A14 = A14();
                        int i3 = 2;
                        if (C72453Mb.A08(A14()) == 2) {
                            i3 = 4;
                        }
                        recyclerView.setLayoutManager(new GridLayoutManager(A14, i3, 1, false));
                        C38251qy layoutManager = recyclerView.getLayoutManager();
                        C18070vi.A0z(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                        ((GridLayoutManager) layoutManager).A01 = new C111635k2(recyclerView, this, 5);
                        return;
                    }
                    return;
                }
                str2 = "searchFunStickersAdapterFactory";
            }
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C38251qy layoutManager;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && recyclerView.A0B != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int i = 2;
            if (C72453Mb.A08(A14()) == 2) {
                i = 4;
            }
            gridLayoutManager.A1g(i);
            RecyclerView recyclerView2 = this.A07;
            if (recyclerView2 != null) {
                recyclerView2.requestLayout();
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C108965cb.A1B(this.A0A);
        SearchFunStickersViewModel A0Q2 = C108955ca.A0Q(this);
        AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$onDismiss$1(A0Q2, (C30391dr) null), C41561wd.A00(A0Q2));
        super.onDismiss(dialogInterface);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Integer num = null;
        if (menuItem != null) {
            num = Integer.valueOf(menuItem.getItemId());
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2131431047) {
                SearchFunStickersViewModel A0Q2 = C108955ca.A0Q(this);
                AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$logRetryClicked$1(A0Q2, (C30391dr) null), C41561wd.A00(A0Q2));
                A0A(this, false);
            } else if (intValue == 2131431042) {
                C108955ca.A0Q(this).A0D.A0F(AnonymousClass60N.A00);
                return true;
            } else if (intValue == 2131431038) {
                C73193Ri A002 = C73193Ri.A00(A14());
                A002.A0V(2131890537);
                A002.A0U(2131890536);
                A002.A0X(AnonymousClass757.A00(this, 42), 2131899051);
                A002.A0W((DialogInterface.OnClickListener) null, 2131898766);
                AnonymousClass3MY.A1G(A002);
                return true;
            }
        }
        return true;
    }

    public static final void A02(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        RecyclerView recyclerView;
        View childAt;
        AnonymousClass11C r0 = searchFunStickersBottomSheet.A0J;
        if (r0 == null) {
            AnonymousClass3MW.A1N();
            throw null;
        } else if (C108965cb.A1X(r0)) {
            Object A062 = C108955ca.A0Q(searchFunStickersBottomSheet).A0A.A06();
            if (A062 instanceof AnonymousClass60K) {
                childAt = searchFunStickersBottomSheet.A0F;
                if (childAt == null) {
                    return;
                }
            } else if (((A062 instanceof AnonymousClass60L) || (A062 instanceof AnonymousClass60J)) && (recyclerView = searchFunStickersBottomSheet.A07) != null && recyclerView.getChildCount() > 0) {
                childAt = recyclerView.getChildAt(0);
            } else {
                return;
            }
            childAt.requestFocus();
            childAt.performAccessibilityAction(64, (Bundle) null);
        }
    }

    public static final void A04(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        LottieAnimationView lottieAnimationView = searchFunStickersBottomSheet.A08;
        if ((lottieAnimationView == null || lottieAnimationView.A06()) && lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(0);
        }
    }

    public static final void A05(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        WaImageView waImageView = searchFunStickersBottomSheet.A0D;
        if (waImageView != null) {
            waImageView.setEnabled(false);
        }
        WaImageView waImageView2 = searchFunStickersBottomSheet.A0D;
        if (waImageView2 != null) {
            waImageView2.setAlpha(0.5f);
        }
        FrameLayout frameLayout = searchFunStickersBottomSheet.A02;
        if (frameLayout != null) {
            frameLayout.setEnabled(false);
        }
    }

    public static final void A06(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        WaTextView waTextView = searchFunStickersBottomSheet.A0E;
        if (waTextView != null) {
            waTextView.setAlpha(0.0f);
        }
        int A0D2 = C72453Mb.A0D(searchFunStickersBottomSheet.A0E);
        WaTextView waTextView2 = searchFunStickersBottomSheet.A0H;
        if (waTextView2 != null) {
            waTextView2.setVisibility(A0D2);
        }
        FrameLayout frameLayout = searchFunStickersBottomSheet.A03;
        if (frameLayout != null) {
            frameLayout.setVisibility(A0D2);
        }
    }

    public static final void A07(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        WaImageView waImageView = searchFunStickersBottomSheet.A0D;
        if (waImageView != null) {
            waImageView.setEnabled(true);
        }
        WaImageView waImageView2 = searchFunStickersBottomSheet.A0D;
        if (waImageView2 != null) {
            waImageView2.setAlpha(1.0f);
        }
        FrameLayout frameLayout = searchFunStickersBottomSheet.A02;
        if (frameLayout != null) {
            frameLayout.setEnabled(true);
        }
        C72453Mb.A1C(searchFunStickersBottomSheet.A02);
    }

    public static final void A08(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        C28931bI r0;
        TextView textView;
        C28931bI r1 = searchFunStickersBottomSheet.A0P;
        if (r1 != null) {
            r1.A04(0);
        }
        AnonymousClass778 r6 = searchFunStickersBottomSheet.A0N;
        if (r6 != null && (r0 = searchFunStickersBottomSheet.A0P) != null && (textView = (TextView) r0.A02()) != null) {
            textView.setText(AnonymousClass3Ma.A10(searchFunStickersBottomSheet.A14(), r6.A02, AnonymousClass3MW.A1a(), 0, 2131890561));
        }
    }

    public static final void A0A(SearchFunStickersBottomSheet searchFunStickersBottomSheet, boolean z) {
        Editable text;
        String obj;
        String A0I2;
        WaEditText waEditText = searchFunStickersBottomSheet.A0A;
        if (waEditText != null && (text = waEditText.getText()) != null && (obj = text.toString()) != null && (A0I2 = AnonymousClass1YF.A0I(obj)) != null) {
            SearchFunStickersViewModel A0Q2 = C108955ca.A0Q(searchFunStickersBottomSheet);
            AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$stopRollingPrompt$1(A0Q2, (C30391dr) null), C41561wd.A00(A0Q2));
            AnonymousClass1OB r2 = A0Q2.A07;
            if (r2 != null) {
                AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$stopLoadingStickers$1$1(A0Q2, (C30391dr) null, r2, true), C41561wd.A00(A0Q2));
            }
            A0Q2.A07 = null;
            List list = A0Q2.A05;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (next instanceof AnonymousClass60G) {
                    A13.add(next);
                }
            }
            if (A13.size() >= 10) {
                Object A002 = AnonymousClass4Z0.A00(A13);
                C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.stickers.funstickers.adapters.viewstate.FunSticker.Header");
                SearchFunStickersViewModel.A0A(A0Q2, ((AnonymousClass60G) A002).A00, false);
            }
            A0Q2.A07 = AnonymousClass3MY.A0s(new SearchFunStickersViewModel$startSearch$1(A0Q2, A0I2, (C30391dr) null, z), C41561wd.A00(A0Q2));
        }
    }

    public static final boolean A0B(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        C18030ve r2 = searchFunStickersBottomSheet.A0M;
        if (r2 != null) {
            return C18020vd.A05(C18040vf.A02, r2, 7190);
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public SearchFunStickersBottomSheet() {
        C150227kL r1 = new C150227kL(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new C150237kM(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(SearchFunStickersViewModel.class);
        this.A0Y = C99274sY.A00(new C150247kN(A002), new C155767tH(this, A002), new C155757tG(A002), A15);
        C18100vl A003 = AnonymousClass1DF.A00(num, new C150267kP(new C150257kO(this)));
        AnonymousClass20F A152 = AnonymousClass3MW.A15(ShareMediaViewModel.class);
        this.A0X = C99274sY.A00(new C150277kQ(A003), new C155747tF(this, A003), new C155777tI(A003), A152);
        this.A0U = new C114315qV(this, 7);
        this.A0V = new C121196Ih(this, 1);
        this.A0T = 2131626791;
    }

    public static final ValueAnimator A00(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C72473Md.A1a(f, f2));
        ofFloat.setDuration(600);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        C1411074h.A00(ofFloat, view, 14);
        return ofFloat;
    }

    public static final void A01(WaTextView waTextView, SearchFunStickersBottomSheet searchFunStickersBottomSheet, int i) {
        String A0n = AnonymousClass3MY.A0n(searchFunStickersBottomSheet, i);
        String A1I = searchFunStickersBottomSheet.A1I(2131890560, AnonymousClass000.A1b(A0n, 1));
        C18070vi.A0X(A1I);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("\"");
        spannableStringBuilder.append(A0n);
        spannableStringBuilder.append("\"");
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        if (waTextView != null) {
            waTextView.setText(spannedString);
            waTextView.setContentDescription(A1I);
        }
    }

    public static final void A03(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        A04(searchFunStickersBottomSheet);
        A05(searchFunStickersBottomSheet);
        WaTextView waTextView = searchFunStickersBottomSheet.A0E;
        if (waTextView != null) {
            waTextView.setAlpha(0.0f);
        }
        WaTextView waTextView2 = searchFunStickersBottomSheet.A0E;
        int i = 0;
        if (waTextView2 != null) {
            waTextView2.setVisibility(0);
        }
        WaTextView waTextView3 = searchFunStickersBottomSheet.A0H;
        if (waTextView3 != null) {
            waTextView3.setAlpha(1.0f);
            waTextView3.setVisibility(C72453Mb.A07(C108955ca.A0Q(searchFunStickersBottomSheet).A0V() ^ true ? 1 : 0));
        }
        FrameLayout frameLayout = searchFunStickersBottomSheet.A03;
        if (frameLayout != null) {
            frameLayout.setVisibility(C72453Mb.A07(C108955ca.A0Q(searchFunStickersBottomSheet).A0V() ^ true ? 1 : 0));
        }
        NestedScrollView nestedScrollView = searchFunStickersBottomSheet.A06;
        if (nestedScrollView != null) {
            if (!A0B(searchFunStickersBottomSheet) || !C108955ca.A0Q(searchFunStickersBottomSheet).A0V()) {
                i = 8;
            }
            nestedScrollView.setVisibility(i);
        }
    }

    public static final void A09(SearchFunStickersBottomSheet searchFunStickersBottomSheet, List list) {
        if (AnonymousClass000.A1a(list)) {
            A06(searchFunStickersBottomSheet);
            A07(searchFunStickersBottomSheet);
            NestedScrollView nestedScrollView = searchFunStickersBottomSheet.A06;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
        } else {
            NestedScrollView nestedScrollView2 = searchFunStickersBottomSheet.A06;
            if (!(nestedScrollView2 == null || nestedScrollView2.getVisibility() == 0)) {
                C108955ca.A0Q(searchFunStickersBottomSheet).A0U(false);
                A03(searchFunStickersBottomSheet);
            }
        }
        A04(searchFunStickersBottomSheet);
        C111825kU r2 = searchFunStickersBottomSheet.A0L;
        if (r2 != null) {
            List A0r = C29431cG.A0r(list);
            C18070vi.A0d(A0r, 0);
            r2.A0W(A0r);
        }
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        A27.setOnShowListener(new AnonymousClass75C(this, 0));
        return A27;
    }
}
