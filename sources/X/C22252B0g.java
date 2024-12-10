package X;

/* renamed from: X.B0g  reason: case insensitive filesystem */
public final class C22252B0g extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $callback;
    public final /* synthetic */ C19830z4 $waSharedPreferences;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22252B0g(C19830z4 r2, C18090vk r3) {
        super(1);
        this.$waSharedPreferences = r2;
        this.$callback = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = new X.C20125A8k(r2).A0G("contacts_backup_enabled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.A8k r5 = (X.C20125A8k) r5
            java.lang.String r1 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupQueryResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupQueryResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r5.A0A(r0, r1)
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = X.C29431cG.A0b(r0)
            X.A8k r0 = (X.C20125A8k) r0
            if (r0 == 0) goto L_0x005c
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 561612603(0x2179873b, float:8.454346E-19)
            if (r1 != r0) goto L_0x005c
            com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupOptionFieldsImpl r1 = new com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupOptionFieldsImpl
            r1.<init>(r2)
            java.lang.String r0 = "contacts_backup_enabled"
            boolean r1 = r1.A0G(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            if (r3 == 0) goto L_0x005c
            X.0z4 r0 = r4.$waSharedPreferences
            r0.A25(r1)
            X.0z4 r0 = r4.$waSharedPreferences
            r2 = 1
            X.00H r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r0)
            java.lang.String r0 = "native_contacts_backup_contacts_updated"
            X.C17880vN.A1F(r1, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSyncHelperUtils/getContactsBackupSetting/onData : "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
        L_0x0051:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vk r0 = r4.$callback
            r0.invoke()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x005c:
            java.lang.String r0 = "ContactSyncHelperUtils/getContactsBackupSetting/onData : missing contactsBackupEnabled"
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22252B0g.invoke(java.lang.Object):java.lang.Object");
    }
}
