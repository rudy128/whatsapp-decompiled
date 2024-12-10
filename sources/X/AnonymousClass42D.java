package X;

import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel;

/* renamed from: X.42D  reason: invalid class name */
public final class AnonymousClass42D extends C74233Za {
    public final InteropOptInSelectIntegratorsViewModel A00;
    public final View A01;
    public final CheckBox A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42D(View view, InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A01 = view;
        this.A00 = interopOptInSelectIntegratorsViewModel;
        this.A02 = (CheckBox) AnonymousClass3MX.A0C(view, 2131431832);
    }

    public void A0B(AnonymousClass4SJ r4, C86884Tl r5) {
        C18070vi.A0d(r5, 0);
        super.A0B(r4, r5);
        CheckBox checkBox = this.A02;
        checkBox.setChecked(r5.A00);
        checkBox.setOnCheckedChangeListener(new C90844ej(this, r5, 3));
    }
}
