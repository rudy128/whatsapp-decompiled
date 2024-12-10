package X;

import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.5mf  reason: invalid class name and case insensitive filesystem */
public class C113175mf extends C42011xT {
    public WaImageView A00;
    public final View A01;

    public C113175mf(View view) {
        super(view);
        if (view instanceof WDSSectionHeader) {
            this.A01 = view;
            return;
        }
        this.A01 = view.findViewById(2131435817);
        this.A00 = AnonymousClass3MW.A0S(view, 2131434900);
    }
}
