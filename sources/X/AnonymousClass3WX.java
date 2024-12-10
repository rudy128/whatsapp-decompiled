package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.3WX  reason: invalid class name */
public final class AnonymousClass3WX extends C38391rD {
    public final C24921Me A00;
    public final /* synthetic */ SelectedContactsList A01;

    public AnonymousClass3WX(C24921Me r1, SelectedContactsList selectedContactsList) {
        this.A01 = selectedContactsList;
        this.A00 = r1;
    }

    public int A0Q() {
        return this.A01.A09.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C113215mj r82 = (C113215mj) r8;
        SelectedContactsList selectedContactsList = this.A01;
        AnonymousClass1E7 r6 = (AnonymousClass1E7) selectedContactsList.A09.get(i);
        TextView textView = r82.A01;
        C24921Me r5 = this.A00;
        textView.setText(AnonymousClass3MY.A0q(r5, r6));
        selectedContactsList.A08.BIz(r82.A02, r6);
        View view = r82.A00;
        C90084dV.A00(view, this, r6, r82, 40);
        Resources resources = view.getResources();
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MX.A1N(r5, r6, A1a, 0);
        view.setContentDescription(resources.getString(2131895640, A1a));
        AnonymousClass1Y5.A02(view, 2131886194);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113215mj(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, this.A01.getSelectedContactsLayout()));
    }
}
