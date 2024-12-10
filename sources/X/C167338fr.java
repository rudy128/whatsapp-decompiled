package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.8fr  reason: invalid class name and case insensitive filesystem */
public class C167338fr extends C167348fs {
    public final boolean A00;
    public final C195939uB A01;

    public C167338fr(AnonymousClass11S r12, C19947A0e a0e, AnonymousClass1NT r14, AnonymousClass1NM r15, C27351Vt r16, C219317y r17, C195939uB r18, C57372iy r19, C20036A4f a4f, File file, boolean z) {
        super(r12, a0e, r14, r15, r16, r17, r19, a4f, file);
        this.A00 = z;
        this.A01 = r18;
    }

    public static boolean A00(C23624Bmt bmt, Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        C17960vV.A07(obj2);
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        bmt.A0E();
        return booleanValue;
    }

    public C166288ce A0G(byte[] bArr, byte[] bArr2) {
        String str;
        String A0F = A0F();
        if (A0F != null) {
            str = A0F.substring(A0F.length() - 2);
        } else {
            str = null;
        }
        C23624Bmt A0N = C166288ce.DEFAULT_INSTANCE.A0N();
        C166288ce r1 = (C166288ce) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.appVersion_ = "2.24.24.78";
        if (str != null) {
            C166288ce r12 = (C166288ce) C17880vN.A0G(A0N);
            r12.bitField0_ |= 4;
            r12.jidSuffix_ = str;
        }
        boolean z = this.A00;
        C166288ce r13 = (C166288ce) C17880vN.A0G(A0N);
        r13.bitField1_ |= 64;
        r13.cleanedDb_ = z;
        C19947A0e a0e = this.A04;
        if (a0e != null) {
            HashMap A002 = C19947A0e.A00(a0e);
            Iterator A0j = C17890vO.A0j(A002);
            loop0:
            while (true) {
                boolean z2 = true;
                while (true) {
                    if (!A0j.hasNext()) {
                        break loop0;
                    }
                    Boolean bool = (Boolean) A0j.next();
                    if (!z2 || !bool.booleanValue()) {
                        z2 = false;
                    }
                }
            }
            C166288ce r14 = (C166288ce) C17880vN.A0G(A0N);
            r14.bitField0_ |= 8;
            r14.backupVersion_ = 1;
            boolean A003 = A00(A0N, "call_log", A002);
            C166288ce r15 = (C166288ce) A0N.A00;
            r15.bitField0_ |= 16;
            r15.callLogMigrationFinished_ = A003;
            boolean A004 = A00(A0N, "labeled_jid", A002);
            C166288ce r16 = (C166288ce) A0N.A00;
            r16.bitField0_ |= 32;
            r16.labeledJidMigrationFinished_ = A004;
            boolean A005 = A00(A0N, "message_fts", A002);
            C166288ce r17 = (C166288ce) A0N.A00;
            r17.bitField0_ |= 64;
            r17.messageFtsMigrationFinished_ = A005;
            boolean A006 = A00(A0N, "blank_me_jid", A002);
            C166288ce r18 = (C166288ce) A0N.A00;
            r18.bitField0_ |= 128;
            r18.blankMeJidMigrationFinished_ = A006;
            boolean A007 = A00(A0N, "message_link", A002);
            C166288ce r19 = (C166288ce) A0N.A00;
            r19.bitField0_ |= 256;
            r19.messageLinkMigrationFinished_ = A007;
            boolean A008 = A00(A0N, "message_main", A002);
            C166288ce r110 = (C166288ce) A0N.A00;
            r110.bitField0_ |= 512;
            r110.messageMainMigrationFinished_ = A008;
            boolean A009 = A00(A0N, "message_text", A002);
            C166288ce r111 = (C166288ce) A0N.A00;
            r111.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r111.messageTextMigrationFinished_ = A009;
            boolean A0010 = A00(A0N, "missed_calls", A002);
            C166288ce r112 = (C166288ce) A0N.A00;
            r112.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            r112.missedCallsMigrationFinished_ = A0010;
            boolean A0011 = A00(A0N, "receipt_user", A002);
            C166288ce r113 = (C166288ce) A0N.A00;
            r113.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r113.receiptUserMigrationFinished_ = A0011;
            boolean A0012 = A00(A0N, "message_media", A002);
            C166288ce r114 = (C166288ce) A0N.A00;
            r114.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r114.messageMediaMigrationFinished_ = A0012;
            boolean A0013 = A00(A0N, "message_vcard", A002);
            C166288ce r115 = (C166288ce) A0N.A00;
            r115.bitField0_ |= 16384;
            r115.messageVcardMigrationFinished_ = A0013;
            boolean A0014 = A00(A0N, "message_future", A002);
            C166288ce r2 = (C166288ce) A0N.A00;
            r2.bitField0_ |= 32768;
            r2.messageFutureMigrationFinished_ = A0014;
            boolean A0015 = A00(A0N, "message_quoted", A002);
            C166288ce r22 = (C166288ce) A0N.A00;
            r22.bitField0_ |= 65536;
            r22.messageQuotedMigrationFinished_ = A0015;
            boolean A0016 = A00(A0N, "message_system", A002);
            C166288ce r23 = (C166288ce) A0N.A00;
            r23.bitField0_ |= A7Y.A0F;
            r23.messageSystemMigrationFinished_ = A0016;
            boolean A0017 = A00(A0N, "receipt_device", A002);
            C166288ce r24 = (C166288ce) A0N.A00;
            r24.bitField0_ |= 262144;
            r24.receiptDeviceMigrationFinished_ = A0017;
            boolean A0018 = A00(A0N, "message_mention", A002);
            C166288ce r25 = (C166288ce) A0N.A00;
            r25.bitField0_ |= 524288;
            r25.messageMentionMigrationFinished_ = A0018;
            boolean A0019 = A00(A0N, "message_revoked", A002);
            C166288ce r26 = (C166288ce) A0N.A00;
            r26.bitField0_ |= 1048576;
            r26.messageRevokedMigrationFinished_ = A0019;
            boolean A0020 = A00(A0N, "broadcast_me_jid", A002);
            C166288ce r27 = (C166288ce) A0N.A00;
            r27.bitField0_ |= 2097152;
            r27.broadcastMeJidMigrationFinished_ = A0020;
            boolean A0021 = A00(A0N, "message_frequent", A002);
            C166288ce r28 = (C166288ce) A0N.A00;
            r28.bitField0_ |= 4194304;
            r28.messageFrequentMigrationFinished_ = A0021;
            boolean A0022 = A00(A0N, "message_location", A002);
            C166288ce r29 = (C166288ce) A0N.A00;
            r29.bitField0_ |= 8388608;
            r29.messageLocationMigrationFinished_ = A0022;
            boolean A0023 = A00(A0N, "participant_user", A002);
            C166288ce r210 = (C166288ce) A0N.A00;
            r210.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            r210.participantUserMigrationFinished_ = A0023;
            boolean A0024 = A00(A0N, "message_thumbnail", A002);
            C166288ce r211 = (C166288ce) A0N.A00;
            r211.bitField0_ |= 33554432;
            r211.messageThumbnailMigrationFinished_ = A0024;
            boolean A0025 = A00(A0N, "message_send_count", A002);
            C166288ce r212 = (C166288ce) A0N.A00;
            r212.bitField0_ |= 67108864;
            r212.messageSendCountMigrationFinished_ = A0025;
            boolean A0026 = A00(A0N, "migration_jid_store", A002);
            C166288ce r213 = (C166288ce) A0N.A00;
            r213.bitField0_ |= 134217728;
            r213.migrationJidStoreMigrationFinished_ = A0026;
            boolean A0027 = A00(A0N, "payment_transaction", A002);
            C166288ce r214 = (C166288ce) A0N.A00;
            r214.bitField0_ |= 268435456;
            r214.paymentTransactionMigrationFinished_ = A0027;
            boolean A0028 = A00(A0N, "migration_chat_store", A002);
            C166288ce r215 = (C166288ce) A0N.A00;
            r215.bitField0_ |= 536870912;
            r215.migrationChatStoreMigrationFinished_ = A0028;
            C166288ce r216 = (C166288ce) C17880vN.A0G(A0N);
            r216.bitField0_ |= 1073741824;
            r216.quotedOrderMessageMigrationFinished_ = true;
            C166288ce r217 = (C166288ce) C17880vN.A0G(A0N);
            r217.bitField0_ |= Integer.MIN_VALUE;
            r217.mediaMigrationFixerMigrationFinished_ = true;
            boolean A0029 = A00(A0N, "quoted_order_message_v2", A002);
            C166288ce r116 = (C166288ce) A0N.A00;
            r116.bitField1_ |= 1;
            r116.quotedOrderMessageV2MigrationFinished_ = A0029;
            C166288ce r117 = (C166288ce) C17880vN.A0G(A0N);
            r117.bitField1_ |= 2;
            r117.messageMainVerificationMigrationFinished_ = true;
            boolean A0030 = A00(A0N, "quoted_ui_elements_reply_message", A002);
            C166288ce r118 = (C166288ce) A0N.A00;
            r118.bitField1_ |= 4;
            r118.quotedUiElementsReplyMessageMigrationFinished_ = A0030;
            C166288ce r119 = (C166288ce) C17880vN.A0G(A0N);
            r119.bitField1_ |= 8;
            r119.alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_ = true;
            C166288ce r120 = (C166288ce) C17880vN.A0G(A0N);
            r120.bitField1_ |= 16;
            r120.alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_ = true;
        }
        if (!(bArr == null || bArr2 == null)) {
            C23581BmB A03 = C17900vP.A03(A0N, bArr);
            C166288ce r121 = (C166288ce) A0N.A00;
            r121.bitField1_ |= 128;
            r121.backupEncryptedHashSalt_ = A03;
            C23581BmB A032 = C17900vP.A03(A0N, bArr2);
            C166288ce r122 = (C166288ce) A0N.A00;
            r122.bitField1_ |= 256;
            r122.backupEncryptedHash_ = A032;
        }
        return (C166288ce) A0N.A0C();
    }
}
