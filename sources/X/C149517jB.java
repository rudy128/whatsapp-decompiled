package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.consent.common.AgeCollectionFragment;

/* renamed from: X.7jB  reason: invalid class name and case insensitive filesystem */
public final class C149517jB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AgeCollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149517jB(AgeCollectionFragment ageCollectionFragment) {
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
        return Integer.valueOf(AnonymousClass1YH.A00(theme, A09, 2131103150));
    }
}
