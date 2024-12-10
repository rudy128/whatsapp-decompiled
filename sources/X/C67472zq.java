package X;

/* renamed from: X.2zq  reason: invalid class name and case insensitive filesystem */
public class C67472zq implements AnonymousClass1L0 {
    public final AnonymousClass11P A00;
    public final C32691hb A01;
    public final AnonymousClass1WP A02;
    public final C26051Qq A03;
    public final C32651hX A04;
    public final C32321h0 A05;
    public final AnonymousClass1MX A06;
    public final AnonymousClass1SX A07;
    public final AnonymousClass1TG A08;
    public final AnonymousClass1WM A09;
    public final C32211gp A0A;
    public final C677830v A0B;
    public final C18030ve A0C;
    public final AnonymousClass00H A0D;

    public /* synthetic */ void Bqg() {
    }

    public void Bqh() {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r10v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0233, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0237, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x052e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0532, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x053a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x053b, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x053e, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqi() {
        /*
            r22 = this;
            r2 = r22
            X.1Qq r0 = r2.A03
            r0.A03()
            X.0ve r0 = r2.A0C
            r21 = r0
            r1 = 10468(0x28e4, float:1.4669E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r0, r1)
            if (r0 != 0) goto L_0x001b
            X.1TG r1 = r2.A08
            r0 = 1
            r1.A06(r0)
        L_0x001b:
            X.1h0 r1 = r2.A05
            X.1Cd r0 = r1.A03
            X.1au r8 = r0.A05()
            X.11P r0 = r1.A00     // Catch:{ all -> 0x0544 }
            long r3 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0544 }
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r3 = r3 - r0
            long r6 = X.C17880vN.A04(r3)     // Catch:{ all -> 0x0544 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0544 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0544 }
            java.lang.String r4 = "receipt_orphaned"
            java.lang.String r3 = "timestamp < ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r6)     // Catch:{ all -> 0x0544 }
            java.lang.String r0 = "deleteOldOrphanedReceipts/DELETE_RECEIPT_ORPHANED"
            r5.A04(r4, r3, r0, r1)     // Catch:{ all -> 0x0544 }
            r8.close()
            X.1SX r13 = r2.A07
            X.11P r0 = r2.A00
            r20 = r0
            long r3 = X.AnonymousClass11P.A01(r20)
            long r0 = X.AnonymousClass2W3.A00
            long r3 = r3 - r0
            r12 = 200(0xc8, float:2.8E-43)
            r10 = 1
            r19 = 500(0x1f4, float:7.0E-43)
        L_0x005b:
            r9 = 0
            X.1Cd r0 = r13.A03     // Catch:{ Exception -> 0x0113 }
            X.1au r18 = r0.A05()     // Catch:{ Exception -> 0x0113 }
            X.1xA r17 = r18.BD0()     // Catch:{ all -> 0x0109 }
            r0 = r18
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ff }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00ff }
            java.lang.String r5 = "SELECT message_row_id FROM message_streaming_sidecar WHERE timestamp < ? LIMIT ?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x00ff }
            X.C17880vN.A1V(r1, r9, r3)     // Catch:{ all -> 0x00ff }
            X.C17880vN.A1S(r1, r12, r10)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "GET_MESSAGE_STREAMING_SIDECAR_OLDER_THAN_SQL"
            android.database.Cursor r7 = r8.A0A(r5, r0, r1)     // Catch:{ all -> 0x00ff }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan num messages to update:"
            r1.append(r0)     // Catch:{ all -> 0x00f3 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x00f3 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x00f3 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x00f3 }
            r16 = 0
            if (r0 < r12) goto L_0x0098
            r16 = 1
        L_0x0098:
            r1 = 0
        L_0x0099:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = "message_row_id"
            long r5 = X.C17890vO.A06(r7, r0)     // Catch:{ all -> 0x00f3 }
            X.00H r0 = r13.A04     // Catch:{ all -> 0x00f3 }
            X.206 r14 = X.AnonymousClass1W2.A02(r0, r5)     // Catch:{ all -> 0x00f3 }
            boolean r0 = r14 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00c5
            r0 = r14
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x00f3 }
            X.2rc r0 = X.AnonymousClass206.A00(r0)     // Catch:{ all -> 0x00f3 }
            r0.A0R = r9     // Catch:{ all -> 0x00f3 }
            X.1Q7 r0 = r13.A02     // Catch:{ all -> 0x00f3 }
            r15 = r0
            X.205 r0 = r14.A0v     // Catch:{ all -> 0x00f3 }
            r15.A01(r14, r0)     // Catch:{ all -> 0x00f3 }
            X.1Nt r0 = r13.A01     // Catch:{ all -> 0x00f3 }
            r0.A05(r14)     // Catch:{ all -> 0x00f3 }
        L_0x00c5:
            java.lang.String r0 = "message_streaming_sidecar"
            java.lang.String r15 = "message_row_id = ?"
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ all -> 0x00f3 }
            X.C17880vN.A1V(r14, r9, r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "deleteStreamingSidecarOlderThan/DELETE_MESSAGE_STREAMING_SIDECAR_BY_MESSAGE_ID"
            int r0 = r8.A04(r0, r15, r5, r14)     // Catch:{ all -> 0x00f3 }
            int r1 = r1 + r0
            goto L_0x0099
        L_0x00d6:
            r17.A00()     // Catch:{ all -> 0x00f3 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan deleting rows:"
            X.C17900vP.A0j(r0, r5, r1)     // Catch:{ all -> 0x00f3 }
            r7.close()     // Catch:{ all -> 0x00ff }
            r17.close()     // Catch:{ all -> 0x0109 }
            r18.close()     // Catch:{ Exception -> 0x0113 }
            int r19 = r19 + -1
            if (r16 == 0) goto L_0x0119
            if (r19 <= 0) goto L_0x0119
            goto L_0x005b
        L_0x00f3:
            r1 = move-exception
            if (r7 == 0) goto L_0x00fe
            r7.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ff }
        L_0x00fe:
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0109 }
        L_0x0108:
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x010e }
            goto L_0x0112
        L_0x010e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0113 }
        L_0x0112:
            throw r1     // Catch:{ Exception -> 0x0113 }
        L_0x0113:
            r1 = move-exception
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0119:
            X.1hX r6 = r2.A04
            X.11P r0 = r6.A00
            long r17 = X.AnonymousClass11P.A01(r0)
            r0 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r17 = r17 - r0
        L_0x0128:
            X.1Cd r0 = r6.A03     // Catch:{ Exception -> 0x0258 }
            X.1au r5 = r0.A05()     // Catch:{ Exception -> 0x0258 }
            X.1xA r16 = r5.BD0()     // Catch:{ all -> 0x024e }
            X.1hW r7 = r6.A01     // Catch:{ all -> 0x0244 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0244 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0244 }
            java.lang.String[] r3 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0244 }
            r0 = 0
            java.lang.String r10 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0244 }
            r3[r0] = r10     // Catch:{ all -> 0x0244 }
            r0 = 1
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0244 }
            r3[r0] = r9     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "GET_MMS_THUMBNAIL_METADATA_MESSAGE_ROW_ID_OLDER_THAN_SQL"
            java.lang.String r0 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE insert_timestamp < ? LIMIT ?"
            android.database.Cursor r3 = r8.A0A(r0, r1, r3)     // Catch:{ all -> 0x0244 }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0238 }
            java.lang.String r4 = "message_row_id"
            int r1 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0238 }
        L_0x015f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0169
            X.C17900vP.A0K(r3, r13, r1)     // Catch:{ all -> 0x0238 }
            goto L_0x015f
        L_0x0169:
            r3.close()     // Catch:{ all -> 0x0244 }
            X.0ve r1 = r7.A02     // Catch:{ all -> 0x0244 }
            r0 = 9584(0x2570, float:1.343E-41)
            boolean r0 = X.C18020vd.A05(r11, r1, r0)     // Catch:{ all -> 0x0244 }
            if (r0 == 0) goto L_0x01a8
            r0 = 0
            java.lang.String[] r3 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0244 }
            r3[r0] = r10     // Catch:{ all -> 0x0244 }
            r0 = 1
            r3[r0] = r9     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "GET_MMS_METADATA_MESSAGE_ROW_ID_OLDER_THAN_SQL"
            java.lang.String r0 = "\n        SELECT message_row_id \n        FROM mms_metadata \n        WHERE insert_timestamp < ?\n        LIMIT ?\n        "
            android.database.Cursor r12 = r8.A0A(r0, r1, r3)     // Catch:{ all -> 0x0244 }
            java.util.LinkedHashSet r10 = X.C17880vN.A14()     // Catch:{ all -> 0x0231 }
            int r9 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0231 }
        L_0x0190:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x01a4
            r3 = -1
            long r0 = X.AnonymousClass1Eu.A02(r12, r9, r3)     // Catch:{ all -> 0x0231 }
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0190
            X.C17880vN.A1R(r10, r0)     // Catch:{ all -> 0x0231 }
            goto L_0x0190
        L_0x01a4:
            r12.close()     // Catch:{ all -> 0x0244 }
            goto L_0x01aa
        L_0x01a8:
            X.1Om r10 = X.C25511Om.A00     // Catch:{ all -> 0x0244 }
        L_0x01aa:
            java.util.LinkedHashSet r0 = X.C17880vN.A14()     // Catch:{ all -> 0x0244 }
            r0.addAll(r13)     // Catch:{ all -> 0x0244 }
            r0.addAll(r10)     // Catch:{ all -> 0x0244 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0244 }
            r3.<init>(r0)     // Catch:{ all -> 0x0244 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0244 }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan num messages to update:"
            r1.append(r0)     // Catch:{ all -> 0x0244 }
            int r0 = r3.size()     // Catch:{ all -> 0x0244 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x0244 }
            int r0 = r3.size()     // Catch:{ all -> 0x0244 }
            r9 = 0
            boolean r15 = X.AnonymousClass000.A1R(r0)
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x0244 }
            r8 = 0
        L_0x01d7:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0244 }
            if (r0 == 0) goto L_0x0218
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0244 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0244 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0244 }
            X.00H r13 = r6.A04     // Catch:{ all -> 0x0244 }
            X.206 r12 = X.AnonymousClass1W2.A02(r13, r3)     // Catch:{ all -> 0x0244 }
            if (r12 == 0) goto L_0x0212
            X.1Q9 r1 = r6.A02     // Catch:{ all -> 0x0244 }
            X.205 r0 = r12.A0v     // Catch:{ all -> 0x0244 }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x0244 }
            X.C18070vi.A0d(r0, r9)     // Catch:{ all -> 0x0244 }
            java.util.Map r10 = r1.A02     // Catch:{ all -> 0x0244 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x0244 }
            if (r0 != 0) goto L_0x01d7
            r1 = 0
            java.lang.Object r0 = r10.get(r1)     // Catch:{ all -> 0x0244 }
            if (r0 != 0) goto L_0x01d7
            X.C60502o8.A01(r12, r1)     // Catch:{ all -> 0x0244 }
            X.1W6 r1 = X.C17880vN.A0c(r13)     // Catch:{ all -> 0x0244 }
            r0 = -1
            r1.A05(r12, r0)     // Catch:{ all -> 0x0244 }
        L_0x0212:
            int r0 = r7.A00(r5, r3)     // Catch:{ all -> 0x0244 }
            int r8 = r8 + r0
            goto L_0x01d7
        L_0x0218:
            r16.A00()     // Catch:{ all -> 0x0244 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0244 }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan deleting rows:"
            X.C17900vP.A0j(r0, r1, r8)     // Catch:{ all -> 0x0244 }
            if (r8 == 0) goto L_0x0227
            r9 = r15
        L_0x0227:
            r16.close()     // Catch:{ all -> 0x024e }
            r5.close()     // Catch:{ Exception -> 0x0258 }
            if (r9 == 0) goto L_0x025e
            goto L_0x0128
        L_0x0231:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ all -> 0x0244 }
            throw r0     // Catch:{ all -> 0x0244 }
        L_0x0238:
            r1 = move-exception
            if (r3 == 0) goto L_0x0243
            r3.close()     // Catch:{ all -> 0x023f }
            goto L_0x0243
        L_0x023f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0244 }
        L_0x0243:
            throw r1     // Catch:{ all -> 0x0244 }
        L_0x0244:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0249 }
            goto L_0x024d
        L_0x0249:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x024e }
        L_0x024d:
            throw r1     // Catch:{ all -> 0x024e }
        L_0x024e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0253 }
            goto L_0x0257
        L_0x0253:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0258 }
        L_0x0257:
            throw r1     // Catch:{ Exception -> 0x0258 }
        L_0x0258:
            r1 = move-exception
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x025e:
            X.1hb r7 = r2.A01
            java.lang.String r0 = "EditedMessageManager/deleteOldOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11P r0 = r7.A05
            long r3 = X.AnonymousClass11P.A01(r0)
            int r0 = r7.A00
            long r5 = (long) r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 * r0
            long r3 = r3 - r5
            X.1hG r0 = r7.A09
            X.1Cd r0 = r0.A0B
            X.1au r7 = r0.A05()
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x053f }
            X.C17890vO.A1J(r5, r3)     // Catch:{ all -> 0x053f }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x053f }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "message_orphaned_edit"
            java.lang.String r1 = "message_orphaned_edit.timestamp < ?"
            java.lang.String r0 = "EditMessageStore/deleteOrphanEditMessageOlderThan"
            r4.A04(r3, r1, r0, r5)     // Catch:{ all -> 0x053f }
            r7.close()
            X.00H r7 = r2.A0D
            java.lang.Object r5 = r7.get()
            X.355 r5 = (X.AnonymousClass355) r5
            java.lang.String r0 = "MessageOrphanManager/deleteOldOrphanedMessages"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r1 = r5.A01
            r0 = 987(0x3db, float:1.383E-42)
            int r1 = X.C18020vd.A00(r11, r1, r0)
            X.11P r0 = r5.A00
            long r8 = X.AnonymousClass11P.A01(r0)
            long r3 = (long) r1
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r0
            long r8 = r8 - r3
            X.00H r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.ARP r0 = (X.ARP) r0
            X.1Cd r0 = r0.A01
            X.1au r6 = r0.A05()
            java.lang.String[] r5 = X.C17900vP.A0t(r8)     // Catch:{ all -> 0x0538 }
            java.lang.String r4 = "message_orphan.timestamp < ?"
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0538 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0538 }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessagesOlderThan"
            r3.A04(r1, r4, r0, r5)     // Catch:{ all -> 0x0538 }
            r6.close()
            r1 = 7935(0x1eff, float:1.112E-41)
            r0 = r21
            boolean r0 = X.C18020vd.A05(r11, r0, r1)
            if (r0 == 0) goto L_0x02ec
            java.lang.Object r3 = r7.get()
            X.355 r3 = (X.AnonymousClass355) r3
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.A00(r0)
        L_0x02ec:
            X.1WM r10 = r2.A09
            java.lang.String r0 = "MessageAddOnManager/messageAddOnCleanUp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11P r9 = r10.A03
            long r0 = X.AnonymousClass11P.A01(r9)
            r3 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r0 = r0 - r3
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.1WF r4 = r10.A0B
            X.1Cd r3 = r4.A02
            X.1at r12 = r3.get()
            X.00H r3 = r4.A04     // Catch:{ all -> 0x0533 }
            r3.get()     // Catch:{ all -> 0x0533 }
            r4 = 0
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0533 }
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0533 }
            X.1Ev r6 = r3.A02     // Catch:{ all -> 0x0533 }
            java.lang.String r5 = "SELECT message_add_on_row_id FROM message_add_on_pin_in_chat WHERE pin_in_chat_state = 0"
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0533 }
            java.lang.String r3 = "SELECT_PIN_IN_CHAT_ROW_IDS_FOR_UNPINS"
            android.database.Cursor r5 = r6.A0A(r5, r3, r4)     // Catch:{ all -> 0x0533 }
            java.lang.String r11 = "message_add_on_row_id"
            int r4 = r5.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x052c }
        L_0x032a:
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x052c }
            if (r3 == 0) goto L_0x0334
            X.C17900vP.A0K(r5, r8, r4)     // Catch:{ all -> 0x052c }
            goto L_0x032a
        L_0x0334:
            r5.close()     // Catch:{ all -> 0x0533 }
            r12.close()
            r7.addAll(r8)
            X.1WE r3 = r10.A0D
            X.1WD r3 = r3.A02
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.1Cd r3 = r3.A00
            X.1at r12 = r3.get()
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0533 }
            X.1Ev r6 = r3.A02     // Catch:{ all -> 0x0533 }
            java.lang.String r5 = "SELECT message_add_on_row_id FROM message_add_on_reaction WHERE reaction = ''"
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0533 }
            java.lang.String r3 = "SELECT_REACTION_ROW_IDS_FOR_EMPTY_REACTIONS"
            android.database.Cursor r5 = r6.A0A(r5, r3, r4)     // Catch:{ all -> 0x0533 }
            int r4 = r5.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0520 }
        L_0x035f:
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x0520 }
            if (r3 == 0) goto L_0x0369
            X.C17900vP.A0K(r5, r8, r4)     // Catch:{ all -> 0x0520 }
            goto L_0x035f
        L_0x0369:
            r5.close()     // Catch:{ all -> 0x0533 }
            r12.close()
            r7.addAll(r8)
            X.1WH r3 = r10.A0A
            X.1WG r3 = r3.A08
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.1Cd r3 = r3.A00
            X.1at r12 = r3.get()
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0533 }
            X.1Ev r6 = r3.A02     // Catch:{ all -> 0x0533 }
            java.lang.String r5 = "SELECT message_add_on_row_id FROM message_add_on_keep_in_chat WHERE keep_in_chat_state = 0"
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0533 }
            java.lang.String r3 = "SELECT_KEEP_IN_CHAT_ROW_IDS_FOR_UNKEEPS"
            android.database.Cursor r5 = r6.A0A(r5, r3, r4)     // Catch:{ all -> 0x0533 }
            int r4 = r5.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0520 }
        L_0x0394:
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x0520 }
            if (r3 == 0) goto L_0x039e
            X.C17900vP.A0K(r5, r8, r4)     // Catch:{ all -> 0x0520 }
            goto L_0x0394
        L_0x039e:
            r5.close()     // Catch:{ all -> 0x0533 }
            r12.close()
            r7.addAll(r8)
            X.11m r11 = r10.A0E
            long r4 = X.AnonymousClass11P.A01(r9)
            int r3 = r7.size()
            java.lang.String[] r10 = new java.lang.String[r3]
            java.util.Iterator r9 = r7.iterator()
            r8 = 0
        L_0x03b8:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x03c9
            long r6 = X.C17890vO.A07(r9)
            int r3 = r8 + 1
            X.C17880vN.A1V(r10, r8, r6)
            r8 = r3
            goto L_0x03b8
        L_0x03c9:
            r3 = 975(0x3cf, float:1.366E-42)
            X.23b r6 = new X.23b
            r6.<init>(r10, r3)
            X.1Cd r3 = r11.A03
            X.1au r7 = r3.A05()
            r3 = 1
            android.content.ContentValues r9 = X.C17880vN.A09(r3)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "expiry_timestamp"
            X.C17880vN.A19(r9, r3, r4)     // Catch:{ all -> 0x053f }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x053f }
        L_0x03e4:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x053f }
            if (r3 == 0) goto L_0x041f
            java.lang.Object r13 = r5.next()     // Catch:{ all -> 0x053f }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x053f }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "_id IN "
            r4.append(r3)     // Catch:{ all -> 0x053f }
            int r3 = r13.length     // Catch:{ all -> 0x053f }
            java.lang.String r3 = X.AnonymousClass1H2.A00(r3)     // Catch:{ all -> 0x053f }
            r4.append(r3)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = " AND "
            r4.append(r3)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "timestamp"
            r4.append(r3)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = " < "
            java.lang.String r11 = X.C17890vO.A0a(r3, r4, r0)     // Catch:{ all -> 0x053f }
            r3 = r7
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x053f }
            X.1Ev r8 = r3.A02     // Catch:{ all -> 0x053f }
            java.lang.String r10 = "message_add_on"
            java.lang.String r12 = "MessageAddOnStore/updateExpiryToNowForAddOnRowIds"
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x053f }
            goto L_0x03e4
        L_0x041f:
            r7.close()
            X.1WP r0 = r2.A02
            r0.A01()
            X.1MX r5 = r2.A06
            long r3 = X.AnonymousClass11P.A01(r20)
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r3 = r3 - r0
            java.lang.String[] r6 = X.C17880vN.A1Y()
            r0 = 0
            X.C17880vN.A1V(r6, r0, r3)
            X.1Cd r0 = r5.A01
            X.1au r5 = r0.A05()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x051b }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x051b }
            java.lang.String r3 = "group_past_participant_user"
            java.lang.String r1 = "timestamp < ? "
            java.lang.String r0 = "deletePastParticipantsBeforeTimestamp/DELETE_PAST_PARTICIPANT_USER"
            r4.A04(r3, r1, r0, r6)     // Catch:{ all -> 0x051b }
            r5.close()
            X.1gp r1 = r2.A0A
            java.lang.String r0 = "SharedMediaIdsStore/deleteOutdatedRecords"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RM r0 = r1.A00
            X.1au r7 = r0.A06()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x053f }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x053f }
            java.lang.String r5 = "shared_media_ids"
            java.lang.String r4 = "expiration_timestamp <?"
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x053f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x053f }
            X.C17890vO.A1J(r3, r0)     // Catch:{ all -> 0x053f }
            java.lang.String r0 = "deleteOutdatedRecords/DELETE_OUTDATED_SHARED_MEDIA"
            r6.A04(r5, r4, r0, r3)     // Catch:{ all -> 0x053f }
            r7.close()
            X.30v r3 = r2.A0B
            X.1RK r0 = r3.A01
            java.util.ArrayList r1 = r0.A07()
            int r0 = r1.size()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0492:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04a4
            java.lang.Object r0 = r1.next()
            X.4Zh r0 = (X.C88344Zh) r0
            com.whatsapp.jid.DeviceJid r0 = r0.A08
            r7.add(r0)
            goto L_0x0492
        L_0x04a4:
            X.1Ry r5 = r3.A02
            X.C17960vV.A01()
            java.util.HashSet r4 = X.C17880vN.A12()
            X.1Oq r0 = r5.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0516 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0516 }
            java.lang.String r1 = "SELECT DISTINCT device_id FROM peer_messages"
            java.lang.String r0 = "PeerMessagesTable.SELECT_ALL_RECIPIENTS"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0516 }
        L_0x04c0:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04d8
            java.lang.String r0 = "device_id"
            java.lang.String r1 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x050a }
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x050a }
            com.whatsapp.jid.DeviceJid r0 = r0.A06(r1)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04c0
            r4.add(r0)     // Catch:{ all -> 0x050a }
            goto L_0x04c0
        L_0x04d8:
            r2.close()     // Catch:{ all -> 0x0516 }
            r6.close()
            r4.removeAll(r7)
            java.util.Iterator r1 = r4.iterator()
        L_0x04e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04f3
            com.whatsapp.jid.DeviceJid r0 = X.C17880vN.A0R(r1)
            r5.A06(r0)
            goto L_0x04e5
        L_0x04f3:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0509
            X.190 r3 = r3.A00
            int r0 = r4.size()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "orphan-peer-messages"
            r3.A0G(r0, r2, r1)
        L_0x0509:
            return
        L_0x050a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0515
            r2.close()     // Catch:{ all -> 0x0511 }
            goto L_0x0515
        L_0x0511:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0516 }
        L_0x0515:
            throw r1     // Catch:{ all -> 0x0516 }
        L_0x0516:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0549 }
            throw r1
        L_0x051b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0549 }
            throw r1
        L_0x0520:
            r1 = move-exception
            if (r5 == 0) goto L_0x052b
            r5.close()     // Catch:{ all -> 0x0527 }
            goto L_0x052b
        L_0x0527:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0533 }
        L_0x052b:
            throw r1     // Catch:{ all -> 0x0533 }
        L_0x052c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x052e }
        L_0x052e:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0533 }
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x0533:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0549 }
            throw r1
        L_0x0538:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x053a }
        L_0x053a:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x053f:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0549 }
            throw r1
        L_0x0544:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0549 }
            throw r1
        L_0x0549:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67472zq.Bqi():void");
    }

    public C67472zq(AnonymousClass11P r1, C32691hb r2, AnonymousClass1WP r3, C26051Qq r4, C32651hX r5, C32321h0 r6, AnonymousClass1MX r7, AnonymousClass1SX r8, AnonymousClass1TG r9, AnonymousClass1WM r10, C32211gp r11, C677830v r12, C18030ve r13, AnonymousClass00H r14) {
        this.A00 = r1;
        this.A0C = r13;
        this.A0B = r12;
        this.A08 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A0D = r14;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
    }
}
