package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.2qi  reason: invalid class name and case insensitive filesystem */
public class C62052qi {
    public static final Set A05;
    public final AnonymousClass190 A00;
    public final C18030ve A01;
    public final AnonymousClass1NL A02;
    public final C37001oo A03;
    public final List A04 = AnonymousClass000.A13();

    static {
        String[] strArr = new String[30];
        strArr[0] = "authentication_token";
        strArr[1] = "vcard_array_str";
        strArr[2] = "contact_out_address_book";
        strArr[3] = "added_by_qr_code";
        strArr[4] = "wa_type";
        strArr[5] = "confirm";
        strArr[6] = "iq_code";
        strArr[7] = "entry_point_conversion_app";
        strArr[8] = "entry_point_conversion_source";
        strArr[9] = "skip_preview";
        strArr[10] = "fromCallNotification";
        strArr[11] = "fromNotification";
        strArr[12] = "group_reply_parent_group_jid";
        strArr[13] = "group_reply_subject";
        strArr[14] = "number_from_url";
        strArr[15] = "has_share";
        strArr[16] = "text_from_url";
        strArr[17] = "origin";
        strArr[18] = "extra_quoted_message_row_id";
        strArr[19] = "group_reply_jid";
        strArr[20] = "share_msg";
        strArr[21] = "sms_body";
        strArr[22] = "vcard_name";
        strArr[23] = "vcard_str";
        strArr[24] = "business_jid";
        strArr[25] = "jid";
        strArr[26] = "_ci_";
        strArr[27] = "args_conversation_screen_entry_point";
        strArr[28] = "last_notification_keep_in_chat";
        A05 = C17900vP.A0I("android.intent.extra.TEXT", strArr, 29);
    }

    public C62052qi(AnonymousClass190 r3, AnonymousClass118 r4, C18030ve r5, AnonymousClass1NL r6) {
        C37001oo r0 = new C37001oo(r4, new AnonymousClass2Q2());
        this.A01 = r5;
        this.A00 = r3;
        this.A02 = r6;
        this.A03 = r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[Catch:{ NameNotFoundException -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(android.content.Intent r10, boolean r11) {
        /*
            r9 = this;
            java.util.List r5 = r9.A04
            r5.clear()
            X.0ve r2 = r9.A01
            r1 = 2377(0x949, float:3.331E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r8 = 1
            if (r0 == 0) goto L_0x012f
            java.lang.String r7 = "]"
            java.lang.String r3 = "_ci_"
            boolean r2 = r10.hasExtra(r3)
            java.lang.String r1 = "authentication_token"
            boolean r0 = r10.hasExtra(r1)
            if (r2 != 0) goto L_0x0060
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "noCallerInfo"
        L_0x0026:
            r5.add(r0)
        L_0x0029:
            if (r11 == 0) goto L_0x0031
            r1 = 0
            java.lang.String r0 = "All intents into Conversation must be trusted, at least for debug users."
            X.C17960vV.A0F(r1, r0)
        L_0x0031:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L_0x012f
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = A05
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0043
            r3.add(r1)
            goto L_0x0043
        L_0x0059:
            android.os.Parcelable r0 = r10.getParcelableExtra(r1)     // Catch:{ BadParcelableException -> 0x0094 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ BadParcelableException -> 0x0094 }
            goto L_0x0066
        L_0x0060:
            android.os.Parcelable r0 = r10.getParcelableExtra(r3)     // Catch:{ BadParcelableException -> 0x0094 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ BadParcelableException -> 0x0094 }
        L_0x0066:
            java.lang.String r2 = r0.getCreatorPackage()
            X.1oo r0 = r9.A03     // Catch:{ NameNotFoundException -> 0x0086 }
            X.2nF r0 = r0.A01(r2)     // Catch:{ NameNotFoundException -> 0x0086 }
            boolean r0 = r0.A03     // Catch:{ NameNotFoundException -> 0x0086 }
            if (r0 != 0) goto L_0x012f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.String r0 = "untrustedPackage["
            X.C17890vO.A10(r0, r2, r7, r1)     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0086 }
            r5.add(r0)     // Catch:{ NameNotFoundException -> 0x0086 }
            goto L_0x0029
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "invalidPackage["
            X.C17890vO.A10(r0, r2, r7, r1)
            java.lang.String r0 = r1.toString()
            goto L_0x0026
        L_0x0094:
            java.lang.String r0 = "badParcelable"
            goto L_0x0026
        L_0x0097:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x012f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "notWhitelistedExtraKey"
            r1.append(r0)
            java.lang.Object[] r0 = r3.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5.add(r0)
            java.util.ArrayList r1 = X.C220618l.newArrayList()
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r10.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x00c4
            r1.addAll(r0)
        L_0x00c4:
            android.net.Uri r0 = r10.getData()
            r1.add(r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L_0x00d4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r4.next()
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x00d4
            java.io.File r1 = X.C64062u9.A04(r2)
            if (r1 == 0) goto L_0x00d4
            int r3 = r3 + 1
            X.1NL r0 = r9.A02     // Catch:{ IOException -> 0x00f0 }
            r0.A06(r1)     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00d4
        L_0x00f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "notExternalIntentUri["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0y(r7, r1)
            r6.add(r0)
            goto L_0x00d4
        L_0x0104:
            if (r3 == 0) goto L_0x010f
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x012f
            r5.addAll(r6)
        L_0x010f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = " "
            java.lang.String r3 = X.AnonymousClass1EG.A07(r0, r5)
            X.190 r2 = r9.A00
            java.lang.String r1 = "ConversationIntentValidator/verifyIntent"
            r0 = 0
            r2.A0G(r1, r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConversationIntentValidator/verifyIntent "
            X.C17900vP.A0g(r0, r3, r1)
        L_0x012c:
            r0 = r11 ^ 1
            return r0
        L_0x012f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62052qi.A00(android.content.Intent, boolean):boolean");
    }
}
