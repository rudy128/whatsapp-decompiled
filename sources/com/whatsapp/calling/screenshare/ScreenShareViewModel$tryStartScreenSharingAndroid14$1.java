package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C108965cb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$tryStartScreenSharingAndroid14$1", f = "ScreenShareViewModel.kt", i = {}, l = {365}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$tryStartScreenSharingAndroid14$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$tryStartScreenSharingAndroid14$1(ScreenShareViewModel screenShareViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = screenShareViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C18030ve r2 = this.this$0.A08;
            this.label = 1;
            if (C62882s9.A00(this, (long) C18020vd.A00(C18040vf.A02, r2, 5479)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        ScreenShareViewModel screenShareViewModel = this.this$0;
        ScreenShareViewModel.A08(screenShareViewModel);
        C108965cb.A1L(screenShareViewModel.A0G, screenShareViewModel);
        AnonymousClass1OB r1 = screenShareViewModel.A04;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        screenShareViewModel.A04 = null;
        Log.i("ScreenShareViewModel timed out waiting for FgService to start with MediaProjection type");
        return C27621Wu.A00;
    }
}
