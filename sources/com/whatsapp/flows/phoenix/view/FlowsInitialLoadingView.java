package com.whatsapp.flows.phoenix.view;

import X.A3H;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1YF;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7AT;
import X.AnonymousClass7zL;
import X.C108955ca;
import X.C108975cc;
import X.C1423078y;
import X.C146747Ql;
import X.C146797Qq;
import X.C150617ky;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C19740yt;
import X.C28931bI;
import X.C36401np;
import X.C36531o3;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.FAQTextView;
import com.whatsapp.flows.phoenix.viewmodel.FlowsFooterViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Locale;

public final class FlowsInitialLoadingView extends LinearLayout implements AnonymousClass009 {
    public View A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass1PM A03;
    public AnonymousClass11C A04;
    public C18030ve A05;
    public AnonymousClass129 A06;
    public C36401np A07;
    public C28931bI A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass031 A0B;
    public C18600wl A0C;
    public FrameLayout A0D;
    public TextView A0E;
    public boolean A0F;
    public final C18100vl A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A03();
        this.A0G = AnonymousClass1DF.A01(new C150617ky(this));
        A01(context);
    }

    private final void A01(Context context) {
        setOrientation(1);
        View.inflate(context, 2131625335, this);
        this.A00 = C18070vi.A05(this, 2131432153);
        this.A0E = AnonymousClass3Ma.A0E(this, 2131430516);
        C28931bI A002 = C28931bI.A00(this, 2131430950);
        this.A08 = A002;
        A002.A04(8);
        this.A0D = (FrameLayout) C18070vi.A05(this, 2131432157);
        if (C18020vd.A05(C18040vf.A02, getAbProps(), 5468)) {
            FrameLayout frameLayout = this.A0D;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.height = -1;
                FrameLayout frameLayout2 = this.A0D;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams);
                    return;
                }
            }
            C18070vi.A11("loadingOrErrorLayout");
            throw null;
        }
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static final void setUpFlowsFooterWithLogo$lambda$2(FlowsInitialLoadingView flowsInitialLoadingView) {
        C18070vi.A0d(flowsInitialLoadingView, 0);
        C36531o3 A0a = AnonymousClass3MW.A0a(flowsInitialLoadingView.getContextualHelpHandler());
        Activity A052 = AnonymousClass3Ma.A05(flowsInitialLoadingView);
        C18070vi.A0z(A052, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        A0a.A01((AnonymousClass1FL) A052, "extensions_learn_more");
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setContextualHelpHandler(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setFaqLinkFactory(AnonymousClass129 r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setVerifiedNameManager(AnonymousClass1PM r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    /* access modifiers changed from: private */
    public final FlowsFooterViewModel getFlowsFooterViewModel() {
        return (FlowsFooterViewModel) this.A0G.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.whatsapp.jid.UserJid r8, java.lang.String r9, X.C30391dr r10, boolean r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C147767Uk
            if (r0 == 0) goto L_0x0081
            r6 = r10
            X.7Uk r6 = (X.C147767Uk) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r3) goto L_0x0087
            java.lang.Object r9 = r6.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.L$1
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r3 = r6.L$0
            com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView r3 = (com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView) r3
            X.C30691eM.A01(r5)
        L_0x002c:
            java.lang.String r5 = (java.lang.String) r5
            com.whatsapp.flows.phoenix.viewmodel.FlowsFooterViewModel r0 = r3.getFlowsFooterViewModel()
            if (r0 == 0) goto L_0x004e
            X.0ve r2 = r0.A04
            r1 = 4078(0xfee, float:5.714E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            int r0 = r5.length()
            if (r0 == 0) goto L_0x004e
            r3.setUpFlowsFooterWithLogo(r5, r8, r9)
        L_0x004b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004e:
            r3.setUpFlowsFooter(r5, r9)
            goto L_0x004b
        L_0x0052:
            X.C30691eM.A01(r5)
            r0 = 2131430754(0x7f0b0d62, float:1.8483218E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r7, r0)
            X.C18070vi.A0b(r1)
            int r0 = X.C72453Mb.A07(r11)
            r1.setVisibility(r0)
            X.0wl r2 = r7.getIoDispatcher()
            r1 = 0
            com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView$setupFooter$verifiedName$1 r0 = new com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView$setupFooter$verifiedName$1
            r0.<init>(r7, r8, r1)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r9
            r6.label = r3
            java.lang.Object r5 = X.C30451dy.A00(r6, r2, r0)
            if (r5 != r4) goto L_0x007f
            return r4
        L_0x007f:
            r3 = r7
            goto L_0x002c
        L_0x0081:
            X.7Uk r6 = new X.7Uk
            r6.<init>(r7, r10)
            goto L_0x0012
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView.A02(com.whatsapp.jid.UserJid, java.lang.String, X.1dr, boolean):java.lang.Object");
    }

    public void A03() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass10E.A8r(A0O);
            this.A02 = AnonymousClass10E.A4z(A0O);
            this.A0A = AnonymousClass3MX.A10(A0O);
            this.A06 = C108975cc.A0O(A0O);
            this.A01 = AnonymousClass10E.A12(A0O);
            this.A0C = AnonymousClass3MZ.A1B(A0O);
            this.A07 = AnonymousClass3MY.A0e(A0O.A00);
            this.A04 = AnonymousClass3Ma.A0a(A0O);
            this.A03 = AnonymousClass3MZ.A0f(A0O);
            this.A09 = AnonymousClass10E.AL1(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final AnonymousClass00H getContextualHelpHandler() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contextualHelpHandler");
        throw null;
    }

    public final AnonymousClass129 getFaqLinkFactory() {
        AnonymousClass129 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("faqLinkFactory");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("ioDispatcher");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass1PM getVerifiedNameManager() {
        AnonymousClass1PM r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("verifiedNameManager");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    private final void setUpFlowsFooter(String str, String str2) {
        String str3;
        FAQTextView fAQTextView = (FAQTextView) C18070vi.A05(this, 2131430954);
        fAQTextView.setVisibility(0);
        FlowsFooterViewModel flowsFooterViewModel = getFlowsFooterViewModel();
        if (flowsFooterViewModel != null) {
            str3 = flowsFooterViewModel.A0T(AnonymousClass3MY.A04(this), str);
        } else {
            str3 = null;
        }
        fAQTextView.getViewTreeObserver().addOnGlobalLayoutListener(new C1423078y(fAQTextView));
        fAQTextView.setEducationTextFromArticleID(new SpannableString(str3), str2);
    }

    private final void setUpFlowsFooterWithLogo(String str, UserJid userJid, String str2) {
        String str3;
        FlowsFooterViewModel flowsFooterViewModel;
        View A052 = C18070vi.A05(this, 2131430968);
        A052.setLayoutDirection(C17890vO.A1R(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault())) ? 1 : 0);
        A052.setVisibility(0);
        FlowsFooterViewModel flowsFooterViewModel2 = getFlowsFooterViewModel();
        if (flowsFooterViewModel2 != null) {
            str3 = flowsFooterViewModel2.A0T(AnonymousClass3MY.A04(this), str);
        } else {
            str3 = null;
        }
        AnonymousClass3Ma.A0E(this, 2131428554).setText(str3);
        FAQTextView fAQTextView = (FAQTextView) C18070vi.A05(this, 2131431963);
        if (!C18020vd.A05(C18040vf.A02, getAbProps(), 4393) || !AnonymousClass1YF.A0Y(C108955ca.A0v(getAbProps(), 3063), "extensions_learn_more", false)) {
            fAQTextView.setEducationTextFromArticleID(new SpannableString(""), str2);
        } else {
            AnonymousClass3Ma.A1L(getAbProps(), fAQTextView);
            fAQTextView.setText(A3H.A00(AnonymousClass3MY.A04(this), (TextAppearanceSpan) null, C146747Ql.A00(this, 32), C18070vi.A0F(getContext(), 2131890450), "learn-more", C19740yt.A00(getContext(), 2131103150), false));
            AnonymousClass3Ma.A1I(fAQTextView, getAbProps());
        }
        C28931bI r0 = this.A08;
        if (r0 == null) {
            C18070vi.A11("businessLogoViewStubHolder");
            throw null;
        }
        r0.A04(0);
        getWaWorkers().CGF(new C146797Qq(this, userJid, 10));
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null && (flowsFooterViewModel = getFlowsFooterViewModel()) != null) {
            AnonymousClass7AT.A01(A002, flowsFooterViewModel.A01, new AnonymousClass7zL(this), 28);
        }
    }

    public static final void setUpFlowsFooterWithLogo$lambda$3(FlowsInitialLoadingView flowsInitialLoadingView, UserJid userJid) {
        boolean A15 = C18070vi.A15(flowsInitialLoadingView, userJid);
        FlowsFooterViewModel flowsFooterViewModel = flowsInitialLoadingView.getFlowsFooterViewModel();
        if (flowsFooterViewModel != null) {
            Context A042 = AnonymousClass3MY.A04(flowsInitialLoadingView);
            AnonymousClass1E7 A0E2 = flowsFooterViewModel.A00.A0E(userJid);
            int dimensionPixelSize = A042.getResources().getDimensionPixelSize(2131166219);
            float dimension = A042.getResources().getDimension(2131168737);
            if (A0E2 != null) {
                flowsFooterViewModel.A01.A0E(flowsFooterViewModel.A03.A04(A042, A0E2, "FlowsFooterViewModel.loadBusinessProfilePhoto", dimension, dimensionPixelSize, A15));
            }
        }
    }

    public final void setErrorMessage(String str) {
        String str2;
        View A062 = AnonymousClass1HF.A06(this, 2131430754);
        C18070vi.A0b(A062);
        A062.setVisibility(0);
        if (str != null && str.length() != 0) {
            TextView textView = this.A0E;
            if (textView == null) {
                str2 = "errorTextView";
            } else {
                textView.setText(str);
                textView.setVisibility(0);
                View view = this.A00;
                if (view == null) {
                    str2 = "loadingView";
                } else {
                    view.setVisibility(8);
                    return;
                }
            }
            C18070vi.A11(str2);
            throw null;
        }
    }

    public FlowsInitialLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A03();
        this.A0G = AnonymousClass1DF.A01(new C150617ky(this));
        A01(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
