package com.whatsapp.profile.compose;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C04310Mr;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.compose.UsernamePinInputFieldKt$UsernamePinInputField$4$1", f = "UsernamePinInputField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernamePinInputFieldKt$UsernamePinInputField$4$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C04310Mr $focusRequester;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernamePinInputFieldKt$UsernamePinInputField$4$1(C04310Mr r2, C30391dr r3) {
        super(2, r3);
        this.$focusRequester = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UsernamePinInputFieldKt$UsernamePinInputField$4$1(this.$focusRequester, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UsernamePinInputFieldKt$UsernamePinInputField$4$1(this.$focusRequester, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$focusRequester.A00();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
