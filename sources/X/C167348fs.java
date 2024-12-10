package X;

import android.content.Context;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: X.8fs  reason: invalid class name and case insensitive filesystem */
public abstract class C167348fs extends A5N {
    public C192169nv A00;
    public final AnonymousClass1NT A01;
    public final C27351Vt A02;
    public final C57372iy A03;
    public final AnonymousClass11S A04;

    public C167348fs(AnonymousClass11S r7, C19947A0e a0e, AnonymousClass1NT r9, AnonymousClass1NM r10, C27351Vt r11, C219317y r12, C57372iy r13, C20036A4f a4f, File file) {
        super(a0e, r10, r12, a4f, file);
        this.A04 = r7;
        this.A02 = r11;
        this.A01 = r9;
        this.A03 = r13;
    }

    public static C199109zS A01(C167348fs r7) {
        int i;
        C199109zS r0;
        File file = r7.A03;
        long length = file.length();
        boolean z = r7 instanceof C167338fr;
        if (z) {
            i = 16;
        } else if (((C167328fq) r7) instanceof C167308fo) {
            i = 0;
        } else {
            i = 20;
        }
        long j = length - ((long) i);
        FileInputStream A18 = C108945cZ.A18(file);
        if (j >= 0) {
            try {
                AnonymousClass1EY.A03(A18, j);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        if (z) {
            byte[] bArr = new byte[16];
            if (A18.read(bArr) == 16) {
                r0 = new C199109zS(bArr, (byte[]) null);
            } else {
                Log.e("backup-file-crypt14//cannot read footer, footer is null");
                r0 = null;
            }
        } else {
            if (!(((C167328fq) r7) instanceof C167308fo)) {
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[4];
                int read = A18.read(bArr2);
                int read2 = A18.read(bArr3);
                if (read == 16 && read2 == 4) {
                    r0 = new C199109zS(bArr2, bArr3);
                } else {
                    Log.e("Backup/BackupFileCrypt12/footer is null");
                }
            }
            r0 = null;
        }
        A18.close();
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0034, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(java.io.File r5, java.security.MessageDigest r6) {
        /*
            r0 = 16
            byte[] r4 = new byte[r0]
            java.io.FileInputStream r3 = X.C108945cZ.A18(r5)
            boolean r0 = r3 instanceof java.io.BufferedInputStream     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0010
            r2 = r3
            java.io.BufferedInputStream r2 = (java.io.BufferedInputStream) r2     // Catch:{ all -> 0x0031 }
            goto L_0x0017
        L_0x0010:
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0031 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0031 }
        L_0x0017:
            int r1 = r2.read(r4)     // Catch:{ all -> 0x002a }
            r0 = -1
            if (r1 == r0) goto L_0x0023
            r0 = 0
            r6.update(r4, r0, r1)     // Catch:{ all -> 0x002a }
            goto L_0x0017
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x0031 }
            r3.close()
            return
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167348fs.A02(java.io.File, java.security.MessageDigest):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.8ce} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.9nv] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C192169nv A0B(java.io.InputStream r14, boolean r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C167338fr
            if (r0 == 0) goto L_0x00fd
            r3 = r13
            X.8fr r3 = (X.C167338fr) r3
            boolean r1 = r3 instanceof X.C167318fp
            X.8ai r0 = X.C165178ai.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x005c
            X.Bm6 r5 = X.C23577Bm6.A04(r0, r14)
            X.8ai r5 = (X.C165178ai) r5
            r10 = 0
            if (r5 != 0) goto L_0x001c
            java.lang.String r0 = "backup-file-crypt15/readPrefix/backupPrefix is null"
        L_0x0018:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x001b:
            return r10
        L_0x001c:
            int r1 = r5.keyType_
            if (r1 == 0) goto L_0x003b
            r0 = 1
            if (r1 != r0) goto L_0x003b
            X.9JX r1 = X.AnonymousClass9JX.HSM_CONTROLLED
        L_0x0025:
            X.9JX r0 = X.AnonymousClass9JX.HSM_CONTROLLED
            if (r1 != r0) goto L_0x001b
            X.8XS r0 = r5.hsmControlledKeyData_
            if (r0 != 0) goto L_0x002f
            X.8XS r0 = X.AnonymousClass8XS.DEFAULT_INSTANCE
        L_0x002f:
            X.DSQ r0 = r0.encryptionIv_
            byte[] r4 = r0.A06()
            int r0 = r4.length
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "backup-file-crypt15/read-prefix/failed to read prefix"
            goto L_0x0018
        L_0x003b:
            X.9JX r1 = X.AnonymousClass9JX.WA_PROVIDED
            goto L_0x0025
        L_0x003e:
            X.1NT r0 = r3.A01
            X.1NO r0 = r0.A02
            byte[] r2 = r0.A03()
            if (r2 == 0) goto L_0x005a
            byte[] r1 = X.AnonymousClass1NT.A09
            r0 = 32
            byte[] r1 = X.C20058A5h.A00(r2, r1, r0)
        L_0x0050:
            java.util.Arrays.toString(r1)
            if (r15 == 0) goto L_0x00c7
            if (r1 != 0) goto L_0x00c7
            java.lang.String r0 = "backup-file-crypt15/read-prefix/no key found"
            goto L_0x0018
        L_0x005a:
            r1 = 0
            goto L_0x0050
        L_0x005c:
            X.Bm6 r2 = X.C23577Bm6.A04(r0, r14)
            X.8ai r2 = (X.C165178ai) r2
            r10 = 0
            if (r2 != 0) goto L_0x0068
            java.lang.String r0 = "backup-file-crypt14/readPrefix/backupPrefix is null"
            goto L_0x0018
        L_0x0068:
            int r1 = r2.keyType_
            if (r1 == 0) goto L_0x00c4
            r0 = 1
            if (r1 != r0) goto L_0x00c4
            X.9JX r1 = X.AnonymousClass9JX.HSM_CONTROLLED
        L_0x0071:
            X.9JX r0 = X.AnonymousClass9JX.WA_PROVIDED
            if (r1 != r0) goto L_0x00bd
            int r0 = r2.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00bd
            X.8bC r1 = r2.waProvidedKeyData_
            if (r1 != 0) goto L_0x0081
            X.8bC r1 = X.C165468bC.DEFAULT_INSTANCE
        L_0x0081:
            X.DSQ r0 = r1.backupCipherHeader_
            byte[] r6 = r0.A06()
            java.lang.String r5 = r1.keyVersion_
            X.DSQ r0 = r1.serverSalt_
            byte[] r7 = r0.A06()
            X.DSQ r0 = r1.googleIdSalt_
            byte[] r8 = r0.A06()
            X.DSQ r0 = r1.encryptionIv_
            byte[] r9 = r0.A06()
            X.9mJ r4 = new X.9mJ
            r4.<init>(r5, r6, r7, r8, r9)
            X.1Vt r0 = r3.A02
            X.9lA r1 = r0.A01(r4)
            if (r15 == 0) goto L_0x00d9
            if (r1 != 0) goto L_0x00fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backup-file-crypt14/cipher result is null for "
        L_0x00b0:
            r1.append(r0)
            X.9JN r0 = r3.A0D()
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            goto L_0x0018
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backup-file-crypt14/failed to read cipher from the file "
            goto L_0x00b0
        L_0x00c4:
            X.9JX r1 = X.AnonymousClass9JX.WA_PROVIDED
            goto L_0x0071
        L_0x00c7:
            int r0 = r5.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00d3
            X.8ce r10 = r5.backupMetadata_
            if (r10 != 0) goto L_0x00d3
            X.8ce r10 = X.C166288ce.DEFAULT_INSTANCE
        L_0x00d3:
            X.8h3 r0 = new X.8h3
            r0.<init>(r10, r1, r4)
            return r0
        L_0x00d9:
            if (r1 != 0) goto L_0x00fa
            r11 = r10
        L_0x00dc:
            java.util.Arrays.toString(r11)
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00f8
            X.8ce r9 = r2.backupMetadata_
            if (r9 != 0) goto L_0x00eb
            X.8ce r9 = X.C166288ce.DEFAULT_INSTANCE
        L_0x00eb:
            if (r1 == 0) goto L_0x00ef
            byte[] r10 = r1.A01
        L_0x00ef:
            byte[] r12 = r4.A01
            X.8h4 r7 = new X.8h4
            r8 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x00f8:
            r9 = r10
            goto L_0x00eb
        L_0x00fa:
            byte[] r11 = r1.A02
            goto L_0x00dc
        L_0x00fd:
            X.9mJ r4 = X.A85.A00(r14)
            X.1Vt r0 = r13.A02
            X.9lA r0 = r0.A01(r4)
            r3 = 0
            if (r15 == 0) goto L_0x0120
            if (r0 != 0) goto L_0x0132
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/restore/cipher result is null for "
            r1.append(r0)
            X.9JN r0 = r13.A0D()
            r1.append(r0)
            X.C17890vO.A0w(r1)
            return r3
        L_0x0120:
            if (r0 != 0) goto L_0x0132
            r2 = r3
        L_0x0123:
            java.util.Arrays.toString(r2)
            if (r0 == 0) goto L_0x012a
            byte[] r3 = r0.A01
        L_0x012a:
            byte[] r1 = r4.A01
            X.8h5 r0 = new X.8h5
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0132:
            byte[] r2 = r0.A02
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167348fs.A0B(java.io.InputStream, boolean):X.9nv");
    }

    public AnonymousClass6QY A0C() {
        int i;
        File file = this.A03;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C108945cZ.A18(file));
        long length = file.length();
        if (this instanceof C167338fr) {
            i = 16;
        } else if (((C167328fq) this) instanceof C167308fo) {
            i = 0;
        } else {
            i = 20;
        }
        long j = length - ((long) i);
        Locale locale = Locale.ENGLISH;
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass3MX.A1S(A1b, 0, j);
        AnonymousClass000.A1M(A1b, i);
        String.format(locale, "BackupFile/get-input-stream size-without-footer:%d footer-size:%d", A1b);
        return new AnonymousClass6QY(bufferedInputStream, j);
    }

    public AnonymousClass9JN A0D() {
        if (!(this instanceof C167338fr)) {
            return AnonymousClass9JN.CRYPT12;
        }
        if (((C167338fr) this) instanceof C167318fp) {
            return AnonymousClass9JN.CRYPT15;
        }
        return AnonymousClass9JN.CRYPT14;
    }

    public File A0E(Context context) {
        if (!(this instanceof C167338fr)) {
            return AnonymousClass8BX.A0T(context);
        }
        C167338fr r1 = (C167338fr) this;
        if (r1 instanceof C167318fp) {
            return C17880vN.A0e(AnonymousClass8BR.A0t(r1.A01.A02.A00), "encrypted_backup.key");
        }
        return AnonymousClass8BX.A0T(context);
    }

    public final String A0F() {
        String str;
        AnonymousClass11S r2 = this.A04;
        r2.A0I();
        if (r2.A00 == null) {
            str = "backup/BackupFileCrypt12/getUserJid MeManager.me is null";
        } else {
            PhoneUserJid A002 = AnonymousClass11S.A00(r2);
            if (A002 != null) {
                return A002.user;
            }
            str = "backup/BackupFileCrypt12/getUserJid MeManager.getMyJidObject() is null";
        }
        Log.e(str);
        return null;
    }

    public static final byte[] A03(File file, File file2, byte[] bArr) {
        C18070vi.A0i(file, bArr);
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BV.A1J(file, "BackupCryptoUtils/calculateHash ", A10);
        AnonymousClass1Ez r1 = new AnonymousClass1Ez(A10.toString());
        MessageDigest A1I = C108945cZ.A1I();
        C18070vi.A0b(A1I);
        A02(file2, A1I);
        A02(file, A1I);
        byte[] A002 = AnonymousClass9QC.A00(A1I.digest(), bArr);
        C18070vi.A0X(A002);
        r1.A02();
        return A002;
    }
}
