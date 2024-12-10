package com.whatsapp.profile.compose;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C04310Mr;
import X.C16750sx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.compose.UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1", f = "UsernamePinEntryBottomSheetScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C04310Mr $focusRequester;
    public final /* synthetic */ C16750sx $keyboard;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1(C04310Mr r2, C16750sx r3, C30391dr r4) {
        super(2, r4);
        this.$keyboard = r3;
        this.$focusRequester = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1(this.$focusRequester, this.$keyboard, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C16750sx r0 = this.$keyboard;
            if (r0 != null) {
                r0.CMX();
            }
            this.$focusRequester.A00();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernamePinEntryBottomSheetScreenKt$UsernamePinEntryBottomSheetScreen$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
