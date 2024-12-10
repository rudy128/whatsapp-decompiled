package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.whatsapp.consent.common.AgeCollectionFragment;

/* renamed from: X.7jA  reason: invalid class name and case insensitive filesystem */
public final class C149507jA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AgeCollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149507jA(AgeCollectionFragment ageCollectionFragment) {
        super(0);
        this.this$0 = ageCollectionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Resources.Theme theme;
        Resources A09 = AnonymousClass3MZ.A09(this.this$0);
        Context A1n = this.this$0.A1n();
        if (A1n != null) {
            theme = A1n.getTheme();
        } else {
            theme = null;
        }
        Drawable A00 = C40501uo.A00(theme, A09, 2131232503);
        C18070vi.A0z(A00, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        return A00;
    }
}
