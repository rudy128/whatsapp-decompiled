package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.os.SystemClock;
import com.whatsapp.favorite.FavoriteManager;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$loadFavoriteSuggestions$1", f = "FavoritePickerViewModel.kt", i = {0, 0}, l = {124}, m = "invokeSuspend", n = {"$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "J$0"})
public final class FavoritePickerViewModel$loadFavoriteSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $selectedContacts;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$loadFavoriteSuggestions$1(FavoritePickerViewModel favoritePickerViewModel, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoritePickerViewModel;
        this.$selectedContacts = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritePickerViewModel$loadFavoriteSuggestions$1(this.this$0, this.$selectedContacts, r5);
    }

    public final Object invokeSuspend(Object obj) {
        FavoritePickerViewModel favoritePickerViewModel;
        long uptimeMillis;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            favoritePickerViewModel = this.this$0;
            AnonymousClass11P r5 = favoritePickerViewModel.A0A;
            List list = this.$selectedContacts;
            uptimeMillis = SystemClock.uptimeMillis();
            Set A12 = C29431cG.A12((CopyOnWriteArraySet) ((FavoriteManager) favoritePickerViewModel.A0D.get()).A07.getValue());
            favoritePickerViewModel.A00 = A12.size();
            FavoritePickerViewModel.A00(favoritePickerViewModel, A12, list);
            AnonymousClass1OB r0 = favoritePickerViewModel.A06;
            if (r0 != null) {
                this.L$0 = r5;
                this.L$1 = favoritePickerViewModel;
                this.J$0 = uptimeMillis;
                this.label = 1;
                if (r0.BhB(this) == r8) {
                    return r8;
                }
            }
        } else if (i == 1) {
            uptimeMillis = this.J$0;
            favoritePickerViewModel = (FavoritePickerViewModel) this.L$1;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        favoritePickerViewModel.A02 = SystemClock.uptimeMillis() - uptimeMillis;
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$loadFavoriteSuggestions$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
