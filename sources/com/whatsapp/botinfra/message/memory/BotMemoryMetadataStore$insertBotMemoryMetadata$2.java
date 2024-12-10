package com.whatsapp.botinfra.message.memory;

import X.AnonymousClass1OS;
import X.C20951Ac5;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$insertBotMemoryMetadata$2", f = "BotMemoryMetadataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BotMemoryMetadataStore$insertBotMemoryMetadata$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C20951Ac5 $botMemoryData;
    public final /* synthetic */ String $memoryAnnotatedUserMessageKeyId;
    public final /* synthetic */ long $messageRowId;
    public int label;
    public final /* synthetic */ BotMemoryMetadataStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotMemoryMetadataStore$insertBotMemoryMetadata$2(C20951Ac5 ac5, BotMemoryMetadataStore botMemoryMetadataStore, String str, C30391dr r5, long j) {
        super(2, r5);
        this.this$0 = botMemoryMetadataStore;
        this.$botMemoryData = ac5;
        this.$messageRowId = j;
        this.$memoryAnnotatedUserMessageKeyId = str;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        BotMemoryMetadataStore botMemoryMetadataStore = this.this$0;
        return new BotMemoryMetadataStore$insertBotMemoryMetadata$2(this.$botMemoryData, botMemoryMetadataStore, this.$memoryAnnotatedUserMessageKeyId, r9, this.$messageRowId);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            if (r0 != 0) goto L_0x00e5
            X.C30691eM.A01(r15)
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore r0 = r14.this$0     // Catch:{ Exception -> 0x00d1 }
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x00d1 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00d1 }
            X.1Cd r0 = (X.AnonymousClass1Cd) r0     // Catch:{ Exception -> 0x00d1 }
            X.1au r4 = r0.A05()     // Catch:{ Exception -> 0x00d1 }
            X.Ac5 r10 = r14.$botMemoryData     // Catch:{ Exception -> 0x00d1 }
            long r2 = r14.$messageRowId     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r9 = r14.$memoryAnnotatedUserMessageKeyId     // Catch:{ Exception -> 0x00d1 }
            X.1xA r6 = r4.BD0()     // Catch:{ all -> 0x00ca }
            java.util.List r0 = r10.A00     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x006b
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x0027:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x00c3 }
            X.1D6 r1 = (X.AnonymousClass1D6) r1     // Catch:{ all -> 0x00c3 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c3 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00c3 }
            java.lang.String r7 = "bot_memory_metadata"
            java.lang.Object r12 = r1.first     // Catch:{ all -> 0x00c3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00c3 }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c3 }
            r11 = 1
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "message_row_id"
            X.C17880vN.A19(r5, r0, r2)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "memory_annotated_user_message_key_id"
            r5.put(r0, r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "memory"
            r5.put(r0, r12)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "memory_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "added"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x00c3 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "BotMemoryMetadataStore/insertBotMemoryMetadata"
            r0 = 5
            r8.A09(r7, r1, r5, r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x0027
        L_0x006b:
            java.util.List r0 = r10.A01     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b7
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x0073:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x00c3 }
            X.1D6 r1 = (X.AnonymousClass1D6) r1     // Catch:{ all -> 0x00c3 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c3 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00c3 }
            java.lang.String r7 = "bot_memory_metadata"
            java.lang.Object r11 = r1.first     // Catch:{ all -> 0x00c3 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00c3 }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c3 }
            r10 = 0
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "message_row_id"
            X.C17880vN.A19(r5, r0, r2)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "memory_annotated_user_message_key_id"
            r5.put(r0, r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "memory"
            r5.put(r0, r11)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "memory_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "added"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x00c3 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "BotMemoryMetadataStore/insertBotMemoryMetadata"
            r0 = 5
            r8.A09(r7, r1, r5, r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x0073
        L_0x00b7:
            r6.A00()     // Catch:{ all -> 0x00c3 }
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x00c3 }
            r6.close()     // Catch:{ all -> 0x00ca }
            r4.close()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00df
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ Exception -> 0x00d1 }
            throw r0     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMemoryMetadataStore/insertBotMemoryMetadata failed "
            X.C108995ce.A1M(r0, r1, r2)
            X.1IU r1 = X.C108945cZ.A1J(r2)
        L_0x00df:
            X.1eK r0 = new X.1eK
            r0.<init>(r1)
            return r0
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$insertBotMemoryMetadata$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotMemoryMetadataStore$insertBotMemoryMetadata$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
