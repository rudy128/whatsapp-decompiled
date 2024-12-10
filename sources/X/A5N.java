package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;

public abstract class A5N {
    public final AnonymousClass1NM A00;
    public final C219317y A01;
    public final C20036A4f A02;
    public final File A03;
    public final C19947A0e A04;

    public static void A05(C72053Kl r8, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[A7Y.A0F];
        long j2 = 0;
        int i = -1;
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                int i2 = (int) ((100 * j2) / j);
                if (i != i2) {
                    Locale locale = Locale.ENGLISH;
                    Object[] A1a = AnonymousClass8BR.A1a();
                    AnonymousClass3MX.A1S(A1a, 0, j2);
                    AnonymousClass3MX.A1S(A1a, 1, j);
                    C17880vN.A1T(A1a, i2, 2);
                    String.format(locale, "encrypter/encrypt %d/%d (%d%%)", A1a);
                    if (r8 != null) {
                        r8.BE3(Integer.valueOf(i2));
                    }
                    i = i2;
                }
            } else {
                return;
            }
        }
    }

    public C189869jz A06() {
        int i;
        int i2;
        String str;
        int i3;
        String A002;
        int i4;
        C192169nv r1;
        C165178ai r0;
        C165178ai r12;
        String str2;
        if (this instanceof C167298fn) {
            return new C189869jz(1, (String) null);
        }
        C167348fs r6 = (C167348fs) this;
        if (r6 instanceof C167308fo) {
            i2 = 1;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("EncryptedBackupFile/verifyIntegrity/");
            AnonymousClass9JN A0D = r6.A0D();
            C17900vP.A0b(A0D, A10);
            AnonymousClass1Ez r3 = new AnonymousClass1Ez("BackupFile/getFileDigestWithoutFooter/calculating-actual-digest");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("BackupFile/getFileDigestWithoutFooter/initial digest = ");
            C17890vO.A1A(A102, C17970vW.A07(instance.digest()));
            File file = r6.A03;
            long length = file.length();
            boolean z = r6 instanceof C167338fr;
            if (z) {
                i = 16;
            } else if (((C167328fq) r6) instanceof C167308fo) {
                i = 0;
            } else {
                i = 20;
            }
            String A08 = C64062u9.A08(file, instance, length - ((long) i));
            r3.A02();
            C17900vP.A0f("msgstore-integrity-checker/verify-integrity/actual-digest/  ", A08, AnonymousClass000.A10());
            C199109zS A012 = C167348fs.A01(r6);
            C57372iy r5 = r6.A03;
            StringBuilder A11 = AnonymousClass000.A11("EncryptedBackupFile/verifyIntegrity/");
            A11.append(A0D);
            A11.append(" ");
            A11.append(file);
            AnonymousClass8BV.A1I(file, " size=", A11);
            A11.append(" modification time = ");
            A11.append(file.lastModified());
            A11.append("footer: ");
            A11.append(A012);
            i2 = 2;
            r5.A00(AnonymousClass001.A1H("actualDigest: ", A08, A11), 2);
            if (A012 != null) {
                if (A08 == null) {
                    byte[] bArr = A012.A01;
                    if (bArr != null) {
                        str2 = Arrays.toString(bArr);
                    } else {
                        str2 = "null";
                    }
                    return new C189869jz(i2, str2);
                }
                String A0F = r6.A0F();
                if (!(A0F == null || (r1 = r6.A00) == null)) {
                    if (r1 instanceof AnonymousClass8h4) {
                        r0 = ((AnonymousClass8h4) r1).A00;
                    } else if (r1 instanceof AnonymousClass8h3) {
                        r0 = ((AnonymousClass8h3) r1).A00;
                    }
                    if (A8L.A04(r0, A0F)) {
                        C192169nv r13 = r6.A00;
                        if (r13 instanceof AnonymousClass8h4) {
                            r12 = ((AnonymousClass8h4) r13).A00;
                        } else {
                            if (r13 instanceof AnonymousClass8h3) {
                                r12 = ((AnonymousClass8h3) r13).A00;
                            }
                            A002 = null;
                            i4 = 4;
                            return new C189869jz(i4, A002);
                        }
                        if ((r12.bitField0_ & 8) != 0) {
                            C166288ce r02 = r12.backupMetadata_;
                            C166288ce r14 = r02;
                            if (r02 == null) {
                                r02 = C166288ce.DEFAULT_INSTANCE;
                            }
                            if ((r02.bitField0_ & 4) != 0) {
                                if (r14 == null) {
                                    r14 = C166288ce.DEFAULT_INSTANCE;
                                }
                                A002 = r14.jidSuffix_;
                                i4 = 4;
                                return new C189869jz(i4, A002);
                            }
                        }
                        A002 = null;
                        i4 = 4;
                        return new C189869jz(i4, A002);
                    }
                }
                byte[] bArr2 = A012.A01;
                if (z) {
                    if (bArr2 != null) {
                        A002 = C199109zS.A00(bArr2);
                        i4 = 2;
                        return new C189869jz(i4, A002);
                    }
                    str = null;
                } else if (bArr2 == null) {
                    Log.e("BackupFileCrypt12/verifyFooterIntegrity/jidSuffix is null");
                    i2 = 2;
                } else {
                    str = r6.A0F();
                }
                C17900vP.A0f("BackupFooter/verify-integrity/actual-digest/  ", A08, AnonymousClass000.A10());
                String A07 = C17970vW.A07(A012.A00);
                C17900vP.A0f("BackupFooter/verify-integrity/expected-digest/", A07, AnonymousClass000.A10());
                if (A08.equals(A07)) {
                    Log.i("BackupFooter/verify-integrity/digest-matches/success");
                    if (!(bArr2 == null || str == null)) {
                        String A003 = C199109zS.A00(bArr2);
                        if (!str.endsWith(A003)) {
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                            A103.append(A003);
                            C17900vP.A0e("  actual-jid-user: ", str, A103);
                            r5.A00("BackupFooter/verify-integrity/jid-mismatch", 4);
                            return new C189869jz(4, (String) null);
                        }
                    }
                    i3 = 1;
                } else {
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("BackupFooter/verify-integrity/failed expected-digest:");
                    A104.append(A07);
                    r5.A00(AnonymousClass001.A1H(" actual-digest:", A08, A104), 4);
                    i3 = 2;
                }
                return new C189869jz(i3, (String) null);
            }
        }
        str2 = null;
        return new C189869jz(i2, str2);
    }

    public C189869jz A07(AnonymousClass118 r24, B9V b9v, File file, int i, int i2, boolean z) {
        C189869jz r1;
        byte[] bArr;
        IllegalStateException th;
        byte[] bArr2;
        InflaterInputStream inflaterInputStream;
        FileInputStream A18;
        B9V b9v2 = b9v;
        File file2 = file;
        int i3 = i;
        int i4 = i2;
        if (this instanceof C167298fn) {
            AnonymousClass2QW r6 = new AnonymousClass2QW(this.A01.A00, file2);
            try {
                A18 = C108945cZ.A18(this.A03);
                FileChannel channel = A18.getChannel();
                WritableByteChannel newChannel = Channels.newChannel(r6);
                C18070vi.A0h(channel, newChannel);
                long j = 0;
                for (long j2 = 0; j2 < channel.size(); j2 += 131072) {
                    j += channel.transferTo(j2, Math.min(131072, channel.size() - j2), newChannel);
                    if (b9v != null && i2 > 0) {
                        b9v2.C9b(i3, i4, j, channel.size());
                    }
                }
                r6.flush();
                C189869jz r0 = new C189869jz(1, (String) null);
                A18.close();
                r6.close();
                return r0;
            } catch (Throwable th2) {
                th = th2;
                try {
                    r6.close();
                    throw th;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th, th3);
                    throw th;
                }
            }
        } else {
            C167348fs r7 = (C167348fs) this;
            AnonymousClass2QW r2 = new AnonymousClass2QW(r7.A01.A00, file2);
            try {
                AnonymousClass6QY A0C = r7.A0C();
                try {
                    C192169nv A0B = r7.A0B(A0C, true);
                    r7.A00 = A0B;
                    if (A0B == null) {
                        r1 = new C189869jz(5, (String) null);
                    } else {
                        r1 = r7.A06();
                        if (r1.A00 == 1) {
                            Log.i("BackupFile/restoreSingleFileBackup/file-integrity-check/success");
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("BackupFile/restoreSingleFileBackup/key ");
                            AnonymousClass9JN A0D = r7.A0D();
                            C17900vP.A0b(A0D, A10);
                            File file3 = r7.A03;
                            file3.length();
                            C20036A4f a4f = r7.A02;
                            long length = file3.length();
                            C192169nv r8 = r7.A00;
                            boolean z2 = r8 instanceof AnonymousClass8h3;
                            if (z2) {
                                bArr = ((AnonymousClass8h3) r8).A02;
                            } else {
                                bArr = ((AnonymousClass8h5) r8).A03;
                            }
                            if (bArr != null) {
                                if (z2) {
                                    bArr2 = ((AnonymousClass8h3) r8).A01;
                                } else {
                                    bArr2 = ((AnonymousClass8h5) r8).A02;
                                }
                                C20036A4f.A01(a4f);
                                AtomicLong atomicLong = new AtomicLong();
                                synchronized (a4f) {
                                    int ordinal = A0D.ordinal();
                                    if (ordinal == 1) {
                                        Cipher cipher = a4f.A00;
                                        C17960vV.A07(cipher);
                                        AnonymousClass8BW.A1O(AnonymousClass8BS.A0v(bArr), cipher, bArr2);
                                        inflaterInputStream = new InflaterInputStream(new C21606Amv(A0C, atomicLong, cipher));
                                    } else if (ordinal == 3) {
                                        Cipher cipher2 = a4f.A01;
                                        C17960vV.A07(cipher2);
                                        AnonymousClass8BW.A1O(AnonymousClass8BS.A0v(bArr), cipher2, bArr2);
                                        inflaterInputStream = new InflaterInputStream(new C21606Amv(A0C, atomicLong, cipher2));
                                    } else if (ordinal == 4) {
                                        Cipher cipher3 = a4f.A02;
                                        C17960vV.A07(cipher3);
                                        AnonymousClass8BW.A1O(AnonymousClass8BS.A0v(bArr), cipher3, bArr2);
                                        inflaterInputStream = new InflaterInputStream(new C21606Amv(A0C, atomicLong, cipher3));
                                    } else {
                                        throw AnonymousClass8BX.A0V(A0D, "unsupported key selector ", AnonymousClass000.A10());
                                    }
                                }
                                try {
                                    byte[] bArr3 = new byte[A7Y.A0F];
                                    while (true) {
                                        int read = inflaterInputStream.read(bArr3);
                                        if (read < 0) {
                                            break;
                                        }
                                        r2.write(bArr3, 0, read);
                                        if (b9v != null && i2 > 0) {
                                            b9v2.C9b(i3, i4, atomicLong.get(), length);
                                        }
                                    }
                                    inflaterInputStream.close();
                                    r2.flush();
                                    if (z) {
                                        C192169nv r4 = r7.A00;
                                        if (!(r4 instanceof AnonymousClass8h3)) {
                                            AnonymousClass8h5 r42 = (AnonymousClass8h5) r4;
                                            AnonymousClass118 r5 = r24;
                                            C18070vi.A0d(r5, 0);
                                            Context A0E = C108945cZ.A0E(r5);
                                            C191279mJ r3 = r42.A00;
                                            String str = r3.A00;
                                            C18070vi.A0W(str);
                                            byte[] bArr4 = r3.A04;
                                            C18070vi.A0W(bArr4);
                                            byte[] bArr5 = r42.A03;
                                            if (bArr5 != null) {
                                                byte[] bArr6 = r42.A01;
                                                if (bArr6 != null) {
                                                    byte[] bArr7 = r3.A02;
                                                    C18070vi.A0W(bArr7);
                                                    A85.A04(A0E, str, bArr4, bArr5, bArr6, bArr7);
                                                    C190419ku A012 = A85.A01(A0E);
                                                    if (A012 != null) {
                                                        A012.toString();
                                                    }
                                                } else {
                                                    throw AnonymousClass000.A0k("backup-prefix/get-key/account hash is null");
                                                }
                                            } else {
                                                throw AnonymousClass000.A0k("backup-prefix/get-key/key is null");
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    AnonymousClass0DT.A00(th, th4);
                                }
                            } else {
                                th = AnonymousClass000.A0n("backup-prefix/get-key/key is null");
                                throw th;
                            }
                        }
                    }
                    A0C.close();
                    r2.close();
                    return r1;
                } catch (Throwable th5) {
                    A0C.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                r2.close();
                throw th;
            }
        }
        throw th;
    }

    public void A08(C72053Kl r9, File file) {
        byte[] bArr;
        IllegalStateException th;
        byte[] bArr2;
        DeflaterOutputStream deflaterOutputStream;
        FileInputStream A18;
        if (this instanceof C167298fn) {
            FileOutputStream A19 = C108945cZ.A19(this.A03);
            try {
                A18 = C108945cZ.A18(file);
                A05(r9, A18, A19, file.length());
                A18.close();
                A19.close();
                return;
            } catch (Throwable th2) {
                th = th2;
                try {
                    A19.close();
                    throw th;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th, th3);
                    throw th;
                }
            }
        } else {
            C167348fs r6 = (C167348fs) this;
            C17960vV.A0H(AnonymousClass000.A1W(r6.A00), "prefix has not been initialized");
            File A012 = r6.A00.A00().A01("");
            FileOutputStream A192 = C108945cZ.A19(A012);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BackupFile/get-output-stream/initial digest = ");
            C17890vO.A1A(A10, C17970vW.A07(instance.digest()));
            instance.reset();
            C21600Amo amo = new C21600Amo(r6, A012, A192, instance);
            try {
                FileInputStream A182 = C108945cZ.A18(file);
                try {
                    r6.A00.A01(amo);
                    C20036A4f a4f = r6.A02;
                    AnonymousClass9JN A0D = r6.A0D();
                    C192169nv r4 = r6.A00;
                    boolean z = r4 instanceof AnonymousClass8h3;
                    if (z) {
                        bArr = ((AnonymousClass8h3) r4).A02;
                    } else {
                        bArr = ((AnonymousClass8h5) r4).A03;
                    }
                    if (bArr != null) {
                        if (z) {
                            bArr2 = ((AnonymousClass8h3) r4).A01;
                        } else {
                            bArr2 = ((AnonymousClass8h5) r4).A02;
                        }
                        synchronized (a4f) {
                            C20036A4f.A01(a4f);
                            int ordinal = A0D.ordinal();
                            if (ordinal == 1) {
                                deflaterOutputStream = A04(amo, a4f.A03, bArr, bArr2);
                            } else if (ordinal == 3) {
                                deflaterOutputStream = A04(amo, a4f.A04, bArr, bArr2);
                            } else if (ordinal == 4) {
                                deflaterOutputStream = A04(amo, a4f.A05, bArr, bArr2);
                            } else {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("Unexpected key selector (");
                                A102.append(A0D);
                                throw AnonymousClass001.A12(")", A102);
                            }
                        }
                        try {
                            A05(r9, A182, deflaterOutputStream, file.length());
                            deflaterOutputStream.close();
                            A182.close();
                            amo.close();
                            return;
                        } catch (Throwable th4) {
                            AnonymousClass0DT.A00(th, th4);
                        }
                    } else {
                        th = AnonymousClass000.A0n("backup-prefix/get-key/key is null");
                        throw th;
                    }
                } catch (Throwable th5) {
                    A182.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                amo.close();
                throw th;
            }
        }
        throw th;
    }

    public boolean A09(Context context, File file) {
        AnonymousClass6QY A0C;
        if (this instanceof C167298fn) {
            return false;
        }
        C167348fs r4 = (C167348fs) this;
        File file2 = r4.A03;
        if (!file2.exists() || file2.length() == 0) {
            return false;
        }
        if (r4.A00 == null) {
            try {
                A0C = r4.A0C();
                r4.A00 = r4.A0B(A0C, false);
                A0C.close();
            } catch (C18130vo | IOException e) {
                Log.e("EncryptedBackupFile/containsFile failed to read prefix", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            if (r4.A00 == null) {
                return false;
            }
        }
        File A0E = r4.A0E(context);
        C166288ce A002 = r4.A00.A00();
        if (A002 == null) {
            return false;
        }
        int i = A002.bitField1_;
        if ((i & 128) == 0 || (i & 256) == 0) {
            return false;
        }
        byte[] A032 = C167348fs.A03(file, A0E, A002.backupEncryptedHashSalt_.A06());
        file.getName();
        Arrays.toString(A002.backupEncryptedHash_.A06());
        Arrays.toString(A002.backupEncryptedHashSalt_.A06());
        Arrays.toString(A032);
        return Arrays.equals(A002.backupEncryptedHash_.A06(), A032);
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(android.content.Context r15, java.io.File r16) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C167298fn
            if (r0 == 0) goto L_0x0006
            r0 = 1
            return r0
        L_0x0006:
            r5 = r14
            X.8fs r5 = (X.C167348fs) r5
            r7 = 0
            r2 = r16
            if (r16 == 0) goto L_0x00ca
            java.io.File r1 = r5.A0E(r15)
            r0 = 16
            byte[] r6 = X.C17970vW.A0I(r0)
            byte[] r4 = X.C167348fs.A03(r2, r1, r6)
        L_0x001c:
            boolean r0 = r5 instanceof X.C167338fr
            if (r0 == 0) goto L_0x0087
            r3 = r5
            X.8fr r3 = (X.C167338fr) r3
            boolean r0 = r3 instanceof X.C167318fp
            if (r0 == 0) goto L_0x0057
            X.1NT r1 = r3.A01
            boolean r0 = r1.A04()
            r8 = 0
            if (r0 == 0) goto L_0x0051
            X.1NO r0 = r1.A02
            byte[] r2 = r0.A03()
            if (r2 == 0) goto L_0x0051
            byte[] r1 = X.AnonymousClass1NT.A09
            r0 = 32
            byte[] r2 = X.C20058A5h.A00(r2, r1, r0)
            if (r2 == 0) goto L_0x0051
            r0 = 16
            byte[] r1 = X.C17970vW.A0I(r0)
            X.8ce r0 = r3.A0G(r6, r4)
            X.8h3 r8 = new X.8h3
            r8.<init>(r0, r2, r1)
        L_0x0051:
            r5.A00 = r8
            if (r8 == 0) goto L_0x0056
            r7 = 1
        L_0x0056:
            return r7
        L_0x0057:
            r8 = 0
            X.9ku r2 = X.A85.A01(r15)     // Catch:{ Exception -> 0x00c3 }
            if (r2 != 0) goto L_0x0067
            X.2iy r2 = r3.A03     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r1 = "msgstore/backupDatabase/key is null"
            r0 = 3
            r2.A00(r1, r0)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x0051
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backup-file-crypt14//key v="
            r1.append(r0)
            X.9mJ r9 = r2.A00
            java.lang.String r0 = r9.A00
            X.C17890vO.A1A(r1, r0)
            X.8ce r10 = r3.A0G(r6, r4)
            byte[] r11 = r2.A02
            byte[] r12 = r2.A01
            byte[] r13 = r9.A01
            X.8h4 r8 = new X.8h4
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0051
        L_0x0087:
            X.1NT r0 = r5.A01
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)
            r8 = 0
            X.9ku r2 = X.A85.A01(r15)     // Catch:{ Exception -> 0x00bf }
            if (r2 != 0) goto L_0x00a2
            X.2iy r2 = r5.A03     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = "msgstore/backupDatabase/key is null"
            r0 = 3
            r2.A00(r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x0051
        L_0x00a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = "msgstore/backupDatabase/createPrefix v="
            r1.append(r0)     // Catch:{ Exception -> 0x00bf }
            X.9mJ r4 = r2.A00     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = r4.A00     // Catch:{ Exception -> 0x00bf }
            X.C17890vO.A1A(r1, r0)     // Catch:{ Exception -> 0x00bf }
            byte[] r3 = r2.A02     // Catch:{ Exception -> 0x00bf }
            byte[] r2 = r2.A01     // Catch:{ Exception -> 0x00bf }
            byte[] r1 = r4.A01     // Catch:{ Exception -> 0x00bf }
            X.8h5 r0 = new X.8h5     // Catch:{ Exception -> 0x00bf }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ Exception -> 0x00bf }
            r8 = r0
            goto L_0x0051
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "msgstore/backupDatabase/key/error"
            goto L_0x00c6
        L_0x00c3:
            r1 = move-exception
            java.lang.String r0 = "backup-file-crypt14/key/error"
        L_0x00c6:
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0051
        L_0x00ca:
            r6 = 0
            r4 = r6
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5N.A0A(android.content.Context, java.io.File):boolean");
    }

    public A5N(C19947A0e a0e, AnonymousClass1NM r2, C219317y r3, C20036A4f a4f, File file) {
        this.A03 = file;
        this.A02 = a4f;
        this.A00 = r2;
        this.A04 = a0e;
        this.A01 = r3;
    }

    public static DeflaterOutputStream A04(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        C17960vV.A07(cipher);
        return new DeflaterOutputStream(C20036A4f.A00(outputStream, cipher, bArr, bArr2), new Deflater(1, false));
    }
}
