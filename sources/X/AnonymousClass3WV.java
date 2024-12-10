package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.3WV  reason: invalid class name */
public class AnonymousClass3WV extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final FilterBottomSheetDialogFragment A01;

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        Object obj = this.A00.get(i);
        C18070vi.A0d(obj, 0);
        ((AnonymousClass8IT) r3).A0C(obj);
    }

    public AnonymousClass3WV(FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        this.A01 = filterBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        List list = C42011xT.A0I;
        return new AnonymousClass43J((AppCompatCheckBox) AnonymousClass3MY.A0D(A0D, 2131625318), this.A01);
    }
}
