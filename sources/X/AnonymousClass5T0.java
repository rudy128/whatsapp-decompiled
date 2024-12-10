package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;

/* renamed from: X.5T0  reason: invalid class name */
public final class AnonymousClass5T0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SupportBkScreenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5T0(SupportBkScreenFragment supportBkScreenFragment) {
        super(1);
        this.this$0 = supportBkScreenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewStub A0F;
        View inflate;
        ViewStub A0F2;
        SupportBkScreenFragment supportBkScreenFragment = this.this$0;
        C18070vi.A0b(obj);
        AnonymousClass19T r2 = supportBkScreenFragment.A0A;
        if (r2 != null) {
            r2.markerEnd(376777540, 376777540, 3);
            if (C18070vi.A18(obj, C819541f.A00)) {
                View view = supportBkScreenFragment.A0B;
                if (!(view == null || (A0F2 = AnonymousClass3MW.A0F(view, 2131435936)) == null)) {
                    A0F2.inflate();
                }
            } else {
                if (!C18070vi.A18(obj, AnonymousClass41e.A00)) {
                    C18070vi.A18(obj, C819641g.A00);
                }
                View view2 = supportBkScreenFragment.A0B;
                if (!(view2 == null || (A0F = AnonymousClass3MW.A0F(view2, 2131435935)) == null || (inflate = A0F.inflate()) == null)) {
                    View findViewById = inflate.findViewById(2131429460);
                    View findViewById2 = inflate.findViewById(2131431107);
                    if (findViewById != null) {
                        C89954dI.A00(findViewById, supportBkScreenFragment, 5);
                    }
                    if (findViewById2 != null) {
                        C89954dI.A00(findViewById2, supportBkScreenFragment, 6);
                    }
                }
            }
            this.this$0.A27();
            return C27621Wu.A00;
        }
        C18070vi.A11("quickPerfomanceLogger");
        throw null;
    }
}
