package com.whatsapp.expressionstray.expression.stickers.received;

import X.AnonymousClass1OS;
import X.C130346jH;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.received.ReceivedStickersFlow$getTopReceivedStickers$1", f = "ReceivedStickersFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReceivedStickersFlow$getTopReceivedStickers$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130346jH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReceivedStickersFlow$getTopReceivedStickers$1(C130346jH r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ReceivedStickersFlow$getTopReceivedStickers$1 receivedStickersFlow$getTopReceivedStickers$1 = new ReceivedStickersFlow$getTopReceivedStickers$1(this.this$0, r4);
        receivedStickersFlow$getTopReceivedStickers$1.L$0 = obj;
        return receivedStickersFlow$getTopReceivedStickers$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r20
            int r0 = r2.label
            if (r0 != 0) goto L_0x01f8
            X.C30691eM.A01(r21)
            java.lang.Object r5 = r2.L$0
            X.1BI r5 = (X.AnonymousClass1BI) r5
            X.6jH r0 = r2.this$0
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.11P r0 = (X.AnonymousClass11P) r0
            long r11 = X.AnonymousClass11P.A01(r0)
            r0 = 31449600000(0x7528ad000, double:1.55381669354E-313)
            long r11 = r11 - r0
            X.6jH r0 = r2.this$0
            X.00H r0 = r0.A04
            java.lang.Object r6 = r0.get()
            X.6o6 r6 = (X.C133056o6) r6
            r19 = 5
            java.lang.String r3 = "MediaMessageStore/getTopReceivedStickersFromChat exception "
            r1 = 0
            X.C18070vi.A0d(r5, r1)
            X.00H r0 = r6.A00
            X.0vd r4 = X.C17880vN.A0P(r0)
            r2 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r2)
            if (r0 == 0) goto L_0x0064
            java.lang.String r8 = X.C51012Wq.A0J
        L_0x0045:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.00H r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.1LW r0 = (X.AnonymousClass1LW) r0
            long r17 = r0.A09(r5)
            X.00H r0 = r6.A06
            java.lang.Object r0 = r0.get()
            X.1NJ r0 = (X.AnonymousClass1NJ) r0
            X.1Cd r0 = r0.A02
            X.1at r10 = r0.get()
            goto L_0x0067
        L_0x0064:
            java.lang.String r8 = X.C51012Wq.A0I
            goto L_0x0045
        L_0x0067:
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01ee }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x01ee }
            java.lang.String r7 = "SELECT sort_id FROM available_message_view WHERE timestamp >= ? AND chat_row_id = ? ORDER BY sort_id ASC LIMIT 1"
            java.lang.String[] r5 = X.C17880vN.A1Z()     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x01ee }
            r5[r1] = r0     // Catch:{ all -> 0x01ee }
            java.lang.String r4 = java.lang.Long.toString(r17)     // Catch:{ all -> 0x01ee }
            r0 = 1
            r5[r0] = r4     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = "GET_SORT_ID_BY_TIMESTAMP_FOR_CHAT"
            android.database.Cursor r4 = r9.A0A(r7, r0, r5)     // Catch:{ all -> 0x01ee }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "sort_id"
            long r15 = X.C17890vO.A06(r4, r0)     // Catch:{ all -> 0x01e2 }
            goto L_0x0099
        L_0x0092:
            java.lang.String r0 = "SortIdStore/getSortIdByTimestampForChat: failed to get sort id for chat"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01e2 }
            r15 = -9223372036854775808
        L_0x0099:
            r4.close()     // Catch:{ all -> 0x01ee }
            r10.close()
            r13 = -9223372036854775808
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01d3
            X.00H r7 = r6.A05
            java.lang.Object r0 = r7.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01c8 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x01c8 }
            java.lang.String r10 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND message_type = 20 AND from_me = 0 AND sort_id > ?  ORDER BY sort_id DESC LIMIT ?"
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x01c8 }
            java.lang.String r11 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x01c8 }
            r9[r1] = r11     // Catch:{ all -> 0x01c8 }
            java.lang.String r4 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x01c8 }
            r0 = 1
            r9[r0] = r4     // Catch:{ all -> 0x01c8 }
            java.lang.String r4 = "1000"
            r0 = 2
            r9[r0] = r4     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "GET_NTH_RECEIVED_STICKER_MESSAGE_FROM_TIMESTAMP_SQL"
            android.database.Cursor r4 = r12.A0A(r10, r0, r9)     // Catch:{ all -> 0x01c8 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "sort_id"
            long r9 = X.C17890vO.A06(r4, r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x00e7
        L_0x00e0:
            java.lang.String r0 = "MediaMessageStore/getSortIdOfLastNthReceivedStickerFromSortId: failed to get sort id"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01c1 }
            r9 = -9223372036854775808
        L_0x00e7:
            r4.close()     // Catch:{ all -> 0x01c8 }
            r5.close()
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r7.get()     // Catch:{ SQLiteException | IllegalStateException -> 0x01cf }
            X.1Cd r0 = (X.AnonymousClass1Cd) r0     // Catch:{ SQLiteException | IllegalStateException -> 0x01cf }
            X.1at r4 = r0.get()     // Catch:{ SQLiteException | IllegalStateException -> 0x01cf }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01ba }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x01ba }
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x01ba }
            r5[r1] = r11     // Catch:{ all -> 0x01ba }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x01ba }
            r0 = 1
            r5[r0] = r1     // Catch:{ all -> 0x01ba }
            java.lang.String r1 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x01ba }
            r0 = 2
            r5[r0] = r1     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = "GET_TOP_RECEIVED_STICKER_MEDIA_IN_CHAT"
            android.database.Cursor r5 = r7.A0A(r8, r0, r5)     // Catch:{ all -> 0x01ba }
        L_0x0119:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x01a9
            X.00H r0 = r6.A03     // Catch:{ all -> 0x01b3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01b3 }
            X.1Nt r0 = (X.C25321Nt) r0     // Catch:{ all -> 0x01b3 }
            X.2rc r8 = r0.A02(r5)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "enc_file_hash"
            java.lang.String r9 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "file_hash"
            java.lang.String r10 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "message_url"
            java.lang.String r11 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "mime_type"
            java.lang.String r12 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x01b3 }
            java.io.File r7 = r8.A0G     // Catch:{ all -> 0x01b3 }
            byte[] r0 = r8.A0a     // Catch:{ all -> 0x01b3 }
            if (r7 == 0) goto L_0x0119
            r7.exists()     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x01a2
            int r1 = r0.length     // Catch:{ all -> 0x01b3 }
            r0 = 32
            if (r1 != r0) goto L_0x01a2
            boolean r0 = r8.A0V     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x0119
            boolean r0 = r7.isAbsolute()     // Catch:{ all -> 0x01b3 }
            if (r0 != 0) goto L_0x016f
            X.00H r0 = r6.A02     // Catch:{ all -> 0x01b3 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x01b3 }
            X.1L7 r1 = (X.AnonymousClass1L7) r1     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r7.getPath()     // Catch:{ all -> 0x01b3 }
            java.io.File r0 = r1.A08(r0)     // Catch:{ all -> 0x01b3 }
            r8.A0G = r0     // Catch:{ all -> 0x01b3 }
        L_0x016f:
            java.io.File r0 = r8.A0G     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x0119
            boolean r1 = r0.exists()     // Catch:{ all -> 0x01b3 }
            r0 = 1
            if (r1 != r0) goto L_0x0119
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x01b3 }
            X.C18070vi.A0b(r10)     // Catch:{ all -> 0x01b3 }
            r13 = -1
            X.6io r7 = new X.6io     // Catch:{ all -> 0x01b3 }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01b3 }
            X.2rc r0 = r7.A01     // Catch:{ all -> 0x01b3 }
            java.io.File r0 = r0.A0G     // Catch:{ all -> 0x01b3 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x01b3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r7.A05     // Catch:{ all -> 0x01b3 }
            X.77d r0 = r6.A00(r7, r0)     // Catch:{ all -> 0x01b3 }
            r0.A0B = r1     // Catch:{ all -> 0x01b3 }
            r2.add(r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x0119
        L_0x01a2:
            java.lang.String r0 = "MediaMessageStore/getMatchingMediaResult mediaKey is null or wrong length"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x0119
        L_0x01a9:
            r2.size()     // Catch:{ all -> 0x01b3 }
            r5.close()     // Catch:{ all -> 0x01ba }
            r4.close()     // Catch:{ SQLiteException | IllegalStateException -> 0x01cf }
            goto L_0x01d3
        L_0x01b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteException | IllegalStateException -> 0x01cf }
            throw r0     // Catch:{ SQLiteException | IllegalStateException -> 0x01cf }
        L_0x01c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x01c8 }
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x01cf:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x01d3:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01dc
            X.60c r0 = X.C1175860c.A00
            return r0
        L_0x01dc:
            X.60b r0 = new X.60b
            r0.<init>(r2)
            return r0
        L_0x01e2:
            r1 = move-exception
            if (r4 == 0) goto L_0x01ed
            r4.close()     // Catch:{ all -> 0x01e9 }
            goto L_0x01ed
        L_0x01e9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01ee }
        L_0x01ed:
            throw r1     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01f3 }
            throw r1
        L_0x01f3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x01f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.received.ReceivedStickersFlow$getTopReceivedStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReceivedStickersFlow$getTopReceivedStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
