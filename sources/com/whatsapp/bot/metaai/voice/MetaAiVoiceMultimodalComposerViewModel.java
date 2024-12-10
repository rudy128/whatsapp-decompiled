package com.whatsapp.bot.metaai.voice;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1D6;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4XB;
import X.AnonymousClass6RF;
import X.AnonymousClass7AT;
import X.AnonymousClass7yT;
import X.AnonymousClass7yU;
import X.AnonymousClass7yV;
import X.AnonymousClass7yW;
import X.AnonymousClass7yX;
import X.AnonymousClass7yY;
import X.AnonymousClass7yZ;
import X.C001200q;
import X.C108945cZ;
import X.C108975cc;
import X.C122426Qf;
import X.C130826k4;
import X.C139286ya;
import X.C157747ya;
import X.C157757yb;
import X.C157767yc;
import X.C157777yd;
import X.C157787ye;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C22791Df;
import X.C22801Dg;
import X.C41111vp;
import X.C72463Mc;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;

public final class MetaAiVoiceMultimodalComposerViewModel extends MetaAiVoiceViewModel {
    public boolean A00 = true;
    public Integer A01;
    public final C22801Dg A02;
    public final C22801Dg A03;
    public final C22801Dg A04;
    public final C22801Dg A05;
    public final C22801Dg A06;
    public final C41111vp A07;
    public final C41111vp A08;
    public final C41111vp A09;
    public final AnonymousClass00H A0A;

    /* JADX WARNING: type inference failed for: r2v3, types: [X.1Dg, X.1DS] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceMultimodalComposerViewModel(AnonymousClass1KB r9, C18030ve r10, C139286ya r11, AnonymousClass4XB r12, C130826k4 r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        super(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        C18070vi.A0d(r14, 1);
        C18070vi.A0p(r15, r16, r9);
        AnonymousClass00H r4 = r17;
        C18070vi.A0d(r4, 5);
        C18070vi.A0x(r18, r13, r10, r11, r12);
        C18070vi.A0d(r19, 11);
        this.A0A = r4;
        C41111vp A0n = AnonymousClass3MW.A0n(false);
        this.A07 = A0n;
        C41111vp A0n2 = AnonymousClass3MW.A0n(false);
        this.A09 = A0n2;
        C22801Dg A0R = C108945cZ.A0R();
        AnonymousClass7AT.A02(A0n2, A0R, new AnonymousClass7yY(this), 14);
        AnonymousClass7AT.A02(A0n, A0R, new AnonymousClass7yZ(this), 14);
        this.A04 = A0R;
        C41111vp A0n3 = AnonymousClass3MW.A0n(false);
        this.A08 = A0n3;
        C22801Dg A0R2 = C108945cZ.A0R();
        AnonymousClass7AT.A02(A0n3, A0R2, new AnonymousClass7yW(this), 14);
        AnonymousClass7AT.A02(A0n, A0R2, new AnonymousClass7yX(this), 14);
        this.A03 = A0R2;
        C22801Dg A0R3 = C108945cZ.A0R();
        C18100vl r42 = this.A0X;
        AnonymousClass7AT.A02(C108945cZ.A0Q(r42), A0R3, new AnonymousClass7yT(this), 14);
        AnonymousClass1DT r6 = this.A0G;
        AnonymousClass7AT.A02(r6, A0R3, new AnonymousClass7yU(this), 14);
        AnonymousClass7AT.A02(A0R2, A0R3, new AnonymousClass7yV(this), 14);
        this.A02 = A0R3;
        ? r2 = new AnonymousClass1DS(0);
        r2.A00 = new C001200q();
        AnonymousClass7AT.A02(C108945cZ.A0Q(r42), r2, new C157767yc(this), 14);
        AnonymousClass7AT.A02(r6, r2, new C157777yd(this), 14);
        AnonymousClass7AT.A02(C22791Df.A00(this.A0F), r2, new C157787ye(this), 14);
        this.A06 = r2;
        C22801Dg A0R4 = C108945cZ.A0R();
        AnonymousClass7AT.A02(A0R2, A0R4, new C157747ya(this), 14);
        AnonymousClass7AT.A02(C108945cZ.A0Q(r42), A0R4, new C157757yb(this), 14);
        this.A05 = A0R4;
    }

    public final void A0Y(Integer num) {
        boolean z;
        Integer num2 = this.A01;
        if (num2 != null) {
            num2.intValue();
            return;
        }
        this.A01 = num;
        int intValue = num.intValue();
        C41111vp r0 = this.A09;
        if (intValue != 0) {
            z = true;
        } else {
            z = false;
        }
        r0.A0E(z);
        this.A08.A0E(z);
    }

    public static final void A09(MetaAiVoiceMultimodalComposerViewModel metaAiVoiceMultimodalComposerViewModel) {
        C22801Dg r1;
        int i;
        AnonymousClass1D6 r0;
        String str;
        if (C72463Mc.A1Y(C22791Df.A00(metaAiVoiceMultimodalComposerViewModel.A0F).A06())) {
            r1 = metaAiVoiceMultimodalComposerViewModel.A06;
            i = 8;
        } else {
            Object A0a = C108975cc.A0a(metaAiVoiceMultimodalComposerViewModel.A0X);
            if (A0a == AnonymousClass6RF.CONNECTING || (A0a == AnonymousClass6RF.LISTENING && ((r0 = (AnonymousClass1D6) metaAiVoiceMultimodalComposerViewModel.A0G.A06()) == null || (str = (String) r0.first) == null || str.length() == 0))) {
                r1 = metaAiVoiceMultimodalComposerViewModel.A06;
                i = 0;
            } else {
                r1 = metaAiVoiceMultimodalComposerViewModel.A06;
                i = 4;
            }
        }
        AnonymousClass3MX.A1J(r1, i);
    }

    public final void A0X() {
        String str;
        C22801Dg r1;
        AnonymousClass1D6 r0;
        AnonymousClass1D6 r02;
        if (!C18070vi.A19(this.A03.A06(), true)) {
            Object A062 = this.A0D.A06();
            AnonymousClass1DT r12 = this.A0G;
            AnonymousClass1D6 r03 = (AnonymousClass1D6) r12.A06();
            if (r03 == null || (str = (String) r03.first) == null) {
                str = "";
            }
            if (A062 != AnonymousClass6RF.PROCESSING) {
                if (A062 != AnonymousClass6RF.RESPONDING) {
                    return;
                }
                if ((this.A08 || str.length() != 0) && (r02 = (AnonymousClass1D6) r12.A06()) != null && AnonymousClass000.A1Y(r02.second)) {
                    r1 = this.A02;
                    r0 = AnonymousClass1D6.A01(C122426Qf.TEXT_INPUT, "");
                    r1.A0F(r0);
                }
            }
            r1 = this.A02;
            r0 = AnonymousClass1D6.A01(C122426Qf.TRANSCRIPTION, str);
            r1.A0F(r0);
        }
    }
}
