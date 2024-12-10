package com.whatsapp.favorites.picker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4CZ;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.picker.FavoritesPickerViewModel$loadData$1", f = "FavoritesPickerViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritesPickerViewModel$loadData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4CZ $suggestionMode;
    public int label;
    public final /* synthetic */ FavoritesPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesPickerViewModel$loadData$1(FavoritesPickerViewModel favoritesPickerViewModel, AnonymousClass4CZ r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoritesPickerViewModel;
        this.$suggestionMode = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritesPickerViewModel$loadData$1(this.this$0, this.$suggestionMode, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FavoritesPickerViewModel favoritesPickerViewModel = this.this$0;
            HashSet hashSet = favoritesPickerViewModel.A0C;
            hashSet.clear();
            hashSet.addAll(C29431cG.A12((CopyOnWriteArraySet) favoritesPickerViewModel.A09.A07.getValue()));
            FavoritesPickerViewModel favoritesPickerViewModel2 = this.this$0;
            AnonymousClass4CZ r0 = this.$suggestionMode;
            this.label = 1;
            if (FavoritesPickerViewModel.A00(favoritesPickerViewModel2, r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritesPickerViewModel$loadData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
