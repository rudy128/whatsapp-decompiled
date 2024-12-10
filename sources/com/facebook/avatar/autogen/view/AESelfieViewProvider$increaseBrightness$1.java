package com.facebook.avatar.autogen.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1", f = "AESelfieViewProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AESelfieViewProvider$increaseBrightness$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AESelfieViewProvider$increaseBrightness$1(Activity activity, C30391dr r3) {
        super(2, r3);
        this.$activity = activity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AESelfieViewProvider$increaseBrightness$1(this.$activity, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AESelfieViewProvider$increaseBrightness$1(this.$activity, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Window window;
        Window window2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Activity activity = this.$activity;
            WindowManager.LayoutParams layoutParams = null;
            if (!(activity == null || (window2 = activity.getWindow()) == null || (layoutParams = window2.getAttributes()) == null)) {
                layoutParams.screenBrightness = 1.0f;
            }
            Activity activity2 = this.$activity;
            if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
                window.setAttributes(layoutParams);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
