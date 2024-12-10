package X;

import com.whatsapp.favorite.FavoriteManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2zC  reason: invalid class name and case insensitive filesystem */
public final class C67072zC implements C1605388w {
    public final FavoriteManager A00;

    public C67072zC(FavoriteManager favoriteManager) {
        C18070vi.A0d(favoriteManager, 1);
        this.A00 = favoriteManager;
        favoriteManager.A07.getValue();
    }

    public boolean BLC(AnonymousClass1BI r2) {
        C18070vi.A0d(r2, 0);
        return C29431cG.A12((CopyOnWriteArraySet) this.A00.A07.getValue()).contains(r2);
    }

    public Set BYj() {
        return C29431cG.A12((CopyOnWriteArraySet) this.A00.A07.getValue());
    }
}
