package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.5AR  reason: invalid class name */
public final class AnonymousClass5AR extends C30431dv implements C36001nB {
    public final /* synthetic */ long $periodMillis;
    public final /* synthetic */ C23421Fz $this_sample;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AR(C30391dr r2, C23421Fz r3, long j) {
        super(3, r2);
        this.$periodMillis = j;
        this.$this_sample = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass5AR r2 = new AnonymousClass5AR((C30391dr) obj3, this.$this_sample, this.$periodMillis);
        r2.L$0 = obj;
        r2.L$1 = obj2;
        return r2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C98494rF r11;
        C108585bw r10;
        AnonymousClass1G2 r6;
        C108585bw r3;
        C31751g4 r9 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r5 = (AnonymousClass1OX) this.L$0;
            r6 = (AnonymousClass1G2) this.L$1;
            AnonymousClass55P r1 = new AnonymousClass55P((C30391dr) null, this.$this_sample);
            AnonymousClass1OR r4 = AnonymousClass1OR.A00;
            r10 = AnonymousClass4W9.A01(r4, r1, r5, -1);
            r11 = C98494rF.A00();
            r3 = AnonymousClass4W9.A01(r4, new AnonymousClass55N((C30391dr) null, this.$periodMillis), r5, 0);
        } else if (i == 1) {
            r3 = (C108585bw) this.L$3;
            r11 = (C98494rF) this.L$2;
            r10 = (C108585bw) this.L$1;
            r6 = (AnonymousClass1G2) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        while (r11.element != AnonymousClass4IV.A00) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C27175DXk.A05;
            C27175DXk dXk = new C27175DXk(getContext());
            dXk.A05(new AnonymousClass57H((C30391dr) null, r11, r3), r10.BVk());
            dXk.A05(new AnonymousClass55O((C30391dr) null, r11, r6), r3.BVj());
            this.L$0 = r6;
            this.L$1 = r10;
            this.L$2 = r11;
            this.L$3 = r3;
            this.label = 1;
            if (C27175DXk.A03(this, dXk) == r9) {
                return r9;
            }
        }
        return C27621Wu.A00;
    }
}
