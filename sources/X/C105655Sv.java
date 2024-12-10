package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;

/* renamed from: X.5Sv  reason: invalid class name and case insensitive filesystem */
public final class C105655Sv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ContextualHelpBkScreenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105655Sv(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        super(1);
        this.this$0 = contextualHelpBkScreenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        ViewStub A0F;
        View inflate;
        View findViewById;
        ViewStub A0F2;
        ContextualHelpBkScreenFragment contextualHelpBkScreenFragment = this.this$0;
        C18070vi.A0b(obj);
        AnonymousClass19T r3 = contextualHelpBkScreenFragment.A03;
        if (r3 != null) {
            r3.markerEnd(376777108, 376777108, 3);
            if (C18070vi.A18(obj, C819541f.A00)) {
                View view2 = contextualHelpBkScreenFragment.A0B;
                if (!(view2 == null || (A0F2 = AnonymousClass3MW.A0F(view2, 2131429526)) == null)) {
                    A0F2.inflate();
                }
            } else if (!((!C18070vi.A18(obj, AnonymousClass41e.A00) && !C18070vi.A18(obj, C819641g.A00)) || (view = contextualHelpBkScreenFragment.A0B) == null || (A0F = AnonymousClass3MW.A0F(view, 2131429527)) == null || (inflate = A0F.inflate()) == null || (findViewById = inflate.findViewById(2131431107)) == null)) {
                C89954dI.A00(findViewById, contextualHelpBkScreenFragment, 2);
            }
            this.this$0.A27();
            return C27621Wu.A00;
        }
        C18070vi.A11("quickPerfomanceLogger");
        throw null;
    }
}
