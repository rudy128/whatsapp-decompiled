package com.whatsapp.favorites.picker;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.picker.FavoritesPickerViewModel$getGroupSubTitle$2", f = "FavoritesPickerViewModel.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritesPickerViewModel$getGroupSubTitle$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public int label;
    public final /* synthetic */ FavoritesPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesPickerViewModel$getGroupSubTitle$2(AnonymousClass1E7 r2, FavoritesPickerViewModel favoritesPickerViewModel, C30391dr r4) {
        super(2, r4);
        this.$contact = r2;
        this.this$0 = favoritesPickerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritesPickerViewModel$getGroupSubTitle$2(this.$contact, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E9 r3 = (AnonymousClass1E9) this.$contact.A06(AnonymousClass1E9.class);
            obj = null;
            if (r3 != null) {
                FavoritesPickerViewModel favoritesPickerViewModel = this.this$0;
                Object obj2 = favoritesPickerViewModel.A06.A07.get(r3);
                if (obj2 != null) {
                    return obj2;
                }
                C18600wl r1 = favoritesPickerViewModel.A0G;
                FavoritesPickerViewModel$getGroupSubTitle$2$1$1 favoritesPickerViewModel$getGroupSubTitle$2$1$1 = new FavoritesPickerViewModel$getGroupSubTitle$2$1$1(favoritesPickerViewModel, r3, (C30391dr) null);
                this.label = 1;
                obj = C30451dy.A00(this, r1, favoritesPickerViewModel$getGroupSubTitle$2$1$1);
                if (obj == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritesPickerViewModel$getGroupSubTitle$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
