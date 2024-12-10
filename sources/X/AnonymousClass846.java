package X;

import com.whatsapp.gallery.NewMediaPickerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.846  reason: invalid class name */
public final class AnonymousClass846 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ NewMediaPickerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass846(NewMediaPickerFragment newMediaPickerFragment) {
        super(2);
        this.this$0 = newMediaPickerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass8B2 r5 = (AnonymousClass8B2) obj;
        ((Number) obj2).intValue();
        C18070vi.A0d(r5, 0);
        AnonymousClass7FZ r0 = this.this$0.A0J;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A02, r0.A00, 8882)) {
                NewMediaPickerFragment newMediaPickerFragment = this.this$0;
                Set set = newMediaPickerFragment.A05;
                ArrayList A0D = C29351c6.A0D(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C108995ce.A1P(A0D, it);
                }
                newMediaPickerFragment.A2K(r5.BLl(), C29431cG.A12(A0D));
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("mediaTray");
        throw null;
    }
}
