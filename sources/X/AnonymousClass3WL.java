package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.3WL  reason: invalid class name */
public class AnonymousClass3WL extends C41251w3 {
    public Map A00 = C17880vN.A11();

    public AnonymousClass3WL() {
        super(new C40471ul(new AnonymousClass3W0(2)).A00());
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.3Y0, X.1xT] */
    public static AnonymousClass3Y0 A00(ViewGroup viewGroup, int i) {
        if (i == 1) {
            List list = C42011xT.A0I;
            View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131624744, viewGroup, false);
            C18070vi.A0b(inflate);
            return new C80593xS(inflate);
        } else if (i == 2) {
            return new C80603xT(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624742));
        } else {
            if (i == 3) {
                List list2 = C42011xT.A0I;
                View inflate2 = C72463Mc.A0K(viewGroup, 0).inflate(2131624741, viewGroup, false);
                C72453Mb.A1S(inflate2);
                return new C42011xT(inflate2);
            }
            String A1I = AnonymousClass001.A1I("ItemAdapter/onCreateViewHolder type not handled - ", AnonymousClass000.A10(), i);
            Log.e(A1I);
            throw AnonymousClass000.A0n(A1I);
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        List list = C42011xT.A0I;
        ((AnonymousClass3Y0) r2).A0B((C86334Rf) A0U(i));
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return A00(viewGroup, i);
    }

    public int getItemViewType(int i) {
        return ((C86334Rf) A0U(i)).A00;
    }
}
