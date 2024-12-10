package X;

import android.os.Bundle;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;

public class AMZ implements C36851oZ {
    public int A00;
    public long A01 = -1;
    public long A02 = -1;
    public final AnonymousClass1KB A03;
    public final C36861oa A04;
    public final SettingsGoogleDriveViewModel A05;
    public final AnonymousClass11E A06;
    public final C19830z4 A07;

    public static void A02(AMZ amz) {
        amz.A05((C180279Lx) null, 2, -1);
    }

    private void A04(C180279Lx r7, int i, int i2) {
        A06(r7, i, i2, true, false);
    }

    private void A05(C180279Lx r7, int i, int i2) {
        A06(r7, i, i2, false, false);
    }

    public static int A00(long j, int i, long j2) {
        if (i > 0) {
            return (int) ((j * 100) / j2);
        }
        return -1;
    }

    private void A01() {
        AnonymousClass1KB r3 = this.A03;
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A05;
        settingsGoogleDriveViewModel.getClass();
        r3.A0J(new C21424Ajr(settingsGoogleDriveViewModel, 13));
    }

    public static void A03(AMZ amz, int i, int i2) {
        amz.A04(new C167758gu(i), 3, i2);
    }

    private void A06(C180279Lx r8, int i, int i2, boolean z, boolean z2) {
        AnonymousClass1DT r0;
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel;
        boolean z3 = false;
        if (i != this.A00) {
            z3 = true;
            if (i == 4) {
                Log.i("settings-gdrive/set-message/show-indeterminate");
            }
        }
        this.A00 = i;
        boolean z4 = null;
        if (i == 1) {
            if (z3) {
                Log.i("settings-gdrive/set-message/show-nothing");
            }
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel2 = this.A05;
            settingsGoogleDriveViewModel2.A07.A0E(false);
            settingsGoogleDriveViewModel2.A0M.A0E(false);
            settingsGoogleDriveViewModel2.A09.A0E(false);
            settingsGoogleDriveViewModel2.A0N.A0E(false);
            settingsGoogleDriveViewModel2.A0B.A0E(false);
            settingsGoogleDriveViewModel2.A06.A0E(false);
            r0 = settingsGoogleDriveViewModel2.A08;
        } else if (i != 2) {
            if (i != 3) {
                C17960vV.A07(r8);
                settingsGoogleDriveViewModel = this.A05;
                z4 = false;
                settingsGoogleDriveViewModel.A07.A0E(false);
                settingsGoogleDriveViewModel.A0N.A0E(false);
                settingsGoogleDriveViewModel.A0M.A0E(true);
                settingsGoogleDriveViewModel.A0K.A0E(true);
                AnonymousClass3MY.A1M(settingsGoogleDriveViewModel.A09, z);
                settingsGoogleDriveViewModel.A06.A0E(true);
                if (z3) {
                    C17900vP.A0Y(r8, "settings-gdrive/set-message ", AnonymousClass000.A10());
                }
                settingsGoogleDriveViewModel.A08.A0E(r8);
            } else {
                C17960vV.A07(r8);
                if (z3) {
                    Log.i("settings-gdrive/set-message/show-determinate");
                }
                settingsGoogleDriveViewModel = this.A05;
                z4 = false;
                settingsGoogleDriveViewModel.A07.A0E(false);
                settingsGoogleDriveViewModel.A0M.A0E(true);
                settingsGoogleDriveViewModel.A0K.A0E(false);
                AnonymousClass3MY.A1M(settingsGoogleDriveViewModel.A09, z);
                settingsGoogleDriveViewModel.A06.A0E(true);
                if (i2 >= 0) {
                    AnonymousClass3MX.A1K(settingsGoogleDriveViewModel.A0L, i2);
                }
                settingsGoogleDriveViewModel.A08.A0E(r8);
                AnonymousClass3MY.A1M(settingsGoogleDriveViewModel.A0N, z2);
            }
            r0 = settingsGoogleDriveViewModel.A0B;
        } else {
            if (z3) {
                Log.i("settings-gdrive/set-message/show-backup-button");
            }
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel3 = this.A05;
            settingsGoogleDriveViewModel3.A07.A0E(true);
            settingsGoogleDriveViewModel3.A0M.A0E(false);
            settingsGoogleDriveViewModel3.A09.A0E(false);
            settingsGoogleDriveViewModel3.A0N.A0E(false);
            settingsGoogleDriveViewModel3.A0B.A0E(true);
            settingsGoogleDriveViewModel3.A06.A0E(false);
            settingsGoogleDriveViewModel3.A05.A0E(true);
            settingsGoogleDriveViewModel3.A08.A0E((Object) null);
            A01();
            if (r8 != null) {
                throw AnonymousClass000.A0k("message should be null when button has to be displayed.");
            }
            return;
        }
        r0.A0E(z4);
    }

    public void Bkn(boolean z) {
        Log.e("settings-gdrive-observer/account-deletion-end/unexpected-state");
    }

    public void BmD() {
        Log.i("settings-gdrive-observer/backup-cancelled");
        A02(this);
    }

