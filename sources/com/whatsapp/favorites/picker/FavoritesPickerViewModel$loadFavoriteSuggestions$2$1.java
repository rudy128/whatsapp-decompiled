package com.whatsapp.favorites.picker;

import X.AnonymousClass000;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass3MW;
import X.AnonymousClass4CZ;
import X.C190989lq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2;
import com.whatsapp.favorite.FavoritesChatsSuggestionManager;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.picker.FavoritesPickerViewModel$loadFavoriteSuggestions$2$1", f = "FavoritesPickerViewModel.kt", i = {}, l = {114, 117}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritesPickerViewModel$loadFavoriteSuggestions$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4CZ $suggestionMode;
    public int label;
    public final /* synthetic */ FavoritesPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesPickerViewModel$loadFavoriteSuggestions$2$1(FavoritesPickerViewModel favoritesPickerViewModel, AnonymousClass4CZ r3, C30391dr r4) {
        super(2, r4);
        this.$suggestionMode = r3;
        this.this$0 = favoritesPickerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritesPickerViewModel$loadFavoriteSuggestions$2$1(this.this$0, this.$suggestionMode, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int ordinal = this.$suggestionMode.ordinal();
            if (ordinal == 0) {
                List list = ((C190989lq) this.this$0.A0E.getValue()).A00(this.this$0.A0C).A01;
                AnonymousClass1M9 r2 = this.this$0.A05;
                this.label = 1;
                obj = AnonymousClass1OW.A00(this, new ContactManagerExtKt$asWaContacts$2(r2, list, (C30391dr) null));
            } else if (ordinal == 1) {
                HashSet hashSet = this.this$0.A0C;
                this.label = 2;
                obj = ((FavoritesChatsSuggestionManager) this.this$0.A0A.get()).A01(hashSet, this);
            } else {
                throw AnonymousClass3MW.A14();
            }
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritesPickerViewModel$loadFavoriteSuggestions$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
