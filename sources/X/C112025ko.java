package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;
import java.util.List;

/* renamed from: X.5ko  reason: invalid class name and case insensitive filesystem */
public final class C112025ko extends C38391rD {
    public final List A00 = AnonymousClass000.A13();
    public final /* synthetic */ SelectedListContactPickerFragment A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C113215mj(AnonymousClass3MX.A0B(this.A01.A16(), viewGroup, 2131626868, false));
    }

    public C112025ko(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A01 = selectedListContactPickerFragment;
    }

    public int A0Q() {
        return this.A00.size();
    }

    public final void A0U(AnonymousClass1E7 r4) {
        List list = this.A00;
        int indexOf = list.indexOf(r4);
        if (indexOf > -1) {
            list.remove(indexOf);
            A0I(indexOf);
        }
        if (list.isEmpty()) {
            SelectedListContactPickerFragment selectedListContactPickerFragment = this.A01;
            selectedListContactPickerFragment.A2J();
            if (!selectedListContactPickerFragment.A04) {
                SelectedListContactPickerFragment.A03(selectedListContactPickerFragment, AnonymousClass3MZ.A09(selectedListContactPickerFragment).getDimensionPixelSize(2131168600), 0);
            } else {
                selectedListContactPickerFragment.A35();
            }
        }
        SelectedListContactPickerFragment selectedListContactPickerFragment2 = this.A01;
        selectedListContactPickerFragment2.A36(r4);
        selectedListContactPickerFragment2.A2N();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        C113215mj r102 = (C113215mj) r10;
        C18070vi.A0d(r102, 0);
        AnonymousClass1E7 r8 = (AnonymousClass1E7) this.A00.get(i);
        TextView textView = r102.A01;
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A01;
        C24921Me r1 = selectedListContactPickerFragment.A0k;
        String str = null;
        String str2 = null;
        if (r1 != null) {
            str2 = AnonymousClass3MY.A0q(r1, r8);
        }
        textView.setText(str2);
        C37451pZ r12 = selectedListContactPickerFragment.A0m;
        if (r12 != null) {
            r12.A0C(r102.A02, r8, false);
        }
        View view = r102.A00;
        C90004dN.A00(view, this, r8, 36);
        Context A1n = selectedListContactPickerFragment.A1n();
        if (A1n != null) {
            Object[] A1a = AnonymousClass3MW.A1a();
            C24921Me r0 = selectedListContactPickerFragment.A0k;
            if (r0 != null) {
                str = r0.A0I(r8);
            }
            str = C17880vN.A0q(A1n, str, A1a, 0, 2131895640);
        }
        view.setContentDescription(str);
        AnonymousClass1Y5.A02(view, 2131886194);
    }
}
