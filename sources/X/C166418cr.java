package X;

/* renamed from: X.8cr  reason: invalid class name and case insensitive filesystem */
public final class C166418cr extends C23577Bm6 implements C22356B4k {
    public static final int ALBUM_MESSAGE_FIELD_NUMBER = 83;
    public static final int ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER = 91;
    public static final int AUDIO_MESSAGE_FIELD_NUMBER = 8;
    public static final int BCALL_MESSAGE_FIELD_NUMBER = 72;
    public static final int BOT_INVOKE_MESSAGE_FIELD_NUMBER = 67;
    public static final int BUTTONS_MESSAGE_FIELD_NUMBER = 42;
    public static final int BUTTONS_RESPONSE_MESSAGE_FIELD_NUMBER = 43;
    public static final int CALL_FIELD_NUMBER = 10;
    public static final int CALL_LOG_MESSSAGE_FIELD_NUMBER = 69;
    public static final int CANCEL_PAYMENT_REQUEST_MESSAGE_FIELD_NUMBER = 24;
    public static final int CHAT_FIELD_NUMBER = 11;
    public static final int COMMENT_MESSAGE_FIELD_NUMBER = 77;
    public static final int CONTACTS_ARRAY_MESSAGE_FIELD_NUMBER = 13;
    public static final int CONTACT_MESSAGE_FIELD_NUMBER = 4;
    public static final int CONVERSATION_FIELD_NUMBER = 1;
    public static final int DECLINE_PAYMENT_REQUEST_MESSAGE_FIELD_NUMBER = 23;
    public static final C166418cr DEFAULT_INSTANCE;
    public static final int DEVICE_SENT_MESSAGE_FIELD_NUMBER = 31;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 7;
    public static final int DOCUMENT_WITH_CAPTION_MESSAGE_FIELD_NUMBER = 53;
    public static final int EDITED_MESSAGE_FIELD_NUMBER = 58;
    public static final int ENC_COMMENT_MESSAGE_FIELD_NUMBER = 71;
    public static final int ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER = 76;
    public static final int ENC_REACTION_MESSAGE_FIELD_NUMBER = 56;
    public static final int EPHEMERAL_MESSAGE_FIELD_NUMBER = 40;
    public static final int EVENT_COVER_IMAGE_FIELD_NUMBER = 85;
    public static final int EVENT_MESSAGE_FIELD_NUMBER = 75;
    public static final int EXTENDED_TEXT_MESSAGE_FIELD_NUMBER = 6;
    public static final int FAST_RATCHET_KEY_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 15;
    public static final int GROUP_INVITE_MESSAGE_FIELD_NUMBER = 28;
    public static final int GROUP_MENTIONED_MESSAGE_FIELD_NUMBER = 62;
    public static final int GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER = 92;
    public static final int HIGHLY_STRUCTURED_MESSAGE_FIELD_NUMBER = 14;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int INTERACTIVE_MESSAGE_FIELD_NUMBER = 45;
    public static final int INTERACTIVE_RESPONSE_MESSAGE_FIELD_NUMBER = 48;
    public static final int KEEP_IN_CHAT_MESSAGE_FIELD_NUMBER = 51;
    public static final int LIST_MESSAGE_FIELD_NUMBER = 36;
    public static final int LIST_RESPONSE_MESSAGE_FIELD_NUMBER = 39;
    public static final int LIVE_LOCATION_MESSAGE_FIELD_NUMBER = 18;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static final int LOTTIE_STICKER_MESSAGE_FIELD_NUMBER = 74;
    public static final int MESSAGE_CONTEXT_INFO_FIELD_NUMBER = 35;
    public static final int MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER = 70;
    public static final int NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER = 78;
    public static final int ORDER_MESSAGE_FIELD_NUMBER = 38;
    public static volatile C22357B4l PARSER = null;
    public static final int PAYMENT_INVITE_MESSAGE_FIELD_NUMBER = 44;
    public static final int PIN_IN_CHAT_MESSAGE_FIELD_NUMBER = 63;
    public static final int PLACEHOLDER_MESSAGE_FIELD_NUMBER = 80;
    public static final int POLL_CREATION_MESSAGE_FIELD_NUMBER = 49;
    public static final int POLL_CREATION_MESSAGE_V2_FIELD_NUMBER = 60;
    public static final int POLL_CREATION_MESSAGE_V3_FIELD_NUMBER = 64;
    public static final int POLL_CREATION_MESSAGE_V4_FIELD_NUMBER = 93;
    public static final int POLL_CREATION_MESSAGE_V5_FIELD_NUMBER = 94;
    public static final int POLL_CREATION_OPTION_IMAGE_MESSAGE_FIELD_NUMBER = 90;
    public static final int POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER = 88;
    public static final int POLL_UPDATE_MESSAGE_FIELD_NUMBER = 50;
    public static final int PRODUCT_MESSAGE_FIELD_NUMBER = 30;
    public static final int PROTOCOL_MESSAGE_FIELD_NUMBER = 12;
    public static final int PTV_MESSAGE_FIELD_NUMBER = 66;
    public static final int REACTION_MESSAGE_FIELD_NUMBER = 46;
    public static final int REQUEST_PAYMENT_MESSAGE_FIELD_NUMBER = 22;
    public static final int REQUEST_PHONE_NUMBER_MESSAGE_FIELD_NUMBER = 54;
    public static final int SCHEDULED_CALL_CREATION_MESSAGE_FIELD_NUMBER = 61;
    public static final int SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER = 65;
    public static final int SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER = 82;
    public static final int SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    public static final int SEND_PAYMENT_MESSAGE_FIELD_NUMBER = 16;
    public static final int STATUS_MENTION_MESSAGE_FIELD_NUMBER = 87;
    public static final int STICKER_MESSAGE_FIELD_NUMBER = 26;
    public static final int STICKER_PACK_MESSAGE_FIELD_NUMBER = 86;
    public static final int TEMPLATE_BUTTON_REPLY_MESSAGE_FIELD_NUMBER = 29;
    public static final int TEMPLATE_MESSAGE_FIELD_NUMBER = 25;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 9;
    public static final int VIEW_ONCE_MESSAGE_FIELD_NUMBER = 37;
    public static final int VIEW_ONCE_MESSAGE_V2_EXTENSION_FIELD_NUMBER = 59;
    public static final int VIEW_ONCE_MESSAGE_V2_FIELD_NUMBER = 55;
    public C165208al albumMessage_;
    public C163988Xc associatedChildMessage_;
    public C166138cP audioMessage_;
    public C165218am bcallMessage_;
    public int bitField0_;
    public int bitField1_;
    public int bitField2_;
    public C163988Xc botInvokeMessage_;
    public C165858bs buttonsMessage_;
    public C165408b6 buttonsResponseMessage_;
    public C165528bI callLogMesssage_;
    public C165658bY call_;
    public AnonymousClass8XZ cancelPaymentRequestMessage_;
    public C164468Yy chat_;
    public C164478Yz commentMessage_;
    public C164738Zz contactMessage_;
    public C164748a0 contactsArrayMessage_;
    public String conversation_ = "";
    public C163968Xa declinePaymentRequestMessage_;
    public C164758a1 deviceSentMessage_;
    public C166208cW documentMessage_;
    public C163988Xc documentWithCaptionMessage_;
    public C163988Xc editedMessage_;
    public C164768a2 encCommentMessage_;
    public C164778a3 encEventResponseMessage_;
    public C164788a4 encReactionMessage_;
    public C163988Xc ephemeralMessage_;
    public C163988Xc eventCoverImage_;
    public AnonymousClass8c4 eventMessage_;
    public C166258cb extendedTextMessage_;
    public AnonymousClass8ZH fastRatchetKeySenderKeyDistributionMessage_;
    public C165878bu groupInviteMessage_;
    public C163988Xc groupMentionedMessage_;
    public C163988Xc groupStatusMentionMessage_;
    public C165948c5 highlyStructuredMessage_;
    public C166268cc imageMessage_;
    public C166398cp interactiveMessage_;
    public C165158ag interactiveResponseMessage_;
    public C164848aA keepInChatMessage_;
    public C166358cl listMessage_;
    public C165538bJ listResponseMessage_;
    public C165968c8 liveLocationMessage_;
    public C166028cE locationMessage_;
    public C163988Xc lottieStickerMessage_;
    public C166048cG messageContextInfo_;
    public C165888bv messageHistoryBundle_;
    public C165668bZ newsletterAdminInviteMessage_;
    public C166098cL orderMessage_;
    public AnonymousClass8Z8 paymentInviteMessage_;
    public C164888aE pinInChatMessage_;
    public C164098Xn placeholderMessage_;
    public C165908bx pollCreationMessageV2_;
    public C165908bx pollCreationMessageV3_;
    public C163988Xc pollCreationMessageV4_;
    public C163988Xc pollCreationMessageV5_;
    public C165908bx pollCreationMessage_;
    public C163988Xc pollCreationOptionImageMessage_;
    public C164898aF pollResultSnapshotMessage_;
    public C165248ap pollUpdateMessage_;
    public C165688bb productMessage_;
    public C166368cm protocolMessage_;
    public C166248ca ptvMessage_;
    public C165258aq reactionMessage_;
    public C165828bp requestPaymentMessage_;
    public C164108Xo requestPhoneNumberMessage_;
    public C164918aH scheduledCallCreationMessage_;
    public AnonymousClass8ZG scheduledCallEditMessage_;
    public C165268ar secretEncryptedMessage_;
    public C164928aI sendPaymentMessage_;
    public AnonymousClass8ZH senderKeyDistributionMessage_;
    public C163988Xc statusMentionMessage_;
    public C166218cX stickerMessage_;
    public C166228cY stickerPackMessage_;
    public AnonymousClass8bK templateButtonReplyMessage_;
    public C166348ck templateMessage_;
    public C166248ca videoMessage_;
    public C163988Xc viewOnceMessageV2Extension_;
    public C163988Xc viewOnceMessageV2_;
    public C163988Xc viewOnceMessage_;

