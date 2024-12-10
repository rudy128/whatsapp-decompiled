package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass71H;
import X.C117265zU;
import X.C17960vV;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$fetchAvatarDynamicIcon$2", f = "ExpressionsTrayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$fetchAvatarDynamicIcon$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$fetchAvatarDynamicIcon$2(ExpressionsTrayViewModel expressionsTrayViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = expressionsTrayViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ExpressionsTrayViewModel$fetchAvatarDynamicIcon$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsTrayViewModel$fetchAvatarDynamicIcon$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C117265zU r1;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass71H r2 = this.this$0.A0D;
            C17960vV.A00();
            Bitmap A00 = AnonymousClass71H.A00(r2, AnonymousClass71H.A01(r2, "meta-avatar-tab-icon", false), "meta-avatar-tab-icon");
            if (A00 == null) {
                return null;
            }
            ExpressionsTrayViewModel expressionsTrayViewModel = this.this$0;
            expressionsTrayViewModel.A01 = A00;
            AnonymousClass1DT r22 = expressionsTrayViewModel.A05;
            Object A06 = r22.A06();
            if ((A06 instanceof C117265zU) && (r1 = (C117265zU) A06) != null) {
                r22.A0E(new C117265zU(A00, r1.A02, r1.A03, r1.A00, r1.A04));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
