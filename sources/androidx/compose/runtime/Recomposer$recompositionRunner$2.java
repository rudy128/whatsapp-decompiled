package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04790Ov;
import X.C13010mg;
import X.C16320s4;
import X.C17250uM;
import X.C17860vL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31761g5;
import X.C36001nB;
import X.C62892sA;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1003}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
public final class Recomposer$recompositionRunner$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C36001nB $block;
    public final /* synthetic */ C17860vL $parentFrameClock;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(C17860vL r2, Recomposer recomposer, C30391dr r4, C36001nB r5) {
        super(2, r4);
        this.this$0 = recomposer;
        this.$block = r5;
        this.$parentFrameClock = r2;
    }

    /* renamed from: A02 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((Recomposer$recompositionRunner$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.$parentFrameClock, this.this$0, r6, this.$block);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1004}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3  reason: invalid class name */
    public final class AnonymousClass3 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: A00 */
        public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
            return ((AnonymousClass3) create(r4, r3)).invokeSuspend(C27621Wu.A00);
        }

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass3 r0 = new AnonymousClass3(r1, r5, r2);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 A03 = AnonymousClass3F6.A03();
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                Object obj2 = this.L$0;
                C36001nB r1 = r2;
                C17860vL r0 = r1;
                this.label = 1;
                if (r1.invoke(obj2, r0, this) == A03) {
                    return A03;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    public static final void A00(X.AnonymousClass0H7 r3) {
        /*
        L_0x0000:
            X.1G4 r0 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r2 = r0.getValue()
            X.0vJ r2 = (X.C17840vJ) r2
            X.0as r1 = r2.BAm(r3)
            if (r2 == r1) goto L_0x001a
            X.1G4 r0 = androidx.compose.runtime.Recomposer.A0N
            boolean r0 = r0.BFK(r2, r1)
            if (r0 == 0) goto L_0x0000
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.A00(X.0H7):void");
    }

    public static final void A01(X.AnonymousClass0H7 r3) {
        /*
        L_0x0000:
            X.1G4 r0 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r2 = r0.getValue()
            X.0vJ r2 = (X.C17840vJ) r2
            X.0as r1 = r2.CEW(r3)
            if (r2 == r1) goto L_0x001a
            X.1G4 r0 = androidx.compose.runtime.Recomposer.A0N
            boolean r0 = r0.BFK(r2, r1)
            if (r0 == 0) goto L_0x0000
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.A01(X.0H7):void");
    }

    public final Object invokeSuspend(Object obj) {
        C16320s4 r5;
        Object obj2;
        Object obj3;
        List A08;
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OB A00 = C62892sA.A00(((AnonymousClass1OX) this.L$0).getCoroutineContext());
            this.this$0.A0O(A00);
            r5 = C04790Ov.A01(new C13010mg(this.this$0));
            A00(this.this$0.A0A);
            obj2 = A00;
            Recomposer recomposer = this.this$0;
            synchronized (recomposer.A0B) {
                A08 = Recomposer.A08(recomposer);
                obj2 = A00;
            }
            int size = A08.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C17250uM) A08.get(i2)).Bdl();
            }
            final C36001nB r2 = this.$block;
            final C17860vL r1 = this.$parentFrameClock;
            AnonymousClass3 r0 = new AnonymousClass3((C30391dr) null);
            this.L$0 = A00;
            this.L$1 = r5;
            this.label = 1;
            obj3 = A00;
            if (AnonymousClass1OW.A00(this, r0) == A03) {
                return A03;
            }
        } else if (i == 1) {
            r5 = (C16320s4) this.L$1;
            Object obj4 = this.L$0;
            try {
                obj2 = obj4;
                C30691eM.A01(obj);
                obj2 = obj4;
                obj3 = obj4;
            } catch (Throwable th) {
                r5.dispose();
                Recomposer recomposer2 = this.this$0;
                synchronized (recomposer2.A0B) {
                    if (recomposer2.A09 == obj2) {
                        recomposer2.A09 = null;
                    }
                    C31761g5 unused = recomposer2.A0B();
                    A01(this.this$0.A0A);
                    throw th;
                }
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        r5.dispose();
        Recomposer recomposer3 = this.this$0;
        synchronized (recomposer3.A0B) {
            if (recomposer3.A09 == obj3) {
                recomposer3.A09 = null;
            }
            C31761g5 unused2 = recomposer3.A0B();
        }
        A01(this.this$0.A0A);
        return C27621Wu.A00;
    }
}
