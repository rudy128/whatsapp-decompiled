package X;

import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;

/* renamed from: X.43J  reason: invalid class name */
public class AnonymousClass43J extends C175028xj {
    public final AppCompatCheckBox A00;
    public final FilterBottomSheetDialogFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43J(AppCompatCheckBox appCompatCheckBox, FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        super(appCompatCheckBox);
        C18070vi.A0d(appCompatCheckBox, 1);
        this.A00 = appCompatCheckBox;
        this.A01 = filterBottomSheetDialogFragment;
        C72473Md.A0z(appCompatCheckBox);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C86384Rk r4 = (C86384Rk) obj;
        AEQ aeq = r4.A01;
        AppCompatCheckBox appCompatCheckBox = this.A00;
        appCompatCheckBox.setText(aeq.A01);
        appCompatCheckBox.setChecked(r4.A00);
        C90084dV.A00(appCompatCheckBox, this, r4, aeq, 22);
    }
}
