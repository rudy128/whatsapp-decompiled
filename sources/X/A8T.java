package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class A8T {
    public final AnonymousClass118 A00;
    public final AnonymousClass1CO A01;
    public final C219317y A02;
    public final C17930vS A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18100vl A08 = C21528Alb.A00(this, 0);
    public final C18100vl A09 = C21527Ala.A00(0);
    public final C18100vl A0A = C21528Alb.A00(this, 1);
    public final AnonymousClass1M2 A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    public final File A0A(C62562rb r4) {
        C18070vi.A0d(r4, 0);
        Log.i("AccountSwitchingFileManager/getFilesDirForInactiveAccount");
        File A0B2 = A0B(r4);
        if (A0B2 != null && A0B2.exists()) {
            return AnonymousClass8BR.A0u(A0B2.getAbsolutePath(), "files");
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BW.A18(r4, "AccountSwitchingFileManager/getFilesDirForInactiveAccount/Account ", A10);
        C17890vO.A19(A10, " does not exist");
        AnonymousClass8BX.A16(this, "AccountSwitchingFileManager/getFilesDirForInactiveAccount/stagingDirLogString/", AnonymousClass000.A10());
        return null;
    }

    private final void A02(RandomAccessFile randomAccessFile, String str, String str2) {
        boolean renameTo;
        boolean renameTo2;
        Iterator A0s = AnonymousClass8BW.A0s(this.A09);
        while (A0s.hasNext()) {
            String A0v = C17880vN.A0v(A0s);
            String str3 = str2;
            boolean A062 = A06(str3, A0v);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AccountSwitchingFileManager/moveDirectories/delete ");
            A10.append(str3);
            A10.append('/');
            A10.append(A0v);
            C17900vP.A0n(" directory: ", A10, A062);
            AnonymousClass00H r12 = this.A05;
            r12.get();
            String str4 = str;
            C18070vi.A0o(A0v, str4, str3);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("moving:");
            A102.append(A0v);
            A102.append(":from:");
            A102.append(str4);
            String A1H = AnonymousClass001.A1H(":to:", str3, A102);
            RandomAccessFile randomAccessFile2 = randomAccessFile;
            randomAccessFile2.writeBytes(A1H);
            C17900vP.A0f("AccountSwitchingRecoveryManager/recordPreFileMoving/recorded: ", A1H, AnonymousClass000.A10());
            File A0u = AnonymousClass8BR.A0u(str4, A0v);
            if (!A0u.exists()) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("AccountSwitchingFileManager/moveToDir/");
                A103.append(A0v);
                C17900vP.A0e(" doesn't exist in ", str4, A103);
                renameTo = false;
            } else {
                renameTo = A0u.renameTo(AnonymousClass8BR.A0u(str3, A0v));
            }
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("AccountSwitchingFileManager/moveDirectories/move ");
            A104.append(A0v);
            A104.append(" from ");
            A104.append(str4);
            A104.append(" to ");
            A104.append(str3);
            C17900vP.A0n(": ", A104, renameTo);
            if (!renameTo) {
                StringBuilder A105 = AnonymousClass000.A10();
                C17900vP.A0c("AccountSwitchingFileManager/moveDirectories/failed to move ", A0v, " from ", str4, A105);
                A105.append(" to ");
                A105.append(str3);
                C17890vO.A19(A105, ". Trying again after delay");
                SystemClock.sleep(50);
                boolean A063 = A06(str3, A0v);
                StringBuilder A106 = AnonymousClass000.A10();
                A106.append("AccountSwitchingFileManager/moveDirectories/retry delete ");
                A106.append(str3);
                A106.append('/');
                A106.append(A0v);
                C17900vP.A0n(" directory: ", A106, A063);
                File A0u2 = AnonymousClass8BR.A0u(str4, A0v);
                if (!A0u2.exists()) {
                    StringBuilder A107 = AnonymousClass000.A10();
                    A107.append("AccountSwitchingFileManager/moveToDir/");
                    A107.append(A0v);
                    C17900vP.A0e(" doesn't exist in ", str4, A107);
                    renameTo2 = false;
                } else {
                    renameTo2 = A0u2.renameTo(AnonymousClass8BR.A0u(str3, A0v));
                }
                StringBuilder A108 = AnonymousClass000.A10();
                C17900vP.A0c("AccountSwitchingFileManager/moveDirectories/retry move ", A0v, " from ", str4, A108);
                A108.append(" to ");
                A108.append(str3);
                C17900vP.A0n(": ", A108, renameTo2);
                if (!renameTo2) {
                    StringBuilder A109 = AnonymousClass000.A10();
                    C17900vP.A0c("Failed to move ", A0v, " from ", str4, A109);
                    A109.append(" to ");
                    throw AnonymousClass000.A0o(str3, A109);
                }
            }
            r12.get();
            StringBuilder A1010 = AnonymousClass000.A10();
            C17900vP.A0c("moved:", A0v, ":from:", str4, A1010);
            A1010.append(":to:");
            A1010.append(str3);
            String A0c = C17890vO.A0c(A1010, 10);
            C63202sg.A00(randomAccessFile2, A0c);
            C17900vP.A0f("AccountSwitchingRecoveryManager/recordPostFileMoving/recorded: ", A0c, AnonymousClass000.A10());
        }
    }

    public static final boolean A04(A8T a8t, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/copySharedPrefFileFromStaging/");
        C17890vO.A1A(A10, C60322np.A01(str));
        C18100vl r1 = a8t.A0A;
        if (AnonymousClass8BW.A1V(r1)) {
            File A0U = AnonymousClass8BX.A0U(str, r1);
            if (A0U.exists()) {
                File A0u = AnonymousClass8BR.A0u(A0U.getAbsolutePath(), "shared_prefs");
                if (!A0u.exists()) {
                    AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copySharedPrefFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass8BV.A1K("AccountSwitchingFileManager/copySharedPrefFileFromStaging/shared prefs for ", str, A102);
                    C17890vO.A19(A102, " does not exist");
                    return false;
                }
                File A0u2 = AnonymousClass8BR.A0u(A0u.getAbsolutePath(), "com.google.android.gms.appid.xml");
                if (!A0u2.exists()) {
                    StringBuilder A0o = AnonymousClass8BW.A0o("AccountSwitchingFileManager/copySharedPrefFileFromStaging/", "com.google.android.gms.appid.xml");
                    AnonymousClass8BV.A1K(" file for ", str, A0o);
                    C17890vO.A19(A0o, " doesn't exist");
                    return false;
                }
                File A0u3 = AnonymousClass8BR.A0u(AnonymousClass3MW.A0y(a8t.A08), "shared_prefs");
                if (A0u3.exists() || A0u3.mkdirs()) {
                    C64062u9.A0P(a8t.A02, A0u2, C17880vN.A0e(A0u3, "com.google.android.gms.appid.xml"));
                    return true;
                }
                throw AnonymousClass000.A0n("Unable to create shared_prefs directory");
            }
            AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copySharedPrefFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
            throw AnonymousClass8BY.A0R(str);
        }
        throw AnonymousClass000.A0n("Staging Directory don't exist");
    }

    public final List A0D() {
        String str;
        int length;
        C18100vl r1 = this.A0A;
        if (!AnonymousClass8BW.A1V(r1)) {
            str = "AccountSwitchingFileManager/getLidsInStagedDir/staging directory doesn't exist";
        } else {
            File[] listFiles = ((File) r1.getValue()).listFiles();
            if (listFiles == null || (length = listFiles.length) == 0) {
                str = "AccountSwitchingFileManager/getLidsInStagedDir/no accounts found in staged directory";
            } else {
                ArrayList A0z = C17880vN.A0z(length);
                int i = 0;
                do {
                    A0z.add(listFiles[i].getName());
                    i++;
                } while (i < length);
                return A0z;
            }
        }
        Log.e(str);
        return C18460wS.A00;
    }

    public final void A0E(Boolean bool) {
        Object obj;
        Log.i("AccountSwitchingFileManager/deleteDefaultAccountDirectories");
        AnonymousClass00H r3 = this.A07;
        Object obj2 = ((AnonymousClass1L7) r3.get()).A02.get();
        StringBuilder A15 = C108955ca.A15(obj2);
        A15.append("AccountSwitchingFileManager/deleteDefaultAccountDirectories/externalDir: ");
        A15.append(obj2);
        C17900vP.A0Y(bool, "  isExternalMediaLocationUserScoped=", A15);
        if (C72463Mc.A1Y(bool)) {
            C21721ArX.A05(((AnonymousClass1L7) r3.get()).A05());
        }
        C21721ArX.A05(((AnonymousClass1L7) r3.get()).A04());
        C21721ArX.A05(((AnonymousClass1L7) r3.get()).A03());
        Iterator A0s = AnonymousClass8BW.A0s(this.A09);
        while (A0s.hasNext()) {
            String A0v = C17880vN.A0v(A0s);
            File A0u = AnonymousClass8BR.A0u(AnonymousClass3MW.A0y(this.A08), A0v);
            boolean exists = A0u.exists();
            StringBuilder A10 = AnonymousClass000.A10();
            if (exists) {
                C17900vP.A0f("AccountSwitchingFileManager/deleteDefaultAccountDirectories/deleting ", A0v, A10);
                if (C18070vi.A18(A0v, "shared_prefs")) {
                    obj = C18070vi.A0E(this.A0E);
                } else if (C18070vi.A18(A0v, "databases")) {
                    HashSet A12 = C17880vN.A12();
                    Iterator A0m = AnonymousClass8BX.A0m(this.A0D);
                    while (A0m.hasNext()) {
                        String A0v2 = C17880vN.A0v(A0m);
                        A12.add(A0v2);
                        Iterator it = AnonymousClass9TK.A00.iterator();
                        while (it.hasNext()) {
                            A12.add(C17900vP.A0A(A0v2, C17880vN.A0v(it)));
                        }
                    }
                    obj = A12;
                } else {
                    C21721ArX.A05(A0u);
                }
                Set set = (Set) obj;
                set.size();
                File[] listFiles = A0u.listFiles(new AnonymousClass7PR(set, 0));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.getName();
                        file.delete();
                    }
                }
            } else {
                A10.append("AccountSwitchingFileManager/deleteDefaultAccountDirectories/");
                A10.append(A0v);
                C17890vO.A19(A10, " does not exist");
            }
        }
    }

    public A8T(AnonymousClass1M2 r3, AnonymousClass11P r4, AnonymousClass118 r5, AnonymousClass1CO r6, C219317y r7, C17930vS r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r4, r5, r9, r6, r3);
        C18070vi.A0x(r10, r11, r8, r7, r12);
        C18070vi.A0r(r13, r14, r15);
        this.A0C = r4;
        this.A00 = r5;
        this.A07 = r9;
        this.A01 = r6;
        this.A0B = r3;
        this.A06 = r10;
        this.A04 = r11;
        this.A03 = r8;
        this.A02 = r7;
        this.A0D = r12;
        this.A0E = r13;
        this.A0F = r14;
        this.A05 = r15;
    }

    public static final void A00(A8T a8t, RandomAccessFile randomAccessFile, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/restoreAccountDataForLid/");
        C17890vO.A1A(A10, C60322np.A01(str));
        C18100vl r1 = a8t.A0A;
        if (AnonymousClass8BW.A1V(r1)) {
            File A0U = AnonymousClass8BX.A0U(str, r1);
            if (A0U.exists()) {
                String absolutePath = A0U.getAbsolutePath();
                C18070vi.A0X(absolutePath);
                a8t.A02(randomAccessFile, absolutePath, AnonymousClass3MW.A0y(a8t.A08));
                boolean delete = A0U.delete();
                StringBuilder A102 = AnonymousClass000.A10();
                C17900vP.A0N(A0U, "AccountSwitchingFileManager/restoreAccountDataForLid/cleaned up ", A102);
                C17900vP.A0n(": ", A102, delete);
                return;
            }
            AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/restoreAccountDataForLid/stagingDirLogString/", AnonymousClass000.A10());
            throw AnonymousClass8BY.A0R(str);
        }
        throw AnonymousClass000.A0n("Staging Directory don't exist");
    }

    public static final void A01(A8T a8t, RandomAccessFile randomAccessFile, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/stageAccountDataForLid/");
        C17890vO.A1A(A10, C60322np.A01(str));
        C18100vl r1 = a8t.A0A;
        if (AnonymousClass8BW.A1V(r1) || ((File) r1.getValue()).mkdirs()) {
            File A0U = AnonymousClass8BX.A0U(str, r1);
            if (A0U.exists() || A0U.mkdirs()) {
                String A0y = AnonymousClass3MW.A0y(a8t.A08);
                String absolutePath = A0U.getAbsolutePath();
                C18070vi.A0X(absolutePath);
                a8t.A02(randomAccessFile, A0y, absolutePath);
                return;
            }
            throw AnonymousClass000.A0n("Unable to create directory for current account");
        }
        throw AnonymousClass000.A0n("Unable to create staging directory");
    }

    public static final boolean A03(A8T a8t, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/copyDbFileFromStaging/");
        C17890vO.A1A(A10, C60322np.A01(str));
        C18100vl r1 = a8t.A0A;
        if (AnonymousClass8BW.A1V(r1)) {
            File A0U = AnonymousClass8BX.A0U(str, r1);
            if (A0U.exists()) {
                File A0u = AnonymousClass8BR.A0u(A0U.getAbsolutePath(), "databases");
                if (!A0u.exists()) {
                    AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyDbFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass8BV.A1K("AccountSwitchingFileManager/copyDbFileFromStaging/db dir for ", str, A102);
                    C17890vO.A1A(A102, " does not exist");
                    return false;
                }
                File A0u2 = AnonymousClass8BR.A0u(A0u.getAbsolutePath(), "account_switcher.db");
                if (!A0u2.exists()) {
                    StringBuilder A103 = AnonymousClass000.A10();
                    AnonymousClass8BV.A1K("AccountSwitchingFileManager/copyDbFileFromStaging/account_switcher.db file for ", str, A103);
                    C17890vO.A19(A103, " doesn't exist");
                    return false;
                }
                File A0u3 = AnonymousClass8BR.A0u(AnonymousClass3MW.A0y(a8t.A08), "databases");
                if (A0u3.exists() || A0u3.mkdirs()) {
                    File A0e = C17880vN.A0e(A0u3, "account_switcher.db");
                    C219317y r6 = a8t.A02;
                    C64062u9.A0P(r6, A0u2, A0e);
                    List list = AnonymousClass9TK.A00;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        File A17 = C108945cZ.A17(AnonymousClass001.A1H(A0u2.getPath(), A0v, AnonymousClass000.A10()));
                        if (A17.exists()) {
                            C64062u9.A0P(r6, A17, C17880vN.A0e(A0u3, C17900vP.A0A("account_switcher.db", A0v)));
                        }
                    }
                    A0u2.delete();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C108985cd.A1C(C108945cZ.A17(AnonymousClass001.A1H(A0u2.getPath(), C17880vN.A0v(it2), AnonymousClass000.A10())));
                    }
                    return true;
                }
                throw AnonymousClass000.A0n("Unable to create databases directory");
            }
            AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/copyDbFileFromStaging/stagingDirLogString/", AnonymousClass000.A10());
            throw AnonymousClass8BY.A0R(str);
        }
        throw AnonymousClass000.A0n("Staging directory does not exist");
    }

    public static final boolean A05(A8T a8t, String str, boolean z) {
        File file;
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BV.A1K("AccountSwitchingFileManager/moveLogsDirectory/lid: ", str, A10);
        C17900vP.A0n(" restoring: ", A10, z);
        C18100vl r1 = a8t.A0A;
        if (AnonymousClass8BW.A1V(r1)) {
            File A0U = AnonymousClass8BX.A0U(str, r1);
            if (A0U.exists()) {
                File A0u = AnonymousClass8BR.A0u(A0U.getAbsolutePath(), "files/Logs");
                String A0y = AnonymousClass3MW.A0y(a8t.A08);
                if (!z) {
                    file = AnonymousClass8BR.A0u(A0y, "files/Logs");
                } else {
                    file = A0u;
                    A0u = AnonymousClass8BR.A0u(A0y, "files/Logs");
                }
                if (!A0u.exists()) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("AccountSwitchingFileManager/moveLogsDirectory/");
                    A102.append(A0u);
                    C17890vO.A1B(A102, " directory not found");
                    return false;
                } else if (file.exists() || file.mkdirs()) {
                    if (!z && file.exists()) {
                        C21721ArX.A05(file);
                    }
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("AccountSwitchingFileManager/moveLogsDirectory/Moving Logs from ");
                    A103.append(A0u);
                    C17900vP.A0Y(file, " to ", A103);
                    Log.flush();
                    return A0u.renameTo(file);
                } else {
                    C17900vP.A0X(file, "AccountSwitchingFileManager/moveLogsDirectory/Unable to create ", AnonymousClass000.A10());
                    return false;
                }
            } else {
                AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/moveLogsDirectory/stagingDirLogString/", AnonymousClass000.A10());
                throw AnonymousClass8BY.A0R(str);
            }
        } else {
            throw AnonymousClass000.A0n("Staging Directory don't exist");
        }
    }

    public static final boolean A06(String str, String str2) {
        File A0u = AnonymousClass8BR.A0u(str, str2);
        if (A0u.exists()) {
            return C21721ArX.A05(A0u);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/deleteDirectoryInPath/");
        A10.append(str2);
        C17900vP.A0f(" doesn't exist in ", str, A10);
        return true;
    }

    public final C20460ALx A07(String str, String str2) {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BV.A1K("AccountSwitchingFileManager/migrate/migrateAccountLid=", str, A10);
        C17900vP.A0f(";migrateToDirId=", str2, A10);
        return new C20460ALx(this, str, str2, 0);
    }

    public final C20460ALx A08(String str, String str2) {
        StringBuilder A0K = C18070vi.A0K(str);
        AnonymousClass8BV.A1K("AccountSwitchingFileManager/switchAccount/active:", str, A0K);
        A0K.append("/inactive:");
        C17890vO.A1A(A0K, C60322np.A01(str2));
        return new C20460ALx(this, str2, str, 1);
    }

    public final AnonymousClass1E7 A09(C62562rb r10, Jid jid) {
        Cursor A0A2;
        File A0C2 = A0C(r10);
        if (A0C2 == null || !A0C2.exists()) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BW.A18(r10, "getContactFromInactiveAccount/account ", A10);
            C17890vO.A19(A10, " databases dir does not exist");
            AnonymousClass8BX.A16(this, "AccountSwitchingFileManager/getContactFromInactiveAccount/stagingDirLogString/", AnonymousClass000.A10());
            return null;
        }
        File A0u = AnonymousClass8BR.A0u(A0C2.getAbsolutePath(), "wa.db");
        AnonymousClass1M2 r8 = this.A0B;
        AnonymousClass1CO r2 = this.A01;
        AnonymousClass1CP r1 = (AnonymousClass1CP) this.A06.get();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(A0u.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
            try {
                C23141Ev A032 = AnonymousClass1Eu.A03(openDatabase, r1, r2, "wa.db");
                String str = C42631yU.A04;
                String[] A1Y = C17880vN.A1Y();
                C17880vN.A1J(jid, A1Y, 0);
                A0A2 = A032.A0A(str, "CONTACTS_FOR_INACTIVE_ACCOUNT", A1Y);
                AnonymousClass1E7 r12 = null;
                while (A0A2.moveToNext()) {
                    r12 = AnonymousClass1M2.A07(r8, C42651yW.A02(A0A2, r8.A00), r12);
                }
                A0A2.close();
                if (openDatabase != null) {
                    openDatabase.close();
                }
                r8.A07.A0I(r12);
                if (r12 == null || !(jid instanceof AnonymousClass1BI)) {
                    return r12;
                }
                r12.A0J = (AnonymousClass1BI) jid;
                return r12;
            } catch (Throwable th) {
                if (openDatabase != null) {
                    openDatabase.close();
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            AnonymousClass1M2.A0G(e, "ContactManagerDatabase/getContactByJidFromInactiveAccount/", 0, 0);
            return null;
        } catch (SQLiteException e2) {
            Log.e("ContactManagerDatabase/getContactByJidFromInactiveAccount/", e2);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    public final File A0B(C62562rb r4) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/getInactiveAccountAppDir/");
        C17890vO.A1A(A10, C49842Sd.A00(r4));
        if (C17880vN.A0J(this.A04).A0K()) {
            Log.i("AccountSwitchingFileManager/getInactiveAccountAppDir/isMigrated=true");
            C199710i A002 = ((C199210d) this.A0F.get()).A01.A00(r4.A05);
            File A022 = A002.A02();
            if (A022.exists()) {
                return A002.A02();
            }
            Log.e("AccountSwitchingFileManager/getInactiveAccountAppDir/migrated account app data dir does not exist");
            return A022;
        }
        Log.i("AccountSwitchingFileManager/getInactiveAccountAppDir/isMigrated=false");
        C18100vl r1 = this.A0A;
        if (AnonymousClass8BW.A1V(r1)) {
            return AnonymousClass8BR.A0u(((File) r1.getValue()).getAbsolutePath(), r4.A07);
        }
        Log.e("AccountSwitchingFileManager/getInactiveAccountAppDir/staging dir does not exist");
        return null;
    }

    public final File A0C(C62562rb r4) {
        StringBuilder A0K = C18070vi.A0K(r4);
        A0K.append("AccountSwitchingFileManager/getInactiveAccountDatabasesDir/");
        C17890vO.A1A(A0K, C49842Sd.A00(r4));
        File A0B2 = A0B(r4);
        if (A0B2 != null && A0B2.exists()) {
            return AnonymousClass8BR.A0u(A0B2.getAbsolutePath(), "databases");
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BW.A18(r4, "AccountSwitchingFileManager/getInactiveAccountDatabasesDir/account ", A10);
        C17890vO.A1A(A10, " dir does not exist");
        AnonymousClass8BX.A16(this, "AccountSwitchingFileManager/getInactiveAccountDatabasesDir/stagingDirLogString/", AnonymousClass000.A10());
        return null;
    }
}
