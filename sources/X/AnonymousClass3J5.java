package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.3J5  reason: invalid class name */
public final class AnonymousClass3J5 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Fragment $hostFragment;
    public final /* synthetic */ C38501rO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3J5(Fragment fragment, C38501rO r3) {
        super(2);
        this.$hostFragment = fragment;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj2;
        C18070vi.A0d(bundle, 1);
        C41761x1 r0 = (C41761x1) C24141Ja.A00(bundle, C41761x1.class, "labelInfo");
        if (r0 != null) {
            long j = r0.A03;
            Context A14 = this.$hostFragment.A14();
            Intent A02 = AnonymousClass1LU.A02(A14);
            A02.putExtra("new_inbox_filter_created", true);
            A02.putExtra("newly_created_list_id", j);
            Intent action = A02.setAction(C28901bF.A02);
            C18070vi.A0X(action);
            A14.startActivity(action);
        }
        return C27621Wu.A00;
    }
}
