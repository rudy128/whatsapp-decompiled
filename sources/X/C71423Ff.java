package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {963, 965}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.3Ff  reason: invalid class name and case insensitive filesystem */
public final class C71423Ff extends C71433Fg implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ AnonymousClass1OC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71423Ff(C30391dr r1, AnonymousClass1OC r2) {
        super(r1);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, C21488Akx akx) {
        return ((C71423Ff) create(akx, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        C71423Ff r0 = new C71423Ff(r4, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r3) goto L_0x006d
            if (r0 != r4) goto L_0x0068
            java.lang.Object r3 = r6.L$2
            X.1OL r3 = (X.AnonymousClass1OL) r3
            java.lang.Object r1 = r6.L$1
            java.lang.Object r2 = r6.L$0
            X.Akx r2 = (X.C21488Akx) r2
            X.C30691eM.A01(r7)
        L_0x0019:
            X.1OL r3 = r3.A02()
        L_0x001d:
            boolean r0 = X.C18070vi.A18(r3, r1)
            if (r0 != 0) goto L_0x0070
            boolean r0 = r3 instanceof X.AnonymousClass1OP
            if (r0 == 0) goto L_0x0019
            r0 = r3
            X.1OP r0 = (X.AnonymousClass1OP) r0
            X.1OC r0 = r0.A00
            r6.L$0 = r2
            r6.L$1 = r1
            r6.L$2 = r3
            r6.label = r4
        L_0x0034:
            r2.A00(r0, r6)
            return r5
        L_0x0038:
            X.C30691eM.A01(r7)
            java.lang.Object r2 = r6.L$0
            X.Akx r2 = (X.C21488Akx) r2
            X.1OC r0 = r6.this$0
            java.lang.Object r1 = r0.A0Z()
            boolean r0 = r1 instanceof X.AnonymousClass1OP
            if (r0 == 0) goto L_0x0050
            X.1OP r1 = (X.AnonymousClass1OP) r1
            X.1OC r0 = r1.A00
            r6.label = r3
            goto L_0x0034
        L_0x0050:
            boolean r0 = r1 instanceof X.AnonymousClass1OG
            if (r0 == 0) goto L_0x0070
            X.1OG r1 = (X.AnonymousClass1OG) r1
            X.3JS r1 = r1.BU1()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r3 = r1.A01()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            X.C18070vi.A0z(r3, r0)
            X.1OL r3 = (X.AnonymousClass1OL) r3
            goto L_0x001d
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x006d:
            X.C30691eM.A01(r7)
        L_0x0070:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71423Ff.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
