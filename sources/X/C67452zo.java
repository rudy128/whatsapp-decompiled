package X;

/* renamed from: X.2zo  reason: invalid class name and case insensitive filesystem */
public final class C67452zo implements AnonymousClass1L0 {
    public final AnonymousClass18O A00;
    public final AnonymousClass1SI A01;
    public final C26811To A02;
    public final C26371Rw A03;
    public final C25851Pw A04;
    public final AnonymousClass1TR A05;
    public final AnonymousClass1S0 A06;
    public final AnonymousClass11P A07;
    public final C19830z4 A08;
    public final AnonymousClass122 A09;
    public final AnonymousClass10I A0A;

    public /* synthetic */ void Bqg() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03ad, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03b4, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqh() {
        /*
            r30 = this;
            r4 = r30
            X.1Pw r0 = r4.A04
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_one_time_cleanup_for_non_md_user"
            X.C17880vN.A1B(r1, r0)
            X.1Rw r3 = r4.A03
            X.1Pw r1 = r3.A03
            java.lang.String r0 = "mutation_counter"
            long r28 = r1.A01(r0)
            java.lang.String r0 = "invalid_action_counter"
            long r26 = r1.A01(r0)
            X.1Rs r9 = r3.A06
            X.1Oq r2 = r9.A00
            X.1at r8 = r2.get()
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03c4 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x03c4 }
            java.lang.String r6 = "SELECT COUNT(*) as count FROM syncd_mutations"
            r0 = 0
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x03c4 }
            java.lang.String r0 = "SyncdMutationsTable.COUNT_NUM_MUTATIONS"
            android.database.Cursor r5 = r7.A0A(r6, r0, r5)     // Catch:{ all -> 0x03c4 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x03b8 }
            if (r0 != 0) goto L_0x0044
            r5.close()     // Catch:{ all -> 0x03c4 }
            goto L_0x0051
        L_0x0044:
            java.lang.String r0 = "count"
            long r24 = X.C17890vO.A06(r5, r0)     // Catch:{ all -> 0x03b8 }
            r5.close()     // Catch:{ all -> 0x03c4 }
            r8.close()
            goto L_0x0056
        L_0x0051:
            r8.close()
            r24 = -1
        L_0x0056:
            java.lang.String r0 = "upload_conflict_counter"
            long r22 = r1.A01(r0)
            java.lang.String r0 = "unsupported_action_counter"
            long r20 = r1.A01(r0)
            java.lang.String r0 = "cross_index_conflict_counter"
            long r18 = r1.A01(r0)
            java.lang.String r0 = "unset_action_mutation_counter"
            long r16 = r1.A01(r0)
            java.lang.String r0 = "key_rotation_remove_counter"
            long r14 = r1.A01(r0)
            java.lang.String r0 = "missing_key_counter"
            long r12 = r1.A01(r0)
            r0 = 9
            long[] r8 = new long[r0]
            r0 = 0
            r8[r0] = r28
            r0 = 1
            r8[r0] = r12
            r0 = 2
            r8[r0] = r26
            r0 = 3
            r8[r0] = r24
            r0 = 4
            r8[r0] = r22
            r0 = 5
            r8[r0] = r14
            r0 = 6
            r8[r0] = r20
            r0 = 7
            r8[r0] = r18
            r0 = 8
            r8[r0] = r16
            r7 = 9
            r1 = 0
        L_0x00a0:
            r5 = r8[r1]
            r10 = 0
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x012e
            X.2Gn r1 = new X.2Gn
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r28)
            r1.A04 = r0
            r5 = 0
            int r0 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0129
            r0 = r5
        L_0x00b9:
            r1.A01 = r0
            r6 = -1
            int r0 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0124
            r0 = r5
        L_0x00c2:
            r1.A05 = r0
            int r0 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x011f
            r0 = r5
        L_0x00c9:
            r1.A08 = r0
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x011a
            r0 = r5
        L_0x00d0:
            r1.A07 = r0
            int r0 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0115
            r0 = r5
        L_0x00d7:
            r1.A00 = r0
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
            r0 = r5
        L_0x00de:
            r1.A06 = r0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            r0 = r5
        L_0x00e5:
            r1.A02 = r0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
        L_0x00ef:
            r1.A03 = r5
            X.18K r0 = r3.A08
            r0.CC7(r1)
        L_0x00f6:
            X.0ve r1 = r3.A07
            r0 = 1221(0x4c5, float:1.711E-42)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0215
            java.util.HashMap r8 = X.C17880vN.A11()
            X.1at r12 = r2.get()
            goto L_0x0134
        L_0x010b:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            goto L_0x00e5
        L_0x0110:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            goto L_0x00de
        L_0x0115:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            goto L_0x00d7
        L_0x011a:
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            goto L_0x00d0
        L_0x011f:
            java.lang.Long r0 = java.lang.Long.valueOf(r22)
            goto L_0x00c9
        L_0x0124:
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            goto L_0x00c2
        L_0x0129:
            java.lang.Long r0 = java.lang.Long.valueOf(r26)
            goto L_0x00b9
        L_0x012e:
            int r1 = r1 + 1
            if (r1 >= r7) goto L_0x00f6
            goto L_0x00a0
        L_0x0134:
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0210 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0210 }
            java.lang.String r2 = "SELECT mutation_name, are_dependencies_missing, COUNT(*) AS mutation_count FROM syncd_mutations GROUP BY mutation_name, are_dependencies_missing"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "SyncdMutationsTable.COUNT_MUTATIONS_GROUP_BY_MUTATION_NAME_AND_ARE_DEPENDENCIES_MISSING"
            android.database.Cursor r7 = r5.A0A(r2, r0, r1)     // Catch:{ all -> 0x0210 }
        L_0x0144:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "mutation_name"
            java.lang.String r5 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "are_dependencies_missing"
            long r10 = X.C17890vO.A06(r7, r0)     // Catch:{ all -> 0x0204 }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "mutation_count"
            long r10 = X.C17890vO.A06(r7, r0)     // Catch:{ all -> 0x0204 }
            java.lang.Object r2 = r8.get(r5)     // Catch:{ all -> 0x0204 }
            X.2mB r2 = (X.C59362mB) r2     // Catch:{ all -> 0x0204 }
            if (r2 != 0) goto L_0x0171
            X.2mB r2 = new X.2mB     // Catch:{ all -> 0x0204 }
            r2.<init>()     // Catch:{ all -> 0x0204 }
        L_0x0171:
            if (r1 != 0) goto L_0x0179
            long r0 = r2.A00     // Catch:{ all -> 0x0204 }
            long r0 = r0 + r10
            r2.A00 = r0     // Catch:{ all -> 0x0204 }
            goto L_0x0196
        L_0x0179:
            X.00H r0 = r9.A01     // Catch:{ all -> 0x0204 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0204 }
            X.2lN r1 = (X.C58862lN) r1     // Catch:{ all -> 0x0204 }
            r0 = 0
            X.C18070vi.A0d(r5, r0)     // Catch:{ all -> 0x0204 }
            X.2nY r0 = r1.A00(r5)     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x019a
            boolean r0 = r0.A0J()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x019a
            long r0 = r2.A01     // Catch:{ all -> 0x0204 }
            long r0 = r0 + r10
            r2.A01 = r0     // Catch:{ all -> 0x0204 }
        L_0x0196:
            r8.put(r5, r2)     // Catch:{ all -> 0x0204 }
            goto L_0x0144
        L_0x019a:
            long r0 = r2.A02     // Catch:{ all -> 0x0204 }
            long r0 = r0 + r10
            r2.A02 = r0     // Catch:{ all -> 0x0204 }
            goto L_0x0196
        L_0x01a0:
            r7.close()     // Catch:{ all -> 0x0210 }
            r12.close()
            java.util.Iterator r13 = X.C17890vO.A0i(r8)
        L_0x01aa:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0215
            java.util.Map$Entry r12 = X.AnonymousClass000.A16(r13)
            java.lang.Object r5 = r12.getValue()
            X.2mB r5 = (X.C59362mB) r5
            r0 = 3
            long[] r11 = new long[r0]
            r2 = 0
            long r0 = r5.A00
            r11[r2] = r0
            r2 = 1
            long r0 = r5.A01
            r11[r2] = r0
            r2 = 2
            long r0 = r5.A02
            r11[r2] = r0
            r10 = 3
            r9 = 0
        L_0x01ce:
            r7 = r11[r9]
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ff
            X.2Fr r2 = new X.2Fr
            r2.<init>()
            long r0 = r5.A00
            java.lang.Integer r0 = X.C26371Rw.A02(r0)
            r2.A00 = r0
            long r0 = r5.A01
            java.lang.Integer r0 = X.C26371Rw.A02(r0)
            r2.A01 = r0
            long r0 = r5.A02
            java.lang.Integer r0 = X.C26371Rw.A02(r0)
            r2.A02 = r0
            java.lang.String r0 = X.C17880vN.A0x(r12)
            r2.A03 = r0
            X.18K r0 = r3.A08
            r0.CC7(r2)
            goto L_0x01aa
        L_0x01ff:
            int r9 = r9 + 1
            if (r9 >= r10) goto L_0x01aa
            goto L_0x01ce
        L_0x0204:
            r1 = move-exception
            if (r7 == 0) goto L_0x020f
            r7.close()     // Catch:{ all -> 0x020b }
            goto L_0x020f
        L_0x020b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0210 }
        L_0x020f:
            throw r1     // Catch:{ all -> 0x0210 }
        L_0x0210:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x03c9 }
            throw r1
        L_0x0215:
            X.1S0 r7 = r4.A06
            java.lang.String r0 = "SyncdKeyManager/dailyCronJob"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rr r3 = r7.A09
            java.util.LinkedHashSet r11 = X.C17880vN.A14()
            X.1Oq r5 = r3.A00
            X.1at r8 = r5.get()
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03b1 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x03b1 }
            java.lang.String r1 = "SELECT crypto_info.device_id,  crypto_info.epoch FROM crypto_info LEFT JOIN syncd_mutations on crypto_info.device_id = syncd_mutations.device_id AND crypto_info.epoch = syncd_mutations.epoch WHERE syncd_mutations._id IS NULL AND crypto_info.stale_timestamp = 0 "
            java.lang.String r0 = "SyncdCryptoInfoTable.SELECT_STALE_KEY_IDS_WHERE_TIMESTAMP_NOT_SET"
            android.database.Cursor r9 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x03b1 }
        L_0x0235:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x0252
            java.lang.String r0 = "device_id"
            long r0 = X.C17890vO.A06(r9, r0)     // Catch:{ all -> 0x03aa }
            int r10 = (int) r0     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "epoch"
            long r0 = X.C17890vO.A06(r9, r0)     // Catch:{ all -> 0x03aa }
            int r2 = (int) r0     // Catch:{ all -> 0x03aa }
            X.A2n r0 = new X.A2n     // Catch:{ all -> 0x03aa }
            r0.<init>(r10, r2)     // Catch:{ all -> 0x03aa }
            r11.add(r0)     // Catch:{ all -> 0x03aa }
            goto L_0x0235
        L_0x0252:
            r9.close()     // Catch:{ all -> 0x03b1 }
            r8.close()
            java.util.Set r2 = X.C29431cG.A11(r11)
            X.2lh r0 = r7.A04()
            if (r0 == 0) goto L_0x0267
            X.A2n r0 = r0.A01
            r2.remove(r0)
        L_0x0267:
            X.11P r0 = r7.A04
            long r0 = X.AnonymousClass11P.A01(r0)
            r3.A03(r2, r0)
            X.18O r3 = r7.A01
            X.18Q r2 = X.AnonymousClass18O.A10
            int r2 = r3.A04(r2)
            X.9Io r7 = X.C179589Io.DAYS
            long r2 = X.C196999vz.A00(r7, r2)
            long r2 = X.C21348Aid.A03(r2)
            long r0 = r0 - r2
            X.1au r8 = r5.A06()
            r2 = r8
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x03b1 }
            X.1Ev r3 = r2.A02     // Catch:{ all -> 0x03b1 }
            java.lang.String r2 = "DELETE FROM crypto_info WHERE stale_timestamp != 0  AND stale_timestamp <= ? "
            java.lang.String[] r1 = X.C17900vP.A0t(r0)     // Catch:{ all -> 0x03b1 }
            java.lang.String r0 = "SyncdCryptoInfoTable.DELETE_STALE_KEY_IDS"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x03b1 }
            r8.close()
            X.1TR r5 = r4.A05
            java.lang.String r0 = "SyncEncryptionHelper/dailyCronJob"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r3 = r5.A0B
            r2 = 1104(0x450, float:1.547E-42)
            int r0 = X.C18020vd.A00(r6, r3, r2)
            if (r0 == 0) goto L_0x02da
            X.11P r0 = r5.A07
            long r8 = X.AnonymousClass11P.A01(r0)
            X.1Pw r0 = r5.A03
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r0)
            java.lang.String r0 = "syncd_last_lthash_consistency_check_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r8 = r8 - r0
            int r0 = X.C18020vd.A00(r6, r3, r2)
            long r2 = (long) r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 * r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x02da
            X.10I r2 = r5.A0C
            r0 = 8
            X.7Pc r1 = new X.7Pc
            r1.<init>(r5, r0)
            java.lang.String r0 = "SyncEncryptionHelper/checkLtHashConsistency"
            r2.CGL(r1, r0)
        L_0x02da:
            X.1To r4 = r4.A02
            monitor-enter(r4)
            X.1Te r3 = r4.A0A     // Catch:{ all -> 0x03a7 }
            X.1Pw r0 = r3.A03     // Catch:{ all -> 0x03a7 }
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r0)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "syncd_last_companion_dereg_time"
            r5 = 0
            long r8 = r1.getLong(r0, r5)     // Catch:{ all -> 0x03a7 }
            r2 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0321
            boolean r0 = X.C26711Te.A00(r3)     // Catch:{ all -> 0x03a7 }
            if (r0 != 0) goto L_0x0306
            X.1RK r0 = r3.A05     // Catch:{ all -> 0x03a7 }
            java.util.ArrayList r0 = r0.A07()     // Catch:{ all -> 0x03a7 }
            boolean r0 = X.C17880vN.A1X(r0)     // Catch:{ all -> 0x03a7 }
            if (r0 != 0) goto L_0x0306
            r2 = 1
        L_0x0306:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "SyncdDeleteAllDataApiHandler/shouldCleanUpSyncd: shouldCleanUpSyncd = "
            X.C17900vP.A0n(r0, r1, r2)     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0321
            X.11S r0 = r4.A07     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x03a7 }
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x03a7 }
            r0 = 3
            r4.A0K(r0)     // Catch:{ all -> 0x03a7 }
            goto L_0x038f
        L_0x0321:
            X.1S0 r8 = r4.A0L     // Catch:{ all -> 0x03a7 }
            X.1Ry r0 = r8.A08     // Catch:{ all -> 0x03a7 }
            r5 = 39
            X.C17960vV.A01()     // Catch:{ all -> 0x03a7 }
            X.1Oq r0 = r0.A00     // Catch:{ all -> 0x03a7 }
            X.1at r9 = r0.get()     // Catch:{ all -> 0x03a7 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x039d }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x039d }
            java.lang.String r2 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ?  ORDER BY timestamp ASC  LIMIT 1"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x039d }
            X.C17890vO.A1F(r1, r5)     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "PeerMessagesTable.SELECT_OLDEST_MESSAGE_BY_MESSAGE_TYPE"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x039d }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0391 }
            if (r0 != 0) goto L_0x034e
            r2.close()     // Catch:{ all -> 0x039d }
            goto L_0x038c
        L_0x034e:
            java.lang.String r0 = "timestamp"
            long r5 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0391 }
            r2.close()     // Catch:{ all -> 0x039d }
            r9.close()     // Catch:{ all -> 0x03a7 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x038f
            X.11P r0 = r8.A04     // Catch:{ all -> 0x03a7 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x03a7 }
            X.18O r1 = r8.A01     // Catch:{ all -> 0x03a7 }
            X.18Q r0 = X.AnonymousClass18O.A14     // Catch:{ all -> 0x03a7 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x03a7 }
            long r0 = X.C196999vz.A00(r7, r0)     // Catch:{ all -> 0x03a7 }
            long r0 = X.C21348Aid.A03(r0)     // Catch:{ all -> 0x03a7 }
            long r5 = r5 + r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x038f
            java.lang.String r0 = "sync-manager/deleteSyncdIfWaitForKeyTimedOut: fatal exception because wait for key timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a7 }
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03a7 }
            r4.A0M(r0)     // Catch:{ all -> 0x03a7 }
            goto L_0x038f
        L_0x038c:
            r9.close()     // Catch:{ all -> 0x03a7 }
        L_0x038f:
            monitor-exit(r4)     // Catch:{ all -> 0x03a7 }
            return
        L_0x0391:
            r1 = move-exception
            if (r2 == 0) goto L_0x039c
            r2.close()     // Catch:{ all -> 0x0398 }
            goto L_0x039c
        L_0x0398:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x039d }
        L_0x039c:
            throw r1     // Catch:{ all -> 0x039d }
        L_0x039d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x03a2 }
            goto L_0x03a6
        L_0x03a2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03a7 }
        L_0x03a6:
            throw r1     // Catch:{ all -> 0x03a7 }
        L_0x03a7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03a7 }
            throw r0
        L_0x03aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03ac }
        L_0x03ac:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x03b1 }
            throw r0     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r0 = move-exception
            X.CDX.A00(r8, r1)
            throw r0
        L_0x03b8:
            r1 = move-exception
            if (r5 == 0) goto L_0x03c3
            r5.close()     // Catch:{ all -> 0x03bf }
            goto L_0x03c3
        L_0x03bf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03c4 }
        L_0x03c3:
            throw r1     // Catch:{ all -> 0x03c4 }
        L_0x03c4:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x03c9 }
            throw r1
        L_0x03c9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67452zo.Bqh():void");
    }

    public void Bqi() {
        AnonymousClass11P r4 = this.A07;
        AnonymousClass122 r5 = this.A09;
        this.A0A.CGF(new AnonymousClass3CE(this.A01, this.A08, r4, r5, 2, C17890vO.A03(this.A00.A04(AnonymousClass18O.A1M))));
    }

    public C67452zo(AnonymousClass18O r2, AnonymousClass1SI r3, C26811To r4, C26371Rw r5, C25851Pw r6, AnonymousClass1TR r7, AnonymousClass1S0 r8, AnonymousClass11P r9, C19830z4 r10, AnonymousClass122 r11, AnonymousClass10I r12) {
        C18070vi.A0w(r9, r12, r2, r4, r8);
        C18070vi.A0x(r11, r5, r10, r7, r3);
        C18070vi.A0d(r6, 11);
        this.A07 = r9;
        this.A0A = r12;
        this.A00 = r2;
        this.A02 = r4;
        this.A06 = r8;
        this.A09 = r11;
        this.A03 = r5;
        this.A08 = r10;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
    }
}
