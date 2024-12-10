package X;

/* renamed from: X.7S8  reason: invalid class name */
public class AnonymousClass7S8 implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7S8(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v39, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03f1, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fa, code lost:
        if (r1 != 401) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0211, code lost:
        if (r1 <= r2.A01) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0213, code lost:
        r5 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 1: goto L_0x04c2;
                case 2: goto L_0x0005;
                case 3: goto L_0x04ac;
                case 4: goto L_0x0405;
                case 5: goto L_0x0283;
                case 6: goto L_0x0260;
                case 7: goto L_0x0243;
                case 8: goto L_0x022e;
                case 9: goto L_0x01bd;
                case 10: goto L_0x0076;
                case 11: goto L_0x0045;
                case 12: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.A6Z r12 = (X.A6Z) r12
            r2 = 0
            X.C18070vi.A0d(r12, r2)
            java.lang.Object r1 = r11.A01
            X.1dr r1 = (X.C30391dr) r1
            X.7Fh r0 = X.C25651Pb.A00(r12)
            r1.resumeWith(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x001b:
            java.lang.Object r1 = r11.A01
            X.6pB r1 = (X.AnonymousClass6pB) r1
            java.lang.Object r3 = r11.A02
            X.01E r3 = (X.AnonymousClass01E) r3
            X.00H r0 = r1.A02
            java.lang.Object r2 = r0.get()
            X.721 r2 = (X.AnonymousClass721) r2
            java.lang.String r6 = "app_settings"
            X.11S r0 = r1.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A01(r0)
            java.lang.String r8 = r0.getRawString()
            r0 = 1
            X.7C1 r4 = new X.7C1
            r4.<init>(r3, r1, r0)
            r5 = 0
            java.lang.String r7 = "settings"
            r2.A03(r3, r4, r5, r6, r7, r8)
            goto L_0x04da
        L_0x0045:
            java.lang.Object r3 = r11.A01
            X.A45 r3 = (X.A45) r3
            java.lang.Object r1 = r11.A02
            X.A45 r1 = (X.A45) r1
            X.6TZ r12 = (X.AnonymousClass6TZ) r12
            boolean r0 = r12 instanceof X.C120246Cy
            if (r0 == 0) goto L_0x0067
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.6Cy r12 = (X.C120246Cy) r12
            java.lang.String r0 = r12.A00
            r2.add(r0)
            X.Boh r1 = r3.A00
            X.E8A r0 = r3.A01
            X.AnonymousClass8BT.A19(X.ALS.A06(r1), r0, r2)
            goto L_0x04da
        L_0x0067:
            X.Boh r0 = r1.A00
            X.E8A r2 = r1.A01
            X.Boh r1 = X.ALS.A06(r0)
            X.9zJ r0 = X.C199029zJ.A01
            X.C25974Cph.A00(r1, r0, r2)
            goto L_0x04da
        L_0x0076:
            java.lang.Object r3 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r4 = r11.A02
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            X.4DM r12 = (X.AnonymousClass4DM) r12
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/sideEffect handling sideEffect "
            X.C17900vP.A0Y(r12, r0, r1)
            int r0 = r12.ordinal()
            r5 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L_0x009d;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00d0;
                case 4: goto L_0x019f;
                case 5: goto L_0x010c;
                case 6: goto L_0x0111;
                case 7: goto L_0x0116;
                case 8: goto L_0x0121;
                case 9: goto L_0x0152;
                case 10: goto L_0x0156;
                case 11: goto L_0x0167;
                case 12: goto L_0x016c;
                case 13: goto L_0x0107;
                case 14: goto L_0x0183;
                default: goto L_0x0092;
            }
        L_0x0092:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/sideEffect could not handle sideEffect: "
            X.C17900vP.A0Z(r12, r0, r1)
            goto L_0x04da
        L_0x009d:
            com.whatsapp.calling.dialogs.SwitchConfirmationFragment r1 = new com.whatsapp.calling.dialogs.SwitchConfirmationFragment
            r1.<init>()
            java.lang.String r0 = "SwitchConfirmationFragment"
            r3.A4h(r1, r0)
            X.1GP r2 = r3.getSupportFragmentManager()
            r0 = 3
            X.7A8 r1 = new X.7A8
            r1.<init>(r3, r0)
            java.lang.String r0 = "switch_to_video_result"
            goto L_0x01b8
        L_0x00b5:
            X.4DM r0 = X.AnonymousClass4DM.CALL_UPGRADE_ACCEPT_NO_PERMISSION
            r2 = 1
            if (r12 != r0) goto L_0x00bb
            r2 = 2
        L_0x00bb:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r3)
            if (r1 == 0) goto L_0x04da
            com.whatsapp.jid.UserJid r0 = r1.getPeerJid()
            if (r0 == 0) goto L_0x04da
            com.whatsapp.jid.UserJid r0 = r1.getPeerJid()
            com.whatsapp.voipcalling.VoipActivityV2.A1w(r0, r3, r2, r5)
            goto L_0x04da
        L_0x00d0:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r3)
            if (r1 == 0) goto L_0x04da
            X.00H r0 = r3.A1z
            r0.get()
            boolean r5 = com.whatsapp.voipcalling.VoipActivityV2.A26(r3)
            java.lang.String r4 = r1.callId
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            r2.setClassName(r1, r0)
            java.lang.String r0 = X.AnonymousClass6Z8.A06
            r2.setAction(r0)
            java.lang.String r0 = "pendingCall"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "call_id"
            r2.putExtra(r0, r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r3.startActivity(r2)
            goto L_0x04da
        L_0x0107:
            com.whatsapp.voipcalling.VoipActivityV2.A1Z(r3)
            goto L_0x04da
        L_0x010c:
            com.whatsapp.voipcalling.VoipActivityV2.A1T(r3)
            goto L_0x04da
        L_0x0111:
            com.whatsapp.voipcalling.VoipActivityV2.A1m(r3, r7)
            goto L_0x04da
        L_0x0116:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r3)
            java.lang.String r0 = X.AnonymousClass6Z8.A09
            com.whatsapp.voipcalling.VoipActivityV2.A1O(r1, r3, r0)
            goto L_0x04da
        L_0x0121:
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r3)
            if (r0 == 0) goto L_0x04da
            X.6qE r6 = r0.getDefaultPeerInfo()
            if (r6 == 0) goto L_0x04da
            com.whatsapp.jid.UserJid r2 = r6.A0A
            X.1Me r1 = r3.A15
            X.1M9 r0 = r3.A12
            X.1E7 r0 = r0.A0H(r2)
            java.lang.String r4 = X.AnonymousClass3MY.A0q(r1, r0)
            if (r4 == 0) goto L_0x04da
            boolean r2 = r6.A0C
            X.1KB r1 = r3.A05
            r0 = 2131898259(0x7f122f93, float:1.943143E38)
            if (r2 == 0) goto L_0x0149
            r0 = 2131898258(0x7f122f92, float:1.9431429E38)
        L_0x0149:
            java.lang.String r0 = X.C17890vO.A0R(r3, r4, r5, r7, r0)
            r1.A0G(r0, r7)
            goto L_0x04da
        L_0x0152:
            r3.A2M = r7
            goto L_0x04da
        L_0x0156:
            X.4Rb r1 = new X.4Rb
            r1.<init>()
            r0 = 7
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r1, r0)
            java.lang.String r0 = "VoipErrorDialogFragment"
            r3.A4h(r1, r0)
            goto L_0x04da
        L_0x0167:
            com.whatsapp.voipcalling.VoipActivityV2.A2A(r3, r7, r5)
            goto L_0x04da
        L_0x016c:
            X.00H r0 = r3.A1p
            java.lang.Object r1 = r0.get()
            X.4RC r1 = (X.AnonymousClass4RC) r1
            X.00H r0 = r3.A1i
            java.lang.Object r0 = r0.get()
            X.4aL r0 = (X.AnonymousClass4aL) r0
            X.4Sa r0 = r0.A01
            r1.A00(r0)
            goto L_0x04da
        L_0x0183:
            X.00H r0 = r3.A1x
            java.lang.Object r2 = r0.get()
            X.9sx r2 = (X.C195199sx) r2
            android.view.View r1 = r3.A08
            java.lang.String r0 = r4.callId
            r2.A02(r1, r0)
            X.00H r0 = r3.A1x
            java.lang.Object r0 = r0.get()
            X.9sx r0 = (X.C195199sx) r0
            r0.A00()
            goto L_0x04da
        L_0x019f:
            com.whatsapp.voipcalling.VoipActivityV2.A2A(r3, r5, r7)
            com.whatsapp.calling.controls.view.MoreMenuBottomSheet r1 = new com.whatsapp.calling.controls.view.MoreMenuBottomSheet
            r1.<init>()
            java.lang.String r0 = "MoreMenuBottomSheet"
            r3.A4h(r1, r0)
            X.1GP r2 = r3.getSupportFragmentManager()
            r0 = 3
            X.7A8 r1 = new X.7A8
            r1.<init>(r3, r0)
            java.lang.String r0 = "more_menu_dismissed"
        L_0x01b8:
            r2.A0t(r1, r3, r0)
            goto L_0x04da
        L_0x01bd:
            com.whatsapp.ohai.HttpResponse r12 = (com.whatsapp.ohai.HttpResponse) r12
            r4 = 0
            if (r12 == 0) goto L_0x01c6
            byte[] r0 = r12.body
            if (r0 != 0) goto L_0x01c8
        L_0x01c6:
            byte[] r0 = new byte[r4]
        L_0x01c8:
            java.lang.String r3 = X.C108955ca.A13(r0)
            r6 = 0
            if (r12 == 0) goto L_0x01df
            short r0 = r12.statusCode
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            if (r0 == 0) goto L_0x01df
            short r0 = r0.shortValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x01df:
            r5 = 4
            if (r6 == 0) goto L_0x01fc
            int r1 = r6.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x01f8
            org.json.JSONObject r1 = X.C17880vN.A16(r3)     // Catch:{ JSONException -> 0x0214 }
            java.lang.String r0 = "ok"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0214 }
            if (r0 == 0) goto L_0x0214
            r5 = 1
            goto L_0x0221
        L_0x01f8:
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0213
        L_0x01fc:
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 599(0x257, float:8.4E-43)
            X.1Oc r2 = new X.1Oc
            r2.<init>(r1, r0)
            if (r6 == 0) goto L_0x0214
            int r1 = r6.intValue()
            int r0 = r2.A00
            if (r0 > r1) goto L_0x0214
            int r0 = r2.A01
            if (r1 > r0) goto L_0x0214
        L_0x0213:
            r5 = 3
        L_0x0214:
            java.lang.Object r0 = r11.A02
            com.whatsapp.snapl.client.SnaplOhaiHttpClient r0 = (com.whatsapp.snapl.client.SnaplOhaiHttpClient) r0
            X.190 r2 = r0.A00
            java.lang.String r1 = "SNAPL"
            java.lang.String r0 = "upload_failed"
            r2.A0H(r1, r0, r4, r3)
        L_0x0221:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r11.A01
            X.1dr r0 = (X.C30391dr) r0
            r0.resumeWith(r1)
            goto L_0x04da
        L_0x022e:
            java.lang.Object r1 = r11.A01
            com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet r1 = (com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet) r1
            java.lang.Object r0 = r11.A02
            com.whatsapp.wds.components.textlayout.WDSTextLayout r0 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r0
            X.1E7 r12 = (X.AnonymousClass1E7) r12
            X.C18070vi.A0b(r0)
            X.C18070vi.A0b(r12)
            com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet.A01(r12, r1, r0)
            goto L_0x04da
        L_0x0243:
            java.lang.Object r0 = r11.A01
            com.whatsapp.music.ui.MusicBrowseFragment r0 = (com.whatsapp.music.ui.MusicBrowseFragment) r0
            java.lang.Object r2 = r11.A02
            com.whatsapp.wds.components.search.WDSSearchView r2 = (com.whatsapp.wds.components.search.WDSSearchView) r2
            java.lang.String r12 = (java.lang.String) r12
            X.0vl r0 = r0.A0D
            java.lang.Object r1 = r0.getValue()
            X.5iT r1 = (X.C111155iT) r1
            com.whatsapp.wds.components.edittext.WDSEditText r0 = r2.A09
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            r1.A0T(r0, r12)
            goto L_0x04da
        L_0x0260:
            java.lang.Object r0 = r11.A01
            X.5nF r0 = (X.C113535nF) r0
            java.lang.Object r3 = r11.A02
            X.AnonymousClass3MX.A1P(r3)
            if (r12 != 0) goto L_0x0272
            X.0vk r0 = r0.A04
            r0.invoke()
            goto L_0x04da
        L_0x0272:
            X.00H r0 = r0.A03
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r1 = 5
            X.AkP r0 = new X.AkP
            r0.<init>(r3, r12, r1)
            r2.A0J(r0)
            goto L_0x04da
        L_0x0283:
            java.lang.Object r9 = r11.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet r9 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet) r9
            java.lang.Object r8 = r11.A02
            android.view.View r8 = (android.view.View) r8
            X.6RF r12 = (X.AnonymousClass6RF) r12
            X.6RF r0 = X.AnonymousClass6RF.ENDED
            if (r12 != r0) goto L_0x0296
            r9.A28()
            goto L_0x04da
        L_0x0296:
            X.6RF r0 = X.AnonymousClass6RF.RESPONDING
            if (r12 != r0) goto L_0x0399
            X.0vl r0 = r9.A0S
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = X.C108945cZ.A0m(r0)
            X.1vp r0 = r0.A0O
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x0399
            X.6RF r2 = X.AnonymousClass6RF.LISTENING
        L_0x02aa:
            com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView r0 = r9.A03
            if (r0 == 0) goto L_0x02b4
            X.C18070vi.A0b(r2)
            r0.setSpeechIndicatorState(r2)
        L_0x02b4:
            X.72v r1 = r9.A07
            if (r1 == 0) goto L_0x02bf
            X.C18070vi.A0b(r2)
            r0 = 0
            r1.A03(r2, r0)
        L_0x02bf:
            X.6UR r1 = r9.A05
            r7 = 0
            if (r1 != 0) goto L_0x02ca
            java.lang.String r0 = "metaAiVoiceNuxViewHolder"
        L_0x02c6:
            X.C18070vi.A11(r0)
            throw r7
        L_0x02ca:
            X.C18070vi.A0b(r2)
            r6 = 0
            X.C18070vi.A0d(r2, r6)
            com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView r0 = r1.A03
            if (r0 == 0) goto L_0x02d8
            r0.setSpeechIndicatorState(r2)
        L_0x02d8:
            X.72v r0 = r1.A04
            if (r0 == 0) goto L_0x02df
            r0.A03(r2, r6)
        L_0x02df:
            boolean r0 = r9.A0I
            r5 = 1
            if (r0 == 0) goto L_0x0356
            X.6RF r0 = X.AnonymousClass6RF.LISTENING
            if (r12 != r0) goto L_0x0356
            X.00H r0 = r9.A0D
            if (r0 == 0) goto L_0x0337
            java.lang.Object r10 = r0.get()
            X.6zu r10 = (X.C140076zu) r10
            X.0vl r0 = r10.A08
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0349
            r2 = 2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoipAiRtcLogger/endConnectionSetupMarker actionId: "
            X.C17900vP.A0j(r0, r1, r2)
            X.00H r4 = r10.A06
            java.lang.Object r1 = r4.get()
            X.19Y r1 = (X.AnonymousClass19Y) r1
            r0 = 726214113(0x2b4925e1, float:7.146211E-13)
            r1.markerEnd(r0, r2)
            X.00H r0 = r10.A05
            java.lang.Object r0 = r0.get()
            X.6uK r0 = (X.C136746uK) r0
            r0.A00()
            X.0z2 r0 = X.AnonymousClass6RB.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0323:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.Object r2 = r3.next()
            java.util.Map r1 = r10.A07
            java.lang.Long r0 = X.C17890vO.A0L()
            r1.put(r2, r0)
            goto L_0x0323
        L_0x0337:
            java.lang.String r0 = "voipAiRtcLogger"
            goto L_0x02c6
        L_0x033a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r10.A00 = r0
            java.lang.Object r0 = r4.get()
            X.19Y r0 = (X.AnonymousClass19Y) r0
            r0.CGw()
        L_0x0349:
            boolean r0 = com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet.A01(r9)
            if (r0 == 0) goto L_0x0356
            X.11C r0 = r9.A02
            if (r0 == 0) goto L_0x0395
            X.AnonymousClass4a5.A01(r8, r0)
        L_0x0356:
            X.6RF r0 = X.AnonymousClass6RF.CONNECTING
            if (r12 == r0) goto L_0x035b
            r5 = 0
        L_0x035b:
            r9.A0I = r5
            com.whatsapp.WaTextView r1 = r9.A01
            if (r1 == 0) goto L_0x036c
            r1.setSingleLine()
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            r1.setEllipsize(r0)
            r1.A0L()
        L_0x036c:
            X.0vl r2 = r9.A0S
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r1 = X.C108945cZ.A0m(r2)
            java.util.Timer r0 = r1.A06
            if (r0 == 0) goto L_0x0379
            r0.cancel()
        L_0x0379:
            r1.A06 = r7
            java.util.Timer r0 = r1.A05
            if (r0 == 0) goto L_0x0382
            r0.cancel()
        L_0x0382:
            r1.A05 = r7
            r4 = 2131103156(0x7f060db4, float:1.781877E38)
            if (r12 == 0) goto L_0x03f4
            int r0 = r12.ordinal()
            switch(r0) {
                case -1: goto L_0x03f4;
                case 0: goto L_0x03ea;
                case 1: goto L_0x03a0;
                case 2: goto L_0x039c;
                case 3: goto L_0x039c;
                case 4: goto L_0x03e2;
                case 5: goto L_0x03da;
                case 6: goto L_0x03f4;
                default: goto L_0x0390;
            }
        L_0x0390:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0395:
            java.lang.String r0 = "systemServices"
            goto L_0x02c6
        L_0x0399:
            r2 = r12
            goto L_0x02aa
        L_0x039c:
            r4 = 2131103277(0x7f060e2d, float:1.7819016E38)
            goto L_0x03f4
        L_0x03a0:
            r4 = 2131103152(0x7f060db0, float:1.7818762E38)
            com.whatsapp.WaTextView r0 = r9.A01
            if (r0 == 0) goto L_0x03aa
            r0.setText(r7)
        L_0x03aa:
            com.whatsapp.WaTextView r0 = r9.A01
            if (r0 == 0) goto L_0x03b1
            r0.A0K()
        L_0x03b1:
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r1 = X.C108945cZ.A0m(r2)
            X.1DT r0 = r1.A0F
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.C18070vi.A19(r0, r6)
            if (r0 == 0) goto L_0x03f4
            java.util.Timer r0 = r1.A06
            if (r0 == 0) goto L_0x03c8
            r0.cancel()
        L_0x03c8:
            java.util.Timer r3 = new java.util.Timer
            r3.<init>()
            r1.A06 = r3
            X.7T5 r2 = new X.7T5
            r2.<init>(r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.schedule(r2, r0)
            goto L_0x03f4
        L_0x03da:
            com.whatsapp.WaTextView r1 = r9.A01
            if (r1 == 0) goto L_0x03f4
            r0 = 2131892214(0x7f1217f6, float:1.941917E38)
            goto L_0x03f1
        L_0x03e2:
            com.whatsapp.WaTextView r1 = r9.A01
            if (r1 == 0) goto L_0x03f4
            r0 = 2131892213(0x7f1217f5, float:1.9419168E38)
            goto L_0x03f1
        L_0x03ea:
            com.whatsapp.WaTextView r1 = r9.A01
            if (r1 == 0) goto L_0x03f4
            r0 = 2131892209(0x7f1217f1, float:1.941916E38)
        L_0x03f1:
            r1.setText(r0)
        L_0x03f4:
            android.content.Context r0 = r9.A14()
            int r1 = X.C19740yt.A00(r0, r4)
            com.whatsapp.WaTextView r0 = r9.A01
            if (r0 == 0) goto L_0x04da
            r0.setTextColor(r1)
            goto L_0x04da
        L_0x0405:
            java.lang.Object r6 = r11.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet r6 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet) r6
            java.lang.Object r3 = r11.A02
            android.view.View r3 = (android.view.View) r3
            X.6zo r12 = (X.C140016zo) r12
            if (r12 == 0) goto L_0x04da
            boolean r0 = r6.A0J
            if (r0 == 0) goto L_0x04da
            java.util.Map r4 = r6.A0Q
            java.util.Iterator r1 = X.C17890vO.A0l(r4)
        L_0x041b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x042d
            java.lang.Object r0 = r1.next()
            X.6uO r0 = (X.C136786uO) r0
            androidx.core.widget.NestedScrollView r0 = r0.A01
            X.C72453Mb.A1B(r0)
            goto L_0x041b
        L_0x042d:
            X.6R6 r2 = r12.A01
            int r1 = r2.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x043b
            r0 = 0
            r6.A06 = r0
            goto L_0x04da
        L_0x043b:
            java.lang.Object r5 = r4.get(r2)
            if (r5 != 0) goto L_0x0476
            r0 = 1
            if (r1 == r0) goto L_0x0463
            r0 = 2
            if (r1 == r0) goto L_0x045c
            r0 = 3
            if (r1 == r0) goto L_0x0455
            X.00H r0 = r6.A0A
            if (r0 != 0) goto L_0x046a
            java.lang.String r0 = "metaAiVoiceReelsResponseComponent"
        L_0x0450:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0455:
            X.00H r0 = r6.A0B
            if (r0 != 0) goto L_0x046a
            java.lang.String r0 = "metaAiVoiceSearchResponseComponent"
            goto L_0x0450
        L_0x045c:
            X.00H r0 = r6.A09
            if (r0 != 0) goto L_0x046a
            java.lang.String r0 = "metaAiVoiceImageResponseComponent"
            goto L_0x0450
        L_0x0463:
            X.00H r0 = r6.A0C
            if (r0 != 0) goto L_0x046a
            java.lang.String r0 = "metaAiVoiceTextResponseComponent"
            goto L_0x0450
        L_0x046a:
            java.lang.Object r5 = r0.get()
            X.6uO r5 = (X.C136786uO) r5
            X.C18070vi.A0b(r5)
            r4.put(r2, r5)
        L_0x0476:
            X.6uO r5 = (X.C136786uO) r5
            r6.A06 = r5
            X.0vl r0 = r6.A0S
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r1 = X.C108945cZ.A0m(r0)
            X.1FL r0 = r6.A1D()
            r5.A03(r3, r0, r1)
            X.7A3 r4 = r6.A0P
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            androidx.core.widget.NestedScrollView r2 = r5.A01
            if (r2 == 0) goto L_0x049b
            r2.A0B = r4
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 5
            X.AnonymousClass795.A00(r1, r2, r4, r0)
        L_0x049b:
            androidx.core.widget.NestedScrollView r0 = r5.A01
            if (r0 == 0) goto L_0x04a2
            r0.setVisibility(r3)
        L_0x04a2:
            android.content.Context r1 = r6.A14()
            X.02n r0 = r6.A0O
            r5.A02(r1, r0, r12)
            goto L_0x04da
        L_0x04ac:
            X.67u r12 = X.C108955ca.A0S(r12)
            java.lang.Object r2 = r11.A01
            r0 = 7
            X.7SB r0 = X.AnonymousClass7SB.A00(r2, r0)
            r12.A00 = r0
            java.lang.Object r1 = r11.A02
            r0 = 2
            X.7S8 r3 = new X.7S8
            r3.<init>(r1, r2, r0)
            goto L_0x04d8
        L_0x04c2:
            X.67u r12 = (X.C1193567u) r12
            r2 = 0
            X.C18070vi.A0d(r12, r2)
            java.lang.Object r1 = r11.A01
            r0 = 6
            X.7SB r0 = X.AnonymousClass7SB.A00(r1, r0)
            r12.A00 = r0
            java.lang.Object r0 = r11.A02
            X.7S8 r3 = new X.7S8
            r3.<init>(r0, r1, r2)
        L_0x04d8:
            r12.A01 = r3
        L_0x04da:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S8.invoke(java.lang.Object):java.lang.Object");
    }
}
