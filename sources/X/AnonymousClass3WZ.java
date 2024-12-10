package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

/* renamed from: X.3WZ  reason: invalid class name */
public final class AnonymousClass3WZ extends C38391rD {
    public List A00 = C18460wS.A00;
    public final InteropOptInSelectInboxViewModel A01;

    public AnonymousClass3WZ(InteropOptInSelectInboxViewModel interopOptInSelectInboxViewModel) {
        C18070vi.A0d(interopOptInSelectInboxViewModel, 1);
        this.A01 = interopOptInSelectInboxViewModel;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C74223Yz(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625754), this.A01);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        RadioButton radioButton;
        int i2;
        C74223Yz r62 = (C74223Yz) r6;
        C18070vi.A0d(r62, 0);
        C86894Tm r3 = (C86894Tm) this.A00.get(i);
        C18070vi.A0d(r3, 0);
        View view = r62.A00;
        C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
        WDSListItem wDSListItem = (WDSListItem) view;
        int ordinal = r3.A01.ordinal();
        WDSIcon wDSIcon = wDSListItem.A0A;
        if (ordinal != 2) {
            if (wDSIcon != null) {
                wDSIcon.setIcon(2131233247);
            }
            wDSListItem.setText(2131899395);
            wDSListItem.setSubText(2131895819);
            RadioButton radioButton2 = wDSListItem.A02;
            if (radioButton2 != null) {
                radioButton2.setChecked(r3.A00);
            }
            radioButton = wDSListItem.A02;
            if (radioButton != null) {
                i2 = 2;
            } else {
                return;
            }
        } else {
            if (wDSIcon != null) {
                wDSIcon.setIcon(2131233433);
            }
            wDSListItem.setText(2131899396);
            wDSListItem.setSubText(2131896009);
            RadioButton radioButton3 = wDSListItem.A02;
            if (radioButton3 != null) {
                radioButton3.setChecked(r3.A00);
            }
            radioButton = wDSListItem.A02;
            if (radioButton != null) {
                i2 = 1;
            } else {
                return;
            }
        }
        radioButton.setOnCheckedChangeListener(new C90844ej(r3, r62, i2));
    }
}
