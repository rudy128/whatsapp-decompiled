package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C190989lq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1", f = "FavoritePickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $alreadyAddedFavorites;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1(FavoritePickerViewModel favoritePickerViewModel, Collection collection, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoritePickerViewModel;
        this.$alreadyAddedFavorites = collection;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1(this.this$0, this.$alreadyAddedFavorites, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return ((C190989lq) this.this$0.A0E.getValue()).A00(this.$alreadyAddedFavorites);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
