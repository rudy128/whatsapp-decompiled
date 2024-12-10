package X;

import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel;
import com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel;
import com.whatsapp.settings.SettingsChat;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4ej  reason: invalid class name and case insensitive filesystem */
public class C90844ej implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90844ej(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C33971jg A0k;
        int i;
        switch (this.A00) {
            case 0:
                List list = C42011xT.A0I;
                ((AnonymousClass3WW) this.A01).A00.A0T(((AnonymousClass4Y5) this.A02).A01, z);
                return;
            case 3:
                List list2 = C42011xT.A0I;
                ((C86884Tl) this.A01).A00 = z;
                InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel = ((AnonymousClass42D) this.A02).A00;
                AnonymousClass1DT r3 = interopOptInSelectIntegratorsViewModel.A05;
                List<C86884Tl> A10 = AnonymousClass3MW.A10(interopOptInSelectIntegratorsViewModel.A03);
                int i2 = 0;
                if (A10 != null && (!(A10 instanceof Collection) || !A10.isEmpty())) {
                    for (C86884Tl r0 : A10) {
                        if (r0.A00 && (i2 = i2 + 1) < 0) {
                            AnonymousClass1ZU.A0A();
                            throw null;
                        }
                    }
                }
                AnonymousClass3MX.A1J(r3, i2);
                return;
            case 4:
                SettingsChat.A0V((View) this.A02, (SettingsChat) this.A01, z);
                return;
            default:
                List list3 = C42011xT.A0I;
                InteropOptInSelectInboxViewModel interopOptInSelectInboxViewModel = ((C74223Yz) this.A01).A01;
                C83024Db r2 = ((C86894Tm) this.A02).A01;
                if (z) {
                    A0k = AnonymousClass3MX.A0k(interopOptInSelectInboxViewModel.A05);
                    i = r2.type;
                } else {
                    C83024Db r1 = C83024Db.A02;
                    if (r2 == r1) {
                        r1 = C83024Db.A03;
                    }
                    A0k = AnonymousClass3MX.A0k(interopOptInSelectInboxViewModel.A05);
                    i = r1.type;
                }
                C17880vN.A1C(C33971jg.A00(A0k).edit(), "unified_inbox_option", i);
                return;
        }
    }
}
