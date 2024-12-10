package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.5AM  reason: invalid class name */
public final class AnonymousClass5AM extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass20G $transform$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AM(C30391dr r2, AnonymousClass20G r3) {
        super(3, r2);
        this.$transform$inlined = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass5AM r1 = new AnonymousClass5AM((C30391dr) obj3, this.$transform$inlined);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            AnonymousClass20G r2 = this.$transform$inlined;
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            this.label = 1;
            if (r2.invoke(obj2, obj3, obj4, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
