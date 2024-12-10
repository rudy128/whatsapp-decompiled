package X;

import com.whatsapp.favorite.FavoriteManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.APf  reason: case insensitive filesystem */
public final class C20546APf implements C22496BAd {
    public final FavoriteManager A00;
    public final Collection A01;

    public C20546APf(FavoriteManager favoriteManager, Collection collection) {
        C18070vi.A0d(favoriteManager, 1);
        this.A00 = favoriteManager;
        this.A01 = collection;
    }

    private final C193679qU A00() {
        List<C62482rT> A02 = this.A00.A04.A02();
        ArrayList A13 = AnonymousClass000.A13();
        for (C62482rT r2 : A02) {
            if (r2.A02 == C49512Qt.ONE_TO_ONE) {
                Collection collection = this.A01;
                AnonymousClass1BI r1 = r2.A03;
                if (!collection.contains(r1)) {
                    A13.add(r1);
                }
            }
        }
        return new C193679qU(this, A13);
    }

    public C193679qU Bhg() {
        return A00();
    }

    public C193679qU Bhh() {
        return A00();
    }
}
