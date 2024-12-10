package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.4sN  reason: invalid class name and case insensitive filesystem */
public class C99164sN implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C99164sN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass4bI A00(C99164sN r1) {
        AnonymousClass4bI r12 = (AnonymousClass4bI) r1.A01;
        C18070vi.A0d(r12, 0);
        return r12;
    }

    public static C18110vm A01(Object obj, int i) {
        return AnonymousClass1DF.A01(new C99164sN(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r1 == false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0123;
                case 1: goto L_0x012f;
                case 2: goto L_0x013b;
                case 3: goto L_0x0012;
                case 4: goto L_0x0046;
                case 5: goto L_0x0151;
                case 6: goto L_0x0160;
                case 7: goto L_0x016f;
                case 8: goto L_0x017e;
                case 9: goto L_0x0188;
                case 10: goto L_0x01a4;
                case 11: goto L_0x01af;
                case 12: goto L_0x01c4;
                case 13: goto L_0x0084;
                case 14: goto L_0x0236;
                case 15: goto L_0x005c;
                case 16: goto L_0x024b;
                case 17: goto L_0x0263;
                case 18: goto L_0x0278;
                case 19: goto L_0x0289;
                case 20: goto L_0x02aa;
                case 21: goto L_0x02be;
                case 22: goto L_0x02d2;
                case 23: goto L_0x02e9;
                case 24: goto L_0x0300;
                case 25: goto L_0x0326;
                case 26: goto L_0x0343;
                case 27: goto L_0x035b;
                case 28: goto L_0x03a2;
                case 29: goto L_0x03b8;
                case 30: goto L_0x03c5;
                case 31: goto L_0x03d5;
                case 32: goto L_0x03e5;
                case 33: goto L_0x03f5;
                case 34: goto L_0x0405;
                case 35: goto L_0x040c;
                case 36: goto L_0x00d4;
                case 37: goto L_0x0429;
                case 38: goto L_0x0445;
                case 39: goto L_0x04a5;
                case 40: goto L_0x04b5;
                case 41: goto L_0x04cf;
                case 42: goto L_0x04dc;
                case 43: goto L_0x04f5;
                case 44: goto L_0x0508;
                case 45: goto L_0x051b;
                case 46: goto L_0x052e;
                case 47: goto L_0x054d;
                case 48: goto L_0x056a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A01
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 1
            X.5yZ r5 = new X.5yZ
            r5.<init>(r1, r0)
        L_0x0011:
            return r5
        L_0x0012:
            java.lang.Object r1 = r11.A01
            com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment r1 = (com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment) r1
            X.1FL r3 = r1.A1D()
            X.00H r0 = r1.A0B
            if (r0 == 0) goto L_0x0043
            r0.get()
            X.00H r0 = r1.A0C
            if (r0 == 0) goto L_0x0040
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.18K r2 = (X.AnonymousClass18K) r2
            r1 = 6
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            java.lang.String r2 = X.C83974Hj.A00(r2, r1)
            r1 = 4
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1U(r3, r2, r0, r1)
            r3.startActivity(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0040:
            java.lang.String r0 = "wamRuntime"
            goto L_0x007f
        L_0x0043:
            java.lang.String r0 = "waIntents"
            goto L_0x007f
        L_0x0046:
            java.lang.Object r0 = r11.A01
            com.whatsapp.messaging.ViewOnceAudioFragment r0 = (com.whatsapp.messaging.ViewOnceAudioFragment) r0
            X.1Vd r2 = r0.A00
            if (r2 == 0) goto L_0x0059
            android.content.Context r1 = r0.A14()
            java.lang.String r0 = "conversation-row-inflater"
            X.1pZ r5 = r2.A06(r1, r0)
            return r5
        L_0x0059:
            java.lang.String r0 = "contactPhotos"
            goto L_0x007f
        L_0x005c:
            java.lang.Object r3 = r11.A01
            com.whatsapp.passkeys.PasskeyCreateEducationScreen r3 = (com.whatsapp.passkeys.PasskeyCreateEducationScreen) r3
            X.0ve r2 = r3.A0E
            r1 = 10791(0x2a27, float:1.5121E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0077
            X.0zA r0 = r3.A00
            if (r0 == 0) goto L_0x007d
            boolean r1 = r0.A07()
            r0 = 1
            if (r1 != 0) goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x007d:
            java.lang.String r0 = "smbOnboardingAnalyticsManager"
        L_0x007f:
            X.C18070vi.A11(r0)
            goto L_0x0114
        L_0x0084:
            java.lang.Object r2 = r11.A01
            X.4VA r2 = (X.AnonymousClass4VA) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.List r1 = r2.A04
            java.util.List r0 = r2.A01
            java.util.ArrayList r1 = X.C29431cG.A0k(r0, r1)
            java.util.List r0 = r2.A02
            java.util.ArrayList r1 = X.C29431cG.A0k(r0, r1)
            java.util.List r0 = r2.A00
            java.util.ArrayList r1 = X.C29431cG.A0k(r0, r1)
            java.util.List r0 = r2.A03
            java.util.ArrayList r0 = X.C29431cG.A0k(r0, r1)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r0.iterator()
        L_0x00ae:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.4cY r0 = (X.C89494cY) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r0.A02()
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 3
            if (r2 == r0) goto L_0x00d0
            r0 = 2
            if (r2 == r0) goto L_0x00d0
            if (r2 == r1) goto L_0x00d0
            r0 = 4
            if (r2 == r0) goto L_0x00d0
            goto L_0x00ae
        L_0x00d0:
            r5.add(r3)
            goto L_0x00ae
        L_0x00d4:
            java.util.LinkedHashMap r5 = X.C17880vN.A13()
            r0 = 6
            java.lang.Integer[] r3 = new java.lang.Integer[r0]
            r0 = 0
            X.AnonymousClass3MX.A1R(r3, r0)
            r2 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            r3[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 2
            r3[r1] = r0
            r0 = 3
            X.AnonymousClass3MX.A1R(r3, r0)
            r0 = 4
            X.AnonymousClass3MX.A1R(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.List r0 = X.C18070vi.A0O(r0, r3, r2)
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0103:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            if (r2 >= 0) goto L_0x0116
            X.AnonymousClass1ZU.A0B()
        L_0x0114:
            r0 = 0
            throw r0
        L_0x0116:
            int r0 = X.AnonymousClass000.A0M(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C17880vN.A1P(r0, r5, r2)
            r2 = r1
            goto L_0x0103
        L_0x0123:
            java.lang.Object r1 = r11.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131429095(0x7f0b06e7, float:1.8479853E38)
            android.view.View r5 = r1.findViewById(r0)
            return r5
        L_0x012f:
            java.lang.Object r1 = r11.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131429096(0x7f0b06e8, float:1.8479855E38)
            android.view.View r5 = r1.findViewById(r0)
            return r5
        L_0x013b:
            java.lang.Object r2 = r11.A01
            X.4VM r2 = (X.AnonymousClass4VM) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "lid_message_store_migration_"
            r1.append(r0)
            java.lang.String r0 = r2.A01()
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r1)
            return r5
        L_0x0151:
            java.lang.Object r1 = r11.A01
            X.4jJ r1 = (X.C93644jJ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A0R
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x0160:
            java.lang.Object r1 = r11.A01
            X.4jJ r1 = (X.C93644jJ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A0S
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x016f:
            java.lang.Object r1 = r11.A01
            X.4jJ r1 = (X.C93644jJ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A0Q
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x017e:
            java.lang.Object r0 = r11.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0188:
            java.lang.Object r0 = r11.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet) r0
            X.0vl r0 = r0.A0S
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r1 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x01a1
            r0 = 1
            r1.A07 = r0
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A03(r1)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A00(r1)
        L_0x01a1:
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x01a4:
            java.lang.Object r0 = r11.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            X.1DT r0 = r0.A0D
            X.1Dg r5 = X.C22791Df.A00(r0)
            return r5
        L_0x01af:
            java.lang.Object r3 = r11.A01
            X.4WS r2 = new X.4WS
            r2.<init>()
            r0 = 39
            X.7SB r1 = new X.7SB
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.Class<X.5iT> r0 = X.C111155iT.class
            X.4g2 r5 = X.AnonymousClass4WS.A00(r2, r0, r1)
            return r5
        L_0x01c4:
            java.lang.Object r2 = r11.A01
            X.4VA r2 = (X.AnonymousClass4VA) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.List r0 = r2.A04
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x01d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e0
            A02(r6, r1)
            goto L_0x01d6
        L_0x01e0:
            java.util.List r0 = r2.A01
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x01ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01f4
            A02(r7, r1)
            goto L_0x01ea
        L_0x01f4:
            java.util.List r0 = r2.A02
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x01fe:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0208
            A02(r8, r1)
            goto L_0x01fe
        L_0x0208:
            java.util.List r0 = r2.A00
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0212:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021c
            A02(r9, r1)
            goto L_0x0212
        L_0x021c:
            java.util.List r0 = r2.A03
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0226:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0230
            A02(r10, r1)
            goto L_0x0226
        L_0x0230:
            X.4VA r5 = new X.4VA
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0236:
            java.lang.Object r2 = r11.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 23
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.runOnUiThread(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x024b:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x025c
            java.lang.String r0 = ""
            X.205 r5 = X.AnonymousClass4aU.A03(r1, r0)
            if (r5 == 0) goto L_0x025c
            return r5
        L_0x025c:
            java.lang.String r0 = "Could not retrieve message key from arguments bundle."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0263:
            java.lang.Object r0 = r11.A01
            X.00H r0 = (X.AnonymousClass00H) r0
            java.lang.Object r1 = r0.get()
            X.1ht r1 = (X.C32871ht) r1
            java.lang.Class<X.20q> r0 = X.C437120q.class
            X.20F r0 = X.AnonymousClass3MW.A15(r0)
            X.20Z r5 = r1.A00(r0)
            return r5
        L_0x0278:
            java.lang.Object r1 = r11.A01
            X.4Mp r1 = (X.C85234Mp) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "pref_consumer_marketing_disclosure_cooldown"
            android.content.SharedPreferences r5 = r1.A05(r0)
            return r5
        L_0x0289:
            java.lang.Object r2 = r11.A01
            com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment r2 = (com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment) r2
            X.0vl r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernameSetViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameSetViewModel) r1
            X.00H r0 = r1.A07
            java.lang.Object r0 = r0.get()
            X.5bg r0 = (X.C108425bg) r0
            r0.BIO(r1)
            X.1FL r0 = r2.A1D()
            r0.finish()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x02aa:
            java.lang.Object r0 = r11.A01
            com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment r0 = (com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment) r0
            X.0vl r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.3U6 r1 = (X.AnonymousClass3U6) r1
            X.4pM r0 = X.C97374pM.A00
            r1.A0T(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x02be:
            java.lang.Object r0 = r11.A01
            com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment r0 = (com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment) r0
            X.0vl r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.3U6 r1 = (X.AnonymousClass3U6) r1
            X.4pO r0 = X.C97384pO.A00
            r1.A0T(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x02d2:
            java.lang.Object r2 = r11.A01
            com.whatsapp.profile.fragments.UsernameEditBottomSheetFragment r2 = (com.whatsapp.profile.fragments.UsernameEditBottomSheetFragment) r2
            X.0vl r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            X.3U6 r1 = (X.AnonymousClass3U6) r1
            X.4pW r0 = X.C97464pW.A00
            r1.A0T(r0)
            r2.A29()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x02e9:
            java.lang.Object r2 = r11.A01
            com.whatsapp.profile.fragments.UsernameEditBottomSheetFragment r2 = (com.whatsapp.profile.fragments.UsernameEditBottomSheetFragment) r2
            X.0vl r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            X.3U6 r1 = (X.AnonymousClass3U6) r1
            X.4pV r0 = X.C97454pV.A00
            r1.A0T(r0)
            r2.A29()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0300:
            java.lang.Object r0 = r11.A01
            com.whatsapp.profile.fragments.UsernamePinDeleteConfirmationDialogFragment r0 = (com.whatsapp.profile.fragments.UsernamePinDeleteConfirmationDialogFragment) r0
            X.0vl r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r3 = (com.whatsapp.profile.viewmodel.UsernamePinSetViewModel) r3
            X.1OB r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x0314
            r0.BEM(r2)
        L_0x0314:
            X.1OX r1 = X.C41561wd.A00(r3)
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$deletePin$1 r0 = new com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$deletePin$1
            r0.<init>(r3, r2)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r1)
            r3.A00 = r0
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0326:
            java.lang.Object r3 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel r3 = (com.whatsapp.profile.viewmodel.UsernameNavigationViewModel) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.2Ka r0 = r3.A00
            r0.registerObserver(r3)
            X.1OX r2 = X.C41561wd.A00(r3)
            r1 = 0
            com.whatsapp.profile.viewmodel.UsernameNavigationViewModel$onStartAction$1$1 r0 = new com.whatsapp.profile.viewmodel.UsernameNavigationViewModel$onStartAction$1$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0343:
            java.lang.Object r3 = r11.A01
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r3 = (com.whatsapp.profile.viewmodel.UsernamePinSetViewModel) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1OX r2 = X.C41561wd.A00(r3)
            r1 = 0
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$fetchPin$1$1 r0 = new com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$fetchPin$1$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x035b:
            java.lang.Object r4 = r11.A01
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r4 = (com.whatsapp.profile.viewmodel.UsernamePinSetViewModel) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.4bI r7 = r4.A03
            X.0vl r0 = r7.A05
            X.1Fz r3 = X.AnonymousClass3MX.A18(r0)
            X.1G4 r2 = r4.A06
            X.1G4 r1 = r4.A07
            X.5Ad r0 = X.AnonymousClass5Ad.A00
            X.4sr r2 = X.AnonymousClass4Z8.A01(r0, r3, r2, r1)
            r1 = 0
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$usernamePinViewState$2$3 r0 = new com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$usernamePinViewState$2$3
            r0.<init>(r4, r1)
            X.DXs r6 = X.AnonymousClass3MZ.A0L(r0, r2)
            X.1OX r5 = X.C41561wd.A00(r4)
            X.5cA r4 = X.AnonymousClass4ZC.A00
            X.0vl r0 = r7.A04
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "username_pin"
            java.lang.String r3 = X.C17880vN.A0r(r1, r0)
            if (r3 != 0) goto L_0x0395
            java.lang.String r3 = ""
        L_0x0395:
            r2 = 0
            X.9I3 r1 = X.AnonymousClass9I3.ENABLED
            X.Clz r0 = new X.Clz
            r0.<init>(r1, r3, r2)
            X.1jt r5 = X.AnonymousClass4Z7.A01(r0, r5, r6, r4)
            return r5
        L_0x03a2:
            java.lang.Object r1 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameSetViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameSetViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A07
            java.lang.Object r0 = r0.get()
            X.5bg r0 = (X.C108425bg) r0
            r0.Bb8(r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x03b8:
            java.lang.Object r0 = r11.A01
            X.11S r0 = (X.AnonymousClass11S) r0
            java.lang.String r0 = r0.A0C()
            X.1G7 r5 = X.C34071js.A00(r0)
            return r5
        L_0x03c5:
            java.lang.Object r1 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameSettingsViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameSettingsViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A01
            X.C72453Mb.A1Q(r0, r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x03d5:
            java.lang.Object r1 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameShareViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameShareViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A03
            X.C72453Mb.A1Q(r0, r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x03e5:
            java.lang.Object r1 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A02
            X.C72453Mb.A1Q(r0, r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x03f5:
            java.lang.Object r1 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameViewModel r1 = (com.whatsapp.profile.viewmodel.UsernameViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A03
            X.C72453Mb.A1Q(r0, r1)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0405:
            java.lang.Object r0 = r11.A01
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            X.77M r5 = r0.A0C
            return r5
        L_0x040c:
            java.lang.Object r3 = r11.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            X.0z4 r0 = r3.A0A
            r2 = 1
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "native_contacts_upsell_banner_is_shown"
            X.C17880vN.A1F(r1, r0, r2)
            com.whatsapp.wds.components.banners.WDSBanner r1 = r3.A0g
            r0 = 8
            r1.setVisibility(r0)
            r5 = 0
            return r5
        L_0x0429:
            java.lang.Object r4 = r11.A01
            X.0vd r4 = (X.C18020vd) r4
            r3 = 0
            r0 = 1
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            X.4D0 r1 = X.AnonymousClass4D0.FAVORITES
            r0 = 7815(0x1e87, float:1.0951E-41)
            float r0 = r4.A0E(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.AnonymousClass1D6.A03(r1, r0, r2, r3)
            java.util.HashMap r5 = X.AnonymousClass1D7.A07(r2)
            return r5
        L_0x0445:
            java.lang.Object r3 = r11.A01
            X.0vd r3 = (X.C18020vd) r3
            r4 = 0
            r0 = 5
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PRESENCE
            r0 = 7278(0x1c6e, float:1.0199E-41)
            float r0 = r3.A0E(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.AnonymousClass1D6.A03(r1, r0, r2, r4)
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PROFILE_PICTURE
            r0 = 7277(0x1c6d, float:1.0197E-41)
            float r0 = r3.A0E(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)
            r0 = 1
            r2[r0] = r1
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.NEW_USER
            r0 = 7275(0x1c6b, float:1.0194E-41)
            float r0 = r3.A0E(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.C72463Mc.A1I(r1, r0, r2)
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.LAST_ACTIVE
            r0 = 7276(0x1c6c, float:1.0196E-41)
            float r0 = r3.A0E(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.C72463Mc.A1J(r1, r0, r2)
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.AREA_CODE
            r0 = 7522(0x1d62, float:1.054E-41)
            float r0 = r3.A0E(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)
            r0 = 4
            r2[r0] = r1
            java.util.HashMap r5 = X.AnonymousClass1D7.A07(r2)
            return r5
        L_0x04a5:
            X.4bI r2 = A00(r11)
            X.0vc r1 = r2.A00
            java.lang.String r0 = "username_prefs"
            android.content.SharedPreferences r5 = r1.A05(r0)
            r5.registerOnSharedPreferenceChangeListener(r2)
            return r5
        L_0x04b5:
            X.4bI r0 = A00(r11)
            X.0vl r0 = r0.A04
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "username_pin"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            if (r0 != 0) goto L_0x04c9
            java.lang.String r0 = ""
        L_0x04c9:
            X.1G7 r5 = new X.1G7
            r5.<init>(r0)
            return r5
        L_0x04cf:
            X.4bI r0 = A00(r11)
            X.4Cd r0 = r0.A00()
            X.1G7 r5 = X.C34071js.A00(r0)
            return r5
        L_0x04dc:
            X.4bI r0 = A00(r11)
            X.0vl r0 = r0.A04
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "username_share_include_pin"
            boolean r0 = X.AnonymousClass3MX.A1T(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1G7 r5 = X.C34071js.A00(r0)
            return r5
        L_0x04f5:
            X.4bI r0 = A00(r11)
            X.0vl r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            X.1G1 r1 = (X.AnonymousClass1G1) r1
            r0 = 0
            X.1jt r5 = new X.1jt
            r5.<init>(r0, r1)
            return r5
        L_0x0508:
            X.4bI r0 = A00(r11)
            X.0vl r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.1G1 r1 = (X.AnonymousClass1G1) r1
            r0 = 0
            X.1jt r5 = new X.1jt
            r5.<init>(r0, r1)
            return r5
        L_0x051b:
            X.4bI r0 = A00(r11)
            X.0vl r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            X.1G1 r1 = (X.AnonymousClass1G1) r1
            r0 = 0
            X.1jt r5 = new X.1jt
            r5.<init>(r0, r1)
            return r5
        L_0x052e:
            java.lang.Object r4 = r11.A01
            X.4a3 r4 = (X.C88534a3) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0vl r0 = r4.A04
            X.1Fz r3 = X.AnonymousClass3MX.A18(r0)
            X.1G1 r2 = r4.A06
            r1 = 0
            com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$userSettingIsEnabledFlow$2$1 r0 = new com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$userSettingIsEnabledFlow$2$1
            r0.<init>(r4, r1)
            X.4ss r0 = X.AnonymousClass4Z8.A00(r0, r3, r2)
            X.1Fz r5 = X.C26092CsA.A02(r0)
            return r5
        L_0x054d:
            java.lang.Object r0 = r11.A01
            X.4a3 r0 = (X.C88534a3) r0
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "voice_message_transcription_enabled"
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1G7 r5 = X.C34071js.A00(r0)
            return r5
        L_0x056a:
            java.lang.Object r4 = r11.A01
            X.4a3 r4 = (X.C88534a3) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0vl r0 = r4.A04
            X.1Fz r3 = X.AnonymousClass3MX.A18(r0)
            X.1G1 r2 = r4.A06
            r1 = 0
            com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1 r0 = new com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1
            r0.<init>(r4, r1)
            X.4ss r5 = X.AnonymousClass4Z8.A00(r0, r3, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99164sN.invoke():java.lang.Object");
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        int ordinal = ((C89494cY) next).A02().ordinal();
        if (ordinal == 3 || ordinal == 2 || ordinal == 5 || ordinal == 6) {
            abstractCollection.add(next);
        }
    }
}
