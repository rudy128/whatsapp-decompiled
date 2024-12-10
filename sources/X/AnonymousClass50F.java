package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.50F  reason: invalid class name */
public final class AnonymousClass50F extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ int I$0;
    public int label;

    public AnonymousClass50F(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AnonymousClass50F r1 = new AnonymousClass50F(r4);
        r1.I$0 = AnonymousClass000.A0M(obj);
        return r1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(AnonymousClass000.A1R(this.I$0));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass50F) C72473Md.A0l(obj, obj2, this)).invokeSuspend(C27621Wu.A00);
    }
}
