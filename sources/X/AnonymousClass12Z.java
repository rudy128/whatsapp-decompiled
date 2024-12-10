package X;

/* renamed from: X.12Z  reason: invalid class name */
public final class AnonymousClass12Z implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("agent_chat_assignment", "chat_assignee_index", "\n        CREATE INDEX \n        IF NOT EXISTS \n        chat_assignee_index ON agent_chat_assignment (agent_id)\n        ");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "jid_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = "account_jid_row_id";
        obj.A00 = r2;
        obj.A02 = "agent_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "is_opened";
        obj.A00 = C25041Mq.BOOLEAN;
        r7.CE6("agent_chat_assignment", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
