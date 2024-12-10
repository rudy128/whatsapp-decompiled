package com.whatsapp.comments;

import X.AnonymousClass1OS;
import X.AnonymousClass4ZK;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$loadMessages$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$loadMessages$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$loadMessages$1(AnonymousClass4ZK r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommentListManager$loadMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentListManager$loadMessages$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x00a9
            X.C30691eM.A01(r11)
            X.4ZK r5 = r10.this$0
            X.1G4 r4 = r5.A0A
        L_0x000b:
            java.lang.Object r6 = r4.getValue()
            X.1Cd r0 = r5.A02
            X.1at r3 = r0.get()
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x00a2 }
            X.206 r0 = r5.A03     // Catch:{ all -> 0x00a2 }
            long r0 = r0.A0x     // Catch:{ all -> 0x00a2 }
            r9 = 200(0xc8, float:2.8E-43)
            r8 = 0
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x00a2 }
            X.C17880vN.A1V(r7, r8, r0)     // Catch:{ all -> 0x00a2 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a2 }
            r7[r1] = r0     // Catch:{ all -> 0x00a2 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a2 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = X.C50862Wb.A01     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "SELECT_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r2 = r2.A0A(r1, r0, r7)     // Catch:{ all -> 0x00a2 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x00a2 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x009b }
            java.util.ArrayList r1 = X.C17880vN.A0z(r0)     // Catch:{ all -> 0x009b }
            r0 = -1
            r2.moveToPosition(r0)     // Catch:{ all -> 0x009b }
            boolean r0 = r2.isBeforeFirst()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0055
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x0055
            goto L_0x006d
        L_0x0055:
            boolean r0 = r2.isAfterLast()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            X.1W6 r0 = r5.A04     // Catch:{ all -> 0x009b }
            X.206 r0 = r0.A01(r2)     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0067
            r1.add(r0)     // Catch:{ all -> 0x009b }
        L_0x0067:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x005c
        L_0x006d:
            r2.close()     // Catch:{ all -> 0x00a2 }
            java.util.Comparator r0 = X.AnonymousClass4ZK.A0D     // Catch:{ all -> 0x00a2 }
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x00a2 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a2 }
            X.C29431cG.A17(r1, r2)     // Catch:{ all -> 0x00a2 }
            int r0 = r2.size()     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0088
            java.util.concurrent.atomic.AtomicReference r1 = r5.A05     // Catch:{ all -> 0x00a2 }
            X.4D4 r0 = X.AnonymousClass4D4.COMPLETE     // Catch:{ all -> 0x00a2 }
            r1.set(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x008f
        L_0x0088:
            java.util.concurrent.atomic.AtomicReference r1 = r5.A05     // Catch:{ all -> 0x00a2 }
            X.4D4 r0 = X.AnonymousClass4D4.INCOMPLETE     // Catch:{ all -> 0x00a2 }
            r1.set(r0)     // Catch:{ all -> 0x00a2 }
        L_0x008f:
            r3.close()
            boolean r0 = r4.BFK(r6, r2)
            if (r0 == 0) goto L_0x000b
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x00a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.comments.CommentListManager$loadMessages$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
