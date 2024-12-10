package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57J  reason: invalid class name */
public final class AnonymousClass57J extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz[] $flows;
    public final /* synthetic */ AnonymousClass20G $transform$inlined;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57J(C30391dr r2, AnonymousClass20G r3, C23421Fz[] r4) {
        super(2, r2);
        this.$flows = r4;
        this.$transform$inlined = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57J r0 = new AnonymousClass57J(r5, this.$transform$inlined, this.$flows);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz[] r4 = this.$flows;
            AnonymousClass5QQ r3 = AnonymousClass5QQ.A00;
            AnonymousClass5AM r0 = new AnonymousClass5AM((C30391dr) null, this.$transform$inlined);
            this.label = 1;
            if (AnonymousClass4I7.A00(this, r3, r0, (AnonymousClass1G2) this.L$0, r4) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass57J) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
