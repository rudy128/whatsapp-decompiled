package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.calling.wds.CallingMediaWDSButton;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4hL  reason: invalid class name and case insensitive filesystem */
public class C92464hL implements C107075Yh {
    public final int A00;

    public C92464hL(int i) {
        this.A00 = i;
    }

    public final WDSButton BHC(Context context) {
        if (this.A00 != 0) {
            CallingMediaWDSButton callingMediaWDSButton = new CallingMediaWDSButton(context, (AttributeSet) null);
            callingMediaWDSButton.setVariant(C27881Xz.TONAL);
            callingMediaWDSButton.setSize(AnonymousClass4D1.LARGE);
            return callingMediaWDSButton;
        }
        WDSButton wDSButton = new WDSButton(context, (AttributeSet) null);
        wDSButton.setSize(AnonymousClass4D1.NORMAL);
        wDSButton.setAction(AnonymousClass4DG.MEDIA);
        wDSButton.setVariant(C27881Xz.TONAL);
        wDSButton.setToggleSelection(true);
        return wDSButton;
    }
}
