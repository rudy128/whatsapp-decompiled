package X;

/* renamed from: X.4sW  reason: invalid class name and case insensitive filesystem */
public class C99254sW implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;

    public C99254sW(AnonymousClass4OE r1, int i) {
        this.A00 = i;
        if (11 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        if (((X.AnonymousClass4bI) r5.A03.get()).A00() == r4) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        X.AnonymousClass3MW.A1X(r5.A05, new com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1(r5, r4, (X.C30391dr) null), X.C41561wd.A00(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0092, code lost:
        r7.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0128, code lost:
        if (X.AnonymousClass3MW.A0Y(r1.A06).A0M(r7) != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a0, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x00b0;
                case 2: goto L_0x009f;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0096;
                case 6: goto L_0x0096;
                case 7: goto L_0x0005;
                case 8: goto L_0x007c;
                case 9: goto L_0x0058;
                case 10: goto L_0x0051;
                case 11: goto L_0x0185;
                case 12: goto L_0x002a;
                case 13: goto L_0x000f;
                case 14: goto L_0x012b;
                case 15: goto L_0x010d;
                case 16: goto L_0x00ce;
                case 17: goto L_0x00c1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A00(r0)
        L_0x000c:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x000f:
            X.67u r7 = (X.C1193567u) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r2 = r6.A01
            X.4OE r2 = (X.AnonymousClass4OE) r2
            r1 = 12
            X.4sW r0 = new X.4sW
            r0.<init>((X.AnonymousClass4OE) r2, (int) r1)
            r7.A00 = r0
            r0 = 11
            X.4sW r1 = new X.4sW
            r1.<init>((X.AnonymousClass4OE) r2, (int) r0)
            goto L_0x0092
        L_0x002a:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.A8k r7 = (X.C20125A8k) r7
            java.lang.String r1 = "xwa2_fetch_account_reachout_timelock"
            java.lang.Class<com.whatsapp.infra.graphql.generated.integrityenforcements.FetchReachoutTimelockQueryResponseImpl$Xwa2FetchAccountReachoutTimelock> r0 = com.whatsapp.infra.graphql.generated.integrityenforcements.FetchReachoutTimelockQueryResponseImpl.Xwa2FetchAccountReachoutTimelock.class
            X.A8k r3 = r7.A09(r0, r1)
            X.C18070vi.A0X(r3)
            java.lang.Object r0 = r6.A01
            X.4OE r0 = (X.AnonymousClass4OE) r0
            X.2jw r2 = r0.A02
            java.lang.String r0 = "is_active"
            boolean r1 = r3.A0G(r0)
            java.lang.String r0 = "time_enforcement_ends"
            java.lang.String r0 = r3.A0F(r0)
            r2.A00(r1, r0)
            goto L_0x000c
        L_0x0051:
            java.lang.Object r5 = r6.A01
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel r5 = (com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel) r5
            X.4Cd r4 = X.C82804Cd.PHONE_NUMBER
            goto L_0x005e
        L_0x0058:
            java.lang.Object r5 = r6.A01
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel r5 = (com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel) r5
            X.4Cd r4 = X.C82804Cd.USERNAME
        L_0x005e:
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.4bI r0 = (X.AnonymousClass4bI) r0
            X.4Cd r0 = r0.A00()
            if (r0 == r4) goto L_0x000c
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A05
            r1 = 0
            com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1 r0 = new com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1
            r0.<init>(r5, r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            goto L_0x000c
        L_0x007c:
            X.67u r7 = (X.C1193567u) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r2 = r6.A01
            X.1dr r2 = (X.C30391dr) r2
            X.5Ah r0 = new X.5Ah
            r0.<init>(r2)
            r7.A00 = r0
            X.5Ai r1 = new X.5Ai
            r1.<init>(r2)
        L_0x0092:
            r7.A01 = r1
            goto L_0x000c
        L_0x0096:
            java.lang.Object r0 = r6.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A03(r0)
            goto L_0x000c
        L_0x009f:
            java.lang.Object r2 = r6.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Intent r7 = (android.content.Intent) r7
            r1 = 158(0x9e, float:2.21E-43)
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            r2.startActivityForResult(r7, r1)
            goto L_0x000c
        L_0x00b0:
            java.lang.Object r2 = r6.A01
            X.01C r2 = (X.AnonymousClass01C) r2
            android.content.Intent r7 = (android.content.Intent) r7
            r1 = 158(0x9e, float:2.21E-43)
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            r2.startActivityForResult(r7, r1)
            goto L_0x000c
        L_0x00c1:
            java.lang.Object r1 = r6.A01
            X.1g5 r1 = (X.C31761g5) r1
            java.lang.Boolean r2 = X.AnonymousClass000.A0h()
            r0 = 0
            r1.CG1(r0, r2)
            return r2
        L_0x00ce:
            java.lang.Object r4 = r6.A01
            com.whatsapp.suggestions.SuggestionsEngine r4 = (com.whatsapp.suggestions.SuggestionsEngine) r4
            X.1BI r7 = (X.AnonymousClass1BI) r7
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            X.1M9 r0 = r4.A03
            X.1E7 r3 = r0.A0E(r7)
            r2 = 0
            if (r3 == 0) goto L_0x0108
            com.whatsapp.jid.Jid r1 = X.AnonymousClass1E7.A01(r3)
            if (r1 == 0) goto L_0x0108
            java.util.Set r0 = r4.A00
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0108
            boolean r0 = X.C22971Dz.A0Z(r7)
            if (r0 != 0) goto L_0x0108
            boolean r0 = X.C22971Dz.A0V(r7)
            if (r0 != 0) goto L_0x0108
            boolean r0 = X.C22971Dz.A0O(r7)
            if (r0 != 0) goto L_0x0108
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0108
            r2 = 1
        L_0x0108:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L_0x010d:
            java.lang.Object r1 = r6.A01
            com.whatsapp.suggestions.SuggestionsEngine r1 = (com.whatsapp.suggestions.SuggestionsEngine) r1
            X.1BI r7 = (X.AnonymousClass1BI) r7
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            boolean r0 = X.C22971Dz.A0a(r7)
            if (r0 != 0) goto L_0x019b
            X.00H r0 = r1.A06
            X.1fA r0 = X.AnonymousClass3MW.A0Y(r0)
            boolean r1 = r0.A0M(r7)
            r0 = 1
            if (r1 == 0) goto L_0x019c
            goto L_0x019b
        L_0x012b:
            java.lang.Object r3 = r6.A01
            com.whatsapp.settings.SettingsTabActivity r3 = (com.whatsapp.settings.SettingsTabActivity) r3
            java.lang.String r7 = (java.lang.String) r7
            X.3z0 r1 = new X.3z0
            r1.<init>()
            r1.A01 = r7
            X.00H r0 = r3.A16
            java.lang.Object r0 = r0.get()
            X.4Xf r0 = (X.C87824Xf) r0
            int r0 = r0.A01(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r3.A0U
            r0.CC4(r1)
            r3.A1C = r7
            java.lang.String r0 = "app_language"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0172
            r1 = 1
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0i
            if (r0 == 0) goto L_0x016f
            com.whatsapp.wds.components.search.WDSSearchView r0 = r0.A08
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x016f
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0i
            r0.A02(r1)
        L_0x016f:
            com.whatsapp.settings.SettingsTabActivity.A0V(r3)
        L_0x0172:
            X.00H r0 = r3.A16
            java.lang.Object r2 = r0.get()
            X.4Xf r2 = (X.C87824Xf) r2
            android.view.View r1 = r3.A00
            java.lang.String r0 = ""
            r2.A02(r1, r0, r7)
            r2 = 0
            r3.A1C = r2
            return r2
        L_0x0185:
            java.lang.Object r2 = r6.A01
            X.4OE r2 = (X.AnonymousClass4OE) r2
            r0 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r7, r0)
            java.lang.String r0 = "ReachoutTimelockQueryRunner/error fetching reachout timelock info: "
            X.C17900vP.A0X(r7, r0, r1)
            X.1Qo r2 = r2.A00
            X.3xL r1 = X.C80543xL.A01
            r0 = 0
            r2.A00(r1, r0)
        L_0x019b:
            r0 = 0
        L_0x019c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x01a1:
            java.lang.Object r2 = r6.A01
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            X.1gc r1 = r2.A0H
            X.1BI r0 = r2.A0B
            X.1EC r0 = X.AnonymousClass3MW.A0i(r0)
            X.1yg r0 = r1.A01(r7, r0)
            r2.A0N(r0, r7)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99254sW.invoke(java.lang.Object):java.lang.Object");
    }

    public C99254sW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
