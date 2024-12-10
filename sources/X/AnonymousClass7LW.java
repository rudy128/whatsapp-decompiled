package X;

/* renamed from: X.7LW  reason: invalid class name */
public final class AnonymousClass7LW implements AnonymousClass1O5 {
    public final /* synthetic */ AnonymousClass89C A00;
    public final /* synthetic */ C138296wq A01;
    public final /* synthetic */ AnonymousClass1NV A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass7LW(AnonymousClass89C r1, C138296wq r2, AnonymousClass1NV r3, boolean z) {
        this.A03 = z;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    private final void A00() {
        AnonymousClass1NV r5 = this.A02;
        Long A012 = r5.A01();
        if (A012 != null) {
            C138296wq r4 = this.A01;
            r4.A01.CGv(new AnonymousClass7RT(r4, r5, this.A00, 33, this.A03), A012.longValue());
            return;
        }
        this.A00.Bsl();
    }

    public void BrD(String str) {
        C17900vP.A0e("p2p/fpm/IntentToMigrateHandler/sendSetFirstPartyMigrationIntentIq/onDeliveryFailure id=", str, C18070vi.A0K(str));
        A00();
    }

    public void Bt9(C29621ca r3, String str) {
        C18070vi.A0h(str, r3);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("p2p/fpm/IntentToMigrateHandler/sendSetFirstPartyMigrationIntentIq/onError id=");
        A10.append(str);
        C17900vP.A0X(r3, ", node=", A10);
        A00();
    }

    public void C7Z(C29621ca r4, String str) {
        C17900vP.A0f("p2p/fpm/IntentToMigrateHandler/sendSetFirstPartyMigrationIntentIq/onSuccess id=", str, C18070vi.A0K(str));
        boolean z = this.A03;
        C19830z4 r0 = this.A01.A00;
        if (z) {
            r0.A1i("chat_transfer_intent_to_migrate_last_set_timestamp");
        } else {
            C17880vN.A1B(C19830z4.A00(r0), "chat_transfer_intent_to_migrate_last_set_timestamp");
        }
        this.A00.onSuccess();
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
