package com.whatsapp.interop.integrator;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1E1;
import X.AnonymousClass1M4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass428;
import X.AnonymousClass429;
import X.AnonymousClass42A;
import X.AnonymousClass4A1;
import X.AnonymousClass4A2;
import X.AnonymousClass4A3;
import X.AnonymousClass5YP;
import X.AnonymousClass9FD;
import X.C107765aY;
import X.C178629Dv;
import X.C178709Ed;
import X.C17880vN;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34651kr;
import X.C827549y;
import com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2", f = "IntegratorManager.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$resolveUsers$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $users;
    public int label;
    public final /* synthetic */ C34651kr this$0;

    @DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2$1", f = "IntegratorManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r8, r9, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ((AnonymousClass1M4) C34651kr.this.A00.get()).Bdb((AnonymousClass1E1) ((AnonymousClass4A3) r9).A01, r8.A03);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$resolveUsers$2(C34651kr r2, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$users = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new IntegratorManager$resolveUsers$2(this.this$0, this.$users, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DmaInteropRPCManager dmaInteropRPCManager = (DmaInteropRPCManager) this.this$0.A02.get();
            List<AnonymousClass1D6> list = this.$users;
            ArrayList A0D = C29351c6.A0D(list);
            for (AnonymousClass1D6 r0 : list) {
                A0D.add(new C178709Ed((String) r0.first, (long) AnonymousClass000.A0M(r0.second)));
            }
            this.label = 1;
            obj = dmaInteropRPCManager.A03(A0D, this, 393);
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9FD r12 = (AnonymousClass9FD) obj;
        if (r12 == null) {
            return AnonymousClass42A.A00;
        }
        if (r12.A00 != 1) {
            return new AnonymousClass428((int) ((C107765aY) r12.A01).BOr());
        }
        LinkedHashMap A13 = C17880vN.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        for (final C827549y r8 : (List) r12.A02) {
            AnonymousClass1D6 A01 = AnonymousClass1D6.A01(r8.A02, AnonymousClass3MW.A0v((int) r8.A00));
            final AnonymousClass5YP r9 = r8.A01;
            if (r9 instanceof AnonymousClass4A3) {
                AnonymousClass4A3 r1 = (AnonymousClass4A3) r9;
                if (r1.A00 == 1) {
                    A13.put(A01, r1.A01);
                    final C34651kr r3 = this.this$0;
                    AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), r3.A05);
                } else {
                    Object obj2 = r1.A01;
                    if (obj2 instanceof AnonymousClass4A1) {
                        A134.add(A01);
                    } else if (obj2 instanceof C178629Dv) {
                        A132.add(A01);
                    } else if (obj2 instanceof AnonymousClass4A2) {
                        A133.add(A01);
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        return new AnonymousClass429(A132, A133, A134, A13);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IntegratorManager$resolveUsers$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
