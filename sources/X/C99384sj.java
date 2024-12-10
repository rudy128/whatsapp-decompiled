package X;

import com.whatsapp.bot.creation.AiCreationActivity;
import com.whatsapp.calling.controls.view.MoreMenuBottomSheet;
import com.whatsapp.calling.psa.view.GroupCallPsaActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.profile.UsernameManagementFlowActivity;

/* renamed from: X.4sj  reason: invalid class name and case insensitive filesystem */
public class C99384sj implements C22841Dk, AnonymousClass1G2 {
    public final int A00;
    public final Object A01;

    public C99384sj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x036b, code lost:
        if ((r12 instanceof X.Bq4) != false) goto L_0x036d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BJt(java.lang.Object r12, X.C30391dr r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0406;
                case 1: goto L_0x0393;
                case 2: goto L_0x033e;
                case 3: goto L_0x0474;
                case 4: goto L_0x0232;
                case 5: goto L_0x01e1;
                case 6: goto L_0x00ca;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.4F2 r12 = (X.AnonymousClass4F2) r12
            java.lang.Object r7 = r11.A01
            X.3U1 r7 = (X.AnonymousClass3U1) r7
            X.46E r0 = X.AnonymousClass46E.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0025
            X.1OX r3 = X.C41561wd.A00(r7)
            X.0wl r2 = r7.A0B
            r1 = 0
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$loadSupportedLanguages$1 r0 = new com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$loadSupportedLanguages$1
            r0.<init>(r7, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
        L_0x0022:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0025:
            boolean r0 = r12 instanceof X.AnonymousClass46C
            if (r0 == 0) goto L_0x0072
            X.46C r12 = (X.AnonymousClass46C) r12
            int r10 = r12.A00
            java.util.List r0 = r7.A00
            java.lang.Object r0 = r0.get(r10)
            X.4To r0 = (X.C86914To) r0
            java.lang.String r8 = r0.A01
            java.lang.Integer r0 = r7.A07
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00be
            r0 = 2
            if (r1 == r0) goto L_0x00be
            r0 = 1
            if (r1 == r0) goto L_0x0063
            r0 = 3
            if (r1 != r0) goto L_0x0022
            X.1BI r6 = r7.A02
            if (r6 == 0) goto L_0x005d
            X.1OX r1 = X.C41561wd.A00(r7)
            X.0wl r0 = r7.A0B
            r9 = 0
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1 r5 = new com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass3MW.A1X(r0, r5, r1)
            goto L_0x0022
        L_0x005d:
            java.lang.String r0 = "TranscriptionChooseLanguageViewModel/handleLanguageSelection chatJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0022
        L_0x0063:
            X.4OD r0 = r7.A05
            X.4a3 r0 = r0.A03
            r0.A07(r8)
            X.1G4 r1 = r7.A0D
            X.46H r0 = new X.46H
            r0.<init>(r8, r10)
            goto L_0x00c5
        L_0x0072:
            boolean r0 = r12 instanceof X.AnonymousClass46D
            if (r0 == 0) goto L_0x0022
            java.util.List r0 = r7.A09
            if (r0 == 0) goto L_0x0089
            X.1OX r3 = X.C41561wd.A00(r7)
            X.0wl r2 = r7.A0B
            r1 = 0
            com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1 r0 = new com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1
            r0.<init>(r7, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
        L_0x0089:
            X.46D r12 = (X.AnonymousClass46D) r12
            int r6 = r12.A00
            java.util.List r0 = r7.A00
            java.lang.Object r0 = r0.get(r6)
            X.4To r0 = (X.C86914To) r0
            java.lang.String r5 = r0.A01
            X.4OD r4 = r7.A05
            boolean r3 = r12.A01
            r2 = 1
            X.0z4 r0 = r4.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "PREF_IS_DOWNLOAD_TRANSCRIPT_MODEL_WIFI_ONLY"
            X.C17880vN.A1F(r1, r0, r3)
            X.4a3 r0 = r4.A03
            r0.A08(r2)
            r0.A07(r5)
            X.73b r1 = r4.A01
            X.6Rq r0 = X.C122716Rq.TRANSCRIPTION
            r1.A07(r0)
            X.1G4 r1 = r7.A0D
            X.46H r0 = new X.46H
            r0.<init>(r5, r6)
            goto L_0x00c5
        L_0x00be:
            X.1G4 r1 = r7.A0D
            X.46G r0 = new X.46G
            r0.<init>(r10)
        L_0x00c5:
            r1.setValue(r0)
            goto L_0x0022
        L_0x00ca:
            X.5YJ r12 = (X.AnonymousClass5YJ) r12
            java.lang.Object r2 = r11.A01
            com.whatsapp.profile.UsernameManagementFlowActivity r2 = (com.whatsapp.profile.UsernameManagementFlowActivity) r2
            X.4pM r0 = X.C97374pM.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x00dd
            r2.onBackPressed()
            goto L_0x0022
        L_0x00dd:
            X.4pO r0 = X.C97384pO.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            r5 = 0
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "Learn more clicked"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r5)
            r0.show()
            goto L_0x0022
        L_0x00f1:
            X.4pP r0 = X.C97394pP.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0106
            com.whatsapp.profile.fragments.UsernameManagementFragment r3 = new com.whatsapp.profile.fragments.UsernameManagementFragment
            r3.<init>()
            java.lang.String r1 = "UsernameManagementFragment"
        L_0x0100:
            r0 = 1
            com.whatsapp.profile.UsernameManagementFlowActivity.A03(r3, r2, r1, r0)
            goto L_0x0022
        L_0x0106:
            X.4pW r0 = X.C97464pW.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0116
            com.whatsapp.profile.fragments.UsernameSetFragment r3 = new com.whatsapp.profile.fragments.UsernameSetFragment
            r3.<init>()
            java.lang.String r1 = "UsernameSetFragment"
            goto L_0x0100
        L_0x0116:
            X.4pQ r0 = X.C97404pQ.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0126
            com.whatsapp.profile.fragments.UsernamePinManagementFragment r3 = new com.whatsapp.profile.fragments.UsernamePinManagementFragment
            r3.<init>()
            java.lang.String r1 = "UsernamePinManagementFragment"
            goto L_0x0100
        L_0x0126:
            X.4pT r0 = X.C97434pT.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0136
            com.whatsapp.profile.fragments.UsernamePinSetFragment r3 = new com.whatsapp.profile.fragments.UsernamePinSetFragment
            r3.<init>()
            java.lang.String r1 = "UsernamePinSetFragment"
            goto L_0x0100
        L_0x0136:
            X.4pU r0 = X.C97444pU.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "UsernamePinSetFragment"
        L_0x0140:
            com.whatsapp.profile.UsernameManagementFlowActivity.A0Q(r2, r0)
            goto L_0x0022
        L_0x0145:
            X.4pS r0 = X.C97424pS.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            java.lang.String r1 = "UsernamePinDeleteConfirmationDialogFragment"
            if (r0 == 0) goto L_0x0155
            com.whatsapp.profile.UsernameManagementFlowActivity.A0Q(r2, r1)
            java.lang.String r0 = "UsernamePinManagementFragment"
            goto L_0x0140
        L_0x0155:
            X.4pR r0 = X.C97414pR.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0167
            com.whatsapp.profile.fragments.UsernamePinDeleteConfirmationDialogFragment r0 = new com.whatsapp.profile.fragments.UsernamePinDeleteConfirmationDialogFragment
            r0.<init>()
            com.whatsapp.profile.UsernameManagementFlowActivity.A03(r0, r2, r1, r5)
            goto L_0x0022
        L_0x0167:
            X.4pY r0 = X.C97484pY.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0177
            com.whatsapp.profile.fragments.UsernameStartConversationWithSettingsFragment r3 = new com.whatsapp.profile.fragments.UsernameStartConversationWithSettingsFragment
            r3.<init>()
            java.lang.String r1 = "UsernameStartConversationWithSettingsFragment"
            goto L_0x0100
        L_0x0177:
            boolean r0 = r12 instanceof X.C97364pL
            java.lang.String r1 = "UsernameSetFragment"
            if (r0 == 0) goto L_0x019f
            com.whatsapp.profile.UsernameManagementFlowActivity.A0Q(r2, r1)
            X.4pL r12 = (X.C97364pL) r12
            java.lang.String r4 = r12.A00
            java.lang.String r3 = "username"
            X.C18070vi.A0d(r4, r5)
            com.whatsapp.profile.fragments.UsernameSetSuccessDialogFragment r1 = new com.whatsapp.profile.fragments.UsernameSetSuccessDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putString(r3, r4)
            r1.A1R(r0)
            java.lang.String r0 = "UsernameSetSuccessDialogFragment"
        L_0x019a:
            com.whatsapp.profile.UsernameManagementFlowActivity.A03(r1, r2, r0, r5)
            goto L_0x0022
        L_0x019f:
            X.4pN r0 = X.AnonymousClass4pN.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x01b3
            com.whatsapp.profile.fragments.UsernameEditBottomSheetFragment r1 = new com.whatsapp.profile.fragments.UsernameEditBottomSheetFragment
            r1.<init>()
            java.lang.String r0 = "UsernameEditBottomSheetFragment"
            r2.CMm(r1, r0)
            goto L_0x0022
        L_0x01b3:
            X.4pV r0 = X.C97454pV.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x01c3
            com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment r1 = new com.whatsapp.profile.fragments.UsernameDeleteConfirmationDialogFragment
            r1.<init>()
            java.lang.String r0 = "UsernameDeleteConfirmationDialogFragment"
            goto L_0x019a
        L_0x01c3:
            X.4pZ r0 = X.C97494pZ.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x01d0
            com.whatsapp.profile.UsernameManagementFlowActivity.A0Q(r2, r1)
            goto L_0x0022
        L_0x01d0:
            X.4pX r0 = X.C97474pX.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0483
            com.whatsapp.profile.fragments.UsernameShareFragment r3 = new com.whatsapp.profile.fragments.UsernameShareFragment
            r3.<init>()
            java.lang.String r1 = "UsernameShareFragment"
            goto L_0x0100
        L_0x01e1:
            java.lang.Object r4 = r11.A01
            X.4jJ r4 = (X.C93644jJ) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MetaAiRtcVoiceManager/onNewBotCallState "
            X.C17900vP.A0Y(r12, r0, r1)
            java.lang.Runnable r1 = r4.A02
            if (r1 == 0) goto L_0x01fe
            X.00H r0 = r4.A0P
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            r0.CEz(r1)
            r0 = 0
            r4.A02 = r0
        L_0x01fe:
            X.4D6 r0 = X.AnonymousClass4D6.CONNECTED
            if (r12 == r0) goto L_0x0022
            X.00H r0 = r4.A0I
            java.lang.Object r1 = r0.get()
            X.11E r1 = (X.AnonymousClass11E) r1
            r0 = 1
            int r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0228
            X.00H r0 = r4.A0P
            X.10I r3 = X.AnonymousClass3MX.A0x(r0)
            r0 = 32
            X.3Bs r2 = new X.3Bs
            r2.<init>(r4, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            X.25d r0 = r3.CGv(r2, r0)
            r4.A02 = r0
            goto L_0x0022
        L_0x0228:
            java.lang.String r0 = "MetaAiRtcVoiceManager/onNewBotCallState no internet connection, trigger timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C93644jJ.A00(r4)
            goto L_0x0022
        L_0x0232:
            com.whatsapp.voipcalling.CallInfo r12 = (com.whatsapp.voipcalling.CallInfo) r12
            java.lang.Object r6 = r11.A01
            X.4jJ r6 = (X.C93644jJ) r6
            if (r12 == 0) goto L_0x0272
            com.whatsapp.voipcalling.CallState r1 = r12.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0272
            boolean r0 = r12.isBotCall
            if (r0 == 0) goto L_0x0272
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0269
            X.6qE r0 = r12.self
            r7 = 1
            if (r0 == 0) goto L_0x025e
            boolean r0 = r0.A0J
            if (r0 != r7) goto L_0x025e
        L_0x0251:
            X.0vl r0 = r6.A0R
            X.1G4 r2 = X.AnonymousClass3MW.A17(r0)
            X.4D6 r0 = X.AnonymousClass4D6.RECONNECTING
        L_0x0259:
            r2.setValue(r0)
            goto L_0x0022
        L_0x025e:
            X.6qE r0 = r12.getDefaultPeerInfo()
            if (r0 == 0) goto L_0x029f
            boolean r0 = r0.A0J
            if (r0 != r7) goto L_0x029f
            goto L_0x0251
        L_0x0269:
            X.0vl r0 = r6.A0R
            X.1G4 r2 = X.AnonymousClass3MW.A17(r0)
            X.4D6 r0 = X.AnonymousClass4D6.CALLING
            goto L_0x0259
        L_0x0272:
            X.0vl r3 = r6.A0R
            X.1G4 r0 = X.AnonymousClass3MW.A17(r3)
            java.lang.Object r0 = r0.getValue()
            X.4D6 r2 = X.AnonymousClass4D6.NONE
            if (r0 == r2) goto L_0x0022
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = r6.A01
            if (r0 == 0) goto L_0x028b
            X.1DT r1 = r0.A0D
            X.6RF r0 = X.AnonymousClass6RF.ENDED
            r1.A0E(r0)
        L_0x028b:
            X.1G4 r0 = X.AnonymousClass3MW.A17(r3)
            r0.setValue(r2)
            X.0vl r0 = r6.A0S
            X.1G4 r2 = X.AnonymousClass3MW.A17(r0)
            r1 = 0
            X.4YD r0 = new X.4YD
            r0.<init>(r1, r1)
            goto L_0x0259
        L_0x029f:
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x02c7
            X.00H r0 = r6.A0E
            java.lang.Object r4 = r0.get()
            X.9mr r4 = (X.C191599mr) r4
            java.lang.String r3 = r12.callId
            X.C18070vi.A0X(r3)
            java.util.concurrent.ConcurrentHashMap r2 = r4.A04
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x02c5
            X.11P r1 = r4.A01
            X.11S r0 = r4.A00
            java.lang.String r0 = X.AnonymousClass1PP.A00(r0, r1, r7)
            r2.put(r3, r0)
        L_0x02c5:
            r6.A03 = r0
        L_0x02c7:
            X.0vl r5 = r6.A0R
            X.1G4 r0 = X.AnonymousClass3MW.A17(r5)
            java.lang.Object r0 = r0.getValue()
            X.4D6 r4 = X.AnonymousClass4D6.CONNECTED
            if (r0 == r4) goto L_0x0326
            java.lang.String r0 = "MetaAiRtcVoiceManager/updateCallState CONNECTED"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r8 = r6.A01
            if (r8 == 0) goto L_0x031b
            java.lang.String r3 = r6.A03
            X.1DT r1 = r8.A0D
            X.6RF r0 = X.AnonymousClass6RF.LISTENING
            r1.A0E(r0)
            X.4XB r2 = r8.A0J
            java.lang.Integer r0 = r8.A01
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r1.A0D = r3
            X.AnonymousClass3MZ.A1T(r1, r0)
            r0 = 82
            X.AnonymousClass4XB.A00(r1, r2, r0)
            if (r3 == 0) goto L_0x0300
            X.6ya r0 = r8.A0I
            r0.A04 = r3
        L_0x0300:
            X.00H r0 = r8.A0U
            java.lang.Object r3 = r0.get()
            boolean r0 = r3 instanceof X.C93644jJ
            r2 = 0
            if (r0 == 0) goto L_0x031b
            X.4jJ r3 = (X.C93644jJ) r3
            if (r3 == 0) goto L_0x031b
            X.1OX r1 = X.C41561wd.A00(r8)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel$onListeningStarted$2$1 r0 = new com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel$onListeningStarted$2$1
            r0.<init>(r3, r8, r2)
            X.AnonymousClass3MX.A1Q(r0, r1)
        L_0x031b:
            X.A99 r1 = r6.A00
            if (r1 != 0) goto L_0x032f
            r6.A0C = r7
            java.lang.String r0 = "MetaAiRtcVoiceManager voice service is null, pending speaker/mic update"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0326:
            X.1G4 r0 = X.AnonymousClass3MW.A17(r5)
            r0.setValue(r4)
            goto L_0x0022
        L_0x032f:
            boolean r0 = r6.A0B
            r1.A19(r0)
            boolean r0 = r6.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0z(r0)
            goto L_0x0326
        L_0x033e:
            java.lang.Object r5 = r11.A01
            com.whatsapp.calling.psa.view.GroupCallPsaActivity r5 = (com.whatsapp.calling.psa.view.GroupCallPsaActivity) r5
            boolean r0 = r12 instanceof X.Bq3
            if (r0 == 0) goto L_0x0369
            X.0ve r2 = r5.A0E
            r1 = 5710(0x164e, float:8.001E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x036d
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r2 = new com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet
            r2.<init>()
            X.5EA r0 = new X.5EA
            r0.<init>(r5)
            r2.A02 = r0
            X.1GP r1 = r5.getSupportFragmentManager()
            java.lang.String r0 = "GroupCallPsaBottomSheet"
            r2.A2C(r1, r0)
            goto L_0x0022
        L_0x0369:
            boolean r0 = r12 instanceof X.Bq4
            if (r0 == 0) goto L_0x0022
        L_0x036d:
            r4 = 48
            r3 = 0
            android.content.Intent r2 = X.AnonymousClass3MZ.A07(r5, r3)
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "hidden_jids"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "call_from_ui"
            r1.putExtra(r0, r4)
            r5.startActivity(r1)
            r5.finish()
            goto L_0x0022
        L_0x0393:
            X.4U1 r12 = (X.AnonymousClass4U1) r12
            java.lang.Object r3 = r11.A01
            com.whatsapp.calling.controls.view.MoreMenuBottomSheet r3 = (com.whatsapp.calling.controls.view.MoreMenuBottomSheet) r3
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.1w3 r1 = (X.C41251w3) r1
            java.util.List r0 = r12.A02
            r1.A0W(r0)
            X.4EA r4 = r12.A01
            boolean r0 = r4 instanceof X.C76223mo
            r2 = 8
            r1 = 0
            if (r0 == 0) goto L_0x03f3
            com.whatsapp.WaImageView r0 = r3.A01
            if (r0 == 0) goto L_0x03b6
            r0.setVisibility(r1)
        L_0x03b6:
            com.whatsapp.WaTextView r0 = r3.A03
            if (r0 == 0) goto L_0x03bd
            r0.setVisibility(r1)
        L_0x03bd:
            com.whatsapp.WaTextView r1 = r3.A03
            if (r1 == 0) goto L_0x03c9
            r0 = r4
            X.3mo r0 = (X.C76223mo) r0
            int r0 = r0.A01
            r1.setText(r0)
        L_0x03c9:
            com.whatsapp.WaImageView r1 = r3.A01
            if (r1 == 0) goto L_0x03d4
            X.3mo r4 = (X.C76223mo) r4
            int r0 = r4.A00
            r1.setImageResource(r0)
        L_0x03d4:
            com.whatsapp.WaTextView r1 = r3.A02
            if (r1 == 0) goto L_0x03e3
            X.4T8 r0 = r12.A00
            int r0 = r0.A00
            java.lang.String r0 = r3.A1H(r0)
            X.AnonymousClass3MY.A1X(r0, r1)
        L_0x03e3:
            com.whatsapp.WaImageView r1 = r3.A00
            if (r1 == 0) goto L_0x0022
            X.4T8 r0 = r12.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x03ee
            r2 = 0
        L_0x03ee:
            r1.setVisibility(r2)
            goto L_0x0022
        L_0x03f3:
            boolean r0 = r4 instanceof X.C76233mp
            if (r0 == 0) goto L_0x03d4
            com.whatsapp.WaImageView r0 = r3.A01
            if (r0 == 0) goto L_0x03fe
            r0.setVisibility(r2)
        L_0x03fe:
            com.whatsapp.WaTextView r0 = r3.A03
            if (r0 == 0) goto L_0x03d4
            r0.setVisibility(r2)
            goto L_0x03d4
        L_0x0406:
            java.lang.Object r4 = r11.A01
            X.1FU r4 = (X.AnonymousClass1FU) r4
            X.4Xq r0 = X.C87924Xq.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0426
            X.1GP r1 = r4.getSupportFragmentManager()
            int r0 = r1.A0K()
            if (r0 <= 0) goto L_0x0421
            r1.A0b()
            goto L_0x0022
        L_0x0421:
            r4.onBackPressed()
            goto L_0x0022
        L_0x0426:
            X.4Xr r0 = X.C87934Xr.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0454
            com.whatsapp.bot.creation.DescribeAiFragment r3 = new com.whatsapp.bot.creation.DescribeAiFragment
            r3.<init>()
            java.lang.String r2 = "DescribeAiFragment"
        L_0x0435:
            X.1GP r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.A0Q(r2)
            if (r0 != 0) goto L_0x0022
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r4)
            r0 = 2131431000(0x7f0b0e58, float:1.8483717E38)
            r1.A0D(r3, r2, r0)
            r1.A0H(r2)
            X.C72473Md.A19(r1)
            r1.A01()
            goto L_0x0022
        L_0x0454:
            X.4Xt r0 = X.C87954Xt.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0464
            com.whatsapp.bot.creation.QuickCreateFragment r3 = new com.whatsapp.bot.creation.QuickCreateFragment
            r3.<init>()
            java.lang.String r2 = "QuickCreateFragment"
            goto L_0x0435
        L_0x0464:
            X.4Xs r0 = X.C87944Xs.A00
            boolean r0 = X.C18070vi.A18(r12, r0)
            if (r0 == 0) goto L_0x0022
            com.whatsapp.bot.creation.EditAvatarFragment r3 = new com.whatsapp.bot.creation.EditAvatarFragment
            r3.<init>()
            java.lang.String r2 = "EditAvatarFragment"
            goto L_0x0435
        L_0x0474:
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r0 = r11.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A03(r0, r12, r13)
            java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)
            return r0
        L_0x0483:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99384sj.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }

    public final C18080vj BS6() {
        Class cls;
        String str;
        int i;
        int i2;
        String str2;
        int i3 = this.A00;
        Object obj = this.A01;
        switch (i3) {
            case 0:
                cls = AiCreationActivity.class;
                str = "navigate(Lcom/whatsapp/bot/creation/data/AiCreationDestination;)V";
                i = 4;
                i2 = 2;
                str2 = "navigate";
                break;
            case 1:
                cls = MoreMenuBottomSheet.class;
                str = "applyUiState(Lcom/whatsapp/calling/controls/viewmodel/MoreMenuUiState;)V";
                i = 4;
                i2 = 2;
                str2 = "applyUiState";
                break;
            case 2:
                cls = GroupCallPsaActivity.class;
                str = "handleSuggestionResult(Lcom/whatsapp/calling/psa/viewmodel/SuggestionResult;)V";
                i = 4;
                i2 = 2;
                str2 = "handleSuggestionResult";
                break;
            case 3:
                return new AnonymousClass1JJ(2, obj, MemberSuggestedGroupsManagementViewModel.class, "onLoadingStates", "onLoadingStates(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 4:
                cls = C93644jJ.class;
                str = "updateCallState(Lcom/whatsapp/voipcalling/CallInfo;)V";
                i = 4;
                i2 = 2;
                str2 = "updateCallState";
                break;
            case 5:
                cls = C93644jJ.class;
                str = "onNewBotCallState(Lcom/whatsapp/metaai/voice/MetaAiRtcVoiceManager$BotCallState;)V";
                i = 4;
                i2 = 2;
                str2 = "onNewBotCallState";
                break;
            case 6:
                cls = UsernameManagementFlowActivity.class;
                str = "navigate(Lcom/whatsapp/profile/data/UsernameNavigation;)V";
                i = 4;
                i2 = 2;
                str2 = "navigate";
                break;
            default:
                cls = AnonymousClass3U1.class;
                str = "handleIntent(Lcom/whatsapp/ptt/language/ui/TranscriptionChooseLanguageIntent;)V";
                i = 4;
                i2 = 2;
                str2 = "handleIntent";
                break;
        }
        return new C445423v(i2, obj, cls, str2, str, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1G2) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C18070vi.A18(BS6(), ((C22841Dk) obj).BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }
}