    public void BmF(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/no-data-connection");
        A03(this, 8, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BmG(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/low-battery");
        A03(this, 9, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BmH(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-missing");
        A03(this, 11, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BmI(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-unmounted");
        A03(this, 10, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void BmJ(long j, long j2) {
        Log.i("settings-gdrive-observer/backup-paused/no-wifi");
        int A002 = A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        int i = 7;
        if (this.A06.A03(true) == 2) {
            i = 6;
        }
        A03(this, i, A002);
    }

    public void BmK(int i) {
        if (i >= 0) {
            C17960vV.A00();
            A04(new C167738gs(i), 4, i);
        }
    }

    public void BmL() {
        Log.i("settings-gdrive-observer/backup-prep-start");
        A04(new C167758gu(5), 4, -1);
    }

    public void BmM(long j, long j2) {
        if (j2 <= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("settings-gdrive-observer/backup-progress incorrect invocation: ");
            A10.append(j);
            C17900vP.A0l("/", A10, j2);
            return;
        }
        long j3 = this.A02;
        int i = (int) ((100 * j) / j2);
        if (((int) ((j3 * 100) / j2)) != i || j != j3) {
            this.A02 = j;
            A04(new C167768gv(j, j2), 3, i);
        }
    }

    public void BmN() {
        Log.i("settings-gdrive-observer/backup-start");
        this.A02 = -1;
        BmK(0);
    }

    public void Bsb() {
        C19830z4 r1 = this.A07;
        if (r1.A0M(r1.A0f()) == 2) {
            A01();
        }
    }

    public void BtJ(int i) {
        if (i != 10) {
            A02(this);
        }
        AnonymousClass3MX.A1K(this.A05.A0D, i);
    }

    public void BtK(int i, Bundle bundle) {
        if (i != 10) {
            A05((C180279Lx) null, 1, -1);
        }
        this.A05.A0E.A0E(new C183849Zv(i, bundle));
    }

    public void BtL(int i, Bundle bundle) {
        Log.e("settings-gdrive-observer/msgstore-download-error/unexpected-state");
    }

    public void Bxy() {
        Log.i("settings-gdrive-observer/restore-cancelled");
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A05;
        boolean A032 = C22781De.A03();
        AnonymousClass1DT r1 = settingsGoogleDriveViewModel.A0C;
        if (A032) {
            r1.A0F(false);
        } else {
            r1.A0E(false);
        }
        A02(this);
        this.A01 = -1;
        this.A02 = -1;
    }

    public void By0(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/no-data-connection");
        A05(new C167758gu(1), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void By1(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/low-battery");
        int A002 = A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        this.A05.A0e.set(true);
        A06(new C167758gu(2), 3, A002, false, true);
    }

    public void By2(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-missing");
        A05(new C167758gu(4), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void By3(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-unmounted");
        A05(new C167758gu(3), 3, A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
    }

    public void By4(long j, long j2) {
        Log.i("settings-gdrive-observer/restore-paused/no-wifi");
        int A002 = A00(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2);
        this.A05.A0e.set(false);
        if (this.A06.A03(true) == 2) {
            Log.i("settings-gdrive-observer/restore-paused/cellular-available");
            A06(new C167758gu(0), 3, A002, false, true);
            return;
        }
        A05(new C167758gu(0), 3, A002);
    }

    public void By5(int i) {
        if (i >= 0) {
            A05(new C167748gt(i), 4, i);
        }
    }

    public void By6() {
        Log.i("settings-gdrive-observer/restore-start");
        A05(new C167758gu(13), 4, -1);
    }

    public void By7(long j, long j2) {
        if (j != this.A01) {
            this.A01 = j;
            A05(new C167778gw(j, j2), 3, (int) ((j * 100) / j2));
        }
    }

    public void ByU(boolean z) {
        Log.e("settings-gdrive-observer/msgstore-download-end/unexpected-state");
    }

    public void ByV(long j, long j2) {
        Log.e("settings-gdrive-observer/msgstore-download-progress/unexpected-state");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("settings-gdrive-observer/msgstore-download-progress/downloaded: ");
        A10.append(j);
        C17900vP.A0m(" total: ", A10, j2);
    }

    public void ByW() {
        Log.e("settings-gdrive-observer/msgstore-download-start/unexpected-state");
    }

    public void C4d() {
        Log.i("settings-gdrive-observer/post-backup-scrub-start");
        A04(new C167758gu(12), 4, -1);
    }

    public AMZ(AnonymousClass1KB r3, C36861oa r4, SettingsGoogleDriveViewModel settingsGoogleDriveViewModel, AnonymousClass11E r6, C19830z4 r7) {
        this.A03 = r3;
        this.A07 = r7;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = settingsGoogleDriveViewModel;
    }

    public void BmE(boolean z) {
        C17900vP.A0n("settings-gdrive-observer/backup-end ", AnonymousClass000.A10(), z);
        A02(this);
        if (z && this.A05.A0f.get()) {
            this.A04.A05();
        }
    }

    public void Bxz(long j, boolean z) {
        C17900vP.A0n("settings-gdrive-observer/restore-end ", AnonymousClass000.A10(), z);
        A02(this);
        this.A01 = -1;
        this.A02 = -1;
        if (z && this.A05.A0f.get()) {
            this.A04.A05();
        }
    }

    public void C9a() {
        A01();
    }
}
