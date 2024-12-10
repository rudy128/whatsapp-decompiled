package X;

import com.whatsapp.settings.SettingsContactsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5VZ  reason: invalid class name */
public final class AnonymousClass5VZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $backupContacts;
    public final /* synthetic */ int $failResID = 2131893337;
    public final /* synthetic */ boolean $isContactDeleted;
    public final /* synthetic */ boolean $isOSPersimssionGranted;
    public final /* synthetic */ boolean $isRunOnSeparateUploadJob;
    public final /* synthetic */ C22821Di $onSaveResult;
    public final /* synthetic */ int $succesResID;
    public final /* synthetic */ SettingsContactsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VZ(SettingsContactsActivity settingsContactsActivity, C22821Di r3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.this$0 = settingsContactsActivity;
        this.$backupContacts = z;
        this.$isOSPersimssionGranted = z2;
        this.$isContactDeleted = z3;
        this.$isRunOnSeparateUploadJob = z4;
        this.$onSaveResult = r3;
        this.$succesResID = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C22821Di r1;
        String str;
        boolean A1Y = AnonymousClass000.A1Y(obj);
        boolean z = true;
        if (A1Y) {
            this.this$0.A0A.A25(this.$backupContacts);
            if (!this.$backupContacts) {
                SettingsContactsActivity settingsContactsActivity = this.this$0;
                if (settingsContactsActivity.A0O != null) {
                    C127086dm r3 = settingsContactsActivity.A0C;
                    if (r3 != null) {
                        C17880vN.A1C(C17890vO.A0A(r3.A01), "sync_to_device_toggle_streak", 0);
                        C17880vN.A1F(C17890vO.A0A(r3.A01), "sync_to_device_sticky_toggle_setting", false);
                        Log.i("SettingsContactsActivity/backupoff/clearning");
                        AnonymousClass1UW r0 = this.this$0.A0E;
                        if (r0 != null) {
                            r0.A02();
                        } else {
                            str = "clientContactMetadataEncryptionKeyStorage";
                        }
                    } else {
                        str = "contactsSharedPreferences";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                str = "settingsContactsUtil";
                C18070vi.A11(str);
                throw null;
            }
            SettingsContactsActivity settingsContactsActivity2 = this.this$0;
            C133956pm r5 = settingsContactsActivity2.A0O;
            if (r5 != null) {
                boolean z2 = this.$backupContacts;
                boolean z3 = this.$isOSPersimssionGranted;
                boolean z4 = this.$isContactDeleted;
                AnonymousClass00H r02 = settingsContactsActivity2.A0X;
                if (r02 != null) {
                    C139486yv r7 = (C139486yv) C18070vi.A0E(r02);
                    SettingsContactsActivity settingsContactsActivity3 = this.this$0;
                    AnonymousClass1M9 r6 = settingsContactsActivity3.A0B;
                    if (r6 != null) {
                        AnonymousClass12E r8 = settingsContactsActivity3.A0D;
                        if (r8 != null) {
                            AnonymousClass10I r9 = settingsContactsActivity3.A05;
                            C18070vi.A0X(r9);
                            r5.A00(r6, r7, r8, r9, z2, z3, z4, this.$isRunOnSeparateUploadJob);
                            SettingsContactsActivity settingsContactsActivity4 = this.this$0;
                            settingsContactsActivity4.A05.A0J(new C146837Qu(settingsContactsActivity4, this.$succesResID, 7, this.$backupContacts));
                            r1 = this.$onSaveResult;
                        } else {
                            str = "contactSyncMethods";
                        }
                    } else {
                        str = "contactManager";
                    }
                } else {
                    str = "nativeContactDbHelper";
                }
                C18070vi.A11(str);
                throw null;
            }
            str = "settingsContactsUtil";
            C18070vi.A11(str);
            throw null;
        }
        if (!A1Y) {
            SettingsContactsActivity settingsContactsActivity5 = this.this$0;
            settingsContactsActivity5.A05.A0J(new AnonymousClass7RM((Object) settingsContactsActivity5, this.$failResID, 41));
            r1 = this.$onSaveResult;
            z = false;
        }
        return C27621Wu.A00;
        r1.invoke(Boolean.valueOf(z));
        return C27621Wu.A00;
    }
}
