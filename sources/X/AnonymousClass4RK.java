package X;

import android.content.Context;

/* renamed from: X.4RK  reason: invalid class name */
public class AnonymousClass4RK {
    public final C62052qi A00;
    public final AnonymousClass2T5 A01;
    public final Context A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1M9 A04;
    public final C25181Nf A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026d, code lost:
        if (r12.getBoolean("has_number_from_url") != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0286, code lost:
        if (r12.getBoolean("has_text_from_url") != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ab, code lost:
        if (r12.getBoolean("added_by_qr_code") != false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c4, code lost:
        if (r12.getBoolean("added_by_number_search") != false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        if (r0.A0b == r5) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4PL A00(android.content.Intent r11, android.os.Bundle r12, boolean r13) {
        /*
            r10 = this;
            X.4PM r2 = new X.4PM
            r2.<init>()
            r4 = 1
            if (r11 == 0) goto L_0x00f4
            X.2qi r1 = r10.A00
            r0 = 0
            boolean r0 = r1.A00(r11, r0)
            if (r0 == 0) goto L_0x00f4
            android.content.Context r7 = r10.A02
            boolean r0 = X.C60392nx.A01(r7, r11)
            r2.A0Z = r0
            java.lang.String r0 = "fromNotification"
            r3 = 0
            boolean r0 = r11.getBooleanExtra(r0, r3)
            r2.A0d = r0
            java.lang.String r0 = "fromCallNotification"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            r2.A0c = r0
            java.lang.String r0 = "vcLobbyCallId"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0R = r0
            java.lang.String r0 = "jid"
            java.lang.String r0 = r11.getStringExtra(r0)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            r2.A0A = r0
            r6 = 2
            if (r0 != 0) goto L_0x00ce
            android.net.Uri r0 = r11.getData()
            r2.A04 = r0
            boolean r0 = X.C62952sG.A01(r0)
            if (r0 == 0) goto L_0x006f
            X.1M9 r0 = r10.A04
            X.1E7 r0 = r0.A0B(r11)
            r2.A09 = r0
            if (r0 == 0) goto L_0x005d
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            r2.A0A = r0
        L_0x005d:
            r9 = 0
        L_0x005e:
            X.1BI r0 = r2.A0A
            if (r0 == 0) goto L_0x0204
            java.lang.String r0 = "mat_entry_point"
            int r0 = r11.getIntExtra(r0, r3)
            if (r0 != 0) goto L_0x00f7
            X.1BI r0 = r2.A0A
            if (r0 == 0) goto L_0x00f7
            goto L_0x00d0
        L_0x006f:
            android.net.Uri r0 = r2.A04
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "smsto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008d
            android.net.Uri r0 = r2.A04
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "sms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f1
        L_0x008d:
            java.lang.String r1 = r11.getDataString()
            if (r1 != 0) goto L_0x0097
            java.lang.String r0 = "conversation/sms/no uri"
            goto L_0x0166
        L_0x0097:
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r1.split(r0)
            int r0 = r5.length
            if (r0 != r6) goto L_0x00ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/sms-jid/raw-number "
            r1.append(r0)
            r0 = r5[r4]
            X.C17890vO.A1A(r1, r0)
            r0 = r5[r4]
            java.lang.String r1 = java.net.URLDecoder.decode(r0)
            X.1M9 r0 = r10.A04
            X.1E7 r0 = r0.A0J(r1, r4)
            if (r0 == 0) goto L_0x00dd
            r2.A09 = r0
            X.1BI r5 = X.AnonymousClass1E7.A00(r0)
            r2.A0A = r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/sms-jid:"
            X.C17900vP.A0Y(r5, r0, r1)
            goto L_0x005d
        L_0x00ce:
            r9 = 1
            goto L_0x005e
        L_0x00d0:
            java.lang.String r0 = "ConversationIntentParser/remapJid"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0437 }
            X.1BI r0 = r2.A0A     // Catch:{ all -> 0x0437 }
            X.C18070vi.A0d(r0, r3)     // Catch:{ all -> 0x0437 }
            r2.A0A = r0     // Catch:{ all -> 0x0437 }
            goto L_0x00f7
        L_0x00dd:
            java.lang.String r0 = "conversation/tell-a-friend"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "sms_body"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0S = r0
            r0 = 3
            r2.A02 = r0
            goto L_0x016b
        L_0x00ee:
            java.lang.String r0 = "conversation/sms/no jid"
            goto L_0x0166
        L_0x00f1:
            java.lang.String r0 = "conversation/start no jid"
            goto L_0x0166
        L_0x00f4:
            java.lang.String r0 = "ConversationIntentParser/parse: fail to verify"
            goto L_0x0166
        L_0x00f7:
            java.lang.String r1 = "chat_origin"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r11.getStringExtra(r1)
            X.2Qs r0 = X.C29731cm.A00(r0)
            r2.A08 = r0
        L_0x0109:
            java.lang.String r1 = "ctwa_deeplink_content"
            boolean r0 = r11.hasExtra(r1)
            if (r0 == 0) goto L_0x011d
            android.os.Bundle r0 = r11.getBundleExtra(r1)
            if (r0 == 0) goto L_0x0433
            X.4Xd r0 = X.AnonymousClass4GX.A00(r0)
        L_0x011b:
            r2.A07 = r0
        L_0x011d:
            X.1BI r0 = r2.A0A
            boolean r0 = r0 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x01aa
            X.2Qs r0 = r2.A08
            X.2Qs r5 = X.C49502Qs.CTWA
            if (r0 == r5) goto L_0x01aa
            X.4Xd r1 = r2.A07
            X.4Xd r0 = X.C87814Xd.A0e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01aa
            X.00H r0 = r10.A07
            java.lang.Object r1 = r0.get()
            X.1NG r1 = (X.AnonymousClass1NG) r1
            X.1BI r8 = r2.A0A
            X.1E1 r8 = (X.AnonymousClass1E1) r8
            if (r8 == 0) goto L_0x0160
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x0160
            X.00H r0 = r1.A02
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            X.00H r0 = r1.A00
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r8)
            if (r0 == 0) goto L_0x0171
            X.2Qs r0 = r0.A0b
            if (r0 != r5) goto L_0x0171
        L_0x0160:
            r2.A0A = r8
            if (r8 != 0) goto L_0x01aa
            java.lang.String r0 = "conversation/failed to normalize jid"
        L_0x0166:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A02 = r4
        L_0x016b:
            X.4PL r0 = new X.4PL
            r0.<init>(r2)
            return r0
        L_0x0171:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Fail to open LID chat: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r8, r0, r5)
            X.C17960vV.A0F(r3, r0)
            r5 = 0
            X.00H r0 = r1.A03     // Catch:{ all -> 0x0437 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0437 }
            X.1Ln r0 = (X.C24751Ln) r0     // Catch:{ all -> 0x0437 }
            com.whatsapp.jid.PhoneUserJid r8 = r0.A0D(r8)     // Catch:{ all -> 0x0437 }
            if (r8 == 0) goto L_0x019b
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0437 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0437 }
            X.190 r1 = (X.AnonymousClass190) r1     // Catch:{ all -> 0x0437 }
            java.lang.String r0 = "invalid-lid-chat-with-fallback"
            r1.A0G(r0, r5, r4)     // Catch:{ all -> 0x0437 }
            goto L_0x0160
        L_0x019b:
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0437 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0437 }
            X.190 r1 = (X.AnonymousClass190) r1     // Catch:{ all -> 0x0437 }
            java.lang.String r0 = "invalid-lid-chat-no-fallback"
            r1.A0G(r0, r5, r4)     // Catch:{ all -> 0x0437 }
            r8 = r5
            goto L_0x0160
        L_0x01aa:
            X.1M9 r1 = r10.A04
            X.1BI r0 = r2.A0A
            X.1E7 r5 = r1.A0E(r0)
            if (r5 != 0) goto L_0x01bb
            X.1BI r0 = r2.A0A
            X.1E7 r5 = new X.1E7
            r5.<init>(r0)
        L_0x01bb:
            boolean r0 = r5.A0F()
            if (r0 != 0) goto L_0x01c9
            X.1BI r0 = r5.A0J
            boolean r0 = X.C22971Dz.A0c(r0)
            if (r0 == 0) goto L_0x01f0
        L_0x01c9:
            java.lang.String r0 = r5.A0K()
            if (r0 != 0) goto L_0x01f0
            java.lang.String r0 = "displayname"
            java.lang.String r5 = r11.getStringExtra(r0)
            if (r5 == 0) goto L_0x01eb
            java.lang.String r0 = "conversation/create/group-shortcut-removed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r10.A03
            r0 = 2131891089(0x7f121391, float:1.9416888E38)
            java.lang.String r0 = X.C17890vO.A0R(r7, r5, r4, r3, r0)
            r1.A0G(r0, r4)
            r2.A02 = r6
            goto L_0x016b
        L_0x01eb:
            X.1BI r0 = r2.A0A
            r1.A0H(r0)
        L_0x01f0:
            X.1BI r5 = r2.A0A
            boolean r0 = X.C22971Dz.A0L(r5)
            if (r0 != 0) goto L_0x0204
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/create/cannot-start-conversation-with-jid: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)
            goto L_0x0166
        L_0x0204:
            if (r9 == 0) goto L_0x0230
            X.0ve r0 = r10.A06
            boolean r0 = X.AnonymousClass3MX.A1W(r0)
            X.1Nf r8 = r10.A05
            X.1BI r7 = r2.A0A
            if (r0 == 0) goto L_0x024c
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.10I r5 = r8.A05
            r1 = 14
            X.3C4 r0 = new X.3C4
            r0.<init>(r8, r6, r7, r1)
            r5.CGF(r0)
            int r0 = r6.size()
            if (r0 != 0) goto L_0x0245
            X.1M9 r0 = r8.A02
            X.1E7 r0 = r0.A0H(r7)
        L_0x022e:
            r2.A09 = r0
        L_0x0230:
            X.1E7 r0 = r2.A09
            if (r0 != 0) goto L_0x0251
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/start no contact for "
            r1.append(r0)
            X.1BI r0 = r2.A0A
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            goto L_0x0166
        L_0x0245:
            java.lang.Object r0 = r6.get(r3)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            goto L_0x022e
        L_0x024c:
            X.1E7 r0 = r8.A01(r7)
            goto L_0x022e
        L_0x0251:
            java.lang.String r0 = "has_share"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            r2.A0f = r0
            java.lang.String r0 = "number_from_url"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0362
            if (r13 == 0) goto L_0x026f
            X.C17960vV.A07(r12)
            java.lang.String r0 = "has_number_from_url"
            boolean r1 = r12.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0270
        L_0x026f:
            r0 = 1
        L_0x0270:
            r2.A0e = r0
        L_0x0272:
            java.lang.String r0 = "text_from_url"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x035e
            if (r13 == 0) goto L_0x0288
            X.C17960vV.A07(r12)
            java.lang.String r0 = "has_text_from_url"
            boolean r1 = r12.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0289
        L_0x0288:
            r0 = 1
        L_0x0289:
            r2.A0g = r0
        L_0x028b:
            java.lang.String r0 = "similar_newsletters_session_id"
            java.io.Serializable r1 = r11.getSerializableExtra(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0299
            java.lang.Long r1 = (java.lang.Long) r1
            r2.A0F = r1
        L_0x0299:
            java.lang.String r1 = "added_by_qr_code"
            boolean r0 = r11.getBooleanExtra(r1, r3)
            if (r0 == 0) goto L_0x02b0
            if (r13 == 0) goto L_0x02ad
            X.C17960vV.A07(r12)
            boolean r1 = r12.getBoolean(r1)
            r0 = 0
            if (r1 == 0) goto L_0x02ae
        L_0x02ad:
            r0 = 1
        L_0x02ae:
            r2.A0Y = r0
        L_0x02b0:
            java.lang.String r0 = "contact_out_address_book"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x02c9
            if (r13 == 0) goto L_0x02c6
            X.C17960vV.A07(r12)
            java.lang.String r0 = "added_by_number_search"
            boolean r1 = r12.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x02c7
        L_0x02c6:
            r0 = 1
        L_0x02c7:
            r2.A0X = r0
        L_0x02c9:
            boolean r0 = r2.A0f
            if (r0 == 0) goto L_0x0335
            if (r13 != 0) goto L_0x0335
            boolean r0 = r2.A0Z
            if (r0 == 0) goto L_0x0335
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r11.getParcelableArrayListExtra(r0)
            r2.A0V = r0
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0M = r0
            java.lang.String r0 = "origin"
            int r0 = r11.getIntExtra(r0, r3)
            r2.A00 = r0
            java.lang.String r0 = "skip_preview"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            r2.A0b = r0
            java.lang.String r0 = "vcard_name"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0T = r0
            java.lang.String r0 = "vcard_str"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0U = r0
            java.lang.String r0 = "vcard_array_str"
            java.util.ArrayList r0 = r11.getStringArrayListExtra(r0)
            r2.A0W = r0
            android.os.Bundle r0 = r11.getExtras()
            if (r0 == 0) goto L_0x031d
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String r0 = "wa_type"
            int r0 = r1.getInt(r0)
            r2.A01 = r0
        L_0x031d:
            java.lang.String r0 = "share_msg"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0Q = r0
            java.lang.String r0 = "iq_code"
            java.lang.String r0 = r11.getStringExtra(r0)
            r2.A0H = r0
            java.lang.String r0 = "confirm"
            boolean r0 = r11.getBooleanExtra(r0, r3)
            r2.A0a = r0
        L_0x0335:
            java.lang.String r1 = "new_group_result_bundle"
            android.os.Bundle r0 = r11.getBundleExtra(r1)
            if (r0 == 0) goto L_0x0345
            if (r13 != 0) goto L_0x0345
            android.os.Bundle r0 = r11.getBundleExtra(r1)
            r2.A05 = r0
        L_0x0345:
            java.lang.String r1 = "product"
            android.os.Parcelable r0 = r11.getParcelableExtra(r1)
            if (r0 == 0) goto L_0x0355
            android.os.Parcelable r0 = r11.getParcelableExtra(r1)
            X.AEv r0 = (X.C20287AEv) r0
            r2.A06 = r0
        L_0x0355:
            java.lang.String r1 = "business_jid"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x0379
            goto L_0x0366
        L_0x035e:
            r2.A0g = r3
            goto L_0x028b
        L_0x0362:
            r2.A0e = r3
            goto L_0x0272
        L_0x0366:
            java.lang.String r1 = r11.getStringExtra(r1)     // Catch:{ 11T -> 0x0373 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 11T -> 0x0373 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A03(r1)     // Catch:{ 11T -> 0x0373 }
            r2.A0C = r0     // Catch:{ 11T -> 0x0373 }
            goto L_0x0379
        L_0x0373:
            r1 = move-exception
            java.lang.String r0 = "ConversationIntentParser/businessJid is not a user jid"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0379:
            java.lang.String r1 = "product_file"
            java.io.Serializable r0 = r11.getSerializableExtra(r1)
            if (r0 == 0) goto L_0x0389
            java.io.Serializable r0 = r11.getSerializableExtra(r1)
            java.io.File r0 = (java.io.File) r0
            r2.A0D = r0
        L_0x0389:
            java.lang.String r1 = "group_reply_jid"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x03bb
            X.AEv r0 = r2.A06
            if (r0 == 0) goto L_0x0399
            java.lang.String r0 = "ConversationIntentParser/groupReplyAndProductShouldNotBothExist"
            goto L_0x0166
        L_0x0399:
            java.lang.String r1 = r11.getStringExtra(r1)     // Catch:{ 11T -> 0x03b6 }
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x03b6 }
            X.1EC r0 = X.C42941yz.A01(r1)     // Catch:{ 11T -> 0x03b6 }
            r2.A0B = r0     // Catch:{ 11T -> 0x03b6 }
            java.lang.String r0 = "group_reply_subject"
            java.lang.String r0 = r11.getStringExtra(r0)     // Catch:{ 11T -> 0x03b6 }
            r2.A0O = r0     // Catch:{ 11T -> 0x03b6 }
            java.lang.String r0 = "group_reply_parent_group_jid"
            java.lang.String r0 = r11.getStringExtra(r0)     // Catch:{ 11T -> 0x03b6 }
            r2.A0N = r0     // Catch:{ 11T -> 0x03b6 }
            goto L_0x03bb
        L_0x03b6:
            java.lang.String r0 = "ConversationIntentParser/groupReplyJid is not a permanent group jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03bb:
            java.lang.String r1 = "entry_point_conversion_source"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x03c9
            java.lang.String r0 = r11.getStringExtra(r1)
            r2.A0L = r0
        L_0x03c9:
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x03d7
            java.lang.String r0 = r11.getStringExtra(r1)
            r2.A0I = r0
        L_0x03d7:
            java.lang.String r1 = "entry_point_conversion_external_source"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x03e5
            java.lang.String r0 = r11.getStringExtra(r1)
            r2.A0K = r0
        L_0x03e5:
            java.lang.String r1 = "entry_point_conversion_external_medium"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x03f3
            java.lang.String r0 = r11.getStringExtra(r1)
            r2.A0J = r0
        L_0x03f3:
            java.lang.String r4 = "extra_quoted_message_row_id"
            boolean r0 = r11.hasExtra(r4)
            if (r0 == 0) goto L_0x0407
            r0 = -1
            long r0 = r11.getLongExtra(r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
        L_0x0407:
            java.lang.String r1 = "integrity_survey_session_info"
            boolean r0 = r11.hasExtra(r1)
            if (r0 == 0) goto L_0x0415
            java.lang.String r0 = r11.getStringExtra(r1)
            r2.A0P = r0
        L_0x0415:
            java.lang.String r1 = "ctc_deeplink_option"
            java.lang.String r0 = r11.getStringExtra(r1)
            if (r0 == 0) goto L_0x0423
            java.lang.String r0 = r11.getStringExtra(r1)
            r2.A0G = r0
        L_0x0423:
            java.lang.String r1 = "vcSlienceReason"
            boolean r0 = r11.hasExtra(r1)
            if (r0 == 0) goto L_0x016b
            int r0 = r11.getIntExtra(r1, r3)
            r2.A03 = r0
            goto L_0x016b
        L_0x0433:
            X.4Xd r0 = X.C87814Xd.A0e
            goto L_0x011b
        L_0x0437:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0439 }
        L_0x0439:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RK.A00(android.content.Intent, android.os.Bundle, boolean):X.4PL");
    }

    public AnonymousClass4RK(AnonymousClass1KB r2, AnonymousClass1M9 r3, C62052qi r4, AnonymousClass2T5 r5, AnonymousClass118 r6, C25181Nf r7, C18030ve r8, AnonymousClass00H r9) {
        this.A02 = r6.A00;
        this.A06 = r8;
        this.A03 = r2;
        this.A01 = r5;
        this.A04 = r3;
        this.A07 = r9;
        this.A05 = r7;
        this.A00 = r4;
    }
}
