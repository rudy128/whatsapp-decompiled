package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CategorizedUserProblemsFragment;

/* renamed from: X.5Cv  reason: invalid class name and case insensitive filesystem */
public final class C101495Cv extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CategorizedUserProblemsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101495Cv(CategorizedUserProblemsFragment categorizedUserProblemsFragment) {
        super(0);
        this.this$0 = categorizedUserProblemsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Integer valueOf;
        Bundle bundle = this.this$0.A06;
        if (bundle != null && (valueOf = Integer.valueOf(bundle.getInt("index"))) != null) {
            return valueOf;
        }
        throw C17890vO.A0K();
    }
}
