package X;

import java.util.Set;

/* renamed from: X.2Wi  reason: invalid class name and case insensitive filesystem */
public abstract class C50932Wi {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String str = C209514c.A00;
        A10.append(str);
        A10.append(" FROM ");
        A10.append("message");
        A02 = AnonymousClass000.A0y(" WHERE chat_row_id=? AND from_me=? AND key_id=?", A10);
        StringBuilder A0H = C17900vP.A0H("SELECT ", str, " FROM ");
        A0H.append("message_system AS message_system");
        A0H.append(" JOIN ");
        A0H.append("available_message_view AS message");
        C17900vP.A0c(" ON message_system.message_row_id = message._id", " WHERE ", "chat_row_id = ?", " AND ", A0H);
        A0H.append("from_me = 1");
        A0H.append(" AND ");
        A0H.append("message_type = 7");
        A0H.append(" AND ");
        A0H.append("message_system.action_type = 6");
        A0H.append(" ORDER BY sort_id DESC");
        A00 = AnonymousClass000.A0y(" LIMIT 1", A0H);
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message_system AS message_system", A102);
        A102.append(" JOIN ");
        A102.append("available_message_view AS message");
        C17890vO.A10(" WHERE message_system.message_row_id = message._id", " AND ", "chat_row_id = ?", A102);
        A102.append(" AND ");
        A102.append("from_me = 1");
        A102.append(" AND ");
        C17900vP.A0c("message_type = 7", " AND ", "message_system.action_type = 6", " ORDER BY sort_id DESC", A102);
        A01 = AnonymousClass000.A0y(" LIMIT 1", A102);
        StringBuilder A103 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "available_message_view AS message", A103);
        A103.append(" LEFT JOIN ");
        A103.append("message_system");
        C17890vO.A10(" AS message_system", " ON message_system.message_row_id = message._id", " LEFT JOIN ", A103);
        A103.append("message_system_group");
        A103.append(" AS system_group");
        A103.append(" ON message_system.message_row_id = system_group.message_row_id");
        A103.append(" WHERE ");
        A103.append("message.chat_row_id = ?");
        A103.append(" AND ");
        A103.append("message.message_type NOT IN ('8' , '10' , '36' , '77' , '90' , '12' , '98')");
        A103.append(" AND (");
        A103.append("message.from_me = 0 OR (message_system.action_type = 4 AND system_group.is_me_joined = 1) OR (message_system.action_type = 12 AND system_group.is_me_joined = 1))");
        A103.append(" AND (view_mode IS NULL OR view_mode = 0) ");
        A103.append(" ORDER BY sort_id");
        A03 = AnonymousClass000.A0y(" DESC LIMIT ?", A103);
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("SELECT _id FROM message_system JOIN message ON message._id = message_system.message_row_id  WHERE _id > ?  AND chat_row_id = ?  AND action_type IN ");
        A04 = AnonymousClass000.A0y(AnonymousClass1H2.A00(((Set) AnonymousClass2WQ.A00.get()).size()), A104);
    }
}
