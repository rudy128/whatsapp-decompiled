package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1W6;
import X.AnonymousClass21V;
import X.C144877Ja;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$requestCodePickupGroup$1", f = "MediaViewCurrentMessageViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class MediaViewCurrentMessageViewModel$requestCodePickupGroup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $rowId;
    public int label;
    public final /* synthetic */ MediaViewCurrentMessageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaViewCurrentMessageViewModel$requestCodePickupGroup$1(MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = mediaViewCurrentMessageViewModel;
        this.$rowId = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MediaViewCurrentMessageViewModel$requestCodePickupGroup$1(this.this$0, r6, this.$rowId);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1W6 A0c = C17880vN.A0c(this.this$0.A04);
            long j = this.$rowId;
            MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = this.this$0;
            C144877Ja r3 = new C144877Ja((AnonymousClass21V) A0c.A01.A03(j));
            this.label = 1;
            if (C30451dy.A00(this, mediaViewCurrentMessageViewModel.A07, new MediaViewCurrentMessageViewModel$notifyState$2(r3, mediaViewCurrentMessageViewModel, (C30391dr) null)) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaViewCurrentMessageViewModel$requestCodePickupGroup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
