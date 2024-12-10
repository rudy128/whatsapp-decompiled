package X;

/* renamed from: X.30G  reason: invalid class name */
public final class AnonymousClass30G implements C72113Kr {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static final String A00(boolean z) {
        String str;
        int i;
        if (z) {
            str = "lid_row_id";
            i = 18;
        } else {
            str = "jid_row_id";
            i = 0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n            DELETE FROM jid_map\n            WHERE\n                ");
        A10.append(str);
        A10.append(" IN (\n                    SELECT\n                        ");
        A10.append(str);
        A10.append("\n                    FROM jid_map\n                    LEFT JOIN jid jid\n                        ON jid._id = ");
        A10.append(str);
        A10.append("\n                    WHERE\n                        jid.type != ");
        A10.append(i);
        return AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n                )\n        ", A10));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d2, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019c, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r18 = this;
            r1 = r18
            X.00H r0 = r1.A02
            java.lang.Object r2 = r0.get()
            X.2cg r2 = (X.C53532cg) r2
            X.00H r10 = r2.A01
            java.lang.Object r0 = r10.get()
            X.1Rp r0 = (X.C26301Rp) r0
            java.lang.String r8 = "MissingLidDevicesFixUpOneTime_missing_lid_devices_fix_completed"
            boolean r0 = r0.A0O(r8)
            if (r0 != 0) goto L_0x0118
            X.00H r0 = r2.A00
            java.lang.Object r9 = r0.get()
            X.1ML r9 = (X.AnonymousClass1ML) r9
            java.util.HashMap r11 = X.C17880vN.A11()
            X.1Cd r12 = r9.A02
            X.1at r17 = r12.get()
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fd }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = "\n            SELECT\n                jid_map.lid_row_id AS lid_row_id,\n                jid.device AS device,\n                user_device.key_index AS key_index \n            FROM user_device\n            LEFT JOIN jid AS jid\n                ON user_device.device_jid_row_id = jid._id\n            LEFT JOIN jid_map\n                ON jid_map.jid_row_id = user_device.user_jid_row_id\n            WHERE\n                lid_row_id IS NOT NULL\n                AND NOT EXISTS (\n                    SELECT\n                        1\n                    FROM user_device AS user_device_inner\n                    LEFT JOIN jid AS jid_inner\n                        ON user_device_inner.device_jid_row_id = jid_inner._id\n                    WHERE\n                        jid_inner.type = 19\n                        AND user_device_inner.user_jid_row_id = jid_map.lid_row_id\n                        AND jid_inner.device = jid.device\n                )\n        "
            java.lang.String r0 = "SELECT_LIDS_WITH_MISSING_DEVICES"
            android.database.Cursor r7 = X.C23141Ev.A00(r3, r2, r0)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "lid_row_id"
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "device"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "key_index"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f1 }
        L_0x004c:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x009e
            long r2 = r7.getLong(r13)     // Catch:{ all -> 0x00f1 }
            int r4 = r7.getInt(r6)     // Catch:{ all -> 0x00f1 }
            long r15 = r7.getLong(r5)     // Catch:{ all -> 0x00f1 }
            X.1DL r14 = r9.A01     // Catch:{ all -> 0x00f1 }
            java.lang.Class<X.1E2> r0 = X.AnonymousClass1E2.class
            com.whatsapp.jid.Jid r14 = r14.A0E(r0, r2)     // Catch:{ all -> 0x00f1 }
            X.1E2 r14 = (X.AnonymousClass1E2) r14     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x0094
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 11T -> 0x007d }
            com.whatsapp.jid.DeviceJid r3 = r0.A03(r14, r4)     // Catch:{ 11T -> 0x007d }
            java.lang.Long r2 = java.lang.Long.valueOf(r15)     // Catch:{ 11T -> 0x007d }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ 11T -> 0x007d }
            r0.<init>(r14, r2)     // Catch:{ 11T -> 0x007d }
            r11.put(r3, r0)     // Catch:{ 11T -> 0x007d }
            goto L_0x004c
        L_0x007d:
            r2 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "DeviceStore/insertMissingLidDevices/userJid: "
            r3.append(r0)     // Catch:{ all -> 0x00f1 }
            r3.append(r14)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "; device: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r3, r4)     // Catch:{ all -> 0x00f1 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00f1 }
            goto L_0x004c
        L_0x0094:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "DeviceStore/insertMissingLidDevices/invalid lid jid row id: "
            X.C17900vP.A0l(r0, r4, r2)     // Catch:{ all -> 0x00f1 }
            goto L_0x004c
        L_0x009e:
            r7.close()     // Catch:{ all -> 0x00fd }
            r17.close()
            r11.size()
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x010a
            X.1au r17 = r12.A05()
            X.1xA r7 = r17.BD0()     // Catch:{ all -> 0x00fd }
            java.util.Iterator r6 = X.C17890vO.A0i(r11)     // Catch:{ all -> 0x00ec }
        L_0x00b9:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e5
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r6)     // Catch:{ all -> 0x00ec }
            java.lang.Object r5 = r2.getKey()     // Catch:{ all -> 0x00ec }
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5     // Catch:{ all -> 0x00ec }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x00ec }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x00ec }
            java.lang.Object r4 = r0.first     // Catch:{ all -> 0x00ec }
            X.1E2 r4 = (X.AnonymousClass1E2) r4     // Catch:{ all -> 0x00ec }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x00ec }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x00ec }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x00ec }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00ec }
            long r2 = r0.longValue()     // Catch:{ all -> 0x00ec }
            r9.A05(r5, r4, r2)     // Catch:{ all -> 0x00ec }
            goto L_0x00b9
        L_0x00e5:
            r7.A00()     // Catch:{ all -> 0x00ec }
            r7.close()     // Catch:{ all -> 0x00fd }
            goto L_0x0107
        L_0x00ec:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00f8 }
            goto L_0x00fc
        L_0x00f1:
            r1 = move-exception
            if (r7 == 0) goto L_0x00fc
            r7.close()     // Catch:{ all -> 0x00f8 }
            goto L_0x00fc
        L_0x00f8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00fd }
        L_0x00fc:
            throw r1     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0102 }
            throw r1
        L_0x0102:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0107:
            r17.close()
        L_0x010a:
            java.lang.Object r2 = r10.get()
            X.1Rp r2 = (X.C26301Rp) r2
            r0 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C26301Rp.A04(r2, r8, r0)
        L_0x0118:
            X.00H r0 = r1.A03
            java.lang.Object r5 = r0.get()
            X.2e3 r5 = (X.C54382e3) r5
            X.00H r2 = r5.A01
            X.11S r0 = X.C17880vN.A0H(r2)
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r0)
            X.11S r0 = X.C17880vN.A0H(r2)
            X.1E2 r3 = r0.A09()
            if (r4 == 0) goto L_0x01b0
            if (r3 == 0) goto L_0x01b0
            X.00H r8 = r5.A00
            java.lang.Object r0 = r8.get()
            X.1Rp r0 = (X.C26301Rp) r0
            java.lang.String r6 = "MissingSelfPeerLidIdentityFixUpOneTime_identity_migration_completed"
            boolean r0 = r0.A0O(r6)
            if (r0 != 0) goto L_0x01b0
            X.00H r0 = r5.A02
            java.lang.Object r2 = r0.get()
            X.1P0 r2 = (X.AnonymousClass1P0) r2
            com.whatsapp.jid.DeviceJid r0 = r4.getPrimaryDevice()
            X.2nE r10 = X.C63962tz.A02(r0)
            com.whatsapp.jid.DeviceJid r0 = r3.getPrimaryDevice()
            X.2nE r11 = X.C63962tz.A02(r0)
            r7 = 1
            X.1MH r0 = r2.A03
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0199 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0199 }
            java.lang.String r2 = "\n          INSERT OR REPLACE INTO identities \n          (recipient_id, recipient_type, device_id, public_key, timestamp)\n          SELECT ?, ?, device_id, public_key, timestamp\n          FROM identities\n          WHERE recipient_id = ? AND recipient_type = ?\n        "
            java.lang.String r0 = "ADD_SELF_PEER_LID_IDENTITY_ONE_TIME_MIGRATION"
            X.2nI r9 = r3.A0D(r2, r0)     // Catch:{ all -> 0x0199 }
            android.database.sqlite.SQLiteStatement r4 = r9.A00     // Catch:{ all -> 0x0199 }
            r4.clearBindings()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x0199 }
            r4.bindString(r7, r0)     // Catch:{ all -> 0x0199 }
            int r0 = r11.A01     // Catch:{ all -> 0x0199 }
            long r2 = (long) r0     // Catch:{ all -> 0x0199 }
            r0 = 2
            r4.bindLong(r0, r2)     // Catch:{ all -> 0x0199 }
            java.lang.String r2 = r10.A03     // Catch:{ all -> 0x0199 }
            r0 = 3
            r4.bindString(r0, r2)     // Catch:{ all -> 0x0199 }
            int r0 = r10.A01     // Catch:{ all -> 0x0199 }
            long r2 = (long) r0     // Catch:{ all -> 0x0199 }
            r0 = 4
            r4.bindLong(r0, r2)     // Catch:{ all -> 0x0199 }
            r9.A01()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "SignalIdentityKeyStore/added self peer identity one time migration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0199 }
            goto L_0x01a0
        L_0x0199:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x019b }
        L_0x019b:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x01a0:
            r5.close()
            java.lang.Object r2 = r8.get()
            X.1Rp r2 = (X.C26301Rp) r2
            java.lang.String r0 = java.lang.String.valueOf(r7)
            X.C26301Rp.A04(r2, r6, r0)
        L_0x01b0:
            X.00H r0 = r1.A01
            java.lang.Object r9 = r0.get()
            X.2e2 r9 = (X.C54372e2) r9
            X.00H r8 = r9.A02
            java.lang.Object r0 = r8.get()
            X.1Rp r0 = (X.C26301Rp) r0
            r10 = 0
            java.lang.String r7 = "DeleteWrongMappingsOneTime_delete_wrong_mappings_completed"
            boolean r0 = r0.A0O(r7)
            if (r0 != 0) goto L_0x022f
            X.00H r0 = r9.A01
            java.lang.Object r0 = r0.get()
            X.1Lj r0 = (X.C24711Lj) r0
            X.1Cd r0 = r0.A00     // Catch:{ SQLException -> 0x0229 }
            X.1au r6 = r0.A05()     // Catch:{ SQLException -> 0x0229 }
            X.1xA r5 = r6.BD0()     // Catch:{ all -> 0x021f }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0215 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0215 }
            r3 = 1
            java.lang.String r2 = A00(r3)     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "DELETE_WRONG_LID_JID_MAPPINGS_ONE_TIME"
            r4.A0E(r2, r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r2 = A00(r10)     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "DELETE_WRONG_PN_JID_MAPPINGS_ONE_TIME"
            r4.A0E(r2, r0)     // Catch:{ all -> 0x0215 }
            r5.A00()     // Catch:{ all -> 0x0215 }
            r5.close()     // Catch:{ all -> 0x021f }
            r6.close()     // Catch:{ SQLException -> 0x0229 }
            X.00H r0 = r9.A00
            java.lang.Object r0 = r0.get()
            X.1Ln r0 = (X.C24751Ln) r0
            r0.A0O()
            java.lang.Object r2 = r8.get()
            X.1Rp r2 = (X.C26301Rp) r2
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.C26301Rp.A04(r2, r7, r0)
            goto L_0x022f
        L_0x0215:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x021a }
            goto L_0x021e
        L_0x021a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x021f }
        L_0x021e:
            throw r2     // Catch:{ all -> 0x021f }
        L_0x021f:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0224 }
            goto L_0x0228
        L_0x0224:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ SQLException -> 0x0229 }
        L_0x0228:
            throw r2     // Catch:{ SQLException -> 0x0229 }
        L_0x0229:
            r2 = move-exception
            java.lang.String r0 = "JidMapStore/deleteWrongMappingsOneTime"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x022f:
            X.00H r0 = r1.A00
            java.lang.Object r2 = r0.get()
            X.2se r2 = (X.C63182se) r2
            java.lang.Boolean r2 = X.C63182se.A01(r2)
            if (r2 == 0) goto L_0x0262
            boolean r8 = r2.booleanValue()
        L_0x0241:
            java.lang.Object r6 = r0.get()
            X.2se r6 = (X.C63182se) r6
            java.lang.Boolean r2 = X.C63182se.A00(r6)
            if (r2 == 0) goto L_0x02a2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x02a2
            X.00H r2 = r6.A01
            java.lang.Object r5 = r2.get()
            X.1Oy r5 = (X.C25631Oy) r5
            X.1MH r2 = r5.A03
            X.1au r7 = r2.A06()
            goto L_0x0264
        L_0x0262:
            r8 = 0
            goto L_0x0241
        L_0x0264:
            r2 = r7
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x02cf }
            X.1Ev r4 = r2.A02     // Catch:{ all -> 0x02cf }
            java.lang.String r3 = "DELETE FROM sender_keys\nWHERE _id IN (\n      SELECT _id\n      FROM sender_keys\n      GROUP BY group_id, sender_id, sender_type, device_id\n      HAVING COUNT(1) > 1\n)"
            java.lang.String r2 = "SignalSenderKeyStore/updateAccountIdForPnRowsOneTime/DELETE_ALL_REPEATED_ROWS_ONE_TIME"
            r4.A0E(r3, r2)     // Catch:{ all -> 0x02cf }
            r7.close()
            X.1MK r9 = r5.A05
            java.lang.String r14 = "sender_account_type"
            java.lang.String r15 = "SELECT MIN(_id) as _id, sender_id FROM sender_keys WHERE _id > ? AND sender_type = 0 AND sender_account_id IS NULL GROUP BY sender_id ORDER BY _id ASC LIMIT ?"
            java.lang.String r10 = "sender_keys"
            java.lang.String r11 = "sender_id"
            java.lang.String r12 = "sender_type"
            java.lang.String r13 = "sender_account_id"
            r9.A08(r10, r11, r12, r13, r14, r15)
            X.00H r2 = r6.A03
            X.0z4 r5 = X.C17880vN.A0K(r2)
            X.0ve r4 = r6.A00
            r3 = 11642(0x2d7a, float:1.6314E-41)
            X.0vf r2 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r2, r4, r3)
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r5)
            java.lang.String r2 = "axolotl_lid_sender_key_migration_completed_v2"
            X.C17880vN.A1C(r3, r2, r4)
        L_0x02a2:
            java.lang.Object r6 = r0.get()
            X.2se r6 = (X.C63182se) r6
            java.lang.Boolean r2 = X.C63182se.A01(r6)
            if (r2 == 0) goto L_0x0304
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0304
            X.00H r2 = r6.A02
            java.lang.Object r5 = r2.get()
            X.1Ov r5 = (X.C25601Ov) r5
            X.1MH r2 = r5.A01
            X.1au r7 = r2.A06()
            r2 = r7
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x02cf }
            X.1Ev r4 = r2.A02     // Catch:{ all -> 0x02cf }
            java.lang.String r3 = "DELETE FROM sessions\nWHERE _id IN (\n      SELECT _id\n      FROM sessions\n      GROUP BY recipient_id, recipient_type, device_id\n      HAVING COUNT(1) > 1\n)"
            java.lang.String r2 = "SignalSessionStore/updateAccountIdForPnRowsOneTime/DELETE_ALL_REPEATED_ROWS_ONE_TIME"
            r4.A0E(r3, r2)     // Catch:{ all -> 0x02cf }
            goto L_0x02d6
        L_0x02cf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02d1 }
        L_0x02d1:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x02d6:
            r7.close()
            X.1MK r9 = r5.A03
            java.lang.String r14 = "recipient_account_type"
            java.lang.String r15 = "SELECT MIN(_id) as _id, recipient_id FROM sessions WHERE _id > ? AND recipient_type = 0 AND recipient_account_id IS NULL GROUP BY recipient_id ORDER BY _id ASC LIMIT ?"
            java.lang.String r10 = "sessions"
            java.lang.String r11 = "recipient_id"
            java.lang.String r12 = "recipient_type"
            java.lang.String r13 = "recipient_account_id"
            r9.A08(r10, r11, r12, r13, r14, r15)
            X.00H r2 = r6.A03
            X.0z4 r5 = X.C17880vN.A0K(r2)
            X.0ve r4 = r6.A00
            r3 = 11643(0x2d7b, float:1.6315E-41)
            X.0vf r2 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r2, r4, r3)
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r5)
            java.lang.String r2 = "axolotl_lid_session_migration_completed_v2"
            X.C17880vN.A1C(r3, r2, r4)
        L_0x0304:
            if (r8 != 0) goto L_0x0323
            java.lang.Object r0 = r0.get()
            X.2se r0 = (X.C63182se) r0
            java.lang.Boolean r0 = X.C63182se.A01(r0)
            if (r0 == 0) goto L_0x0323
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0323
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.2nN r0 = (X.C60092nN) r0
            r0.A02()
        L_0x0323:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30G.Bqf():void");
    }

    public AnonymousClass30G(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A04 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
