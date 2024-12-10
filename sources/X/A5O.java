package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class A5O {
    public static final Bitmap A07 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public boolean A00 = false;
    public AiK A01;
    public final C002100z A02;
    public final C58622kz A03;
    public final long A04;
    public final File A05;
    public final Object A06 = C17880vN.A0p();

    private void A00() {
        synchronized (this.A06) {
            AiK aiK = this.A01;
            if (aiK == null || aiK.A02 == null) {
                File file = this.A05;
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    C17900vP.A0X(file, "BitmapCache/initDiskCache: unable to create cache dir ", AnonymousClass000.A10());
                }
                long usableSpace = file.getUsableSpace();
                long j = this.A04;
                if (usableSpace > j) {
                    try {
                        this.A01 = AiK.A01((C183489Yl) null, file, j);
                    } catch (IOException e) {
                        Log.e("BitmapCache/initDiskCache ", e);
                    }
                }
            }
        }
    }

    public Bitmap A01(String str) {
        Bitmap bitmap = (Bitmap) this.A02.A04(str);
        if (bitmap != null && this.A00) {
            this.A03.A01(bitmap.getWidth(), bitmap.getHeight(), str);
        }
        return bitmap;
    }

    public void A03(Bitmap bitmap, String str) {
        C002100z r1 = this.A02;
        synchronized (r1) {
            r1.A08(str, bitmap);
            r1.A02();
            r1.A01();
        }
    }

    public void A05(boolean z) {
        C002100z r1 = this.A02;
        synchronized (r1) {
            r1.A07(-1);
        }
        synchronized (this.A06) {
            AiK aiK = this.A01;
            if (aiK != null) {
                if (z) {
                    try {
                        aiK.close();
                        AiK.A07(aiK.A06);
                    } catch (IOException e) {
                        Log.e("BitmapCache/close ", e);
                    }
                }
                AiK aiK2 = this.A01;
                if (aiK2.A02 != null) {
                    aiK2.close();
                }
                this.A01 = null;
            }
        }
    }

    public A5O(File file, long j) {
        this.A05 = file;
        this.A04 = j;
        AnonymousClass8E4 r1 = new AnonymousClass8E4(this, (int) (C19620yd.A00 / 8192));
        this.A02 = r1;
        this.A03 = new C58622kz(r1);
    }

    public Bitmap A02(String str, int i, int i2, boolean z) {
        Bitmap bitmap;
        C21326AiB aiB;
        Bitmap bitmap2;
        A00();
        synchronized (this.A06) {
            AiK aiK = this.A01;
            bitmap = null;
            if (aiK != null) {
                try {
                    aiB = aiK.A0B(str);
                } catch (IOException unused) {
                    Log.e("BitmapCache/journal corrupted");
                    aiB = null;
                }
                if (aiB != null) {
                    try {
                        InputStream inputStream = aiB.A00[0];
                        if (inputStream != null) {
                            if (z) {
                                try {
                                    bitmap2 = AnonymousClass204.A08(this.A03, new AnonymousClass25O(i, i2), inputStream, true).A02;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th2) {
                                        AnonymousClass0DT.A00(th, th2);
                                    }
                                    throw th;
                                }
                            } else {
                                bitmap2 = AnonymousClass204.A0B(new AnonymousClass25O(i, i2), inputStream).A02;
                            }
                            if (bitmap2 == null) {
                                try {
                                    Log.e("BitmapCache/decode failed");
                                    try {
                                        inputStream.close();
                                    } catch (IOException e) {
                                        e = e;
                                        bitmap = bitmap2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmap = bitmap2;
                                    inputStream.close();
                                    throw th;
                                }
                            } else {
                                bitmap = bitmap2;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        C17900vP.A0X(e, "BitmapCache/ IO exception on diskcache: ", AnonymousClass000.A10());
                        return bitmap;
                    }
                }
            }
        }
        return bitmap;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A04(java.io.InputStream r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.A00()
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            X.AiK r0 = r3.A01     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004d
            X.AiB r0 = r0.A0B(r5)     // Catch:{ Exception -> 0x003c }
            r1 = 0
            if (r0 != 0) goto L_0x0031
            X.AiK r0 = r3.A01     // Catch:{ Exception -> 0x003c }
            X.9oK r1 = X.AiK.A00(r0, r5)     // Catch:{ Exception -> 0x003c }
            if (r1 == 0) goto L_0x0038
            X.9HU r0 = r1.A00()     // Catch:{ Exception -> 0x003c }
            X.C64062u9.A00(r4, r0)     // Catch:{ all -> 0x0027 }
            r1.A01()     // Catch:{ all -> 0x0027 }
            r0.close()     // Catch:{ Exception -> 0x003c }
            goto L_0x0038
        L_0x0027:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x003c }
        L_0x0030:
            throw r1     // Catch:{ Exception -> 0x003c }
        L_0x0031:
            java.io.InputStream[] r0 = r0.A00     // Catch:{ Exception -> 0x003c }
            r0 = r0[r1]     // Catch:{ Exception -> 0x003c }
            r0.close()     // Catch:{ Exception -> 0x003c }
        L_0x0038:
            X.AiK r0 = r3.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
            goto L_0x004c
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "BitmapCache/download "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            r1 = move-exception
            X.AiK r0 = r3.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1     // Catch:{ all -> 0x004f }
        L_0x0049:
            X.AiK r0 = r3.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5O.A04(java.io.InputStream, java.lang.String):void");
    }
}
