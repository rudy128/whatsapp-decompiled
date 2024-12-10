package X;

import android.view.View;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.6K6  reason: invalid class name */
public final class AnonymousClass6K6 extends C113585nK {
    public boolean A00;
    public final C112365lM A01;

    public AnonymousClass6K6(View view, C112365lM r7, boolean z) {
        super(view);
        WDSSectionHeader wDSSectionHeader;
        this.A01 = r7;
        int i = z ? 2131892625 : 2131892722;
        if ((view instanceof WDSSectionHeader) && (wDSSectionHeader = (WDSSectionHeader) view) != null) {
            wDSSectionHeader.setHeaderText(i);
            wDSSectionHeader.setAddOnType(new AnonymousClass6Pl(C27881Xz.TONAL, (String) null, 2131232029, true));
            WDSButton A07 = wDSSectionHeader.A07(false);
            if (A07 != null) {
                AnonymousClass78L.A00(A07, this, 3);
            }
        }
    }
}
