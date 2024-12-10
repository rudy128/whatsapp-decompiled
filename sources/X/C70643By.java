package X;

/* renamed from: X.3By  reason: invalid class name and case insensitive filesystem */
public class C70643By implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70643By(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v18, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:558|559|560|561) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0212, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.CDX.A00(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0216, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0219, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        X.CDX.A00(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0253, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        X.CDX.A00(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0257, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x025a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025b, code lost:
        X.CDX.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025e, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x045e, code lost:
        r3.A04.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0463, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x051f, code lost:
        r3.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0522, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0586, code lost:
        if (r1.intValue() <= r8.A0T.A01()) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0876, code lost:
        r3.notifyAllObservers(new X.AnonymousClass7KY(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x087e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08b7, code lost:
        r0 = X.AnonymousClass001.A1E(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x08ec, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x08ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:560:0x0c66 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0720  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:761:0x0602 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r42 = this;
            r6 = r42
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x10e7;
                case 1: goto L_0x10b1;
                case 2: goto L_0x1098;
                case 3: goto L_0x1070;
                case 4: goto L_0x1064;
                case 5: goto L_0x1056;
                case 6: goto L_0x1016;
                case 7: goto L_0x0fe5;
                case 8: goto L_0x0fc8;
                case 9: goto L_0x0f7c;
                case 10: goto L_0x0f08;
                case 11: goto L_0x0ec6;
                case 12: goto L_0x0e83;
                case 13: goto L_0x0e67;
                case 14: goto L_0x0e47;
                case 15: goto L_0x0a8d;
                case 16: goto L_0x0977;
                case 17: goto L_0x08c7;
                case 18: goto L_0x08a1;
                case 19: goto L_0x087f;
                case 20: goto L_0x086e;
                case 21: goto L_0x0865;
                case 22: goto L_0x085c;
                case 23: goto L_0x0853;
                case 24: goto L_0x0846;
                case 25: goto L_0x083d;
                case 26: goto L_0x0835;
                case 27: goto L_0x082c;
                case 28: goto L_0x0768;
                case 29: goto L_0x05f6;
                case 30: goto L_0x05ea;
                case 31: goto L_0x05dc;
                case 32: goto L_0x05bd;
                case 33: goto L_0x056a;
                case 34: goto L_0x0556;
                case 35: goto L_0x0538;
                case 36: goto L_0x0526;
                case 37: goto L_0x0490;
                case 38: goto L_0x047a;
                case 39: goto L_0x0464;
                case 40: goto L_0x043d;
                case 41: goto L_0x042e;
                case 42: goto L_0x0420;
                case 43: goto L_0x033b;
                case 44: goto L_0x032d;
                case 45: goto L_0x0314;
                case 46: goto L_0x026f;
                case 47: goto L_0x013b;
                case 48: goto L_0x00e3;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r6.A01
            X.1fG r2 = (X.C31251fG) r2
            java.lang.Object r6 = r6.A02
            X.2mG r6 = (X.C59412mG) r6
            monitor-enter(r2)
            X.1JD r3 = r2.A03     // Catch:{ all -> 0x03c9 }
            int r0 = r3.indexOf(r6)     // Catch:{ all -> 0x03c9 }
            r4 = 0
            if (r0 < 0) goto L_0x003b
            int r1 = r0 + 1
            r0 = 0
        L_0x001c:
            if (r0 >= r1) goto L_0x0024
            r3.removeFirst()     // Catch:{ all -> 0x03c9 }
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0024:
            X.1JD r1 = r2.A04     // Catch:{ all -> 0x03c9 }
            java.lang.Object r0 = r1.A0V()     // Catch:{ all -> 0x03c9 }
            X.2mG r0 = (X.C59412mG) r0     // Catch:{ all -> 0x03c9 }
            if (r0 == 0) goto L_0x0030
            java.lang.Long r4 = r0.A02     // Catch:{ all -> 0x03c9 }
        L_0x0030:
            r1.size()     // Catch:{ all -> 0x03c9 }
            r1.clear()     // Catch:{ all -> 0x03c9 }
            r3.size()     // Catch:{ all -> 0x03c9 }
            if (r4 != 0) goto L_0x007c
        L_0x003b:
            X.1JD r5 = r2.A04     // Catch:{ all -> 0x03c9 }
            int r0 = r5.size()     // Catch:{ all -> 0x03c9 }
            java.util.ListIterator r4 = r5.listIterator(r0)     // Catch:{ all -> 0x03c9 }
        L_0x0045:
            boolean r0 = r4.hasPrevious()     // Catch:{ all -> 0x03c9 }
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r4.previous()     // Catch:{ all -> 0x03c9 }
            X.2mG r0 = (X.C59412mG) r0     // Catch:{ all -> 0x03c9 }
            X.1ca r1 = r0.A01     // Catch:{ all -> 0x03c9 }
            X.1ca r0 = r6.A01     // Catch:{ all -> 0x03c9 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x03c9 }
            if (r0 == 0) goto L_0x0045
            int r1 = r4.nextIndex()     // Catch:{ all -> 0x03c9 }
            if (r1 < 0) goto L_0x007b
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x03c9 }
            X.2mG r0 = (X.C59412mG) r0     // Catch:{ all -> 0x03c9 }
            java.lang.Long r4 = r0.A02     // Catch:{ all -> 0x03c9 }
            int r1 = r1 + 1
            r0 = 0
        L_0x006c:
            if (r0 >= r1) goto L_0x0074
            r5.removeFirst()     // Catch:{ all -> 0x03c9 }
            int r0 = r0 + 1
            goto L_0x006c
        L_0x0074:
            r3.size()     // Catch:{ all -> 0x03c9 }
            r5.size()     // Catch:{ all -> 0x03c9 }
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            monitor-exit(r2)
            if (r4 == 0) goto L_0x00e0
            X.1fF r10 = r2.A00
            long r5 = r4.longValue()
            r2 = 0
            r1 = 1
            r8 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1Q(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid rowId="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " provided"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            X.C17960vV.A0G(r3, r0)
            r7 = 0
            X.00H r0 = r10.A03     // Catch:{ Exception -> 0x00d1 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00d1 }
            X.1MH r0 = (X.AnonymousClass1MH) r0     // Catch:{ Exception -> 0x00d1 }
            X.1au r11 = r0.A06()     // Catch:{ Exception -> 0x00d1 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ca }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = "preacks"
            java.lang.String r2 = "_id <= ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00ca }
            X.C17880vN.A1V(r1, r8, r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "PreacksStore/DELETE_ALL_OLDER_THAN_OR_EQUAL"
            int r0 = r9.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x00ca }
            r11.close()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x103f
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ Exception -> 0x00d1 }
            throw r0     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            r2 = move-exception
            java.lang.String r0 = "PreacksStore/deleteAllOlderThanOrEqual failed to remove pre-acks from DB"
            X.C17960vV.A09(r0, r2)
            X.190 r1 = r10.A00
            java.lang.String r0 = "failed_to_remove_pre_acks"
            r1.A0E(r0, r7, r2)
            goto L_0x1040
        L_0x00e0:
            r2 = 0
            goto L_0x1044
        L_0x00e3:
            java.lang.Object r3 = r6.A01
            X.1fW r3 = (X.C31411fW) r3
            java.lang.Object r4 = r6.A02
            monitor-enter(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x074e }
            java.lang.String r0 = "OfflineResumeMetrics/onOfflineCompleteProcessed attemptKey="
            r1.append(r0)     // Catch:{ all -> 0x074e }
            r1.append(r4)     // Catch:{ all -> 0x074e }
            java.lang.String r0 = " attempts="
            r1.append(r0)     // Catch:{ all -> 0x074e }
            java.util.Map r2 = r3.A0D     // Catch:{ all -> 0x074e }
            int r0 = r2.size()     // Catch:{ all -> 0x074e }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x074e }
            java.lang.Object r1 = r2.get(r4)     // Catch:{ all -> 0x074e }
            X.2B0 r1 = (X.AnonymousClass2B0) r1     // Catch:{ all -> 0x074e }
            if (r1 != 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x074e }
            java.lang.String r0 = "OfflineResumeMetrics/onOfflineCompleteProcessed no metrics for attemptKey="
            r1.append(r0)     // Catch:{ all -> 0x074e }
            r1.append(r4)     // Catch:{ all -> 0x074e }
            java.lang.String r0 = ", ignoring"
            X.C17890vO.A1B(r1, r0)     // Catch:{ all -> 0x074e }
            goto L_0x0139
        L_0x011e:
            r0 = 1
            X.C31411fW.A02(r3, r1, r0)     // Catch:{ all -> 0x074e }
            r2.remove(r4)     // Catch:{ all -> 0x074e }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x074e }
            if (r0 == 0) goto L_0x0136
            X.2lo r0 = r3.A08     // Catch:{ all -> 0x074e }
            if (r0 == 0) goto L_0x0136
            r0 = 0
            r3.A05 = r0     // Catch:{ all -> 0x074e }
            r0 = 0
            r3.A08 = r0     // Catch:{ all -> 0x074e }
        L_0x0136:
            X.C31411fW.A00(r3)     // Catch:{ all -> 0x074e }
        L_0x0139:
            monitor-exit(r3)
            return
        L_0x013b:
            java.lang.Object r5 = r6.A01
            X.1gP r5 = (X.C31961gP) r5
            java.lang.Object r4 = r6.A02
            X.2nR r4 = (X.C60132nR) r4
            X.1gN r0 = r5.A01
            X.10s r0 = r0.A03
            r0.A02()
            X.1N7 r3 = r5.A02
            long r1 = r4.A00
            r0 = 1
            X.2tQ r1 = X.AnonymousClass1N7.A00(r3, r0, r1)
            if (r1 == 0) goto L_0x0159
            r0 = 3
            r1.A05(r0)
        L_0x0159:
            X.1TQ r7 = r5.A00
            com.whatsapp.jid.Jid r0 = r4.A02
            com.whatsapp.jid.DeviceJid r6 = X.AnonymousClass1E0.A00(r0)
            java.lang.String r1 = r4.A08
            if (r6 == 0) goto L_0x1055
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x1055
            X.1Ry r5 = r7.A0D
            X.C17960vV.A07(r1)
            X.231 r4 = r5.A03(r6, r1)
            if (r4 == 0) goto L_0x1055
            X.23J r4 = (X.AnonymousClass23J) r4
            int r0 = r4.A03
            r3 = 2
            if (r0 == 0) goto L_0x018c
            if (r0 != r3) goto L_0x0269
            int r2 = r4.A01
            X.18O r1 = r7.A00
            X.18Q r0 = X.AnonymousClass18O.A0u
            int r0 = r1.A04(r0)
            if (r2 <= r0) goto L_0x0269
            r3 = 3
        L_0x018c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HistorySyncManager/activate sync phase "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " for "
            X.C17900vP.A0Y(r6, r0, r1)
            X.1TH r2 = r7.A0C
            r13 = 0
            X.C17960vV.A01()
            android.content.ContentValues r12 = X.C17880vN.A08()
            java.lang.String r1 = "status"
            java.lang.String r0 = "1"
            r12.put(r1, r0)
            X.1Oq r10 = r2.A02
            X.1au r1 = r10.A06()
            X.1xA r8 = r1.BD0()     // Catch:{ all -> 0x0258 }
            r0 = r1
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0251 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0251 }
            java.lang.String r20 = "msg_history_sync"
            java.lang.String r21 = "device_id =?\n                    AND\n                    sync_type =?\n                    AND\n                    status =?"
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0251 }
            X.C17880vN.A1J(r6, r9, r13)     // Catch:{ all -> 0x0251 }
            java.lang.String r17 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0251 }
            r0 = 1
            r9[r0] = r17     // Catch:{ all -> 0x0251 }
            java.lang.String r13 = "0"
            r0 = 2
            r9[r0] = r13     // Catch:{ all -> 0x0251 }
            java.lang.String r22 = "MessageHistorySyncStore.activateSync"
            r19 = r12
            r23 = r9
            r18 = r11
            int r16 = r18.A02(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0251 }
            if (r16 != 0) goto L_0x0247
            r15 = 0
            X.1at r11 = r10.get()     // Catch:{ all -> 0x0251 }
            r9 = r11
            X.1av r9 = (X.C28801av) r9     // Catch:{ all -> 0x0217 }
            X.1Ev r14 = r9.A02     // Catch:{ all -> 0x0217 }
            java.lang.String r13 = "SELECT status FROM msg_history_sync WHERE device_id=? AND sync_type=? LIMIT 1"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x0217 }
            java.lang.String r9 = r6.getRawString()     // Catch:{ all -> 0x0217 }
            r12 = 0
            r10[r15] = r9     // Catch:{ all -> 0x0217 }
            r9 = 1
            r10[r9] = r17     // Catch:{ all -> 0x0217 }
            java.lang.String r9 = "MessageHistorySyncTable.SELECT_SYNC_STATUS_FOR_DEVICE_ID_AND_SYNC_TYPE"
            android.database.Cursor r10 = r14.A0A(r13, r9, r10)     // Catch:{ all -> 0x0217 }
            int r9 = r10.getCount()     // Catch:{ all -> 0x0210 }
            if (r9 <= 0) goto L_0x0207
            r12 = 1
        L_0x0207:
            r10.close()     // Catch:{ all -> 0x0217 }
            r11.close()     // Catch:{ all -> 0x0251 }
            if (r12 != 0) goto L_0x0247
            goto L_0x021e
        L_0x0210:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0212 }
        L_0x0212:
            r0 = move-exception
            X.CDX.A00(r10, r2)     // Catch:{ all -> 0x0217 }
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0219 }
        L_0x0219:
            r0 = move-exception
            X.CDX.A00(r11, r2)     // Catch:{ all -> 0x0251 }
            throw r0     // Catch:{ all -> 0x0251 }
        L_0x021e:
            java.lang.String r20 = "this"
            r24 = -1
            r22 = -1
            r18 = 0
            X.2n6 r9 = new X.2n6     // Catch:{ all -> 0x0251 }
            r28 = r24
            r30 = r24
            r32 = r24
            r34 = r24
            r36 = r24
            r38 = r24
            r40 = r24
            r19 = r6
            r21 = r3
            r23 = r0
            r26 = r24
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r34, r36, r38, r40)     // Catch:{ all -> 0x0251 }
            r2.A03(r9)     // Catch:{ all -> 0x0251 }
        L_0x0247:
            r8.A00()     // Catch:{ all -> 0x0251 }
            X.AnonymousClass1TH.A00(r1, r2, r6)     // Catch:{ all -> 0x0251 }
            r8.close()     // Catch:{ all -> 0x0258 }
            goto L_0x025f
        L_0x0251:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0253 }
        L_0x0253:
            r0 = move-exception
            X.CDX.A00(r8, r2)     // Catch:{ all -> 0x0258 }
            throw r0     // Catch:{ all -> 0x0258 }
        L_0x0258:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r4 = move-exception
            X.CDX.A00(r1, r0)
            throw r4
        L_0x025f:
            r1.close()
            if (r16 <= 0) goto L_0x0269
            X.1TP r0 = r7.A02
            r0.A00()
        L_0x0269:
            long r0 = r4.A0x
            r5.A05(r0)
            return
        L_0x026f:
            java.lang.Object r3 = r6.A01
            X.11y r3 = (X.C203911y) r3
            java.lang.Object r2 = r6.A02
            X.212 r2 = (X.AnonymousClass212) r2
            X.1Qe r0 = r3.A0I
            r0.A05(r2)
            boolean r0 = r2 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x02cc
            X.00H r0 = r3.A0V
            java.lang.Object r4 = r0.get()
            X.2rF r4 = (X.C62342rF) r4
            r5 = r2
            X.227 r5 = (X.AnonymousClass227) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.205 r1 = r5.A0v
            boolean r0 = r1.A02
            java.lang.String r7 = "Failed requirement."
            if (r0 == 0) goto L_0x030f
            X.1BI r6 = r1.A00
            boolean r0 = r6 instanceof X.C29681ch
            if (r0 == 0) goto L_0x030a
            X.1CJ r1 = r4.A01
            X.00H r0 = r4.A05
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.1ch r6 = (X.C29681ch) r6
            boolean r0 = X.AnonymousClass4aS.A08(r1, r6, r0)
            if (r0 == 0) goto L_0x02cc
            X.205 r0 = r5.A18()
            if (r0 == 0) goto L_0x0305
            X.00H r0 = r4.A04
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.205 r1 = r5.A18()
            X.1W2 r0 = r0.A01
            X.206 r7 = r0.A05(r1)
            if (r7 != 0) goto L_0x02d8
            java.lang.String r0 = "NewsletterMessageManager/message not found/ignore"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x02cc:
            X.00H r0 = r3.A0V
            java.lang.Object r0 = r0.get()
            X.2rF r0 = (X.C62342rF) r0
            r0.A01(r2)
            return
        L_0x02d8:
            X.00H r0 = r4.A06
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.2nT r6 = (X.C60152nT) r6
            java.lang.String r11 = r5.A01
            X.11P r0 = r4.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r8 = 0
            r14 = 1
            X.11P r0 = r6.A02
            long r12 = X.AnonymousClass11P.A01(r0)
            r9 = r8
            r15 = r14
            r6.A03(r7, r8, r9, r10, r11, r12, r14, r15)
            X.00H r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            r0.A05(r7)
            goto L_0x02cc
        L_0x0305:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r7)
            throw r0
        L_0x030a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r7)
            throw r0
        L_0x030f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r7)
            throw r0
        L_0x0314:
            java.lang.Object r2 = r6.A01
            X.11y r2 = (X.C203911y) r2
            java.lang.Object r1 = r6.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.1Qe r0 = r2.A0I
            r0.A05(r1)
            X.00H r0 = r2.A0V
            java.lang.Object r0 = r0.get()
            X.2rF r0 = (X.C62342rF) r0
            r0.A01(r1)
            return
        L_0x032d:
            java.lang.Object r0 = r6.A01
            X.1kN r0 = (X.C34371kN) r0
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            X.1kM r0 = r0.A05
            r0.A01(r1)
            return
        L_0x033b:
            java.lang.Object r0 = r6.A01
            X.1kN r0 = (X.C34371kN) r0
            java.lang.Object r4 = r6.A02
            java.util.List r4 = (java.util.List) r4
            X.1kM r2 = r0.A05
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeysAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.HashSet r3 = X.C17880vN.A12()
            java.util.Iterator r7 = r4.iterator()
        L_0x0356:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03cc
            java.lang.Object r0 = r7.next()
            X.2gT r0 = (X.C55852gT) r0
            com.whatsapp.jid.DeviceJid r11 = r0.A01
            byte[] r14 = r0.A05
            byte[] r15 = r0.A06
            byte[] r6 = r0.A04
            byte r4 = r0.A00
            X.2eE r12 = r0.A02
            X.2eE r13 = r0.A03
            if (r12 != 0) goto L_0x0375
            r3.add(r11)
        L_0x0375:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "prekey request successful; initiating signal protocol session; jid="
            X.C17900vP.A0Y(r11, r0, r5)
            int r0 = r11.getDevice()
            if (r0 == 0) goto L_0x03a1
            X.1U5 r0 = r2.A04
            r21 = 4
            r16 = r0
            r17 = r11
            r18 = r6
            r19 = r14
            r20 = r4
            boolean r0 = r16.A0E(r17, r18, r19, r20, r21)
            if (r0 != 0) goto L_0x03a1
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A00(r11)
            goto L_0x0356
        L_0x03a1:
            X.2nE r9 = X.C63962tz.A02(r11)
            X.1P3 r10 = r2.A03
            X.3Eu r8 = new X.3Eu
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            monitor-enter(r2)
            X.3DM r6 = r2.A00     // Catch:{ all -> 0x03c9 }
            if (r6 != 0) goto L_0x03c1
            X.10I r5 = r2.A05     // Catch:{ all -> 0x03c9 }
            int r4 = X.C62912sC.A00()     // Catch:{ all -> 0x03c9 }
            r0 = 1
            X.3DM r6 = new X.3DM     // Catch:{ all -> 0x03c9 }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x03c9 }
            r2.A00 = r6     // Catch:{ all -> 0x03c9 }
        L_0x03c1:
            monitor-exit(r2)
            r6.execute(r8)
            r1.add(r8)
            goto L_0x0356
        L_0x03c9:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L_0x03cc:
            java.util.HashMap r6 = X.C17880vN.A11()
            java.util.Iterator r7 = r1.iterator()
        L_0x03d4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x040f
            java.lang.Object r0 = r7.next()
            X.3Eu r0 = (X.C71323Eu) r0
            com.whatsapp.jid.DeviceJid r5 = r0.A00
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            int r4 = X.AnonymousClass000.A0M(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            if (r4 != 0) goto L_0x03f8
            boolean r0 = r3.contains(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            r6.put(r5, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            goto L_0x03d4
        L_0x03f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            X.C17900vP.A0i(r0, r1, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            r2.A00(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0405 }
            goto L_0x03d4
        L_0x0405:
            r1 = move-exception
            java.lang.String r0 = "Error received from SignalCoordinator"
            com.whatsapp.util.Log.e(r0, r1)
            r2.A00(r5)
            goto L_0x03d4
        L_0x040f:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x1055
            android.os.Handler r3 = r2.A01
            r0 = 37
            X.3By r1 = new X.3By
            r1.<init>(r2, r6, r0)
            goto L_0x051f
        L_0x0420:
            java.lang.Object r0 = r6.A01
            X.1kN r0 = (X.C34371kN) r0
            java.lang.Object r1 = r6.A02
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.1kM r0 = r0.A05
            r0.A00(r1)
            return
        L_0x042e:
            java.lang.Object r3 = r6.A01
            X.2qF r3 = (X.C61782qF) r3
            java.lang.Object r2 = r6.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1Rj r1 = r3.A09
            r0 = 0
            r1.A0D(r2, r0)
            goto L_0x045e
        L_0x043d:
            java.lang.Object r3 = r6.A01
            X.2qF r3 = (X.C61782qF) r3
            java.lang.Object r2 = r6.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1Rj r0 = r3.A09
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0F
            java.lang.Object r1 = r0.get(r2)
            if (r1 != 0) goto L_0x0457
            X.1zh r1 = new X.1zh
            r1.<init>()
            r0.put(r2, r1)
        L_0x0457:
            X.1zh r1 = (X.C43371zh) r1
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
        L_0x045e:
            X.1mk r0 = r3.A04
            r0.A00(r2)
            return
        L_0x0464:
            java.lang.Object r0 = r6.A01
            X.1N9 r0 = (X.AnonymousClass1N9) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1N3 r1 = r0.A02     // Catch:{ IOException -> 0x0473 }
            r0 = 0
            r1.A04(r2, r0)     // Catch:{ IOException -> 0x0473 }
            return
        L_0x0473:
            r1 = move-exception
            java.lang.String r0 = "ReadReceipts/updateMessageToRead Failed to update msg status back to 16"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x047a:
            java.lang.Object r1 = r6.A01
            X.1N9 r1 = (X.AnonymousClass1N9) r1
            java.lang.Object r0 = r6.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.1N8 r1 = r1.A03
            X.1BI r2 = X.AnonymousClass205.A00(r0)
            long r3 = r0.A0x
            long r5 = r0.A0y
            r1.A01(r2, r3, r5)
            return
        L_0x0490:
            java.lang.Object r4 = r6.A01
            X.1kM r4 = (X.C34361kM) r4
            java.lang.Object r6 = r6.A02
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = "completion callback for onGetPreKeySuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1hI r5 = r4.A02
            monitor-enter(r5)
            java.util.Iterator r7 = X.AnonymousClass000.A15(r6)     // Catch:{ all -> 0x0523 }
        L_0x04a4:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0523 }
            if (r0 == 0) goto L_0x04f8
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x0523 }
            java.lang.Object r2 = r3.getKey()     // Catch:{ all -> 0x0523 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x0523 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0523 }
            java.lang.String r0 = "prekeysmanager/onGetPreKeySuccess "
            X.C17900vP.A0Y(r2, r0, r1)     // Catch:{ all -> 0x0523 }
            java.util.Map r0 = r5.A08     // Catch:{ all -> 0x0523 }
            java.lang.Object r1 = r0.remove(r2)     // Catch:{ all -> 0x0523 }
            X.2fM r1 = (X.C55182fM) r1     // Catch:{ all -> 0x0523 }
            if (r1 == 0) goto L_0x04a4
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0523 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x0523 }
            if (r0 == 0) goto L_0x04a4
            int r0 = r1.A00     // Catch:{ all -> 0x0523 }
            int r3 = r1.A02     // Catch:{ all -> 0x0523 }
            int r2 = r1.A01     // Catch:{ all -> 0x0523 }
            X.2FX r1 = new X.2FX     // Catch:{ all -> 0x0523 }
            r1.<init>()     // Catch:{ all -> 0x0523 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0523 }
            r1.A02 = r0     // Catch:{ all -> 0x0523 }
            if (r3 <= 0) goto L_0x04ea
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0523 }
            r1.A01 = r0     // Catch:{ all -> 0x0523 }
        L_0x04ea:
            if (r2 <= 0) goto L_0x04f2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0523 }
            r1.A00 = r0     // Catch:{ all -> 0x0523 }
        L_0x04f2:
            X.18K r0 = r5.A06     // Catch:{ all -> 0x0523 }
            r0.CC7(r1)     // Catch:{ all -> 0x0523 }
            goto L_0x04a4
        L_0x04f8:
            r5.A00()     // Catch:{ all -> 0x0523 }
            monitor-exit(r5)
            java.util.Set r0 = r6.keySet()
            java.util.ArrayList r2 = X.C17880vN.A10(r0)
            X.00H r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.1Ow r1 = (X.C25611Ow) r1
            X.2ht r0 = new X.2ht
            r0.<init>(r2)
            X.1Ox r0 = r1.A02
            r0.A00()
            android.os.Handler r3 = r4.A01
            r0 = 36
            X.3By r1 = new X.3By
            r1.<init>(r4, r2, r0)
        L_0x051f:
            r3.post(r1)
            return
        L_0x0523:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x0526:
            java.lang.Object r0 = r6.A01
            X.1kM r0 = (X.C34361kM) r0
            java.lang.Object r2 = r6.A02
            X.00H r0 = r0.A07
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 15
            X.C17890vO.A0s(r1, r2, r0)
            return
        L_0x0538:
            java.lang.Object r0 = r6.A01
            X.2si r0 = (X.C63222si) r0
            java.lang.Object r3 = r6.A02
            android.content.Context r3 = (android.content.Context) r3
            X.00H r0 = r0.A0j
            java.lang.Object r0 = r0.get()
            X.1jT r0 = (X.C33841jT) r0
            android.content.Intent r2 = r0.A04()
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0556:
            java.lang.Object r0 = r6.A01
            X.2si r0 = (X.C63222si) r0
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.00H r0 = r0.A0f
            java.lang.Object r0 = r0.get()
            X.1Rj r0 = (X.C26241Rj) r0
            r0.A0B(r1)
            return
        L_0x056a:
            java.lang.Object r8 = r6.A01
            X.17v r8 = (X.C219017v) r8
            java.lang.Object r1 = r6.A02
            java.lang.Number r1 = (java.lang.Number) r1
            X.11P r0 = r8.A0Q
            long r10 = X.AnonymousClass11P.A01(r0)
            r9 = 1
            if (r1 == 0) goto L_0x0588
            int r1 = r1.intValue()
            X.19F r0 = r8.A0T
            int r0 = r0.A01()
            r7 = 1
            if (r1 > r0) goto L_0x0589
        L_0x0588:
            r7 = 0
        L_0x0589:
            X.19F r6 = r8.A0T
            long r4 = r6.A02()
            monitor-enter(r6)
            android.content.SharedPreferences r3 = r6.A00     // Catch:{ all -> 0x05ba }
            java.lang.String r2 = "ab_props:sys:refresh"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r3.getLong(r2, r0)     // Catch:{ all -> 0x05ba }
            monitor-exit(r6)
            long r4 = r4 + r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x05aa
            long r1 = r6.A02()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x05aa
            r9 = 0
        L_0x05aa:
            if (r7 != 0) goto L_0x05ae
            if (r9 == 0) goto L_0x1055
        L_0x05ae:
            X.0vp r0 = r8.A0m
            java.lang.Object r0 = r0.get()
            X.2jv r0 = (X.C57962jv) r0
            r0.A00(r7)
            return
        L_0x05ba:
            r4 = move-exception
            monitor-exit(r6)
            throw r4
        L_0x05bd:
            java.lang.Object r1 = r6.A01
            X.17v r1 = (X.C219017v) r1
            java.lang.Object r3 = r6.A02
            android.content.Context r3 = (android.content.Context) r3
            X.1cw r2 = r1.A0N
            r0 = 1
            X.2DQ r4 = new X.2DQ
            r4.<init>(r1, r0)
            java.lang.String r0 = "com.whatsapp.MessageHandler.RECONNECT_ACTION"
            android.content.IntentFilter r5 = new android.content.IntentFilter
            r5.<init>(r0)
            java.lang.String r6 = X.C19620yd.A0B
            r7 = 0
            r8 = 0
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x05dc:
            java.lang.Object r1 = r6.A01
            X.3Ks r1 = (X.C72123Ks) r1
            java.lang.Object r0 = r6.A02
            X.9r6 r0 = (X.C194059r6) r0
            byte[] r0 = r0.A01
            r1.BcN(r0)
            return
        L_0x05ea:
            java.lang.Object r1 = r6.A01
            X.2q5 r1 = (X.C61682q5) r1
            java.lang.Object r0 = r6.A02
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            X.C61682q5.A00(r1, r0)
            return
        L_0x05f6:
            java.lang.Object r4 = r6.A01
            X.1hJ r4 = (X.C32511hJ) r4
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x0602:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x1055
            X.1BI r6 = X.C17880vN.A0Q(r14)
            boolean r0 = X.C22971Dz.A0V(r6)
            if (r0 != 0) goto L_0x0602
            boolean r0 = r6 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x0748
            X.1MS r1 = r4.A01
            r0 = r6
            X.1E9 r0 = (X.AnonymousClass1E9) r0
            X.2tp r2 = r1.A0A(r0)
        L_0x061f:
            r5 = 0
            if (r2 == 0) goto L_0x0639
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0639
            X.00H r0 = r4.A04
            java.lang.Object r1 = r0.get()
            X.2aD r1 = (X.C52002aD) r1
            monitor-enter(r1)
            if (r6 == 0) goto L_0x0636
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x074b }
            r0.remove(r6)     // Catch:{ all -> 0x074b }
        L_0x0636:
            monitor-exit(r1)
            r8 = 1
            goto L_0x063a
        L_0x0639:
            r8 = 0
        L_0x063a:
            X.00H r7 = r4.A04
            java.lang.Object r3 = r7.get()
            X.2aD r3 = (X.C52002aD) r3
            monitor-enter(r3)
            if (r6 == 0) goto L_0x065b
            java.util.Map r1 = r3.A00     // Catch:{ all -> 0x074e }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x074e }
            if (r0 == 0) goto L_0x0658
            monitor-exit(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FetchPrekey/requestFetch prekeys already requested: "
            X.C17900vP.A0Y(r6, r0, r1)
            goto L_0x0602
        L_0x0658:
            X.C17880vN.A1P(r6, r1, r5)     // Catch:{ all -> 0x074e }
        L_0x065b:
            monitor-exit(r3)
            if (r2 == 0) goto L_0x0660
            r2.A0B = r5
        L_0x0660:
            boolean r13 = X.C22971Dz.A0a(r6)
            if (r13 == 0) goto L_0x067f
            X.1RS r1 = r4.A03
            X.1Cd r0 = r1.A05
            X.1au r3 = r0.A05()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x075b }
            r0 = 0
            r1.A02(r0, r5, r5)     // Catch:{ all -> 0x0751 }
            r2.A00()     // Catch:{ all -> 0x0751 }
            r2.close()     // Catch:{ all -> 0x075b }
            r3.close()
        L_0x067f:
            X.1RP r3 = r4.A02
            if (r8 == 0) goto L_0x06dc
            r12 = r6
            X.1E9 r12 = (X.AnonymousClass1E9) r12
            X.1MZ r0 = r3.A03
            X.1MW r11 = r0.A08
            X.2tp r2 = r11.A0C(r12)
            X.0ve r10 = r3.A05
            X.11S r9 = r3.A01
            X.00H r8 = r3.A06
            java.lang.Object r1 = r8.get()
            X.2se r1 = (X.C63182se) r1
            r0 = 1
            java.util.HashSet r2 = r2.A0N(r9, r10, r1, r0)
            X.2tp r1 = r11.A0C(r12)
            java.lang.Object r0 = r8.get()
            X.2se r0 = (X.C63182se) r0
            java.util.HashSet r0 = r1.A0N(r9, r10, r0, r5)
            r2.addAll(r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x070d
            java.util.ArrayList r0 = X.AnonymousClass1RP.A01(r2)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x06c2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0711
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.1P3 r0 = r3.A02
            java.util.HashSet r0 = r0.A0M(r1)
            java.util.ArrayList r0 = X.C63962tz.A05(r0)
            r8.addAll(r0)
            goto L_0x06c2
        L_0x06dc:
            r0 = 0
            java.util.HashSet r1 = X.AnonymousClass1RP.A03(r3, r6, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x070d
            java.util.ArrayList r0 = X.AnonymousClass1RP.A01(r1)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x06f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0711
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.1P3 r0 = r3.A02
            java.util.HashSet r0 = r0.A0M(r1)
            java.util.ArrayList r0 = X.C63962tz.A05(r0)
            r8.addAll(r0)
            goto L_0x06f3
        L_0x070d:
            java.util.Set r8 = java.util.Collections.emptySet()
        L_0x0711:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FetchPrekey/requestFetch missing sessions: "
            X.C17900vP.A0Y(r8, r0, r1)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0602
            java.lang.Object r2 = r7.get()
            X.2aD r2 = (X.C52002aD) r2
            int r1 = r8.size()
            monitor-enter(r2)
            if (r6 == 0) goto L_0x0732
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0765 }
            X.C17880vN.A1P(r6, r0, r1)     // Catch:{ all -> 0x0765 }
        L_0x0732:
            monitor-exit(r2)
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r5]
            java.lang.Object[] r2 = r8.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r2 = (com.whatsapp.jid.DeviceJid[]) r2
            r1 = 10
            if (r13 == 0) goto L_0x0741
            r1 = 13
        L_0x0741:
            X.1hI r0 = r4.A00
            r0.A04(r2, r1, r5)
            goto L_0x0602
        L_0x0748:
            r2 = 0
            goto L_0x061f
        L_0x074b:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x074e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0751:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0756 }
            goto L_0x075a
        L_0x0756:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x075b }
        L_0x075a:
            throw r1     // Catch:{ all -> 0x075b }
        L_0x075b:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0760 }
            throw r1
        L_0x0760:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0765:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0768:
            java.lang.Object r4 = r6.A01
            X.2sR r4 = (X.C63062sR) r4
            java.lang.Object r3 = r6.A02
            X.1ca r3 = (X.C29621ca) r3
            X.C18070vi.A0h(r4, r3)
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "to"
            com.whatsapp.jid.Jid r1 = r3.A0F(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r0 = "enc"
            X.C63062sR.A00(r4, r3, r0, r2)
            java.lang.String r0 = "plaintext"
            X.C63062sR.A00(r4, r3, r0, r5)
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 == 0) goto L_0x07e9
            boolean r0 = X.C17880vN.A1X(r2)
            if (r0 == 0) goto L_0x07a7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Trying to send enc nodes to newsletter jid! "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            X.C63062sR.A01(r4, r0)
        L_0x07a7:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x07ba
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Sending empty message to newsletter jid! "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
        L_0x07b7:
            X.C63062sR.A01(r4, r0)
        L_0x07ba:
            java.util.Iterator r3 = r2.iterator()
        L_0x07be:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07f2
            X.1ca r2 = X.C17880vN.A0a(r3)
            byte[] r1 = r2.A01
            if (r1 == 0) goto L_0x07be
            int r0 = r1.length
            if (r0 == 0) goto L_0x07be
            X.8cr r0 = X.C166418cr.A01(r1)     // Catch:{ 1PN -> 0x07be }
            if (r0 == 0) goto L_0x07be
            boolean r0 = X.C31701fz.A1B(r0)     // Catch:{ 1PN -> 0x07be }
            if (r0 == 0) goto L_0x07be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1PN -> 0x07be }
            java.lang.String r0 = "Detected not encrypted blob in the enc node. "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)     // Catch:{ 1PN -> 0x07be }
            X.C63062sR.A01(r4, r0)     // Catch:{ 1PN -> 0x07be }
            goto L_0x07be
        L_0x07e9:
            boolean r0 = X.C17880vN.A1X(r5)
            if (r0 == 0) goto L_0x07ba
            java.lang.String r0 = "Trying to send plaintext nodes to not newsletter jid!"
            goto L_0x07b7
        L_0x07f2:
            java.util.Iterator r3 = r5.iterator()
        L_0x07f6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1055
            X.1ca r2 = X.C17880vN.A0a(r3)
            byte[] r0 = r2.A01
            if (r0 == 0) goto L_0x07f6
            X.8cr r0 = X.C166418cr.A01(r0)     // Catch:{ 1PN -> 0x081e }
            if (r0 == 0) goto L_0x07f6
            boolean r0 = X.C31701fz.A1B(r0)     // Catch:{ 1PN -> 0x081e }
            if (r0 != 0) goto L_0x07f6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1PN -> 0x081e }
            java.lang.String r0 = "Was able to parse but was invalid message in the end. "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)     // Catch:{ 1PN -> 0x081e }
            X.C63062sR.A01(r4, r0)     // Catch:{ 1PN -> 0x081e }
            goto L_0x07f6
        L_0x081e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Detected encrypted blob in the plaintext node. "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.C63062sR.A01(r4, r0)
            goto L_0x07f6
        L_0x082c:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 11
            goto L_0x0876
        L_0x0835:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 7
            goto L_0x0876
        L_0x083d:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 10
            goto L_0x0876
        L_0x0846:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r1 = 14
            goto L_0x0876
        L_0x0853:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 9
            goto L_0x0876
        L_0x085c:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 8
            goto L_0x0876
        L_0x0865:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 12
            goto L_0x0876
        L_0x086e:
            java.lang.Object r3 = r6.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r6.A02
            r1 = 13
        L_0x0876:
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x087f:
            java.lang.Object r1 = r6.A01
            X.2DP r1 = (X.AnonymousClass2DP) r1
            java.lang.Object r2 = r6.A02
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r0 = "com.whatsapp.alarm.CLIENT_PING_TIMEOUT"
            boolean r0 = X.C17890vO.A1S(r2, r0)
            if (r0 != 0) goto L_0x0896
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ClientPingManager/timeout/receiver; unexpected intent: "
            goto L_0x08b7
        L_0x0896:
            java.lang.String r0 = "ClientPingManager/timeout/receiver"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1cq r0 = r1.A00
            X.C29771cq.A03(r0)
            return
        L_0x08a1:
            java.lang.Object r1 = r6.A01
            X.2DO r1 = (X.AnonymousClass2DO) r1
            java.lang.Object r2 = r6.A02
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r0 = "com.whatsapp.alarm.CLIENT_PING_PERIODIC"
            boolean r0 = X.C17890vO.A1S(r2, r0)
            if (r0 != 0) goto L_0x08bc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ClientPingManager/periodic/receiver; unexpected intent: "
        L_0x08b7:
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            goto L_0x08ec
        L_0x08bc:
            java.lang.String r0 = "ClientPingManager/periodic/receiver"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1cq r0 = r1.A00
            X.C29771cq.A04(r0)
            return
        L_0x08c7:
            java.lang.Object r1 = r6.A01
            X.1cq r1 = (X.C29771cq) r1
            java.lang.Object r3 = r6.A02
            X.1nd r3 = (X.C36281nd) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ClientPingManager/on-connected, can use short: "
            r2.append(r0)
            boolean r0 = r1.A04
            X.C17900vP.A0r(r2, r0)
            X.10s r2 = r1.A0F
            r2.A02()
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x08f8
            X.1nd r0 = r1.A03
            if (r3 != r0) goto L_0x08f0
            java.lang.String r0 = "ClientPingManager/on-connected; already connected, ignoring."
        L_0x08ec:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x08f0:
            java.lang.String r0 = "ClientPingManager/on-connected; new channel, forcing disconnect."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.C29771cq.A02(r1)
        L_0x08f8:
            r1.A03 = r3
            r9 = 0
            r1.A00 = r9
            r3 = 0
            r1.A0K = r3
            r1.A06 = r9
            r0 = 1
            r1.A05 = r0
            boolean r0 = X.C29771cq.A06(r1)
            if (r0 == 0) goto L_0x0913
            X.C29771cq.A05(r1)
        L_0x090f:
            X.C29771cq.A01(r1)
            return
        L_0x0913:
            r2.A02()
            X.2DO r0 = r1.A01
            if (r0 == 0) goto L_0x092f
            java.lang.String r0 = "ClientPingManager/periodic/register-receiver; duplicate receiver registration."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x091f:
            X.C29771cq.A05(r1)
            r2.A02()
            X.2DP r0 = r1.A02
            if (r0 == 0) goto L_0x0953
            java.lang.String r0 = "ClientPingManager/timeout/register-receiver; duplicate receiver registration."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x090f
        L_0x092f:
            X.2DO r0 = new X.2DO
            r0.<init>(r1)
            r1.A01 = r0
            X.00H r0 = r1.A0H
            java.lang.Object r3 = r0.get()
            X.1cw r3 = (X.C29831cw) r3
            X.118 r0 = r1.A0D
            android.content.Context r4 = r0.A00
            X.2DO r5 = r1.A01
            java.lang.String r0 = "com.whatsapp.alarm.CLIENT_PING_PERIODIC"
            android.content.IntentFilter r6 = new android.content.IntentFilter
            r6.<init>(r0)
            java.lang.String r7 = X.C19620yd.A0B
            android.os.Handler r8 = r1.A07
            r3.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x091f
        L_0x0953:
            X.2DP r0 = new X.2DP
            r0.<init>(r1)
            r1.A02 = r0
            X.118 r0 = r1.A0D
            android.content.Context r4 = r0.A00
            X.00H r0 = r1.A0H
            java.lang.Object r3 = r0.get()
            X.1cw r3 = (X.C29831cw) r3
            X.2DP r5 = r1.A02
            java.lang.String r0 = "com.whatsapp.alarm.CLIENT_PING_TIMEOUT"
            android.content.IntentFilter r6 = new android.content.IntentFilter
            r6.<init>(r0)
            java.lang.String r7 = X.C19620yd.A0B
            android.os.Handler r8 = r1.A07
            r3.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x090f
        L_0x0977:
            java.lang.Object r7 = r6.A01
            X.2g6 r7 = (X.C55622g6) r7
            java.lang.Object r1 = r6.A02
            X.11C r1 = (X.AnonymousClass11C) r1
            X.2GW r10 = new X.2GW
            r10.<init>()
            X.18K r6 = r7.A02
            r0 = 0
            r5 = 0
            X.1Be r4 = r6.BDn(r10, r0)
            java.lang.Integer r0 = r4.A00
            if (r0 == 0) goto L_0x1055
            android.app.ActivityManager r2 = r1.A04()
            if (r2 == 0) goto L_0x1055
            r0 = 1
            int[] r1 = new int[r0]
            int r0 = android.os.Process.myPid()
            r1[r5] = r0
            android.os.Debug$MemoryInfo[] r3 = r2.getProcessMemoryInfo(r1)
            X.1Wc r2 = r7.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A00 = r0
            if (r3 == 0) goto L_0x1055
            int r0 = r3.length
            if (r0 == 0) goto L_0x1055
            r2 = r3[r5]
            int r0 = r2.getTotalPss()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A05 = r0
            int r0 = r2.getTotalPrivateDirty()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A02 = r0
            int r0 = r2.dalvikPrivateDirty
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A00 = r0
            int r0 = r2.nativePrivateDirty
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A01 = r0
            int r0 = r2.getTotalSharedDirty()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A03 = r0
            long r8 = android.os.SystemClock.uptimeMillis()
            X.1Hb r0 = r7.A01
            long r0 = r0.A00
            long r8 = r8 - r0
            double r2 = (double) r8
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r10.A04 = r0
            int r0 = java.lang.Thread.activeCount()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r10.A06 = r0
            r6.CC8(r10, r4)
            java.lang.Long r8 = r10.A06
            long r3 = r8.longValue()
            r1 = 140(0x8c, double:6.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a67
            X.190 r6 = r7.A00
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "too-many-threads"
            r6.A0G(r0, r1, r5)
            java.util.Map r1 = java.lang.Thread.getAllStackTraces()
            int r0 = r1.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r1)
        L_0x0a31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a67
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r0.getKey()
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r2 = r0.getName()
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L_0x0a63
            java.util.Set r0 = X.CGO.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0a31
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ThreadLeakDetector/detectAndReportThreadLeak detected:"
            X.C17900vP.A0e(r0, r2, r1)
            java.lang.String r0 = "thread-leak"
            r6.A0G(r0, r2, r5)
            goto L_0x0a31
        L_0x0a63:
            r4.add(r2)
            goto L_0x0a31
        L_0x0a67:
            X.10I r0 = r7.A04
            boolean r0 = r0 instanceof X.AnonymousClass10J
            if (r0 == 0) goto L_0x1055
            X.10P r0 = X.AnonymousClass10J.A05
            int r0 = r0.getLargestPoolSize()
            long r3 = (long) r0
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x1055
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x1055
            X.190 r2 = r7.A00
            java.lang.String r1 = "too-many-threads-waworkers"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A0G(r1, r0, r5)
            return
        L_0x0a8d:
            java.lang.Object r1 = r6.A01
            X.6xb r1 = (X.C138736xb) r1
            java.lang.Object r0 = r6.A02
            X.2h9 r1 = r1.A05
            java.util.List r2 = X.C18070vi.A0M(r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1055
            java.util.Set r0 = r1.A0J
            r40 = r0
            r0.addAll(r2)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x1055
            r2 = 1
            r1.A00 = r2
        L_0x0aad:
            boolean r0 = r40.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0e43
            r40.size()
            java.util.Iterator r0 = r40.iterator()
            X.21V r0 = X.C17880vN.A0b(r0)
            X.2rc r7 = r0.A02
            if (r7 == 0) goto L_0x0e3c
            java.io.File r3 = r7.A0G
            if (r3 == 0) goto L_0x0e3c
            r5 = 0
            boolean r6 = r0 instanceof X.C438421d
            if (r6 == 0) goto L_0x0ad5
            X.6ub r4 = r1.A0D
            boolean r4 = r4.A01(r7, r5)
            if (r4 != 0) goto L_0x0ae1
        L_0x0ad5:
            boolean r4 = r0 instanceof X.AnonymousClass21Y
            if (r4 == 0) goto L_0x0e3c
            X.6yx r4 = r1.A0F
            boolean r4 = r4.A02(r7)
            if (r4 == 0) goto L_0x0e3c
        L_0x0ae1:
            X.190 r4 = r1.A01
            r19 = r4
            java.lang.String r17 = X.C1402370n.A00(r3)
            X.C18070vi.A0X(r17)
            if (r6 == 0) goto L_0x0bd6
            android.net.Uri r10 = android.net.Uri.fromFile(r3)
            X.0ve r13 = r1.A09
            X.68e r7 = new X.68e
            r7.<init>(r13)
            X.1Sl r9 = r1.A0H
            java.lang.StringBuilder r5 = X.C17900vP.A0G()
            java.lang.String r4 = ".tmp"
            java.lang.String r8 = X.AnonymousClass000.A0y(r4, r5)
            long r4 = r3.length()
            java.io.File r16 = r9.A0k(r8, r4)
            X.1Nq r12 = r1.A0B     // Catch:{ Exception -> 0x0d00 }
            int r11 = r7.A00     // Catch:{ Exception -> 0x0d00 }
            android.graphics.BitmapFactory$Options r9 = r12.A09(r10, r11, r2, r2)     // Catch:{ Exception -> 0x0d00 }
            X.11Z r4 = r1.A05     // Catch:{ Exception -> 0x0d00 }
            r25 = r4
            r3.length()     // Catch:{ Exception -> 0x0d00 }
            X.18K r4 = r1.A0A     // Catch:{ Exception -> 0x0d00 }
            r5 = 0
            X.70S r8 = new X.70S     // Catch:{ Exception -> 0x0d00 }
            r8.<init>(r13, r4, r5, r2)     // Catch:{ Exception -> 0x0d00 }
            r4 = 8216(0x2018, float:1.1513E-41)
            r13.A0E(r4)     // Catch:{ Exception -> 0x0d00 }
            r4 = 8217(0x2019, float:1.1514E-41)
            r13.A0E(r4)     // Catch:{ Exception -> 0x0d00 }
            java.io.InputStream r4 = r12.A0A(r10, r2)     // Catch:{ OutOfMemoryError -> 0x0b67 }
            java.io.BufferedInputStream r14 = new java.io.BufferedInputStream     // Catch:{ OutOfMemoryError -> 0x0b67 }
            r14.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x0b67 }
            byte[] r15 = X.AnonymousClass1EY.A04(r14)     // Catch:{ all -> 0x0b5d }
            r13 = 0
            int r4 = r15.length     // Catch:{ all -> 0x0b5d }
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeByteArray(r15, r13, r4, r9)     // Catch:{ all -> 0x0b5d }
            if (r13 == 0) goto L_0x0b57
            int r4 = r13.getWidth()     // Catch:{ all -> 0x0b5d }
            if (r4 == 0) goto L_0x0b57
            int r4 = r13.getHeight()     // Catch:{ all -> 0x0b5d }
            if (r4 == 0) goto L_0x0b57
            android.graphics.Bitmap r19 = X.C26511Sk.A07(r13, r5, r11, r11)     // Catch:{ all -> 0x0b5d }
            r14.close()     // Catch:{ OutOfMemoryError -> 0x0b67 }
            goto L_0x0b83
        L_0x0b57:
            X.1iX r4 = new X.1iX     // Catch:{ all -> 0x0b5d }
            r4.<init>()     // Catch:{ all -> 0x0b5d }
            throw r4     // Catch:{ all -> 0x0b5d }
        L_0x0b5d:
            r13 = move-exception
            r14.close()     // Catch:{ all -> 0x0b62 }
            goto L_0x0b66
        L_0x0b62:
            r4 = move-exception
            X.AnonymousClass0DT.A00(r13, r4)     // Catch:{ OutOfMemoryError -> 0x0b67 }
        L_0x0b66:
            throw r13     // Catch:{ OutOfMemoryError -> 0x0b67 }
        L_0x0b67:
            r14 = move-exception
            int r4 = r9.inSampleSize     // Catch:{ Exception -> 0x0d00 }
            int r15 = r4 * 2
            r9.inSampleSize = r15     // Catch:{ Exception -> 0x0d00 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0d00 }
            java.lang.String r4 = "ImageProcessor/compressToFile/oom "
            java.lang.String r4 = X.AnonymousClass001.A1I(r4, r13, r15)     // Catch:{ Exception -> 0x0d00 }
            com.whatsapp.util.Log.i(r4, r14)     // Catch:{ Exception -> 0x0d00 }
            android.graphics.Bitmap r4 = X.C25291Nq.A00(r9, r10, r12, r2)     // Catch:{ Exception -> 0x0d00 }
            android.graphics.Bitmap r19 = X.C26511Sk.A07(r4, r5, r11, r11)     // Catch:{ Exception -> 0x0d00 }
        L_0x0b83:
            int r5 = r19.getWidth()     // Catch:{ Exception -> 0x0d00 }
            int r4 = r19.getHeight()     // Catch:{ Exception -> 0x0d00 }
            r8.A04(r5, r4)     // Catch:{ Exception -> 0x0d00 }
            r4 = 3
            X.64V r8 = r8.A01     // Catch:{ Exception -> 0x0d00 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d00 }
            r8.A0A = r4     // Catch:{ Exception -> 0x0d00 }
            int r5 = r7.A03     // Catch:{ Exception -> 0x0d00 }
            java.lang.Long r4 = X.C17880vN.A0n(r5)     // Catch:{ Exception -> 0x0d00 }
            r8.A0a = r4     // Catch:{ Exception -> 0x0d00 }
            r23 = 0
            com.whatsapp.media.transcode.Mozjpeg r18 = X.C60892om.A00     // Catch:{ IOException -> 0x0bbc }
            java.lang.String r20 = r16.getAbsolutePath()     // Catch:{ IOException -> 0x0bbc }
            r21 = r5
            r22 = r2
            r24 = r23
            r18.A00(r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0bbc }
            r19.recycle()     // Catch:{ Exception -> 0x0d00 }
            X.1NL r5 = r1.A0G     // Catch:{ Exception -> 0x0d00 }
            r4 = r16
            X.C64062u9.A0E(r5, r4, r3)     // Catch:{ Exception -> 0x0d00 }
            goto L_0x0d06
        L_0x0bbc:
            r11 = move-exception
            long r9 = r25.A01()     // Catch:{ all -> 0x0bd1 }
            int r4 = r7.A02     // Catch:{ all -> 0x0bd1 }
            long r4 = (long) r4     // Catch:{ all -> 0x0bd1 }
            r7 = 1024(0x400, double:5.06E-321)
            long r4 = r4 * r7
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0bd0
            java.lang.String r4 = "ImageProcessor/compressToFile/No space left on device"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x0bd1 }
        L_0x0bd0:
            throw r11     // Catch:{ all -> 0x0bd1 }
        L_0x0bd1:
            r4 = move-exception
            r19.recycle()     // Catch:{ Exception -> 0x0d00 }
            throw r4     // Catch:{ Exception -> 0x0d00 }
        L_0x0bd6:
            boolean r4 = r0 instanceof X.AnonymousClass21Y
            if (r4 == 0) goto L_0x0d09
            X.1Sl r10 = r1.A0H     // Catch:{ Exception -> 0x0cf9 }
            com.whatsapp.media.WamediaManager r7 = r10.A04     // Catch:{ Exception -> 0x0cf9 }
            X.71x r4 = new X.71x     // Catch:{ Exception -> 0x0cf9 }
            r4.<init>(r7, r3)     // Catch:{ Exception -> 0x0cf9 }
            int r13 = r4.A02     // Catch:{ Exception -> 0x0cf9 }
            int r9 = r4.A00     // Catch:{ Exception -> 0x0cf9 }
            if (r13 == 0) goto L_0x0d09
            if (r9 == 0) goto L_0x0d09
            X.1Sc r12 = r1.A0E     // Catch:{ Exception -> 0x0cf9 }
            r16 = 0
            X.2mD r5 = r12.A0C(r5, r5, r5)     // Catch:{ Exception -> 0x0cf9 }
            int r4 = r5.A00     // Catch:{ Exception -> 0x0cf9 }
            r39 = r4
            int r11 = r5.A02     // Catch:{ Exception -> 0x0cf9 }
            int r4 = r5.A01     // Catch:{ Exception -> 0x0cf9 }
            r38 = r4
            java.lang.StringBuilder r5 = X.C17900vP.A0G()     // Catch:{ Exception -> 0x0cf9 }
            java.lang.String r4 = ".tmp"
            java.lang.String r8 = X.AnonymousClass000.A0y(r4, r5)     // Catch:{ Exception -> 0x0cf9 }
            long r4 = r3.length()     // Catch:{ Exception -> 0x0cf9 }
            java.io.File r14 = r10.A0k(r8, r4)     // Catch:{ Exception -> 0x0cf9 }
            int r4 = java.lang.Math.max(r13, r9)     // Catch:{ Exception -> 0x0cf9 }
            int r10 = java.lang.Math.min(r11, r4)     // Catch:{ Exception -> 0x0cf9 }
            X.0ve r8 = r1.A09     // Catch:{ Exception -> 0x0cf9 }
            r5 = 4171(0x104b, float:5.845E-42)
            X.0vf r4 = X.C18040vf.A02     // Catch:{ Exception -> 0x0cf9 }
            int r15 = X.C18020vd.A00(r4, r8, r5)     // Catch:{ Exception -> 0x0cf9 }
            int r4 = java.lang.Math.min(r9, r13)     // Catch:{ Exception -> 0x0cf9 }
            if (r4 < r15) goto L_0x0c3d
            int r5 = java.lang.Math.max(r9, r13)     // Catch:{ Exception -> 0x0cf9 }
            r4 = 848(0x350, float:1.188E-42)
            if (r5 > r4) goto L_0x0c3d
            if (r13 <= r9) goto L_0x0c33
            r16 = 1
        L_0x0c33:
            int r31 = r15 + -8
            if (r16 == 0) goto L_0x0c38
            goto L_0x0c42
        L_0x0c38:
            int r13 = r13 * r31
            int r30 = r13 / r9
            goto L_0x0c48
        L_0x0c3d:
            r30 = 0
            r31 = 0
            goto L_0x0c48
        L_0x0c42:
            r30 = r31
            int r9 = r9 * r31
            int r31 = r9 / r13
        L_0x0c48:
            X.118 r9 = r1.A04     // Catch:{ Exception -> 0x0cf9 }
            android.content.Context r5 = r9.A00     // Catch:{ Exception -> 0x0cf9 }
            java.lang.String r4 = r3.getPath()     // Catch:{ Exception -> 0x0cf9 }
            r32 = 0
            X.CXd r4 = X.C25872Cng.A01(r5, r4)     // Catch:{ Exception -> 0x0cf9 }
            if (r4 != 0) goto L_0x0c70
            X.71x r4 = new X.71x     // Catch:{ 1Se -> 0x0c66 }
            r4.<init>(r7, r3)     // Catch:{ 1Se -> 0x0c66 }
            int r5 = r4.A02     // Catch:{ 1Se -> 0x0c66 }
            int r4 = r4.A00     // Catch:{ 1Se -> 0x0c66 }
            android.util.Pair r5 = X.C26431Sc.A03(r5, r4, r10)     // Catch:{ 1Se -> 0x0c66 }
            goto L_0x0c88
        L_0x0c66:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0cf9 }
            android.util.Pair r5 = new android.util.Pair     // Catch:{ Exception -> 0x0cf9 }
            r5.<init>(r4, r4)     // Catch:{ Exception -> 0x0cf9 }
            goto L_0x0c88
        L_0x0c70:
            java.lang.Integer r7 = X.C50322Tz.A00(r10)     // Catch:{ Exception -> 0x0cf9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r32)     // Catch:{ Exception -> 0x0cf9 }
            X.ClM r7 = X.C26431Sc.A06(r4, r7, r5, r5)     // Catch:{ Exception -> 0x0cf9 }
            int r4 = r7.A0A     // Catch:{ Exception -> 0x0cf9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0cf9 }
            int r4 = r7.A08     // Catch:{ Exception -> 0x0cf9 }
            android.util.Pair r5 = X.C17890vO.A0E(r5, r4)     // Catch:{ Exception -> 0x0cf9 }
        L_0x0c88:
            java.lang.Object r7 = r5.first     // Catch:{ Exception -> 0x0cf9 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0cf9 }
            java.lang.Object r5 = r5.second     // Catch:{ Exception -> 0x0cf9 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0cf9 }
            X.10I r4 = r1.A0I     // Catch:{ Exception -> 0x0cf9 }
            r37 = r4
            com.whatsapp.media.WamediaManager r4 = r1.A0C     // Catch:{ Exception -> 0x0cf9 }
            r16 = r4
            X.1NM r15 = r1.A03     // Catch:{ Exception -> 0x0cf9 }
            r4 = 0
            r36 = 0
            r28 = r4
            r29 = r4
            r34 = r32
            r35 = r32
            X.CmO r26 = new X.CmO     // Catch:{ Exception -> 0x0cf9 }
            r27 = r4
            r33 = r32
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x0cf9 }
            X.18K r13 = r1.A0A     // Catch:{ Exception -> 0x0cf9 }
            X.70S r10 = new X.70S     // Catch:{ Exception -> 0x0cf9 }
            r10.<init>(r8, r13, r4, r2)     // Catch:{ Exception -> 0x0cf9 }
            r32 = 0
            X.DPW r4 = new X.DPW     // Catch:{ Exception -> 0x0cf9 }
            r18 = r4
            r20 = r10
            r21 = r15
            r22 = r9
            r23 = r8
            r24 = r16
            r25 = r12
            r27 = r37
            r28 = r3
            r29 = r14
            r30 = r11
            r31 = r38
            r34 = r32
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36)     // Catch:{ Exception -> 0x0cf9 }
            X.C18070vi.A0b(r7)     // Catch:{ Exception -> 0x0cf9 }
            int r8 = r7.intValue()     // Catch:{ Exception -> 0x0cf9 }
            X.C18070vi.A0b(r5)     // Catch:{ Exception -> 0x0cf9 }
            int r9 = r5.intValue()     // Catch:{ Exception -> 0x0cf9 }
            r10 = 9
            r7 = r39
            r11 = r32
            float r5 = X.C26431Sc.A00(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0cf9 }
            r4.A00 = r5     // Catch:{ Exception -> 0x0cf9 }
            r4.A04()     // Catch:{ Exception -> 0x0cf9 }
            X.1NL r4 = r1.A0G     // Catch:{ Exception -> 0x0cf9 }
            X.C64062u9.A0E(r4, r14, r3)     // Catch:{ Exception -> 0x0cf9 }
            goto L_0x0d09
        L_0x0cf9:
            r5 = move-exception
            java.lang.String r4 = "HdMediaCompressManager/compressVideo/failure"
            com.whatsapp.util.Log.e(r4, r5)
            goto L_0x0d09
        L_0x0d00:
            r5 = move-exception
            java.lang.String r4 = "HdMediaCompressManager/compressImage/failure"
            com.whatsapp.util.Log.e(r4, r5)
        L_0x0d06:
            r16.delete()
        L_0x0d09:
            java.lang.String r7 = r0.A05
            if (r7 == 0) goto L_0x0d8b
            X.1ST r5 = r1.A07
            int r4 = r0.A0u
            java.util.ArrayList r4 = r5.A0E(r7, r4)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r4.iterator()
        L_0x0d1d:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0d2f
            java.lang.Object r5 = r7.next()
            boolean r4 = r5 instanceof X.AnonymousClass21V
            if (r4 == 0) goto L_0x0d1d
            r8.add(r5)
            goto L_0x0d1d
        L_0x0d2f:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r8.iterator()
        L_0x0d37:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0d8d
            java.lang.Object r8 = r11.next()
            r9 = r8
            X.21V r9 = (X.AnonymousClass21V) r9
            X.205 r5 = r9.A0v
            X.205 r4 = r0.A0v
            boolean r4 = X.C18070vi.A18(r5, r4)
            if (r4 != 0) goto L_0x0d37
            java.lang.String r5 = r9.A05
            r4 = r17
            boolean r4 = X.C18070vi.A18(r5, r4)
            if (r4 == 0) goto L_0x0d37
            X.2rc r10 = r9.A02
            r5 = 0
            if (r10 == 0) goto L_0x0d37
            boolean r4 = r9 instanceof X.C438421d
            if (r4 == 0) goto L_0x0d69
            X.6ub r4 = r1.A0D
            boolean r4 = r4.A01(r10, r5)
            if (r4 != 0) goto L_0x0d75
        L_0x0d69:
            boolean r4 = r9 instanceof X.AnonymousClass21Y
            if (r4 == 0) goto L_0x0d37
            X.6yx r4 = r1.A0F
            boolean r4 = r4.A02(r10)
            if (r4 == 0) goto L_0x0d37
        L_0x0d75:
            X.2rc r5 = r9.A02
            if (r5 == 0) goto L_0x0d37
            boolean r4 = r5.A0V
            if (r4 == 0) goto L_0x0d37
            java.io.File r4 = r5.A0G
            if (r4 == 0) goto L_0x0d37
            boolean r4 = r4.exists()
            if (r4 != r2) goto L_0x0d37
            r7.add(r8)
            goto L_0x0d37
        L_0x0d8b:
            X.0wS r7 = X.C18460wS.A00
        L_0x0d8d:
            r7.size()
            r5 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            if (r6 == 0) goto L_0x0e14
            java.lang.String r4 = r3.getAbsolutePath()
            X.6r5 r6 = X.AnonymousClass204.A0D(r4, r5)
            if (r6 == 0) goto L_0x0e35
            int r4 = r6.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r4 = r6.A00
            X.1D6 r6 = X.AnonymousClass1D6.A00(r5, r4)
        L_0x0dad:
            java.lang.Object r4 = r6.first
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            java.lang.Object r4 = r6.second
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            java.util.List r4 = X.C18070vi.A0M(r0)
            java.util.ArrayList r5 = X.C29431cG.A0k(r7, r4)
            java.lang.Object r4 = r6.first
            int r9 = X.AnonymousClass000.A0M(r4)
            java.lang.Object r4 = r6.second
            int r8 = X.AnonymousClass000.A0M(r4)
            java.util.Iterator r10 = r5.iterator()
        L_0x0dd3:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0e3c
            X.21V r7 = X.C17880vN.A0b(r10)
            X.2rc r6 = r7.A02
            if (r6 == 0) goto L_0x0ded
            r6.A08 = r9
            r6.A06 = r8
            long r4 = r3.length()
            r6.A0A = r4
            r6.A0U = r2
        L_0x0ded:
            java.lang.String r4 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4)
            android.net.Uri r4 = android.net.Uri.fromFile(r3)
            r5.setData(r4)
            X.118 r4 = r1.A04
            android.content.Context r4 = r4.A00
            r4.sendBroadcast(r5)
            X.1Nt r4 = r1.A06
            r4.A05(r7)
            X.1KB r6 = r1.A02
            r5 = 46
            X.7Qr r4 = new X.7Qr
            r4.<init>(r1, r7, r5)
            r6.A0J(r4)
            goto L_0x0dd3
        L_0x0e14:
            boolean r4 = r0 instanceof X.AnonymousClass21Y
            if (r4 == 0) goto L_0x0e35
            X.1Sl r4 = r1.A0H     // Catch:{ Exception -> 0x0e2e }
            com.whatsapp.media.WamediaManager r4 = r4.A04     // Catch:{ Exception -> 0x0e2e }
            X.71x r6 = new X.71x     // Catch:{ Exception -> 0x0e2e }
            r6.<init>(r4, r3)     // Catch:{ Exception -> 0x0e2e }
            int r4 = r6.A02     // Catch:{ Exception -> 0x0e2e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0e2e }
            int r4 = r6.A00     // Catch:{ Exception -> 0x0e2e }
            X.1D6 r6 = X.AnonymousClass1D6.A00(r5, r4)     // Catch:{ Exception -> 0x0e2e }
            goto L_0x0dad
        L_0x0e2e:
            X.1D6 r6 = new X.1D6
            r6.<init>(r8, r8)
            goto L_0x0dad
        L_0x0e35:
            X.1D6 r6 = new X.1D6
            r6.<init>(r8, r8)
            goto L_0x0dad
        L_0x0e3c:
            r3 = r40
            r3.remove(r0)
            goto L_0x0aad
        L_0x0e43:
            r0 = 0
            r1.A00 = r0
            return
        L_0x0e47:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.Object r1 = r6.A02
            X.6xb r1 = (X.C138736xb) r1
            X.1FL r0 = r0.A1B()
            if (r0 == 0) goto L_0x1055
            r0.invalidateOptionsMenu()
            X.00H r0 = r1.A0W
            java.lang.Object r0 = r0.get()
            X.2i4 r0 = (X.C56812i4) r0
            X.19a r1 = r0.A00
            r0 = 2
            r1.A0C(r0)
            return
        L_0x0e67:
            java.lang.Object r1 = r6.A01
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r4 = r6.A02
            X.206 r4 = (X.AnonymousClass206) r4
            int r0 = r4.A0u
            r3 = 2
            r2 = 3
            if (r0 == r2) goto L_0x0e76
            r2 = 2
        L_0x0e76:
            X.1hP r1 = r1.A0k
            boolean r0 = X.C22971Dz.A0f(r4)
            if (r0 != 0) goto L_0x0e7f
            r3 = 1
        L_0x0e7f:
            r1.A02(r2, r3)
            return
        L_0x0e83:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.Object r7 = r6.A02
            X.206 r7 = (X.AnonymousClass206) r7
            android.content.Context r1 = r0.A1n()
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r6 = X.C18050vg.A01(r1, r0)
            X.1FL r6 = (X.AnonymousClass1FL) r6
            X.8BG r5 = X.C63892tr.A01(r7)
            if (r6 == 0) goto L_0x1055
            if (r5 == 0) goto L_0x1055
            X.1BI r4 = X.AnonymousClass205.A00(r7)
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            r1 = 1
            r0 = 0
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r2 = new com.whatsapp.reactions.ReactionsBottomSheetDialogFragment
            r2.<init>()
            r2.A0I = r4
            r2.A0J = r7
            r2.A05 = r5
            r2.A0A = r0
            r2.A0Q = r3
            r2.A0P = r1
            X.1Gb r0 = r6.A03
            X.1GO r0 = r0.A00
            X.1GP r1 = r0.A03
            java.lang.String r0 = "reaction_sheet"
            r2.A2C(r1, r0)
            return
        L_0x0ec6:
            java.lang.Object r0 = r6.A01
            X.6so r0 = (X.C135816so) r0
            java.lang.Object r2 = r6.A02
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r2 = (com.whatsapp.mediaview.MediaViewCurrentMessageViewModel) r2
            X.21V r1 = r0.A01
            X.1DT r7 = r2.A00
            java.lang.Object r6 = r7.A06()
            X.6so r6 = (X.C135816so) r6
            r5 = 0
            if (r6 == 0) goto L_0x0f06
            X.21V r0 = r6.A01
        L_0x0edd:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x1055
            X.8BG r4 = X.C63892tr.A01(r1)
            X.8BG r3 = X.C63892tr.A01(r1)
            if (r3 == 0) goto L_0x0ef9
            X.11S r0 = r2.A02
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass11S.A01(r0)
            long r0 = r1.A0x
            java.lang.String r5 = r3.BXu(r2, r0)
        L_0x0ef9:
            X.21V r2 = r6.A01
            boolean r1 = r6.A03
            X.6so r0 = new X.6so
            r0.<init>(r4, r2, r5, r1)
            r7.A0F(r0)
            return
        L_0x0f06:
            r0 = r5
            goto L_0x0edd
        L_0x0f08:
            java.lang.Object r5 = r6.A01
            com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment r5 = (com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment) r5
            java.lang.Object r6 = r6.A02
            java.util.Map r6 = (java.util.Map) r6
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            java.util.SortedMap r0 = r5.A03
            java.util.Iterator r7 = X.AnonymousClass000.A15(r0)
        L_0x0f1a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1055
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r7)
            java.lang.Object r4 = r0.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r0 = r0.getValue()
            X.6r7 r0 = (X.C134766r7) r0
            int r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass000.A0w(r6, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0f1a
            long r1 = r0.longValue()
            android.view.View r3 = r5.A0B
            if (r3 == 0) goto L_0x0f1a
            X.C18070vi.A0b(r4)
            int r0 = r4.intValue()
            android.view.View r4 = r3.findViewById(r0)
            com.whatsapp.radio.RadioButtonWithSubtitle r4 = (com.whatsapp.radio.RadioButtonWithSubtitle) r4
            if (r4 == 0) goto L_0x0f1a
            java.lang.CharSequence r3 = r4.A00
            X.0vb r0 = r5.A03
            if (r0 == 0) goto L_0x0f74
            java.lang.String r2 = X.C88584aA.A02(r0, r1)
            if (r3 == 0) goto L_0x0f70
            if (r2 == 0) goto L_0x0f6f
            r1 = 2131891932(0x7f1216dc, float:1.9418598E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.AnonymousClass001.A1Q(r3, r2, r0)
            java.lang.String r0 = r5.A1I(r1, r0)
            if (r0 == 0) goto L_0x0f6f
            r3 = r0
        L_0x0f6f:
            r2 = r3
        L_0x0f70:
            r4.setSubTitle(r2)
            goto L_0x0f1a
        L_0x0f74:
            java.lang.String r0 = "whatsAppLocale"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0f7c:
            java.lang.Object r0 = r6.A01
            X.7G2 r0 = (X.AnonymousClass7G2) r0
            java.lang.Object r7 = r6.A02
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            X.5kz r6 = r0.A00
            r0 = 0
            r6.A00 = r0
            java.util.Iterator r5 = X.C17890vO.A0k(r7)
            r4 = 0
        L_0x0f8e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0fc2
            java.lang.Object r1 = r5.next()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = X.C137726vv.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            X.6ry r0 = (X.C135296ry) r0
            int r3 = r0.A00
            r0 = 1
            int r3 = r3 - r0
            java.lang.Object r0 = r7.get(r1)
            if (r3 < 0) goto L_0x0f8e
            boolean r2 = X.AnonymousClass000.A1W(r0)
            boolean[] r1 = r6.A02
            boolean r0 = r1[r3]
            if (r2 == r0) goto L_0x0fbf
            r4 = 1
        L_0x0fbf:
            r1[r3] = r2
            goto L_0x0f8e
        L_0x0fc2:
            if (r4 == 0) goto L_0x1055
            r6.notifyDataSetChanged()
            return
        L_0x0fc8:
            java.lang.Object r3 = r6.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            java.lang.Object r2 = r6.A02
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            boolean r1 = X.C18070vi.A16(r3, r2)
            X.5dT r0 = r3.A0P
            if (r0 == 0) goto L_0x0fdd
            r0.A04 = r1
            r0.invalidateSelf()
        L_0x0fdd:
            android.widget.ImageView r0 = r3.A08
            if (r0 == 0) goto L_0x1055
            r0.setImageDrawable(r2)
            return
        L_0x0fe5:
            java.lang.Object r5 = r6.A01
            X.8BD r5 = (X.AnonymousClass8BD) r5
            java.lang.Object r4 = r6.A02
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r4
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A05
            java.lang.String r3 = "doodleEditText"
            if (r0 == 0) goto L_0x1011
            android.text.Editable r2 = r0.getEditableText()
            X.C18070vi.A0X(r2)
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A05
            if (r0 == 0) goto L_0x1011
            int r1 = r0.getWidthWithoutPadding()
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A05
            if (r0 == 0) goto L_0x1011
            android.text.TextPaint r0 = r0.getPaint()
            X.C18070vi.A0X(r0)
            r5.BLM(r2, r1)
            return
        L_0x1011:
            X.C18070vi.A11(r3)
            r0 = 0
            throw r0
        L_0x1016:
            java.lang.Object r2 = r6.A01
            X.6Ic r2 = (X.AnonymousClass6Ic) r2
            java.lang.Object r1 = r6.A02
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r2.A00 = r0
            android.view.View r0 = r2.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x1055
            X.5iA r0 = r2.A02
            java.lang.String r2 = r1.toString()
            X.1vp r1 = r0.A02
            java.lang.Object r0 = r1.A06()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x1055
            r1.A0F(r2)
            return
        L_0x103f:
            r8 = r0
        L_0x1040:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
        L_0x1044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PreacksQueue/removeDeliveredPreacks lastDeliveredRowId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " deletedCount="
            X.C17900vP.A0Y(r2, r0, r1)
        L_0x1055:
            return
        L_0x1056:
            java.lang.Object r0 = r6.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            java.lang.Object r1 = r6.A02
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            android.view.View r0 = r0.A03
            r0.setLayoutParams(r1)
            return
        L_0x1064:
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r6.A02
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.setLayoutParams(r0)
            return
        L_0x1070:
            java.lang.Object r4 = r6.A01
            X.67s r4 = (X.C1193367s) r4
            java.lang.Object r0 = r6.A02
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.7JE r0 = (X.AnonymousClass7JE) r0
            X.77d r3 = r0.A00
            java.lang.String r2 = r3.A0F
            X.C17960vV.A07(r2)
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x1090
            int r1 = r3.A01
            r0 = 1
            if (r1 == r0) goto L_0x1090
            X.1SB r0 = r4.A01
            r0.A09(r3)
            return
        L_0x1090:
            X.1Ns r1 = r4.A00
            java.lang.String r0 = r3.A0E
            r1.A03(r2, r0)
            return
        L_0x1098:
            java.lang.Object r1 = r6.A01
            X.67s r1 = (X.C1193367s) r1
            java.lang.Object r0 = r6.A02
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.7JE r0 = (X.AnonymousClass7JE) r0
            X.77d r0 = r0.A00
            X.1Ns r2 = r1.A00
            java.lang.String r1 = r0.A0F
            X.C17960vV.A07(r1)
            java.lang.String r0 = r0.A0E
            r2.A07(r1, r0)
            return
        L_0x10b1:
            java.lang.Object r3 = r6.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = (com.whatsapp.mediacomposer.MediaComposerActivity) r3
            java.lang.Object r0 = r6.A02
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x10bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x10dd
            java.lang.Object r1 = r2.next()
            X.72S r1 = (X.AnonymousClass72S) r1
            if (r1 == 0) goto L_0x10bd
            java.io.File r0 = r1.A0A()
            if (r0 == 0) goto L_0x10bd
            java.io.File r0 = r1.A0A()
            java.lang.String r0 = X.C64062u9.A07(r0)
            r1.A0Q(r0)
            goto L_0x10bd
        L_0x10dd:
            X.1DT r1 = r3.A1p
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r1.A0E(r0)
            return
        L_0x10e7:
            java.lang.Object r1 = r6.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            java.lang.Object r0 = r6.A02
            X.72S r0 = (X.AnonymousClass72S) r0
            com.whatsapp.mediacomposer.MediaComposerActivity.A0y(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70643By.run():void");
    }
}
