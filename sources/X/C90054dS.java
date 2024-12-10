package X;

import android.view.View;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4dS  reason: invalid class name and case insensitive filesystem */
public class C90054dS implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C90054dS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C90054dS(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.music.musiceditor.ui.MusicEditorDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0441, code lost:
        r3.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0444, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0445, code lost:
        r0 = "metaAiVoiceJourneyLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04a2, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04a6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04b2, code lost:
        r4.A29();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        r0.CPr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018d, code lost:
        com.whatsapp.newsletter.NewsletterInfoActivity.A1H(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0476;
                case 1: goto L_0x0469;
                case 2: goto L_0x0493;
                case 3: goto L_0x0461;
                case 4: goto L_0x0448;
                case 5: goto L_0x041d;
                case 6: goto L_0x03fc;
                case 7: goto L_0x03ee;
                case 8: goto L_0x03de;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00c2;
                case 11: goto L_0x008a;
                case 12: goto L_0x03c9;
                case 13: goto L_0x03b7;
                case 14: goto L_0x007e;
                case 15: goto L_0x0077;
                case 16: goto L_0x0070;
                case 17: goto L_0x03ab;
                case 18: goto L_0x03ab;
                case 19: goto L_0x03a5;
                case 20: goto L_0x0145;
                case 21: goto L_0x0399;
                case 22: goto L_0x0363;
                case 23: goto L_0x033d;
                case 24: goto L_0x0321;
                case 25: goto L_0x0304;
                case 26: goto L_0x02fe;
                case 27: goto L_0x02f2;
                case 28: goto L_0x02f2;
                case 29: goto L_0x02ea;
                case 30: goto L_0x02d1;
                case 31: goto L_0x029b;
                case 32: goto L_0x0049;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x027a;
                case 36: goto L_0x0255;
                case 37: goto L_0x024c;
                case 38: goto L_0x0023;
                case 39: goto L_0x01fc;
                case 40: goto L_0x01c8;
                case 41: goto L_0x019a;
                case 42: goto L_0x0191;
                case 43: goto L_0x0187;
                case 44: goto L_0x0180;
                case 45: goto L_0x016e;
                case 46: goto L_0x0164;
                case 47: goto L_0x015c;
                case 48: goto L_0x0152;
                case 49: goto L_0x0149;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            X.2Dk r3 = com.whatsapp.newsletter.NewsletterInfoActivity.A0y(r4)
            if (r3 == 0) goto L_0x0022
            X.00H r0 = r4.A0T
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.17w r2 = (X.C219117w) r2
            boolean r1 = r3.A0P()
            X.1ch r0 = r3.A0M()
            X.C1403070w.A00(r4, r2, r0, r1)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r3 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            X.2Dk r2 = r3.A4l()
            if (r2 == 0) goto L_0x0022
            X.9Ig r1 = r2.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x003b
            com.whatsapp.newsletter.NewsletterInfoActivity.A15(r3)
            return
        L_0x003b:
            X.9Ig r1 = r2.A02
            X.9Ig r0 = X.C179509Ig.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0022
            com.whatsapp.newsletter.NewsletterInfoActivity.A14(r3)
            return
        L_0x0049:
            java.lang.Object r3 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            X.2Dk r0 = com.whatsapp.newsletter.NewsletterInfoActivity.A0y(r3)
            if (r0 == 0) goto L_0x0022
            X.AnonymousClass3MY.A1Q(r3)
            X.1ch r1 = r0.A0M()
            r0 = 2
            android.content.Intent r2 = X.AnonymousClass1LU.A16(r3, r1, r0)
            java.lang.String r1 = X.C72463Mc.A0p(r3)
            X.11P r0 = r3.A05
            X.C18070vi.A0W(r0)
            X.C60442o2.A00(r2, r0, r1)
            r0 = 0
            r3.startActivity(r2, r0)
            return
        L_0x0070:
            java.lang.Object r0 = r12.A01
            X.9i0 r0 = (X.C188799i0) r0
            X.B8I r0 = r0.A0G
            goto L_0x0084
        L_0x0077:
            java.lang.Object r0 = r12.A01
            X.9i0 r0 = (X.C188799i0) r0
            X.B8I r0 = r0.A0F
            goto L_0x0084
        L_0x007e:
            java.lang.Object r0 = r12.A01
            X.9i0 r0 = (X.C188799i0) r0
            X.B8I r0 = r0.A0E
        L_0x0084:
            if (r0 == 0) goto L_0x0022
            r0.CPr()
            return
        L_0x008a:
            java.lang.Object r4 = r12.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet r4 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet) r4
            android.content.Context r3 = r4.A1n()
            if (r3 == 0) goto L_0x0022
            X.0vl r1 = r4.A0S
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            r0.A0V()
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            X.1DT r1 = r0.A0D
            X.6RF r0 = X.AnonymousClass6RF.CONNECTING
            r1.A0F(r0)
            X.00H r0 = r4.A0E
            if (r0 == 0) goto L_0x0490
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity"
            r2.setClassName(r1, r0)
            r0 = 1
            r4.startActivityForResult(r2, r0)
            return
        L_0x00c2:
            java.lang.Object r1 = r12.A01
            X.6js r1 = (X.C130706js) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r4 = r1.A08
            X.1vp r3 = r4.A0N
            boolean r0 = X.C72463Mc.A1O(r3)
            r2 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r3.A0F(r1)
            X.00H r0 = r4.A0U
            java.lang.Object r0 = r0.get()
            X.4jJ r0 = (X.C93644jJ) r0
            r0.A0A = r2
            X.A99 r0 = r0.A00
            if (r0 == 0) goto L_0x0022
            r0.A0z(r1)
            return
        L_0x00ed:
            java.lang.Object r1 = r12.A01
            X.6js r1 = (X.C130706js) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r4 = r1.A08
            X.1vp r3 = r4.A0O
            boolean r0 = X.C72463Mc.A1O(r3)
            r0 = r0 ^ 1
            X.AnonymousClass3MY.A1L(r3, r0)
            java.lang.Object r2 = r3.A06()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            X.6ya r0 = r4.A0I
            X.64Z r0 = r0.A01
            if (r0 == 0) goto L_0x0114
            r0.A00 = r2
        L_0x0114:
            X.00H r0 = r4.A0U
            java.lang.Object r0 = r0.get()
            X.4jJ r0 = (X.C93644jJ) r0
            r0.A0B = r1
            X.A99 r0 = r0.A00
            if (r0 == 0) goto L_0x0125
            r0.A19(r1)
        L_0x0125:
            X.00H r0 = r4.A0T
            java.lang.Object r0 = r0.get()
            X.1rn r0 = (X.C38731rn) r0
            boolean r2 = X.C72463Mc.A1O(r3)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "pref_meta_ai_audio_player_muted"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            if (r0 == 0) goto L_0x0022
            r0.apply()
            return
        L_0x0145:
            java.lang.String r0 = "logger"
            goto L_0x04a2
        L_0x0149:
            java.lang.Object r1 = r12.A01
            com.whatsapp.newsletter.insights.NewsletterInsightsActivity r1 = (com.whatsapp.newsletter.insights.NewsletterInsightsActivity) r1
            r0 = 1
            com.whatsapp.newsletter.insights.NewsletterInsightsActivity.A03(r1, r0)
            return
        L_0x0152:
            java.lang.Object r0 = r12.A01
            X.43W r0 = (X.AnonymousClass43W) r0
            android.view.View r0 = r0.A00
            r0.showContextMenu()
            return
        L_0x015c:
            java.lang.Object r0 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment r0 = (com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment) r0
            r0.BKr()
            return
        L_0x0164:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 52
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x016e:
            java.lang.Object r2 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            X.3zj r1 = r2.A0e
            if (r1 == 0) goto L_0x017c
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A00 = r0
        L_0x017c:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1A(r2)
            return
        L_0x0180:
            java.lang.Object r2 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            r1 = 1
            r0 = 2
            goto L_0x018d
        L_0x0187:
            java.lang.Object r2 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            r1 = 0
            r0 = 1
        L_0x018d:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1H(r2, r1, r0)
            return
        L_0x0191:
            java.lang.Object r1 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            r0 = 0
            com.whatsapp.newsletter.NewsletterInfoActivity.A1H(r1, r0, r0)
            return
        L_0x019a:
            java.lang.Object r3 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            r8 = 0
            X.00H r0 = r3.A4o()
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.74D r4 = (X.AnonymousClass74D) r4
            X.1ch r5 = r3.A4m()
            long r10 = r3.A01
            r0 = 9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r9 = 4
            r4.A0E(r5, r6, r7, r8, r9, r10)
            X.1ch r2 = r3.A4m()
            long r0 = r3.A01
            com.whatsapp.newsletter.insights.fragment.NewsletterInsightsInfoSheet r0 = X.AnonymousClass4H7.A00(r2, r8, r8, r0)
            r3.CMl(r0)
            return
        L_0x01c8:
            java.lang.Object r7 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r7 = (com.whatsapp.newsletter.NewsletterInfoActivity) r7
            java.lang.String r6 = com.whatsapp.newsletter.NewsletterInfoActivity.A10(r7)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r5.putExtra(r0, r6)
            java.lang.String r0 = "text/plain"
            r5.setType(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            r5.addFlags(r0)
            X.74D r4 = X.C72453Mb.A0o(r7)
            X.1ch r3 = r7.A4m()
            r2 = 3
            r1 = 2
            r0 = 0
            r4.A0D(r3, r0, r2, r1)
            android.content.Intent r0 = android.content.Intent.createChooser(r5, r6)
            r7.startActivity(r0)
            return
        L_0x01fc:
            java.lang.Object r6 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r6 = (com.whatsapp.newsletter.NewsletterInfoActivity) r6
            java.lang.String r0 = com.whatsapp.newsletter.NewsletterInfoActivity.A10(r6)
            java.lang.String r7 = X.AnonymousClass74F.A07(r0)
            X.AnonymousClass3MY.A1Q(r6)
            java.lang.String r4 = "text/plain"
            X.1ch r3 = r6.A4m()
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r5 = X.C72473Md.A0B(r6, r0)
            java.lang.String r1 = "source_surface"
            r0 = 28
            r5.putExtra(r1, r0)
            r5.setType(r4)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r5.putExtra(r0, r7)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "newsletter_invite_link_jid"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "disable_post_send_intent"
            r5.putExtra(r0, r2)
            X.74D r4 = X.C72453Mb.A0o(r6)
            X.1ch r3 = r6.A4m()
            r2 = 1
            r1 = 2
            r0 = 0
            r4.A0D(r3, r0, r2, r1)
            r0 = 54
            r6.startActivityForResult(r5, r0)
            return
        L_0x024c:
            java.lang.Object r1 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            r0 = 1
            r1.A4r(r0)
            return
        L_0x0255:
            java.lang.Object r4 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            X.AnonymousClass3MY.A1Q(r4)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r13)
            X.1ch r3 = r4.A4m()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A13(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x027a:
            java.lang.Object r5 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            X.AnonymousClass3MY.A1Q(r5)
            X.1ch r4 = r5.A4m()
            java.lang.String r3 = "jid"
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity"
            r2.setClassName(r1, r0)
            X.AnonymousClass3MY.A12(r2, r4, r3)
            r5.startActivity(r2)
            return
        L_0x029b:
            java.lang.Object r3 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            X.00H r0 = r3.A17
            if (r0 == 0) goto L_0x02cd
            java.lang.Object r2 = r0.get()
            X.1aA r2 = (X.C28401aA) r2
            java.lang.String r1 = "newsletter_multi_admin"
            r0 = 0
            boolean r0 = r2.A01(r0, r1)
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x02c9
            X.1GP r2 = r3.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet r1 = new com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r1.A1R(r0)
            X.C20098A7b.A02(r1, r2)
            return
        L_0x02c9:
            r3.Bw9(r0)
            return
        L_0x02cd:
            java.lang.String r0 = "nuxManager"
            goto L_0x04a2
        L_0x02d1:
            java.lang.Object r0 = r12.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            X.3VG r2 = r0.A0j
            if (r2 != 0) goto L_0x02dd
            java.lang.String r0 = "newsletterInsightsViewModel"
            goto L_0x04a2
        L_0x02dd:
            X.0vl r0 = r0.A1M
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            r0 = 1
            r2.A0V(r1, r0)
            return
        L_0x02ea:
            java.lang.Object r0 = r12.A01
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment r0 = (com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment) r0
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.A01(r0)
            return
        L_0x02f2:
            java.lang.Object r1 = r12.A01
            X.43F r1 = (X.AnonymousClass43F) r1
            java.util.List r0 = X.C42011xT.A0I
            X.5aA r0 = r1.A00
            r0.CAa()
            return
        L_0x02fe:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0304:
            java.lang.Object r3 = r12.A01
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog r3 = (com.whatsapp.music.musiceditor.ui.MusicEditorDialog) r3
            X.0vl r0 = r3.A0O
            java.lang.Object r2 = r0.getValue()
            X.5iM r2 = (X.C111125iM) r2
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog.A02(r3, r2)
            r1 = 0
            X.1DT r0 = r2.A07
            r0.A0F(r1)
            r1 = 1
            X.1DT r0 = r2.A08
            X.AnonymousClass3MY.A1L(r0, r1)
            goto L_0x0441
        L_0x0321:
            java.lang.Object r2 = r12.A01
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog r2 = (com.whatsapp.music.musiceditor.ui.MusicEditorDialog) r2
            r1 = 0
            android.widget.ImageView r0 = r2.A05
            if (r0 == 0) goto L_0x032d
            r0.setEnabled(r1)
        L_0x032d:
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x0336
            r0 = 0
        L_0x0332:
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog.A03(r2, r0)
            return
        L_0x0336:
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0332
        L_0x033d:
            java.lang.Object r4 = r12.A01
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog r4 = (com.whatsapp.music.musiceditor.ui.MusicEditorDialog) r4
            r3 = 0
            X.0vl r0 = r4.A0O
            java.lang.Object r2 = r0.getValue()
            X.5iM r2 = (X.C111125iM) r2
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog.A02(r4, r2)
            r1 = 0
            X.1DT r0 = r2.A07
            r0.A0F(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.6zV r1 = new X.6zV
            r1.<init>(r0, r3)
            X.1DT r0 = r2.A06
            r0.A0F(r1)
            r4.A28()
            return
        L_0x0363:
            java.lang.Object r5 = r12.A01
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog r5 = (com.whatsapp.music.musiceditor.ui.MusicEditorDialog) r5
            r4 = 0
            X.0vl r0 = r5.A0O
            java.lang.Object r3 = r0.getValue()
            X.5iM r3 = (X.C111125iM) r3
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog.A02(r5, r3)
            X.77c r2 = r5.A0C
            if (r2 == 0) goto L_0x0397
            int r0 = r5.A01
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            X.6rN r1 = new X.6rN
            r1.<init>(r2, r0)
        L_0x0382:
            X.1DT r0 = r3.A07
            r0.A0F(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.6zV r1 = new X.6zV
            r1.<init>(r0, r4)
            X.1DT r0 = r3.A06
            r0.A0F(r1)
            r5.A28()
            return
        L_0x0397:
            r1 = 0
            goto L_0x0382
        L_0x0399:
            java.lang.Object r1 = r12.A01
            X.5ma r1 = (X.C113125ma) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A01
            r0.invoke()
            return
        L_0x03a5:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x03ab:
            java.lang.Object r0 = r12.A01
            X.8vP r0 = (X.C173628vP) r0
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r0.A4b()
            r0.A0c()
            return
        L_0x03b7:
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationDataExportedActivity/dataExportReadyFinishActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 100
            r1.setResult(r0)
            r1.finish()
            return
        L_0x03c9:
            java.lang.Object r3 = r12.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r3 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r3
            X.00H r0 = r3.A0W
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r1 = 34
            X.3Bs r0 = new X.3Bs
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x03de:
            java.lang.Object r1 = r12.A01
            X.6js r1 = (X.C130706js) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r2 = r1.A08
            r1 = 1
            r0 = 2
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel.A08(r2, r1, r0)
            return
        L_0x03ee:
            java.lang.Object r1 = r12.A01
            X.6js r1 = (X.C130706js) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = r1.A08
            r0.A0T()
            return
        L_0x03fc:
            java.lang.Object r3 = r12.A01
            com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet r3 = (com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet) r3
            X.00H r0 = r3.A04
            if (r0 == 0) goto L_0x0445
            java.lang.Object r2 = r0.get()
            X.4XB r2 = (X.AnonymousClass4XB) r2
            java.lang.Integer r0 = r3.A05
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            X.AnonymousClass3MZ.A1T(r1, r0)
            r0 = 74
            X.AnonymousClass4XB.A00(r1, r2, r0)
            r3.A28()
            return
        L_0x041d:
            java.lang.Object r3 = r12.A01
            com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet r3 = (com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet) r3
            X.00H r0 = r3.A04
            if (r0 == 0) goto L_0x0445
            java.lang.Object r2 = r0.get()
            X.4XB r2 = (X.AnonymousClass4XB) r2
            java.lang.Integer r0 = r3.A05
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            X.AnonymousClass3MZ.A1T(r1, r0)
            r0 = 73
            X.AnonymousClass4XB.A00(r1, r2, r0)
            X.0vk r0 = r3.A06
            if (r0 == 0) goto L_0x0441
            r0.invoke()
        L_0x0441:
            r3.A28()
            return
        L_0x0445:
            java.lang.String r0 = "metaAiVoiceJourneyLogger"
            goto L_0x04a2
        L_0x0448:
            java.lang.Object r4 = r12.A01
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            java.lang.String r0 = "MessageTranslationLanguageSelectorFragment/continue_cta"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1GP r3 = r4.A1F()
            java.lang.String r2 = "translation_language_selector_result_key"
            r1 = 0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r1)
            r3.A0w(r2, r0)
            goto L_0x04b2
        L_0x0461:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0469:
            java.lang.Object r1 = r12.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            java.lang.String r0 = "MessageTranslationWelcomeFragment/close"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A29()
            return
        L_0x0476:
            java.lang.Object r1 = r12.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "MessageTranslationWelcomeFragment/select_language"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r0 = r1.A1D()
            X.1GP r1 = r0.getSupportFragmentManager()
            com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment r0 = new com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment
            r0.<init>()
            X.C20098A7b.A01(r0, r1)
            return
        L_0x0490:
            java.lang.String r0 = "waIntents"
            goto L_0x04a2
        L_0x0493:
            java.lang.Object r4 = r12.A01
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r4 = (com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment) r4
            java.lang.String r0 = "MessageTranslationWelcomeFragment/translate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messagetranslation.onboarding.TranslationViewModel r3 = r4.A01
            if (r3 != 0) goto L_0x04a7
            java.lang.String r0 = "viewModel"
        L_0x04a2:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x04a7:
            X.1OX r2 = r3.A09
            r1 = 0
            com.whatsapp.messagetranslation.onboarding.TranslationViewModel$translate$1 r0 = new com.whatsapp.messagetranslation.onboarding.TranslationViewModel$translate$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
        L_0x04b2:
            r4.A29()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90054dS.onClick(android.view.View):void");
    }

    public C90054dS(NewsletterInfoActivity newsletterInfoActivity) {
        this.A00 = 41;
        this.A01 = newsletterInfoActivity;
    }
}
