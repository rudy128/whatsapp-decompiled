package X;

/* renamed from: X.1WV  reason: invalid class name */
public class AnonymousClass1WV implements Runnable {
    public long A00 = 0;
    public final AnonymousClass11P A01;
    public final AnonymousClass122 A02;
    public final C26141Qz A03;
    public final AnonymousClass1Q9 A04;
    public final AnonymousClass1Q2 A05;
    public final AnonymousClass1WO A06;
    public final C26111Qw A07;
    public final AnonymousClass1WN A08;
    public final AnonymousClass1WM A09;
    public final C202711m A0A;
    public final int A0B;
    public final AnonymousClass190 A0C;
    public final AnonymousClass1LW A0D;
    public final AnonymousClass1WU A0E;
    public final C18030ve A0F;
    public final AnonymousClass1W6 A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x040a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x040f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0515, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0519, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x051c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0520, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0540, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0541, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0544, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0183, code lost:
        if (r0 != null) goto L_0x0185;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:126:0x0372, B:139:0x03b6] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x052c A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137 A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0196 A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c0 A[Catch:{ all -> 0x0532 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(long r22, int r24) {
        /*
            r21 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "EphemeralUpdateRunnable/processMessages type: "
            r3.append(r0)
            r9 = r24
            r3.append(r9)
            java.lang.String r0 = " time: "
            r3.append(r0)
            r1 = r22
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r21
            int r0 = r6.A0B
            r20 = r0
            if (r24 == 0) goto L_0x00e8
            r0 = 2
            if (r9 == r0) goto L_0x009f
            r0 = 3
            if (r9 == r0) goto L_0x0069
            r0 = 4
            if (r9 != r0) goto L_0x0061
            X.11m r0 = r6.A0A
            X.1Cd r0 = r0.A03
            X.1at r8 = r0.get()
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005c }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x005c }
            java.lang.String r5 = X.C63702tY.A05     // Catch:{ all -> 0x005c }
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x005c }
            java.lang.String r3 = java.lang.Long.toString(r1)     // Catch:{ all -> 0x005c }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x005c }
            java.lang.String r3 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x005c }
            r0 = 1
            r4[r0] = r3     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "GET_EXPIRED_MESSAGE_ADDON_PARENT_KEY_SQL"
            android.database.Cursor r4 = r7.A0A(r5, r0, r4)     // Catch:{ all -> 0x005c }
            r8.close()
            goto L_0x0127
        L_0x005c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0539 }
            throw r1
        L_0x0061:
            java.lang.String r1 = "Invalid job type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0069:
            X.1WN r3 = r6.A08
            X.1Cd r0 = r3.A00
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x053e }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x053e }
            X.0ve r4 = r3.A01     // Catch:{ all -> 0x053e }
            r3 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x053e }
            boolean r3 = X.C18020vd.A05(r0, r4, r3)     // Catch:{ all -> 0x053e }
            r0 = 1
            if (r3 != r0) goto L_0x009c
            java.lang.String r5 = X.C50982Wn.A05     // Catch:{ all -> 0x053e }
        L_0x0085:
            X.C18070vi.A0Z(r5)     // Catch:{ all -> 0x053e }
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x053e }
            java.lang.String r3 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x053e }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x053e }
            java.lang.String r0 = "GET_EXPIRED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r4 = r8.A0A(r5, r0, r4)     // Catch:{ all -> 0x053e }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x053e }
            goto L_0x0124
        L_0x009c:
            java.lang.String r5 = X.C50982Wn.A04     // Catch:{ all -> 0x053e }
            goto L_0x0085
        L_0x009f:
            X.1WN r5 = r6.A08
            X.00H r0 = r5.A02
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            r3 = 1209600000(0x48190800, double:5.97621805E-315)
            long r10 = r22 - r3
            X.1Cd r0 = r5.A00
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x053e }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x053e }
            X.0ve r4 = r5.A01     // Catch:{ all -> 0x053e }
            r3 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x053e }
            boolean r3 = X.C18020vd.A05(r0, r4, r3)     // Catch:{ all -> 0x053e }
            r0 = 1
            if (r3 != r0) goto L_0x00e5
            java.lang.String r5 = X.C50982Wn.A01     // Catch:{ all -> 0x053e }
        L_0x00c7:
            X.C18070vi.A0Z(r5)     // Catch:{ all -> 0x053e }
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x053e }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x053e }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x053e }
            java.lang.String r3 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x053e }
            r0 = 1
            r4[r0] = r3     // Catch:{ all -> 0x053e }
            java.lang.String r0 = "GET_EXPIRED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r4 = r8.A0A(r5, r0, r4)     // Catch:{ all -> 0x053e }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x053e }
            goto L_0x0124
        L_0x00e5:
            java.lang.String r5 = X.C50982Wn.A00     // Catch:{ all -> 0x053e }
            goto L_0x00c7
        L_0x00e8:
            X.1Qz r3 = r6.A03
            X.1Cd r0 = r3.A04
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x053e }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x053e }
            X.0ve r4 = r3.A09     // Catch:{ all -> 0x053e }
            r3 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x053e }
            boolean r0 = X.C18020vd.A05(r0, r4, r3)     // Catch:{ all -> 0x053e }
            if (r0 == 0) goto L_0x0121
            java.lang.String r5 = X.AnonymousClass2WL.A01     // Catch:{ all -> 0x053e }
        L_0x0103:
            X.C18070vi.A0Z(r5)     // Catch:{ all -> 0x053e }
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x053e }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x053e }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x053e }
            java.lang.String r3 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x053e }
            r0 = 1
            r4[r0] = r3     // Catch:{ all -> 0x053e }
            java.lang.String r0 = "GET_EXPIRED_EPHEMERAL_MESSAGES_SQL"
            android.database.Cursor r4 = r8.A0A(r5, r0, r4)     // Catch:{ all -> 0x053e }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x053e }
            goto L_0x0124
        L_0x0121:
            java.lang.String r5 = X.AnonymousClass2WL.A00     // Catch:{ all -> 0x053e }
            goto L_0x0103
        L_0x0124:
            r7.close()
        L_0x0127:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0532 }
            r3.<init>()     // Catch:{ all -> 0x0532 }
            r11 = 0
            r10 = 0
            r19 = 0
            r5 = 0
        L_0x0131:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0194
            X.1LW r12 = r6.A0D     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "chat_row_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0532 }
            long r7 = r4.getLong(r0)     // Catch:{ all -> 0x0532 }
            X.1BI r8 = r12.A0B(r7)     // Catch:{ all -> 0x0532 }
            if (r8 != 0) goto L_0x016c
            int r11 = r11 + 1
            X.1Q9 r0 = r6.A04     // Catch:{ all -> 0x0532 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x0532 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0131
            X.1W6 r12 = r6.A0G     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0532 }
            long r7 = r4.getLong(r0)     // Catch:{ all -> 0x0532 }
            X.1W2 r0 = r12.A01     // Catch:{ all -> 0x0532 }
            X.206 r0 = r0.A03(r7)     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x018b
            int r10 = r10 + 1
            goto L_0x0185
        L_0x016c:
            X.1Q9 r0 = r6.A04     // Catch:{ all -> 0x0532 }
            java.util.Map r7 = r0.A02     // Catch:{ all -> 0x0532 }
            java.lang.Object r0 = r7.get(r8)     // Catch:{ all -> 0x0532 }
            if (r0 != 0) goto L_0x0191
            r0 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0532 }
            if (r0 != 0) goto L_0x0191
            X.1W6 r0 = r6.A0G     // Catch:{ all -> 0x0532 }
            X.206 r0 = r0.A02(r4, r8)     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x018b
        L_0x0185:
            int r5 = r5 + 1
            r3.add(r0)     // Catch:{ all -> 0x0532 }
            goto L_0x0131
        L_0x018b:
            java.lang.String r0 = "EphemeralUpdateRunnable/failed to get message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0532 }
            goto L_0x0131
        L_0x0191:
            r19 = 2
            goto L_0x0131
        L_0x0194:
            if (r11 <= 0) goto L_0x01ba
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0532 }
            r7.<init>()     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "EphemeralUpdateRunnable/processMessages/null_jid count: "
            r7.append(r0)     // Catch:{ all -> 0x0532 }
            r7.append(r11)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "; type: "
            r7.append(r0)     // Catch:{ all -> 0x0532 }
            r7.append(r9)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "; foundMsg: "
            r7.append(r0)     // Catch:{ all -> 0x0532 }
            r7.append(r10)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0532 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0532 }
        L_0x01ba:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0532 }
            if (r0 != 0) goto L_0x0528
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0532 }
            r7.<init>()     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "EphemeralUpdateRunnable/performJobAction: jobType:"
            r7.append(r0)     // Catch:{ all -> 0x0532 }
            r7.append(r9)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = " num:"
            r7.append(r0)     // Catch:{ all -> 0x0532 }
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            r7.append(r0)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0532 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0532 }
            if (r24 == 0) goto L_0x0521
            r0 = 1
            if (r9 == r0) goto L_0x0528
            r0 = 2
            if (r9 == r0) goto L_0x044f
            r0 = 3
            if (r9 == r0) goto L_0x0448
            X.1WM r9 = r6.A09     // Catch:{ all -> 0x0532 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0532 }
            if (r0 != 0) goto L_0x0377
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0532 }
            r10.<init>()     // Catch:{ all -> 0x0532 }
            r8 = 0
        L_0x01f9:
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            if (r8 >= r0) goto L_0x0212
            int r7 = r8 + 100
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            int r0 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x0532 }
            java.util.List r0 = r3.subList(r8, r0)     // Catch:{ all -> 0x0532 }
            r10.add(r0)     // Catch:{ all -> 0x0532 }
            r8 = r7
            goto L_0x01f9
        L_0x0212:
            java.util.Iterator r18 = r10.iterator()     // Catch:{ all -> 0x0532 }
        L_0x0216:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0377
            java.lang.Object r0 = r18.next()     // Catch:{ all -> 0x0532 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0532 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0532 }
            r10.<init>()     // Catch:{ all -> 0x0532 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0532 }
        L_0x022b:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0241
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0532 }
            X.206 r11 = (X.AnonymousClass206) r11     // Catch:{ all -> 0x0532 }
            long r7 = r11.A0x     // Catch:{ all -> 0x0532 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0532 }
            r10.put(r0, r11)     // Catch:{ all -> 0x0532 }
            goto L_0x022b
        L_0x0241:
            X.11m r11 = r9.A0E     // Catch:{ all -> 0x0532 }
            java.util.Set r17 = r10.keySet()     // Catch:{ all -> 0x0532 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0532 }
            r8.<init>()     // Catch:{ all -> 0x0532 }
            int r0 = r17.size()     // Catch:{ all -> 0x0532 }
            int r0 = r0 + 1
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x0532 }
            java.util.Iterator r16 = r17.iterator()     // Catch:{ all -> 0x0532 }
            r15 = 0
        L_0x0259:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0273
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0532 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0532 }
            long r13 = r0.longValue()     // Catch:{ all -> 0x0532 }
            int r7 = r15 + 1
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0532 }
            r12[r15] = r0     // Catch:{ all -> 0x0532 }
            r15 = r7
            goto L_0x0259
        L_0x0273:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0532 }
            r12[r15] = r0     // Catch:{ all -> 0x0532 }
            X.1Cd r0 = r11.A03     // Catch:{ all -> 0x0532 }
            X.1at r16 = r0.get()     // Catch:{ all -> 0x0532 }
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0371 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0371 }
            int r13 = r17.size()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = X.C63702tY.A01     // Catch:{ all -> 0x0371 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
            r7.<init>()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = " WHERE parent_message_row_id IN "
            r7.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r13)     // Catch:{ all -> 0x0371 }
            r7.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = " AND "
            r7.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)"
            r7.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.String r13 = r7.toString()     // Catch:{ all -> 0x0371 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
            r7.<init>()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "SELECT parent_message_row_id, message_add_on_type,  COUNT(1) as 'count' FROM message_add_on"
            r7.append(r0)     // Catch:{ all -> 0x0371 }
            r7.append(r13)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = " GROUP BY parent_message_row_id, message_add_on_type HAVING count>0"
            r7.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "GET_MESSAGE_ADDON_TYPES_PER_PARENT_MESSAGE"
            android.database.Cursor r12 = r11.A0A(r7, r0, r12)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "parent_message_row_id"
            int r13 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = "message_add_on_type"
            int r11 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0365 }
        L_0x02d2:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x031c
            long r14 = r12.getLong(r13)     // Catch:{ all -> 0x0365 }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0365 }
            int r14 = r12.getInt(r11)     // Catch:{ all -> 0x0365 }
            r15 = 1
            X.7T0 r0 = new X.7T0     // Catch:{ all -> 0x0365 }
            r0.<init>(r15)     // Catch:{ all -> 0x0365 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0365 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x02d2
            X.7T0 r0 = new X.7T0     // Catch:{ all -> 0x0365 }
            r0.<init>(r15)     // Catch:{ all -> 0x0365 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x0365 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0365 }
            int r14 = r0.intValue()     // Catch:{ all -> 0x0365 }
            boolean r0 = r8.containsKey(r7)     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0314
            java.lang.Object r0 = r8.get(r7)     // Catch:{ all -> 0x0365 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0365 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0365 }
            r14 = r14 | r0
        L_0x0314:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0365 }
            r8.put(r7, r0)     // Catch:{ all -> 0x0365 }
            goto L_0x02d2
        L_0x031c:
            r12.close()     // Catch:{ all -> 0x0371 }
            r16.close()     // Catch:{ all -> 0x0532 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ all -> 0x0532 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0532 }
        L_0x032a:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0216
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0532 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0532 }
            java.lang.Object r7 = r0.getKey()     // Catch:{ all -> 0x0532 }
            java.lang.Object r10 = r0.getValue()     // Catch:{ all -> 0x0532 }
            X.206 r10 = (X.AnonymousClass206) r10     // Catch:{ all -> 0x0532 }
            int r11 = r10.A08     // Catch:{ all -> 0x0532 }
            boolean r0 = r8.containsKey(r7)     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0363
            java.lang.Object r0 = r8.get(r7)     // Catch:{ all -> 0x0532 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0532 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0532 }
        L_0x0352:
            r0 = r0 ^ -1
            int r7 = r10.A08     // Catch:{ all -> 0x0532 }
            r0 = r0 ^ -1
            r0 = r0 & r7
            r10.A08 = r0     // Catch:{ all -> 0x0532 }
            if (r11 == r0) goto L_0x032a
            X.121 r0 = r9.A06     // Catch:{ all -> 0x0532 }
            r0.CQv(r10)     // Catch:{ all -> 0x0532 }
            goto L_0x032a
        L_0x0363:
            r0 = 0
            goto L_0x0352
        L_0x0365:
            r1 = move-exception
            if (r12 == 0) goto L_0x0370
            r12.close()     // Catch:{ all -> 0x036c }
            goto L_0x0370
        L_0x036c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0371 }
        L_0x0370:
            throw r1     // Catch:{ all -> 0x0371 }
        L_0x0371:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x040f }
            goto L_0x0413
        L_0x0377:
            X.11m r11 = r6.A0A     // Catch:{ all -> 0x0532 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0532 }
            if (r0 != 0) goto L_0x0414
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0532 }
            r9.<init>()     // Catch:{ all -> 0x0532 }
            r17 = 0
            r8 = 0
        L_0x0387:
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            if (r8 >= r0) goto L_0x03a0
            int r7 = r8 + 100
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            int r0 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x0532 }
            java.util.List r0 = r3.subList(r8, r0)     // Catch:{ all -> 0x0532 }
            r9.add(r0)     // Catch:{ all -> 0x0532 }
            r8 = r7
            goto L_0x0387
        L_0x03a0:
            java.util.Iterator r16 = r9.iterator()     // Catch:{ all -> 0x0532 }
        L_0x03a4:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0414
            java.lang.Object r12 = r16.next()     // Catch:{ all -> 0x0532 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0532 }
            X.1Cd r0 = r11.A03     // Catch:{ all -> 0x0532 }
            X.1au r15 = r0.A05()     // Catch:{ all -> 0x0532 }
            int r0 = r12.size()     // Catch:{ all -> 0x040a }
            int r0 = r0 + 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x040a }
            r14 = 1
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x040a }
            r10[r17] = r0     // Catch:{ all -> 0x040a }
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x040a }
        L_0x03c9:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x040a }
            if (r0 == 0) goto L_0x03e1
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x040a }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ all -> 0x040a }
            int r9 = r14 + 1
            long r7 = r0.A0x     // Catch:{ all -> 0x040a }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x040a }
            r10[r14] = r0     // Catch:{ all -> 0x040a }
            r14 = r9
            goto L_0x03c9
        L_0x03e1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x040a }
            r7.<init>()     // Catch:{ all -> 0x040a }
            java.lang.String r0 = "message_add_on.expiry_timestamp <= ? AND message_add_on.expiry_timestamp != 0 AND message_add_on.expiry_timestamp is not null AND parent_message_row_id IN "
            r7.append(r0)     // Catch:{ all -> 0x040a }
            int r0 = r12.size()     // Catch:{ all -> 0x040a }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x040a }
            r7.append(r0)     // Catch:{ all -> 0x040a }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x040a }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x040a }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x040a }
            java.lang.String r7 = "message_add_on"
            java.lang.String r0 = "MessageAddOnStore/deleteExpiredMessageAddOn"
            r8.A04(r7, r9, r0, r10)     // Catch:{ all -> 0x040a }
            r15.close()     // Catch:{ all -> 0x0532 }
            goto L_0x03a4
        L_0x040a:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x040f }
            goto L_0x0413
        L_0x040f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0532 }
        L_0x0413:
            throw r1     // Catch:{ all -> 0x0532 }
        L_0x0414:
            X.122 r7 = r6.A02     // Catch:{ all -> 0x0532 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0532 }
            r6.<init>()     // Catch:{ all -> 0x0532 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0532 }
        L_0x041f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0438
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0532 }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ all -> 0x0532 }
            X.205 r1 = r0.A0v     // Catch:{ all -> 0x0532 }
            X.1BI r0 = r1.A00     // Catch:{ all -> 0x0532 }
            r6.add(r0)     // Catch:{ all -> 0x0532 }
            X.1Q6 r0 = r7.A0R     // Catch:{ all -> 0x0532 }
            r0.A0C(r1)     // Catch:{ all -> 0x0532 }
            goto L_0x041f
        L_0x0438:
            X.1Q2 r0 = r7.A0O     // Catch:{ all -> 0x0532 }
            android.os.Handler r2 = r0.A01     // Catch:{ all -> 0x0532 }
            r1 = 17
            X.3Bx r0 = new X.3Bx     // Catch:{ all -> 0x0532 }
            r0.<init>(r7, r6, r1)     // Catch:{ all -> 0x0532 }
            r2.post(r0)     // Catch:{ all -> 0x0532 }
            goto L_0x0528
        L_0x0448:
            X.122 r0 = r6.A02     // Catch:{ all -> 0x0532 }
            r0.A0X(r3)     // Catch:{ all -> 0x0532 }
            goto L_0x0528
        L_0x044f:
            X.1WN r10 = r6.A08     // Catch:{ all -> 0x0532 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0532 }
            r1.<init>()     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages/"
            r1.append(r0)     // Catch:{ all -> 0x0532 }
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            r1.append(r0)     // Catch:{ all -> 0x0532 }
            r0 = 47
            r1.append(r0)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0532 }
            X.1Ez r9 = new X.1Ez     // Catch:{ all -> 0x0532 }
            r9.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0532 }
            X.1Cd r0 = r10.A00     // Catch:{ all -> 0x0532 }
            X.1au r2 = r0.A05()     // Catch:{ all -> 0x0532 }
            X.1xA r8 = r2.BD0()     // Catch:{ all -> 0x051a }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x0513 }
            r7 = 0
        L_0x047f:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0513 }
            if (r0 == 0) goto L_0x04c5
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0513 }
            X.206 r12 = (X.AnonymousClass206) r12     // Catch:{ all -> 0x0513 }
            int r7 = r7 + 1
            boolean r0 = r12 instanceof X.AnonymousClass215     // Catch:{ all -> 0x0513 }
            if (r0 == 0) goto L_0x04a6
            r1 = 2
            r0 = 0
            X.C18070vi.A0d(r12, r0)     // Catch:{ all -> 0x0513 }
            r11 = r12
            X.215 r11 = (X.AnonymousClass215) r11     // Catch:{ all -> 0x0513 }
            r11.CLQ(r1)     // Catch:{ all -> 0x0513 }
            long r0 = r12.A0x     // Catch:{ all -> 0x0513 }
            int r11 = r11.Bbc()     // Catch:{ all -> 0x0513 }
            X.AnonymousClass1WN.A00(r10, r11, r0)     // Catch:{ all -> 0x0513 }
            goto L_0x047f
        L_0x04a6:
            r11 = 2
            r0 = 0
            X.C18070vi.A0d(r12, r0)     // Catch:{ all -> 0x0513 }
            long r0 = r12.A0x     // Catch:{ all -> 0x0513 }
            X.AnonymousClass1WN.A00(r10, r11, r0)     // Catch:{ all -> 0x0513 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0513 }
            r1.<init>()     // Catch:{ all -> 0x0513 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages/updating state of non view-once message: "
            r1.append(r0)     // Catch:{ all -> 0x0513 }
            r1.append(r12)     // Catch:{ all -> 0x0513 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0513 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0513 }
            goto L_0x047f
        L_0x04c5:
            r8.A00()     // Catch:{ all -> 0x0513 }
            java.lang.String r0 = "success"
            r9.A03(r0)     // Catch:{ all -> 0x0513 }
            r8.close()     // Catch:{ all -> 0x051a }
            r2.close()     // Catch:{ all -> 0x0532 }
            r9.A02()     // Catch:{ all -> 0x0532 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0532 }
            r1.<init>()     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages numExpired:"
            r1.append(r0)     // Catch:{ all -> 0x0532 }
            r1.append(r7)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = " numTotal:"
            r1.append(r0)     // Catch:{ all -> 0x0532 }
            int r0 = r3.size()     // Catch:{ all -> 0x0532 }
            r1.append(r0)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0532 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0532 }
            X.122 r0 = r6.A02     // Catch:{ all -> 0x0532 }
            r0.A0X(r3)     // Catch:{ all -> 0x0532 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0532 }
        L_0x0500:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0532 }
            if (r0 == 0) goto L_0x0528
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0532 }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ all -> 0x0532 }
            X.1Q2 r1 = r6.A05     // Catch:{ all -> 0x0532 }
            r0 = -1
            r1.A01(r2, r0)     // Catch:{ all -> 0x0532 }
            goto L_0x0500
        L_0x0513:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0515 }
        L_0x0515:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x051a }
            throw r0     // Catch:{ all -> 0x051a }
        L_0x051a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x051c }
        L_0x051c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0532 }
            throw r0     // Catch:{ all -> 0x0532 }
        L_0x0521:
            X.122 r1 = r6.A02     // Catch:{ all -> 0x0532 }
            r0 = 29
            r1.A0V(r3, r0)     // Catch:{ all -> 0x0532 }
        L_0x0528:
            r0 = r20
            if (r5 != r0) goto L_0x052e
            r19 = 1
        L_0x052e:
            r4.close()
            return r19
        L_0x0532:
            r1 = move-exception
            if (r4 == 0) goto L_0x053d
            r4.close()     // Catch:{ all -> 0x0539 }
            throw r1
        L_0x0539:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x053d:
            throw r1
        L_0x053e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0540 }
        L_0x0540:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WV.A00(long, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0272, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0276, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0279, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x027a, code lost:
        X.CDX.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x027d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0280, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0284, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0287, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0288, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x028b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x029c, code lost:
        if (r15 == null) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02de, code lost:
        if (r7 != null) goto L_0x02e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            java.lang.String r0 = "EphemeralUpdateRunnable/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            r4 = r19
            X.11P r6 = r4.A01
            long r0 = X.AnonymousClass11P.A01(r6)
            r2 = 0
            int r9 = r4.A00(r0, r2)
            r2 = 2
            int r8 = r4.A00(r0, r2)
            r2 = 3
            int r7 = r4.A00(r0, r2)
            r2 = 4
            int r3 = r4.A00(r0, r2)
            r16 = 0
            r2 = 1
            if (r9 == r2) goto L_0x028c
            if (r7 == r2) goto L_0x028c
            if (r8 == r2) goto L_0x028c
            if (r3 == r2) goto L_0x028c
            if (r9 != 0) goto L_0x029e
            if (r7 != 0) goto L_0x029e
            if (r8 != 0) goto L_0x029e
            if (r3 != 0) goto L_0x029e
            long r7 = r4.A00
            int r2 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r7
            long r7 = r9.toDays(r2)
            int r2 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0185
        L_0x004e:
            r12 = 100
            java.lang.String r2 = "EphemeralUpdateRunnable/deleteSharedSecrets"
            X.1Ez r11 = new X.1Ez
            r11.<init>((java.lang.String) r2)
        L_0x0057:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            X.1WO r9 = r4.A06
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r3 = 1
            X.1Cd r2 = r9.A00     // Catch:{ Exception -> 0x00b5 }
            X.1at r15 = r2.get()     // Catch:{ Exception -> 0x00b5 }
            r2 = r15
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x00ab }
            X.1Ev r13 = r2.A02     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = "SELECT message_row_id FROM message_broadcast_ephemeral ORDER BY message_row_id LIMIT ?"
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x00ab }
            java.lang.String r14 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x00ab }
            r2 = 0
            r3[r2] = r14     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "GET_ALL_MESSAGE_ROW_ID"
            android.database.Cursor r7 = r13.A0A(r7, r2, r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "message_row_id"
            int r3 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x009f }
        L_0x0086:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0098
            long r13 = r7.getLong(r3)     // Catch:{ all -> 0x009f }
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x009f }
            r8.add(r2)     // Catch:{ all -> 0x009f }
            goto L_0x0086
        L_0x0098:
            r7.close()     // Catch:{ all -> 0x00ab }
            r15.close()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00ca
        L_0x009f:
            r3 = move-exception
            if (r7 == 0) goto L_0x00aa
            r7.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r3     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r3 = move-exception
            r15.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b4:
            throw r3     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            r7 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Unable to get message_row_id from message_broadcast_ephemeral batchSize="
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e(r2, r7)
        L_0x00ca:
            java.util.Iterator r18 = r8.iterator()
        L_0x00ce:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x012b
            java.lang.Object r8 = r18.next()
            java.lang.Number r8 = (java.lang.Number) r8
            X.1Qw r7 = r4.A07
            long r2 = r8.longValue()
            X.1Qu r7 = r7.A01
            r13 = 0
            X.2i8 r2 = X.C26091Qu.A00(r7, r13, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r2.A00
            java.util.Set r2 = r2.entrySet()
            X.C18070vi.A0X(r2)
            java.util.Iterator r15 = r2.iterator()
        L_0x00f4:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0123
            java.lang.Object r2 = r15.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r14 = r2.getKey()
            com.whatsapp.jid.DeviceJid r14 = (com.whatsapp.jid.DeviceJid) r14
            java.lang.Object r13 = r2.getValue()
            X.2S4 r13 = (X.AnonymousClass2S4) r13
            X.11S r3 = r7.A00
            com.whatsapp.jid.UserJid r2 = r14.userJid
            boolean r2 = r3.A0O(r2)
            if (r2 == 0) goto L_0x00f4
            int r2 = r14.getDevice()
            if (r2 == 0) goto L_0x00f4
            long r2 = r13.A00
            int r13 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ce
            goto L_0x00f4
        L_0x0123:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            r10.add(r2)
            goto L_0x00ce
        L_0x012b:
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x017c
            X.1Cd r2 = r9.A00     // Catch:{ Exception -> 0x0176 }
            X.1au r13 = r2.A05()     // Catch:{ Exception -> 0x0176 }
            r2 = r13
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x016c }
            X.1Ev r9 = r2.A02     // Catch:{ all -> 0x016c }
            java.lang.String r8 = "message_broadcast_ephemeral"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            r3.<init>()     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "message_row_id IN "
            r3.append(r2)     // Catch:{ all -> 0x016c }
            int r2 = r10.size()     // Catch:{ all -> 0x016c }
            java.lang.String r2 = X.AnonymousClass1H2.A00(r2)     // Catch:{ all -> 0x016c }
            r3.append(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x016c }
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x016c }
            java.lang.Object[] r3 = r10.toArray(r2)     // Catch:{ all -> 0x016c }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "deleteSharedSecretByMessageRowIds"
            int r2 = r9.A04(r8, r7, r2, r3)     // Catch:{ all -> 0x016c }
            r13.close()     // Catch:{ Exception -> 0x0176 }
            if (r2 == r12) goto L_0x0057
            goto L_0x017c
        L_0x016c:
            r3 = move-exception
            r13.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x0171:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ Exception -> 0x0176 }
        L_0x0175:
            throw r3     // Catch:{ Exception -> 0x0176 }
        L_0x0176:
            r3 = move-exception
            java.lang.String r2 = "Unable to delete shared secrets"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x017c:
            r11.A02()
            long r2 = java.lang.System.nanoTime()
            r4.A00 = r2
        L_0x0185:
            X.1Qz r2 = r4.A03
            X.1Cd r2 = r2.A04
            X.1at r7 = r2.get()
            r2 = r7
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0285 }
            X.1Ev r10 = r2.A02     // Catch:{ all -> 0x0285 }
            java.lang.String r9 = "SELECT expire_timestamp FROM message_ephemeral WHERE expire_timestamp >= ? AND keep_in_chat != 1 ORDER BY expire_timestamp LIMIT 1"
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ all -> 0x0285 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0285 }
            r2 = 0
            r8[r2] = r3     // Catch:{ all -> 0x0285 }
            java.lang.String r11 = "GET_EPHEMERAL_NEXT_EXPIRE_TIMESTAMP_SQL"
            android.database.Cursor r8 = r10.A0A(r9, r11, r8)     // Catch:{ all -> 0x0285 }
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x027e }
            r15 = 0
            if (r2 == 0) goto L_0x01b9
            java.lang.String r2 = "expire_timestamp"
            int r2 = r8.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x027e }
            long r2 = r8.getLong(r2)     // Catch:{ all -> 0x027e }
            java.lang.Long r15 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x027e }
        L_0x01b9:
            r8.close()     // Catch:{ all -> 0x0285 }
            r7.close()
            X.1WN r7 = r4.A08
            X.00H r12 = r7.A02
            r12.get()
            X.1Kq r2 = X.C24521Kq.$redex_init_class
            r2 = 1209600000(0x48190800, double:5.97621805E-315)
            long r13 = r0 - r2
            X.1Cd r2 = r7.A00
            X.1at r9 = r2.get()
            r2 = r9
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0277 }
            X.1Ev r10 = r2.A02     // Catch:{ all -> 0x0277 }
            X.0ve r7 = r7.A01     // Catch:{ all -> 0x0277 }
            r3 = 6261(0x1875, float:8.774E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x0277 }
            boolean r3 = X.C18020vd.A05(r2, r7, r3)     // Catch:{ all -> 0x0277 }
            r2 = 1
            if (r3 != r2) goto L_0x01f5
            java.lang.String r8 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  WHERE view_once.message_row_id=message_view._id AND message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
        L_0x01e7:
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0277 }
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0277 }
            r2 = 0
            r7[r2] = r3     // Catch:{ all -> 0x0277 }
            android.database.Cursor r11 = r10.A0A(r8, r11, r7)     // Catch:{ all -> 0x0277 }
            goto L_0x01f8
        L_0x01f5:
            java.lang.String r8 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id WHERE message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
            goto L_0x01e7
        L_0x01f8:
            boolean r2 = r11.moveToNext()     // Catch:{ all -> 0x0270 }
            r10 = 0
            if (r2 == 0) goto L_0x0215
            java.lang.String r2 = "timestamp"
            int r2 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0270 }
            long r7 = r11.getLong(r2)     // Catch:{ all -> 0x0270 }
            r12.get()     // Catch:{ all -> 0x0270 }
            r2 = 1209600000(0x48190800, double:5.97621805E-315)
            long r7 = r7 + r2
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0270 }
        L_0x0215:
            r11.close()     // Catch:{ all -> 0x0277 }
            r9.close()
            X.11m r2 = r4.A0A
            X.1Cd r2 = r2.A03
            X.1at r8 = r2.get()
            r2 = r8
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0266 }
            X.1Ev r7 = r2.A02     // Catch:{ all -> 0x0266 }
            java.lang.String r3 = "SELECT expiry_timestamp FROM message_add_on WHERE expiry_timestamp > ? ORDER BY expiry_timestamp LIMIT 1"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0266 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0266 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = "GET_MESSAGE_ADD_ON_NEXT_EXPIRE_TIMESTAMP_SQL"
            android.database.Cursor r2 = r7.A0A(r3, r0, r2)     // Catch:{ all -> 0x0266 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x025a }
            if (r0 == 0) goto L_0x0252
            java.lang.String r0 = "expiry_timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x025a }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x025a }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x025a }
            r2.close()     // Catch:{ all -> 0x0266 }
            goto L_0x0291
        L_0x0252:
            r2.close()     // Catch:{ all -> 0x0266 }
            r8.close()
            r7 = 0
            goto L_0x0294
        L_0x025a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0265
            r2.close()     // Catch:{ all -> 0x0261 }
            goto L_0x0265
        L_0x0261:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0266 }
        L_0x0265:
            throw r1     // Catch:{ all -> 0x0266 }
        L_0x0266:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x026b }
            throw r1
        L_0x026b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0270:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0272 }
        L_0x0272:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x0277 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x0277:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0279:
            r1 = move-exception
            X.CDX.A00(r9, r0)
            throw r1
        L_0x027e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0280 }
        L_0x0280:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0285 }
            throw r0     // Catch:{ all -> 0x0285 }
        L_0x0285:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0287 }
        L_0x0287:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x028c:
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            goto L_0x029f
        L_0x0291:
            r8.close()
        L_0x0294:
            if (r15 != 0) goto L_0x02f2
            r15 = r10
            if (r10 != 0) goto L_0x029a
            r15 = 0
        L_0x029a:
            if (r7 != 0) goto L_0x02cb
            if (r15 != 0) goto L_0x02e0
        L_0x029e:
            r6 = 0
        L_0x029f:
            X.1WU r2 = r4.A0E
            if (r2 == 0) goto L_0x02c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "EphemeralUpdateRunnable/timeToNextRun: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1WP r3 = r2.A00
            if (r6 == 0) goto L_0x02c7
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A0A
            r1 = 27
            X.3Bx r0 = new X.3Bx
            r0.<init>(r3, r6, r1)
            r2.execute(r0)
        L_0x02c7:
            r5.A02()
            return
        L_0x02cb:
            if (r15 == 0) goto L_0x02dd
            long r2 = r7.longValue()
            long r0 = r15.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x02dd:
            r15 = r7
            if (r7 == 0) goto L_0x029e
        L_0x02e0:
            long r2 = r15.longValue()
            long r0 = X.AnonymousClass11P.A01(r6)
            long r2 = r2 - r0
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x028c
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            goto L_0x029f
        L_0x02f2:
            if (r10 == 0) goto L_0x029a
            long r2 = r15.longValue()
            long r0 = r10.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            goto L_0x029a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WV.run():void");
    }

    public AnonymousClass1WV(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass1LW r5, AnonymousClass122 r6, C26141Qz r7, AnonymousClass1Q9 r8, AnonymousClass1WU r9, AnonymousClass1Q2 r10, AnonymousClass1WO r11, C26111Qw r12, AnonymousClass1WN r13, AnonymousClass1WM r14, C202711m r15, C18030ve r16, AnonymousClass1W6 r17, int i) {
        this.A01 = r4;
        this.A0F = r16;
        this.A0D = r5;
        this.A0C = r3;
        this.A05 = r10;
        this.A02 = r6;
        this.A0G = r17;
        this.A0A = r15;
        this.A09 = r14;
        this.A07 = r12;
        this.A08 = r13;
        this.A03 = r7;
        this.A04 = r8;
        this.A06 = r11;
        this.A0E = r9;
        this.A0B = i;
    }
}
