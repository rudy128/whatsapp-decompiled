package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1N2  reason: invalid class name */
public class AnonymousClass1N2 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass1N1 A04;
    public final C24751Ln A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public static boolean A00(AnonymousClass1N2 r7, AnonymousClass1BI r8, int i) {
        Cursor A0A;
        C28781at A042 = r7.A03.get();
        try {
            boolean z = false;
            A0A = ((C28801av) A042).A02.A0A("SELECT EXISTS( SELECT * FROM message_system JOIN message ON message._id = message_system.message_row_id  WHERE chat_row_id = ?  AND action_type = ?) as message_exists", "HAS_MESSAGE_WITH_SYSTEM_ACTION_SQL", new String[]{String.valueOf(r7.A01.A09(r8)), String.valueOf(i)});
            if (A0A.moveToFirst() && A0A.getInt(A0A.getColumnIndexOrThrow("message_exists")) == 1) {
                z = true;
            }
            A0A.close();
            A042.close();
            return z;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public long A01(AnonymousClass1BI r7) {
        Cursor A0A;
        C28781at A042 = this.A03.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT _id FROM message_system JOIN message ON message._id = message_system.message_row_id  WHERE chat_row_id = ?  AND (action_type = 19 OR action_type = 67)", "GET_PLAINTEXT_DISABLED_MESSAGE_ROW_ID_SQL", new String[]{String.valueOf(this.A01.A09(r7))});
            if (A0A.moveToFirst()) {
                long j = (long) A0A.getInt(A0A.getColumnIndexOrThrow("_id"));
                A0A.close();
                A042.close();
                return j;
            }
            A0A.close();
            A042.close();
            return -1;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(C436420i r20) {
        C28791au r10;
        long j;
        Long l;
        long j2;
        long j3;
        C436420i r6 = r20;
        int i = r6.A00;
        if (i <= 0 || i >= 181) {
            this.A00.A0G("system-message-store-invalid-action", Integer.toString(i), true);
        }
        AnonymousClass1Cd r7 = this.A03;
        C28791au A052 = r7.A05();
        try {
            C41851xA BD0 = A052.BD0();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_row_id", Long.valueOf(r6.A0x));
                contentValues.put("action_type", Integer.valueOf(i));
                C23141Ev r3 = ((C28801av) A052).A02;
                r3.A09("message_system", "INSERT_MESSAGE_SYSTEM_SQL", contentValues, 5);
                if (r6 instanceof AnonymousClass98A) {
                    AnonymousClass98A r9 = (AnonymousClass98A) r6;
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("message_row_id", Long.valueOf(r9.A0x));
                    C63432t4.A01(contentValues2, "old_data", r9.A01);
                    r3.A09("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues2, 5);
                }
                if (r6 instanceof AnonymousClass2MT) {
                    AnonymousClass2MT r92 = (AnonymousClass2MT) r6;
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("message_row_id", Long.valueOf(r92.A0x));
                    C63432t4.A01(contentValues3, "old_data", r92.A00);
                    r3.A09("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues3, 5);
                }
                if (r6 instanceof AnonymousClass989) {
                    AnonymousClass989 r93 = (AnonymousClass989) r6;
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("message_row_id", Long.valueOf(r93.A0x));
                    C63432t4.A01(contentValues4, "old_data", r93.A00);
                    r3.A09("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues4, 5);
                }
                if (r6 instanceof AnonymousClass2MB) {
                    AnonymousClass2MB r94 = (AnonymousClass2MB) r6;
                    ContentValues contentValues5 = new ContentValues();
                    contentValues5.put("message_row_id", Long.valueOf(r94.A0x));
                    C63432t4.A01(contentValues5, "old_data", r94.A00);
                    r3.A09("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues5, 5);
                }
                if (r6 instanceof C48392Mh) {
                    C48392Mh r8 = (C48392Mh) r6;
                    ContentValues contentValues6 = new ContentValues();
                    contentValues6.put("message_row_id", Long.valueOf(r8.A0x));
                    contentValues6.put("is_me_joined", Integer.valueOf(r8.A00));
                    r3.A09("message_system_group", "INSERT_MESSAGE_SYSTEM_GROUP_SQL", contentValues6, 5);
                    for (UserJid A092 : r8.A01) {
                        long A093 = this.A02.A09(A092);
                        if (A093 >= 0) {
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put("message_row_id", Long.valueOf(r8.A0x));
                            contentValues7.put("user_jid_row_id", Long.valueOf(A093));
                            r3.A09("message_system_chat_participant", "INSERT_MESSAGE_SYSTEM_CHAT_PARTICIPANTS", contentValues7, 5);
                        }
                    }
                }
                if (r6 instanceof AnonymousClass2MP) {
                    AnonymousClass2MP r95 = (AnonymousClass2MP) r6;
                    ContentValues contentValues8 = new ContentValues();
                    contentValues8.put("message_row_id", Long.valueOf(r95.A0x));
                    C63432t4.A01(contentValues8, "new_photo_id", r95.A18());
                    ProfilePhotoChange profilePhotoChange = r95.A00;
                    if (profilePhotoChange != null) {
                        C63432t4.A03(contentValues8, "old_photo", profilePhotoChange.oldPhoto);
                        C63432t4.A03(contentValues8, "new_photo", r95.A00.newPhoto);
                        C63432t4.A01(contentValues8, "new_photo_id", String.valueOf(r95.A00.newPhotoId));
                    }
                    if (!TextUtils.isEmpty(r95.A18()) || r95.A00 != null) {
                        r3.A09("message_system_photo_change", "INSERT_TABLE_MESSAGE_SYSTEM_PHOTO_CHANGE", contentValues8, 5);
                    }
                }
                if (r6 instanceof AnonymousClass2MN) {
                    AnonymousClass2MN r11 = (AnonymousClass2MN) r6;
                    UserJid userJid = r11.A01;
                    if (userJid != null) {
                        j2 = this.A02.A09(userJid);
                    } else {
                        j2 = -1;
                    }
                    UserJid userJid2 = r11.A00;
                    if (userJid2 != null) {
                        j3 = this.A02.A09(userJid2);
                    } else {
                        j3 = -1;
                    }
                    if (!(j2 == -1 && j3 == -1)) {
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put("message_row_id", Long.valueOf(r11.A0x));
                        C63432t4.A00(contentValues9, Long.valueOf(j2), "old_jid_row_id");
                        C63432t4.A00(contentValues9, Long.valueOf(j3), "new_jid_row_id");
                        r3.A09("message_system_number_change", "INSERT_TABLE_MESSAGE_SYSTEM_NUMBER_CHANGE", contentValues9, 5);
                    }
                }
                if (r6 instanceof C1771897p) {
                    C1771897p r96 = (C1771897p) r6;
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put("message_row_id", Long.valueOf(r96.A0x));
                    C63432t4.A00(contentValues10, Long.valueOf((long) r96.A00), "device_added_count");
                    C63432t4.A00(contentValues10, Long.valueOf((long) r96.A01), "device_removed_count");
                    r3.A09("message_system_device_change", "INSERT_TABLE_MESSAGE_SYSTEM_DEVICE_CHANGE", contentValues10, 5);
                }
                if (r6 instanceof AnonymousClass2MC) {
                    AnonymousClass2MC r97 = (AnonymousClass2MC) r6;
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put("message_row_id", Long.valueOf(r97.A0x));
                    contentValues11.put("biz_state_id", Integer.valueOf(r97.A00));
                    r3.A09("message_system_initial_privacy_provider", "INSERT_TABLE_MESSAGE_SYSTEM_INITIAL_PRIVACY_PROVIDER", contentValues11, 5);
                }
                if (r6 instanceof AnonymousClass2MH) {
                    AnonymousClass2MH r98 = (AnonymousClass2MH) r6;
                    ContentValues contentValues12 = new ContentValues();
                    contentValues12.put("message_row_id", Long.valueOf(r98.A0x));
                    UserJid userJid3 = r98.A01;
                    if (userJid3 != null) {
                        contentValues12.put("sender_jid_row_id", Long.valueOf(this.A02.A09(userJid3)));
                    }
                    UserJid userJid4 = r98.A00;
                    if (userJid4 != null) {
                        contentValues12.put("receiver_jid_row_id", Long.valueOf(this.A02.A09(userJid4)));
                    }
                    C63432t4.A01(contentValues12, "amount_with_symbol", r98.A03);
                    AnonymousClass205 r99 = r98.A02;
                    if (r99 != null) {
                        AnonymousClass1BI r1 = r99.A00;
                        if (r1 != null) {
                            contentValues12.put("remote_message_sender_jid_row_id", Long.valueOf(this.A02.A09(r1)));
                        }
                        C63432t4.A02(contentValues12, "remote_message_from_me", r99.A02);
                        C63432t4.A01(contentValues12, "remote_message_key", r99.A01);
                    }
                    r3.A09("message_payment", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT", contentValues12, 5);
                    if (r6 instanceof C48402Mi) {
                        C48402Mi r910 = (C48402Mi) r6;
                        ContentValues contentValues13 = new ContentValues();
                        contentValues13.put("message_row_id", Long.valueOf(r910.A0x));
                        C63432t4.A01(contentValues13, "web_stub", r910.A02);
                        C63432t4.A01(contentValues13, "amount", r910.A01);
                        C63432t4.A01(contentValues13, "transfer_date", r910.A04);
                        C63432t4.A01(contentValues13, "payment_sender_name", r910.A03);
                        contentValues13.put("expiration", Integer.valueOf(r910.A00));
                        r3.A09("message_payment_transaction_reminder", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_TRANSACTION_REMINDER", contentValues13, 5);
                    }
                    if (r6 instanceof C48412Mj) {
                        C48412Mj r911 = (C48412Mj) r6;
                        ContentValues contentValues14 = new ContentValues();
                        contentValues14.put("message_row_id", Long.valueOf(r911.A0x));
                        C63432t4.A01(contentValues14, "transaction_info", r911.A03);
                        C63432t4.A01(contentValues14, "transaction_data", r911.A01);
                        C63432t4.A01(contentValues14, "init_timestamp", r911.A02);
                        C63432t4.A01(contentValues14, "update_timestamp", r911.A04);
                        C63432t4.A01(contentValues14, "amount_data", r911.A00);
                        r3.A09("message_payment_status_update", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_STATUS_UPDATE", contentValues14, 5);
                    }
                }
                if (r6 instanceof AnonymousClass2ME) {
                    AnonymousClass2ME r82 = (AnonymousClass2ME) r6;
                    r10 = this.A04.A00.A05();
                    ContentValues contentValues15 = new ContentValues(3);
                    contentValues15.put("message_row_id", Long.valueOf(r82.A0x));
                    contentValues15.put("service", Integer.valueOf(r82.A00));
                    contentValues15.put("invite_used", Boolean.valueOf(r82.A01));
                    ((C28801av) r10).A02.A05("message_system_payment_invite_setup", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_INVITE_SETUP", contentValues15);
                    r10.close();
                }
                if (r6 instanceof AnonymousClass2MX) {
                    this.A07.get();
                    AnonymousClass2MX r912 = (AnonymousClass2MX) r6;
                    C18070vi.A0d(r912, 1);
                    ContentValues contentValues16 = new ContentValues(2);
                    contentValues16.put("message_row_id", Long.valueOf(r912.A0x));
                    contentValues16.put("threshold", Integer.valueOf(r912.A00));
                    r3.A06("message_system_group_auto_restrict", "INSERT_TABLE_MESSAGE_SYSTEM_GROUP_AUTO_RESTRICT", contentValues16);
                }
                if (r6 instanceof AnonymousClass2MQ) {
                    this.A06.get();
                    AnonymousClass2MQ r913 = (AnonymousClass2MQ) r6;
                    C18070vi.A0d(r913, 1);
                    ContentValues contentValues17 = new ContentValues(3);
                    contentValues17.put("message_row_id", Long.valueOf(r913.A0x));
                    contentValues17.put("event_message_row_id", Long.valueOf(r913.A00));
                    contentValues17.put("event_name", r913.A01);
                    r3.A06("message_system_event_updates", "INSERT_TABLE_MESSAGE_SYSTEM_EVENT_UPDATED", contentValues17);
                }
                if (r6 instanceof AnonymousClass2MI) {
                    AnonymousClass2MI r914 = (AnonymousClass2MI) r6;
                    ContentValues contentValues18 = new ContentValues();
                    contentValues18.put("message_row_id", Long.valueOf(r914.A0x));
                    contentValues18.put("is_blocked", Integer.valueOf(r914.A00 ? 1 : 0));
                    r3.A09("message_system_block_contact", "INSERT_TABLE_MESSAGE_SYSTEM_BLOCK_CONTACT", contentValues18, 5);
                }
                if (r6 instanceof AnonymousClass2MK) {
                    AnonymousClass2MK r915 = (AnonymousClass2MK) r6;
                    ContentValues contentValues19 = new ContentValues();
                    contentValues19.put("message_row_id", Long.valueOf(r915.A0x));
                    contentValues19.put("biz_opt_out_category", Integer.valueOf(r915.A01));
                    contentValues19.put("biz_opt_out_action", Integer.valueOf(r915.A00));
                    r3.A09("message_system_opt_out", "INSERT_TABLE_MESSAGE_SYSTEM_BIZ_OPT_OUT", contentValues19, 5);
                }
                if (r6 instanceof C1772297t) {
                    C1772297t r916 = (C1772297t) r6;
                    ContentValues contentValues20 = new ContentValues();
                    contentValues20.put("message_row_id", Long.valueOf(r916.A0x));
                    contentValues20.put("callback_expiry_timestamp", Long.valueOf(r916.A00));
                    contentValues20.put("outgoing_failed_call_id", r916.A01);
                    r3.A09("message_system_biz_callback_enabled", "INSERT_TABLE_MESSAGE_SYSTEM_BIZ_CALLBACK_ENABLED", contentValues20, 5);
                }
                if (r6 instanceof C1772197s) {
                    C1772197s r917 = (C1772197s) r6;
                    ContentValues contentValues21 = new ContentValues();
                    contentValues21.put("message_row_id", Long.valueOf(r917.A0x));
                    contentValues21.put("callback_expiry_timestamp", Long.valueOf(r917.A00));
                    contentValues21.put("outgoing_failed_call_id", r917.A01);
                    r3.A09("message_system_biz_callback_disabled", "INSERT_TABLE_MESSAGE_SYSTEM_BIZ_CALLBACK_DISABLED", contentValues21, 5);
                }
                if (r6 instanceof AnonymousClass2MJ) {
                    AnonymousClass2MJ r918 = (AnonymousClass2MJ) r6;
                    ContentValues contentValues22 = new ContentValues();
                    contentValues22.put("message_row_id", Long.valueOf(r918.A0x));
                    contentValues22.put("setting_duration", Integer.valueOf(r918.A00));
                    r3.A09("message_system_ephemeral_setting_not_applied", "INSERT_TABLE_MESSAGE_SYSTEM_EPHEMERAL_SETTING_NOT_APPLIED", contentValues22, 5);
                }
                if (r6 instanceof AnonymousClass2MD) {
                    AnonymousClass2MD r919 = (AnonymousClass2MD) r6;
                    r10 = r7.A05();
                    ContentValues contentValues23 = new ContentValues();
                    contentValues23.put("message_row_id", Long.valueOf(r919.A0x));
                    contentValues23.put("business_name", r919.A01);
                    contentValues23.put("privacy_message_type", Integer.valueOf(r919.A00));
                    ((C28801av) r10).A02.A05("message_system_business_state", "INSERT_SYSTEM_MESSAGE_BUSINESS_STATE", contentValues23);
                    r10.close();
                }
                if (r6 instanceof AnonymousClass2MM) {
                    AnonymousClass2MM r83 = (AnonymousClass2MM) r6;
                    ContentValues contentValues24 = new ContentValues();
                    contentValues24.put("message_row_id", Long.valueOf(r83.A0x));
                    C63432t4.A01(contentValues24, "call_id", r83.A01);
                    contentValues24.put("is_video_call", Integer.valueOf(r83.A02 ? 1 : 0));
                    contentValues24.put("call_type", Integer.valueOf(r83.A00));
                    r3.A09("message_system_linked_group_call", "INSERT_TABLE_MESSAGE_SYSTEM_LINKED_GROUP_CALL", contentValues24, 5);
                }
                if (r6 instanceof AnonymousClass2MW) {
                    AnonymousClass2MW r84 = (AnonymousClass2MW) r6;
                    ContentValues contentValues25 = new ContentValues();
                    contentValues25.put("message_row_id", Long.valueOf(r84.A0x));
                    Integer num = r84.A02;
                    if (num == null) {
                        l = null;
                    } else {
                        l = Long.valueOf(num.longValue());
                    }
                    C63432t4.A00(contentValues25, l, "old_group_type");
                    contentValues25.put("new_group_type", Integer.valueOf(r84.A00));
                    GroupJid groupJid = r84.A01;
                    if (groupJid == null) {
                        contentValues25.put("linked_parent_group_jid_row_id", -1);
                    } else {
                        contentValues25.put("linked_parent_group_jid_row_id", Long.valueOf(this.A02.A09(groupJid)));
                    }
                    r3.A09("message_system_community_link_changed", "INSERT_MESSAGE_SYSTEM_COMMUNITY_LINK_CHANGED", contentValues25, 5);
                }
                if (r6 instanceof AnonymousClass2MU) {
                    AnonymousClass2MU r85 = (AnonymousClass2MU) r6;
                    ContentValues contentValues26 = new ContentValues();
                    contentValues26.put("message_row_id", Long.valueOf(r85.A0x));
                    String str = r85.A00;
                    if (str != null) {
                        contentValues26.put("linked_parent_group_name", str);
                    }
                    r3.A09("message_system_group_with_parent", "INSERT_MESSAGE_SYSTEM_GROUP_WITH_PARENT_JID", contentValues26, 5);
                }
                if (r6 instanceof AnonymousClass98B) {
                    AnonymousClass98B r920 = (AnonymousClass98B) r6;
                    for (A2B a2b : r920.A03) {
                        ContentValues contentValues27 = new ContentValues();
                        contentValues27.put("message_row_id", Long.valueOf(r920.A0x));
                        contentValues27.put("subgroup_raw_jid", a2b.A02.getRawString());
                        C63432t4.A01(contentValues27, "subgroup_subject", a2b.A06);
                        AnonymousClass1EC r12 = r920.A01;
                        if (r12 == null) {
                            j = -1;
                        } else {
                            j = this.A02.A09(r12);
                        }
                        contentValues27.put("parent_group_jid_row_id", Long.valueOf(j));
                        r3.A09("message_system_sibling_group_link_change", "INSERT_TABLE_MESSAGE_SYSTEM_SIBLING_GROUP_CHANGE_LINK", contentValues27, 5);
                    }
                }
                if (r6 instanceof C48382Mg) {
                    C48382Mg r86 = (C48382Mg) r6;
                    for (C59632md r921 : r86.A00) {
                        ContentValues contentValues28 = new ContentValues();
                        contentValues28.put("message_row_id", Long.valueOf(r86.A0x));
                        long A094 = this.A02.A09(r921.A02);
                        if (A094 == -1) {
                            C17960vV.A0F(false, "BindMessageUtil/bindJidRowId/no jid row found");
                            this.A00.A0G("wa-community-event", "SystemMessageStore/insertSystemMessageWithGroupNodes/could not bind jid row id", true);
                        } else {
                            contentValues28.put("group_jid_row_id", Long.valueOf(A094));
                            C63432t4.A01(contentValues28, "group_subject", r921.A03);
                            contentValues28.put("group_node_type", Integer.valueOf(r921.A00));
                            C63432t4.A00(contentValues28, Long.valueOf((long) r921.A01), "version");
                            r3.A09("message_system_with_group_nodes", "INSERT_TABLE_MESSAGE_SYSTEM_WITH_GROUP_NODES", contentValues28, 5);
                        }
                    }
                }
                if (r6 instanceof AnonymousClass2ML) {
                    AnonymousClass2ML r72 = (AnonymousClass2ML) r6;
                    ContentValues contentValues29 = new ContentValues();
                    contentValues29.put("message_row_id", Long.valueOf(r72.A0x));
                    C63432t4.A01(contentValues29, "agent_name", r72.A00);
                    contentValues29.put("is_unassigned_chat", Integer.valueOf(r72.A01 ? 1 : 0));
                    r3.A09("message_system_chat_assignment", "INSERT_TABLE_MESSAGE_SYSTEM_CHAT_ASSIGNMENT", contentValues29, 5);
                }
                if (r6 instanceof AnonymousClass2MO) {
                    AnonymousClass2MO r73 = (AnonymousClass2MO) r6;
                    ContentValues contentValues30 = new ContentValues(4);
                    contentValues30.put("message_row_id", Long.valueOf(r73.A0x));
                    contentValues30.put("creation_message_row_id", Long.valueOf(r73.A01));
                    contentValues30.put("call_timestamp_ms", Long.valueOf(r73.A00));
                    contentValues30.put("call_title", r73.A02);
                    r3.A09("message_system_scheduled_call_start", "INSERT_TABLE_MESSAGE_SYSTEM_SCHEDULED_CALL_START", contentValues30, 5);
                }
                if (r6 instanceof AnonymousClass2MG) {
                    AnonymousClass2MG r74 = (AnonymousClass2MG) r6;
                    ContentValues contentValues31 = new ContentValues();
                    contentValues31.put("message_row_id", Long.valueOf(r74.A0x));
                    contentValues31.put("original_message_row_id", Long.valueOf(r74.A00));
                    contentValues31.put("reminder_timestamp_ms", Long.valueOf(r74.A01));
                    String str2 = r74.A02;
                    if (str2 != null) {
                        contentValues31.put("reminder_content", str2);
                        r3.A09("message_system_reminder_setup", "INSERT_TABLE_MESSAGE_SYSTEM_REMINDER_SETUP", contentValues31, 5);
                    } else {
                        C18070vi.A11("reminderContent");
                        throw null;
                    }
                }
                if (r6 instanceof AnonymousClass2MF) {
                    AnonymousClass2MF r62 = (AnonymousClass2MF) r6;
                    ContentValues contentValues32 = new ContentValues();
                    contentValues32.put("message_row_id", Long.valueOf(r62.A0x));
                    contentValues32.put("original_message_row_id", Long.valueOf(r62.A00));
                    String str3 = r62.A01;
                    if (str3 != null) {
                        contentValues32.put("original_reminder_content", str3);
                        r3.A09("message_system_reminder_sent", "INSERT_TABLE_MESSAGE_SYSTEM_REMINDER_SENT", contentValues32, 5);
                    } else {
                        C18070vi.A11("originalReminderContent");
                        throw null;
                    }
                }
                BD0.A00();
                BD0.close();
                A052.close();
                return;
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public AnonymousClass1N2(AnonymousClass190 r1, AnonymousClass1LW r2, AnonymousClass1DL r3, AnonymousClass1Cd r4, AnonymousClass1N1 r5, C24751Ln r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A09 = r7;
        this.A08 = r8;
        this.A06 = r9;
        this.A04 = r5;
        this.A07 = r10;
    }
}
