package com.whatsapp.bot.metaai.imagineme;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1D6;
import X.AnonymousClass1E2;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4DI;
import X.C133036o4;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C192379oI;
import X.C21445AkC;
import X.C22801Dg;
import X.C24681Lg;
import X.C25791Pq;
import X.C33221iT;
import X.C38731rn;
import X.C72463Mc;
import X.C820141r;
import X.C820241s;
import X.C82844Ch;
import X.C95504mL;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class ImagineMeOnboardingViewModel extends AnonymousClass1J2 {
    public int A00;
    public C25791Pq A01;
    public AnonymousClass1BI A02;
    public Integer A03;
    public final C22801Dg A04;
    public final C95504mL A05;
    public final C38731rn A06;
    public final C33221iT A07;
    public final ImagineMeOnboardingArEffectRepository A08;
    public final ImagineMePictureDataRepository A09;
    public final C133036o4 A0A;
    public final C192379oI A0B;
    public final C24681Lg A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final List A0I;
    public final AnonymousClass1G4 A0J;
    public final AnonymousClass1G4 A0K;
    public final AnonymousClass1G4 A0L;
    public final AnonymousClass1G4 A0M;
    public final AnonymousClass1G1 A0N;
    public final AnonymousClass1G1 A0O;
    public final AnonymousClass1G1 A0P;
    public final AnonymousClass1G1 A0Q;
    public final ImagineMeOnboardingRequester A0R;
    public final C820141r A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r1.A00, 11069) == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ImagineMeOnboardingViewModel(X.C38731rn r13, X.C33221iT r14, com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingArEffectRepository r15, com.whatsapp.bot.metaai.imagineme.ImagineMePictureDataRepository r16, X.C133036o4 r17, X.C192379oI r18, X.C24681Lg r19, com.whatsapp.imagineme.ImagineMeOnboardingRequester r20, X.AnonymousClass10I r21, X.AnonymousClass00H r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24, X.AnonymousClass00H r25, X.AnonymousClass00H r26) {
        /*
            r12 = this;
            r5 = 1
            r8 = r21
            r10 = r18
            int r3 = X.C72453Mb.A0G(r8, r10, r5)
            r2 = 3
            r7 = r22
            r9 = r19
            X.C72473Md.A1M(r9, r14, r7, r2)
            r6 = r23
            r4 = r24
            r1 = r25
            X.C18070vi.A0q(r6, r4, r1)
            r0 = 9
            X.C18070vi.A0d(r13, r0)
            r0 = 14
            r11 = r26
            X.C18070vi.A0d(r11, r0)
            r12.<init>()
            r12.A0D = r8
            r12.A0B = r10
            r12.A0C = r9
            r12.A07 = r14
            r12.A0E = r7
            r12.A0G = r6
            r12.A0H = r4
            r12.A0F = r1
            r12.A06 = r13
            r0 = r20
            r12.A0R = r0
            r12.A08 = r15
            r0 = r16
            r12.A09 = r0
            r0 = r17
            r12.A0A = r0
            X.1UD r1 = X.AnonymousClass3MW.A0X(r11)
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x0060
            X.0ve r4 = r1.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 11069(0x2b3d, float:1.5511E-41)
            boolean r1 = X.C18020vd.A05(r1, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            r4 = 0
            X.4DS[] r1 = new X.AnonymousClass4DS[r2]
            if (r0 == 0) goto L_0x00c1
            X.4DS r0 = X.AnonymousClass4DS.RIGHT
            r1[r4] = r0
            X.4DS r0 = X.AnonymousClass4DS.LEFT
            r1[r5] = r0
            X.4DS r0 = X.AnonymousClass4DS.CENTER
        L_0x0070:
            java.util.List r0 = X.C18070vi.A0O(r0, r1, r3)
            r12.A0I = r0
            X.4DH r0 = X.AnonymousClass4DH.PRE_CAPTURE
            X.1G7 r0 = X.AnonymousClass3MW.A18(r0)
            r12.A0J = r0
            r12.A0N = r0
            X.1I8 r1 = X.AnonymousClass4IV.A01
            X.1G7 r0 = X.AnonymousClass3MW.A18(r1)
            r12.A0L = r0
            r12.A0P = r0
            X.4DI r0 = X.AnonymousClass4DI.CAPTURE_SELFIE_1
            X.1G7 r0 = X.AnonymousClass3MW.A18(r0)
            r12.A0K = r0
            r12.A0O = r0
            X.1G7 r0 = X.AnonymousClass3MW.A18(r1)
            r12.A0M = r0
            r12.A0Q = r0
            X.1Dg r3 = new X.1Dg
            r3.<init>()
            r12.A04 = r3
            X.41r r0 = new X.41r
            r0.<init>(r12, r2)
            r12.A0S = r0
            X.4mL r0 = new X.4mL
            r0.<init>(r12, r4)
            r12.A05 = r0
            X.5Qg r2 = new X.5Qg
            r2.<init>(r12)
            r1 = 12
            X.2vk r0 = new X.2vk
            r0.<init>(r2, r1)
            r3.A0C(r0)
            return
        L_0x00c1:
            X.4DS r0 = X.AnonymousClass4DS.CENTER
            r1[r4] = r0
            X.4DS r0 = X.AnonymousClass4DS.RIGHT
            r1[r5] = r0
            X.4DS r0 = X.AnonymousClass4DS.LEFT
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel.<init>(X.1rn, X.1iT, com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingArEffectRepository, com.whatsapp.bot.metaai.imagineme.ImagineMePictureDataRepository, X.6o4, X.9oI, X.1Lg, com.whatsapp.imagineme.ImagineMeOnboardingRequester, X.10I, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }

    public final void A0T(C82844Ch r6) {
        AnonymousClass1G1 r0 = this.A0O;
        r0.getValue();
        Object value = r0.getValue();
        AnonymousClass4DI r1 = AnonymousClass4DI.CAPTURE_SELFIE_1;
        if (value != r1) {
            this.A00 = 0;
            this.A0M.setValue(r6);
            this.A0K.setValue(r1);
            C133036o4 r3 = this.A0A;
            Log.i("ImagineMeSelfieUploader/cleanup start");
            r3.A01.execute(new C21445AkC(r3, 44));
            C25791Pq r2 = this.A01;
            if (r2 != null) {
                AnonymousClass3MY.A1P(this.A02, r2, 24, false);
            }
        }
    }

    public static final void A00(ImagineMeOnboardingViewModel imagineMeOnboardingViewModel) {
        ImagineMeOnboardingRequester imagineMeOnboardingRequester = imagineMeOnboardingViewModel.A0R;
        C820141r r6 = imagineMeOnboardingViewModel.A0S;
        C18070vi.A0d(r6, 0);
        AnonymousClass1E2 A092 = imagineMeOnboardingRequester.A00.A09();
        if (A092 != null) {
            A7K a7k = new A7K();
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
            graphQlCallInput2.A05("jid", A092.getRawString());
            graphQlCallInput.A06("query_input", C18070vi.A0M(graphQlCallInput2));
            a7k.A04(graphQlCallInput, "input");
            AIj aIj = new AIj(a7k, GetImagineMeOnboardedResponseImpl.class, "GetImagineMeOnboarded");
            imagineMeOnboardingRequester.A01.A01(aIj).A03(new C820241s(aIj, imagineMeOnboardingRequester, r6));
        }
    }

    public static final void A03(ImagineMeOnboardingViewModel imagineMeOnboardingViewModel, boolean z) {
        AnonymousClass4DI r4;
        int size;
        Integer num;
        int i;
        int intValue;
        AnonymousClass1G1 r3 = imagineMeOnboardingViewModel.A0O;
        switch (((AnonymousClass4DI) r3.getValue()).ordinal()) {
            case 0:
                r4 = AnonymousClass4DI.CAPTURE_SELFIE_2;
                break;
            case 1:
                r4 = AnonymousClass4DI.CAPTURE_SELFIE_3;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C133036o4 r5 = imagineMeOnboardingViewModel.A0A;
                synchronized (r5) {
                    size = r5.A04.size();
                }
                if (size <= 0 && ((num = imagineMeOnboardingViewModel.A03) == null || (intValue = num.intValue()) == -1 || intValue == 24)) {
                    C22801Dg r42 = imagineMeOnboardingViewModel.A04;
                    if (!C18070vi.A19(r42.A06(), false)) {
                        synchronized (r5) {
                            LinkedHashMap linkedHashMap = r5.A03;
                            i = 0;
                            if (!linkedHashMap.isEmpty()) {
                                Iterator A15 = AnonymousClass000.A15(linkedHashMap);
                                while (A15.hasNext()) {
                                    if (((AnonymousClass1D6) C17890vO.A0P(A15)).first != null) {
                                        i++;
                                    }
                                }
                            }
                        }
                        if (i < 3) {
                            r4 = AnonymousClass4DI.FINISHING_SELFIE_UPLOADS;
                            break;
                        } else {
                            Integer num2 = imagineMeOnboardingViewModel.A03;
                            if (num2 != null && num2.intValue() == -1) {
                                if (!C72463Mc.A1Y(r42.A06())) {
                                    r4 = AnonymousClass4DI.FINISHING_ONBOARDING_SET_ON_SERVER;
                                    break;
                                }
                            } else {
                                r4 = AnonymousClass4DI.FINISHING_ONBOARDING_MESSAGE;
                                break;
                            }
                        }
                    }
                }
                if (!z) {
                    r4 = AnonymousClass4DI.ERROR_IDLE;
                    break;
                } else {
                    r4 = AnonymousClass4DI.ERROR_RETRYING;
                    break;
                }
                break;
            case 8:
                r4 = AnonymousClass4DI.COMPLETE;
                break;
            default:
                throw AnonymousClass3MW.A14();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineMeOnboardingViewModel/goToNextCaptureStep currentStep=");
        A10.append(r3.getValue());
        C17900vP.A0Y(r4, " nextStep=", A10);
        if (r3.getValue() != r4) {
            switch (r4.ordinal()) {
                case 4:
                    imagineMeOnboardingViewModel.A0K.setValue(r4);
                    imagineMeOnboardingViewModel.A0C.registerObserver(imagineMeOnboardingViewModel.A05);
                    imagineMeOnboardingViewModel.A0D.CGF(new C21445AkC(imagineMeOnboardingViewModel, 42));
                    return;
                case 5:
                    imagineMeOnboardingViewModel.A0K.setValue(r4);
                    A00(imagineMeOnboardingViewModel);
                    return;
                case 8:
                    imagineMeOnboardingViewModel.A0C.unregisterObserver(imagineMeOnboardingViewModel.A05);
                    C38731rn r0 = imagineMeOnboardingViewModel.A06;
                    r0.A00(true);
                    C17880vN.A1F(C17890vO.A0A(r0.A01), "imagine_me_retake_onboarding_seen", false);
                    break;
            }
        }
        imagineMeOnboardingViewModel.A0K.setValue(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r2 == X.AnonymousClass4DI.A04) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S() {
        /*
            r4 = this;
            X.6o4 r3 = r4.A0A
            java.lang.String r0 = "ImagineMeSelfieUploader/cleanup start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10s r2 = r3.A01
            r1 = 44
            X.AkC r0 = new X.AkC
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.1Lg r1 = r4.A0C
            X.4mL r0 = r4.A05
            r1.unregisterObserver(r0)
            X.1G1 r0 = r4.A0O
            java.lang.Object r2 = r0.getValue()
            X.4DI r0 = X.AnonymousClass4DI.CAPTURE_SELFIE_1
            if (r2 == r0) goto L_0x002d
            X.4DI r0 = X.AnonymousClass4DI.CAPTURE_SELFIE_2
            if (r2 == r0) goto L_0x002d
            X.4DI r1 = X.AnonymousClass4DI.CAPTURE_SELFIE_3
            r0 = 0
            if (r2 != r1) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            X.1Pq r3 = r4.A01
            if (r0 == 0) goto L_0x003d
            if (r3 == 0) goto L_0x003c
            X.1BI r2 = r4.A02
            r1 = 21
            r0 = 1
            X.AnonymousClass3MY.A1P(r2, r3, r1, r0)
        L_0x003c:
            return
        L_0x003d:
            if (r3 == 0) goto L_0x003c
            r0 = 0
            r3.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel.A0S():void");
    }
}
