package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.ALv  reason: case insensitive filesystem */
public class C20458ALv implements C22534BBr {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C20458ALv(A8T a8t, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = a8t;
            this.A02 = str;
        } else {
            this.A02 = str;
            this.A01 = a8t;
        }
    }

    public void BEm(RandomAccessFile randomAccessFile) {
        if (this.A00 != 0) {
            Log.i("AccountSwitchingFileManager/restoreAccount/checkpointOps");
            A8T.A00((A8T) this.A01, randomAccessFile, this.A02);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/prepForAddingNewAccount/checkpointOps/");
        String str = this.A02;
        C17890vO.A1A(A10, C60322np.A01(str));
        A8T.A01((A8T) this.A01, randomAccessFile, str);
    }

    public void CBz() {
        boolean z;
        StringBuilder A10;
        String str;
        String A0y;
        if (this.A00 == 0) {
            A8T a8t = (A8T) this.A01;
            String str2 = this.A02;
            C17900vP.A0n("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/moveLogsBackToActiveDirectory: ", AnonymousClass000.A10(), A8T.A05(a8t, str2, false));
            C17900vP.A0n("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyGoogleGcmFile:", AnonymousClass000.A10(), A8T.A04(a8t, str2));
            C17900vP.A0n("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyDbFile:", AnonymousClass000.A10(), A8T.A03(a8t, str2));
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/");
            C17890vO.A1A(A102, C60322np.A01(str2));
            C18100vl r1 = a8t.A0A;
            if (!AnonymousClass8BW.A1V(r1)) {
                A0y = "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/staging Directory doesn't exist";
            } else {
                File A0U = AnonymousClass8BX.A0U(str2, r1);
                if (!A0U.exists()) {
                    AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
                    A10 = AnonymousClass000.A10();
                    AnonymousClass8BV.A1K("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/account ", str2, A10);
                    str = " directory does not exist";
                } else {
                    File A0u = AnonymousClass8BR.A0u(A0U.getAbsolutePath(), "cache");
                    if (!A0u.exists()) {
                        AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
                        A10 = AnonymousClass000.A10();
                        AnonymousClass8BV.A1K("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/cache directory for ", str2, A10);
                        str = " does not exist";
                    } else {
                        File A002 = C22461Ab.A00(a8t.A03, "anr_detector_secondary_process");
                        File A0u2 = AnonymousClass8BR.A0u(A0u.getAbsolutePath(), A002.getName());
                        if (!A0u2.exists()) {
                            StringBuilder A11 = AnonymousClass000.A11("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/");
                            A11.append(A0u2);
                            AnonymousClass8BV.A1K(" file for ", str2, A11);
                            C17890vO.A1A(A11, " doesn't exist");
                            z = false;
                            C17900vP.A0n("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass000.A10(), z);
                        }
                        File A0u3 = AnonymousClass8BR.A0u(AnonymousClass3MW.A0y(a8t.A08), "cache");
                        if (!A0u3.exists() && !A0u3.mkdirs()) {
                            AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
                            Log.e("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/unable to create cache directory");
                        }
                        C64062u9.A0P(a8t.A02, A0u2, A002);
                        z = true;
                        C17900vP.A0n("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass000.A10(), z);
                    }
                }
                A0y = AnonymousClass000.A0y(str, A10);
            }
            Log.e(A0y);
            z = false;
            C17900vP.A0n("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass000.A10(), z);
        }
    }

    public void CC9() {
        String str;
        if (this.A00 != 0) {
            Log.i("AccountSwitchingFileManager/restoreAccount/preCheckpointOps");
            A8T a8t = (A8T) this.A01;
            String str2 = this.A02;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AccountSwitchingFileManager/copyDbFileToStaging/");
            C17890vO.A1A(A10, C60322np.A01(str2));
            File A0u = AnonymousClass8BR.A0u(AnonymousClass3MW.A0y(a8t.A08), "databases");
            if (!A0u.exists()) {
                str = "AccountSwitchingFileManager/copyDbFileToStaging/App database directory doesn't exist";
            } else {
                File A0u2 = AnonymousClass8BR.A0u(A0u.getAbsolutePath(), "account_switcher.db");
                if (!A0u2.exists()) {
                    str = "AccountSwitchingFileManager/copyDbFileToStaging/account_switcher.db file for current account doesn't exist";
                } else {
                    C18100vl r1 = a8t.A0A;
                    if (AnonymousClass8BW.A1V(r1)) {
                        File A0U = AnonymousClass8BX.A0U(str2, r1);
                        if (A0U.exists()) {
                            File A0e = C17880vN.A0e(A0U, "databases");
                            if (A0e.exists()) {
                                File A0e2 = C17880vN.A0e(A0e, "account_switcher.db");
                                C219317y r3 = a8t.A02;
                                C64062u9.A0P(r3, A0u2, A0e2);
                                Iterator it = AnonymousClass9TK.A00.iterator();
                                while (it.hasNext()) {
                                    String A0v = C17880vN.A0v(it);
                                    File A17 = C108945cZ.A17(AnonymousClass001.A1H(A0u2.getPath(), A0v, AnonymousClass000.A10()));
                                    if (A17.exists()) {
                                        C64062u9.A0P(r3, A17, C17880vN.A0e(A0e, C17900vP.A0A("account_switcher.db", A0v)));
                                    }
                                }
                                A8T.A05(a8t, str2, true);
                            }
                            AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyDbFileToStaging/stagingDirLogString/", AnonymousClass000.A10());
                            throw AnonymousClass000.A0n("databases directory does not exist in staged directory");
                        }
                        AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyDbFileToStaging/stagingDirLogString/", AnonymousClass000.A10());
                        throw AnonymousClass8BY.A0R(str2);
                    }
                    throw AnonymousClass000.A0n("Staging directory don't exist");
                }
            }
            Log.i(str);
            A8T.A05(a8t, str2, true);
        }
    }
}
