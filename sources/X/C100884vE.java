package X;

import com.whatsapp.favorites.picker.FavoritesPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.picker.FavoritesPickerViewModel", f = "FavoritesPickerViewModel.kt", i = {0, 0, 0, 0}, l = {108}, m = "loadFavoriteSuggestions", n = {"this", "suggestedContacts", "$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* renamed from: X.4vE  reason: invalid class name and case insensitive filesystem */
public final class C100884vE extends C30421du {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FavoritesPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100884vE(FavoritesPickerViewModel favoritesPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = favoritesPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FavoritesPickerViewModel.A00(this.this$0, (AnonymousClass4CZ) null, this);
    }
}
