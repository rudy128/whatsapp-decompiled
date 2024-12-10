package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onItemsScroll$1;

/* renamed from: X.60u  reason: invalid class name and case insensitive filesystem */
public final class C1177460u extends C112755lz {
    public final /* synthetic */ AvatarExpressionsFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1177460u(Resources resources, GridLayoutManager gridLayoutManager, AnonymousClass11P r10, AvatarExpressionsFragment avatarExpressionsFragment, C111835kV r12, C18030ve r13, boolean z) {
        super(resources, gridLayoutManager, r10, r12, r13, z);
        this.A00 = avatarExpressionsFragment;
        C18070vi.A0b(r13);
        C18070vi.A0b(resources);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        C18070vi.A0d(recyclerView, 0);
        super.A04(recyclerView, i, i2);
        AvatarExpressionsFragment avatarExpressionsFragment = this.A00;
        AnonymousClass6UU r1 = this.A01;
        avatarExpressionsFragment.A0D = r1;
        if (r1 != null) {
            C108965cb.A0M(avatarExpressionsFragment).A0T(r1);
        }
        if (i2 != 0 && (expressionsSearchViewModel = avatarExpressionsFragment.A0B) != null) {
            AnonymousClass3MX.A1Q(new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C30391dr) null), C41561wd.A00(expressionsSearchViewModel));
        }
    }
}
