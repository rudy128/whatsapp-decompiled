package X;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.List;

/* renamed from: X.3WW  reason: invalid class name */
public final class AnonymousClass3WW extends C38391rD {
    public final CallRatingViewModel A00;
    public final List A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3Z6(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624451), this);
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        AnonymousClass3Z6 r72 = (AnonymousClass3Z6) r7;
        C18070vi.A0d(r72, 0);
        AnonymousClass4Y5 r5 = (AnonymousClass4Y5) this.A01.get(i);
        C18070vi.A0d(r5, 0);
        r72.A01.setText(r5.A00);
        C89874dA.A00(r72.A0H, r72, 37);
        AppCompatCheckBox appCompatCheckBox = r72.A00;
        AnonymousClass3WW r2 = r72.A02;
        appCompatCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        CallRatingViewModel callRatingViewModel = r2.A00;
        Integer num = r5.A01;
        C18070vi.A0d(num, 0);
        appCompatCheckBox.setChecked(callRatingViewModel.A0E.contains(num));
        appCompatCheckBox.setOnCheckedChangeListener(new C90844ej(r5, r2, 0));
    }

    public AnonymousClass3WW(CallRatingViewModel callRatingViewModel, List list) {
        C18070vi.A0j(list, callRatingViewModel);
        this.A01 = list;
        this.A00 = callRatingViewModel;
    }
}
