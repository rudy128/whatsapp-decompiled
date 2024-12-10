package X;

/* renamed from: X.Arf  reason: case insensitive filesystem */
public class C21729Arf extends AnonymousClass1JJ implements C22821Di {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21729Arf(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001c;
                case 2: goto L_0x0025;
                case 3: goto L_0x002e;
                case 4: goto L_0x0037;
                case 5: goto L_0x0040;
                case 6: goto L_0x0049;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment> r3 = com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.class
            java.lang.String r5 = "onIsVoiceChatUpdated(Z)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "onIsVoiceChatUpdated"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<com.whatsapp.profile.viewmodel.UsernameSetViewModel> r3 = com.whatsapp.profile.viewmodel.UsernameSetViewModel.class
            java.lang.String r5 = "onUsernameInputUpdated(Ljava/lang/String;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "onUsernameInputUpdated"
            goto L_0x000e
        L_0x001c:
            java.lang.Class<X.97T> r3 = X.AnonymousClass97T.class
            java.lang.String r5 = "handleData(Lcom/whatsapp/infra/graphql/generated/usync/UsyncQueryResponse;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleData"
            goto L_0x000e
        L_0x0025:
            java.lang.Class<X.97T> r3 = X.AnonymousClass97T.class
            java.lang.String r5 = "handleError(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "handleError"
            goto L_0x000e
        L_0x002e:
            java.lang.Class<X.Acb> r3 = X.C20983Acb.class
            java.lang.String r5 = "onGroupInfoParsed(Lcom/whatsapp/group/batch/GroupInfoDataEnvelope;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "onGroupInfoParsed"
            goto L_0x000e
        L_0x0037:
            java.lang.Class<X.Acb> r3 = X.C20983Acb.class
            java.lang.String r5 = "onCriticalEvent(Lcom/whatsapp/group/protocol/CriticalEvent;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "onCriticalEvent"
            goto L_0x000e
        L_0x0040:
            java.lang.Class<com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment> r3 = com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.class
            java.lang.String r5 = "updateMessagesPreferencesList(Ljava/util/Map;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "updateMessagesPreferencesList"
            goto L_0x000e
        L_0x0049:
            java.lang.Class<com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment> r3 = com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.class
            java.lang.String r5 = "updateCallsPreferencesList(Ljava/util/Map;)V"
            r6 = 0
            r1 = 1
            java.lang.String r4 = "updateCallsPreferencesList"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21729Arf.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031c, code lost:
        if (r3 == null) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031e, code lost:
        r12 = r3.A0F("timestamp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0324, code lost:
        r13 = X.C20099A7c.A04(r12, 0) * 1000;
        r12 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x034d, code lost:
        if (r2.length() != 0) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0423, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0427, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r3 = r17
            r1 = r16
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0352;
                case 1: goto L_0x025c;
                case 2: goto L_0x03e0;
                case 3: goto L_0x0245;
                case 4: goto L_0x0230;
                case 5: goto L_0x00e0;
                case 6: goto L_0x002b;
                default: goto L_0x0009;
            }
        L_0x0009:
            boolean r3 = X.AnonymousClass000.A1Y(r3)
            java.lang.Object r2 = r1.receiver
            androidx.preference.PreferenceFragmentCompat r2 = (androidx.preference.PreferenceFragmentCompat) r2
            java.lang.String r0 = "jid_calls"
            androidx.preference.Preference r1 = r2.BLF(r0)
            if (r1 == 0) goto L_0x0028
            r0 = 2131898762(0x7f12318a, float:1.943245E38)
            if (r3 == 0) goto L_0x0021
            r0 = 2131898037(0x7f122eb5, float:1.943098E38)
        L_0x0021:
            java.lang.String r0 = r2.A1H(r0)
            r1.A0I(r0)
        L_0x0028:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002b:
            java.util.Map r3 = (java.util.Map) r3
            r6 = 0
            X.C18070vi.A0d(r3, r6)
            java.lang.Object r5 = r1.receiver
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r5 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r5
            boolean r1 = r3.isEmpty()
            java.lang.String r0 = "jid_calls"
            androidx.preference.Preference r0 = r5.BLF(r0)
            if (r1 == 0) goto L_0x0047
            if (r0 == 0) goto L_0x0028
            r0.A0N(r6)
            goto L_0x0028
        L_0x0047:
            r4 = 1
            if (r0 == 0) goto L_0x004d
            r0.A0N(r4)
        L_0x004d:
            java.lang.String r0 = "jid_call_mute"
            boolean r1 = r3.containsKey(r0)
            androidx.preference.Preference r0 = r5.BLF(r0)
            if (r1 == 0) goto L_0x00d3
            com.whatsapp.preference.WaMuteSettingPreference r0 = (com.whatsapp.preference.WaMuteSettingPreference) r0
            r5.A06 = r0
            if (r0 == 0) goto L_0x0062
            r0.A0N(r4)
        L_0x0062:
            com.whatsapp.preference.WaMuteSettingPreference r8 = r5.A06
            if (r8 == 0) goto L_0x0087
            X.1BI r7 = r5.A05
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            X.9VV r2 = r5.A00
            if (r2 == 0) goto L_0x041a
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r5.A0E
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r8.A06 = r0
            r8.A05 = r7
            r8.A01 = r2
            r8.A00 = r1
            com.whatsapp.ListItemWithLeftIcon r0 = r8.A02
            com.whatsapp.preference.WaMuteSettingPreference.A00(r1, r0, r7, r8)
        L_0x0087:
            java.lang.String r2 = "jid_call_ringtone"
            androidx.preference.Preference r1 = r5.BLF(r2)
            com.whatsapp.preference.WaRingtonePreference r1 = (com.whatsapp.preference.WaRingtonePreference) r1
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x00cd
            if (r1 == 0) goto L_0x00a0
            r1.A0N(r4)
            r1.A00 = r4
            r1.A02 = r4
            r1.A03 = r4
        L_0x00a0:
            java.lang.String r0 = X.C17880vN.A0s(r2, r3)
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.A02(r5, r0, r2)
            if (r1 == 0) goto L_0x00ad
            X.B6V r0 = r5.A0G
            r1.A0A = r0
        L_0x00ad:
            java.lang.String r2 = "jid_call_vibration"
            androidx.preference.Preference r1 = r5.BLF(r2)
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00be
            r1.A0N(r4)
        L_0x00be:
            java.lang.String r0 = X.C17880vN.A0s(r2, r3)
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.A03(r5, r0, r2)
            if (r1 == 0) goto L_0x0028
            X.B6V r0 = r5.A0G
            r1.A0A = r0
            goto L_0x0028
        L_0x00cd:
            if (r1 == 0) goto L_0x00ad
            r1.A0N(r6)
            goto L_0x00ad
        L_0x00d3:
            if (r0 == 0) goto L_0x0087
            r0.A0N(r6)
            goto L_0x0087
        L_0x00d9:
            if (r1 == 0) goto L_0x0028
            r1.A0N(r6)
            goto L_0x0028
        L_0x00e0:
            java.util.Map r3 = (java.util.Map) r3
            r4 = 0
            X.C18070vi.A0d(r3, r4)
            java.lang.Object r7 = r1.receiver
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r7 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r7
            boolean r1 = r3.isEmpty()
            java.lang.String r5 = "jid_messages"
            androidx.preference.Preference r0 = r7.BLF(r5)
            if (r1 == 0) goto L_0x00fd
            if (r0 == 0) goto L_0x0028
            r0.A0N(r4)
            goto L_0x0028
        L_0x00fd:
            r6 = 1
            if (r0 == 0) goto L_0x0103
            r0.A0N(r6)
        L_0x0103:
            java.lang.String r0 = "jid_message_mute"
            boolean r1 = r3.containsKey(r0)
            androidx.preference.Preference r0 = r7.BLF(r0)
            if (r1 == 0) goto L_0x0229
            com.whatsapp.preference.WaMuteSettingPreference r0 = (com.whatsapp.preference.WaMuteSettingPreference) r0
            r7.A07 = r0
            if (r0 == 0) goto L_0x0118
            r0.A0N(r6)
        L_0x0118:
            com.whatsapp.preference.WaMuteSettingPreference r9 = r7.A07
            if (r9 == 0) goto L_0x013d
            X.1BI r8 = r7.A05
            X.C17960vV.A07(r8)
            X.C18070vi.A0X(r8)
            X.5Z0 r2 = r7.A01
            if (r2 == 0) goto L_0x0421
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r7.A0F
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r9.A06 = r0
            r9.A05 = r8
            r9.A03 = r2
            r9.A00 = r1
            com.whatsapp.ListItemWithLeftIcon r0 = r9.A02
            com.whatsapp.preference.WaMuteSettingPreference.A00(r1, r0, r8, r9)
        L_0x013d:
            java.lang.String r8 = "jid_message_activity_level"
            androidx.preference.Preference r0 = r7.BLF(r8)
            if (r0 != 0) goto L_0x0194
            X.0vl r0 = r7.A0H
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            X.1BI r0 = r7.A05
            boolean r0 = r0 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0194
            X.0ve r2 = r1.A04
            r1 = 11088(0x2b50, float:1.5538E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0194
            androidx.preference.Preference r5 = r7.BLF(r5)
            androidx.preference.PreferenceGroup r5 = (androidx.preference.PreferenceGroup) r5
            X.8dO r0 = r7.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment$addActivityLevelPreference$activityLevelPreference$1 r2 = new com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment$addActivityLevelPreference$activityLevelPreference$1
            r2.<init>(r0)
            r2.A0J(r8)
            r2.A0R = r4
            r1 = 2131893062(0x7f121b46, float:1.942089E38)
            android.content.Context r0 = r2.A05
            java.lang.String r0 = r0.getString(r1)
            r2.A0I(r0)
            boolean r0 = r2.A0P
            if (r0 == r4) goto L_0x0186
            r2.A0P = r4
            r2.A05()
        L_0x0186:
            int r0 = r2.A02
            if (r4 == r0) goto L_0x018f
            r2.A02 = r4
            r2.A06()
        L_0x018f:
            if (r5 == 0) goto L_0x0194
            r5.A0T(r2)
        L_0x0194:
            java.lang.String r0 = X.C17880vN.A0s(r8, r3)
            r5 = 0
            if (r0 == 0) goto L_0x0226
            java.lang.Integer r0 = X.C108955ca.A0l(r0)
            X.201 r0 = X.AnonymousClass2UH.A00(r0)
        L_0x01a3:
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.A01(r0, r7)
            java.lang.String r2 = "jid_message_tone"
            androidx.preference.Preference r1 = r7.BLF(r2)
            com.whatsapp.preference.WaRingtonePreference r1 = (com.whatsapp.preference.WaRingtonePreference) r1
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x0220
            if (r1 == 0) goto L_0x01c0
            r1.A0N(r6)
            r0 = 7
            r1.A00 = r0
            r1.A02 = r6
            r1.A03 = r6
        L_0x01c0:
            java.lang.String r0 = X.C17880vN.A0s(r2, r3)
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.A02(r7, r0, r2)
            if (r1 == 0) goto L_0x01cd
            X.B6V r0 = r7.A0G
            r1.A0A = r0
        L_0x01cd:
            java.lang.String r2 = "jid_message_vibration"
            androidx.preference.Preference r1 = r7.BLF(r2)
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x021a
            if (r1 == 0) goto L_0x01de
            r1.A0N(r6)
        L_0x01de:
            java.lang.String r0 = X.C17880vN.A0s(r2, r3)
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment.A03(r7, r0, r2)
            if (r1 == 0) goto L_0x01eb
            X.B6V r0 = r7.A0G
            r1.A0A = r0
        L_0x01eb:
            java.lang.String r0 = "jid_message_advanced"
            androidx.preference.Preference r4 = r7.BLF(r0)
            if (r4 == 0) goto L_0x0028
            boolean r0 = r3.containsKey(r0)
            r4.A0N(r0)
            boolean r0 = r4.A0U
            if (r0 == 0) goto L_0x0028
            android.content.Context r2 = r4.A05
            if (r2 == 0) goto L_0x0028
            X.1BI r1 = r7.A05
            if (r1 == 0) goto L_0x0216
            X.00H r0 = r7.A0B
            if (r0 == 0) goto L_0x041d
            r0.get()
            android.content.Intent r5 = X.AnonymousClass1LU.A0t(r2, r1)
            java.lang.String r0 = "advanced_settings"
            r5.putExtra(r0, r6)
        L_0x0216:
            r4.A06 = r5
            goto L_0x0028
        L_0x021a:
            if (r1 == 0) goto L_0x01eb
            r1.A0N(r4)
            goto L_0x01eb
        L_0x0220:
            if (r1 == 0) goto L_0x01cd
            r1.A0N(r4)
            goto L_0x01cd
        L_0x0226:
            r0 = r5
            goto L_0x01a3
        L_0x0229:
            if (r0 == 0) goto L_0x013d
            r0.A0N(r4)
            goto L_0x013d
        L_0x0230:
            X.9pT r3 = (X.C193059pT) r3
            r4 = 0
            X.C18070vi.A0d(r3, r4)
            java.lang.Object r0 = r1.receiver
            X.Acb r0 = (X.C20983Acb) r0
            X.190 r2 = r0.A01
            java.lang.String r1 = "participant-attribute-parser"
            java.lang.String r0 = r3.A00
            r2.A0G(r1, r0, r4)
            goto L_0x0028
        L_0x0245:
            X.A1t r3 = (X.C19983A1t) r3
            java.lang.Object r2 = X.AnonymousClass3Ma.A0z(r3, r1)
            X.Acb r2 = (X.C20983Acb) r2
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0028
            X.A2S r1 = r3.A00
            if (r1 == 0) goto L_0x0028
            X.126 r0 = r2.A02
            r0.A0S(r1)
            goto L_0x0028
        L_0x025c:
            X.A8k r3 = (X.C20125A8k) r3
            r5 = 0
            X.C18070vi.A0d(r3, r5)
            java.lang.Object r8 = r1.receiver
            X.97T r8 = (X.AnonymousClass97T) r8
            java.lang.String r7 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl$Xwa2FetchWaUsers> r6 = com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r3.A0A(r6, r7)
            r12 = 0
            if (r0 == 0) goto L_0x02c9
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            X.A8k r0 = (X.C20125A8k) r0
            if (r0 == 0) goto L_0x02c9
            org.json.JSONObject r0 = r0.A00
            X.C18070vi.A0W(r0)
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl r2 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl
            r2.<init>(r0)
            java.lang.String r1 = "about_status_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo> r0 = com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl.AboutStatusInfo.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x02c9
            org.json.JSONObject r4 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r4)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r1 == r0) goto L_0x02c3
            r2 = 0
        L_0x0299:
            r4 = 200(0xc8, float:2.8E-43)
            r13 = 0
            r15 = 0
            if (r2 == 0) goto L_0x02df
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r1 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r2.A0E(r1, r0)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r1 = (com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType) r1
            r0 = -1
            if (r1 == 0) goto L_0x032c
            int r1 = r1.ordinal()
            if (r1 == r0) goto L_0x032c
            r0 = 1
            if (r1 == r0) goto L_0x02cf
            r0 = 2
            if (r1 == r0) goto L_0x02cb
            if (r1 == r5) goto L_0x032c
            r0 = 3
            if (r1 == r0) goto L_0x032c
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x02c3:
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2ResponseStatus r2 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2ResponseStatus
            r2.<init>(r4)
            goto L_0x0299
        L_0x02c9:
            r2 = r12
            goto L_0x0299
        L_0x02cb:
            r0 = 401(0x191, float:5.62E-43)
            r15 = 1
            goto L_0x032e
        L_0x02cf:
            X.2gr r0 = r8.A00
            X.118 r0 = r0.A02
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131889231(0x7f120c4f, float:1.941312E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x032c
        L_0x02df:
            X.1IX r0 = r3.A0A(r6, r7)
            if (r0 == 0) goto L_0x0350
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            X.A8k r0 = (X.C20125A8k) r0
            if (r0 == 0) goto L_0x0350
            org.json.JSONObject r0 = r0.A00
            X.C18070vi.A0W(r0)
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl r2 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl
            r2.<init>(r0)
            java.lang.String r1 = "about_status_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo> r0 = com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl.AboutStatusInfo.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0350
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 1477240943(0x580ce86f, float:6.1971969E14)
            if (r1 == r0) goto L_0x033c
            r3 = 0
        L_0x030d:
            X.2gr r0 = r8.A00
            X.118 r0 = r0.A02
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131889231(0x7f120c4f, float:1.941312E38)
            java.lang.String r2 = X.AnonymousClass3MY.A0m(r1, r0)
            if (r3 == 0) goto L_0x0324
        L_0x031e:
            java.lang.String r0 = "timestamp"
            java.lang.String r12 = r3.A0F(r0)
        L_0x0324:
            long r13 = X.C20099A7c.A04(r12, r13)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r0
            r12 = r2
        L_0x032c:
            r0 = 200(0xc8, float:2.8E-43)
        L_0x032e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r9 = 0
            r8.A01(r9, r10, r11, r12, r13, r15)
            goto L_0x0028
        L_0x033c:
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2AboutStatus r3 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2AboutStatus
            r3.<init>(r2)
            java.lang.String r0 = "text"
            java.lang.String r2 = r3.A0F(r0)
            if (r2 == 0) goto L_0x030d
            int r0 = r2.length()
            if (r0 != 0) goto L_0x031e
            goto L_0x030d
        L_0x0350:
            r3 = r12
            goto L_0x030d
        L_0x0352:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = X.AnonymousClass3Ma.A0z(r3, r1)
            com.whatsapp.profile.viewmodel.UsernameSetViewModel r5 = (com.whatsapp.profile.viewmodel.UsernameSetViewModel) r5
            java.lang.String r0 = r5.A00
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0028
            X.1OB r0 = r5.A01
            r6 = 0
            if (r0 == 0) goto L_0x036a
            r0.BEM(r6)
        L_0x036a:
            X.0vl r0 = r5.A0B
            X.1G4 r0 = X.AnonymousClass3MW.A17(r0)
            r0.setValue(r6)
            X.11S r0 = r5.A02
            java.lang.String r0 = r0.A0C()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0397
            X.0vl r0 = r5.A0A
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9I3 r0 = X.AnonymousClass9I3.DISABLED
            r1.setValue(r0)
            X.0vl r0 = r5.A09
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9IB r0 = X.AnonymousClass9IB.NONE
        L_0x0392:
            r1.setValue(r0)
            goto L_0x0028
        L_0x0397:
            r5.A00 = r3
            int r1 = r3.length()
            r0 = 3
            if (r1 < r0) goto L_0x03cc
            r0 = 30
            if (r1 > r0) goto L_0x03cc
            X.1wr r0 = X.C124516Yq.A00
            boolean r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x03cc
            X.0vl r0 = r5.A09
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9IB r0 = X.AnonymousClass9IB.CHECKING
            r1.setValue(r0)
            X.1OX r4 = X.C41561wd.A00(r5)
            com.whatsapp.profile.viewmodel.UsernameSetViewModel$onUsernameInputUpdated$1 r2 = new com.whatsapp.profile.viewmodel.UsernameSetViewModel$onUsernameInputUpdated$1
            r2.<init>(r5, r3, r6)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.1e4 r0 = X.C30451dy.A02(r0, r1, r2, r4)
            r5.A01 = r0
            goto L_0x0028
        L_0x03cc:
            X.0vl r0 = r5.A0A
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9I3 r0 = X.AnonymousClass9I3.DISABLED
            r1.setValue(r0)
            X.0vl r0 = r5.A09
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9IB r0 = X.AnonymousClass9IB.ERROR
            goto L_0x0392
        L_0x03e0:
            X.A6Z r3 = (X.A6Z) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            java.lang.Object r4 = r1.receiver
            X.Ace r4 = (X.C20986Ace) r4
            X.BC4 r0 = r3.A02()
            java.lang.String r1 = r0.BOP()
            java.lang.String r0 = "TRANSPORT"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0417
            int r0 = X.A6Z.A00(r3)
        L_0x03fe:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = X.A6Z.A00(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r9 = 0
            r11 = 1
            r8 = r5
            r4.A01(r5, r6, r7, r8, r9, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0417:
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x03fe
        L_0x041a:
            java.lang.String r0 = "muteCallsHelperFactory"
            goto L_0x0423
        L_0x041d:
            X.AnonymousClass3MW.A1F()
            throw r5
        L_0x0421:
            java.lang.String r0 = "muteMessagesHelperFactory"
        L_0x0423:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21729Arf.invoke(java.lang.Object):java.lang.Object");
    }
}
