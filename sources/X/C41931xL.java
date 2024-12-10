package X;

import com.whatsapp.favorite.FavoriteManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1xL  reason: invalid class name and case insensitive filesystem */
public final class C41931xL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41931xL(FavoriteManager favoriteManager) {
        super(0);
        this.this$0 = favoriteManager;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List<C62482rT> A02 = this.this$0.A04.A02();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        for (C62482rT r0 : A02) {
            copyOnWriteArraySet.add(r0.A03);
        }
        this.this$0.A06.set(true);
        return copyOnWriteArraySet;
    }
}
