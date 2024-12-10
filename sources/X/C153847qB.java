package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.status.tiles.StatusGridPageFragment;

/* renamed from: X.7qB  reason: invalid class name and case insensitive filesystem */
public final class C153847qB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ StatusGridPageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153847qB(StatusGridPageFragment statusGridPageFragment) {
        super(0);
        this.this$0 = statusGridPageFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Resources resources;
        Context A1n = this.this$0.A1n();
        if (A1n == null || (resources = A1n.getResources()) == null) {
            i = 0;
        } else {
            i = AnonymousClass3MW.A01(resources, 2131169103);
        }
        return Integer.valueOf(i);
    }
}