    static {
        C166418cr r1 = new C166418cr();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166418cr.class);
    }

    public static AnonymousClass8X8 A00() {
        return (AnonymousClass8X8) DEFAULT_INSTANCE.A0N();
    }

    public static C166418cr A01(byte[] bArr) {
        return (C166418cr) C23577Bm6.A07(DEFAULT_INSTANCE, bArr);
    }

    public boolean A0R() {
        return AnonymousClass000.A1O(this.bitField0_ & 1048576);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(79);
                A1Z[1] = "bitField1_";
                A1Z[2] = "bitField2_";
                A1Z[3] = "conversation_";
                A1Z[4] = "senderKeyDistributionMessage_";
                A1Z[5] = "imageMessage_";
                A1Z[6] = "contactMessage_";
                A1Z[7] = "locationMessage_";
                A1Z[8] = "extendedTextMessage_";
                A1Z[9] = "documentMessage_";
                A1Z[10] = "audioMessage_";
                A1Z[11] = "videoMessage_";
                A1Z[12] = "call_";
                A1Z[13] = "chat_";
                A1Z[14] = "protocolMessage_";
                A1Z[15] = "contactsArrayMessage_";
                A1Z[16] = "highlyStructuredMessage_";
                A1Z[17] = "fastRatchetKeySenderKeyDistributionMessage_";
                A1Z[18] = "sendPaymentMessage_";
                A1Z[19] = "liveLocationMessage_";
                A1Z[20] = "requestPaymentMessage_";
                A1Z[21] = "declinePaymentRequestMessage_";
                A1Z[22] = "cancelPaymentRequestMessage_";
                A1Z[23] = "templateMessage_";
                A1Z[24] = "stickerMessage_";
                A1Z[25] = "groupInviteMessage_";
                A1Z[26] = "templateButtonReplyMessage_";
                A1Z[27] = "productMessage_";
                A1Z[28] = "deviceSentMessage_";
                A1Z[29] = "messageContextInfo_";
                A1Z[30] = "listMessage_";
                A1Z[31] = "viewOnceMessage_";
                A1Z[32] = "orderMessage_";
                A1Z[33] = "listResponseMessage_";
                A1Z[34] = "ephemeralMessage_";
                A1Z[35] = "buttonsMessage_";
                A1Z[36] = "buttonsResponseMessage_";
                A1Z[37] = "paymentInviteMessage_";
                A1Z[38] = "interactiveMessage_";
                A1Z[39] = "reactionMessage_";
                A1Z[40] = "interactiveResponseMessage_";
                A1Z[41] = "pollCreationMessage_";
                A1Z[42] = "pollUpdateMessage_";
                A1Z[43] = "keepInChatMessage_";
                A1Z[44] = "documentWithCaptionMessage_";
                A1Z[45] = "requestPhoneNumberMessage_";
                A1Z[46] = "viewOnceMessageV2_";
                A1Z[47] = "encReactionMessage_";
                A1Z[48] = "editedMessage_";
                A1Z[49] = "viewOnceMessageV2Extension_";
                A1Z[50] = "pollCreationMessageV2_";
                A1Z[51] = "scheduledCallCreationMessage_";
                A1Z[52] = "groupMentionedMessage_";
                A1Z[53] = "pinInChatMessage_";
                A1Z[54] = "pollCreationMessageV3_";
                A1Z[55] = "scheduledCallEditMessage_";
                A1Z[56] = "ptvMessage_";
                A1Z[57] = "botInvokeMessage_";
                A1Z[58] = "callLogMesssage_";
                A1Z[59] = "messageHistoryBundle_";
                A1Z[60] = "encCommentMessage_";
                A1Z[61] = "bcallMessage_";
                A1Z[62] = "lottieStickerMessage_";
                A1Z[63] = "eventMessage_";
                A1Z[64] = "encEventResponseMessage_";
                A1Z[65] = "commentMessage_";
                A1Z[66] = "newsletterAdminInviteMessage_";
                A1Z[67] = "placeholderMessage_";
                A1Z[68] = "secretEncryptedMessage_";
                A1Z[69] = "albumMessage_";
                A1Z[70] = "eventCoverImage_";
                A1Z[71] = "stickerPackMessage_";
                A1Z[72] = "statusMentionMessage_";
                A1Z[73] = "pollResultSnapshotMessage_";
                A1Z[74] = "pollCreationOptionImageMessage_";
                A1Z[75] = "associatedChildMessage_";
                A1Z[76] = "groupStatusMentionMessage_";
                A1Z[77] = "pollCreationMessageV4_";
                A1Z[78] = "pollCreationMessageV5_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001L\u0000\u0003\u0001^L\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0012ဉ\u0010\u0016ဉ\u0011\u0017ဉ\u0012\u0018ဉ\u0013\u0019ဉ\u0014\u001aဉ\u0015\u001cဉ\u0016\u001dဉ\u0017\u001eဉ\u0018\u001fဉ\u0019#ဉ\u001a$ဉ\u001b%ဉ\u001c&ဉ\u001d'ဉ\u001e(ဉ\u001f*ဉ +ဉ!,ဉ\"-ဉ#.ဉ$0ဉ%1ဉ&2ဉ'3ဉ(5ဉ)6ဉ*7ဉ+8ဉ,:ဉ-;ဉ.<ဉ/=ဉ0>ဉ1?ဉ2@ဉ3Aဉ4Bဉ5Cဉ6Eဉ7Fဉ8Gဉ9Hဉ:Jဉ;Kဉ<Lဉ=Mဉ>Nဉ?Pဉ@RဉASဉBUဉCVဉDWဉEXဉFZဉG[ဉH\\ဉI]ဉJ^ဉK", A1Z);
            case 3:
                return new C166418cr();
            case 4:
                return new AnonymousClass8X8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166418cr.class) {
                    b4l = PARSER;
                    if (b4l == null) {
                        C26105CsP csP = DNE.A01;
                        b4l = C17880vN.A0F(DEFAULT_INSTANCE);
                        PARSER = b4l;
                    }
                }
                return b4l;
            default:
                throw C17880vN.A0y();
        }
    }
}
