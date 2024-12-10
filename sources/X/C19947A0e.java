package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A0e  reason: case insensitive filesystem */
public class C19947A0e {
    public final List A00;
    public final AnonymousClass1DK A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.io.File r8) {
        /*
            r7 = this;
            r4 = 0
            java.io.FileInputStream r2 = X.C108945cZ.A18(r8)     // Catch:{ IOException -> 0x0031 }
            X.8ai r0 = X.C165178ai.DEFAULT_INSTANCE     // Catch:{ all -> 0x002a }
            X.Bm6 r1 = X.C23577Bm6.A04(r0, r2)     // Catch:{ all -> 0x002a }
            X.8ai r1 = (X.C165178ai) r1     // Catch:{ all -> 0x002a }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x002a }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x001a
            X.8ce r0 = r1.backupMetadata_     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x001b
            X.8ce r0 = X.C166288ce.DEFAULT_INSTANCE     // Catch:{ all -> 0x002a }
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r2.close()     // Catch:{ IOException -> 0x0031 }
            r4 = r0
            if (r0 == 0) goto L_0x0037
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0037
            int r3 = r4.backupVersion_
            goto L_0x0038
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0031 }
            throw r0     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "readProtobufBackupMetadata/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0037:
            r3 = 0
        L_0x0038:
            java.util.HashMap r2 = X.C17880vN.A11()
            java.util.List r0 = r7.A00
            java.util.Iterator r6 = r0.iterator()
        L_0x0042:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.String r1 = X.C17880vN.A0v(r6)
            if (r4 == 0) goto L_0x0055
            int r0 = r1.hashCode()
            switch(r0) {
                case -1879012827: goto L_0x01cb;
                case -1696390154: goto L_0x01bf;
                case -1617991306: goto L_0x01b4;
                case -1372203662: goto L_0x01a8;
                case -1286318798: goto L_0x019c;
                case -1286296847: goto L_0x0190;
                case -1286083995: goto L_0x0184;
                case -1220382292: goto L_0x0178;
                case -1212132786: goto L_0x016c;
                case -1003755283: goto L_0x0160;
                case -872783571: goto L_0x0154;
                case -738045655: goto L_0x0148;
                case -631883203: goto L_0x013c;
                case -537381604: goto L_0x0130;
                case -266421354: goto L_0x0124;
                case -251736654: goto L_0x0118;
                case -228245188: goto L_0x010c;
                case -172298781: goto L_0x0100;
                case -136111098: goto L_0x00f4;
                case -101944730: goto L_0x00e8;
                case -38832335: goto L_0x00dc;
                case 320355671: goto L_0x00d0;
                case 491179391: goto L_0x00cc;
                case 562095961: goto L_0x00c1;
                case 637715707: goto L_0x00b6;
                case 952486048: goto L_0x00ab;
                case 1013557607: goto L_0x00a0;
                case 1029740752: goto L_0x0095;
                case 1395058782: goto L_0x008a;
                case 1476079284: goto L_0x007f;
                case 1580832246: goto L_0x0074;
                case 1761584297: goto L_0x0069;
                case 2085446219: goto L_0x005e;
                default: goto L_0x0055;
            }
        L_0x0055:
            r5 = 0
        L_0x0056:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.put(r1, r0)
            goto L_0x0042
        L_0x005e:
            java.lang.String r0 = "migration_chat_store"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.migrationChatStoreMigrationFinished_
            goto L_0x0056
        L_0x0069:
            java.lang.String r0 = "message_main_verification"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageMainVerificationMigrationFinished_
            goto L_0x0056
        L_0x0074:
            java.lang.String r0 = "alter_message_ephemeral_to_message_ephemeral_remove_column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_
            goto L_0x0056
        L_0x007f:
            java.lang.String r0 = "message_thumbnail"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageThumbnailMigrationFinished_
            goto L_0x0056
        L_0x008a:
            java.lang.String r0 = "quoted_ui_elements_reply_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.quotedUiElementsReplyMessageMigrationFinished_
            goto L_0x0056
        L_0x0095:
            java.lang.String r0 = "message_send_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageSendCountMigrationFinished_
            goto L_0x0056
        L_0x00a0:
            java.lang.String r0 = "message_system"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageSystemMigrationFinished_
            goto L_0x0056
        L_0x00ab:
            java.lang.String r0 = "message_quoted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageQuotedMigrationFinished_
            goto L_0x0056
        L_0x00b6:
            java.lang.String r0 = "message_future"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageFutureMigrationFinished_
            goto L_0x0056
        L_0x00c1:
            java.lang.String r0 = "labeled_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.labeledJidMigrationFinished_
            goto L_0x0056
        L_0x00cc:
            java.lang.String r0 = "quoted_order_message"
            goto L_0x01b6
        L_0x00d0:
            java.lang.String r0 = "participant_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.participantUserMigrationFinished_
            goto L_0x0056
        L_0x00dc:
            java.lang.String r0 = "missed_calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.missedCallsMigrationFinished_
            goto L_0x0056
        L_0x00e8:
            java.lang.String r0 = "message_revoked"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageRevokedMigrationFinished_
            goto L_0x0056
        L_0x00f4:
            java.lang.String r0 = "message_frequent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageFrequentMigrationFinished_
            goto L_0x0056
        L_0x0100:
            java.lang.String r0 = "call_log"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.callLogMigrationFinished_
            goto L_0x0056
        L_0x010c:
            java.lang.String r0 = "quoted_order_message_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.quotedOrderMessageV2MigrationFinished_
            goto L_0x0056
        L_0x0118:
            java.lang.String r0 = "message_mention"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageMentionMigrationFinished_
            goto L_0x0056
        L_0x0124:
            java.lang.String r0 = "alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_
            goto L_0x0056
        L_0x0130:
            java.lang.String r0 = "broadcast_me_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.broadcastMeJidMigrationFinished_
            goto L_0x0056
        L_0x013c:
            java.lang.String r0 = "receipt_device"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.receiptDeviceMigrationFinished_
            goto L_0x0056
        L_0x0148:
            java.lang.String r0 = "blank_me_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.blankMeJidMigrationFinished_
            goto L_0x0056
        L_0x0154:
            java.lang.String r0 = "message_fts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageFtsMigrationFinished_
            goto L_0x0056
        L_0x0160:
            java.lang.String r0 = "message_location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageLocationMigrationFinished_
            goto L_0x0056
        L_0x016c:
            java.lang.String r0 = "message_vcard"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageVcardMigrationFinished_
            goto L_0x0056
        L_0x0178:
            java.lang.String r0 = "message_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageMediaMigrationFinished_
            goto L_0x0056
        L_0x0184:
            java.lang.String r0 = "message_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageTextMigrationFinished_
            goto L_0x0056
        L_0x0190:
            java.lang.String r0 = "message_main"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageMainMigrationFinished_
            goto L_0x0056
        L_0x019c:
            java.lang.String r0 = "message_link"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.messageLinkMigrationFinished_
            goto L_0x0056
        L_0x01a8:
            java.lang.String r0 = "receipt_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.receiptUserMigrationFinished_
            goto L_0x0056
        L_0x01b4:
            java.lang.String r0 = "media_migration_fixer"
        L_0x01b6:
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0056
            goto L_0x0055
        L_0x01bf:
            java.lang.String r0 = "migration_jid_store"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.migrationJidStoreMigrationFinished_
            goto L_0x0056
        L_0x01cb:
            java.lang.String r0 = "payment_transaction"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            boolean r5 = r4.paymentTransactionMigrationFinished_
            goto L_0x0056
        L_0x01d7:
            r0 = 1
            if (r3 >= r0) goto L_0x01e0
            java.lang.String r0 = "BackupExpiryManager/backup expired based on version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x01e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19947A0e.A01(java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(org.json.JSONObject r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0015
            java.lang.String r1 = "backup_version"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x0015
            int r5 = r7.getInt(r1)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0016
        L_0x000f:
            r1 = move-exception
            java.lang.String r0 = "BackupExpiryManager/getBackupVersion/failed to parse version from json"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0015:
            r5 = 0
        L_0x0016:
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.List r0 = r6.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.String r2 = X.C17880vN.A0v(r3)
            if (r7 == 0) goto L_0x0039
            boolean r0 = r7.has(r2)     // Catch:{ JSONException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            boolean r1 = r7.getBoolean(r2)     // Catch:{ JSONException -> 0x0039 }
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.put(r2, r0)
            goto L_0x0020
        L_0x0042:
            r0 = 1
            if (r5 >= r0) goto L_0x004b
            java.lang.String r0 = "BackupExpiryManager/backup expired based on version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19947A0e.A02(org.json.JSONObject):boolean");
    }

    public C19947A0e(AnonymousClass1DK r3) {
        this.A01 = r3;
        ArrayList A13 = AnonymousClass000.A13();
        this.A00 = A13;
        A13.add("call_log");
        A13.add("labeled_jid");
        A13.add("message_fts");
        A13.add("blank_me_jid");
        A13.add("message_link");
        A13.add("message_main");
        A13.add("message_text");
        A13.add("missed_calls");
        A13.add("receipt_user");
        A13.add("message_media");
        A13.add("message_vcard");
        A13.add("message_future");
        A13.add("message_quoted");
        A13.add("message_system");
        A13.add("receipt_device");
        A13.add("message_mention");
        A13.add("message_revoked");
        A13.add("broadcast_me_jid");
        A13.add("message_frequent");
        A13.add("message_location");
        A13.add("participant_user");
        A13.add("message_thumbnail");
        A13.add("message_send_count");
        A13.add("migration_jid_store");
        A13.add("payment_transaction");
        A13.add("migration_chat_store");
        A13.add("quoted_order_message");
        A13.add("quoted_order_message_v2");
        A13.add("message_main_verification");
        A13.add("quoted_ui_elements_reply_message");
        A13.add("alter_message_ephemeral_to_message_ephemeral_remove_column");
        A13.add("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00b2, code lost:
        if (r1 == 1) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap A00(X.C19947A0e r4) {
        /*
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            java.lang.String r0 = "call_log"
            r3.put(r0, r1)
            java.lang.String r0 = "labeled_jid"
            r3.put(r0, r1)
            java.lang.String r0 = "message_link"
            r3.put(r0, r1)
            java.lang.String r0 = "receipt_user"
            r3.put(r0, r1)
            java.lang.String r0 = "message_quoted"
            r3.put(r0, r1)
            java.lang.String r0 = "message_thumbnail"
            r3.put(r0, r1)
            java.lang.String r0 = "quoted_order_message"
            r3.put(r0, r1)
            java.lang.String r0 = "quoted_order_message_v2"
            r3.put(r0, r1)
            java.lang.String r0 = "message_main_verification"
            r3.put(r0, r1)
            java.lang.String r0 = "alter_message_ephemeral_to_message_ephemeral_remove_column"
            r3.put(r0, r1)
            java.lang.String r0 = "alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column"
            r3.put(r0, r1)
            java.lang.String r0 = "message_text"
            r3.put(r0, r1)
            java.lang.String r0 = "message_vcard"
            r3.put(r0, r1)
            java.lang.String r0 = "message_future"
            r3.put(r0, r1)
            java.lang.String r0 = "message_frequent"
            r3.put(r0, r1)
            java.lang.String r0 = "message_revoked"
            r3.put(r0, r1)
            java.lang.String r0 = "message_system"
            r3.put(r0, r1)
            java.lang.String r0 = "missed_calls"
            r3.put(r0, r1)
            java.lang.String r0 = "message_mention"
            r3.put(r0, r1)
            java.lang.String r0 = "receipt_device"
            r3.put(r0, r1)
            java.lang.String r0 = "message_location"
            r3.put(r0, r1)
            java.lang.String r0 = "participant_user"
            r3.put(r0, r1)
            java.lang.String r0 = "broadcast_me_jid"
            r3.put(r0, r1)
            java.lang.String r0 = "message_media"
            r3.put(r0, r1)
            java.lang.String r0 = "message_send_count"
            r3.put(r0, r1)
            java.lang.String r0 = "payment_transaction"
            r3.put(r0, r1)
            java.lang.String r0 = "migration_jid_store"
            r3.put(r0, r1)
            java.lang.String r0 = "migration_chat_store"
            r3.put(r0, r1)
            java.lang.String r0 = "quoted_ui_elements_reply_message"
            r3.put(r0, r1)
            java.lang.String r0 = "blank_me_jid"
            r3.put(r0, r1)
            java.lang.String r0 = "message_main"
            r3.put(r0, r1)
            X.1DK r0 = r4.A01
            java.lang.String r2 = "message_fts"
            X.1a4 r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x00bc
            int r1 = r0.A02()
            r0 = 1
            if (r1 != r0) goto L_0x00bc
        L_0x00b4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.put(r2, r0)
            return r3
        L_0x00bc:
            r0 = 0
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19947A0e.A00(X.A0e):java.util.HashMap");
    }
}
