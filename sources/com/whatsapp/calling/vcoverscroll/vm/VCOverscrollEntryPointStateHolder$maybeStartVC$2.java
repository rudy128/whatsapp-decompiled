package com.whatsapp.calling.vcoverscroll.vm;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass1VP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$maybeStartVC$2", f = "VCOverscrollEntryPointStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VCOverscrollEntryPointStateHolder$maybeStartVC$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $contacts;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ boolean $isConfirmed;
    public int label;
    public final /* synthetic */ VCOverscrollEntryPointStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointStateHolder$maybeStartVC$2(Context context, VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder, AnonymousClass1EC r4, List list, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = vCOverscrollEntryPointStateHolder;
        this.$contacts = list;
        this.$context = context;
        this.$groupJid = r4;
        this.$isConfirmed = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new VCOverscrollEntryPointStateHolder$maybeStartVC$2(this.$context, this.this$0, this.$groupJid, this.$contacts, r9, this.$isConfirmed);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (((AnonymousClass1VP) this.this$0.A0M.get()).BjR(this.$context, this.$groupJid, this.$contacts, 57, this.$isConfirmed, false, true) != 0) {
                VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder = this.this$0;
                vCOverscrollEntryPointStateHolder.A08 = AnonymousClass00R.A00;
                VCOverscrollEntryPointStateHolder.A00(vCOverscrollEntryPointStateHolder, 0.0f);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VCOverscrollEntryPointStateHolder$maybeStartVC$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
