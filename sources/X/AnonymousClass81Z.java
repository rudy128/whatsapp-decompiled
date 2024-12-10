package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.List;

/* renamed from: X.81Z  reason: invalid class name */
public final class AnonymousClass81Z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81Z(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C112365lM r0;
        C136616u6 r4 = (C136616u6) obj;
        C17900vP.A0Y(r4, "UpdatesFragment/observe: ", AnonymousClass000.A10());
        List list = r4.A08;
        if (list != null) {
            z = AnonymousClass000.A1a(list);
        } else {
            z = false;
        }
        if ((r4.A0C || z != this.this$0.A1C) && (r0 = this.this$0.A0N) != null) {
            r0.A0U();
        }
        C112365lM r02 = this.this$0.A0N;
        if (r02 != null) {
            r02.A0V(r4);
        }
        UpdatesFragment updatesFragment = this.this$0;
        if (z != updatesFragment.A1C) {
            updatesFragment.A1C = z;
            updatesFragment.A1D().invalidateOptionsMenu();
        }
        return C27621Wu.A00;
    }
}
