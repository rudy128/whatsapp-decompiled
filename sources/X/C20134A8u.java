package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A8u  reason: case insensitive filesystem */
public abstract class C20134A8u {
    public static final AnonymousClass00H A00 = C18150vq.A01(C21517AlQ.A00(10));

    public static int A00(AnonymousClass1NP r4, boolean z) {
        if (!z) {
            int A03 = r4.A03();
            if (A03 != 0) {
                int i = 1;
                if (A03 != 1) {
                    i = 2;
                    if (A03 != 2) {
                        i = 3;
                        if (A03 != 3) {
                            if (A03 != 4) {
                                return 0;
                            }
                        }
                    }
                }
                return i;
            }
            return 0;
        }
        return 4;
    }

    public static boolean A08(AnonymousClass1NP r7, C18030ve r8, long j, long j2, long j3) {
        if (j3 <= 86400000) {
            return true;
        }
        long j4 = j - j2;
        if (j4 < j3 - 86400000) {
            return false;
        }
        if (r7.A02() != 13) {
            return true;
        }
        long j5 = (j4 - j3) / 86400000;
        long A05 = AnonymousClass8BR.A05(r8, 4917);
        return j5 > 0 && A05 > 0 && j5 % A05 == 0;
    }

    public static boolean A09(C36801oU r9, File file, List list) {
        if (r9 == null || r9.A0F()) {
            LinkedList A14 = AnonymousClass8BR.A14();
            A14.add(file);
            while (A14.peek() != null) {
                Object poll = A14.poll();
                C17960vV.A07(poll);
                File file2 = (File) poll;
                if (!file2.exists()) {
                    C17890vO.A1B(AnonymousClass000.A11("gdrive-util/get-files-in-folder/does-not-exist "), file2.getAbsolutePath());
                } else if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            if (!file3.exists()) {
                                C17890vO.A1B(AnonymousClass000.A11("gdrive-util/get-files-in-folder/does-not-exist "), file3.getAbsolutePath());
                            } else if (file3.isDirectory()) {
                                A14.add(file3);
                            } else if (file3.length() > 0) {
                                list.add(file3);
                            }
                        }
                    }
                } else if (file2.length() > 0) {
                    list.add(file2);
                }
                list.size();
            }
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gdrive-util/get-files-in-folder/timeout ");
        C17890vO.A19(A10, file.getAbsolutePath());
        return false;
    }

    public static boolean A0A(C27431Wb r8, String str, List list, boolean z) {
        String str2;
        AnonymousClass9JN A002;
        byte[] bArr;
        AnonymousClass6QY A0C;
        C165178ai r0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File A0T = AnonymousClass8BS.A0T(it);
            if (A0T == null || !A0T.exists() || !z) {
                str2 = "gdrive-util/validate local msgstore does not exist or is unusable";
            } else if (A0T.length() == 0) {
                str2 = "gdrive-util/validate local msgstore exists but is empty.";
            } else {
                if (!(str == null || (A002 = AnonymousClass9QI.A00(A0T.getName())) == null)) {
                    try {
                        A5N A003 = ((C191639mv) r8.A0Y.get()).A00((C19947A0e) r8.A0X.get(), A002, A0T, false);
                        if (!(A003 instanceof C167298fn)) {
                            C167348fs r5 = (C167348fs) A003;
                            if (r5.A00 == null) {
                                try {
                                    A0C = r5.A0C();
                                    C192169nv A0B = r5.A0B(A0C, false);
                                    if (A0B != null) {
                                        if (A0B instanceof AnonymousClass8h4) {
                                            r0 = ((AnonymousClass8h4) A0B).A00;
                                        } else {
                                            if (A0B instanceof AnonymousClass8h3) {
                                                r0 = ((AnonymousClass8h3) A0B).A00;
                                            }
                                            A0C.close();
                                        }
                                        if (A8L.A04(r0, str)) {
                                            A0C.close();
                                        }
                                        A0C.close();
                                    } else {
                                        throw C17880vN.A0f("No prefix found");
                                    }
                                } catch (C18130vo e) {
                                    throw new IOException("failed to read prefix", e);
                                } catch (Throwable th) {
                                    AnonymousClass0DT.A00(th, th);
                                }
                            }
                            C199109zS A01 = C167348fs.A01(r5);
                            if (!(A01 == null || (bArr = A01.A01) == null)) {
                                String A004 = C199109zS.A00(bArr);
                                if (!str.endsWith(A004)) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                                    A10.append(A004);
                                    C17900vP.A0e("  actual-jid-user: ", str, A10);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("MessageStoreBackup/has-jid-mismatch/failed to read backup footer", e2);
                    }
                    if (!((C19947A0e) r8.A0X.get()).A01(A0T)) {
                        str2 = "gdrive-util/the backup is not supported.";
                    }
                }
                str2 = "gdrive-util/validate local msgstore exists but for a different jid.";
            }
            Log.i(str2);
            return false;
        }
        return true;
        throw th;
    }

    public static void A04(Context context, A7W a7w, AnonymousClass1NP r9, AnonymousClass1NT r10, C19830z4 r11, C18030ve r12) {
        C18030ve r4 = r12;
        if (C18020vd.A05(C18040vf.A02, r12, 11271)) {
            Log.i("gdrive-utils/starting manual backup with WorkManager");
            A05(a7w, r9, r10, r11, r4, 0, true);
            return;
        }
        Log.i("gdrive-utils/starting manual backup with fg-service");
        Intent A1M = AnonymousClass1LU.A1M(context, "action_backup");
        A1M.putExtra("backup_mode", "user_initiated");
        C25081Mu.A00(context, A1M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r1 != 4) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.A7W r7, X.AnonymousClass1NP r8, X.AnonymousClass1NT r9, X.C19830z4 r10, X.C18030ve r11, long r12, boolean r14) {
        /*
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            r3 = 1
            X.C18070vi.A0d(r8, r3)
            r5 = 4
            if (r14 != 0) goto L_0x00c3
            int r1 = r8.A03()
            if (r1 == 0) goto L_0x001d
            r4 = 671(0x29f, float:9.4E-43)
            if (r1 == r3) goto L_0x00c5
            r0 = 2
            r4 = 672(0x2a0, float:9.42E-43)
            if (r1 == r0) goto L_0x00c5
            r0 = 3
            if (r1 == r0) goto L_0x00c0
            if (r1 == r5) goto L_0x00c3
        L_0x001d:
            r6 = 0
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "google-backup-worker/createWorkRequest with delay: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", maxReties: "
            X.C17900vP.A0j(r0, r1, r6)
            X.9pH r5 = new X.9pH
            r5.<init>()
            java.lang.String r4 = "KEY_BACKUP_SCHEDULE"
            int r1 = A00(r8, r14)
            java.util.Map r0 = r5.A00
            X.C17880vN.A1P(r4, r0, r1)
            java.lang.String r1 = "KEY_MAX_NUMBER_OF_RETRIES"
            java.util.Map r0 = r5.A00
            X.C17880vN.A1P(r1, r0, r6)
            java.lang.String r4 = "KEY_BACKUP_NETWORK_SETTING"
            int r1 = r8.A04()
            java.util.Map r0 = r5.A00
            X.C17880vN.A1P(r4, r0, r1)
            X.A6Y r5 = r5.A00()
            java.util.LinkedHashSet r4 = X.C17880vN.A14()
            int r0 = r8.A04()
            if (r0 != 0) goto L_0x00bd
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
        L_0x0061:
            java.lang.Class<com.whatsapp.backup.google.workers.GoogleBackupWorker> r0 = com.whatsapp.backup.google.workers.GoogleBackupWorker.class
            X.8Jt r6 = new X.8Jt
            r6.<init>(r0)
            r6.A04(r5)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r6.A02(r12, r0)
            X.A6e r0 = X.A1B.A00(r1, r4)
            r6.A03(r0)
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            r0 = 901(0x385, float:1.263E-42)
            long r0 = X.AnonymousClass8BR.A05(r11, r0)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.A06(r5, r4, r0)
            X.9cO r1 = r6.A00()
            X.8Jv r1 = (X.C162248Jv) r1
            java.lang.String r0 = "com.whatsapp.backup.google.google-backup-worker"
            X.A7G r2 = r7.A03(r1, r2, r0)
            boolean r0 = r9.A04()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r10.A0f()
            int r0 = r10.A0M(r0)
            if (r0 != r3) goto L_0x00b4
            java.lang.String r0 = "gdrive-utils/startBackupWithWorkManager add media re-encryption worker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.backup.google.google-encrypted-re-upload-worker"
            r7.A0A(r0)
            r0 = 0
            X.8Jv r0 = com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A01(r8, r0)
            X.A7G r2 = r2.A03(r0)
        L_0x00b4:
            java.lang.String r0 = "gdrive-utils/startBackupWithWorkManager enqueue work"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A02()
            return
        L_0x00bd:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x0061
        L_0x00c0:
            r4 = 673(0x2a1, float:9.43E-43)
            goto L_0x00c5
        L_0x00c3:
            r4 = 11273(0x2c09, float:1.5797E-41)
        L_0x00c5:
            X.0vf r0 = X.C18040vf.A02
            int r6 = X.C18020vd.A00(r0, r11, r4)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134A8u.A05(X.A7W, X.1NP, X.1NT, X.0z4, X.0ve, long, boolean):void");
    }

    public static Dialog A01(Activity activity, DialogInterface.OnCancelListener onCancelListener, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gdrive-util/get-error-dialog creating dialog for ");
        C17890vO.A1A(A10, C41361wE.A02(i));
        C26332Cxp cxp = new C26332Cxp(activity, i, i2);
        C73203Rj A002 = AnonymousClass4a6.A00(activity);
        A002.A0T(false);
        A002.setNegativeButton(2131899432, new C20151A9n(onCancelListener, 18));
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            i3 = 2131890797;
            int i6 = 2131890795;
            if (z) {
                i6 = 2131890794;
            }
            i5 = 2131890796;
        } else if (i == 2) {
            i3 = 2131890805;
            int i7 = 2131890804;
            if (z) {
                i7 = 2131890803;
            }
            i5 = 2131890802;
        } else if (i != 3) {
            boolean z2 = GooglePlayServicesUtil.A00;
            if (i == 18) {
                i = 18;
            }
            return C41381wH.A00(activity, onCancelListener, new C23214BdQ(activity, C41381wH.A00.A03(activity, "d", i), i2), i);
        } else {
            i3 = 2131890801;
            i4 = 2131890799;
            if (z) {
                i4 = 2131890798;
            }
            i5 = 2131890800;
        }
        A002.A0E(i3);
        A002.A0D(i4);
        A002.setPositiveButton(i5, cxp);
        return A002.create();
    }

    public static ArrayList A02(C218617r r3) {
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(r3.A08().A01);
        A13.add(r3.A08().A00);
        A13.add(r3.A08().A0Q);
        A13.add(r3.A08().A07);
        A13.add(r3.A08().A0R);
        A13.add(r3.A08().A0J);
        File file = r3.A08().A0S;
        C218617r.A07(file, false);
        A13.add(file);
        File file2 = r3.A08().A03;
        C218617r.A07(file2, false);
        A13.add(file2);
        File file3 = r3.A08().A0P;
        C218617r.A07(file3, false);
        A13.add(file3);
        File file4 = r3.A08().A05;
        C218617r.A07(file4, false);
        A13.add(file4);
        File file5 = r3.A08().A06;
        C218617r.A07(file5, false);
        A13.add(file5);
        File file6 = r3.A08().A0T;
        C218617r.A07(file6, false);
        A13.add(file6);
        ArrayList A10 = C17880vN.A10(A13);
        File file7 = r3.A08().A0P;
        C218617r.A07(file7, false);
        A10.remove(file7);
        File file8 = r3.A08().A0T;
        C218617r.A07(file8, false);
        A10.remove(file8);
        return A10;
    }

    public static ThreadPoolExecutor A03(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gdrive-util/max concurrent reads ");
        C17900vP.A0o(A10, i);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, 1, TimeUnit.SECONDS, new C71333Ev(), new C21509AlI("Google Drive Read Worker #"));
        threadPoolExecutor.setRejectedExecutionHandler(new C21505AlE(0));
        return threadPoolExecutor;
    }

    public static boolean A06(AnonymousClass1NP r0) {
        return C17890vO.A1R(r0.A05());
    }

    public static boolean A07(AnonymousClass1NP r1) {
        return AnonymousClass000.A1T(r1.A05(), 2);
    }
}
