package X;

/* renamed from: X.2TP  reason: invalid class name */
public abstract class AnonymousClass2TP {
    public static String A00(int i) {
        StringBuilder A0e = C17890vO.A0e();
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "group_jid_row_id";
        A1Z[1] = "user_jid_row_id";
        AnonymousClass1H2.A02("group_participant_user", A0e, A1Z);
        A0e.append(" FROM ");
        A0e.append("group_participant_user");
        C17890vO.A18(A0e, " JOIN (  SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ? ) as meSubSelect ON group_participant_user.group_jid_row_id = meSubSelect.group_jid_row_id");
        A0e.append("user_jid_row_id");
        A0e.append(" IN ");
        return AnonymousClass000.A0y(AnonymousClass1H2.A00(i), A0e);
    }
}
