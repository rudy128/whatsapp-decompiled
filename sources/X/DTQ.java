package X;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class DTQ implements Runnable {
    public final AtomicInteger A00 = BE7.A0v();

    public abstract void A01();

    public abstract void A02(Exception exc);

    public abstract void A04(Object obj);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.DBJ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4 != null) goto L_0x005d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C22865BSt
            if (r0 == 0) goto L_0x0086
            r5 = r8
            X.BSt r5 = (X.C22865BSt) r5
            int r0 = r5.A00
            r3 = 0
            if (r0 != 0) goto L_0x0085
            java.lang.Object r2 = r5.A01     // Catch:{ IllegalArgumentException -> 0x0025 }
            X.DD6 r2 = (X.DD6) r2     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.Object r0 = r5.A02     // Catch:{ IllegalArgumentException -> 0x0025 }
            X.Cbv r0 = (X.C25256Cbv) r0     // Catch:{ IllegalArgumentException -> 0x0025 }
            android.net.Uri r1 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0025 }
            android.content.ContentResolver r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.String r1 = X.C20012A3c.A00(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r1 == 0) goto L_0x0025
            r0 = 1
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.createVideoThumbnail(r1, r0)
            if (r4 != 0) goto L_0x005d
        L_0x0025:
            java.lang.Object r0 = r5.A01
            X.DD6 r0 = (X.DD6) r0
            android.content.ContentResolver r2 = r0.A00
            java.lang.Object r0 = r5.A02
            X.Cbv r0 = (X.C25256Cbv) r0
            android.net.Uri r1 = r0.A03
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r0 = r2.openFileDescriptor(r1, r0)     // Catch:{ all -> 0x005b }
            X.C26208Cuj.A01(r0)     // Catch:{ all -> 0x005b }
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x005b }
            r2.<init>()     // Catch:{ all -> 0x005b }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0057, all -> 0x0052 }
            r2.setDataSource(r0)     // Catch:{ FileNotFoundException -> 0x0057, all -> 0x0052 }
            r0 = -1
            android.graphics.Bitmap r4 = r2.getFrameAtTime(r0)     // Catch:{ FileNotFoundException -> 0x0057, all -> 0x0052 }
            r2.release()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            if (r4 != 0) goto L_0x005d
            return r3
        L_0x0052:
            r0 = move-exception
            r2.release()     // Catch:{ IOException -> 0x005c }
            throw r0
        L_0x0057:
            r2.release()     // Catch:{ FileNotFoundException -> 0x0085 }
            return r3
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            throw r0
        L_0x005d:
            X.DBJ r1 = X.DBJ.A00
            if (r1 != 0) goto L_0x0068
            X.DBJ r1 = new X.DBJ
            r1.<init>()
            X.DBJ.A00 = r1
        L_0x0068:
            X.CYh r0 = X.C25112CYh.A03
            X.BSE r3 = new X.BSE
            r3.<init>(r4, r1, r0)
            java.lang.Object r2 = r5.A04
            X.EBY r2 = (X.EBY) r2
            java.lang.String r1 = "image_format"
            java.lang.String r0 = "thumbnail"
            r2.CD2(r1, r0)
            java.util.Map r0 = r2.BRV()
            r3.CD3(r0)
            X.DRN r3 = X.DRN.A01(r3)
        L_0x0085:
            return r3
        L_0x0086:
            r1 = r8
            X.BSq r1 = (X.C22862BSq) r1
            X.Cbv r0 = r1.A01
            android.net.Uri r0 = r0.A03
            X.DDK r1 = r1.A00
            android.media.ExifInterface r4 = r1.A01(r0)
            if (r4 == 0) goto L_0x0169
            boolean r0 = r4.hasThumbnail()
            if (r0 == 0) goto L_0x0169
            byte[] r5 = r4.getThumbnail()
            X.C26208Cuj.A01(r5)
            X.CVg r0 = r1.A00
            r3 = 0
            X.C18070vi.A0d(r5, r3)
            X.BSG r2 = r0.A01
            int r0 = r5.length
            X.Bxi r1 = new X.Bxi
            r1.<init>(r2, r0)
            r1.write(r5, r3, r0)     // Catch:{ IOException -> 0x015e }
            X.DRG r5 = r1.A00()     // Catch:{ IOException -> 0x015e }
            r1.close()
            X.BxY r2 = new X.BxY
            r2.<init>(r5)
            X.0vl r7 = X.C26077Crr.A00
            java.lang.Object r0 = r7.getValue()
            X.1bS r0 = (X.C29021bS) r0
            java.lang.Object r3 = r0.BAf()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 != 0) goto L_0x00d8
            r0 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
            X.C18070vi.A0X(r3)
        L_0x00d8:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            byte[] r0 = r3.array()     // Catch:{ all -> 0x0153 }
            r1.inTempStorage = r0     // Catch:{ all -> 0x0153 }
            r6 = 0
            android.graphics.BitmapFactory.decodeStream(r2, r6, r1)     // Catch:{ all -> 0x0153 }
            int r2 = r1.outWidth     // Catch:{ all -> 0x0153 }
            r0 = -1
            if (r2 == r0) goto L_0x00fb
            int r1 = r1.outHeight     // Catch:{ all -> 0x0153 }
            if (r1 == r0) goto L_0x00fb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0153 }
            android.util.Pair r6 = X.C17890vO.A0E(r0, r1)     // Catch:{ all -> 0x0153 }
        L_0x00fb:
            java.lang.Object r0 = r7.getValue()
            X.1bS r0 = (X.C29021bS) r0
            r0.CEF(r3)
            java.lang.String r0 = "Orientation"
            java.lang.String r0 = r4.getAttribute(r0)
            X.C26208Cuj.A01(r0)
            int r1 = java.lang.Integer.parseInt(r0)
            r4 = 0
            if (r1 == 0) goto L_0x0123
            r0 = 1
            if (r1 == r0) goto L_0x0123
            r0 = 3
            if (r1 == r0) goto L_0x0138
            r0 = 6
            if (r1 == r0) goto L_0x0135
            r0 = 8
            if (r1 != r0) goto L_0x0123
            r4 = 270(0x10e, float:3.78E-43)
        L_0x0123:
            r3 = -1
            if (r6 == 0) goto L_0x0133
            int r2 = X.C108965cb.A01(r6)
            int r3 = X.C108965cb.A00(r6)
        L_0x012e:
            X.DRN r1 = X.DRN.A01(r5)
            goto L_0x013b
        L_0x0133:
            r2 = -1
            goto L_0x012e
        L_0x0135:
            r4 = 90
            goto L_0x0123
        L_0x0138:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x0123
        L_0x013b:
            X.DRJ r5 = new X.DRJ     // Catch:{ all -> 0x014e }
            r5.<init>(r1)     // Catch:{ all -> 0x014e }
            r1.close()
            X.Clu r0 = X.CIN.A06
            r5.A07 = r0
            r5.A02 = r4
            r5.A05 = r2
            r5.A01 = r3
            return r5
        L_0x014e:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x0153:
            r1 = move-exception
            java.lang.Object r0 = r7.getValue()
            X.1bS r0 = (X.C29021bS) r0
            r0.CEF(r3)
            throw r1
        L_0x015e:
            r0 = move-exception
            X.C24546C8r.A00(r0)     // Catch:{ all -> 0x0164 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x0169:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DTQ.A00():java.lang.Object");
    }

    public void A03(Object obj) {
        DRN drn;
        if (!(this instanceof C22865BSt)) {
            DRJ drj = (DRJ) obj;
            if (drj != null) {
                drj.close();
            }
        } else if (((C22865BSt) this).A00 == 0 && (drn = (DRN) obj) != null) {
            drn.close();
        }
    }

    public final void run() {
        AtomicInteger atomicInteger = this.A00;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object A002 = A00();
                atomicInteger.set(3);
                try {
                    A04(A002);
                } finally {
                    A03(A002);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                A02(e);
            }
        }
    }
}
