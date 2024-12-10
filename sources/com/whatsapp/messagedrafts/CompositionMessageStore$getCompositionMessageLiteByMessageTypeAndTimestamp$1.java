package com.whatsapp.messagedrafts;

import X.AnonymousClass1OS;
import X.AnonymousClass25H;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C42391y6;
import X.C49472Qp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagedrafts.CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1", f = "CompositionMessageStore.kt", i = {0, 0, 0, 0, 0}, l = {176}, m = "invokeSuspend", n = {"$this$flow", "lastOffsetRowId", "session", "shouldContinue", "cursor"}, s = {"L$0", "L$1", "L$6", "L$7", "L$9"})
public final class CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $batchSize;
    public final /* synthetic */ AnonymousClass25H $compositionType;
    public final /* synthetic */ int $limitRows;
    public final /* synthetic */ C49472Qp $messageType;
    public final /* synthetic */ long $timestamp;
    public int I$0;
    public int I$1;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ C42391y6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1(C49472Qp r2, AnonymousClass25H r3, C42391y6 r4, C30391dr r5, int i, int i2, long j) {
        super(2, r5);
        this.this$0 = r4;
        this.$compositionType = r3;
        this.$messageType = r2;
        this.$timestamp = j;
        this.$limitRows = i;
        this.$batchSize = i2;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        C42391y6 r3 = this.this$0;
        AnonymousClass25H r2 = this.$compositionType;
        C30391dr r4 = r11;
        CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1 compositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1 = new CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1(this.$messageType, r2, r3, r4, this.$limitRows, this.$batchSize, this.$timestamp);
        compositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1.L$0 = obj;
        return compositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.4rD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.4rD} */
    /* JADX WARNING: type inference failed for: r11v2, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071 A[Catch:{ all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0114 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0119 A[SYNTHETIC, Splitter:B:37:0x0119] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            X.1g4 r21 = X.C31751g4.COROUTINE_SUSPENDED
            r14 = r23
            int r1 = r14.label
            r0 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 != r0) goto L_0x003d
            int r13 = r14.I$1
            int r0 = r14.I$0
            r22 = r0
            long r15 = r14.J$0
            java.lang.Object r12 = r14.L$9
            android.database.Cursor r12 = (android.database.Cursor) r12
            java.lang.Object r2 = r14.L$8
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r11 = r14.L$7
            X.1Dh r11 = (X.C22811Dh) r11
            java.lang.Object r10 = r14.L$6
            X.1at r10 = (X.C28781at) r10
            java.lang.Object r9 = r14.L$5
            X.1y6 r9 = (X.C42391y6) r9
            java.lang.Object r8 = r14.L$4
            X.2Qp r8 = (X.C49472Qp) r8
            java.lang.Object r7 = r14.L$3
            X.25H r7 = (X.AnonymousClass25H) r7
            java.lang.Object r6 = r14.L$2
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r5 = r14.L$1
            X.4rD r5 = (X.C98474rD) r5
            java.lang.Object r4 = r14.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            goto L_0x010b
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0042:
            X.C30691eM.A01(r24)
            java.lang.Object r4 = r14.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.4rD r5 = new X.4rD
            r5.<init>()
            X.1y6 r0 = r14.this$0
            X.1Cd r0 = r0.A01
            X.1at r6 = r0.get()
            X.25H r7 = r14.$compositionType
            X.2Qp r8 = r14.$messageType
            long r15 = r14.$timestamp
            int r0 = r14.$limitRows
            r22 = r0
            int r13 = r14.$batchSize
            X.1y6 r9 = r14.this$0
            r10 = r6
            X.1Dh r11 = new X.1Dh     // Catch:{ all -> 0x0133 }
            r11.<init>()     // Catch:{ all -> 0x0133 }
            r0 = 1
            r11.element = r0     // Catch:{ all -> 0x0133 }
        L_0x006d:
            boolean r0 = r11.element     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x012b
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0133 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = "\n        SELECT\n          _id,\n          chat_row_id\n        FROM composition\n        WHERE composition_type = ?\n        AND message_type = ?\n        AND timestamp >= ?\n        AND _id > ?\n        ORDER BY _id ASC\n        LIMIT ?\n        "
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0133 }
            int r0 = r7.value     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r0 = 0
            r1[r0] = r12     // Catch:{ all -> 0x0133 }
            int r0 = r8.value     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r20 = 1
            r1[r20] = r0     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0133 }
            r0 = 2
            r1[r0] = r12     // Catch:{ all -> 0x0133 }
            int r0 = r5.element     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r0 = 3
            r1[r0] = r12     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = java.lang.String.valueOf(r22)     // Catch:{ all -> 0x0133 }
            r0 = 4
            r1[r0] = r12     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "GET_COMPOSITION_ID_AND_CHAT_ROW_ID_WITH_TIMESTAMP_GREATER_THAN_SQL"
            android.database.Cursor r12 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0133 }
            java.util.ArrayList r19 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0121 }
            r3 = 0
        L_0x00b0:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00de
            if (r3 >= r13) goto L_0x00de
            X.1LW r0 = r9.A00     // Catch:{ all -> 0x0121 }
            r1 = r0
            java.lang.String r0 = "chat_row_id"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0121 }
            long r17 = r12.getLong(r0)     // Catch:{ all -> 0x0123 }
            r2 = r1
            r0 = r17
            X.1BI r1 = r2.A0B(r0)     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x00b0
            java.lang.String r0 = "_id"
            int r2 = X.C17890vO.A01(r12, r0)     // Catch:{ all -> 0x0123 }
            r0 = r19
            r0.add(r1)     // Catch:{ all -> 0x0123 }
            r5.element = r2     // Catch:{ all -> 0x0123 }
            int r3 = r3 + 1
            goto L_0x00b0
        L_0x00de:
            r14.L$0 = r4     // Catch:{ all -> 0x0123 }
            r14.L$1 = r5     // Catch:{ all -> 0x0123 }
            r14.L$2 = r6     // Catch:{ all -> 0x0123 }
            r14.L$3 = r7     // Catch:{ all -> 0x0123 }
            r14.L$4 = r8     // Catch:{ all -> 0x0123 }
            r14.L$5 = r9     // Catch:{ all -> 0x0123 }
            r14.L$6 = r10     // Catch:{ all -> 0x0123 }
            r14.L$7 = r11     // Catch:{ all -> 0x0123 }
            r14.L$8 = r12     // Catch:{ all -> 0x0121 }
            r14.L$9 = r12     // Catch:{ all -> 0x0121 }
            r14.J$0 = r15     // Catch:{ all -> 0x0121 }
            r0 = r22
            r14.I$0 = r0     // Catch:{ all -> 0x0121 }
            r14.I$1 = r13     // Catch:{ all -> 0x0121 }
            r0 = r20
            r14.label = r0     // Catch:{ all -> 0x0123 }
            r0 = r19
            java.lang.Object r1 = r4.BJt(r0, r14)     // Catch:{ all -> 0x0123 }
            r0 = r21
            if (r1 != r0) goto L_0x0109
            goto L_0x011e
        L_0x0109:
            r2 = r12
            goto L_0x010e
        L_0x010b:
            X.C30691eM.A01(r24)     // Catch:{ all -> 0x011f }
        L_0x010e:
            int r0 = r12.getCount()     // Catch:{ all -> 0x011f }
            if (r0 != 0) goto L_0x0117
            r0 = 0
            r11.element = r0     // Catch:{ all -> 0x011f }
        L_0x0117:
            if (r2 == 0) goto L_0x006d
            r2.close()     // Catch:{ all -> 0x0133 }
            goto L_0x006d
        L_0x011e:
            return r21
        L_0x011f:
            r1 = move-exception
            goto L_0x0125
        L_0x0121:
            r1 = move-exception
            goto L_0x0124
        L_0x0123:
            r1 = move-exception
        L_0x0124:
            r2 = r12
        L_0x0125:
            throw r1     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x012b:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0133 }
            if (r6 == 0) goto L_0x0132
            r6.close()
        L_0x0132:
            return r0
        L_0x0133:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagedrafts.CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
