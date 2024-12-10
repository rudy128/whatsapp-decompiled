package androidx.lifecycle.compose;

import X.AnonymousClass000;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.C17300uR;
import X.C18070vi;
import X.C18560wh;
import X.C23381Fv;
import X.C23401Fx;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1", f = "FlowExt.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$collectAsStateWithLifecycle$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18560wh $context;
    public final /* synthetic */ C23381Fv $lifecycle;
    public final /* synthetic */ C23401Fx $minActiveState;
    public final /* synthetic */ C23421Fz $this_collectAsStateWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {173, 174}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r6, r6, r3, r2);
        }

        public final Object invokeSuspend(Object obj) {
            Object A00;
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                if (C18070vi.A18(r3, AnonymousClass1OR.A00)) {
                    C23421Fz r1 = r2;
                    C99624tC A002 = C99624tC.A00(r6, 2);
                    this.label = 1;
                    A00 = r1.BFC(this, A002);
                } else {
                    C18560wh r4 = r3;
                    final C23421Fz r3 = r2;
                    final C17300uR r2 = r6;
                    AnonymousClass2 r0 = new AnonymousClass1OS((C30391dr) null) {
                        public int label;

                        public final C30391dr create(Object obj, C30391dr r5) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public FlowExtKt$collectAsStateWithLifecycle$1(C23401Fx r2, C23381Fv r3, C30391dr r4, C18560wh r5, C23421Fz r6) {
                                super(2, r4);
                                this.$lifecycle = r3;
                                this.$minActiveState = r2;
                                this.$context = r5;
                                this.$this_collectAsStateWithLifecycle = r6;
                            }

                            public final C30391dr create(Object obj, C30391dr r8) {
                                FlowExtKt$collectAsStateWithLifecycle$1 flowExtKt$collectAsStateWithLifecycle$1 = new FlowExtKt$collectAsStateWithLifecycle$1(this.$minActiveState, this.$lifecycle, r8, this.$context, this.$this_collectAsStateWithLifecycle);
                                flowExtKt$collectAsStateWithLifecycle$1.L$0 = obj;
                                return flowExtKt$collectAsStateWithLifecycle$1;
                            }

                            public final Object invokeSuspend(Object obj) {
                                C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
                                int i = this.label;
                                if (i == 0) {
                                    C30691eM.A01(obj);
                                    final C17300uR r6 = (C17300uR) this.L$0;
                                    C23381Fv r5 = this.$lifecycle;
                                    C23401Fx r4 = this.$minActiveState;
                                    final C18560wh r3 = this.$context;
                                    final C23421Fz r2 = this.$this_collectAsStateWithLifecycle;
                                    AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                    this.label = 1;
                                    if (C87334Ve.A00(r4, r5, this, r0) == r8) {
                                        return r8;
                                    }
                                } else if (i == 1) {
                                    C30691eM.A01(obj);
                                } else {
                                    throw AnonymousClass000.A0l();
                                }
                                return C27621Wu.A00;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return ((FlowExtKt$collectAsStateWithLifecycle$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                            }
                        }
