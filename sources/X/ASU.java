package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

public final class ASU implements B83, B85, C436820m {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.23J, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        int i;
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.HISTORY_SYNC_NOTIFICATION) {
            return null;
        }
        AnonymousClass205 r2 = a6d.A0A;
        ? r3 = new AnonymousClass206(r2, 35, a6d.A03);
        C166088cK r4 = C20077A6d.A00(a6d).historySyncNotification_;
        if (r4 == null) {
            r4 = C166088cK.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r4);
        int i2 = r4.bitField0_;
        if (AnonymousClass000.A1O(i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            r3.A0K = r4.initialHistBootstrapInlinePayload_.A06();
        } else if ((i2 & 4) != 0) {
            r3.A0L = r4.mediaKey_.A06();
            int i3 = r4.bitField0_;
            if ((i3 & 2) != 0) {
                long j = r4.fileLength_;
                if (j > 0) {
                    r3.A05 = j;
                    if ((i3 & 16) != 0) {
                        r3.A0B = r4.directPath_;
                        if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                            C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message with missing file hash info message.key=", AnonymousClass000.A10());
                            throw AnonymousClass8BR.A0o(26);
                        }
                        byte[] A1P = AnonymousClass8BS.A1P(r4.fileSha256_);
                        byte[] A1P2 = AnonymousClass8BS.A1P(r4.fileEncSha256_);
                        if (A1P.length == 32 && A1P2.length == 32) {
                            r3.A0F = Base64.encodeToString(A1P, 2);
                            r3.A0E = Base64.encodeToString(A1P2, 2);
                        } else {
                            C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message with invalid sha-256 hash message.key=", AnonymousClass000.A10());
                            throw AnonymousClass8BR.A0o(14);
                        }
                    } else {
                        C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message with missing direct path message.key=", AnonymousClass000.A10());
                        throw AnonymousClass8BR.A0o(26);
                    }
                }
            }
            C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message with invalid file length message.key=", AnonymousClass000.A10());
            throw AnonymousClass8BT.A0c();
        } else {
            C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message with invalid media key message.key=", AnonymousClass000.A10());
            throw AnonymousClass8BT.A0d();
        }
        int i4 = r4.bitField0_;
        if ((i4 & 32) != 0) {
            AnonymousClass9KX A00 = AnonymousClass9KX.A00(r4.syncType_);
            if (A00 == null) {
                A00 = AnonymousClass9KX.INITIAL_BOOTSTRAP;
            }
            switch (A00.ordinal()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                default:
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Unexpected type (");
                    throw AnonymousClass000.A0k(AnonymousClass001.A1F(A00, A10));
            }
            r3.A03 = i;
            if ((i4 & DefaultCrypto.BUFFER_SIZE) != 0) {
                r3.A0C = r4.encHandle_;
            } else {
                Log.w("FMessageHistorySyncNotification/ message without enc_handle");
            }
            int i5 = r4.bitField0_;
            if ((i5 & 64) != 0) {
                r3.A00 = r4.chunkOrder_;
            }
            if ((i5 & 128) != 0) {
                r3.A0G = r4.originalMessageId_;
            } else {
                C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message without original msg idmessage.key=", AnonymousClass000.A10());
            }
            int i6 = r4.bitField0_;
            if ((i6 & 256) != 0) {
                r3.A01 = r4.progress_;
            }
            if ((i6 & 512) != 0) {
                r3.A0A = TimeUnit.SECONDS.toMillis(r4.oldestMsgInChunkTimestampSec_);
            }
            if ((r4.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                r3.A0H = r4.peerDataRequestSessionId_;
            }
            return r3;
        }
        C17900vP.A0Z(r2, "FMessageHistorySyncNotification/ message without sync typemessage.key=", AnonymousClass000.A10());
        throw AnonymousClass8BR.A0o(26);
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        AnonymousClass9KX r0;
        boolean A15 = C18070vi.A15(r11, a2m);
        if (r11 instanceof AnonymousClass23J) {
            AnonymousClass23J r112 = (AnonymousClass23J) r11;
            AnonymousClass8X8 r6 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r6);
            C166088cK r02 = ((C166368cm) A01.A00).historySyncNotification_;
            if (r02 == null) {
                r02 = C166088cK.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            long j = r112.A05;
            C166088cK r7 = (C166088cK) C17880vN.A0G(A0O);
            int i = C166088cK.CHUNK_ORDER_FIELD_NUMBER;
            r7.bitField0_ |= 2;
            r7.fileLength_ = j;
            int i2 = r112.A03;
            switch (i2) {
                case 0:
                    r0 = AnonymousClass9KX.INITIAL_BOOTSTRAP;
                    break;
                case 1:
                    r0 = AnonymousClass9KX.INITIAL_STATUS_V3;
                    break;
                case 2:
                    r0 = AnonymousClass9KX.RECENT;
                    break;
                case 3:
                    r0 = AnonymousClass9KX.FULL;
                    break;
                case 4:
                    r0 = AnonymousClass9KX.PUSH_NAME;
                    break;
                case 5:
                    r0 = AnonymousClass9KX.NON_BLOCKING_DATA;
                    break;
                case 6:
                    r0 = AnonymousClass9KX.ON_DEMAND;
                    break;
                case 7:
                    r0 = AnonymousClass9KX.NO_HISTORY;
                    break;
                default:
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Unexpected type (");
                    throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, i2));
            }
            C166088cK r2 = (C166088cK) C17880vN.A0G(A0O);
            r2.syncType_ = r0.value;
            r2.bitField0_ |= 32;
            int i3 = r112.A00;
            if (i3 > 0) {
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= 64;
                r2.chunkOrder_ = i3;
            }
            String str = r112.A0B;
            if (str != null) {
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= 16;
                r2.directPath_ = str;
            }
            String str2 = r112.A0C;
            if (str2 != null) {
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                r2.encHandle_ = str2;
            }
            String str3 = r112.A0F;
            if (str3 != null) {
                C23581BmB A0B = AnonymousClass8BW.A0B(A0O, str3, A15);
                r2 = (C166088cK) A0O.A00;
                r2.bitField0_ |= 1;
                r2.fileSha256_ = A0B;
            }
            String str4 = r112.A0E;
            if (str4 != null) {
                C23581BmB A0B2 = AnonymousClass8BW.A0B(A0O, str4, A15);
                r2 = (C166088cK) A0O.A00;
                r2.bitField0_ |= 8;
                r2.fileEncSha256_ = A0B2;
            }
            byte[] bArr = r112.A0L;
            if (bArr != null) {
                C23581BmB A0A = AnonymousClass8BU.A0A(A0O, bArr, A15 ? 1 : 0);
                r2 = (C166088cK) A0O.A00;
                r2.bitField0_ |= 4;
                r2.mediaKey_ = A0A;
            }
            String str5 = r112.A0G;
            if (!(str5 == null || str5.length() == 0)) {
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= 128;
                r2.originalMessageId_ = str5;
            }
            int i4 = r112.A03;
            if (i4 == 2 || i4 == 3) {
                int i5 = r112.A01;
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= 256;
                r2.progress_ = i5;
            }
            long j2 = r112.A0A;
            if (j2 > 0) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= 512;
                r2.oldestMsgInChunkTimestampSec_ = seconds;
            }
            byte[] bArr2 = r112.A0K;
            if (bArr2 != null) {
                C23581BmB A03 = C17900vP.A03(A0O, bArr2);
                r2 = (C166088cK) A0O.A00;
                r2.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r2.initialHistBootstrapInlinePayload_ = A03;
            }
            String str6 = r112.A0H;
            if (str6 != null) {
                r2 = (C166088cK) C17880vN.A0G(A0O);
                r2.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r2.peerDataRequestSessionId_ = str6;
            }
            String str7 = r112.A0D;
            if (!(str7 == null || str7.length() == 0)) {
                C163978Xb r03 = r2.fullHistorySyncOnDemandRequestMetadata_;
                if (r03 == null) {
                    r03 = C163978Xb.DEFAULT_INSTANCE;
                }
                C23624Bmt A0O2 = r03.A0O();
                String str8 = r112.A0D;
                C163978Xb r1 = (C163978Xb) C17880vN.A0G(A0O2);
                int i6 = C163978Xb.REQUEST_ID_FIELD_NUMBER;
                str8.getClass();
                r1.bitField0_ |= 1;
                r1.requestId_ = str8;
                C166088cK r12 = (C166088cK) C17880vN.A0G(A0O);
                C163978Xb r04 = (C163978Xb) A0O2.A0C();
                r04.getClass();
                r12.fullHistorySyncOnDemandRequestMetadata_ = r04;
                r12.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            }
            A01.A0G(C179839Kc.HISTORY_SYNC_NOTIFICATION);
            C166368cm A0H = AnonymousClass8BS.A0H(A01);
            C166088cK r05 = (C166088cK) A0O.A0C();
            r05.getClass();
            A0H.historySyncNotification_ = r05;
            A0H.bitField0_ |= 16;
            r6.A0N(A01);
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Message type is not supported ");
        A102.append(r11.getClass());
        throw AnonymousClass000.A0j(A102);
    }
}
