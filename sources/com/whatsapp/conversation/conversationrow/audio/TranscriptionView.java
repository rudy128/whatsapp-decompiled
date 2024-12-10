package com.whatsapp.conversation.conversationrow.audio;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass18K;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C108985cd;
import X.C128826gk;
import X.C18030ve;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C187939gc;
import X.C194909sU;
import X.C19830z4;
import X.C21363Ais;
import X.C21369Aiy;
import X.C21910Aua;
import X.C21911Aub;
import X.C21912Auc;
import X.C25749ClJ;
import X.C27691Xc;
import X.C28931bI;
import X.C36401np;
import X.C89914dE;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaTextView;

public final class TranscriptionView extends LinearLayout implements AnonymousClass009 {
    public C19830z4 A00;
    public C18030ve A01;
    public AnonymousClass18K A02;
    public C25749ClJ A03;
    public AnonymousClass1Nb A04;
    public C36401np A05;
    public C128826gk A06;
    public AnonymousClass031 A07;
    public C18600wl A08;
    public C18600wl A09;
    public AnonymousClass1OX A0A;
    public boolean A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    public static /* synthetic */ void getApplicationScope$annotations() {
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setApplicationScope(AnonymousClass1OX r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setChatSettingsStore(AnonymousClass1Nb r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setMlProcessScheduler(C25749ClJ clJ) {
        C18070vi.A0d(clJ, 0);
        this.A03 = clJ;
    }

    public final void setUserActions(C128826gk r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWamRuntime(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final C28931bI getExpandIconStubHolder() {
        return (C28931bI) this.A0C.getValue();
    }

    private final C187939gc getFeedbackHandler() {
        return (C187939gc) this.A0D.getValue();
    }

    private final WaTextView getTextView() {
        return (WaTextView) this.A0E.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass1OX getApplicationScope() {
        AnonymousClass1OX r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("applicationScope");
        throw null;
    }

    public final AnonymousClass1Nb getChatSettingsStore() {
        AnonymousClass1Nb r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatSettingsStore");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("ioDispatcher");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public final C25749ClJ getMlProcessScheduler() {
        C25749ClJ clJ = this.A03;
        if (clJ != null) {
            return clJ;
        }
        C18070vi.A11("mlProcessScheduler");
        throw null;
    }

    public final C128826gk getUserActions() {
        C128826gk r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userActions");
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public final AnonymousClass18K getWamRuntime() {
        AnonymousClass18K r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("wamRuntime");
        throw null;
    }

    public TranscriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            C27691Xc.A0w((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public final void A00(C194909sU r24, CharSequence charSequence, C18090vk r26) {
        View A022;
        WaTextView textView = getTextView();
        int i = 8;
        int i2 = 0;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        textView.setText(charSequence2);
        C18090vk r5 = r26;
        boolean A1W = AnonymousClass000.A1W(r5);
        C28931bI expandIconStubHolder = getExpandIconStubHolder();
        if ((expandIconStubHolder.A0A() || A1W) && (A022 = expandIconStubHolder.A02()) != null) {
            if (A1W) {
                i = 0;
            }
            A022.setVisibility(i);
            A022.setOnClickListener(new C89914dE(r5, 13));
        }
        C194909sU r0 = r24;
        if (r24 != null) {
            C187939gc feedbackHandler = getFeedbackHandler();
            long j = r0.A01;
            String str = r0.A03;
            double d = r0.A00;
            long j2 = r0.A02;
            C36401np r52 = feedbackHandler.A03;
            View view = feedbackHandler.A01;
            Context context = view.getContext();
            String string = view.getResources().getString(2131897090);
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
            r1[0] = AnonymousClass1D6.A01("transcript-feedback-useful", new C21369Aiy(feedbackHandler, str, d, j, j2));
            C108985cd.A1G("transcript-feedback-not-useful", new C21363Ais(feedbackHandler, d, j, j2), r1);
            SpannableStringBuilder A072 = r52.A07(context, string, AnonymousClass1D7.A0B(r1), 2131102731);
            WaTextView waTextView = (WaTextView) feedbackHandler.A05.getValue();
            waTextView.setText(A072);
            AnonymousClass3Ma.A1I(waTextView, waTextView.getAbProps());
            waTextView.setVisibility(0);
            return;
        }
        C187939gc feedbackHandler2 = getFeedbackHandler();
        if (feedbackHandler2.A00) {
            TextView textView2 = (TextView) feedbackHandler2.A05.getValue();
            textView2.setVisibility(8);
            AnonymousClass3MW.A1S(textView2);
        }
    }

    public /* synthetic */ TranscriptionView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A0B) {
            this.A0B = true;
            C27691Xc.A0w((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0E = AnonymousClass1DF.A01(new C21912Auc(this));
        this.A0C = AnonymousClass1DF.A01(new C21910Aua(this));
        this.A0D = AnonymousClass1DF.A01(new C21911Aub(this));
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View.inflate(context, 2131626026, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TranscriptionView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
