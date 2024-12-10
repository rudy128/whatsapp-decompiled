package X;

import android.os.Bundle;
import com.whatsapp.group.AddMembersRouter;

/* renamed from: X.5SV  reason: invalid class name */
public final class AnonymousClass5SV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AddMembersRouter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SV(AddMembersRouter addMembersRouter) {
        super(1);
        this.this$0 = addMembersRouter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        AnonymousClass1D6[] r1 = new AnonymousClass1D6[1];
        AnonymousClass1D6.A03("AddMembersSuccessJidList", obj, r1, 0);
        Bundle A00 = AnonymousClass9O6.A00(r1);
        AddMembersRouter addMembersRouter = this.this$0;
        if (addMembersRouter.A1b()) {
            addMembersRouter.A1F().A0w("AddMembersSuccess", A00);
        }
        return C27621Wu.A00;
    }
}
