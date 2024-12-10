package X;

import java.util.LinkedHashSet;

/* renamed from: X.1aw  reason: invalid class name and case insensitive filesystem */
public abstract class C28811aw {
    public static final String A00;
    public static final String A01;
    public static final String A02;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            CREATE VIEW chat_view AS \n            SELECT\n                ");
        String[] strArr = C28821ax.A01;
        sb.append(AnonymousClass1H2.A01("chat", strArr));
        sb.append("\n            FROM chat chat\n        ");
        A00 = AnonymousClass1Y7.A01(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            CREATE VIEW chat_view AS \n            SELECT\n                ");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(46));
        C200410p.A0T(linkedHashSet, strArr);
        linkedHashSet.remove("jid_row_id");
        sb2.append(AnonymousClass1H2.A01("chat", (String[]) linkedHashSet.toArray(new String[0])));
        sb2.append(", \n                CAST(COALESCE(chat.account_jid_row_id, chat.jid_row_id) AS INTEGER) AS jid_row_id\n            FROM chat AS chat\n        ");
        AnonymousClass1Y7.A01(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT ");
        sb3.append(AnonymousClass1H2.A01("chat_view", strArr));
        sb3.append(", ");
        sb3.append(AnonymousClass1H2.A01("deleted_chat_job", new String[]{"chat_row_id", "deleted_message_row_id", "deleted_starred_message_row_id", "deleted_categories_message_row_id", "deleted_categories_starred_message_row_id", "deleted_message_categories"}));
        sb3.append(", jid.raw_string AS raw_string FROM chat_view AS chat_view LEFT JOIN jid jid ON chat_view.jid_row_id = jid._id LEFT JOIN deleted_chat_job AS deleted_chat_job ON chat_view._id = deleted_chat_job.chat_row_id WHERE (hidden = 0)");
        A01 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("SELECT ");
        sb4.append(AnonymousClass1H2.A01("chat_view", strArr));
        sb4.append(", ");
        sb4.append(AnonymousClass1H2.A01("deleted_chat_job", new String[]{"chat_row_id", "deleted_message_row_id", "deleted_starred_message_row_id", "deleted_categories_message_row_id", "deleted_categories_starred_message_row_id", "deleted_message_categories"}));
        sb4.append(", jid.raw_string AS raw_string, jid.user AS user, jid.server AS server, jid.agent AS agent, jid.device AS device, jid.type AS type FROM chat_view AS chat_view LEFT JOIN jid jid ON chat_view.jid_row_id = jid._id LEFT JOIN deleted_chat_job AS deleted_chat_job ON chat_view._id = deleted_chat_job.chat_row_id WHERE (hidden = 0)");
        A02 = sb4.toString();
    }
}
