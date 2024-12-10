package X;

import com.whatsapp.favorite.FavoriteManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager", f = "FavoriteManager.kt", i = {0}, l = {160, 161}, m = "notifyObservers", n = {"this"}, s = {"L$0"})
/* renamed from: X.3FK  reason: invalid class name */
public final class AnonymousClass3FK extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FK(FavoriteManager favoriteManager, C30391dr r2) {
        super(r2);
        this.this$0 = favoriteManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FavoriteManager.A00(this.this$0, this);
    }
}
