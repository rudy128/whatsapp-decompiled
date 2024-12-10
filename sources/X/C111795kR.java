package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.settings.SettingsRowIconText;
import java.util.List;

/* renamed from: X.5kR  reason: invalid class name and case insensitive filesystem */
public final class C111795kR extends C41251w3 {
    public final C22821Di A00;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass6G4(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626925), this.A00);
        }
        if (i == 2) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626924, viewGroup, false);
            List list = C42011xT.A0I;
            C72453Mb.A1S(inflate);
            return new C42011xT(inflate);
        }
        C17900vP.A0i("SettingsSearchResultsListAdapter/onCreateViewHolder type not handled - ", AnonymousClass000.A10(), i);
        throw AnonymousClass001.A13("Unexpected view type: ", AnonymousClass000.A10(), i);
    }

    public C111795kR(C22821Di r2) {
        super((C40411uf) C111595jy.A00);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C112885mC r62 = (C112885mC) r6;
        C135996t6 r4 = (C135996t6) C72463Mc.A0l(this, r62, i);
        boolean z = r62 instanceof AnonymousClass6G4;
        View A09 = C108965cb.A09(r62, r4);
        if (z) {
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) AnonymousClass3MX.A0C(A09, 2131435307);
            settingsRowIconText.setText((CharSequence) r4.A04);
            settingsRowIconText.setSubText((CharSequence) r4.A03);
            Drawable drawable = r4.A01;
            settingsRowIconText.setIcon(drawable);
            AnonymousClass3MZ.A1P(settingsRowIconText, r4, r62, 23);
            int i2 = 216;
            if (drawable != null) {
                i2 = 0;
            }
            C72463Mc.A14(settingsRowIconText, i2, settingsRowIconText.getPaddingTop());
            return;
        }
        C72453Mb.A0W(A09, 2131435318).setText(r4.A04);
    }

    public int getItemViewType(int i) {
        return ((C135996t6) A0U(i)).A00;
    }
}
