package X;

import android.view.View;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.6KL  reason: invalid class name */
public final class AnonymousClass6KL extends C113585nK {
    public final View A00;
    public final C18030ve A01;
    public final UpdatesFragment A02;

    public AnonymousClass6KL(View view, C18030ve r5, UpdatesFragment updatesFragment, boolean z, boolean z2) {
        super(view);
        WDSSectionHeader wDSSectionHeader;
        this.A00 = view;
        this.A02 = updatesFragment;
        this.A01 = r5;
        if ((view instanceof WDSSectionHeader) && (wDSSectionHeader = (WDSSectionHeader) view) != null) {
            wDSSectionHeader.setHeaderText(2131892798);
            if (!C18020vd.A05(C18040vf.A01, r5, 11314)) {
                wDSSectionHeader.setDividerVisibility(z);
            }
            A01(this, z2);
            AnonymousClass1Y5.A0A(wDSSectionHeader, true);
        }
    }

    public static final void A01(AnonymousClass6KL r5, boolean z) {
        WDSSectionHeader wDSSectionHeader;
        AnonymousClass6U7 r0;
        View view = r5.A00;
        if ((view instanceof WDSSectionHeader) && (wDSSectionHeader = (WDSSectionHeader) view) != null) {
            if (z) {
                r0 = new AnonymousClass6Pk(C27881Xz.TONAL, view.getContext().getString(2131892797));
            } else {
                r0 = AnonymousClass6Pj.A00;
            }
            wDSSectionHeader.setAddOnType(r0);
            WDSButton A07 = wDSSectionHeader.A07(false);
            if (A07 != null) {
                A07.setContentDescription((CharSequence) null);
            }
            WDSButton A072 = wDSSectionHeader.A07(false);
            if (A072 != null) {
                AnonymousClass3Ma.A1E(A072, r5, 47);
            }
        }
    }
}
