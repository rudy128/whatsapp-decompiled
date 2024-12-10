package X;

/* renamed from: X.2tY  reason: invalid class name and case insensitive filesystem */
public abstract class C63702tY {
    public static String A00 = A01(68);
    public static String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    public static String A00(int i) {
        StringBuilder A11;
        String str;
        String A012;
        String str2;
        if (i == 56) {
            str = "message_add_on_reaction";
            A012 = AnonymousClass1H2.A01(str, C213315o.A00);
            str2 = "message_add_on_reaction.message_add_on_row_id";
        } else if (i == 67) {
            str = "message_add_on_poll_vote";
            A012 = AnonymousClass1H2.A01(str, C213215n.A00);
            str2 = "message_add_on_poll_vote.message_add_on_row_id";
        } else if (i == 68) {
            str = "message_add_on_keep_in_chat";
            A012 = AnonymousClass1H2.A01(str, C212915k.A00);
            str2 = "message_add_on_keep_in_chat.message_add_on_row_id";
        } else if (i == 79) {
            str = "message_add_on_pin_in_chat";
            A012 = AnonymousClass1H2.A01(str, C213015l.A00);
            str2 = "message_add_on_pin_in_chat.message_add_on_row_id";
        } else if (i == 74) {
            A11 = AnonymousClass000.A11("SELECT ");
            C17890vO.A10(AnonymousClass1H2.A01("message_add_on", C213615r.A00), " FROM ", "message_add_on", A11);
            A11.append(" ");
            return A11.toString();
        } else if (i == 86) {
            str = "message_add_on_scheduled_call_edit";
            A012 = AnonymousClass1H2.A01(str, C213515q.A00);
            str2 = "message_add_on_scheduled_call_edit.message_add_on_row_id";
        } else if (i == 93) {
            str = "message_add_on_event_response";
            A012 = AnonymousClass1H2.A01(str, C50712Vm.A00);
            str2 = "message_add_on_event_response.message_add_on_row_id";
        } else if (i == 11) {
            A11 = AnonymousClass000.A11("SELECT ");
            C17890vO.A10(AnonymousClass1H2.A01("message_add_on", C213615r.A00), " FROM ", "message_add_on", A11);
            return A11.toString();
        } else {
            throw AnonymousClass001.A13("Not supported type :", AnonymousClass000.A10(), i);
        }
        A11 = AnonymousClass000.A11("SELECT ");
        AnonymousClass1H2.A02("message_add_on", A11, C213615r.A00);
        C17900vP.A0c(",", A012, " FROM ", "message_add_on", A11);
        A11.append(" LEFT JOIN ");
        C17890vO.A17(A11, str);
        A11.append("message_add_on._id = ");
        A11.append(str2);
        A11.append(" ");
        return A11.toString();
    }

    public static String A01(int i) {
        String str = "SELECT COUNT(message_add_on._id) as unread_count, MAX(message_add_on._id) as last_message_add_on_row_id, message_add_on.parent_message_row_id as parent_message_row_id FROM message_add_on";
        if (i == 68) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" LEFT JOIN ");
            C17890vO.A17(A11, "message_add_on_keep_in_chat");
            str = AnonymousClass000.A0y("message_add_on._id=message_add_on_keep_in_chat.message_add_on_row_id", A11);
        }
        StringBuilder A112 = AnonymousClass000.A11(str);
        A112.append(" WHERE ");
        String A0X = C17890vO.A0X("message_add_on.chat_row_id = ?", A112);
        A112.append("message_add_on.message_add_on_type = ");
        A112.append(i);
        A112.append(A0X);
        A112.append("message_add_on.status = ?");
        A112.append(A0X);
        A112.append("message_add_on.from_me = 0");
        A112.append(A0X);
        A112.append("message_add_on._id > ?");
        A112.append(A0X);
        String A0y = AnonymousClass000.A0y("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A112);
        if (i == 68) {
            StringBuilder A113 = AnonymousClass000.A11(A0y);
            A113.append(A0X);
            A113.append("message_add_on_keep_in_chat.keep_in_chat_state=1");
            A113.append(A0X);
            A0y = AnonymousClass000.A0y("message_add_on_keep_in_chat.keep_count <= 1", A113);
        }
        StringBuilder A114 = AnonymousClass000.A11(A0y);
        A114.append(" GROUP BY ");
        A114.append("message_add_on.parent_message_row_id");
        A114.append(" ORDER BY ");
        A114.append("last_message_add_on_row_id");
        return AnonymousClass000.A0y(" DESC LIMIT ?", A114);
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String[] strArr = C213615r.A00;
        AnonymousClass1H2.A02("message_add_on", A10, strArr);
        A10.append(" FROM ");
        String A0Y = C17890vO.A0Y("message_add_on", A10);
        A10.append("message_add_on.chat_row_id");
        A10.append(" = ? AND ");
        A10.append("message_add_on.key_id");
        A10.append(" = ? AND ");
        A10.append("message_add_on.from_me");
        A10.append(" = ? AND ");
        A04 = AnonymousClass000.A0y("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(AnonymousClass1H2.A01("message_add_on", strArr), " FROM ", "message_add_on", A0Y, A11);
        A11.append("message_add_on._id = ?");
        A03 = AnonymousClass001.A1H(" AND ", "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A11);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("SELECT DISTINCT ");
        C17890vO.A10(AnonymousClass1H2.A01("message", C209514c.A01), " FROM ", "message_add_on", A102);
        A102.append(" JOIN ");
        C17890vO.A17(A102, "message");
        A102.append("message_add_on.parent_message_row_id");
        A102.append(" = ");
        A102.append("message._id");
        A102.append(A0Y);
        A102.append("message_add_on.expiry_timestamp <= ? AND message_add_on.expiry_timestamp != 0 AND message_add_on.expiry_timestamp is not null");
        A05 = AnonymousClass000.A0y(" LIMIT ?", A102);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("SELECT COUNT(*) as count FROM message_add_on JOIN message_add_on_pin_in_chat ON message_add_on._id = message_add_on_pin_in_chat.message_add_on_row_id ");
        A02 = AnonymousClass000.A0y(" WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1", A103);
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("SELECT _id FROM message_add_on WHERE ");
        A01 = AnonymousClass000.A0y("message_add_on_type=11 AND key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", A104);
    }

    public static String A02(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A18(A10, A00(i));
        String A0X = C17890vO.A0X("message_add_on.chat_row_id = ?", A10);
        A10.append("message_add_on.message_add_on_type = ");
        A10.append(i);
        A10.append(A0X);
        A10.append("message_add_on._id > ?");
        A10.append(A0X);
        A10.append("message_add_on.from_me = 0");
        A10.append(A0X);
        return AnonymousClass000.A0y("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A10);
    }

    public static String A03(int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT  DISTINCT (message_add_on.sender_jid_row_id), message_add_on.parent_message_row_id FROM message_add_on WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = ");
        A10.append(i2);
        A10.append(" AND ");
        A10.append("message_add_on.status = ?");
        A10.append(" AND ");
        A10.append("message_add_on.from_me = 0");
        A10.append(" AND ");
        A10.append("message_add_on._id > ?");
        A10.append(" AND ");
        A10.append("message_add_on.parent_message_row_id IN ");
        A10.append(AnonymousClass1H2.A00(i));
        A10.append(" AND ");
        return AnonymousClass000.A0y("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A10);
    }
}
