package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.50G  reason: invalid class name */
public final class AnonymousClass50G extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public AnonymousClass50G(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        AnonymousClass50G r0 = new AnonymousClass50G(r3);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass50G r1 = new AnonymousClass50G((C30391dr) obj2);
        r1.L$0 = obj;
        return r1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(AnonymousClass3Ma.A1Z(this.L$0, AnonymousClass4D2.START));
        }
        throw AnonymousClass000.A0l();
    }
}
