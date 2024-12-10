package X;

import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.8gU  reason: invalid class name and case insensitive filesystem */
public class C167508gU extends C66242xr {
    public final /* synthetic */ SettingsGoogleDrive A00;
    public final /* synthetic */ String A01;

    public C167508gU(SettingsGoogleDrive settingsGoogleDrive, String str) {
        this.A00 = settingsGoogleDrive;
        this.A01 = str;
    }

    public void Bkn(boolean z) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("settings-gdrive/gdrive-backup-deletion-finished/");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        C17890vO.A1A(A10, str);
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        AnonymousClass8BR.A0D(settingsGoogleDrive.A0f).A0A("com.whatsapp.backup.google.google-encrypted-re-upload-worker");
        A8L.A03(settingsGoogleDrive.A04);
        settingsGoogleDrive.A0A.A1V(this.A01);
        settingsGoogleDrive.A05.A0J(new C21424Ajr(settingsGoogleDrive, 5));
    }
}
