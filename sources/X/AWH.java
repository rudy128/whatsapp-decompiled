package X;

import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public class AWH implements C22514BAx {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public boolean A03;
    public final CancellationSignal A04;
    public final AnonymousClass190 A05;
    public final C18030ve A06;
    public final C196129uV A07;
    public final C192059nj A08;
    public final C196139uW A09;
    public final AMY A0A;
    public final A7P A0B;
    public final InputStream A0C;
    public final OutputStream A0D;
    public final AnonymousClass11P A0E;
    public final C24521Kq A0F;
    public final C175248yO A0G;
    public final String A0H;

    private void A00(C187729gH r8) {
        File file = r8.A02;
        if (file.exists()) {
            String str = r8.A04;
            byte[] A022 = A02();
            A8M a8m = A8M.A00;
            C173678vW r0 = new C173678vW(C108975cc.A1O(str), A022, 204);
            OutputStream outputStream = this.A0D;
            CancellationSignal cancellationSignal = this.A04;
            A8M.A02(cancellationSignal, r0, outputStream);
            A8M.A02(cancellationSignal, new C173688vX(new C21111Aef(this, 8), file, A02(), 205), outputStream);
        }
    }

    public static void A01(AWH awh, long j) {
        long j2 = awh.A02 + j;
        awh.A02 = j2;
        C175248yO r4 = awh.A0G;
        C194989sc r7 = new C194989sc(awh.A00, j2, awh.A01, true);
        A8M a8m = A8M.A00;
        C18070vi.A0d(r4, 0);
        int i = (int) ((((double) r7.A03) * 100.0d) / ((double) r7.A02));
        if (i > r7.A01) {
            C17890vO.A0s(r4, r7, 22);
        }
        awh.A00 = i;
    }

    public byte[] A02() {
        C24521Kq r0 = C24521Kq.$redex_init_class;
        C187719gG A002 = this.A07.A00();
        if (A002 != null) {
            return AnonymousClass8BT.A1a(A002.A03);
        }
        throw C17880vN.A0f("Failed to initiate encryption, key is missing.");
    }

    public void cancel() {
        this.A04.cancel();
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.Object, X.9Nm] */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x037f, code lost:
        X.A8M.A02(r15, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03fa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0440, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0447, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x044b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0460, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0461, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        X.A8M.A02((android.os.CancellationSignal) null, new X.A4Y(251, 0, 2), r6);
        com.whatsapp.util.Log.i("p2p/fpm/DonorChatTransferTask/cancel successful");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0478, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0479, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x047a, code lost:
        X.A8M.A04(r5.A0G, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x047f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0479 A[ExcHandler: 9La | IOException | InterruptedException (r1v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r5 = r22
            X.A7P r2 = r5.A0B
            r0 = 9
            r2.A04(r0)
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            java.lang.String r0 = "auth_token"
            r2.A06(r0)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r1 = r5.A0H     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            X.A8M r0 = X.A8M.A00     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            byte[] r4 = X.C108975cc.A1O(r1)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            r3 = 0
            r1 = 300(0x12c, float:4.2E-43)
            X.8vW r0 = new X.8vW     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            r0.<init>(r4, r3, r1)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            java.io.OutputStream r6 = r5.A0D     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            android.os.CancellationSignal r15 = r5.A04     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            X.A8M.A02(r15, r0, r6)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "protocol_agreement"
            r2.A06(r0)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
        L_0x002c:
            java.io.InputStream r8 = r5.A0C     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.A4Y r4 = X.A8M.A00(r15, r8)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r3 = r4.A01     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0 = 250(0xfa, float:3.5E-43)
            r7 = 0
            r1 = 1
            if (r3 == r0) goto L_0x03da
            r0 = 251(0xfb, float:3.52E-43)
            if (r3 == r0) goto L_0x0458
            r9 = 0
            switch(r3) {
                case 100: goto L_0x0384;
                case 101: goto L_0x0350;
                case 102: goto L_0x0211;
                case 103: goto L_0x016e;
                case 104: goto L_0x006f;
                default: goto L_0x0043;
            }     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "p2p/fpm/DonorChatTransferTask/Received unexpected message with type: "
            X.C17900vP.A0i(r0, r1, r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            long r0 = r4.A02     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x002c
            r3 = 2
            X.C18070vi.A0d(r15, r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r15.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r8.skip(r0)     // Catch:{ IOException -> 0x005d }
            goto L_0x002c
        L_0x005d:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r3 = "p2p/P2PDataTransferUtils/ Couldn't skip "
            r4.append(r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r4.append(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = " of bytes from the input stream"
            X.C17890vO.A19(r4, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x002c
        L_0x006f:
            long r0 = r4.A02     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x009d
            X.9uW r3 = r5.A09     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            long r0 = r3.A01()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r5.A01 = r0     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.Akw r3 = r3.A03()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0084:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x03e8 }
            X.9gH r0 = (X.C187729gH) r0     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x0084
            r5.A00(r0)     // Catch:{ all -> 0x03e8 }
            goto L_0x0084
        L_0x0096:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03e8 }
            byte[] r0 = X.C182319Tx.A01     // Catch:{ all -> 0x03e8 }
            goto L_0x0162
        L_0x009d:
            X.9nj r4 = r5.A08     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r3 = "missing"
            java.io.File r17 = r4.A00(r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            byte[] r19 = r5.A02()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r3 = 4
            X.C18070vi.A0d(r15, r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r16 = 0
            r18 = r8
            r20 = r0
            X.A8M.A03(r15, r16, r17, r18, r19, r20)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9uW r11 = r5.A09     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.FileInputStream r3 = X.C108945cZ.A18(r17)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ all -> 0x0405 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0405 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0405 }
            android.util.JsonReader r9 = new android.util.JsonReader     // Catch:{ all -> 0x0405 }
            r9.<init>(r0)     // Catch:{ all -> 0x0405 }
            r9.beginObject()     // Catch:{ all -> 0x03fb }
        L_0x00cf:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x0126
            java.lang.String r1 = r9.nextName()     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "relativePaths"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x00e5
            r9.beginArray()     // Catch:{ all -> 0x03fb }
            goto L_0x00e9
        L_0x00e5:
            r9.skipValue()     // Catch:{ all -> 0x03fb }
            goto L_0x00cf
        L_0x00e9:
            r12 = 1
        L_0x00ea:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x0126
            X.9Nm r0 = X.C173608vM.A00(r9)     // Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x00ea
            java.lang.String r14 = r0.A01     // Catch:{ all -> 0x03fb }
            X.1at r10 = X.C19961A0s.A00(r11)     // Catch:{ all -> 0x03fb }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03f4 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x03f4 }
            java.lang.String r4 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.exported_path = ?"
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x03f4 }
            r1[r7] = r14     // Catch:{ all -> 0x03f4 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_BY_EXPORTED_PATH_SINGLE"
            android.database.Cursor r4 = r13.A0A(r4, r0, r1)     // Catch:{ all -> 0x03f4 }
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x03ed }
            r0 = 0
            if (r1 == 0) goto L_0x0118
            X.9gH r0 = X.C196729vY.A00(r4)     // Catch:{ all -> 0x03ed }
        L_0x0118:
            r4.close()     // Catch:{ all -> 0x03f4 }
            if (r10 == 0) goto L_0x0120
            r10.close()     // Catch:{ all -> 0x03fb }
        L_0x0120:
            if (r0 == 0) goto L_0x00ea
            r8.add(r0)     // Catch:{ all -> 0x03fb }
            goto L_0x00ea
        L_0x0126:
            r9.close()     // Catch:{ all -> 0x0405 }
            r3.close()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            long r0 = r11.A01()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r5.A01 = r0     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r3 = 0
        L_0x0138:
            boolean r0 = r7.hasNext()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r7.next()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9gH r0 = (X.C187729gH) r0     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            long r0 = r0.A01     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            long r3 = r3 + r0
            goto L_0x0138
        L_0x0148:
            long r0 = r5.A01     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            long r0 = r0 - r3
            A01(r5, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0152:
            boolean r0 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9gH r0 = (X.C187729gH) r0     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r5.A00(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x0152
        L_0x0162:
            r3.close()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0165:
            r0 = 250(0xfa, float:3.5E-43)
            X.A4Y r1 = new X.A4Y     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x037f
        L_0x016e:
            X.AMY r9 = r5.A0A     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.File r0 = r9.A03     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r0 != 0) goto L_0x0177
            r9.A02(r15)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0177:
            java.lang.String r0 = "manifest_file"
            r2.A06(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0 = 12
            r2.A04(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.File r0 = r9.A03     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r0 == 0) goto L_0x0428
            java.io.File r7 = r9.A02     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r7 != 0) goto L_0x01fb
            X.9nj r1 = r9.A0B     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "manifest"
            java.io.File r7 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9uW r10 = r9.A0C     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r7)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ all -> 0x041e }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x041e }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x041e }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x041e }
            r4.<init>(r0)     // Catch:{ all -> 0x041e }
            long r0 = r10.A01()     // Catch:{ all -> 0x0414 }
            r4.beginObject()     // Catch:{ all -> 0x0414 }
            java.lang.String r8 = "totalSize"
            android.util.JsonWriter r8 = r4.name(r8)     // Catch:{ all -> 0x0414 }
            r8.value(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "relativePaths"
            r4.name(r0)     // Catch:{ all -> 0x0414 }
            r4.beginArray()     // Catch:{ all -> 0x0414 }
            X.Akw r11 = r10.A03()     // Catch:{ all -> 0x0414 }
        L_0x01bf:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x040a }
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x040a }
            X.9gH r10 = (X.C187729gH) r10     // Catch:{ all -> 0x040a }
            java.lang.String r1 = r10.A04     // Catch:{ all -> 0x040a }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x040a }
            if (r0 != 0) goto L_0x01bf
            X.9Nm r8 = new X.9Nm     // Catch:{ all -> 0x040a }
            r8.<init>()     // Catch:{ all -> 0x040a }
            r8.A01 = r1     // Catch:{ all -> 0x040a }
            long r0 = r10.A01     // Catch:{ all -> 0x040a }
            r8.A00 = r0     // Catch:{ all -> 0x040a }
            boolean r0 = r10.A05     // Catch:{ all -> 0x040a }
            r8.A02 = r0     // Catch:{ all -> 0x040a }
            r8.A00(r4)     // Catch:{ all -> 0x040a }
            goto L_0x01bf
        L_0x01e6:
            r11.close()     // Catch:{ all -> 0x0414 }
            r4.endArray()     // Catch:{ all -> 0x0414 }
            android.util.JsonWriter r0 = r4.endObject()     // Catch:{ all -> 0x0414 }
            r0.flush()     // Catch:{ all -> 0x0414 }
            r4.close()     // Catch:{ all -> 0x041e }
            r3.close()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r9.A02 = r7     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x01fb:
            byte[] r4 = r5.A02()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r3 = 203(0xcb, float:2.84E-43)
            r1 = 0
            X.8vX r0 = new X.8vX     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0.<init>(r1, r7, r4, r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.A8M.A02(r15, r0, r6)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "transfer"
            r2.A06(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x002c
        L_0x0211:
            X.AMY r4 = r5.A0A     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9nj r1 = r4.A0B     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "logging"
            java.io.File r7 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r7)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9eq r9 = r4.A0D     // Catch:{ all -> 0x043e }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x043e }
            r0.<init>(r3)     // Catch:{ all -> 0x043e }
            android.util.JsonWriter r8 = new android.util.JsonWriter     // Catch:{ all -> 0x043e }
            r8.<init>(r0)     // Catch:{ all -> 0x043e }
            r8.beginObject()     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "attemptID"
            android.util.JsonWriter r10 = r8.name(r0)     // Catch:{ all -> 0x0434 }
            X.9uV r0 = r9.A01     // Catch:{ all -> 0x0434 }
            X.00H r0 = r0.A01     // Catch:{ all -> 0x0434 }
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "/export/logging/attemptId"
            r4 = 0
            java.lang.String r0 = r1.getString(r0, r4)     // Catch:{ all -> 0x0434 }
            r10.value(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "donorInfo"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            r8.beginObject()     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "deviceName"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0434 }
            r1.append(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "appVersion"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "2.24.24.78"
            r8.value(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "osVersion"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "buildType"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Integer r0 = X.C17880vN.A0k()     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "yearClass2016"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            X.0vc r1 = r9.A03     // Catch:{ all -> 0x0434 }
            X.11C r0 = r9.A00     // Catch:{ all -> 0x0434 }
            int r0 = X.C24191Jf.A02(r0, r1)     // Catch:{ all -> 0x0434 }
            long r0 = (long) r0     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
            r8.endObject()     // Catch:{ all -> 0x0434 }
            X.A7P r0 = r9.A02     // Catch:{ all -> 0x0434 }
            java.util.List r1 = r0.A0D     // Catch:{ all -> 0x0434 }
            java.util.ArrayList r9 = X.C17880vN.A10(r1)     // Catch:{ all -> 0x0434 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0434 }
            if (r0 != 0) goto L_0x0329
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r8.name(r0)     // Catch:{ all -> 0x0434 }
            r0.beginArray()     // Catch:{ all -> 0x0434 }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ all -> 0x0434 }
        L_0x02b9:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x0326
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0434 }
            X.8sG r9 = (X.C171778sG) r9     // Catch:{ all -> 0x0434 }
            java.lang.Integer r0 = r9.A0A     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x02b9
            int r0 = r0.intValue()     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x02b9
            r8.beginObject()     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = "eventTypeCode"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Integer r0 = r9.A0A     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Long r0 = r9.A0C     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "duration"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Long r0 = r9.A0C     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
        L_0x02ea:
            java.lang.Long r0 = r9.A0J     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x02f8
            java.lang.String r0 = "progress"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Long r0 = r9.A0J     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
        L_0x02f8:
            java.lang.Double r0 = r9.A00     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x0306
            java.lang.String r0 = "exportedDbSize"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Double r0 = r9.A00     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
        L_0x0306:
            java.lang.Long r0 = r9.A0L     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x0314
            java.lang.String r0 = "storageAvailableSize"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Long r0 = r9.A0L     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
        L_0x0314:
            java.lang.Double r0 = r9.A02     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x0322
            java.lang.String r0 = "waDbSize"
            r8.name(r0)     // Catch:{ all -> 0x0434 }
            java.lang.Double r0 = r9.A02     // Catch:{ all -> 0x0434 }
            r8.value(r0)     // Catch:{ all -> 0x0434 }
        L_0x0322:
            r8.endObject()     // Catch:{ all -> 0x0434 }
            goto L_0x02b9
        L_0x0326:
            r8.endArray()     // Catch:{ all -> 0x0434 }
        L_0x0329:
            r8.endObject()     // Catch:{ all -> 0x0434 }
            r1.clear()     // Catch:{ all -> 0x0434 }
            r8.close()     // Catch:{ all -> 0x043e }
            r3.close()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            byte[] r3 = r5.A02()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r1 = 202(0xca, float:2.83E-43)
            X.8vX r0 = new X.8vX     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0.<init>(r4, r7, r3, r1)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.A8M.A02(r15, r0, r6)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            boolean r0 = r5.A03     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r0 == 0) goto L_0x002c
            X.8yO r1 = r5.A0G     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0 = 36
            X.C20735AWq.A00(r1, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x0433
        L_0x0350:
            X.AMY r9 = r5.A0A     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.C18070vi.A0d(r15, r7)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.File r8 = r9.A01     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            if (r8 != 0) goto L_0x0377
            X.9nj r1 = r9.A0B     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "enc-metadata"
            java.io.File r8 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.FileOutputStream r4 = X.C108945cZ.A19(r8)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.util.zip.ZipOutputStream r3 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x044c }
            r3.<init>(r4)     // Catch:{ all -> 0x044c }
            X.9uZ r0 = r9.A0A     // Catch:{ all -> 0x0445 }
            r0.A03(r15, r3, r7)     // Catch:{ all -> 0x0445 }
            r3.close()     // Catch:{ all -> 0x044c }
            r4.close()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r9.A01 = r8     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0377:
            r3 = 0
            r0 = 201(0xc9, float:2.82E-43)
            X.8vX r1 = new X.8vX     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r1.<init>(r3, r8, r3, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x037f:
            X.A8M.A02(r15, r1, r6)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x002c
        L_0x0384:
            long r3 = r4.A02     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.0ve r9 = r5.A06     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            byte[] r0 = X.C182319Tx.A01     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.C18070vi.A0d(r9, r7)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r1 = 6448(0x1930, float:9.036E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r9 = X.C18020vd.A00(r0, r9, r1)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r0 = (int) r3     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            byte[] r3 = new byte[r0]     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r1 = r8.read(r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0 = -1
            if (r1 == r0) goto L_0x044e
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r3, r7, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r0 = r0.getInt()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            int r3 = java.lang.Math.min(r9, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9uV r0 = r5.A07     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.00H r0 = r0.A01     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "/export/protocolVersion"
            X.C17880vN.A1C(r1, r0, r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0.putInt(r3)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            byte[] r4 = r0.array()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.C18070vi.A0X(r4)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r3 = 0
            r1 = 200(0xc8, float:2.8E-43)
            X.8vW r0 = new X.8vW     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0.<init>(r4, r3, r1)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.A8M.A02(r15, r0, r6)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "enc_metadata"
            r2.A06(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x002c
        L_0x03da:
            r0 = 13
            r2.A04(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "logging_metadata"
            r2.A06(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r5.A03 = r1     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x002c
        L_0x03e8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0423 }
            goto L_0x0427
        L_0x03ed:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03ef }
        L_0x03ef:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x03f4 }
            throw r0     // Catch:{ all -> 0x03f4 }
        L_0x03f4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03f6 }
        L_0x03f6:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x03fb }
            throw r0     // Catch:{ all -> 0x03fb }
        L_0x03fb:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0400 }
            goto L_0x0404
        L_0x0400:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0405 }
        L_0x0404:
            throw r1     // Catch:{ all -> 0x0405 }
        L_0x0405:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0423 }
            goto L_0x0427
        L_0x040a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x040f }
            goto L_0x0413
        L_0x040f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0414 }
        L_0x0413:
            throw r1     // Catch:{ all -> 0x0414 }
        L_0x0414:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0419 }
            goto L_0x041d
        L_0x0419:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x041e }
        L_0x041d:
            throw r1     // Catch:{ all -> 0x041e }
        L_0x041e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0423 }
            goto L_0x0427
        L_0x0423:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0427:
            throw r1     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0428:
            java.lang.String r0 = "p2p/fpm/ExportHelper/getManifestFile()/manifest file requested before messages exported"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x0464
        L_0x0433:
            return
        L_0x0434:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0439 }
            goto L_0x043d
        L_0x0439:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x043e }
        L_0x043d:
            throw r1     // Catch:{ all -> 0x043e }
        L_0x043e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0440 }
        L_0x0440:
            r1 = move-exception
            X.CDX.A00(r3, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x0464
        L_0x0445:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0447 }
        L_0x0447:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x044c }
            throw r0     // Catch:{ all -> 0x044c }
        L_0x044c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0460 }
        L_0x044e:
            r2 = 605(0x25d, float:8.48E-43)
            java.lang.String r1 = "No bytes to read"
            X.9HZ r0 = new X.9HZ     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r0.<init>((int) r2, (java.lang.String) r1)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            throw r0     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0458:
            int r0 = r4.A00     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            X.9La r1 = new X.9La     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
            goto L_0x0464
        L_0x0460:
            r1 = move-exception
            X.CDX.A00(r4, r0)     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0464:
            throw r1     // Catch:{ OperationCanceledException -> 0x0465, 9La | IOException | InterruptedException -> 0x0479, 9La | IOException | InterruptedException -> 0x0479 }
        L_0x0465:
            r4 = 2
            r0 = 251(0xfb, float:3.52E-43)
            r2 = 0
            X.A4Y r1 = new X.A4Y     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            r1.<init>((int) r0, (long) r2, (int) r4)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            r0 = 0
            X.A8M.A02(r0, r1, r6)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            java.lang.String r0 = "p2p/fpm/DonorChatTransferTask/cancel successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 9La | IOException | InterruptedException -> 0x0479 }
            return
        L_0x0479:
            r1 = move-exception
            X.8yO r0 = r5.A0G
            X.A8M.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWH.run():void");
    }

    public AWH(AnonymousClass190 r3, AnonymousClass11P r4, C24521Kq r5, C18030ve r6, C196129uV r7, C192059nj r8, C196139uW r9, AMY amy, A7P a7p, C175248yO r12, InputStream inputStream, OutputStream outputStream, String str) {
        this.A0E = r4;
        this.A06 = r6;
        this.A05 = r3;
        this.A0H = str;
        this.A0C = inputStream;
        this.A0D = outputStream;
        this.A0A = amy;
        this.A0B = a7p;
        this.A08 = r8;
        this.A0G = r12;
        this.A09 = r9;
        this.A07 = r7;
        this.A0F = r5;
        this.A04 = new CancellationSignal();
    }
}
