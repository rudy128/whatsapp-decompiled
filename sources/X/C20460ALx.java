package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.ALx  reason: case insensitive filesystem */
public class C20460ALx implements C22534BBr {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C20460ALx(A8T a8t, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = a8t;
        if (i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    public void BEm(RandomAccessFile randomAccessFile) {
        if (this.A00 != 0) {
            Log.i("AccountSwitchingFileManager/switchAccount/checkpointOps");
            A8T a8t = (A8T) this.A01;
            A8T.A01(a8t, randomAccessFile, this.A03);
            A8T.A00(a8t, randomAccessFile, this.A02);
            return;
        }
        Log.i("AccountSwitchingFileManager/migrate/moving account directory");
        A8T a8t2 = (A8T) this.A01;
        String absolutePath = ((File) a8t2.A0A.getValue()).getAbsolutePath();
        String str = this.A02;
        File A0u = AnonymousClass8BR.A0u(absolutePath, str);
        if (A0u.exists()) {
            File A0u2 = AnonymousClass8BR.A0u(AnonymousClass3MW.A0y(a8t2.A08), "accounts");
            AnonymousClass8BV.A1H(A0u2);
            String str2 = this.A03;
            File A0e = C17880vN.A0e(A0u2, str2);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AccountSwitchingFileManager/migrate/move from: ");
            A10.append(A0u);
            C17900vP.A0Y(A0e, " to: ", A10);
            AnonymousClass00H r3 = a8t2.A05;
            r3.get();
            String absolutePath2 = A0u.getAbsolutePath();
            C18070vi.A0X(absolutePath2);
            String absolutePath3 = A0e.getAbsolutePath();
            C18070vi.A0X(absolutePath3);
            StringBuilder A19 = AnonymousClass3MZ.A19(str2, 1);
            A19.append("ns_moving:");
            A19.append(str2);
            A19.append(":from:");
            A19.append(absolutePath2);
            String A1H = AnonymousClass001.A1H(":to:", absolutePath3, A19);
            randomAccessFile.writeBytes(A1H);
            C17900vP.A0f("AccountSwitchingRecoveryManager/recordPreFileMovingForNewStorage/recorded: ", A1H, AnonymousClass000.A10());
            if (A0u.renameTo(A0e)) {
                r3.get();
                String absolutePath4 = A0u.getAbsolutePath();
                C18070vi.A0X(absolutePath4);
                String absolutePath5 = A0e.getAbsolutePath();
                StringBuilder A15 = C108955ca.A15(absolutePath5);
                C17900vP.A0c("ns_moved:", str2, ":from:", absolutePath4, A15);
                A15.append(":to:");
                A15.append(absolutePath5);
                String A0c = C17890vO.A0c(A15, 10);
                C63202sg.A00(randomAccessFile, A0c);
                C17900vP.A0f("AccountSwitchingRecoveryManager/recordPostFileMovingForNewStorage/recorded: ", A0c, AnonymousClass000.A10());
                Log.i("AccountSwitchingFileManager/migrate/moved account directory");
                C17880vN.A0J(a8t2.A04).A0H(str2);
                Log.i("AccountSwitchingFileManager/migrate/saved unique dir id for active user");
                return;
            }
            throw AnonymousClass000.A0n("Check failed.");
        }
        AnonymousClass8BX.A16(a8t2, "AccountSwitchingFileManager/migrate/stagingDirLogString/", AnonymousClass000.A10());
        throw AnonymousClass8BY.A0R(str);
    }

    public void CBz() {
        if (this.A00 != 0) {
            Log.i("AccountSwitchingFileManager/switchAccount/postCheckpointOps");
            A8T a8t = (A8T) this.A01;
            String str = this.A03;
            C17900vP.A0n("AccountSwitchingFileManager/switchAccount/moveLogsBackToActiveDirectory: ", AnonymousClass000.A10(), A8T.A05(a8t, str, false));
            C17900vP.A0n("AccountSwitchingFileManager/switchAccount/copyGoogleGcmFile:", AnonymousClass000.A10(), A8T.A04(a8t, str));
            C17900vP.A0n("AccountSwitchingFileManager/switchAccount/copyDbFile:", AnonymousClass000.A10(), A8T.A03(a8t, str));
        }
    }

    public void CC9() {
    }
}
