package com.whatsapp.favorites.picker;

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

@DebugMetadata(c = "com.whatsapp.favorites.picker.FavoritesPickerViewModel$getGroupSubTitle$2$1$1", f = "FavoritesPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritesPickerViewModel$getGroupSubTitle$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E9 $it;
    public int label;
    public final /* synthetic */ FavoritesPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesPickerViewModel$getGroupSubTitle$2$1$1(FavoritesPickerViewModel favoritesPickerViewModel, AnonymousClass1E9 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoritesPickerViewModel;
        this.$it = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritesPickerViewModel$getGroupSubTitle$2$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C24921Me.A04(this.this$0.A06, this.$it, -1, true);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritesPickerViewModel$getGroupSubTitle$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
