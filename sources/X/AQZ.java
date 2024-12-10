package X;

import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.settings.SettingsChat;

public class AQZ implements C1600586y {
    public final int A00;
    public final Object A01;

    public AQZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C6W() {
        if (this.A00 != 0) {
            SettingsChat.A0c((SettingsChat) this.A01);
        } else {
            ((SettingsGoogleDrive) this.A01).A0P.A0U();
        }
    }
}
