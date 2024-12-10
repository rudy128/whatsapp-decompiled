package X;

/* renamed from: X.30X  reason: invalid class name */
public final class AnonymousClass30X implements C72143Ku {
    public final C24761Lo A00;
    public final AnonymousClass1M9 A01;
    public final C26781Tl A02;
    public final C127086dm A03;
    public final AnonymousClass11C A04;
    public final C219217x A05;
    public final C19830z4 A06;
    public final AnonymousClass1UN A07;
    public final C18030ve A08;

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0216, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x021d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x021e, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0221, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01fb A[Catch:{ all -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0w(X.C171888sR r13) {
        /*
            r12 = this;
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.11C r1 = r12.A04
            X.17x r0 = r12.A05
            java.lang.Integer r0 = X.AnonymousClass2T4.A00(r1, r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r13.A0q = r0
        L_0x0014:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            X.1M9 r5 = r12.A01
            r5.A0m(r0)
            int r0 = r0.size()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r13.A0r = r0
            X.0ve r3 = r12.A08
            r0 = 5868(0x16ec, float:8.223E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            r4 = 0
            if (r0 == 0) goto L_0x00f1
            X.1M2 r9 = r5.A04
            r7 = 1
            X.1Ez r8 = new X.1Ez
            r8.<init>((boolean) r7)
            r8.A04()
            r11 = 0
            X.1at r6 = X.C24801Ls.A00(r9)     // Catch:{ IllegalStateException -> 0x0082 }
            java.lang.String r1 = "SELECT count(*) AS _count FROM wa_contacts WHERE ( wa_contacts.sync_policy = 0 OR wa_contacts.sync_policy IS NULL) AND wa_contacts.is_whatsapp_user = 1 AND wa_contacts.raw_contact_id NOT NULL AND wa_contacts.raw_contact_id != -1"
            java.lang.String r0 = "SYNCED_TO_DEVICE_IN_NETWORK_CONTACTS"
            android.database.Cursor r10 = X.C24861Ly.A03(r6, r1, r0, r4)     // Catch:{ all -> 0x0078 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "_count"
            int r0 = X.C17890vO.A01(r10, r0)     // Catch:{ all -> 0x006c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006c }
            r8.A01()     // Catch:{ all -> 0x006c }
            goto L_0x0065
        L_0x0060:
            java.lang.String r0 = "ContactManagerDatabase/getSyncedToDeviceInNetworkContactsCount missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x006c }
        L_0x0065:
            r10.close()     // Catch:{ all -> 0x0078 }
            r6.close()     // Catch:{ IllegalStateException -> 0x0082 }
            goto L_0x0089
        L_0x006c:
            r1 = move-exception
            if (r10 == 0) goto L_0x0077
            r10.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0078 }
        L_0x0077:
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x0082 }
        L_0x0081:
            throw r1     // Catch:{ IllegalStateException -> 0x0082 }
        L_0x0082:
            r6 = move-exception
            java.lang.String r1 = "ContactManagerDatabase/getSyncedToDeviceInNetworkContactsCount/"
            r0 = 0
            X.AnonymousClass1M2.A0G(r6, r1, r0, r0)
        L_0x0089:
            r8.A01()
            if (r11 == 0) goto L_0x009e
            java.lang.Long r0 = X.C17890vO.A0N(r11)
        L_0x0092:
            r13.A1Z = r0
            X.1Ez r8 = new X.1Ez
            r8.<init>((boolean) r7)
            r8.A04()
            r7 = 0
            goto L_0x00a0
        L_0x009e:
            r0 = r4
            goto L_0x0092
        L_0x00a0:
            X.1at r9 = X.C24801Ls.A00(r9)     // Catch:{ IllegalStateException -> 0x00e1 }
            java.lang.String r1 = "SELECT COUNT(DISTINCT jid) AS _count FROM wa_contacts WHERE ( sync_policy = 0 OR sync_policy IS NULL) AND is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1"
            java.lang.String r0 = "UNIQUE_SYNCED_IN_NETWORK_CONTACTS_COUNT"
            android.database.Cursor r10 = X.C24861Ly.A03(r9, r1, r0, r4)     // Catch:{ all -> 0x00d4 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "_count"
            int r6 = X.C17890vO.A01(r10, r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00bf
        L_0x00b9:
            java.lang.String r0 = "ContactManagerDatabase/getUniqueSyncedInNetworkContactsCount missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00c8 }
            r6 = 0
        L_0x00bf:
            r10.close()     // Catch:{ all -> 0x00c6 }
            r9.close()     // Catch:{ IllegalStateException -> 0x00df }
            goto L_0x00e8
        L_0x00c6:
            r1 = move-exception
            goto L_0x00d6
        L_0x00c8:
            r1 = move-exception
            if (r10 == 0) goto L_0x00d3
            r10.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            r6 = 0
        L_0x00d6:
            r9.close()     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x00df }
        L_0x00de:
            throw r1     // Catch:{ IllegalStateException -> 0x00df }
        L_0x00df:
            r1 = move-exception
            goto L_0x00e3
        L_0x00e1:
            r1 = move-exception
            r6 = 0
        L_0x00e3:
            java.lang.String r0 = "ContactManagerDatabase/getUniqueSyncedInNetworkContactsCount/"
            X.AnonymousClass1M2.A0G(r1, r0, r7, r7)
        L_0x00e8:
            r8.A01()
            java.lang.Long r0 = X.C17880vN.A0n(r6)
            r13.A1c = r0
        L_0x00f1:
            r0 = 12249(0x2fd9, float:1.7165E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x016e
            X.1M2 r1 = r5.A04
            r0 = 1
            X.1Ez r7 = new X.1Ez
            r7.<init>((boolean) r0)
            r7.A04()
            r6 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            X.1at r8 = X.C24801Ls.A00(r1)     // Catch:{ IllegalStateException -> 0x014b }
            java.lang.String r1 = "SELECT count(*) AS _count FROM wa_contacts WHERE is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1"
            java.lang.String r0 = "IN_NETWORK_CONTACTS_COUNT"
            android.database.Cursor r9 = X.C24861Ly.A03(r8, r1, r0, r4)     // Catch:{ all -> 0x0141 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = "_count"
            int r0 = X.C17890vO.A01(r9, r0)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0135 }
            r7.A01()     // Catch:{ all -> 0x0135 }
            goto L_0x012e
        L_0x0129:
            java.lang.String r0 = "ContactManagerDatabase/getInNetworkContactsCount missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0135 }
        L_0x012e:
            r9.close()     // Catch:{ all -> 0x0141 }
            r8.close()     // Catch:{ IllegalStateException -> 0x014b }
            goto L_0x0151
        L_0x0135:
            r1 = move-exception
            if (r9 == 0) goto L_0x0140
            r9.close()     // Catch:{ all -> 0x013c }
            goto L_0x0140
        L_0x013c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0141 }
        L_0x0140:
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0146 }
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x014b }
        L_0x014a:
            throw r1     // Catch:{ IllegalStateException -> 0x014b }
        L_0x014b:
            r1 = move-exception
            java.lang.String r0 = "ContactManagerDatabase/getInNetworkContactsCount/"
            X.AnonymousClass1M2.A0G(r1, r0, r6, r6)
        L_0x0151:
            r7.A01()
            java.lang.Long r0 = X.C17890vO.A0N(r10)
            r13.A1B = r0
            int r0 = r5.A07()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r13.A1L = r0
            int r0 = r5.A08()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r13.A1b = r0
        L_0x016e:
            X.1UN r0 = r12.A07
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0197
            X.0z4 r0 = r12.A06
            boolean r0 = r0.A2J()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.A0X = r0
            X.6dm r0 = r12.A03
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "sync_to_device_sticky_toggle_setting"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.A0M = r0
        L_0x0197:
            r0 = 9930(0x26ca, float:1.3915E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x01db
            X.1Tl r0 = r12.A02
            X.1Tk r0 = r0.A00
            X.1Lt r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x021b }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x021b }
            java.lang.String r2 = "SELECT COUNT(*) as _count from wa_contacts_created_within_wa"
            java.lang.String r0 = "ContactsCreatedWithinWaStore/getCountOfContactsCreatedWithinWa"
            r1 = 0
            android.database.Cursor r2 = r5.A0A(r2, r0, r4)     // Catch:{ all -> 0x021b }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = "_count"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0214 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0214 }
            goto L_0x01cd
        L_0x01c8:
            java.lang.String r0 = "ContactsCreatedWithinWaStore/getCountOfContactsCreatedWithinWa missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0214 }
        L_0x01cd:
            r2.close()     // Catch:{ all -> 0x021b }
            r3.close()
            if (r1 == 0) goto L_0x01ea
            java.lang.Long r0 = X.C17890vO.A0N(r1)
        L_0x01d9:
            r13.A0z = r0
        L_0x01db:
            X.1Lo r0 = r12.A00
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Ly r0 = (X.C24861Ly) r0
            X.1at r3 = X.C24801Ls.A00(r0)
            goto L_0x01ec
        L_0x01ea:
            r0 = r4
            goto L_0x01d9
        L_0x01ec:
            java.lang.String r2 = "SELECT COUNT(*) as count FROM wa_address_book"
            java.lang.String r0 = "AB_TABLE_GET_TOTAL_COUNT"
            r1 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r0, r4)     // Catch:{ all -> 0x021b }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0205
            java.lang.String r0 = "count"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0214 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0214 }
        L_0x0205:
            r2.close()     // Catch:{ all -> 0x021b }
            r3.close()
            if (r1 == 0) goto L_0x0211
            java.lang.Long r4 = X.C17890vO.A0N(r1)
        L_0x0211:
            r13.A12 = r4
            return
        L_0x0214:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x021b }
            throw r0     // Catch:{ all -> 0x021b }
        L_0x021b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x021d }
        L_0x021d:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30X.C0w(X.8sR):void");
    }

    public AnonymousClass30X(C24761Lo r2, AnonymousClass1M9 r3, C26781Tl r4, C127086dm r5, AnonymousClass11C r6, C219217x r7, C19830z4 r8, AnonymousClass1UN r9, C18030ve r10) {
        C18070vi.A0w(r10, r6, r7, r3, r8);
        C18070vi.A0l(r9, r5);
        C18070vi.A0d(r2, 9);
        this.A08 = r10;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }
}
