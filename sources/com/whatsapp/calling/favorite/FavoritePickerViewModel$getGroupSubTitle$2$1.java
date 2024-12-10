package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1E9;
import X.AnonymousClass1OS;
import X.C24921Me;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$getGroupSubTitle$2$1", f = "FavoritePickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePickerViewModel$getGroupSubTitle$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E9 $it;
    public final /* synthetic */ C24921Me $waContactNames;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$getGroupSubTitle$2$1(C24921Me r2, AnonymousClass1E9 r3, C30391dr r4) {
        super(2, r4);
        this.$waContactNames = r2;
        this.$it = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritePickerViewModel$getGroupSubTitle$2$1(this.$waContactNames, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C24921Me.A04(this.$waContactNames, this.$it, -1, true);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$getGroupSubTitle$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
