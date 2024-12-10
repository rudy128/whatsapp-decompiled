package X;

import android.content.res.Resources;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;

/* renamed from: X.5Um  reason: invalid class name and case insensitive filesystem */
public final class C106085Um extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass01E $activity;
    public final /* synthetic */ CommunityViewGroupsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106085Um(AnonymousClass01E r2, CommunityViewGroupsView communityViewGroupsView) {
        super(1);
        this.$activity = r2;
        this.this$0 = communityViewGroupsView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String string;
        int A0M = AnonymousClass000.A0M(obj);
        AnonymousClass01E r0 = this.$activity;
        if (A0M > 0) {
            Resources resources = r0.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, A0M, 0);
            string = resources.getString(2131897888, A1a);
        } else {
            string = r0.getResources().getString(2131897889);
        }
        C18070vi.A0b(string);
        this.this$0.A05.setTitle((CharSequence) string);
        return C27621Wu.A00;
    }
}
