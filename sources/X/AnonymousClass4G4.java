package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.4G4  reason: invalid class name */
public abstract class AnonymousClass4G4 {
    public static final WDSSwitch A00(Context context, ListItemWithLeftIcon listItemWithLeftIcon) {
        LinearLayout.LayoutParams A0D = AnonymousClass3Ma.A0D();
        WDSSwitch wDSSwitch = new WDSSwitch(context, (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
        wDSSwitch.setId(2131432885);
        wDSSwitch.setLayoutParams(A0D);
        listItemWithLeftIcon.A08(wDSSwitch);
        return wDSSwitch;
    }
}
