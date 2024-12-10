package com.whatsapp.conversation.conversationrow.audio;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DF;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OX;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass4V5;
import X.C1407873b;
import X.C17890vO;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C21422Ajp;
import X.C27691Xc;
import X.C27723Dk5;
import X.C27724Dk6;
import X.C27725Dk7;
import X.C27726Dk8;
import X.C27727Dk9;
import X.C27728DkA;
import X.C27729DkB;
import X.C27730DkC;
import X.C27731DkD;
import X.C27732DkE;
import X.C27733DkF;
import X.C27735DkH;
import X.C27736DkI;
import X.C27830DmR;
import X.C36401np;
import X.C72453Mb;
import X.C88534a3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;

public final class TranscriptionStatusView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass4V5 A00;
    public AnonymousClass1Nb A01;
    public C36401np A02;
    public C88534a3 A03;
    public AnonymousClass00H A04;
    public AnonymousClass031 A05;
    public C18600wl A06;
    public C18600wl A07;
    public AnonymousClass1OX A08;
    public boolean A09;
    public final C18100vl A0A;
    public final AnonymousClass00H A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18090vk A0N;
    public final C18090vk A0O;

    public static /* synthetic */ void getApplicationScope$annotations() {
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setApplicationScope(AnonymousClass1OX r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setChatSettingsStore(AnonymousClass1Nb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setEnableTranscriptionUserActions(AnonymousClass4V5 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setMlModelManagerLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setPttTranscriptionConfig(C88534a3 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    /* access modifiers changed from: private */
    public final LinearLayout getContainer() {
        return (LinearLayout) this.A0D.getValue();
    }

    private final Drawable getInfoIcon() {
        return (Drawable) this.A0E.getValue();
    }

    /* access modifiers changed from: private */
    public final C1407873b getMlModelManager() {
        AnonymousClass00H r1 = this.A0B;
        C18070vi.A0d(r1, 0);
        return (C1407873b) r1.get();
    }

    private final CharSequence getNoModelAvailableText() {
        return (CharSequence) this.A0F.getValue();
    }

    private final CharSequence getRetryDownloadText() {
        return (CharSequence) this.A0G.getValue();
    }

    private final CharSequence getRetryDownloadTextDueToTheLowStorage() {
        return (CharSequence) this.A0H.getValue();
    }

    private final Drawable getRetryIcon() {
        return (Drawable) this.A0I.getValue();
    }

    private final boolean getShouldShowDebugInfo() {
        return C72453Mb.A1a(this.A0A);
    }

    /* access modifiers changed from: private */
    public final WaTextView getTextView() {
        return (WaTextView) this.A0J.getValue();
    }

    private final CharSequence getTranscribeCtaText() {
        return (CharSequence) this.A0K.getValue();
    }

    private final CharSequence getTranscriptionSetupText() {
        return (CharSequence) this.A0L.getValue();
    }

    private final CharSequence getWantToTranscribeText() {
        return (CharSequence) this.A0M.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, getPttTranscriptionConfig().A01, 11596) == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C4I r9) {
        /*
            r8 = this;
            X.Bqf r0 = X.Bqf.A00
            boolean r0 = r9.equals(r0)
            r5 = -1
            r4 = 0
            if (r0 != 0) goto L_0x013b
            boolean r0 = r9 instanceof X.C23824Bqc
            if (r0 != 0) goto L_0x013b
            X.Bqh r0 = X.Bqh.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a6
            java.lang.CharSequence r3 = r8.getNoModelAvailableText()
            X.0vk r2 = r8.A0O
            r1 = 45
            X.4ri r0 = new X.4ri
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.CQW r7 = new X.CQW
            r7.<init>(r3, r4, r0)
        L_0x0028:
            java.lang.CharSequence r3 = r7.A00
            java.lang.Integer r6 = r7.A01
            java.lang.Runnable r2 = r7.A02
            if (r2 == 0) goto L_0x00a4
            r1 = 12
            X.4dE r0 = new X.4dE
            r0.<init>(r2, r1)
        L_0x0037:
            r8.setOnClickListener(r0)
            com.whatsapp.WaTextView r0 = r8.getTextView()
            r0.setText(r3)
            if (r6 == 0) goto L_0x0047
            int r5 = r6.intValue()
        L_0x0047:
            r3 = 1
            r0 = 0
            if (r5 == r0) goto L_0x009f
            if (r5 == r3) goto L_0x009a
            r1 = r4
        L_0x004e:
            com.whatsapp.WaTextView r0 = r8.getTextView()
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r4, r4, r4)
            com.whatsapp.WaTextView r2 = r8.getTextView()
            r4 = 0
            if (r1 != 0) goto L_0x008e
            r0 = 0
        L_0x005d:
            r2.setCompoundDrawablePadding(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r6 != r0) goto L_0x008c
            X.4a3 r0 = r8.getPttTranscriptionConfig()
            X.0ve r2 = r0.A01
            r1 = 11596(0x2d4c, float:1.625E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x008c
        L_0x0074:
            X.0vl r1 = r8.A0C
            boolean r0 = r1.Bf6()
            if (r0 != 0) goto L_0x007e
            if (r3 == 0) goto L_0x008b
        L_0x007e:
            android.view.View r0 = X.AnonymousClass3MW.A0A(r1)
            if (r0 == 0) goto L_0x008b
            if (r3 != 0) goto L_0x0088
            r4 = 8
        L_0x0088:
            r0.setVisibility(r4)
        L_0x008b:
            return
        L_0x008c:
            r3 = 0
            goto L_0x0074
        L_0x008e:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131169077(0x7f070f35, float:1.7952474E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x005d
        L_0x009a:
            android.graphics.drawable.Drawable r1 = r8.getRetryIcon()
            goto L_0x004e
        L_0x009f:
            android.graphics.drawable.Drawable r1 = r8.getInfoIcon()
            goto L_0x004e
        L_0x00a4:
            r0 = r4
            goto L_0x0037
        L_0x00a6:
            X.Bqg r0 = X.Bqg.A00
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x012a
            boolean r0 = r9 instanceof X.C23825Bqd
            if (r0 != 0) goto L_0x012a
            boolean r0 = r9 instanceof X.Bqa
            if (r0 == 0) goto L_0x00d7
            X.BqY r0 = X.C23821BqY.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.CharSequence r6 = r8.getRetryDownloadTextDueToTheLowStorage()
        L_0x00c2:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            X.0vk r2 = r8.A0O
            r1 = 46
            goto L_0x0165
        L_0x00ca:
            X.BqZ r0 = X.C23822BqZ.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0176
            java.lang.CharSequence r6 = r8.getRetryDownloadText()
            goto L_0x00c2
        L_0x00d7:
            X.Bqj r0 = X.Bqj.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00f3
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131897076(0x7f122af4, float:1.9429031E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0m(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
        L_0x00ec:
            X.CQW r7 = new X.CQW
            r7.<init>(r1, r0, r4)
            goto L_0x0028
        L_0x00f3:
            X.Bqi r0 = X.Bqi.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0104
            X.Dnn r0 = X.C27912Dnn.A00
            java.lang.String r1 = r8.A04(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x00ec
        L_0x0104:
            boolean r0 = r9 instanceof X.C23823Bqb
            if (r0 == 0) goto L_0x0120
            X.DkG r0 = new X.DkG
            r0.<init>(r9)
            java.lang.String r3 = r8.A04(r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            r1 = 3
            X.4ra r0 = new X.4ra
            r0.<init>(r8, r9, r1)
            X.CQW r7 = new X.CQW
            r7.<init>(r3, r2, r0)
            goto L_0x0028
        L_0x0120:
            boolean r0 = r9 instanceof X.C23826Bqe
            if (r0 == 0) goto L_0x017b
            java.lang.CharSequence r2 = r8.getTranscribeCtaText()
            r1 = 4
            goto L_0x012f
        L_0x012a:
            java.lang.CharSequence r2 = r8.getWantToTranscribeText()
            r1 = 2
        L_0x012f:
            X.4ra r0 = new X.4ra
            r0.<init>(r9, r8, r1)
            X.CQW r7 = new X.CQW
            r7.<init>(r2, r4, r0)
            goto L_0x0028
        L_0x013b:
            boolean r0 = r9 instanceof X.C23824Bqc
            if (r0 == 0) goto L_0x0171
            X.Bqc r9 = (X.C23824Bqc) r9
            if (r9 == 0) goto L_0x0171
            int r0 = r9.A00
            if (r0 < 0) goto L_0x0171
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131897113(0x7f122b19, float:1.9429106E38)
            java.lang.Object[] r0 = X.BEA.A1b(r0)
            java.lang.String r1 = r2.getString(r1, r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "stop-transcription-setup"
            android.text.SpannableStringBuilder r6 = A00(r8, r1, r0)
        L_0x015f:
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            X.0vk r2 = r8.A0N
            r1 = 44
        L_0x0165:
            X.4ri r0 = new X.4ri
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.CQW r7 = new X.CQW
            r7.<init>(r6, r3, r0)
            goto L_0x0028
        L_0x0171:
            java.lang.CharSequence r6 = r8.getTranscriptionSetupText()
            goto L_0x015f
        L_0x0176:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x017b:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView.A05(X.C4I):void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1OX getApplicationScope() {
        AnonymousClass1OX r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("applicationScope");
        throw null;
    }

    public final AnonymousClass1Nb getChatSettingsStore() {
        AnonymousClass1Nb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatSettingsStore");
        throw null;
    }

    public final AnonymousClass4V5 getEnableTranscriptionUserActions() {
        AnonymousClass4V5 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("enableTranscriptionUserActions");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("ioDispatcher");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mainDispatcher");
        throw null;
    }

    public final AnonymousClass00H getMlModelManagerLazy() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mlModelManagerLazy");
        throw null;
    }

    public final C88534a3 getPttTranscriptionConfig() {
        C88534a3 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pttTranscriptionConfig");
        throw null;
    }

    public TranscriptionStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            C27691Xc.A0v((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public static final SpannableStringBuilder A00(TranscriptionStatusView transcriptionStatusView, CharSequence charSequence, String str) {
        return transcriptionStatusView.getLinkifier().A06(transcriptionStatusView.getContext(), new C21422Ajp(17), charSequence.toString(), str, AnonymousClass1YL.A00(transcriptionStatusView.getContext(), 2130971977, 2131102732));
    }

    private final String A04(C18090vk r3) {
        String string = getResources().getString(2131897083);
        if (C72453Mb.A1a(this.A0A)) {
            StringBuilder A11 = AnonymousClass000.A11(string);
            A11.append(" [Err ");
            A11.append((String) r3.invoke());
            return C17890vO.A0c(A11, ']');
        }
        C18070vi.A0b(string);
        return string;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0e(context, 1, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            C27691Xc.A0v((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0B = getMlModelManagerLazy();
        this.A0A = AnonymousClass1DF.A01(new C27730DkC(this));
        this.A0M = AnonymousClass1DF.A01(new C27736DkI(this));
        this.A0L = AnonymousClass1DF.A01(new C27733DkF(this));
        this.A0F = AnonymousClass1DF.A01(new C27726Dk8(this));
        this.A0G = AnonymousClass1DF.A01(new C27727Dk9(this));
        this.A0H = AnonymousClass1DF.A01(new C27728DkA(this));
        this.A0K = AnonymousClass1DF.A01(new C27732DkE(this));
        this.A0D = AnonymousClass1DF.A01(new C27724Dk6(this));
        this.A0J = AnonymousClass1DF.A01(new C27731DkD(this));
        this.A0E = AnonymousClass1DF.A01(new C27725Dk7(context));
        this.A0I = AnonymousClass1DF.A01(new C27729DkB(context));
        this.A0C = AnonymousClass1DF.A01(new C27830DmR(context, this));
        View.inflate(context, 2131626028, this);
        this.A0N = new C27723Dk5(this);
        this.A0O = new C27735DkH(this);
    }
}
