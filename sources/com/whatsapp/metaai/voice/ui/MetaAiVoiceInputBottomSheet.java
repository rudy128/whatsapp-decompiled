package com.whatsapp.metaai.voice.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass11C;
import X.AnonymousClass195;
import X.AnonymousClass1D6;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4XB;
import X.AnonymousClass4a5;
import X.AnonymousClass6RF;
import X.AnonymousClass6UR;
import X.AnonymousClass7A3;
import X.AnonymousClass7AT;
import X.AnonymousClass7S3;
import X.AnonymousClass7S8;
import X.AnonymousClass7SB;
import X.BIE;
import X.C108945cZ;
import X.C130706js;
import X.C136786uO;
import X.C140076zu;
import X.C1407472v;
import X.C1423479c;
import X.C142907Bg;
import X.C152327nj;
import X.C152337nk;
import X.C152347nl;
import X.C156287u7;
import X.C156297u8;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C22791Df;
import X.C23520Bik;
import X.C24401Ke;
import X.C37801q9;
import X.C47192Hl;
import X.C72463Mc;
import X.C90054dS;
import X.C99134sK;
import X.C99164sN;
import X.C99274sY;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.Iterator;
import java.util.Map;

public final class MetaAiVoiceInputBottomSheet extends Hilt_MetaAiVoiceInputBottomSheet {
    public AnonymousClass195 A00;
    public WaTextView A01;
    public AnonymousClass11C A02;
    public MetaAiSpeechIndicatorView A03;
    public C130706js A04;
    public AnonymousClass6UR A05;
    public C136786uO A06;
    public C1407472v A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public Integer A0F;
    public Integer A0G;
    public String A0H;
    public boolean A0I = true;
    public boolean A0J;
    public ConstraintLayout A0K;
    public CoordinatorLayout A0L;
    public WaImageView A0M;
    public final int A0N;
    public final AnonymousClass02n A0O;
    public final AnonymousClass7A3 A0P;
    public final Map A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final C24401Ke A0T;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6UR, java.lang.Object] */
    public void A21(Bundle bundle, View view) {
        String str;
        Window window;
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        boolean A012 = A01(this);
        C99134sK r3 = new C99134sK(view, this, 13);
        ? obj = new Object();
        obj.A02 = AnonymousClass3MW.A0T(view, 2131432738);
        obj.A01 = AnonymousClass3MW.A0T(view, 2131432733);
        ViewStub viewStub = (ViewStub) C18070vi.A05(view, 2131431346);
        if (A012) {
            View A0G2 = AnonymousClass3MY.A0G(viewStub, 2131625538);
            C18070vi.A0z(A0G2, "null cannot be cast to non-null type com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView");
            obj.A03 = (MetaAiSpeechIndicatorView) A0G2;
        } else {
            View A0G3 = AnonymousClass3MY.A0G(viewStub, 2131625539);
            C18070vi.A0z(A0G3, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) A0G3;
            obj.A00 = lottieAnimationView;
            obj.A04 = new C1407472v(lottieAnimationView, r3);
        }
        this.A05 = obj;
        ViewStub viewStub2 = (ViewStub) C18070vi.A05(view, 2131431030);
        if (A01(this)) {
            View A0G4 = AnonymousClass3MY.A0G(viewStub2, 2131625402);
            C18070vi.A0z(A0G4, "null cannot be cast to non-null type com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView");
            this.A03 = (MetaAiSpeechIndicatorView) A0G4;
        } else {
            View A0G5 = AnonymousClass3MY.A0G(viewStub2, 2131625403);
            C18070vi.A0z(A0G5, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            this.A07 = new C1407472v((LottieAnimationView) A0G5, new C99164sN(this, 9));
        }
        WaImageView A0R2 = AnonymousClass3MW.A0R(view, 2131436923);
        this.A0M = A0R2;
        if (A0R2 != null) {
            C90054dS.A00(A0R2, this, 11);
        }
        C37801q9 A1G = A1G();
        C18100vl r2 = this.A0S;
        MetaAiVoiceViewModel A0m = C108945cZ.A0m(r2);
        AnonymousClass6UR r9 = this.A05;
        if (r9 == null) {
            str = "metaAiVoiceNuxViewHolder";
        } else {
            this.A04 = new C130706js(view2, A1G, this.A03, r9, this.A07, A0m);
            this.A0L = (CoordinatorLayout) AnonymousClass1HF.A06(view, 2131432741);
            this.A0K = (ConstraintLayout) AnonymousClass1HF.A06(view, 2131432740);
            this.A01 = AnonymousClass3MW.A0T(view, 2131436878);
            AnonymousClass195 r1 = this.A00;
            if (r1 != null) {
                r1.registerObserver(this.A0T);
                MetaAiVoiceViewModel metaAiVoiceViewModel = (MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), C108945cZ.A0Q(((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), C22791Df.A00(C108945cZ.A0m(r2).A0F), r2, AnonymousClass7SB.A00(this, 28), 44)).A0C, r2, AnonymousClass7SB.A00(this, 29), 44)).A0B, r2, AnonymousClass7SB.A00(this, 22), 44)).A0M, r2, AnonymousClass7SB.A00(this, 23), 44)).A0G, r2, AnonymousClass7SB.A00(this, 24), 44)).A0E, r2, new AnonymousClass7S8(view, this, 4), 44)).A00, r2, AnonymousClass7SB.A00(this, 25), 44)).A0X), r2, new AnonymousClass7S8(view, this, 5), 44);
                Integer num = this.A0F;
                metaAiVoiceViewModel.A01 = num;
                AnonymousClass4XB r32 = metaAiVoiceViewModel.A0J;
                C47192Hl r12 = new C47192Hl();
                AnonymousClass3MZ.A1T(r12, num);
                AnonymousClass4XB.A00(r12, r32, 81);
                AnonymousClass7AT.A01(A1G(), ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(A1G(), C108945cZ.A0m(r2).A0Q, r2, AnonymousClass7SB.A00(this, 26), 44)).A0P, AnonymousClass7SB.A00(this, 27), 44);
                Dialog dialog = this.A03;
                if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                    window.addFlags(128);
                }
                AnonymousClass00H r0 = this.A0D;
                if (r0 != null) {
                    ((C140076zu) r0.get()).A02(AnonymousClass00R.A00);
                    MetaAiVoiceViewModel A0m2 = C108945cZ.A0m(r2);
                    Integer num2 = this.A0G;
                    String str2 = this.A0H;
                    A0m2.A02 = num2;
                    A0m2.A03 = str2;
                    return;
                }
                str = "voipAiRtcLogger";
            } else {
                str = "applicationStateObservers";
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        MetaAiVoiceViewModel.A08(C108945cZ.A0m(this.A0S), 3, 4);
    }

    public static final void A00(MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet, int i) {
        CoordinatorLayout coordinatorLayout = metaAiVoiceInputBottomSheet.A0L;
        if (coordinatorLayout != null) {
            C23520Bik A012 = C23520Bik.A01(coordinatorLayout, i, 0);
            int dimensionPixelSize = AnonymousClass3MZ.A09(metaAiVoiceInputBottomSheet).getDimensionPixelSize(2131168774);
            int dimensionPixelSize2 = AnonymousClass3MZ.A09(metaAiVoiceInputBottomSheet).getDimensionPixelSize(2131168761);
            BIE bie = A012.A0J;
            C18070vi.A0X(bie);
            ViewGroup.LayoutParams layoutParams = bie.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(dimensionPixelSize);
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                marginLayoutParams.bottomMargin = dimensionPixelSize2;
                bie.setLayoutParams(marginLayoutParams);
                View findViewById = bie.findViewById(2131435508);
                C72463Mc.A14(findViewById, 0, findViewById.getPaddingTop());
                A012.A08();
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final boolean A01(MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet) {
        AnonymousClass00H r0 = metaAiVoiceInputBottomSheet.A08;
        if (r0 != null) {
            return C18020vd.A05(C18040vf.A01, AnonymousClass3MW.A0X(r0).A00, 10729);
        }
        C18070vi.A11("botGating");
        throw null;
    }

    public void A28() {
        ConstraintLayout constraintLayout = this.A0K;
        if (constraintLayout != null) {
            AnonymousClass11C r0 = this.A02;
            if (r0 != null) {
                AnonymousClass4a5.A01(constraintLayout, r0);
            } else {
                AnonymousClass3MW.A1N();
                throw null;
            }
        }
        super.A28();
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setRequestedOrientation(-1);
        }
        C18100vl r4 = this.A0S;
        C108945cZ.A0m(r4).A0W(false);
        C108945cZ.A0m(r4).A0E.A0F((Object) null);
        C108945cZ.A0m(r4).A0G.A0F(AnonymousClass1D6.A01((Object) null, false));
        C108945cZ.A0m(r4).A0V();
        C108945cZ.A0m(r4).A0D.A0F(AnonymousClass6RF.CONNECTING);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.02h] */
    public MetaAiVoiceInputBottomSheet() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152337nk(new C152327nj(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MetaAiVoiceViewModel.class);
        this.A0S = C99274sY.A00(new C152347nl(A002), new C156297u8(this, A002), new C156287u7(A002), A15);
        this.A0Q = C17880vN.A13();
        this.A0T = new C142907Bg(this);
        this.A0O = CDw(new C1423479c(this, 8), new Object());
        this.A0P = new AnonymousClass7A3(this);
        this.A0R = AnonymousClass7S3.A00(this, 40);
        this.A0N = 2131626060;
    }

    public void A1s() {
        Window window;
        super.A1s();
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.clearFlags(128);
        }
        C108945cZ.A0m(this.A0S).A0V();
        C130706js r2 = this.A04;
        if (r2 == null) {
            C18070vi.A11("metaAiVoiceBottomBar");
            throw null;
        }
        WaImageView waImageView = r2.A03;
        if (waImageView != null) {
            waImageView.setOnClickListener((View.OnClickListener) null);
        }
        WaImageView waImageView2 = r2.A03;
        if (waImageView2 != null) {
            waImageView2.setOnClickListener((View.OnClickListener) null);
        }
        WaImageView waImageView3 = r2.A01;
        if (waImageView3 != null) {
            waImageView3.setOnClickListener((View.OnClickListener) null);
        }
        WaImageView waImageView4 = r2.A02;
        if (waImageView4 != null) {
            waImageView4.setOnClickListener((View.OnClickListener) null);
        }
        r2.A00 = null;
        r2.A04 = null;
        r2.A03 = null;
        r2.A01 = null;
        r2.A02 = null;
        this.A0L = null;
        this.A0K = null;
        WaImageView waImageView5 = this.A0M;
        if (waImageView5 != null) {
            waImageView5.setOnClickListener((View.OnClickListener) null);
        }
        this.A0M = null;
        this.A03 = null;
        this.A07 = null;
        this.A01 = null;
        AnonymousClass6UR r0 = this.A05;
        if (r0 == null) {
            C18070vi.A11("metaAiVoiceNuxViewHolder");
            throw null;
        }
        r0.A02 = null;
        r0.A01 = null;
        r0.A00 = null;
        r0.A03 = null;
        r0.A04 = null;
        Iterator A0l = C17890vO.A0l(this.A0Q);
        while (A0l.hasNext()) {
            ((C136786uO) A0l.next()).A01();
        }
        AnonymousClass195 r1 = this.A00;
        if (r1 != null) {
            r1.unregisterObserver(this.A0T);
        } else {
            C18070vi.A11("applicationStateObservers");
            throw null;
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i == 1) {
            C108945cZ.A0m(this.A0S).A0T();
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        MetaAiVoiceViewModel A0m = C108945cZ.A0m(this.A0S);
        A0m.A08 = false;
        A0m.A0L.A01();
        A0m.A0U();
        if (Build.VERSION.SDK_INT == 26) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        AnonymousClass1FL A1B2 = A1B();
        if (A1B2 != null) {
            A1B2.setRequestedOrientation(1);
        }
    }

    public Dialog A27(Bundle bundle) {
        Window window;
        Dialog A27 = super.A27(bundle);
        Context A1n = A1n();
        if (!(A1n == null || (window = A27.getWindow()) == null)) {
            window.setNavigationBarColor(C19740yt.A00(A1n, 2131103110));
        }
        return A27;
    }
}
