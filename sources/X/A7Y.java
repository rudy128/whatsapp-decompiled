package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

public class A7Y {
    public static final int A0E = 1000;
    public static final int A0F = 131072;
    public static final String A0G = "import/complete/all";
    public static final String A0H = "import/complete/enc_metadata";
    public static final String A0I = "import/complete/file_list";
    public static final String A0J = "import/complete/files";
    public static final String A0K = "import/metadata/data_id";
    public static final String A0L = "import/metadata/key";
    public static final String A0M = "import/metadata/key-jid";
    public static final String A0N = "import/metadata/key/account_hash";
    public static final String A0O = "import/metadata/key/proto_version";
    public static final String A0P = "import/metadata/key/server_salt";
    public static final String A0Q = "import/metadata/scheme";
    public static final String A0R = "import/metadata/source_id";
    public static final String A0S = "migration/prefetcher";
    public static final String A0T = "xpm/file-prefetcher";
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass118 A02;
    public final C196179ua A03;
    public final C192439oO A04;
    public final C195259t3 A05;
    public final C189459jH A06;
    public final A0A A07;
    public final C189469jI A08;
    public final C20048A4r A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C = C221618v.A00(C20029A3y.class);
    public final AtomicBoolean A0D = C108965cb.A0w();

    private OutputStream A00(OutputStream outputStream, String str, String str2) {
        if (str2 == null) {
            return outputStream;
        }
        String A002 = this.A05.A00(A0L);
        if (A002 != null) {
            byte[] decode = Base64.decode(A002, 2);
            byte[] decode2 = Base64.decode(str2, 2);
            try {
                Cipher A18 = AnonymousClass8BR.A18();
                A18.init(2, AnonymousClass8BS.A0v(decode), AnonymousClass8BR.A19(decode2));
                return new CipherOutputStream(outputStream, A18);
            } catch (GeneralSecurityException e) {
                throw new AnonymousClass9HZ(AnonymousClass001.A1H("Failed to decrypt: ", str, AnonymousClass000.A10()), e, 105);
            }
        } else {
            throw C17880vN.A0f("Cannot create decryption stream due to a missing key.");
        }
    }

