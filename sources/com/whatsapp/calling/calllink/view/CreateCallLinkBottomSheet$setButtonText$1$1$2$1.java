package com.whatsapp.calling.calllink.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet$setButtonText$1$1$2$1", f = "CreateCallLinkBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreateCallLinkBottomSheet$setButtonText$1$1$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ CreateCallLinkBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateCallLinkBottomSheet$setButtonText$1$1$2$1(CreateCallLinkBottomSheet createCallLinkBottomSheet, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = createCallLinkBottomSheet;
        this.$it = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CreateCallLinkBottomSheet$setButtonText$1$1$2$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            CreateCallLinkBottomSheet createCallLinkBottomSheet = this.this$0;
            String A0x = AnonymousClass3MW.A0x(AnonymousClass3MZ.A09(createCallLinkBottomSheet), this.$it, AnonymousClass3MW.A1a(), 0, 2131887649);
            C18070vi.A0X(A0x);
            CreateCallLinkBottomSheet.A05(createCallLinkBottomSheet, A0x, 2131232506);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CreateCallLinkBottomSheet$setButtonText$1$1$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
