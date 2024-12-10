package com.whatsapp.product.searchtheweb;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1776399u;
import X.C187809gP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41731wy;
import X.C822545a;
import X.C822645b;
import X.C822745c;
import android.net.Uri;
import com.whatsapp.searchtheweb.GoogleLensClient$searchImage$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.searchtheweb.GoogleSearchContentBottomSheetViewModel$queryGoogleLens$1", f = "GoogleSearchContentBottomSheetViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class GoogleSearchContentBottomSheetViewModel$queryGoogleLens$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1776399u $option;
    public int label;
    public final /* synthetic */ GoogleSearchContentBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleSearchContentBottomSheetViewModel$queryGoogleLens$1(GoogleSearchContentBottomSheetViewModel googleSearchContentBottomSheetViewModel, C1776399u r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = googleSearchContentBottomSheetViewModel;
        this.$option = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GoogleSearchContentBottomSheetViewModel$queryGoogleLens$1(this.this$0, this.$option, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A00.A0E(C822645b.A00);
            C187809gP r4 = (C187809gP) this.this$0.A01.get();
            C1776399u r3 = this.$option;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A04, new GoogleLensClient$searchImage$2(r4, r3, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Uri uri = (Uri) obj;
        C41731wy r1 = this.this$0.A00;
        if (uri != null) {
            obj2 = new C822545a(uri);
        } else {
            obj2 = C822745c.A00;
        }
        r1.A0E(obj2);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GoogleSearchContentBottomSheetViewModel$queryGoogleLens$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
