package X;

import com.whatsapp.favorite.FavoriteManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ck  reason: invalid class name and case insensitive filesystem */
public final class C45982Ck extends C60192nY {
    public final FavoriteManager A00;
    public final C28391a8 A01;
    public final AnonymousClass11P A02;

    public final C46232Dt A0K() {
        List<C62482rT> A022 = this.A00.A04.A02();
        ArrayList A0D = C29351c6.A0D(A022);
        for (C62482rT r0 : A022) {
            A0D.add(r0.A03);
        }
        return new C46232Dt(C62382rJ.A03, (C19999A2n) null, (String) null, A0D, AnonymousClass11P.A01(this.A02));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45982Ck(AnonymousClass11P r1, C26331Rs r2, FavoriteManager favoriteManager, C28391a8 r4) {
        super(r2);
        C18070vi.A0s(r2, r1, r4, favoriteManager);
        this.A02 = r1;
        this.A01 = r4;
        this.A00 = favoriteManager;
    }
}
