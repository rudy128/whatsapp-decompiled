package X;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1AE  reason: invalid class name */
public abstract class AnonymousClass1AE extends AnonymousClass1AC {
    public String A00;
    public String[] A01;
    public AnonymousClass1AH A02;
    public final Context A03;
    public final Map A04 = new HashMap();

    public AnonymousClass3BQ A05() {
        AnonymousClass1AF r1 = (AnonymousClass1AF) this;
        return new C162488Qs(r1, r1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1AE(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            java.lang.String r0 = r0.dataDir
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r1 = 1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.<init>(r2, r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.A04 = r0
            r3.A03 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AE.<init>(android.content.Context, java.lang.String):void");
    }

    public static AnonymousClass1AH A00(File file, File file2, boolean z) {
        AnonymousClass1AH r2;
        if (z) {
            try {
                return new AnonymousClass1AH(file2, false);
            } catch (FileNotFoundException e) {
                if (file.setWritable(true)) {
                    if (z) {
                        r2 = new AnonymousClass1AH(file2, false);
                    } else {
                        r2 = new AnonymousClass1AH(file2, true);
                        if (r2.A01 == null) {
                            r2.close();
                            r2 = null;
                        }
                    }
                    if (!file.setWritable(false)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("error removing ");
                        sb.append(file.getCanonicalPath());
                        sb.append(" write permission");
                        Log.w("SysUtil", sb.toString());
                    }
                    return r2;
                }
                throw e;
            } catch (Throwable th) {
                th = th;
                if (!file.setWritable(false)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error removing ");
                    sb2.append(file.getCanonicalPath());
                    sb2.append(" write permission");
                    Log.w("SysUtil", sb2.toString());
                    throw th;
                }
            }
        } else {
            AnonymousClass1AH r1 = new AnonymousClass1AH(file2, true);
            if (r1.A01 != null) {
                return r1;
            }
            r1.close();
            return null;
        }
        throw th;
    }

    public static void A01(File file, byte b) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
            return;
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public int A02(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        Object obj;
        int A042;
        Map map = this.A04;
        synchronized (map) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        synchronized (obj) {
            A042 = A04(threadPolicy, this.A00, str, i);
        }
        return A042;
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x0485 A[Catch:{ all -> 0x0113, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x049a A[Catch:{ all -> 0x0113, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0530 A[SYNTHETIC, Splitter:B:224:0x0530] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db A[Catch:{ all -> 0x0113, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3 A[Catch:{ all -> 0x0113, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025b A[Catch:{ all -> 0x045f, Exception -> 0x0244, all -> 0x0548 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r43) {
        /*
            r42 = this;
            r32 = r42
            r0 = r32
            java.io.File r6 = r0.A00
            boolean r0 = r6.mkdirs()
            if (r0 != 0) goto L_0x0029
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "cannot mkdir: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0029:
            boolean r30 = r6.canWrite()
            java.lang.String r5 = "error removing "
            java.lang.String r28 = "releasing dso store lock for "
            java.lang.String r26 = " (syncer thread started)"
            java.lang.String r27 = "not releasing dso store lock for "
            r7 = 1
            java.lang.String r4 = " write permission"
            r3 = 0
            java.lang.String r2 = "fb-UnpackingSoSource"
            r31 = 0
            if (r30 != 0) goto L_0x0060
            boolean r0 = r6.setWritable(r7)     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x056d }
            r1.<init>()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "error adding "
            r1.append(r0)     // Catch:{ all -> 0x056d }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x056d }
            r1.append(r0)     // Catch:{ all -> 0x056d }
            r1.append(r4)     // Catch:{ all -> 0x056d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x056d }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x056d }
        L_0x0060:
            java.lang.String r29 = "dso_lock"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x056d }
            r0 = r29
            r1.<init>(r6, r0)     // Catch:{ all -> 0x056d }
            X.1AH r39 = A00(r6, r1, r7)     // Catch:{ all -> 0x056d }
            r0 = r32
            X.1AH r0 = r0.A02     // Catch:{ all -> 0x056f }
            if (r0 != 0) goto L_0x0082
            java.lang.String r1 = "dso_instance_lock"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x056f }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x056f }
            X.1AH r1 = A00(r6, r0, r3)     // Catch:{ all -> 0x056f }
            r0 = r32
            r0.A02 = r1     // Catch:{ all -> 0x056f }
        L_0x0082:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x056f }
            r1.<init>()     // Catch:{ all -> 0x056f }
            java.lang.String r0 = "locked dso store "
            r1.append(r0)     // Catch:{ all -> 0x056f }
            r1.append(r6)     // Catch:{ all -> 0x056f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x056f }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x056f }
            r0 = r32
            boolean r0 = r0 instanceof X.AnonymousClass1AF     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x0118
            r10 = r32
            X.1AF r10 = (X.AnonymousClass1AF) r10     // Catch:{ all -> 0x056f }
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x056f }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x056f }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ all -> 0x056f }
            r9 = 2
            r8.writeByte(r9)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0113 }
            r8.writeString(r0)     // Catch:{ all -> 0x0113 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0113 }
            r8.writeLong(r0)     // Catch:{ all -> 0x0113 }
            android.content.Context r10 = r10.A03     // Catch:{ all -> 0x0113 }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = r10.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            r8.writeInt(r0)     // Catch:{ all -> 0x0113 }
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = r0.nativeLibraryDir     // Catch:{ all -> 0x0113 }
            if (r1 != 0) goto L_0x00e3
            r8.writeByte(r7)     // Catch:{ all -> 0x0113 }
            byte[] r25 = r8.marshall()     // Catch:{ all -> 0x0113 }
            goto L_0x010f
        L_0x00e3:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0113 }
            r0.<init>(r1)     // Catch:{ all -> 0x0113 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x0113 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00fa
            r8.writeByte(r7)     // Catch:{ all -> 0x0113 }
            byte[] r25 = r8.marshall()     // Catch:{ all -> 0x0113 }
            goto L_0x010f
        L_0x00fa:
            r8.writeByte(r9)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0113 }
            r8.writeString(r0)     // Catch:{ all -> 0x0113 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0113 }
            r8.writeLong(r0)     // Catch:{ all -> 0x0113 }
            byte[] r25 = r8.marshall()     // Catch:{ all -> 0x0113 }
        L_0x010f:
            r8.recycle()     // Catch:{ all -> 0x056f }
            goto L_0x014b
        L_0x0113:
            r0 = move-exception
            r8.recycle()     // Catch:{ all -> 0x056f }
            throw r0     // Catch:{ all -> 0x056f }
        L_0x0118:
            android.os.Parcel r10 = android.os.Parcel.obtain()     // Catch:{ all -> 0x056f }
            X.3BQ r11 = r32.A05()     // Catch:{ all -> 0x056f }
            X.9Ud r0 = r11.A00()     // Catch:{ all -> 0x0563 }
            X.9Zk[] r9 = r0.A00     // Catch:{ all -> 0x0563 }
            r10.writeByte(r7)     // Catch:{ all -> 0x0563 }
            int r8 = r9.length     // Catch:{ all -> 0x0563 }
            r10.writeInt(r8)     // Catch:{ all -> 0x0563 }
            r1 = 0
        L_0x012e:
            if (r1 >= r8) goto L_0x0141
            r0 = r9[r1]     // Catch:{ all -> 0x0563 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0563 }
            r10.writeString(r0)     // Catch:{ all -> 0x0563 }
            r0 = r9[r1]     // Catch:{ all -> 0x0563 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0563 }
            r10.writeString(r0)     // Catch:{ all -> 0x0563 }
            int r1 = r1 + 1
            goto L_0x012e
        L_0x0141:
            r11.close()     // Catch:{ all -> 0x056f }
            byte[] r25 = r10.marshall()     // Catch:{ all -> 0x056f }
            r10.recycle()     // Catch:{ all -> 0x056f }
        L_0x014b:
            java.lang.String r24 = "dso_state"
            java.io.File r23 = new java.io.File     // Catch:{ all -> 0x056f }
            r1 = r23
            r0 = r24
            r1.<init>(r6, r0)     // Catch:{ all -> 0x056f }
            java.lang.String r11 = "rw"
            java.io.RandomAccessFile r22 = new java.io.RandomAccessFile     // Catch:{ all -> 0x056f }
            r1 = r22
            r0 = r23
            r1.<init>(r0, r11)     // Catch:{ all -> 0x056f }
            byte r8 = r22.readByte()     // Catch:{ EOFException -> 0x0180 }
            if (r8 == r7) goto L_0x0181
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0180 }
            r1.<init>()     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r0 = "dso store "
            r1.append(r0)     // Catch:{ EOFException -> 0x0180 }
            r1.append(r6)     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r0 = " regeneration interrupted: wiping clean"
            r1.append(r0)     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0180 }
            android.util.Log.v(r2, r0)     // Catch:{ EOFException -> 0x0180 }
        L_0x0180:
            r8 = 0
        L_0x0181:
            r22.close()     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "dso_deps"
            java.io.File r21 = new java.io.File     // Catch:{ all -> 0x056f }
            r0 = r21
            r0.<init>(r6, r15)     // Catch:{ all -> 0x056f }
            java.io.RandomAccessFile r22 = new java.io.RandomAccessFile     // Catch:{ all -> 0x056f }
            r1 = r22
            r1.<init>(r0, r11)     // Catch:{ all -> 0x056f }
            long r0 = r22.length()     // Catch:{ all -> 0x055e }
            int r9 = (int) r0     // Catch:{ all -> 0x055e }
            byte[] r1 = new byte[r9]     // Catch:{ all -> 0x055e }
            r0 = r22
            int r0 = r0.read(r1)     // Catch:{ all -> 0x055e }
            if (r0 == r9) goto L_0x01aa
            java.lang.String r0 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x055e }
            r8 = 0
        L_0x01aa:
            r0 = r25
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x055e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x055e }
            r8 = 0
            goto L_0x01c5
        L_0x01bb:
            if (r8 == 0) goto L_0x01c5
            r0 = r43 & 2
            if (r0 != 0) goto L_0x01c5
            r20 = 0
            goto L_0x0480
        L_0x01c5:
            java.lang.String r0 = "so store dirty: regenerating"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x055e }
            r0 = r23
            A01(r0, r3)     // Catch:{ all -> 0x055e }
            X.3BQ r19 = r32.A05()     // Catch:{ all -> 0x055e }
            X.9Ud r20 = r19.A00()     // Catch:{ all -> 0x0554 }
            X.3BP r18 = r19.A01()     // Catch:{ all -> 0x0554 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0552 }
            r1.<init>()     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "regenerating DSO store "
            r1.append(r0)     // Catch:{ all -> 0x0552 }
            java.lang.Class r0 = r32.getClass()     // Catch:{ all -> 0x0552 }
            java.lang.String r17 = r0.getName()     // Catch:{ all -> 0x0552 }
            r0 = r17
            r1.append(r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0552 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r12 = "dso_manifest"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0552 }
            r1.<init>(r6, r12)     // Catch:{ all -> 0x0552 }
            java.io.RandomAccessFile r16 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0552 }
            r0 = r16
            r0.<init>(r1, r11)     // Catch:{ all -> 0x0552 }
            if (r8 != r7) goto L_0x024a
            byte r0 = r16.readByte()     // Catch:{ Exception -> 0x0244 }
            if (r0 != r7) goto L_0x023b
            int r13 = r16.readInt()     // Catch:{ Exception -> 0x0244 }
            if (r13 < 0) goto L_0x0233
            X.9Zk[] r10 = new X.C183739Zk[r13]     // Catch:{ Exception -> 0x0244 }
            r9 = 0
        L_0x0219:
            if (r9 >= r13) goto L_0x022d
            java.lang.String r8 = r16.readUTF()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = r16.readUTF()     // Catch:{ Exception -> 0x0244 }
            X.9Zk r0 = new X.9Zk     // Catch:{ Exception -> 0x0244 }
            r0.<init>(r8, r1)     // Catch:{ Exception -> 0x0244 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0244 }
            int r9 = r9 + 1
            goto L_0x0219
        L_0x022d:
            X.9Ud r13 = new X.9Ud     // Catch:{ Exception -> 0x0244 }
            r13.<init>(r10)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0251
        L_0x0233:
            java.lang.String r0 = "illegal number of shared libraries"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0244 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0243
        L_0x023b:
            java.lang.String r0 = "wrong dso manifest version"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0244 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x0243:
            throw r1     // Catch:{ Exception -> 0x0244 }
        L_0x0244:
            r1 = move-exception
            java.lang.String r0 = "error reading existing DSO manifest"
            android.util.Log.i(r2, r0, r1)     // Catch:{ all -> 0x0548 }
        L_0x024a:
            X.9Zk[] r0 = new X.C183739Zk[r3]     // Catch:{ all -> 0x0548 }
            X.9Ud r13 = new X.9Ud     // Catch:{ all -> 0x0548 }
            r13.<init>(r0)     // Catch:{ all -> 0x0548 }
        L_0x0251:
            r0 = r20
            X.9Zk[] r10 = r0.A00     // Catch:{ all -> 0x0548 }
            java.lang.String[] r9 = r6.list()     // Catch:{ all -> 0x0548 }
            if (r9 == 0) goto L_0x0530
            r8 = 0
        L_0x025c:
            int r0 = r9.length     // Catch:{ all -> 0x0548 }
            if (r8 >= r0) goto L_0x02b5
            r0 = r9[r8]     // Catch:{ all -> 0x0548 }
            r1 = r24
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0548 }
            if (r1 != 0) goto L_0x02b2
            r1 = r29
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0548 }
            if (r1 != 0) goto L_0x02b2
            java.lang.String r1 = "dso_instance_lock"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0548 }
            if (r1 != 0) goto L_0x02b2
            boolean r1 = r0.equals(r15)     // Catch:{ all -> 0x0548 }
            if (r1 != 0) goto L_0x02b2
            boolean r1 = r0.equals(r12)     // Catch:{ all -> 0x0548 }
            if (r1 != 0) goto L_0x02b2
            r1 = 0
        L_0x0286:
            int r14 = r10.length     // Catch:{ all -> 0x0548 }
            if (r1 >= r14) goto L_0x0296
            r14 = r10[r1]     // Catch:{ all -> 0x0548 }
            java.lang.String r14 = r14.A01     // Catch:{ all -> 0x0548 }
            boolean r14 = r14.equals(r0)     // Catch:{ all -> 0x0548 }
            if (r14 != 0) goto L_0x02b2
            int r1 = r1 + 1
            goto L_0x0286
        L_0x0296:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0548 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0548 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0548 }
            r0.<init>()     // Catch:{ all -> 0x0548 }
            java.lang.String r14 = "deleting unaccounted-for file "
            r0.append(r14)     // Catch:{ all -> 0x0548 }
            r0.append(r1)     // Catch:{ all -> 0x0548 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0548 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0548 }
            X.C62732rs.A00(r1)     // Catch:{ all -> 0x0548 }
        L_0x02b2:
            int r8 = r8 + 1
            goto L_0x025c
        L_0x02b5:
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0548 }
            r24 = r0
        L_0x02bc:
            boolean r0 = r18.A01()     // Catch:{ all -> 0x0548 }
            if (r0 == 0) goto L_0x0464
            X.3BS r12 = r18.A00()     // Catch:{ all -> 0x0548 }
            r14 = 1
            r8 = 0
        L_0x02c8:
            X.9Zk[] r1 = r13.A00     // Catch:{ all -> 0x045a }
            int r0 = r1.length     // Catch:{ all -> 0x045a }
            if (r8 >= r0) goto L_0x02ec
            X.9Zk r9 = r12.A00     // Catch:{ all -> 0x045a }
            java.lang.String r10 = r9.A01     // Catch:{ all -> 0x045a }
            r0 = r1[r8]     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x045a }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x045a }
            if (r0 == 0) goto L_0x02e8
            r0 = r1[r8]     // Catch:{ all -> 0x045a }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x045a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x045a }
            if (r0 == 0) goto L_0x02e8
            goto L_0x02eb
        L_0x02e8:
            int r8 = r8 + 1
            goto L_0x02c8
        L_0x02eb:
            r14 = 0
        L_0x02ec:
            X.9Zk r0 = r12.A00     // Catch:{ all -> 0x045a }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x045a }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x045a }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x045a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x045a }
            if (r0 == 0) goto L_0x02fd
            if (r14 == 0) goto L_0x03df
        L_0x02fd:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x045a }
            r8.<init>()     // Catch:{ all -> 0x045a }
            java.lang.String r0 = "extracting DSO "
            r8.append(r0)     // Catch:{ all -> 0x045a }
            r8.append(r1)     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x045a }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x045a }
            boolean r0 = r6.setWritable(r7)     // Catch:{ all -> 0x0439 }
            if (r0 == 0) goto L_0x0422
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0439 }
            r10.<init>(r6, r1)     // Catch:{ all -> 0x0439 }
            r9 = 0
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x03fb }
            if (r0 == 0) goto L_0x033d
            boolean r0 = r10.setWritable(r7)     // Catch:{ IOException -> 0x03fb }
            if (r0 != 0) goto L_0x033d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fb }
            r1.<init>()     // Catch:{ IOException -> 0x03fb }
            java.lang.String r0 = "error adding write permission to: "
            r1.append(r0)     // Catch:{ IOException -> 0x03fb }
            r1.append(r10)     // Catch:{ IOException -> 0x03fb }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x03fb }
            android.util.Log.w(r2, r0)     // Catch:{ IOException -> 0x03fb }
        L_0x033d:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0343 }
            r1.<init>(r10, r11)     // Catch:{ IOException -> 0x0343 }
            goto L_0x0365
        L_0x0343:
            r1 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fb }
            r8.<init>()     // Catch:{ IOException -> 0x03fb }
            java.lang.String r0 = "error overwriting "
            r8.append(r0)     // Catch:{ IOException -> 0x03fb }
            r8.append(r10)     // Catch:{ IOException -> 0x03fb }
            java.lang.String r0 = " trying to delete and start over"
            r8.append(r0)     // Catch:{ IOException -> 0x03fb }
            java.lang.String r0 = r8.toString()     // Catch:{ IOException -> 0x03fb }
            android.util.Log.w(r2, r0, r1)     // Catch:{ IOException -> 0x03fb }
            X.C62732rs.A00(r10)     // Catch:{ IOException -> 0x03fb }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x03fb }
            r1.<init>(r10, r11)     // Catch:{ IOException -> 0x03fb }
        L_0x0365:
            r9 = r1
            java.io.InputStream r15 = r12.A01     // Catch:{ IOException -> 0x03fb }
            int r0 = r15.available()     // Catch:{ IOException -> 0x03fb }
            if (r0 <= r7) goto L_0x0376
            java.io.FileDescriptor r8 = r1.getFD()     // Catch:{ IOException -> 0x03fb }
            long r0 = (long) r0     // Catch:{ IOException -> 0x03fb }
            com.facebook.soloader.SysUtil$LollipopSysdeps.fallocateIfSupported(r8, r0)     // Catch:{ IOException -> 0x03fb }
        L_0x0376:
            r14 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
        L_0x037a:
            r1 = 32768(0x8000, float:4.5918E-41)
            int r0 = r14 - r8
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ IOException -> 0x03fb }
            r0 = r24
            int r1 = r15.read(r0, r3, r1)     // Catch:{ IOException -> 0x03fb }
            r0 = -1
            if (r1 == r0) goto L_0x0395
            r0 = r24
            r9.write(r0, r3, r1)     // Catch:{ IOException -> 0x03fb }
            int r8 = r8 + r1
            if (r8 >= r14) goto L_0x0395
            goto L_0x037a
        L_0x0395:
            long r0 = r9.getFilePointer()     // Catch:{ IOException -> 0x03fb }
            r9.setLength(r0)     // Catch:{ IOException -> 0x03fb }
            boolean r0 = r10.setExecutable(r7, r3)     // Catch:{ IOException -> 0x03fb }
            if (r0 == 0) goto L_0x03e4
            boolean r0 = r10.setWritable(r3)     // Catch:{ all -> 0x0439 }
            if (r0 != 0) goto L_0x03bd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0439 }
            r0.<init>()     // Catch:{ all -> 0x0439 }
            r0.append(r5)     // Catch:{ all -> 0x0439 }
            r0.append(r10)     // Catch:{ all -> 0x0439 }
            r0.append(r4)     // Catch:{ all -> 0x0439 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0439 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0439 }
        L_0x03bd:
            r9.close()     // Catch:{ all -> 0x0439 }
            boolean r0 = r6.setWritable(r3)     // Catch:{ all -> 0x045a }
            if (r0 != 0) goto L_0x03df
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x045a }
            r1.<init>()     // Catch:{ all -> 0x045a }
            r1.append(r5)     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x045a }
            r1.append(r0)     // Catch:{ all -> 0x045a }
            r1.append(r4)     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x045a }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x045a }
        L_0x03df:
            r12.close()     // Catch:{ all -> 0x0548 }
            goto L_0x02bc
        L_0x03e4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fb }
            r1.<init>()     // Catch:{ IOException -> 0x03fb }
            java.lang.String r0 = "cannot make file executable: "
            r1.append(r0)     // Catch:{ IOException -> 0x03fb }
            r1.append(r10)     // Catch:{ IOException -> 0x03fb }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03fb }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x03fb }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03fb }
            throw r0     // Catch:{ IOException -> 0x03fb }
        L_0x03fb:
            r0 = move-exception
            X.C62732rs.A00(r10)     // Catch:{ all -> 0x0400 }
            throw r0     // Catch:{ all -> 0x0400 }
        L_0x0400:
            r1 = move-exception
            boolean r0 = r10.setWritable(r3)     // Catch:{ all -> 0x0439 }
            if (r0 != 0) goto L_0x041c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0439 }
            r0.<init>()     // Catch:{ all -> 0x0439 }
            r0.append(r5)     // Catch:{ all -> 0x0439 }
            r0.append(r10)     // Catch:{ all -> 0x0439 }
            r0.append(r4)     // Catch:{ all -> 0x0439 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0439 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0439 }
        L_0x041c:
            if (r9 == 0) goto L_0x0421
            r9.close()     // Catch:{ all -> 0x0439 }
        L_0x0421:
            throw r1     // Catch:{ all -> 0x0439 }
        L_0x0422:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0439 }
            r1.<init>()     // Catch:{ all -> 0x0439 }
            java.lang.String r0 = "cannot make directory writable for us: "
            r1.append(r0)     // Catch:{ all -> 0x0439 }
            r1.append(r6)     // Catch:{ all -> 0x0439 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0439 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0439 }
            r0.<init>(r1)     // Catch:{ all -> 0x0439 }
            throw r0     // Catch:{ all -> 0x0439 }
        L_0x0439:
            r7 = move-exception
            boolean r0 = r6.setWritable(r3)     // Catch:{ all -> 0x045a }
            if (r0 != 0) goto L_0x0459
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x045a }
            r1.<init>()     // Catch:{ all -> 0x045a }
            r1.append(r5)     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x045a }
            r1.append(r0)     // Catch:{ all -> 0x045a }
            r1.append(r4)     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x045a }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x045a }
        L_0x0459:
            throw r7     // Catch:{ all -> 0x045a }
        L_0x045a:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x045f }
            goto L_0x0463
        L_0x045f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0548 }
        L_0x0463:
            throw r1     // Catch:{ all -> 0x0548 }
        L_0x0464:
            r16.close()     // Catch:{ all -> 0x0552 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0552 }
            r1.<init>()     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "Finished regenerating DSO store "
            r1.append(r0)     // Catch:{ all -> 0x0552 }
            r0 = r17
            r1.append(r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0552 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0552 }
            r19.close()     // Catch:{ all -> 0x055e }
        L_0x0480:
            r22.close()     // Catch:{ all -> 0x056f }
            if (r20 != 0) goto L_0x049a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x056f }
            r1.<init>()     // Catch:{ all -> 0x056f }
            java.lang.String r0 = "dso store is up-to-date: "
            r1.append(r0)     // Catch:{ all -> 0x056f }
            r1.append(r6)     // Catch:{ all -> 0x056f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x056f }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x056f }
            goto L_0x04db
        L_0x049a:
            r0 = r43 & 4
            if (r0 != 0) goto L_0x04dd
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x056f }
            X.AkV r7 = new X.AkV     // Catch:{ all -> 0x056f }
            r33 = r7
            r34 = r32
            r35 = r21
            r36 = r25
            r37 = r20
            r38 = r23
            r41 = r3
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x056f }
            r0 = r43 & 1
            if (r0 == 0) goto L_0x04d7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x056f }
            r1.<init>()     // Catch:{ all -> 0x056f }
            java.lang.String r0 = "SoSync:"
            r1.append(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r0 = r6.getName()     // Catch:{ all -> 0x056f }
            r1.append(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x056f }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ all -> 0x056f }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x056f }
            r0.start()     // Catch:{ all -> 0x056f }
            goto L_0x04dd
        L_0x04d7:
            r7.run()     // Catch:{ all -> 0x056f }
            goto L_0x04dd
        L_0x04db:
            r31 = r39
        L_0x04dd:
            if (r30 != 0) goto L_0x04fe
            boolean r0 = r6.setWritable(r3)
            if (r0 != 0) goto L_0x04fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r6.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x04fe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r31 == 0) goto L_0x0518
            r1.<init>()
            r0 = r28
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            r31.close()
            return
        L_0x0518:
            r1.<init>()
            r0 = r27
            r1.append(r0)
            r1.append(r6)
            r0 = r26
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            return
        L_0x0530:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0548 }
            r1.<init>()     // Catch:{ all -> 0x0548 }
            java.lang.String r0 = "unable to list directory "
            r1.append(r0)     // Catch:{ all -> 0x0548 }
            r1.append(r6)     // Catch:{ all -> 0x0548 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0548 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0548 }
            r0.<init>(r1)     // Catch:{ all -> 0x0548 }
            throw r0     // Catch:{ all -> 0x0548 }
        L_0x0548:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x054d }
            goto L_0x0551
        L_0x054d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0552 }
        L_0x0551:
            throw r1     // Catch:{ all -> 0x0552 }
        L_0x0552:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0554 }
        L_0x0554:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0559 }
            goto L_0x055d
        L_0x0559:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x055e }
        L_0x055d:
            throw r1     // Catch:{ all -> 0x055e }
        L_0x055e:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0568 }
            goto L_0x056c
        L_0x0563:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0568 }
            goto L_0x056c
        L_0x0568:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x056f }
        L_0x056c:
            throw r1     // Catch:{ all -> 0x056f }
        L_0x056d:
            r7 = move-exception
            goto L_0x0572
        L_0x056f:
            r7 = move-exception
            r31 = r39
        L_0x0572:
            if (r30 != 0) goto L_0x0593
            boolean r0 = r6.setWritable(r3)
            if (r0 != 0) goto L_0x0593
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r6.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x0593:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r31 == 0) goto L_0x05ad
            r1.<init>()
            r0 = r28
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            r31.close()
            throw r7
        L_0x05ad:
            r1.<init>()
            r0 = r27
            r1.append(r0)
            r1.append(r6)
            r0 = r26
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AE.A03(int):void");
    }
}