    private void A01() {
        A0I("migration/messages_export.zip");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015a, code lost:
        if (r5 == null) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.os.CancellationSignal r24, byte[] r25) {
        /*
            r23 = this;
            r10 = r23
            X.9jH r0 = r10.A06
            X.9oO r0 = r0.A00
            X.1at r4 = r0.A00()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01a0 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01a0 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM prefetched_files"
            java.lang.String r0 = "XPM_FILE_PREFETCHER_FILE_COUNT"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x01a0 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "count"
            int r3 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0194 }
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r2.close()     // Catch:{ all -> 0x01a0 }
            r4.close()
            X.9jH r0 = r10.A06
            int r2 = r0.A00()
            int r4 = r3 - r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); pending="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", moved="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", total="
            X.C17900vP.A0j(r0, r1, r3)
            X.9ua r0 = r10.A03     // Catch:{ OperationCanceledException -> 0x0179 }
            X.AiC r16 = r0.A02()     // Catch:{ OperationCanceledException -> 0x0179 }
            X.9jH r0 = r10.A06     // Catch:{ all -> 0x016f }
            X.9oO r0 = r0.A00     // Catch:{ all -> 0x016f }
            X.1at r7 = r0.A00()     // Catch:{ all -> 0x016f }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0165 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "SELECT   file._id, file.remote_file_path, file.file_size, file.required,  enc.enc_iv FROM prefetched_files AS file LEFT JOIN encrypted_files AS enc ON file.remote_file_path =   enc.remote_file_path WHERE file.prefetched = 0 ORDER BY   file.required DESC , file._id ASC  LIMIT ?"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0165 }
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0165 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "XPM_FILE_PREFETCHER_PENDING"
            android.database.Cursor r5 = r6.A0A(r5, r0, r2)     // Catch:{ all -> 0x0165 }
            r7.close()     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "remote_file_path"
            int r9 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "enc_iv"
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "required"
            int r7 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0159 }
            X.00H r0 = r10.A0B     // Catch:{ all -> 0x0159 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0159 }
            X.2LP r1 = (X.AnonymousClass2LP) r1     // Catch:{ all -> 0x0159 }
            r6 = 1
            X.AWf r0 = new X.AWf     // Catch:{ all -> 0x0159 }
            r0.<init>(r4, r3, r6)     // Catch:{ all -> 0x0159 }
            r1.notifyAllObservers(r0)     // Catch:{ all -> 0x0159 }
            r15 = 0
        L_0x009b:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x0152
            r2 = r24
            r2.throwIfCanceled()     // Catch:{ all -> 0x0159 }
            java.lang.String r12 = r5.getString(r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r5.getString(r8)     // Catch:{ all -> 0x0159 }
            int r0 = r5.getInt(r7)     // Catch:{ all -> 0x0159 }
            boolean r14 = X.AnonymousClass000.A1O(r0)
            r0 = r25
            r10.A0H(r2, r12, r1, r0)     // Catch:{ OperationCanceledException -> 0x0150, all -> 0x00cb }
            int r4 = r4 + 1
            X.00H r0 = r10.A0C     // Catch:{ OperationCanceledException -> 0x0150, all -> 0x00cb }
            java.lang.Object r1 = r0.get()     // Catch:{ OperationCanceledException -> 0x0150, all -> 0x00cb }
            X.A3y r1 = (X.C20029A3y) r1     // Catch:{ OperationCanceledException -> 0x0150, all -> 0x00cb }
            java.lang.String r0 = "prefetched/file/success"
            X.C20029A3y.A01(r1, r0)     // Catch:{ OperationCanceledException -> 0x0150, all -> 0x00cb }
            goto L_0x0128
        L_0x00cb:
            r11 = move-exception
            int r15 = r15 + 1
            X.00H r0 = r10.A0C     // Catch:{ all -> 0x0159 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0159 }
            X.A3y r1 = (X.C20029A3y) r1     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "prefetched/file/failed"
            X.C20029A3y.A01(r1, r0)     // Catch:{ all -> 0x0159 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); failed to import file "
            X.C17900vP.A0h(r0, r12, r1, r11)     // Catch:{ all -> 0x0159 }
            X.190 r13 = r10.A00     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = "xpm-file-prefetcher-import-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass001.A1E(r11, r0, r1)     // Catch:{ all -> 0x014e }
            r13.A0E(r2, r0, r11)     // Catch:{ all -> 0x014e }
            A03(r12, r11)     // Catch:{ all -> 0x014e }
            if (r14 != 0) goto L_0x0146
            X.9jH r0 = r10.A06     // Catch:{ all -> 0x014e }
            X.9oO r0 = r0.A00     // Catch:{ all -> 0x014e }
            X.1au r13 = r0.A01()     // Catch:{ all -> 0x014e }
            android.content.ContentValues r11 = X.C17880vN.A08()     // Catch:{ all -> 0x013c }
            java.lang.String r1 = "prefetched"
            r0 = -1
            X.C17880vN.A18(r11, r1, r0)     // Catch:{ all -> 0x013c }
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x013c }
            java.lang.String r19 = "prefetched_files"
            java.lang.String r20 = "remote_file_path = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x013c }
            r0 = 0
            r1[r0] = r12     // Catch:{ all -> 0x013c }
            java.lang.String r21 = "XPM_FILE_PREFETCHER_MARK_FILE_FAILED"
            r17 = r2
            r18 = r11
            r22 = r1
            r17.A02(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x013c }
            r13.close()     // Catch:{ all -> 0x014e }
        L_0x0128:
            X.00H r0 = r10.A0B     // Catch:{ all -> 0x0159 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x0159 }
            X.2LP r2 = (X.AnonymousClass2LP) r2     // Catch:{ all -> 0x0159 }
            int r1 = r15 + r4
            X.AWf r0 = new X.AWf     // Catch:{ all -> 0x0159 }
            r0.<init>(r1, r3, r6)     // Catch:{ all -> 0x0159 }
            r2.notifyAllObservers(r0)     // Catch:{ all -> 0x0159 }
            goto L_0x009b
        L_0x013c:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x014e }
        L_0x0145:
            throw r1     // Catch:{ all -> 0x014e }
        L_0x0146:
            r1 = 200(0xc8, float:2.8E-43)
            X.9HZ r0 = new X.9HZ     // Catch:{ all -> 0x014e }
            r0.<init>((int) r1, (java.lang.Throwable) r11)     // Catch:{ all -> 0x014e }
            throw r0     // Catch:{ all -> 0x014e }
        L_0x014e:
            r1 = move-exception
            goto L_0x015c
        L_0x0150:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0159 }
        L_0x0152:
            r5.close()     // Catch:{ all -> 0x016f }
            r16.close()     // Catch:{ OperationCanceledException -> 0x0179 }
            return
        L_0x0159:
            r1 = move-exception
            if (r5 == 0) goto L_0x016e
        L_0x015c:
            r5.close()     // Catch:{ all -> 0x0160 }
            goto L_0x016e
        L_0x0160:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x016f }
            goto L_0x016e
        L_0x0165:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x016f }
        L_0x016e:
            throw r1     // Catch:{ all -> 0x016f }
        L_0x016f:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0174:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ OperationCanceledException -> 0x0179 }
        L_0x0178:
            throw r1     // Catch:{ OperationCanceledException -> 0x0179 }
        L_0x0179:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); cancelled after "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has been imported."
            X.C17890vO.A1A(r1, r0)
            throw r2
        L_0x0194:
            r1 = move-exception
            if (r2 == 0) goto L_0x019f
            r2.close()     // Catch:{ all -> 0x019b }
            goto L_0x019f
        L_0x019b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01a0 }
        L_0x019f:
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01a5 }
            throw r1
        L_0x01a5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7Y.A02(android.os.CancellationSignal, byte[]):void");
    }

    public File A04() {
        return C17880vN.A0e(AnonymousClass8BR.A0t(this.A02), A0S);
    }

    public File A06(String str) {
        Cursor A0A2;
        FileNotFoundException fileNotFoundException;
        C189459jH r0 = this.A06;
        C17960vV.A07(str);
        C28781at A002 = r0.A00.A00();
        try {
            boolean z = true;
            A0A2 = ((C28801av) A002).A02.A0A("SELECT prefetched_file_path, prefetched FROM prefetched_files WHERE remote_file_path = ?", "XPM_FILE_PREFETCHER_GET_PREFETCHED_PATH", new String[]{str});
            if (!A0A2.moveToFirst()) {
                fileNotFoundException = new FileNotFoundException(AnonymousClass001.A1H("Unknown remote file: ", str, AnonymousClass000.A10()));
            } else if (A0A2.getCount() <= 1) {
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("prefetched");
                int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("prefetched_file_path");
                long j = A0A2.getLong(columnIndexOrThrow);
                boolean A1P = AnonymousClass000.A1P((j > -1 ? 1 : (j == -1 ? 0 : -1)));
                if (j != 1) {
                    z = false;
                }
                String string = A0A2.getString(columnIndexOrThrow2);
                if (!z || TextUtils.isEmpty(string)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("File was not prefetched: ");
                    A10.append(str);
                    fileNotFoundException = new FileNotFoundException(C17900vP.A0D(", prefetch failed: ", A10, A1P));
                } else {
                    File A17 = C108945cZ.A17(string);
                    A0A2.close();
                    A002.close();
                    if (A17.exists()) {
                        return A17;
                    }
                    throw new FileNotFoundException(AnonymousClass001.A1H("Not found in file prefetcher sandbox: ", str, AnonymousClass000.A10()));
                }
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Multiple prefetched files match: ");
                fileNotFoundException = new FileNotFoundException(C17880vN.A0t(A102, A0A2.getCount()));
            }
            throw fileNotFoundException;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07() {
        this.A05.A02(A0G);
    }

    public void A08() {
        this.A0D.get();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A09() {
        /*
            r6 = this;
            X.9t3 r5 = r6.A05
            monitor-enter(r5)
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x0053 }
            X.9jH r0 = r5.A01     // Catch:{ all -> 0x0053 }
            X.9oO r0 = r0.A00     // Catch:{ all -> 0x0053 }
            X.1au r4 = r0.A01()     // Catch:{ all -> 0x0053 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0049 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "properties"
            java.lang.String r0 = "XPM_DELETE_ALL_PROPERTIES"
            r1 = 0
            r3.A04(r2, r1, r0, r1)     // Catch:{ all -> 0x0049 }
            r4.close()     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            X.9oO r2 = r6.A04
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            X.8ou r0 = r2.A00     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ all -> 0x0043 }
            r2.A00 = r1     // Catch:{ all -> 0x0043 }
        L_0x002c:
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            android.content.Context r1 = r2.A01     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "migration_prefetcher.db"
            r1.deleteDatabase(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "FilePrefetcher/removeDatabase/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            java.io.File r1 = r6.A04()
            r0 = 0
            X.C64062u9.A0K(r1, r0)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0049:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0053 }
        L_0x0052:
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7Y.A09():void");
    }

    public void A0A(CancellationSignal cancellationSignal) {
        String str;
        Log.i("xpm/file-prefetcher/importEncryptionKey(); ");
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A01);
        if (A002 != null) {
            String rawString = A002.getRawString();
            String A003 = this.A05.A00(A0M);
            if (!rawString.equals(A003)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("xpm/file-prefetcher/importEncryptionKey(); key was cached for a different jid, removing (old jid: ");
                A10.append(A003);
                C17890vO.A1A(A10, ") ");
                ((AnonymousClass9j8) this.A07.A03.get()).A00.clear();
                this.A05.A01(A0M, (String) null);
                this.A05.A01(A0L, (String) null);
            }
            if (this.A05.A00(A0L) != null) {
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key has already been fetched from the server, skipping.";
            } else {
                String A004 = this.A05.A00(A0O);
                String A005 = this.A05.A00(A0N);
                String A006 = this.A05.A00(A0P);
                if (A004 == null || A005 == null || A006 == null) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    C17900vP.A0c("Missing key identifier: version=", A004, ", account_hash=", A005, A102);
                    throw new AnonymousClass9HY(AnonymousClass001.A1H(", server_salt=", A006, A102));
                }
                StringBuilder A103 = AnonymousClass000.A10();
                C17900vP.A0c("xpm/file-prefetcher/importEncryptionKey(); key, version=", A004, ", account_hash=", A005, A103);
                C17900vP.A0f(", server_salt=", A006, A103);
                C187719gG A012 = this.A07.A01(cancellationSignal, A004, A005, A006);
                this.A05.A01(A0L, A012.A03);
                this.A05.A01(A0M, A012.A01.getRawString());
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key imported successfully";
            }
            Log.i(str);
            return;
        }
        throw new AnonymousClass9HZ(301, "Cannot identify current logged in user.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        if (this.A05.A02(A0J)) {
            Log.i("xpm/file-prefetcher/importAllFiles(); file were already imported, skipping.");
            return;
        }
        byte[] bArr = new byte[A0F];
        while (this.A06.A00() > 0) {
            cancellationSignal.throwIfCanceled();
            A02(cancellationSignal, bArr);
        }
        this.A05.A01(A0J, Boolean.toString(true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011e, code lost:
        r10.beginArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        if (r10.hasNext() == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0127, code lost:
        X.C17960vV.A07(r9);
        r10.beginObject();
        r3 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0133, code lost:
        if (r10.hasNext() == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        r1 = r10.nextName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013f, code lost:
        if (r1.equals("iv") != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r1.equals("path") != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r10.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014d, code lost:
        r3 = r10.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0152, code lost:
        r2 = r10.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0157, code lost:
        r10.endObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015a, code lost:
        if (r3 != null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015c, code lost:
        com.whatsapp.util.Log.e("EncFileInfo/fromJson; file path is null, skipping...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0162, code lost:
        if (r2 != null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
        com.whatsapp.util.Log.e("EncFileInfo/fromJson; file IV is null, skipping...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016a, code lost:
        r3 = new X.C190109kO(r9.A02(r3), r2);
        r16.throwIfCanceled();
        r2 = r15.A06;
        r8 = X.C17880vN.A08();
        r8.put("remote_file_path", r3.A01);
        r8.put("enc_iv", r3.A00);
        r3 = r2.A00.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        ((X.C28801av) r3).A02.A05("encrypted_files", "XPM_FILE_PREFETCHER_INSERT_ENC_INFO", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r3.close();
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(android.os.CancellationSignal r16) {
        /*
            r15 = this;
            java.lang.String r5 = "migration/enc.zip"
            java.lang.String r7 = "import/complete/enc_metadata"
            java.lang.String r0 = "xpm/file-prefetcher/importEncryptionMetadata(); "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11S r0 = r15.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            if (r0 == 0) goto L_0x024e
            java.lang.String r2 = X.C199379zt.A00(r0)
            X.9ua r0 = r15.A03
            X.AiC r14 = r0.A02()
            X.9jH r0 = r15.A06     // Catch:{ all -> 0x0244 }
            X.9oO r0 = r0.A00     // Catch:{ all -> 0x0244 }
            X.1au r13 = r0.A01()     // Catch:{ all -> 0x0244 }
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x023a }
            X.9t3 r0 = r15.A05     // Catch:{ all -> 0x0230 }
            r6 = 0
            boolean r0 = r0.A02(r7)     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "xpm/file-prefetcher/importEncryptionMetadata(); encryption metadata is already imported, skipping."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0230 }
            r12.close()     // Catch:{ all -> 0x023a }
            r13.close()     // Catch:{ all -> 0x0244 }
            r14.close()
            return
        L_0x003f:
            boolean r0 = r15.A0J()     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0226
            X.9ua r0 = r15.A03     // Catch:{ all -> 0x0230 }
            android.os.ParcelFileDescriptor r9 = r0.A00(r5)     // Catch:{ all -> 0x0230 }
            java.io.FileDescriptor r0 = r9.getFileDescriptor()     // Catch:{ all -> 0x021a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x021a }
            r3.<init>(r0)     // Catch:{ all -> 0x021a }
            X.9jI r0 = r15.A08     // Catch:{ all -> 0x0210 }
            X.9zt r8 = r0.A00(r3)     // Catch:{ all -> 0x0210 }
            java.lang.String r4 = r8.A03     // Catch:{ all -> 0x0210 }
            if (r4 == 0) goto L_0x007e
            boolean r0 = r4.equals(r2)     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x007e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "Source id mismatch: current="
            r1.append(r0)     // Catch:{ all -> 0x0210 }
            r1.append(r4)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = ", expected="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0210 }
            r0 = 106(0x6a, float:1.49E-43)
            X.9HZ r2 = new X.9HZ     // Catch:{ all -> 0x0210 }
            r2.<init>((int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0210 }
        L_0x007d:
            throw r2     // Catch:{ all -> 0x0210 }
        L_0x007e:
            java.lang.String r2 = r8.A02     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "AES-GCM-v1"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x00bd
            X.9t3 r1 = r15.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "import/metadata/scheme"
            r1.A01(r0, r2)     // Catch:{ all -> 0x0210 }
            X.9t3 r2 = r15.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "import/metadata/data_id"
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0210 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x0210 }
            X.9t3 r1 = r15.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "import/metadata/source_id"
            r1.A01(r0, r4)     // Catch:{ all -> 0x0210 }
            X.9t3 r2 = r15.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "import/metadata/key/proto_version"
            X.9lG r4 = r8.A00     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = r4.A02     // Catch:{ all -> 0x0210 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x0210 }
            X.9t3 r2 = r15.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "import/metadata/key/account_hash"
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0210 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x0210 }
            X.9t3 r2 = r15.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "import/metadata/key/server_salt"
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x0210 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x0210 }
            goto L_0x00cf
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "Unsupported: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0210 }
            r0 = 100
            X.9HZ r2 = new X.9HZ     // Catch:{ all -> 0x0210 }
            r2.<init>((int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0210 }
            goto L_0x007d
        L_0x00cf:
            r3.close()     // Catch:{ all -> 0x021a }
            r9.close()     // Catch:{ all -> 0x0230 }
            X.9ua r0 = r15.A03     // Catch:{ all -> 0x0230 }
            android.os.ParcelFileDescriptor r11 = r0.A00(r5)     // Catch:{ all -> 0x0230 }
            java.io.FileDescriptor r0 = r11.getFileDescriptor()     // Catch:{ all -> 0x0209 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0209 }
            r4.<init>(r0)     // Catch:{ all -> 0x0209 }
            X.9jI r2 = r15.A08     // Catch:{ all -> 0x01ff }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x01ff }
            r5.<init>(r4)     // Catch:{ all -> 0x01ff }
        L_0x00eb:
            java.util.zip.ZipEntry r0 = r5.getNextEntry()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x01f2
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "metadata.json"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x00eb
            android.util.JsonReader r10 = X.C108985cd.A0E(r5)     // Catch:{ all -> 0x01fa }
            X.A4r r9 = r2.A00     // Catch:{ all -> 0x01fa }
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x01e5 }
            X.C17960vV.A07(r9)     // Catch:{ all -> 0x01e5 }
            r10.beginObject()     // Catch:{ all -> 0x01e5 }
        L_0x010c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01b1
            java.lang.String r1 = r10.nextName()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "files"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01a2
            r10.beginArray()     // Catch:{ all -> 0x01e5 }
        L_0x0121:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01b1
            X.C17960vV.A07(r9)     // Catch:{ all -> 0x01e5 }
            r10.beginObject()     // Catch:{ all -> 0x01e5 }
            r3 = 0
            r2 = r3
        L_0x012f:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x0157
            java.lang.String r1 = r10.nextName()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "iv"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x014d
            r10.skipValue()     // Catch:{ all -> 0x01e5 }
            goto L_0x012f
        L_0x014d:
            java.lang.String r3 = r10.nextString()     // Catch:{ all -> 0x01e5 }
            goto L_0x012f
        L_0x0152:
            java.lang.String r2 = r10.nextString()     // Catch:{ all -> 0x01e5 }
            goto L_0x012f
        L_0x0157:
            r10.endObject()     // Catch:{ all -> 0x01e5 }
            if (r3 != 0) goto L_0x0162
            java.lang.String r0 = "EncFileInfo/fromJson; file path is null, skipping..."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x0121
        L_0x0162:
            if (r2 != 0) goto L_0x016a
            java.lang.String r0 = "EncFileInfo/fromJson; file IV is null, skipping..."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x0121
        L_0x016a:
            java.lang.String r0 = r9.A02(r3)     // Catch:{ all -> 0x01e5 }
            X.9kO r3 = new X.9kO     // Catch:{ all -> 0x01e5 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x01e5 }
            r16.throwIfCanceled()     // Catch:{ all -> 0x01e5 }
            X.9jH r2 = r15.A06     // Catch:{ all -> 0x01e5 }
            android.content.ContentValues r8 = X.C17880vN.A08()     // Catch:{ all -> 0x01e5 }
            java.lang.String r1 = "remote_file_path"
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x01e5 }
            r8.put(r1, r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r1 = "enc_iv"
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x01e5 }
            r8.put(r1, r0)     // Catch:{ all -> 0x01e5 }
            X.9oO r0 = r2.A00     // Catch:{ all -> 0x01e5 }
            X.1au r3 = r0.A01()     // Catch:{ all -> 0x01e5 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01a7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01a7 }
            java.lang.String r1 = "encrypted_files"
            java.lang.String r0 = "XPM_FILE_PREFETCHER_INSERT_ENC_INFO"
            r2.A05(r1, r0, r8)     // Catch:{ all -> 0x01a7 }
            r3.close()     // Catch:{ all -> 0x01e5 }
            int r6 = r6 + 1
            goto L_0x0121
        L_0x01a2:
            r10.skipValue()     // Catch:{ all -> 0x01e5 }
            goto L_0x010c
        L_0x01a7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01ac }
            goto L_0x01b0
        L_0x01ac:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01e5 }
        L_0x01b0:
            throw r1     // Catch:{ all -> 0x01e5 }
        L_0x01b1:
            r10.close()     // Catch:{ all -> 0x01ff }
            r5.close()     // Catch:{ all -> 0x01ff }
            r4.close()     // Catch:{ all -> 0x0209 }
            r11.close()     // Catch:{ all -> 0x0230 }
            X.9t3 r1 = r15.A05     // Catch:{ all -> 0x0230 }
            r0 = 1
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x0230 }
            r1.A01(r7, r0)     // Catch:{ all -> 0x0230 }
            r12.A00()     // Catch:{ all -> 0x0230 }
            r12.close()     // Catch:{ all -> 0x023a }
            r13.close()     // Catch:{ all -> 0x0244 }
            r14.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "xpm/file-prefetcher/importEncryptionMetadata(); imported "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " encrypted file metadata entries."
            X.C17890vO.A1A(r1, r0)
            return
        L_0x01e5:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01ed }
            r5.close()     // Catch:{ all -> 0x01ed }
            goto L_0x01f1
        L_0x01ed:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01ff }
        L_0x01f1:
            throw r1     // Catch:{ all -> 0x01ff }
        L_0x01f2:
            java.lang.String r1 = "metadata.json was not found in zip file."
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x01fa }
            r0.<init>(r1)     // Catch:{ all -> 0x01fa }
            throw r0     // Catch:{ all -> 0x01fa }
        L_0x01fa:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x01ff }
            throw r0     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0204 }
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0209 }
        L_0x0208:
            throw r1     // Catch:{ all -> 0x0209 }
        L_0x0209:
            r2 = move-exception
            if (r11 == 0) goto L_0x022f
            r11.close()     // Catch:{ all -> 0x0221 }
            goto L_0x022f
        L_0x0210:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0215 }
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x021a }
        L_0x0219:
            throw r1     // Catch:{ all -> 0x021a }
        L_0x021a:
            r2 = move-exception
            if (r9 == 0) goto L_0x022f
            r9.close()     // Catch:{ all -> 0x0221 }
            goto L_0x022f
        L_0x0221:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0230 }
            goto L_0x022f
        L_0x0226:
            java.lang.String r1 = "Missing encryption metadata: migration/enc.zip"
            r0 = 200(0xc8, float:2.8E-43)
            X.9HZ r2 = new X.9HZ     // Catch:{ all -> 0x0230 }
            r2.<init>((int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0230 }
        L_0x022f:
            throw r2     // Catch:{ all -> 0x0230 }
        L_0x0230:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0235 }
            goto L_0x0239
        L_0x0235:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x023a }
        L_0x0239:
            throw r1     // Catch:{ all -> 0x023a }
        L_0x023a:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x023f }
            goto L_0x0243
        L_0x023f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0244 }
        L_0x0243:
            throw r1     // Catch:{ all -> 0x0244 }
        L_0x0244:
            r2 = move-exception
            r14.close()     // Catch:{ all -> 0x0249 }
            throw r2
        L_0x0249:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)
            throw r2
        L_0x024e:
            r1 = 301(0x12d, float:4.22E-43)
            java.lang.String r0 = "Cannot identify current logged in user."
            X.9HZ r2 = new X.9HZ
            r2.<init>((int) r1, (java.lang.String) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7Y.A0C(android.os.CancellationSignal):void");
    }

    public void A0D(CancellationSignal cancellationSignal) {
        AnonymousClass9A0 A012;
        Throwable th;
        Object obj;
        Log.i("xpm/file-prefetcher/importFileList(); ");
        C28791au A013 = this.A06.A00.A01();
        try {
            C41851xA BD0 = A013.BD0();
            try {
                if (this.A05.A02(A0I)) {
                    Log.i("xpm/file-prefetcher/importFileList(); file list was already imported, skipping.");
                    BD0.close();
                    A013.close();
                    return;
                }
                C196179ua r4 = this.A03;
                try {
                    A012 = r4.A01();
                    ParcelFileDescriptor BRf = ((IAppDataReaderService) A012.A00()).BRf();
                    C173618vN r42 = new C173618vN(BRf, new JsonReader(new BufferedReader(new FileReader(BRf.getFileDescriptor()))), (C20048A4r) r4.A05.A00.A00.A6r.get());
                    A012.close();
                    int i = 0;
                    while (r42.A01()) {
                        try {
                            cancellationSignal.throwIfCanceled();
                            if (r42.A01) {
                                th = C17880vN.A0f("Closed.");
                            } else if (!r42.A01() || (obj = r42.A00) == null) {
                                th = new NoSuchElementException();
                            } else {
                                r42.A00 = null;
                                C193889qp r1 = (C193889qp) obj;
                                C189459jH r2 = this.A06;
                                ContentValues A082 = C17880vN.A08();
                                String str = r1.A01;
                                A082.put("remote_file_path", str);
                                A082.put("file_size", Long.valueOf(r1.A00));
                                A082.putNull("prefetched_file_path");
                                A082.put("required", 0);
                                A082.put("prefetched", 0);
                                C28791au A014 = r2.A00.A01();
                                try {
                                    long A052 = ((C28801av) A014).A02.A05("prefetched_files", "XPM_FILE_PREFETCHER_INSERT_FILE", A082);
                                    A014.close();
                                    if (A052 < 0) {
                                        C17900vP.A0e("xpm/file-prefetcher/importFileList(); failed to import metadata for ", str, AnonymousClass000.A10());
                                        this.A00.A0G("xpm-file-prefetcher-cannot-add-metadata", str, false);
                                    } else {
                                        i++;
                                    }
                                } catch (Throwable th2) {
                                    AnonymousClass0DT.A00(th, th2);
                                }
                            }
                            throw th;
                        } catch (Throwable th3) {
                            r42.close();
                            throw th3;
                        }
                    }
                    r42.close();
                    this.A05.A01(A0I, Boolean.toString(true));
                    BD0.A00();
                    BD0.close();
                    A013.close();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("xpm/file-prefetcher/importFileList(); imported ");
                    A10.append(i);
                    C17890vO.A1A(A10, " entries.");
                    return;
                } catch (Exception e) {
                    throw new IOException(e);
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th, th4);
                }
                throw th;
            } catch (Throwable th5) {
                BD0.close();
                throw th5;
            }
        } catch (Throwable th6) {
            try {
                A013.close();
                throw th6;
            } catch (Throwable th7) {
                AnonymousClass0DT.A00(th6, th7);
                throw th6;
            }
        }
    }

    public void A0E(CancellationSignal cancellationSignal) {
        if (!this.A0D.getAndSet(true)) {
            try {
                A0F(cancellationSignal);
            } finally {
                this.A0D.set(false);
            }
        } else {
            Log.e("xpm/file-prefetcher/prefetchAllFiles()concurrent prefetch requested, not supported");
            throw AnonymousClass000.A0n("Multiple concurrent operations are not supported.");
        }
    }

    public void A0F(CancellationSignal cancellationSignal) {
        C21327AiC A022;
        Log.i("xpm/file-prefetcher/prefetchAllFilesLocked()");
        if (this.A05.A02(A0G)) {
            Log.i("xpm/file-prefetcher/prefetchAllFilesLocked() already marked as completed, nothing to do.");
            return;
        }
        try {
            A022 = this.A03.A02();
            if (A0J()) {
                A0C(cancellationSignal);
                A0A(cancellationSignal);
            }
            A0D(cancellationSignal);
            A01();
            A0B(cancellationSignal);
            this.A05.A01(A0G, Boolean.toString(true));
            A022.close();
            return;
        } catch (OperationCanceledException e) {
            Log.w("xpm/file-prefetcher/prefetchAllFilesLocked()cancelled");
            throw e;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public void A0I(String str) {
        C28791au A012 = this.A06.A00.A01();
        try {
            ContentValues A082 = C17880vN.A08();
            C17880vN.A18(A082, "required", 1);
            int A022 = ((C28801av) A012).A02.A02(A082, "prefetched_files", "remote_file_path = ?", "XPM_FILE_PREFETCHER_MARK_FILE_REQUIRED", new String[]{str});
            A012.close();
            if (A022 <= 0) {
                throw new AnonymousClass9HZ(200, AnonymousClass000.A0y(" is not present in remote sandbox.", AnonymousClass000.A11(str)));
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public boolean A0J() {
        try {
            ParcelFileDescriptor A002 = this.A03.A00("migration/enc.zip");
            if (A002 == null) {
                return true;
            }
            A002.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public A7Y(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass118 r4, A0A a0a, C189469jI r6, C20048A4r a4r, AnonymousClass00H r8, C189459jH r9, C196179ua r10, AnonymousClass00H r11, C192439oO r12, C195259t3 r13) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = a0a;
        this.A08 = r6;
        this.A0A = r8;
        this.A09 = a4r;
        this.A03 = r10;
        this.A06 = r9;
        this.A0B = r11;
        this.A04 = r12;
        this.A05 = r13;
    }

    public static void A03(String str, Throwable th) {
        Throwable cause = th.getCause();
        if (cause instanceof AEADBadTagException) {
            throw new AnonymousClass9HZ(AnonymousClass001.A1H("Failed to decrypt: ", str, AnonymousClass000.A10()), cause, 104);
        }
    }

    public File A05(String str) {
        File canonicalFile = A04().getCanonicalFile();
        File canonicalFile2 = C17880vN.A0e(canonicalFile, str).getCanonicalFile();
        for (File parentFile = canonicalFile2.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            if (canonicalFile.equals(parentFile)) {
                return canonicalFile2;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Remote path '");
        A10.append(str);
        A10.append("' escaped prefetch sandbox: '");
        A10.append(canonicalFile2);
        throw new SecurityException(AnonymousClass000.A0y("'", A10));
    }

    public void A0G(CancellationSignal cancellationSignal, File file, String str, byte[] bArr) {
        this.A09.A03(cancellationSignal, A06(str), file, bArr);
    }

    public void A0H(CancellationSignal cancellationSignal, String str, String str2, byte[] bArr) {
        OutputStream A002;
        Parcel obtain;
        Parcel obtain2;
        File A052 = A05(str);
        File parentFile = A052.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            ParcelFileDescriptor A003 = this.A03.A00(str);
            try {
                FileInputStream fileInputStream = new FileInputStream(A003.getFileDescriptor());
                try {
                    FileOutputStream A19 = C108945cZ.A19(A052);
                    try {
                        A002 = A00(A19, str, str2);
                        C20048A4r.A01(cancellationSignal, fileInputStream, A002, bArr);
                        if (A002 != null) {
                            A002.close();
                        }
                        A19.close();
                        fileInputStream.close();
                        A003.close();
                        C189459jH r0 = this.A06;
                        String canonicalPath = A052.getCanonicalPath();
                        C28791au A012 = r0.A00.A01();
                        try {
                            ContentValues A082 = C17880vN.A08();
                            C17880vN.A18(A082, "prefetched", 1);
                            A082.put("prefetched_file_path", canonicalPath);
                            ((C28801av) A012).A02.A02(A082, "prefetched_files", "remote_file_path = ?", "XPM_FILE_PREFETCHER_MARK_FILE_PREFETCHED", new String[]{str});
                            A012.close();
                            if (!str.equals("migration/metadata.json")) {
                                try {
                                    AnonymousClass9A0 A013 = this.A03.A01();
                                    try {
                                        AJ1 aj1 = (AJ1) ((IAppDataReaderService) A013.A00());
                                        obtain = Parcel.obtain();
                                        obtain2 = Parcel.obtain();
                                        obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                                        obtain.writeString(str);
                                        AnonymousClass000.A18(aj1.A00, obtain, obtain2, 3);
                                        obtain2.recycle();
                                        obtain.recycle();
                                        A013.close();
                                        return;
                                    } catch (Throwable th) {
                                        A013.close();
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    throw new IOException(str, e);
                                } catch (Throwable th2) {
                                    AnonymousClass0DT.A00(th, th2);
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th3) {
                            AnonymousClass0DT.A00(th, th3);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        A19.close();
                        throw th4;
                    }
                    throw th;
                } catch (Throwable th5) {
                    fileInputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (A003 != null) {
                    A003.close();
                }
                throw th6;
            }
        } catch (OperationCanceledException e2) {
            A052.delete();
            C17900vP.A0f("xpm/file-prefetcher/importFile(); cancelled while importing ", str, AnonymousClass000.A10());
            throw e2;
        } catch (Throwable th7) {
            AnonymousClass0DT.A00(th6, th7);
        }
    }
}
