package X;

import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.group.GroupPermissionsActivity;

/* renamed from: X.5SZ  reason: invalid class name */
public final class AnonymousClass5SZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SZ(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C184509b4 r6 = (C184509b4) obj;
        C18070vi.A0d(r6, 0);
        int i = r6.A01;
        int i2 = r6.A00;
        WaDialogFragment waDialogFragment = new WaDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("remaining_capacity", i);
        A0D.putInt("pending_request_count", i2);
        waDialogFragment.A1R(A0D);
        this.this$0.CMk(waDialogFragment, "group_join_request_group_too_full");
        return C27621Wu.A00;
    }
}
