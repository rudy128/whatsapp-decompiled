package X;

import android.widget.CompoundButton;
import com.whatsapp.settings.SettingsChat;
import java.util.List;

/* renamed from: X.4pk  reason: invalid class name and case insensitive filesystem */
public class C97604pk implements C107615aJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C97604pk(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onSuccess() {
        if (this.A00 != 0) {
            ((CompoundButton) this.A02).toggle();
            AnonymousClass3MX.A0y(((SettingsChat) this.A01).A0O).A08(true);
            return;
        }
        AnonymousClass4V5 r6 = (AnonymousClass4V5) this.A02;
        for (C441822l buE : (List) this.A01) {
            r6.A00.A02(new C24027BuE(buE, true, false));
        }
    }
}
