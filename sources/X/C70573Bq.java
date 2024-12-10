package X;

/* renamed from: X.3Bq  reason: invalid class name and case insensitive filesystem */
public class C70573Bq implements Runnable {
    public final int A00;
    public final Object A01;

    public C70573Bq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0431, code lost:
        if (r0.A0R() != X.C179839Kc.A0C) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07c8, code lost:
        if (r6 != null) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0856, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x085a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        r4.setResult(r3, r2.putExtra(r1, r0));
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0c75, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0c78, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0d85, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0d89, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0d8c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0d8d, code lost:
        X.CDX.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0d90, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0dfe, code lost:
        r1 = new X.C96994ok(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0e14, code lost:
        r2.notifyAllObservers(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0e17, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024b, code lost:
        r8 = (X.AnonymousClass21V) r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b9 A[LOOP:3: B:114:0x02b3->B:116:0x02b9, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r1 = r28
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0d74;
                case 1: goto L_0x0d6c;
                case 2: goto L_0x0d64;
                case 3: goto L_0x0d5b;
                case 4: goto L_0x07fc;
                case 5: goto L_0x0e04;
                case 6: goto L_0x0d53;
                case 7: goto L_0x0d4b;
                case 8: goto L_0x07eb;
                case 9: goto L_0x06d1;
                case 10: goto L_0x06bb;
                case 11: goto L_0x06a1;
                case 12: goto L_0x0d43;
                case 13: goto L_0x0007;
                case 14: goto L_0x0685;
                case 15: goto L_0x0007;
                case 16: goto L_0x0d37;
                case 17: goto L_0x0d2f;
                case 18: goto L_0x0d27;
                case 19: goto L_0x0d1a;
                case 20: goto L_0x064c;
                case 21: goto L_0x05fb;
                case 22: goto L_0x05b8;
                case 23: goto L_0x0d12;
                case 24: goto L_0x0536;
                case 25: goto L_0x0d06;
                case 26: goto L_0x0cfe;
                case 27: goto L_0x0520;
                case 28: goto L_0x0cf6;
                case 29: goto L_0x0509;
                case 30: goto L_0x0cea;
                case 31: goto L_0x02eb;
                case 32: goto L_0x0cdd;
                case 33: goto L_0x02d8;
                case 34: goto L_0x02c4;
                case 35: goto L_0x0115;
                case 36: goto L_0x006a;
                case 37: goto L_0x0c9c;
                case 38: goto L_0x0c93;
                case 39: goto L_0x0c85;
                case 40: goto L_0x0c79;
                case 41: goto L_0x0c71;
                case 42: goto L_0x0c4f;
                case 43: goto L_0x0042;
                case 44: goto L_0x0863;
                case 45: goto L_0x085b;
                case 46: goto L_0x0839;
                case 47: goto L_0x0df7;
                case 48: goto L_0x002c;
                case 49: goto L_0x0def;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r1.A01
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = 0
            java.lang.String r0 = "CropImage/activityRes/fail/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "not-a-image"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889970(0x7f120f32, float:1.9414619E38)
        L_0x0021:
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r4.setResult(r3, r0)
            r4.finish()
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r0 = r1.A01
            X.1aY r0 = (X.AnonymousClass1aY) r0
            X.0zA r1 = r0.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002b
            r1.A03()
            java.lang.String r0 = "afterRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x0042:
            java.lang.Object r2 = r1.A01
            X.1RE r2 = (X.AnonymousClass1RE) r2
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RF r1 = r2.A00
            boolean r0 = X.AnonymousClass1RF.A01(r1)
            if (r0 != 0) goto L_0x002b
            boolean r0 = X.AnonymousClass1RF.A03(r1)
            if (r0 != 0) goto L_0x002b
            r0 = 1
            r1.A02 = r0
            X.11U r0 = r1.A01
            r0.A02()
            X.11U r0 = r1.A00
            r0.A02()
            X.AnonymousClass1RE.A00(r2)
            return
        L_0x006a:
            java.lang.Object r4 = r1.A01
            X.1Wb r4 = (X.C27431Wb) r4
            X.1DK r0 = r4.A0M
            java.lang.String r1 = "message_fts"
            X.1a4 r10 = r0.A01(r1)
            if (r10 == 0) goto L_0x002b
            boolean r0 = r10.A0D()
            if (r0 != 0) goto L_0x00e9
            X.2F3 r7 = new X.2F3
            r7.<init>()
            java.lang.String r0 = "MessageStoreBackup/ftsMigration"
            X.1Ez r9 = new X.1Ez
            r9.<init>((java.lang.String) r0)
            java.util.HashSet r5 = X.C17880vN.A12()
            r5.add(r1)
            r0 = 1
            X.1pX[] r3 = new X.C37431pX[r0]
            X.1Vz r2 = r4.A06
            X.11P r1 = r4.A09
            X.2yc r0 = new X.2yc
            r0.<init>(r2, r1)
            r8 = 0
            r3[r8] = r0
            X.2i2 r2 = new X.2i2
            r2.<init>(r3)
            X.1DN r1 = r4.A0L
            r0 = 7
            boolean r0 = r1.A05(r2, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
            X.1Rp r3 = r4.A0V
            java.lang.String r2 = "fts_migration_elapsed_time_in_ms"
            r0 = 0
            java.lang.String r5 = r3.A0K(r2)
            long r5 = X.C20099A7c.A04(r5, r0)
            boolean r0 = r10.A0D()
            if (r0 == 0) goto L_0x010b
            X.00H r0 = r4.A0a
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            r0.A0B(r8)
            long r0 = r9.A02()
            long r0 = r0 + r5
            long r0 = X.C17880vN.A04(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A01 = r0
            X.18K r0 = r4.A0P
            r0.CC7(r7)
            r0 = 0
        L_0x00e6:
            X.C26301Rp.A04(r3, r2, r0)
        L_0x00e9:
            boolean r0 = r10.A0D()
            if (r0 == 0) goto L_0x002b
            X.00H r0 = r4.A0a
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            android.content.SharedPreferences r0 = r0.A07()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "backup_restore_state"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "interface_gdrive_backup_frequency"
            X.C17880vN.A1B(r1, r0)
            return
        L_0x010b:
            long r0 = r9.A02()
            long r5 = r5 + r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            goto L_0x00e6
        L_0x0115:
            java.lang.Object r5 = r1.A01
            X.354 r5 = (X.AnonymousClass354) r5
            X.1ha r10 = r5.A05
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.A03
            r0 = 0
            r6 = 1
            boolean r0 = r1.compareAndSet(r0, r6)
            if (r0 == 0) goto L_0x01cb
            X.1hW r3 = r10.A01
            X.1hV r0 = r3.A01
            r7 = 100
            X.1Cd r0 = r0.A01
            X.1at r8 = r0.get()
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d9d }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0d9d }
            java.lang.String r2 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE transferred = 0 AND direct_path IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL  ORDER BY message_row_id DESC  LIMIT ? "
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0d9d }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0d9d }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0d9d }
            java.lang.String r0 = "GET_MMS_THUMBNAIL_METADATA_TO_RETRY"
            android.database.Cursor r2 = r4.A0A(r2, r0, r1)     // Catch:{ all -> 0x0d9d }
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x0d91 }
            r11.<init>()     // Catch:{ all -> 0x0d91 }
            java.lang.String r4 = "message_row_id"
            int r1 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0d91 }
        L_0x0152:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0d91 }
            if (r0 == 0) goto L_0x015c
            X.C17900vP.A0K(r2, r11, r1)     // Catch:{ all -> 0x0d91 }
            goto L_0x0152
        L_0x015c:
            r2.close()     // Catch:{ all -> 0x0d9d }
            r8.close()
            X.0ve r2 = r3.A02
            r1 = 9584(0x2570, float:1.343E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01a8
            X.1hU r0 = r3.A00
            X.1Cd r0 = r0.A01
            X.1at r9 = r0.get()
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d8a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0d8a }
            java.lang.String r2 = "\n        SELECT message_row_id\n        FROM  mms_metadata\n        WHERE \n            transferred = 0\n            AND \n            direct_path IS NOT NULL\n            AND \n            enc_thumb_hash IS NOT NULL\n            AND \n            media_key IS NOT NULL\n            AND \n            enc_thumb_hash IS NOT NULL\n            AND \n            media_key IS NOT NULL \n        ORDER BY message_row_id DESC \n        LIMIT ?\n        "
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0d8a }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0d8a }
            java.lang.String r0 = "GET_MMS_METADATA_TO_RETRY"
            android.database.Cursor r8 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0d8a }
            java.util.LinkedHashSet r7 = X.C17880vN.A14()     // Catch:{ all -> 0x0d83 }
            int r6 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0d83 }
        L_0x0190:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0d83 }
            if (r0 == 0) goto L_0x01a4
            r3 = -1
            long r1 = X.AnonymousClass1Eu.A02(r8, r6, r3)     // Catch:{ all -> 0x0d83 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            X.C17880vN.A1R(r7, r1)     // Catch:{ all -> 0x0d83 }
            goto L_0x0190
        L_0x01a4:
            r8.close()     // Catch:{ all -> 0x0d8a }
            goto L_0x01ab
        L_0x01a8:
            X.1Om r7 = X.C25511Om.A00
            goto L_0x01ae
        L_0x01ab:
            r9.close()
        L_0x01ae:
            java.util.LinkedHashSet r0 = X.C17880vN.A14()
            r0.addAll(r11)
            r0.addAll(r7)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.addAll(r0)
            r1.size()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            X.C32681ha.A01(r10, r1, r0)
        L_0x01cb:
            X.CYy r0 = r5.A03
            int r0 = r0.A00()
            if (r0 == 0) goto L_0x002b
            X.1ST r6 = r5.A02
            X.11P r0 = r5.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r2
            r7 = 32
            r12 = 0
            X.1Ez r4 = new X.1Ez
            r4.<init>((boolean) r12)
            java.lang.String r2 = "msgstore/getRetryAutodownloadMessages"
            r4.A05(r2)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1NJ r2 = r6.A09
            X.1Cd r2 = r2.A02
            X.1at r10 = r2.get()
            r2 = r10
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0db5 }
            X.1Ev r9 = r2.A02     // Catch:{ all -> 0x0db5 }
            java.lang.String r8 = "SELECT sort_id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0db5 }
            X.C17880vN.A1U(r2, r12, r0)     // Catch:{ all -> 0x0db5 }
            java.lang.String r0 = "GET_SORT_ID_BY_TIMESTAMP"
            android.database.Cursor r2 = r9.A0A(r8, r0, r2)     // Catch:{ all -> 0x0db5 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0da9 }
            if (r0 == 0) goto L_0x021a
            java.lang.String r0 = "sort_id"
            long r0 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0da9 }
            goto L_0x021c
        L_0x021a:
            r0 = 0
        L_0x021c:
            r2.close()     // Catch:{ all -> 0x0db5 }
            r10.close()
            r2 = 1
            X.1Cd r8 = r6.A08     // Catch:{ IllegalStateException -> 0x0283, SQLiteDatabaseCorruptException -> 0x028a, SQLiteDiskIOException -> 0x0da2 }
            X.1at r11 = r8.get()     // Catch:{ IllegalStateException -> 0x0283, SQLiteDatabaseCorruptException -> 0x028a, SQLiteDiskIOException -> 0x0da2 }
            r8 = r11
            X.1av r8 = (X.C28801av) r8     // Catch:{ all -> 0x0279 }
            X.1Ev r10 = r8.A02     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = X.C51012Wq.A0H     // Catch:{ all -> 0x0279 }
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ all -> 0x0279 }
            X.C17880vN.A1U(r8, r12, r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "GET_NOT_DOWNLOADED_MEDIA_MESSAGES_SQL"
            android.database.Cursor r9 = r10.A0A(r9, r0, r8)     // Catch:{ all -> 0x0279 }
        L_0x023b:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x0266
            X.00H r0 = r6.A0C     // Catch:{ all -> 0x026d }
            X.206 r8 = X.AnonymousClass1W6.A00(r9, r0)     // Catch:{ all -> 0x026d }
            boolean r0 = r8 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x0260
            X.21V r8 = (X.AnonymousClass21V) r8     // Catch:{ all -> 0x026d }
            X.2rc r1 = r8.A02     // Catch:{ all -> 0x026d }
            if (r1 == 0) goto L_0x0260
            boolean r0 = r1.A0V     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x0260
            boolean r0 = r1.A0f     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x0260
            boolean r0 = r1.A0Q     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x0260
            r3.add(r8)     // Catch:{ all -> 0x026d }
        L_0x0260:
            int r0 = r3.size()     // Catch:{ all -> 0x026d }
            if (r0 < r7) goto L_0x023b
        L_0x0266:
            r9.close()     // Catch:{ all -> 0x0279 }
            r11.close()     // Catch:{ IllegalStateException -> 0x0283, SQLiteDatabaseCorruptException -> 0x028a, SQLiteDiskIOException -> 0x0da2 }
            goto L_0x0293
        L_0x026d:
            r1 = move-exception
            if (r9 == 0) goto L_0x0278
            r9.close()     // Catch:{ all -> 0x0274 }
            goto L_0x0278
        L_0x0274:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0279 }
        L_0x0278:
            throw r1     // Catch:{ all -> 0x0279 }
        L_0x0279:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x027e }
            goto L_0x0282
        L_0x027e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x0283, SQLiteDatabaseCorruptException -> 0x028a, SQLiteDiskIOException -> 0x0da2 }
        L_0x0282:
            throw r1     // Catch:{ IllegalStateException -> 0x0283, SQLiteDatabaseCorruptException -> 0x028a, SQLiteDiskIOException -> 0x0da2 }
        L_0x0283:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0293
        L_0x028a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r6.A07
            r0.A03()
        L_0x0293:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages "
            X.C17890vO.A14(r0, r2, r3)
            java.lang.String r0 = " | time spent:"
            r2.append(r0)
            long r0 = r4.A02()
            X.C17890vO.A16(r2, r0)
            X.11E r1 = r5.A00
            r0 = 1
            int r4 = r1.A03(r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x02b3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            X.21V r2 = X.C17880vN.A0b(r3)
            X.1j3 r1 = r5.A04
            r0 = 1
            X.C33581j3.A00(r1, r2, r4, r0)
            goto L_0x02b3
        L_0x02c4:
            java.lang.Object r1 = r1.A01
            X.354 r1 = (X.AnonymousClass354) r1
            X.CYy r0 = r1.A03
            int r0 = r0.A00()
            if (r0 == 0) goto L_0x002b
            X.1j3 r1 = r1.A04
            X.2Ql r0 = X.C49432Ql.OFFLINE_RESUME_MEDIA_AUTO
            r1.A02(r0)
            return
        L_0x02d8:
            java.lang.Object r1 = r1.A01
            X.ARA r1 = (X.ARA) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x002b
            X.A1Q r0 = r1.A03
            X.1KB r0 = r0.A02
            r0.A04()
            r0 = 0
            r1.A00 = r0
            return
        L_0x02eb:
            java.lang.Object r3 = r1.A01
            X.1hb r3 = (X.C32691hb) r3
            X.1hG r9 = r3.A09
            java.lang.Object r8 = r9.A0M
            monitor-enter(r8)
            java.util.ArrayList r20 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0de6 }
            X.1Cd r0 = r9.A0B     // Catch:{ all -> 0x0de6 }
            X.1au r19 = r0.A05()     // Catch:{ all -> 0x0de6 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0ddc }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x0ddc }
            java.lang.String r12 = "SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data, reporting_token, reporting_tag, reporting_version  FROM message_orphaned_edit"
            java.lang.String r7 = "GET_ORPHANED_EDITS_SQL"
            android.database.Cursor r6 = X.C23141Ev.A00(r13, r12, r7)     // Catch:{ all -> 0x0ddc }
            X.1Le r0 = r9.A0D     // Catch:{ all -> 0x0dd0 }
            java.util.Map r18 = r0.A0C()     // Catch:{ all -> 0x0dd0 }
            X.11P r0 = r9.A02     // Catch:{ all -> 0x0dd0 }
            long r16 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0dd0 }
            r5 = 0
            r4 = 0
            r2 = 0
        L_0x031b:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0dd0 }
            if (r0 == 0) goto L_0x0396
            X.2gg r11 = r9.A01(r6)     // Catch:{ all -> 0x0dd0 }
            if (r11 == 0) goto L_0x038c
            int r1 = r11.A01     // Catch:{ all -> 0x0dd0 }
            if (r1 != 0) goto L_0x0369
            java.lang.String r14 = r11.A07     // Catch:{ all -> 0x0dd0 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0dd0 }
            if (r0 != 0) goto L_0x0394
            com.whatsapp.jid.UserJid r15 = r11.A04     // Catch:{ all -> 0x0dd0 }
            if (r15 != 0) goto L_0x035d
            X.205 r10 = r11.A05     // Catch:{ all -> 0x0dd0 }
            long r0 = r11.A02     // Catch:{ all -> 0x0dd0 }
            X.23Q r2 = new X.23Q     // Catch:{ all -> 0x0dd0 }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x0dd0 }
        L_0x0340:
            r2.A01 = r14     // Catch:{ all -> 0x0dd0 }
            X.1BI r0 = r11.A03     // Catch:{ all -> 0x0dd0 }
            r2.A0d(r0)     // Catch:{ all -> 0x0dd0 }
            int r0 = r11.A00     // Catch:{ all -> 0x0dd0 }
            r2.A0B = r0     // Catch:{ all -> 0x0dd0 }
            r0 = -1
            r2.A10 = r0     // Catch:{ all -> 0x0dd0 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0dd0 }
            if (r0 == 0) goto L_0x0356
            r0 = 1
            r2.A19 = r0     // Catch:{ all -> 0x0dd0 }
        L_0x0356:
            r0 = 0
            X.C32481hG.A00(r9, r2, r0, r0)     // Catch:{ all -> 0x0dd0 }
            int r5 = r5 + 1
            goto L_0x0394
        L_0x035d:
            X.205 r10 = r11.A05     // Catch:{ all -> 0x0dd0 }
            long r0 = r11.A02     // Catch:{ all -> 0x0dd0 }
            X.23O r2 = new X.23O     // Catch:{ all -> 0x0dd0 }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x0dd0 }
            r2.A00 = r15     // Catch:{ all -> 0x0dd0 }
            goto L_0x0340
        L_0x0369:
            r0 = 1
            if (r1 != r0) goto L_0x0394
            long r0 = r11.A02     // Catch:{ all -> 0x0dd0 }
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 + r14
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0394
            X.1BI r0 = r11.A03     // Catch:{ all -> 0x0dd0 }
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)     // Catch:{ all -> 0x0dd0 }
            if (r1 == 0) goto L_0x0394
            r0 = r18
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0dd0 }
            if (r0 == 0) goto L_0x0394
            r0 = r20
            r0.add(r11)     // Catch:{ all -> 0x0dd0 }
            goto L_0x0392
        L_0x038c:
            java.lang.String r0 = "msgstore/edit/resolve-orphaned-edits error reading orphaned message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0dd0 }
            goto L_0x0394
        L_0x0392:
            int r4 = r4 + 1
        L_0x0394:
            r2 = 1
            goto L_0x031b
        L_0x0396:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0dd0 }
            java.lang.String r0 = "msgstore/edit/resolve-orphaned-edits orphaned="
            r1.append(r0)     // Catch:{ all -> 0x0dd0 }
            r1.append(r5)     // Catch:{ all -> 0x0dd0 }
            java.lang.String r0 = " delayed="
            r1.append(r0)     // Catch:{ all -> 0x0dd0 }
            r1.append(r4)     // Catch:{ all -> 0x0dd0 }
            java.lang.String r0 = " deleteNeeded="
            X.C17900vP.A0n(r0, r1, r2)     // Catch:{ all -> 0x0dd0 }
            if (r2 == 0) goto L_0x03cc
            java.lang.String r5 = "message_orphaned_edit"
            java.lang.String r4 = "message_type IN ( ?, ? )"
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0dd0 }
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0dd0 }
            r2[r1] = r0     // Catch:{ all -> 0x0dd0 }
            r1 = 1
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0dd0 }
            r2[r1] = r0     // Catch:{ all -> 0x0dd0 }
            java.lang.String r0 = "EditMessageStore/DELETE_ORPHANED_EDITS_SQL"
            r13.A04(r5, r4, r0, r2)     // Catch:{ all -> 0x0dd0 }
        L_0x03cc:
            r6.close()     // Catch:{ all -> 0x0ddc }
            r19.close()     // Catch:{ all -> 0x0de6 }
            monitor-exit(r8)     // Catch:{ all -> 0x0de6 }
            X.0ve r2 = r3.A0Q
            r1 = 2189(0x88d, float:3.067E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x04b0
            X.1Cd r0 = r3.A0I
            X.1au r11 = r0.A05()
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0dc6 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0dc6 }
            android.database.Cursor r4 = X.C23141Ev.A00(r0, r12, r7)     // Catch:{ all -> 0x0dc6 }
            r4.getCount()     // Catch:{ all -> 0x0dba }
        L_0x03f1:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0dba }
            if (r0 == 0) goto L_0x04aa
            X.2gg r5 = r9.A01(r4)     // Catch:{ all -> 0x0dba }
            if (r5 == 0) goto L_0x03f1
            int r1 = r5.A01     // Catch:{ all -> 0x0dba }
            r0 = 2
            if (r1 != r0) goto L_0x03f1
            X.00H r0 = r3.A0d     // Catch:{ all -> 0x0dba }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0dba }
            X.12N r7 = (X.AnonymousClass12N) r7     // Catch:{ all -> 0x0dba }
            r6 = 0
            byte[] r8 = r5.A08     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.8cr r10 = X.C166418cr.A01(r8)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            int r0 = r10.bitField1_     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            if (r0 != 0) goto L_0x0439
            int r0 = r10.bitField0_     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            if (r0 == 0) goto L_0x0433
            X.8cm r0 = r10.protocolMessage_     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            if (r0 != 0) goto L_0x042b
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
        L_0x042b:
            X.9Kc r1 = r0.A0R()     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.9Kc r0 = X.C179839Kc.MESSAGE_EDIT     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            if (r1 == r0) goto L_0x0439
        L_0x0433:
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Invalid edited orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            goto L_0x03f1
        L_0x0439:
            X.205 r2 = r5.A05     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            long r0 = r5.A02     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.9p8 r2 = X.C196699vU.A00(r10, r2, r0)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            r0 = 1
            r2.A00 = r0     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.1BI r1 = r5.A03     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            r2.A02 = r1     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.AVz r0 = r5.A06     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            r2.A01(r0, r8)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.A6d r0 = r2.A00()     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            X.206 r6 = r7.A00(r0)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            r6.A0d(r1)     // Catch:{ 1PN -> 0x04a2, 1hc -> 0x0459 }
            goto L_0x0461
        L_0x0459:
            r1 = move-exception
            java.lang.String r0 = "EditedMessageManager/buildFMessageFromOrphanEdit/Bad e2e message found "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0dba }
            if (r6 == 0) goto L_0x03f1
        L_0x0461:
            r1 = 0
            r0 = 1
            X.206 r0 = X.C32691hb.A00(r3, r6, r1, r0)     // Catch:{ IllegalArgumentException -> 0x048e, 1R1 -> 0x0475, 1hd -> 0x046d }
            if (r0 == 0) goto L_0x03f1
            r3.A02(r6)     // Catch:{ IllegalArgumentException -> 0x048e, 1R1 -> 0x0475, 1hd -> 0x046d }
            goto L_0x03f1
        L_0x046d:
            r1 = move-exception
            java.lang.String r0 = "EditedMessageManager/resolveOrphanedEdits/message dropped due to BadE2eMessageException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0dba }
            goto L_0x03f1
        L_0x0475:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0dba }
            java.lang.String r0 = "EditedMessageManager/resolveOrphanedEdits/edit resolution resulted in CloningNotSupportedException for :"
            r1.append(r0)     // Catch:{ all -> 0x0dba }
            X.205 r0 = r5.A05     // Catch:{ all -> 0x0dba }
            r1.append(r0)     // Catch:{ all -> 0x0dba }
            java.lang.String r0 = " and message type "
            X.AnonymousClass206.A07(r6, r0, r1)     // Catch:{ all -> 0x0dba }
            X.C17880vN.A1M(r1, r2)     // Catch:{ all -> 0x0dba }
            goto L_0x03f1
        L_0x048e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0dba }
            java.lang.String r0 = "EditedMessageManager/resolveOrphanedEdits/edit resolution resulted in IllegalArgumentException for :"
            r1.append(r0)     // Catch:{ all -> 0x0dba }
            X.205 r0 = r5.A05     // Catch:{ all -> 0x0dba }
            r1.append(r0)     // Catch:{ all -> 0x0dba }
            X.C17880vN.A1M(r1, r2)     // Catch:{ all -> 0x0dba }
            goto L_0x03f1
        L_0x04a2:
            r1 = move-exception
            java.lang.String r0 = "EditedMessageManager/getMessageAddOnFromOrphan/Failed to parse orphan message "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0dba }
            goto L_0x03f1
        L_0x04aa:
            r4.close()     // Catch:{ all -> 0x0dc6 }
            r11.close()
        L_0x04b0:
            java.util.Iterator r7 = r20.iterator()
        L_0x04b4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r6 = r7.next()
            X.2gg r6 = (X.C55972gg) r6
            X.1hR r5 = r3.A02
            r8 = 0
            X.205 r0 = r6.A05
            X.1BI r10 = r0.A00
            X.C17960vV.A07(r10)
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            java.lang.String r2 = r0.A01
            X.C18070vi.A0d(r2, r4)
            long r0 = r6.A02
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r4)
            X.1BI r9 = r6.A03
            X.C17960vV.A07(r9)
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r11 = r8
            r20 = r2
            X.2sw r1 = X.C50342Ub.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 7
            r1.A01 = r0
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0H = r0
            r15 = 1
            r9 = r5
            r10 = r1
            X.2kG r1 = r9.A00(r10, r11, r12, r13, r14, r15)
            r0 = 13
            r1.A00(r0)
            goto L_0x04b4
        L_0x0509:
            java.lang.Object r5 = r1.A01
            X.9Bb r5 = (X.C177909Bb) r5
            long r3 = r5.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002b
            X.8yM r2 = r5.A09
            r0 = 25
            X.AWq r1 = new X.AWq
            r1.<init>(r0)
            goto L_0x0e14
        L_0x0520:
            java.lang.Object r0 = r1.A01
            X.7Hs r0 = (X.C144547Hs) r0
            X.6zz r0 = r0.A08
            X.736 r2 = r0.A07
            X.4VT r0 = r2.A01
            if (r0 == 0) goto L_0x002b
            r1 = 0
            X.A2k r0 = r0.A02
            r0.A04(r1)
            r0 = 0
            r2.A01 = r0
            return
        L_0x0536:
            java.lang.Object r3 = r1.A01
            X.2l6 r3 = (X.C58692l6) r3
            X.0z4 r2 = r3.A03
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r2)
            java.lang.String r0 = "tos_2016_opt_out_state"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x054d
            r2.A2V()
            return
        L_0x054d:
            r9 = 1
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x002b
            X.0ve r2 = r3.A05
            r1 = 1624(0x658, float:2.276E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002b
            r3.A00 = r9
            X.2aB r4 = r3.A04
            X.1DT r2 = new X.1DT
            r2.<init>()
            X.00H r7 = r4.A00
            java.lang.String r10 = X.C17890vO.A0T(r7)
            java.lang.String r1 = "accept"
            r0 = 0
            X.1ca r8 = new X.1ca
            r8.<init>(r1, r0)
            r0 = 4
            X.1MD[] r6 = new X.AnonymousClass1MD[r0]
            java.lang.String r5 = "to"
            X.8v4 r0 = X.C173438v4.A00
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r5)
            r0 = 0
            r6[r0] = r1
            java.lang.String r0 = "id"
            X.C17880vN.A1Q(r0, r10, r6, r9)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C17890vO.A12(r1, r0, r6)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.1ca r9 = X.C29621ca.A01(r8, r1, r0, r6)
            X.1OZ r7 = X.C17880vN.A0U(r7)
            r0 = 0
            X.37G r8 = new X.37G
            r8.<init>(r4, r2, r0)
            r12 = 0
            r11 = 322(0x142, float:4.51E-43)
            r7.A0J(r8, r9, r10, r11, r12)
            r1 = 13
            X.7AO r0 = new X.7AO
            r0.<init>(r3, r1)
            r2.A0C(r0)
            return
        L_0x05b8:
            java.lang.Object r2 = r1.A01
            X.4VR r2 = (X.AnonymousClass4VR) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x002b
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x05ec
            X.3Zj r2 = r2.A0A
            X.C17960vV.A05(r2)
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x002b
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x002b
            r0 = 4
            X.4eR r1 = new X.4eR
            r1.<init>(r2, r0)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x05ec:
            r0 = 3
            if (r1 != r0) goto L_0x002b
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x002b
            com.whatsapp.ctwa.icebreaker.IceBreakerPickerView r0 = r2.A09
            r0.A06()
            return
        L_0x05fb:
            java.lang.Object r2 = r1.A01
            X.4VR r2 = (X.AnonymousClass4VR) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x002b
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x0638
            X.3Zj r3 = r2.A0A
            X.C17960vV.A05(r3)
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x002b
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x002b
            int r1 = r3.getHeight()
            if (r1 <= 0) goto L_0x0de9
            r0 = 1
            r3.A0E = r0
            X.3OU r2 = new X.3OU
            r2.<init>(r3, r1, r0)
            r1 = 9
            X.3c2 r0 = new X.3c2
            r0.<init>(r3, r1)
            r2.setAnimationListener(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0638:
            r0 = 3
            if (r1 != r0) goto L_0x002b
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x002b
            com.whatsapp.ctwa.icebreaker.IceBreakerPickerView r0 = r2.A09
            r2 = 0
            X.4ZT r1 = r0.A02
            X.4DV r0 = r0.A05
            r1.A02(r0, r2)
            return
        L_0x064c:
            java.lang.Object r0 = r1.A01
            X.1eS r0 = (X.C30751eS) r0
            X.00H r7 = r0.A04
            java.lang.Object r0 = r7.get()
            X.A5S r0 = (X.A5S) r0
            java.util.List r0 = r0.A05()
            java.util.Iterator r6 = r0.iterator()
        L_0x0660:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r5 = r6.next()
            X.8oR r5 = (X.AnonymousClass8oR) r5
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.A01
            long r3 = r3 - r0
            long r1 = X.AnonymousClass8oR.A0E
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0660
            java.lang.Object r1 = r7.get()
            X.A5S r1 = (X.A5S) r1
            com.whatsapp.jid.UserJid r0 = r5.A00
            r1.A06(r0)
            goto L_0x0660
        L_0x0685:
            java.lang.Object r4 = r1.A01
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = 0
            java.lang.String r0 = "CropImage/activityRes/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "error-oom"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889999(0x7f120f4f, float:1.9414677E38)
            goto L_0x0021
        L_0x06a1:
            java.lang.Object r0 = r1.A01
            X.196 r0 = (X.AnonymousClass196) r0
            X.0vS r0 = r0.A06
            java.io.File r1 = r0.A01()
            java.lang.String r0 = "crash_counter"
            java.io.File r1 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x002b
            r1.delete()
            return
        L_0x06bb:
            java.lang.Object r2 = r1.A01
            X.192 r2 = (X.AnonymousClass192) r2
            X.11J r0 = r2.A00
            if (r0 != 0) goto L_0x002b
            r0 = 0
            X.AQ5 r1 = new X.AQ5
            r1.<init>(r2, r0)
            r2.A00 = r1
            X.11E r0 = r2.A05
            r0.registerObserver(r1)
            return
        L_0x06d1:
            java.lang.Object r13 = r1.A01
            X.192 r13 = (X.AnonymousClass192) r13
            java.io.File r0 = X.AnonymousClass192.A00(r13)
            java.io.File[] r6 = r0.listFiles()
            java.lang.String r5 = ".crash"
            r4 = 0
            if (r6 == 0) goto L_0x07af
            int r3 = r6.length
            r2 = 0
        L_0x06e4:
            if (r2 >= r3) goto L_0x07af
            r12 = r6[r2]
            r12.getAbsolutePath()
            java.lang.String r0 = r12.getName()
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0779
            byte[] r1 = X.AnonymousClass1EW.A00(r12)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x07a5 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x07a5 }
            org.json.JSONObject r8 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = "attachments"
            org.json.JSONObject r10 = r8.optJSONObject(r0)     // Catch:{ Exception -> 0x07a5 }
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ Exception -> 0x07a5 }
            if (r10 != 0) goto L_0x074a
            java.lang.String r0 = "attachmentParam"
            java.lang.String r1 = r8.optString(r0)     // Catch:{ Exception -> 0x07a5 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x07a5 }
            if (r0 != 0) goto L_0x0723
            java.lang.String r0 = "attachmentPath"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x07a5 }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x07a5 }
        L_0x0723:
            java.lang.String r0 = "logFilePath"
            java.lang.String r14 = r8.getString(r0)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = "fromParam"
            java.lang.String r15 = r8.getString(r0)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = "forcedUpload"
            boolean r18 = r8.getBoolean(r0)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = "detailedException"
            boolean r19 = r8.getBoolean(r0)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = "tagsString"
            java.lang.String r16 = r8.getString(r0)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = "timeMillis"
            long r10 = r8.getLong(r0)     // Catch:{ Exception -> 0x07a5 }
            goto L_0x0760
        L_0x074a:
            java.util.Iterator r9 = r10.keys()     // Catch:{ Exception -> 0x07a5 }
        L_0x074e:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x07a5 }
            if (r0 == 0) goto L_0x0723
            java.lang.String r1 = X.C17880vN.A0v(r9)     // Catch:{ Exception -> 0x07a5 }
            java.lang.String r0 = r10.getString(r1)     // Catch:{ Exception -> 0x07a5 }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x07a5 }
            goto L_0x074e
        L_0x0760:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.HOURS
            r0 = 2
            long r0 = r8.toMillis(r0)
            long r10 = r10 + r0
            long r8 = java.lang.System.currentTimeMillis()
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x077d
            r17 = r7
            boolean r0 = X.AnonymousClass192.A09(r13, r14, r15, r16, r17, r18, r19)
            if (r0 != 0) goto L_0x077d
        L_0x0779:
            int r2 = r2 + 1
            goto L_0x06e4
        L_0x077d:
            java.io.File r0 = new java.io.File
            r0.<init>(r14)
            r0.delete()
            java.util.Iterator r7 = X.C17890vO.A0j(r7)
        L_0x0789:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x07ab
            java.lang.String r0 = X.C17880vN.A0v(r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = r1.getParentFile()
            r1.delete()
            if (r0 == 0) goto L_0x0789
            r0.delete()
            goto L_0x0789
        L_0x07a5:
            r1 = move-exception
            java.lang.String r0 = "app/CrashLogs/deserializeCrashData: could not deserialize stored crash data"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x07ab:
            r12.delete()
            goto L_0x0779
        L_0x07af:
            java.io.File r0 = X.AnonymousClass192.A00(r13)
            java.io.File[] r6 = r0.listFiles()
            if (r6 == 0) goto L_0x07bc
            int r0 = r6.length
            if (r0 != 0) goto L_0x07ca
        L_0x07bc:
            android.os.Handler r2 = r13.A01
            r1 = 8
            X.3Bq r0 = new X.3Bq
            r0.<init>(r13, r1)
            r2.post(r0)
            if (r6 == 0) goto L_0x07e3
        L_0x07ca:
            int r3 = r6.length
            r2 = 0
        L_0x07cc:
            if (r4 >= r3) goto L_0x07e1
            r1 = r6[r4]
            java.lang.String r0 = r1.getName()
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x07de
            r1.getAbsolutePath()
            r2 = 1
        L_0x07de:
            int r4 = r4 + 1
            goto L_0x07cc
        L_0x07e1:
            if (r2 != 0) goto L_0x002b
        L_0x07e3:
            java.io.File r0 = X.AnonymousClass192.A00(r13)
            r0.delete()
            return
        L_0x07eb:
            java.lang.Object r2 = r1.A01
            X.192 r2 = (X.AnonymousClass192) r2
            X.11J r1 = r2.A00
            if (r1 == 0) goto L_0x002b
            X.11E r0 = r2.A05
            r0.unregisterObserver(r1)
            r0 = 0
            r2.A00 = r0
            return
        L_0x07fc:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.LockedConversationsActivity r3 = (com.whatsapp.conversationslist.LockedConversationsActivity) r3
            X.1fA r0 = r3.A4b()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0814
            X.1KB r2 = r3.A05
            r1 = 2
        L_0x080b:
            X.3Bq r0 = new X.3Bq
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        L_0x0814:
            X.1fA r0 = r3.A4b()
            X.1CJ r0 = r0.A05
            java.util.HashSet r0 = r0.A01
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x002b
            X.1Hj r0 = r3.A01
            if (r0 == 0) goto L_0x0836
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x002b
            X.1fA r0 = r3.A4b()
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x002b
            X.1KB r2 = r3.A05
            r1 = 3
            goto L_0x080b
        L_0x0836:
            java.lang.String r0 = "activityLifecycleCallbacks"
            goto L_0x0856
        L_0x0839:
            java.lang.Object r0 = r1.A01
            X.2dw r0 = (X.C54312dw) r0
            X.00H r0 = r0.A02
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.12B> r0 = X.AnonymousClass12B.class
            X.11a r0 = r1.A01(r0)
            X.12B r0 = (X.AnonymousClass12B) r0
            X.AnonymousClass12B.A00(r0)
            java.util.Set r0 = r0.A00
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "hostedUserJids"
        L_0x0856:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x085b:
            java.lang.Object r0 = r1.A01
            X.1MM r0 = (X.AnonymousClass1MM) r0
            java.util.Map r0 = r0.A00
            goto L_0x0c75
        L_0x0863:
            java.lang.Object r12 = r1.A01
            X.2xG r12 = (X.C65882xG) r12
            monitor-enter(r12)
            X.11S r0 = r12.A00     // Catch:{ all -> 0x0c4c }
            r27 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r27)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0c4a
            X.1MR r11 = r12.A0B     // Catch:{ all -> 0x0c4c }
            X.11P r0 = r11.A01     // Catch:{ all -> 0x0c4c }
            long r4 = r0.A07()     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            X.0z4 r0 = r12.A06     // Catch:{ all -> 0x0c4c }
            r26 = r0
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r26)     // Catch:{ all -> 0x0c4c }
            java.lang.String r24 = "adv_last_daily_check_ts"
            r0 = r24
            long r0 = X.C17890vO.A05(r1, r0)     // Catch:{ all -> 0x0c4c }
            long r6 = r4 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0c2f
            X.1Cd r0 = r12.A08     // Catch:{ all -> 0x0c4c }
            r0.A06()     // Catch:{ all -> 0x0c4c }
            boolean r0 = r0.A08     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0c4a
            X.11P r0 = r12.A05     // Catch:{ all -> 0x0c4c }
            long r2 = X.AnonymousClass11P.A00(r0)     // Catch:{ all -> 0x0c4c }
            X.0ve r8 = r12.A0C     // Catch:{ all -> 0x0c4c }
            r0 = 730(0x2da, float:1.023E-42)
            X.0vf r7 = X.C18040vf.A02     // Catch:{ all -> 0x0c4c }
            int r1 = X.C18020vd.A00(r7, r8, r0)     // Catch:{ all -> 0x0c4c }
            r0 = 1
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0c4c }
            r0 = 35
            int r6 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0c4c }
            r0 = 731(0x2db, float:1.024E-42)
            int r1 = X.C18020vd.A00(r7, r8, r0)     // Catch:{ all -> 0x0c4c }
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0c4c }
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0c4c }
            int r6 = r6 - r0
            long r0 = (long) r6     // Catch:{ all -> 0x0c4c }
            r6 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r6
            long r16 = r2 - r0
            X.1MQ r13 = r11.A03     // Catch:{ all -> 0x0c4c }
            X.1MN r14 = r13.A02     // Catch:{ all -> 0x0c4c }
            java.util.HashMap r9 = X.C17880vN.A11()     // Catch:{ all -> 0x0c4c }
            java.util.HashMap r8 = X.C17880vN.A11()     // Catch:{ all -> 0x0c4c }
            X.1Cd r0 = r14.A01     // Catch:{ all -> 0x0c4c }
            X.1at r18 = r0.get()     // Catch:{ all -> 0x0c4c }
            r0 = r18
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0c09 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0c09 }
            java.lang.String r6 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type, user_jid_row_id FROM user_device_info WHERE timestamp < ? OR timestamp < expected_timestamp"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0c09 }
            java.lang.String r15 = java.lang.Long.toString(r16)     // Catch:{ all -> 0x0c09 }
            r0 = 0
            r1[r0] = r15     // Catch:{ all -> 0x0c09 }
            java.lang.String r0 = "GET_ALL_USER_ADV_TIMESTAMPS_EXPIRING"
            android.database.Cursor r7 = r7.A0A(r6, r0, r1)     // Catch:{ all -> 0x0c09 }
            java.lang.String r23 = "user_jid_row_id"
            r0 = r23
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0bfd }
        L_0x0908:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0bfd }
            if (r0 == 0) goto L_0x091a
            X.2rW r1 = X.AnonymousClass1MN.A00(r7)     // Catch:{ all -> 0x0bfd }
            java.lang.Long r0 = X.C17890vO.A0M(r7, r6)     // Catch:{ all -> 0x0bfd }
            r8.put(r0, r1)     // Catch:{ all -> 0x0bfd }
            goto L_0x0908
        L_0x091a:
            r7.close()     // Catch:{ all -> 0x0c09 }
            r18.close()     // Catch:{ all -> 0x0c4c }
            X.1DL r6 = r14.A00     // Catch:{ all -> 0x0c4c }
            java.lang.Class<com.whatsapp.jid.UserJid> r22 = com.whatsapp.jid.UserJid.class
            java.util.Set r1 = r8.keySet()     // Catch:{ all -> 0x0c4c }
            r0 = r22
            java.util.HashMap r6 = r6.A0F(r0, r1)     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r8 = X.C17890vO.A0i(r8)     // Catch:{ all -> 0x0c4c }
        L_0x0932:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x094e
            java.util.Map$Entry r7 = X.AnonymousClass000.A16(r8)     // Catch:{ all -> 0x0c4c }
            java.lang.Object r0 = r7.getKey()     // Catch:{ all -> 0x0c4c }
            java.lang.Object r1 = r6.get(r0)     // Catch:{ all -> 0x0c4c }
            if (r1 == 0) goto L_0x0932
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x0c4c }
            r9.put(r1, r0)     // Catch:{ all -> 0x0c4c }
            goto L_0x0932
        L_0x094e:
            X.11S r0 = r13.A00     // Catch:{ all -> 0x0c4c }
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)     // Catch:{ all -> 0x0c4c }
            r9.remove(r1)     // Catch:{ all -> 0x0c4c }
            X.1E2 r0 = r0.A09()     // Catch:{ all -> 0x0c4c }
            r9.remove(r0)     // Catch:{ all -> 0x0c4c }
            if (r1 == 0) goto L_0x096d
            X.1Ln r0 = r13.A03     // Catch:{ all -> 0x0c4c }
            java.util.Set r1 = r0.A0M(r1)     // Catch:{ all -> 0x0c4c }
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x0c4c }
            r0.removeAll(r1)     // Catch:{ all -> 0x0c4c }
        L_0x096d:
            java.util.HashMap r8 = X.C17880vN.A11()     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r18 = X.C17890vO.A0i(r9)     // Catch:{ all -> 0x0c4c }
        L_0x0979:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x09dd
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r18)     // Catch:{ all -> 0x0c4c }
            java.lang.Object r14 = r0.getKey()     // Catch:{ all -> 0x0c4c }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ all -> 0x0c4c }
            java.lang.Object r13 = r0.getValue()     // Catch:{ all -> 0x0c4c }
            X.2rW r13 = (X.C62512rW) r13     // Catch:{ all -> 0x0c4c }
            boolean r0 = X.C22971Dz.A0T(r14)     // Catch:{ all -> 0x0c4c }
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L_0x09d8
            X.1Ln r15 = r12.A09     // Catch:{ all -> 0x0c4c }
            r0 = r14
            X.1E1 r0 = (X.AnonymousClass1E1) r0     // Catch:{ all -> 0x0c4c }
            com.whatsapp.jid.PhoneUserJid r0 = r15.A0D(r0)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x09d8
            java.util.Map r0 = r11.A0B(r0)     // Catch:{ all -> 0x0c4c }
        L_0x09a6:
            int r0 = r0.size()     // Catch:{ all -> 0x0c4c }
            if (r0 <= r1) goto L_0x09ad
            r6 = 1
        L_0x09ad:
            boolean r0 = X.C65882xG.A00(r13, r12, r2)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x09cf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo remove expired user="
            r1.append(r0)     // Catch:{ all -> 0x0c4c }
            r1.append(r14)     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = "; hasCompanion="
            r1.append(r0)     // Catch:{ all -> 0x0c4c }
            r1.append(r6)     // Catch:{ all -> 0x0c4c }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = "adv_expired"
            r8.put(r14, r0)     // Catch:{ all -> 0x0c4c }
        L_0x09cf:
            r10.add(r14)     // Catch:{ all -> 0x0c4c }
            if (r6 != 0) goto L_0x0979
            r7.add(r14)     // Catch:{ all -> 0x0c4c }
            goto L_0x0979
        L_0x09d8:
            java.util.Map r0 = r11.A0B(r14)     // Catch:{ all -> 0x0c4c }
            goto L_0x09a6
        L_0x09dd:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0c4c }
            if (r0 != 0) goto L_0x0bbe
            X.1Nd r0 = r12.A04     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r15 = r0.A0D()     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r6 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r20 = r10.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x09f5:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a3b
            com.whatsapp.jid.UserJid r13 = X.C17880vN.A0T(r20)     // Catch:{ all -> 0x0c4c }
            boolean r0 = r6.contains(r13)     // Catch:{ all -> 0x0c4c }
            if (r0 != 0) goto L_0x09f5
            X.1Ln r0 = r12.A09     // Catch:{ all -> 0x0c4c }
            java.util.Set r14 = r0.A0M(r13)     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r19 = r14.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x0a0f:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a37
            com.whatsapp.jid.UserJid r13 = X.C17880vN.A0T(r19)     // Catch:{ all -> 0x0c4c }
            X.1M9 r0 = r12.A02     // Catch:{ all -> 0x0c4c }
            boolean r18 = r0.A0z(r13)     // Catch:{ all -> 0x0c4c }
            if (r18 != 0) goto L_0x0a33
            boolean r18 = r15.contains(r13)     // Catch:{ all -> 0x0c4c }
            if (r18 != 0) goto L_0x0a33
            X.1E7 r0 = r0.A0E(r13)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a0f
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a0f
        L_0x0a33:
            r6.addAll(r14)     // Catch:{ all -> 0x0c4c }
            goto L_0x09f5
        L_0x0a37:
            r1.addAll(r14)     // Catch:{ all -> 0x0c4c }
            goto L_0x09f5
        L_0x0a3b:
            X.1MZ r15 = r12.A07     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r21 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            X.1MS r0 = r15.A06     // Catch:{ all -> 0x0c4c }
            java.util.Map r0 = r0.A05     // Catch:{ all -> 0x0c4c }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0c4c }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x0a51:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a68
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0c4c }
            X.2tp r0 = (X.C63872tp) r0     // Catch:{ all -> 0x0c4c }
            X.10f r0 = r0.A07()     // Catch:{ all -> 0x0c4c }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0c4c }
            X.C29401cD.A0J(r0, r13)     // Catch:{ all -> 0x0c4c }
            goto L_0x0a51
        L_0x0a68:
            java.util.Set r14 = X.C29431cG.A12(r13)     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r18 = r1.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x0a74:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a8e
            java.lang.Object r1 = r18.next()     // Catch:{ all -> 0x0c4c }
            boolean r0 = r14.contains(r1)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0a8a
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x0c4c }
            goto L_0x0a74
        L_0x0a8a:
            r13.add(r1)     // Catch:{ all -> 0x0c4c }
            goto L_0x0a74
        L_0x0a8e:
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0c4c }
            if (r0 != 0) goto L_0x0b49
            X.1MW r14 = r15.A08     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = ""
            X.C17960vV.A0A(r0, r13)     // Catch:{ all -> 0x0c4c }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x0aa3:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r1 == 0) goto L_0x0ab9
            com.whatsapp.jid.UserJid r1 = X.C17880vN.A0T(r13)     // Catch:{ all -> 0x0c4c }
            long r18 = X.AnonymousClass1MW.A00(r14, r1)     // Catch:{ all -> 0x0c4c }
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x0c4c }
            r0.add(r1)     // Catch:{ all -> 0x0c4c }
            goto L_0x0aa3
        L_0x0ab9:
            java.lang.String[] r1 = X.C19620yd.A0M     // Catch:{ all -> 0x0c4c }
            java.lang.Object[] r13 = r0.toArray(r1)     // Catch:{ all -> 0x0c4c }
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b     // Catch:{ all -> 0x0c4c }
            r0.<init>(r13, r1)     // Catch:{ all -> 0x0c4c }
            java.util.HashSet r20 = X.C17880vN.A12()     // Catch:{ all -> 0x0c4c }
            X.1Cd r1 = r14.A06     // Catch:{ all -> 0x0c4c }
            X.1at r19 = r1.get()     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x0b39 }
        L_0x0ad4:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0b39 }
            if (r0 == 0) goto L_0x0b3f
            java.lang.Object r13 = r18.next()     // Catch:{ all -> 0x0b39 }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x0b39 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0b39 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0b39 }
            r25 = r0
            int r0 = r13.length     // Catch:{ all -> 0x0b39 }
            r15 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0b39 }
            java.lang.String r0 = "SELECT user_jid_row_id FROM group_participant_user WHERE user_jid_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0b39 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r15)     // Catch:{ all -> 0x0b39 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0b39 }
            java.lang.String r15 = "GET_USERS_IN_ANY_GROUP_BY_USER_JIDS_SQL"
            r1 = r25
            android.database.Cursor r13 = r1.A0A(r0, r15, r13)     // Catch:{ all -> 0x0b39 }
            r0 = r23
            int r1 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0b2d }
            java.util.HashSet r15 = X.C17880vN.A12()     // Catch:{ all -> 0x0b2d }
        L_0x0b0d:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0b2d }
            if (r0 == 0) goto L_0x0b17
            X.C17900vP.A0K(r13, r15, r1)     // Catch:{ all -> 0x0b2d }
            goto L_0x0b0d
        L_0x0b17:
            X.1DL r0 = r14.A05     // Catch:{ all -> 0x0b2d }
            r1 = r0
            r0 = r22
            java.util.HashMap r0 = r1.A0F(r0, r15)     // Catch:{ all -> 0x0b2d }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0b2d }
            r0 = r20
            r0.addAll(r1)     // Catch:{ all -> 0x0b2d }
            r13.close()     // Catch:{ all -> 0x0b39 }
            goto L_0x0ad4
        L_0x0b2d:
            r1 = move-exception
            if (r13 == 0) goto L_0x0b38
            r13.close()     // Catch:{ all -> 0x0b34 }
            goto L_0x0b38
        L_0x0b34:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0b39 }
        L_0x0b38:
            throw r1     // Catch:{ all -> 0x0b39 }
        L_0x0b39:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0c0e }
            goto L_0x0c12
        L_0x0b3f:
            r19.close()     // Catch:{ all -> 0x0c4c }
            r1 = r21
            r0 = r20
            r1.addAll(r0)     // Catch:{ all -> 0x0c4c }
        L_0x0b49:
            java.util.Iterator r13 = r21.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x0b4d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0b61
            com.whatsapp.jid.UserJid r1 = X.C17880vN.A0T(r13)     // Catch:{ all -> 0x0c4c }
            X.1Ln r0 = r12.A09     // Catch:{ all -> 0x0c4c }
            java.util.Set r0 = r0.A0M(r1)     // Catch:{ all -> 0x0c4c }
            r6.addAll(r0)     // Catch:{ all -> 0x0c4c }
            goto L_0x0b4d
        L_0x0b61:
            java.util.Iterator r15 = r10.iterator()     // Catch:{ all -> 0x0c4c }
        L_0x0b65:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0bbe
            com.whatsapp.jid.UserJid r1 = X.C17880vN.A0T(r15)     // Catch:{ all -> 0x0c4c }
            boolean r0 = r6.contains(r1)     // Catch:{ all -> 0x0c4c }
            if (r0 != 0) goto L_0x0b87
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo remove user="
            X.C17900vP.A0Z(r1, r0, r13)     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = "device_not_in_contact_and_chat"
            r8.put(r1, r0)     // Catch:{ all -> 0x0c4c }
            r7.add(r1)     // Catch:{ all -> 0x0c4c }
            goto L_0x0b65
        L_0x0b87:
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0b65
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x0c4c }
            if (r0 != 0) goto L_0x0b65
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo user has expired, jid="
            X.C17900vP.A0X(r1, r0, r13)     // Catch:{ all -> 0x0c4c }
            X.1U2 r14 = r12.A0A     // Catch:{ all -> 0x0c4c }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x0c4c }
            X.2rW r0 = (X.C62512rW) r0     // Catch:{ all -> 0x0c4c }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0c4c }
            long r0 = r0.A05     // Catch:{ all -> 0x0c4c }
            X.2Eb r13 = new X.2Eb     // Catch:{ all -> 0x0c4c }
            r13.<init>()     // Catch:{ all -> 0x0c4c }
            r18 = 3600(0xe10, double:1.7786E-320)
            long r0 = r0 / r18
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0c4c }
            r13.A00 = r0     // Catch:{ all -> 0x0c4c }
            X.18K r0 = r14.A00     // Catch:{ all -> 0x0c4c }
            r0.CC7(r13)     // Catch:{ all -> 0x0c4c }
            goto L_0x0b65
        L_0x0bbe:
            r10.removeAll(r7)     // Catch:{ all -> 0x0c4c }
            java.util.Iterator r6 = X.C17890vO.A0i(r8)     // Catch:{ all -> 0x0c4c }
        L_0x0bc5:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0bdf
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r6)     // Catch:{ all -> 0x0c4c }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0c4c }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0c4c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0c4c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0c4c }
            r11.A0E(r1, r0)     // Catch:{ all -> 0x0c4c }
            goto L_0x0bc5
        L_0x0bdf:
            boolean r0 = r27.A0N()     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0c26
            X.2rW r1 = r11.A03()     // Catch:{ all -> 0x0c4c }
            boolean r0 = X.C65882xG.A00(r1, r12, r2)     // Catch:{ all -> 0x0c4c }
            if (r0 == 0) goto L_0x0c13
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo own device list expired, logging out"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0c4c }
            X.1Tf r2 = r12.A01     // Catch:{ all -> 0x0c4c }
            java.lang.String r1 = "invalid_adv_status"
            r0 = 1
            r2.A02(r1, r0, r0)     // Catch:{ all -> 0x0c4c }
            goto L_0x0c4a
        L_0x0bfd:
            r1 = move-exception
            if (r7 == 0) goto L_0x0c08
            r7.close()     // Catch:{ all -> 0x0c04 }
            goto L_0x0c08
        L_0x0c04:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0c09 }
        L_0x0c08:
            throw r1     // Catch:{ all -> 0x0c09 }
        L_0x0c09:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0c0e }
            goto L_0x0c12
        L_0x0c0e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0c4c }
        L_0x0c12:
            throw r1     // Catch:{ all -> 0x0c4c }
        L_0x0c13:
            long r6 = r1.A05     // Catch:{ all -> 0x0c4c }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0c1f
            long r1 = r1.A02     // Catch:{ all -> 0x0c4c }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0c26
        L_0x0c1f:
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r27)     // Catch:{ all -> 0x0c4c }
            r10.add(r0)     // Catch:{ all -> 0x0c4c }
        L_0x0c26:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r26)     // Catch:{ all -> 0x0c4c }
            r0 = r24
            X.C17880vN.A1D(r1, r0, r4)     // Catch:{ all -> 0x0c4c }
        L_0x0c2f:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0c4c }
            if (r0 != 0) goto L_0x0c4a
            X.1Re r0 = r12.A03     // Catch:{ all -> 0x0c4c }
            X.1Mm r2 = r0.A00     // Catch:{ all -> 0x0c4c }
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x0c4c }
            java.lang.Object[] r1 = r10.toArray(r0)     // Catch:{ all -> 0x0c4c }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ all -> 0x0c4c }
            com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r0 = new com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob     // Catch:{ all -> 0x0c4c }
            r0.<init>(r1)     // Catch:{ all -> 0x0c4c }
            r2.A01(r0)     // Catch:{ all -> 0x0c4c }
        L_0x0c4a:
            monitor-exit(r12)
            return
        L_0x0c4c:
            r1 = move-exception
            monitor-exit(r12)
            throw r1
        L_0x0c4f:
            java.lang.Object r4 = r1.A01
            X.1RK r4 = (X.AnonymousClass1RK) r4
            X.1MQ r3 = r4.A0H
            X.1MO r1 = r3.A04
            X.10w r0 = r1.A00()
            X.10f r2 = r0.keySet()
            X.10w r0 = r1.A00()
            X.10f r1 = r0.keySet()
            r0 = 0
            r3.A0A(r1, r0)
            r0 = 38
            X.AnonymousClass35V.A00(r4, r2, r0)
            return
        L_0x0c71:
            java.lang.Object r0 = r1.A01
            java.util.Map r0 = (java.util.Map) r0
        L_0x0c75:
            r0.clear()
            return
        L_0x0c79:
            java.lang.Object r0 = r1.A01
            X.1TG r0 = (X.AnonymousClass1TG) r0
            X.1Lg r1 = r0.A0A
            X.1cg r0 = X.C29671cg.A00
            r1.A00(r0)
            return
        L_0x0c85:
            java.lang.Object r0 = r1.A01
            X.1TG r0 = (X.AnonymousClass1TG) r0
            r1 = 0
            r0.A07(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0I
            r0.set(r1)
            return
        L_0x0c93:
            java.lang.Object r1 = r1.A01
            X.1TG r1 = (X.AnonymousClass1TG) r1
            r0 = 1
            r1.A07(r0)
            return
        L_0x0c9c:
            java.lang.Object r0 = r1.A01
            X.1Uq r0 = (X.C27081Uq) r0
            X.1Cd r0 = r0.A03
            X.1au r10 = r0.A05()
            java.lang.String r7 = "scheduled_timestamp < ? AND call_log_row_id IS NULL"
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0db5 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0db5 }
            java.lang.String r5 = "scheduled_calls"
            java.lang.String[] r4 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0db5 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0db5 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            java.lang.String r1 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0db5 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x0db5 }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_EXPIRED_SCHEDULED_CALLS"
            int r2 = r6.A04(r5, r7, r0, r4)     // Catch:{ all -> 0x0db5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0db5 }
            java.lang.String r0 = "ScheduledCallsStore/deleteExpiredScheduledCalls "
            r1.append(r0)     // Catch:{ all -> 0x0db5 }
            r1.append(r2)     // Catch:{ all -> 0x0db5 }
            java.lang.String r0 = " deleted"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0db5 }
            r10.close()
            return
        L_0x0cdd:
            java.lang.Object r4 = r1.A01
            X.1WP r4 = (X.AnonymousClass1WP) r4
            r3 = 0
            X.1WV r2 = r4.A06
            r0 = 0
            X.AnonymousClass1WP.A00(r4, r2, r0, r3)
            return
        L_0x0cea:
            java.lang.Object r1 = r1.A01
            X.0vk r1 = (X.C18090vk) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.invoke()
            return
        L_0x0cf6:
            java.lang.Object r0 = r1.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x0cfe:
            java.lang.Object r0 = r1.A01
            X.3Lq r0 = (X.C72363Lq) r0
            r0.BrA()
            return
        L_0x0d06:
            java.lang.Object r0 = r1.A01
            X.4pj r0 = (X.C97594pj) r0
            X.3Lq r1 = r0.A07
            r0 = 422(0x1a6, float:5.91E-43)
            r1.onError(r0)
            return
        L_0x0d12:
            java.lang.Object r0 = r1.A01
            X.2l6 r0 = (X.C58692l6) r0
            r0.A00()
            return
        L_0x0d1a:
            java.lang.Object r1 = r1.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x0d27:
            java.lang.Object r0 = r1.A01
            X.1P3 r0 = (X.AnonymousClass1P3) r0
            r0.A0P()
            return
        L_0x0d2f:
            java.lang.Object r0 = r1.A01
            X.2zr r0 = (X.C67482zr) r0
            X.C67482zr.A00(r0)
            return
        L_0x0d37:
            java.lang.Object r0 = r1.A01
            X.48f r0 = (X.C825048f) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.crop.CropImage r0 = (com.whatsapp.crop.CropImage) r0
            com.whatsapp.crop.CropImage.A03(r0)
            return
        L_0x0d43:
            java.lang.Object r0 = r1.A01
            X.A1H r0 = (X.A1H) r0
            X.A1H.A00(r0)
            return
        L_0x0d4b:
            java.lang.Object r0 = r1.A01
            X.1Gn r0 = (X.C23501Gn) r0
            r0.C9S()
            return
        L_0x0d53:
            java.lang.Object r0 = r1.A01
            X.1Gn r0 = (X.C23501Gn) r0
            r0.C2W()
            return
        L_0x0d5b:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversationslist.LockedConversationsActivity r1 = (com.whatsapp.conversationslist.LockedConversationsActivity) r1
            r0 = 0
            com.whatsapp.conversationslist.LockedConversationsActivity.A0V(r1, r0, r0)
            return
        L_0x0d64:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0d6c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            r0 = 0
            r1.A2S = r0
            return
        L_0x0d74:
            java.lang.Object r0 = r1.A01
            X.1q2 r0 = (X.C37731q2) r0
            X.1pz r3 = r0.A08
            X.1BI r2 = r0.A02
            X.1i2 r1 = X.C32961i2.CHAT_LIST_SCREEN
            r0 = 0
            r3.A01(r2, r1, r0)
            return
        L_0x0d83:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d85 }
        L_0x0d85:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0d8a }
            throw r0     // Catch:{ all -> 0x0d8a }
        L_0x0d8a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0d8c }
        L_0x0d8c:
            r1 = move-exception
            X.CDX.A00(r9, r0)
            throw r1
        L_0x0d91:
            r1 = move-exception
            if (r2 == 0) goto L_0x0d9c
            r2.close()     // Catch:{ all -> 0x0d98 }
            goto L_0x0d9c
        L_0x0d98:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0d9d }
        L_0x0d9c:
            throw r1     // Catch:{ all -> 0x0d9d }
        L_0x0d9d:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0dcb }
            throw r1
        L_0x0da2:
            r1 = move-exception
            X.1CL r0 = r6.A06
            r0.A00(r2)
            throw r1
        L_0x0da9:
            r1 = move-exception
            if (r2 == 0) goto L_0x0db4
            r2.close()     // Catch:{ all -> 0x0db0 }
            goto L_0x0db4
        L_0x0db0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0db5 }
        L_0x0db4:
            throw r1     // Catch:{ all -> 0x0db5 }
        L_0x0db5:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0dcb }
            throw r1
        L_0x0dba:
            r1 = move-exception
            if (r4 == 0) goto L_0x0dc5
            r4.close()     // Catch:{ all -> 0x0dc1 }
            goto L_0x0dc5
        L_0x0dc1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0dc6 }
        L_0x0dc5:
            throw r1     // Catch:{ all -> 0x0dc6 }
        L_0x0dc6:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0dcb }
            throw r1
        L_0x0dcb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0dd0:
            r1 = move-exception
            if (r6 == 0) goto L_0x0ddb
            r6.close()     // Catch:{ all -> 0x0dd7 }
            goto L_0x0ddb
        L_0x0dd7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0ddc }
        L_0x0ddb:
            throw r1     // Catch:{ all -> 0x0ddc }
        L_0x0ddc:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0de1 }
            goto L_0x0de5
        L_0x0de1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0de6 }
        L_0x0de5:
            throw r1     // Catch:{ all -> 0x0de6 }
        L_0x0de6:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0de6 }
            throw r1
        L_0x0de9:
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x0def:
            java.lang.Object r0 = r1.A01
            X.1aY r0 = (X.AnonymousClass1aY) r0
            X.1aP r2 = r0.A03
            r0 = 1
            goto L_0x0dfe
        L_0x0df7:
            java.lang.Object r0 = r1.A01
            X.1aY r0 = (X.AnonymousClass1aY) r0
            X.1aP r2 = r0.A03
            r0 = 0
        L_0x0dfe:
            X.4ok r1 = new X.4ok
            r1.<init>(r0)
            goto L_0x0e14
        L_0x0e04:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r0 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r0
            X.00H r0 = r0.A09
            X.10T r2 = X.C17880vN.A0V(r0)
            r0 = 2
            X.7KX r1 = new X.7KX
            r1.<init>(r0)
        L_0x0e14:
            r2.notifyAllObservers(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70573Bq.run():void");
    }
}
