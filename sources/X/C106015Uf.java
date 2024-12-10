package X;

import android.view.View;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;

/* renamed from: X.5Uf  reason: invalid class name and case insensitive filesystem */
public final class C106015Uf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C93564jB $callItem;
    public final /* synthetic */ C76253my this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106015Uf(C93564jB r2, C76253my r3) {
        super(1);
        this.this$0 = r3;
        this.$callItem = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C76253my r0 = this.this$0;
        C107195Yt r4 = r0.A00;
        C93564jB r1 = this.$callItem;
        View A0A = AnonymousClass3MW.A0A(r0.A03);
        C18070vi.A0X(A0A);
        FavoriteCallListActivity favoriteCallListActivity = (FavoriteCallListActivity) r4;
        C18070vi.A0d(r1, 0);
        AnonymousClass00H r02 = favoriteCallListActivity.A0B;
        if (r02 != null) {
            r02.get();
            A09 a09 = new A09(A0A, r1.A01.A03, C17880vN.A0m());
            a09.A02 = AnonymousClass1Xr.A02(A0A);
            a09.A01(favoriteCallListActivity);
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }
}
