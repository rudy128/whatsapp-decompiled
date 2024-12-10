package com.whatsapp.conversation.messagesloader;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C87054Uc;
import X.C95184lp;
import android.graphics.Point;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preLoadMessagesHelper$1", f = "ConversationMessagesLoaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationMessagesLoaderImpl$preLoadMessagesHelper$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $conversationRowMinHeight;
    public final /* synthetic */ Point $displaySize;
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ C87054Uc $scrollToMessage;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C95184lp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationMessagesLoaderImpl$preLoadMessagesHelper$1(Point point, C87054Uc r3, C95184lp r4, AnonymousClass1BI r5, C30391dr r6, int i) {
        super(2, r6);
        this.this$0 = r4;
        this.$jid = r5;
        this.$displaySize = point;
        this.$conversationRowMinHeight = i;
        this.$scrollToMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C95184lp r3 = this.this$0;
        AnonymousClass1BI r4 = this.$jid;
        ConversationMessagesLoaderImpl$preLoadMessagesHelper$1 conversationMessagesLoaderImpl$preLoadMessagesHelper$1 = new ConversationMessagesLoaderImpl$preLoadMessagesHelper$1(this.$displaySize, this.$scrollToMessage, r3, r4, r9, this.$conversationRowMinHeight);
        conversationMessagesLoaderImpl$preLoadMessagesHelper$1.L$0 = obj;
        return conversationMessagesLoaderImpl$preLoadMessagesHelper$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0 = r4.$displaySize;
        r1 = r4.$conversationRowMinHeight;
        X.C18070vi.A0d(r0, 0);
        r19 = (r0.y * 2) / r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r10 <= (r19 - 10)) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r19 = r10 + 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r6 = r4.this$0;
        r12 = X.C95184lp.A00(r4.$scrollToMessage, r6, r4.$jid, r19, r10, 1, Long.MIN_VALUE, r6.A04.A00, false);
        r0 = r4.this$0;
        r11 = r12.A03;
        r9 = r11.A00;
        r5 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r9 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        r2 = r0.A05;
        r1 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (X.C18020vd.A05(r1, r2, 12222) == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r8 = r9.getColumnIndexOrThrow("_id");
        r7 = r9.getColumnIndexOrThrow("message_type");
        r6 = r9.getColumnIndexOrThrow("from_me");
        r0 = X.C18020vd.A00(r1, r2, 12370);
        r2 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        if (r0 <= 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r2 = java.lang.Math.min(100, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r10 <= 0) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r9.moveToLast() == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r5.add(new X.AnonymousClass4UB(r9.getInt(r7), r9.getLong(r8), X.C17890vO.A1R(r9.getInt(r6))));
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (r9.moveToPrevious() == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        if (r2 > 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
        r9.moveToFirst();
        r9.getCount();
        r5.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        r7 = new X.C87204Ur(r12.A02, r11, r5, r12.A00, r12.A01);
        r2 = r4.this$0;
        r1 = r4.$jid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fd, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        if (r9.moveToFirst() == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r5.add(new X.AnonymousClass4UB(r9.getInt(r7), r9.getLong(r8), X.C17890vO.A1R(r9.getInt(r6))));
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r9.moveToNext() == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        if (r2 > 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.A00.remove(r1);
        r2.A01.put(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0132, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        if (X.C17880vN.A1X(r5) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0139, code lost:
        r3 = r4.this$0;
        X.AnonymousClass3MW.A1X(r3.A09, new com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preLoadMessagesHelper$1.AnonymousClass3((X.C30391dr) null), r3.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        return r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r4 = r28
            int r0 = r4.label
            if (r0 != 0) goto L_0x014b
            X.C30691eM.A01(r29)
            java.lang.Object r3 = r4.L$0
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.4lp r0 = r4.this$0
            X.1CJ r1 = r0.A02
            X.1BI r0 = r4.$jid
            X.2Rv r1 = r1.A0B(r0)
            int r10 = r1.A00
            int r0 = r1.A01
            if (r10 > 0) goto L_0x0026
            if (r0 > 0) goto L_0x0026
            r10 = 0
        L_0x0020:
            X.4lp r0 = r4.this$0
            X.1BI r2 = r4.$jid
            monitor-enter(r3)
            goto L_0x0031
        L_0x0026:
            X.1BI r0 = r4.$jid
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x0020
            int r10 = r1.A02
            goto L_0x0020
        L_0x0031:
            java.util.Map r1 = r0.A00     // Catch:{ all -> 0x0148 }
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x003d
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0148 }
            monitor-exit(r3)
            return r0
        L_0x003d:
            X.0wh r0 = r3.getCoroutineContext()     // Catch:{ all -> 0x0148 }
            X.1OB r0 = X.C30551e8.A02(r0)     // Catch:{ all -> 0x0148 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0148 }
            X.1Wu r15 = X.C27621Wu.A00     // Catch:{ all -> 0x0148 }
            monitor-exit(r3)
            android.graphics.Point r0 = r4.$displaySize
            int r1 = r4.$conversationRowMinHeight
            r7 = 0
            X.C18070vi.A0d(r0, r7)
            int r0 = r0.y
            int r19 = r0 * 2
            int r19 = r19 / r1
            int r0 = r19 + -10
            if (r10 <= r0) goto L_0x005f
            int r19 = r10 + 10
        L_0x005f:
            X.4lp r6 = r4.this$0
            X.1BI r5 = r4.$jid
            X.4Uc r2 = r4.$scrollToMessage
            X.1Q9 r0 = r6.A04
            long r0 = r0.A00
            r21 = 1
            r23 = -9223372036854775808
            r18 = r5
            r20 = r10
            r25 = r0
            r27 = r7
            r16 = r2
            r17 = r6
            X.4Ur r12 = X.C95184lp.A00(r16, r17, r18, r19, r20, r21, r23, r25, r27)
            X.4lp r0 = r4.this$0
            X.2dp r11 = r12.A03
            android.database.Cursor r9 = r11.A00
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            if (r9 == 0) goto L_0x00e8
            X.0ve r2 = r0.A05
            r0 = 12222(0x2fbe, float:1.7127E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "_id"
            int r8 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "message_type"
            int r7 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "from_me"
            int r6 = r9.getColumnIndexOrThrow(r0)
            r0 = 12370(0x3052, float:1.7334E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            r2 = 100
            if (r0 <= 0) goto L_0x00b5
            int r2 = java.lang.Math.min(r2, r0)
        L_0x00b5:
            if (r10 <= 0) goto L_0x00ff
            boolean r0 = r9.moveToLast()
            if (r0 == 0) goto L_0x00df
        L_0x00bd:
            long r0 = r9.getLong(r8)
            int r14 = r9.getInt(r7)
            int r10 = r9.getInt(r6)
            boolean r13 = X.C17890vO.A1R(r10)
            X.4UB r10 = new X.4UB
            r10.<init>(r14, r0, r13)
            r5.add(r10)
            int r2 = r2 + -1
            boolean r0 = r9.moveToPrevious()
            if (r0 == 0) goto L_0x00df
            if (r2 > 0) goto L_0x00bd
        L_0x00df:
            r9.moveToFirst()
            r9.getCount()
            r5.size()
        L_0x00e8:
            r6 = 0
            int r8 = r12.A00
            X.4Uc r2 = r12.A02
            long r0 = r12.A01
            X.4Ur r7 = new X.4Ur
            r9 = r11
            r10 = r5
            r11 = r8
            r12 = r0
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            X.4lp r2 = r4.this$0
            X.1BI r1 = r4.$jid
            monitor-enter(r3)
            goto L_0x0128
        L_0x00ff:
            boolean r0 = r9.moveToFirst()
            if (r0 == 0) goto L_0x00df
        L_0x0105:
            long r0 = r9.getLong(r8)
            int r14 = r9.getInt(r7)
            int r10 = r9.getInt(r6)
            boolean r13 = X.C17890vO.A1R(r10)
            X.4UB r10 = new X.4UB
            r10.<init>(r14, r0, r13)
            r5.add(r10)
            int r2 = r2 + -1
            boolean r0 = r9.moveToNext()
            if (r0 == 0) goto L_0x00df
            if (r2 > 0) goto L_0x0105
            goto L_0x00df
        L_0x0128:
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0148 }
            r0.remove(r1)     // Catch:{ all -> 0x0148 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0148 }
            r0.put(r1, r7)     // Catch:{ all -> 0x0148 }
            monitor-exit(r3)
            boolean r0 = X.C17880vN.A1X(r5)
            if (r0 == 0) goto L_0x0147
            X.4lp r3 = r4.this$0
            X.1OX r2 = r3.A0B
            X.0wl r1 = r3.A09
            com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preLoadMessagesHelper$1$3 r0 = new com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preLoadMessagesHelper$1$3
            r0.<init>(r3, r5, r6)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
        L_0x0147:
            return r15
        L_0x0148:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x014b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preLoadMessagesHelper$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationMessagesLoaderImpl$preLoadMessagesHelper$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
