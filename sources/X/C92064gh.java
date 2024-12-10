package X;

import android.os.Process;
import com.whatsapp.settings.SettingsChat;

/* renamed from: X.4gh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C92064gh implements C72033Kj {
    public final /* synthetic */ SettingsChat A00;
    public final /* synthetic */ boolean A01;

    public final void Bom() {
        SettingsChat settingsChat = this.A00;
        C72483Me.A11(settingsChat, this.A01 ? 1 : 0);
        settingsChat.finishAffinity();
        Process.killProcess(Process.myPid());
    }

    public /* synthetic */ C92064gh(SettingsChat settingsChat, boolean z) {
        this.A00 = settingsChat;
        this.A01 = z;
    }
}
