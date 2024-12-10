package androidx.room;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.C20076A6c;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutinesRoom$Companion$createFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Callable $callable;
    public final /* synthetic */ C20076A6c $db;
    public final /* synthetic */ boolean $inTransaction;
    public final /* synthetic */ String[] $tableNames;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            boolean z = z;
            AnonymousClass1 r0 = new AnonymousClass1(a6c, callable, r9, r7, strArr, z);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x008d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r13.label
                r4 = 1
                if (r0 == 0) goto L_0x000f
                if (r0 != r4) goto L_0x008e
                X.C30691eM.A01(r14)
            L_0x000c:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x000f:
                X.C30691eM.A01(r14)
                java.lang.Object r5 = r13.L$0
                X.1OX r5 = (X.AnonymousClass1OX) r5
                r10 = 0
                r1 = -1
                X.1Pg r0 = X.C25691Pg.SUSPEND
                X.DXn r11 = X.AnonymousClass4W8.A01(r0, r1)
                java.lang.String[] r0 = r8
                X.9ZR r7 = new X.9ZR
                r7.<init>(r11, r0)
                X.1Wu r0 = X.C27621Wu.A00
                r11.CQ0(r0)
                X.0wh r1 = r5.getCoroutineContext()
                X.7SF r0 = X.AnonymousClass7SE.A00
                r1.get(r0)
                boolean r1 = r9
                X.A6c r0 = r4
                java.util.Map r6 = r0.A07
                if (r1 == 0) goto L_0x004d
                java.lang.String r2 = "TransactionDispatcher"
                java.lang.Object r1 = r6.get(r2)
                if (r1 != 0) goto L_0x0064
                java.util.concurrent.Executor r0 = r0.A04
                if (r0 != 0) goto L_0x005c
                java.lang.String r0 = "internalTransactionExecutor"
            L_0x0049:
                X.C18070vi.A11(r0)
                throw r10
            L_0x004d:
                java.lang.String r2 = "QueryDispatcher"
                java.lang.Object r1 = r6.get(r2)
                if (r1 != 0) goto L_0x006f
                java.util.concurrent.Executor r0 = r0.A03
                if (r0 != 0) goto L_0x0067
                java.lang.String r0 = "internalQueryExecutor"
                goto L_0x0049
            L_0x005c:
                X.1Hq r1 = new X.1Hq
                r1.<init>(r0)
                r6.put(r2, r1)
            L_0x0064:
                X.0wj r1 = (X.C18580wj) r1
                goto L_0x0071
            L_0x0067:
                X.1Hq r1 = new X.1Hq
                r1.<init>(r0)
                r6.put(r2, r1)
            L_0x006f:
                X.0wj r1 = (X.C18580wj) r1
            L_0x0071:
                r0 = 0
                X.DXn r12 = new X.DXn
                r12.<init>(r0)
                X.A6c r8 = r4
                java.util.concurrent.Callable r9 = r5
                androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1 r6 = new androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1
                r6.<init>(r7, r8, r9, r10, r11, r12)
                X.AnonymousClass3MW.A1X(r1, r6, r5)
                X.1G2 r0 = r7
                r13.label = r4
                java.lang.Object r0 = X.AnonymousClass4WB.A00(r13, r12, r0, r4)
                if (r0 != r3) goto L_0x000c
                return r3
            L_0x008e:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(C20076A6c a6c, Callable callable, C30391dr r4, String[] strArr, boolean z) {
        super(2, r4);
        this.$inTransaction = z;
        this.$db = a6c;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        boolean z = this.$inTransaction;
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$db, this.$callable, r8, this.$tableNames, z);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1G2 r7 = (AnonymousClass1G2) this.L$0;
            final boolean z = this.$inTransaction;
            final C20076A6c a6c = this.$db;
            final String[] strArr = this.$tableNames;
            final Callable callable = this.$callable;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass1OW.A00(this, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoroutinesRoom$Companion$createFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
