package X;

/* renamed from: X.31G  reason: invalid class name */
public final class AnonymousClass31G implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_group_descriptions", "wa_group_descriptions_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C25021Mo A06 = C18070vi.A06(r7);
        C25031Mp[] r4 = new C25031Mp[6];
        A06.A02 = "jid";
        C25041Mq r3 = C25041Mq.TEXT;
        A06.A00 = r3;
        C25021Mo.A09(A06, r4);
        A06.A02 = "description";
        A06.A00 = r3;
        C25021Mo.A07(A06, r4);
        A06.A02 = "description_id";
        C25041Mq r1 = C25041Mq.INTEGER;
        C25021Mo.A06(A06, r1, r4);
        A06.A02 = "description_time";
        A06.A00 = r1;
        C25021Mo.A08(A06, r4);
        A06.A02 = "description_setter_jid";
        C25021Mo.A05(A06, r3, r4);
        A06.A02 = "description_id_string";
        A06.A00 = r3;
        A06.A04 = true;
        A06.A01 = "''";
        r4[5] = A06.A0B();
        r7.CE6("wa_group_descriptions", r4);
    }
}
