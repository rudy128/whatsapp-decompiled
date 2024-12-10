package com.whatsapp.calling.vcoverscroll.vm;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1EC;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C63982u1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1", f = "VCOverscrollEntryPointStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public int label;
    public final /* synthetic */ VCOverscrollEntryPointStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1(VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.$groupJid = r3;
        this.this$0 = vCOverscrollEntryPointStateHolder;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1(this.this$0, this.$groupJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1EC r5 = this.$groupJid;
            AnonymousClass11S A0H = C17880vN.A0H(this.this$0.A0P);
            AnonymousClass1M9 r3 = (AnonymousClass1M9) this.this$0.A0N.get();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = C63982u1.A03(A0H, (AnonymousClass1MZ) this.this$0.A0O.get(), r5).iterator();
            while (it.hasNext()) {
                AnonymousClass3MY.A1O(r3, C17880vN.A0Q(it), A13);
            }
            return A13;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VCOverscrollEntryPointStateHolder$maybeStartVC$contacts$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
