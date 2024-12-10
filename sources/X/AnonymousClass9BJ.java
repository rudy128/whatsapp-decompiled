package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.9BJ  reason: invalid class name */
public final class AnonymousClass9BJ extends A34 {
    public WeakReference A00;
    public final AnonymousClass1KB A01;
    public final C19830z4 A02;
    public final C22611Cn A03;
    public final AnonymousClass19D A04;
    public final C27361Vu A05;
    public final C183599Yw A06;

    public AnonymousClass9BJ(AnonymousClass1KB r2, C19830z4 r3, C22611Cn r4, AnonymousClass19D r5, B9N b9n, C27361Vu r7, C183599Yw r8) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r4;
        this.A00 = AnonymousClass3MW.A0z(b9n);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        B9N b9n;
        String str;
        Intent className;
        int i;
        String str2;
        int A0M = AnonymousClass000.A0M(obj);
        this.A01.A04();
        WeakReference weakReference = this.A00;
        if (weakReference != null && (b9n = (B9N) weakReference.get()) != null && !b9n.Bed()) {
            RegisterName registerName = (RegisterName) b9n;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("restore>RegisterName/onRestoreStateResult/result = ");
            if (A0M == 0) {
                str = "from-backup";
            } else if (A0M == 1) {
                str = "from-google-migrate";
            } else if (A0M == 2) {
                str = "from-consumer-app";
            } else if (A0M == 3) {
                str = "media-unreadable";
            } else if (A0M == 4) {
                str = "message-store-is-healthy";
            } else if (A0M != 5) {
                str = AnonymousClass001.A1I("unspecified restore type: ", AnonymousClass000.A10(), A0M);
            } else {
                str = "from-chat-transfer";
            }
            C17890vO.A1A(A10, str);
            if (A0M != 4) {
                if (AnonymousClass8BU.A02(registerName) == 37) {
                    C33841jT.A03(registerName.A4j(), 2, true);
                    AnonymousClass4Yv.A00(registerName, 0);
                }
                if (A0M != 0) {
                    if (A0M == 1) {
                        C19830z4 r0 = registerName.A0A;
                        C17880vN.A1D(C19830z4.A00(r0), "google_migrate_import_start_time", System.currentTimeMillis());
                        if (registerName.A13 != null) {
                            try {
                                className = AnonymousClass8BR.A07(registerName, Class.forName("com.whatsapp.migration.android.view.GoogleMigrateImporterActivity"));
                                i = 18;
                            } catch (ClassNotFoundException unused) {
                                Log.e("GoogleMigrateUtil/createStartIntent/class not found");
                                return;
                            }
                        } else {
                            str2 = "googleMigrateBridgeUtil";
                        }
                    } else if (A0M == 2) {
                        C19830z4 r02 = registerName.A0A;
                        C17880vN.A1D(C19830z4.A00(r02), "direct_migration_start_time", SystemClock.elapsedRealtime());
                        if (registerName.A0z != null) {
                            long A002 = C24211Jh.A00(registerName, "com.whatsapp.w4b");
                            C17900vP.A0m("RegisterName/checkForMigrateFromConsumerDirectly/providerAppVersionCode = ", AnonymousClass000.A10(), A002);
                            C27371Vv r03 = registerName.A0z;
                            if (r03 != null) {
                                r03.A00.A0A = Long.valueOf(A002);
                                Intent A0A = C17880vN.A0A();
                                A0A.setClassName(registerName.getPackageName(), "com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity");
                                registerName.startActivityForResult(A0A, 16);
                                return;
                            }
                        }
                        str2 = "directMigrationLogging";
                    } else if (A0M == 3) {
                        AnonymousClass4Yv.A01(registerName, 107);
                        return;
                    } else if (A0M == 5) {
                        className = AnonymousClass1LU.A1b(registerName, (String) null, (String) null, 0, false);
                        i = 19;
                    } else {
                        throw AnonymousClass8BX.A0W("restore>RegisterName/onRestoreStateResult/result is not recognized/result = ", AnonymousClass000.A10(), A0M);
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
                Log.i("restore>RegisterName/checking for google and local backups");
                className = C17880vN.A0A().setClassName(registerName.getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
                className.setAction("action_show_restore_one_time_setup");
                i = 14;
                registerName.startActivityForResult(className, i);
                return;
            }
            AnonymousClass8BW.A0U(registerName).A0H("profile_photo", "no_tap");
            registerName.A4m();
            registerName.A1N = 4;
            AnonymousClass8BX.A15(registerName);
            if (AnonymousClass8BU.A02(registerName) == 37) {
                RegisterName.A0q(registerName);
            }
        }
    }
}
