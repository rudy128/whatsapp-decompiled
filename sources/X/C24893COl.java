package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.lang.reflect.Field;

/* renamed from: X.COl  reason: case insensitive filesystem */
public final class C24893COl {
    public final WDSSwitch A00;
    public final Field A01;

    public C24893COl(WDSSwitch wDSSwitch) {
        Field field;
        this.A00 = wDSSwitch;
        try {
            field = SwitchCompat.class.getDeclaredField("mThumbPosition");
            C18070vi.A0X(field);
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        this.A01 = field;
    }
}
