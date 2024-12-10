package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import java.util.List;

/* renamed from: X.3Rf  reason: invalid class name */
public class AnonymousClass3Rf extends SimpleAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String[] A02;
    public final /* synthetic */ boolean[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Rf(Context context, SingleChoiceListDialogFragment singleChoiceListDialogFragment, List list, int[] iArr, String[] strArr, String[] strArr2, boolean[] zArr, int i) {
        super(context, list, 2131626962, strArr, iArr);
        this.A01 = singleChoiceListDialogFragment;
        this.A03 = zArr;
        this.A00 = i;
        this.A02 = strArr2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context A14;
        Context A1n;
        int i2;
        int i3;
        View view2 = super.getView(i, view, viewGroup);
        TextView A0E = C17880vN.A0E(view2, 16908308);
        TextView A0E2 = C17880vN.A0E(view2, 16908309);
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        if (singleChoiceListDialogFragment.A1b()) {
            boolean[] zArr = this.A03;
            if (zArr == null || zArr[i]) {
                A14 = singleChoiceListDialogFragment.A14();
                A1n = singleChoiceListDialogFragment.A1n();
                i2 = 2130971979;
                i3 = 2131103155;
            } else {
                A14 = singleChoiceListDialogFragment.A14();
                A1n = singleChoiceListDialogFragment.A1n();
                i2 = 2130971978;
                i3 = 2131103153;
            }
            C72463Mc.A0w(A1n, A14, A0E, i2, i3);
            C72463Mc.A0w(singleChoiceListDialogFragment.A1n(), singleChoiceListDialogFragment.A14(), A0E2, i2, i3);
        }
        if (TextUtils.isEmpty(A0E2.getText())) {
            A0E2.setVisibility(8);
        } else {
            A0E2.setVisibility(0);
        }
        CompoundButton compoundButton = (CompoundButton) view2.findViewById(2131434310);
        int i4 = this.A00;
        if (i4 < 0 || !TextUtils.equals(this.A02[i4], A0E.getText())) {
            compoundButton.setChecked(false);
        } else {
            compoundButton.setChecked(true);
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = String.valueOf(i + 1);
        compoundButton.setContentDescription(AnonymousClass3MX.A16(singleChoiceListDialogFragment, String.valueOf(this.A02.length), A1b, 1, 2131896154));
        return view2;
    }
}
