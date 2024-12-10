package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3HN  reason: invalid class name */
public final class AnonymousClass3HN extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C53382cR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HN(C53382cR r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1D6[] r13 = new AnonymousClass1D6[42];
        String[] strArr = new String[5];
        strArr[0] = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        strArr[1] = "server";
        strArr[2] = "agent";
        strArr[3] = "device";
        AnonymousClass1D6.A03("jid", C18070vi.A0O(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, strArr, 4), r13, 0);
        AnonymousClass1D6.A03("jid", C18070vi.A0M("raw_string"), r13, 1);
        String[] strArr2 = new String[4];
        strArr2[0] = "jid_row_id";
        strArr2[1] = "from_me";
        strArr2[2] = "call_id";
        AnonymousClass1D6.A03("call_log", C18070vi.A0O("transaction_id", strArr2, 3), r13, 2);
        AnonymousClass1D6.A03("call_log_participant_v2", C18070vi.A0N("call_log_row_id", "jid_row_id", new String[2], 0, 1), r13, 3);
        AnonymousClass1D6.A03("joinable_call_log", C18070vi.A0M("call_id"), r13, 4);
        String[] strArr3 = new String[4];
        strArr3[0] = "key_id";
        strArr3[1] = "from_me";
        strArr3[2] = "chat_row_id";
        AnonymousClass1D6.A03("message_orphaned_edit", C18070vi.A0O("sender_jid_row_id", strArr3, 3), r13, 5);
        r13[6] = AnonymousClass1D6.A01("message", C18070vi.A0N("key_id", "sender_jid_row_id", C17880vN.A1b("chat_row_id", "from_me", 4, 1), 2, 3));
        String[] strArr4 = new String[2];
        strArr4[0] = "message_row_id";
        r13[7] = AnonymousClass1D6.A01("message_quoted_vcard", C18070vi.A0O("vcard", strArr4, 1));
        r13[8] = AnonymousClass1D6.A01("message_quoted_mentions", C18070vi.A0N("message_row_id", "jid_row_id", new String[2], 0, 1));
        r13[9] = AnonymousClass1D6.A01("message_mentions", C18070vi.A0N("message_row_id", "jid_row_id", new String[2], 0, 1));
        r13[10] = AnonymousClass1D6.A01("message_vcard", C18070vi.A0N("message_row_id", "vcard", new String[2], 0, 1));
        String[] strArr5 = new String[3];
        strArr5[0] = "vcard_jid_row_id";
        r13[11] = AnonymousClass1D6.A01("message_vcard_jid", C18070vi.A0N("vcard_row_id", "message_row_id", strArr5, 1, 2));
        String[] strArr6 = new String[2];
        strArr6[0] = "user_jid_row_id";
        r13[12] = AnonymousClass1D6.A01("user_device", C18070vi.A0O("device_jid_row_id", strArr6, 1));
        r13[13] = AnonymousClass1D6.A01("message_edit_info", C18070vi.A0M("original_key_id"));
        String[] strArr7 = new String[2];
        strArr7[0] = "message_row_id";
        r13[14] = AnonymousClass1D6.A01("message_media_interactive_annotation", C18070vi.A0O("sort_order", strArr7, 1));
        r13[15] = AnonymousClass1D6.A01("message_media_interactive_annotation_vertex", C18070vi.A0N("message_media_interactive_annotation_row_id", "sort_order", new String[2], 0, 1));
        r13[16] = AnonymousClass1D6.A01("message_media_vcard_count", C18070vi.A0M("message_row_id"));
        String[] strArr8 = new String[2];
        strArr8[0] = "message_row_id";
        r13[17] = AnonymousClass1D6.A01("message_link", C18070vi.A0O("link_index", strArr8, 1));
        r13[18] = AnonymousClass1D6.A01("frequent", C18070vi.A0N("jid_row_id", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new String[2], 0, 1));
        String[] A1b = C17880vN.A1b("chat_row_id", "from_me", 6, 1);
        A1b[2] = "key_id";
        A1b[3] = "receipt_device_jid_row_id";
        A1b[4] = "receipt_recipient_jid_row_id";
        r13[19] = AnonymousClass1D6.A01("receipt_orphaned", C18070vi.A0O("status", A1b, 5));
        String[] strArr9 = new String[2];
        strArr9[0] = "message_row_id";
        r13[20] = AnonymousClass1D6.A01("receipt_user", C18070vi.A0O("receipt_user_jid_row_id", strArr9, 1));
        r13[21] = AnonymousClass1D6.A01("receipt_device", C18070vi.A0N("message_row_id", "receipt_device_jid_row_id", new String[2], 0, 1));
        r13[22] = AnonymousClass1D6.A01("group_participant_user", C18070vi.A0N("group_jid_row_id", "user_jid_row_id", new String[2], 0, 1));
        r13[23] = AnonymousClass1D6.A01("group_participant_device", C18070vi.A0N("group_participant_row_id", "device_jid_row_id", new String[2], 0, 1));
        r13[24] = AnonymousClass1D6.A01("group_past_participant_user", C18070vi.A0N("group_jid_row_id", "user_jid_row_id", new String[2], 0, 1));
        r13[25] = AnonymousClass1D6.A01("group_notification_version", C18070vi.A0M("group_jid_row_id"));
        r13[26] = AnonymousClass1D6.A01("pay_transaction", C18070vi.A0M(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        r13[27] = AnonymousClass1D6.A01("missed_call_logs", C18070vi.A0M("message_row_id"));
        r13[28] = AnonymousClass1D6.A01("missed_call_log_participant", C18070vi.A0N("call_logs_row_id", "jid", new String[2], 0, 1));
        r13[29] = AnonymousClass1D6.A01("user_device_info", C18070vi.A0M("user_jid_row_id"));
        r13[30] = AnonymousClass1D6.A01("message_comment", C18070vi.A0N("parent_message_row_id", "message_row_id", new String[2], 0, 1));
        String[] strArr10 = new String[2];
        strArr10[0] = "child_message_row_id";
        r13[31] = AnonymousClass1D6.A01("message_association", C18070vi.A0O("association_type", strArr10, 1));
        String[] A1b2 = C17880vN.A1b("chat_row_id", "from_me", 4, 1);
        A1b2[2] = "key_id";
        r13[32] = AnonymousClass1D6.A01("message_add_on", C18070vi.A0O("sender_jid_row_id", A1b2, 3));
        r13[33] = AnonymousClass1D6.A01("message_add_on_receipt_device", C18070vi.A0N("message_add_on_row_id", "receipt_device_jid_row_id", new String[2], 0, 1));
        r13[34] = AnonymousClass1D6.A01("call_link", C18070vi.A0M("token"));
        String[] strArr11 = new String[2];
        strArr11[0] = "chat_row_id";
        r13[35] = AnonymousClass1D6.A01("newsletter_message", C18070vi.A0O("server_message_id", strArr11, 1));
        r13[36] = AnonymousClass1D6.A01("newsletter_my_reaction_orphan_message", C18070vi.A0N("chat_row_id", "server_message_id", new String[2], 0, 1));
        String[] strArr12 = new String[2];
        strArr12[0] = "message_row_id";
        r13[37] = AnonymousClass1D6.A01("newsletter_message_reaction", C18070vi.A0O("reaction", strArr12, 1));
        String[] A1b3 = C17880vN.A1b("chat_row_id", "from_me", 4, 1);
        A1b3[2] = "key_id";
        r13[38] = AnonymousClass1D6.A01("message_orphan", C18070vi.A0O("sender_jid_row_id", A1b3, 3));
        String[] strArr13 = new String[3];
        strArr13[0] = "message_row_id";
        strArr13[1] = "source_lang";
        r13[39] = AnonymousClass1D6.A01("message_translation_request", C18070vi.A0O("target_lang", strArr13, 2));
        r13[40] = AnonymousClass1D6.A01("composition_mention", C18070vi.A0N("composition_row_id", "jid_row_id", new String[2], 0, 1));
        r13[41] = AnonymousClass1D6.A01("labeled_jid", C18070vi.A0N("label_id", "jid_row_id", new String[2], 0, 1));
        return AnonymousClass1ZU.A06(r13);
    }
}
