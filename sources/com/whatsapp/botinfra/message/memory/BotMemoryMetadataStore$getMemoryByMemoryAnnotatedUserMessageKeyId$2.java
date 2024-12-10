package com.whatsapp.botinfra.message.memory;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2", f = "BotMemoryMetadataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $annotatedUserMessageKeyId;
    public int label;
    public final /* synthetic */ BotMemoryMetadataStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2(BotMemoryMetadataStore botMemoryMetadataStore, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = botMemoryMetadataStore;
        this.$annotatedUserMessageKeyId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2(this.this$0, this.$annotatedUserMessageKeyId, r5);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x008e
            X.C30691eM.A01(r9)
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore r0 = r8.this$0     // Catch:{ Exception -> 0x007a }
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x007a }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x007a }
            X.1Cd r0 = (X.AnonymousClass1Cd) r0     // Catch:{ Exception -> 0x007a }
            X.1at r4 = r0.get()     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r8.$annotatedUserMessageKeyId     // Catch:{ Exception -> 0x007a }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0073 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "\n    SELECT added, \n           memory, \n           memory_id \n    FROM bot_memory_metadata\n    WHERE memory_annotated_user_message_key_id = ?\n    "
            r7 = 1
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0073 }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "BotMemoryMetadataStore/getMemoryByMemoryAnnotatedUserMessageKeyId"
            android.database.Cursor r5 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0073 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x006c }
        L_0x002e:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "memory"
            java.lang.String r3 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "memory_id"
            java.lang.String r2 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "added"
            int r0 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x006c }
            boolean r0 = X.AnonymousClass000.A1T(r0, r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x006c }
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x006c }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x006c }
            r6.add(r0)     // Catch:{ all -> 0x006c }
            int r0 = r6.size()     // Catch:{ all -> 0x006c }
            if (r0 <= r7) goto L_0x002e
            X.7Rn r0 = new X.7Rn     // Catch:{ all -> 0x006c }
            r0.<init>(r7)     // Catch:{ all -> 0x006c }
            X.C29391cC.A0H(r6, r0)     // Catch:{ all -> 0x006c }
            goto L_0x002e
        L_0x0065:
            r5.close()     // Catch:{ all -> 0x0073 }
            r4.close()     // Catch:{ Exception -> 0x007a }
            goto L_0x0088
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ Exception -> 0x007a }
            throw r0     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMemoryMetadataStore/getMemoryByMemoryAnnotatedUserMessageKeyId failed "
            X.C108995ce.A1M(r0, r1, r2)
            X.1IU r6 = X.C108945cZ.A1J(r2)
        L_0x0088:
            X.1eK r0 = new X.1eK
            r0.<init>(r6)
            return r0
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
