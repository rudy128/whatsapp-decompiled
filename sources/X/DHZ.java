package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.net.Uri;
import java.util.List;

public class DHZ implements EAT {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Context A04;
    public Uri A05;
    public DRN A06;
    public CWZ A07;
    public EAS A08;
    public CUT A09;
    public E7t A0A;
    public boolean A0B;
    public boolean A0C;
    public long A0D;
    public boolean A0E;

    public C25225CbM BUZ() {
        return null;
    }

    public boolean BeS() {
        return false;
    }

    public void CRW(A5W a5w) {
    }

    public void CS4() {
    }

    public void cancel() {
    }

    /* JADX INFO: finally extract failed */
    private void A00() {
        DRN drn;
        if (!this.A0B) {
            drn = null;
            try {
                DRN drn2 = this.A06;
                drn2.getClass();
                EAS eas = this.A08;
                eas.getClass();
                eas.CQV(this.A01, (Bitmap) drn2.A05());
                DRN drn3 = this.A06;
                if (drn3 != null) {
                    drn3.close();
                    this.A06 = null;
                }
                this.A0B = true;
            } catch (Throwable th) {
                DRN drn4 = this.A06;
                if (drn4 != null) {
                    drn4.close();
                    this.A06 = drn;
                }
                throw th;
            }
        } else if (this.A0C) {
            drn = null;
            DRN A002 = this.A07.A00();
            this.A06 = A002;
            if (A002 != null) {
                EAS eas2 = this.A08;
                eas2.getClass();
                eas2.CQV(this.A01, (Bitmap) A002.A05());
            }
            DRN drn5 = this.A06;
            if (drn5 != null) {
                drn5.close();
                this.A06 = null;
            }
        }
    }

    public void BFX(int i) {
        boolean z;
        long j;
        this.A01 = i;
        CUT cut = this.A09;
        C26052CrM crM = cut.A06;
        crM.getClass();
        C25833Cmm A032 = crM.A03(C24322BzJ.VIDEO, this.A01);
        if (A032 != null) {
            List list = A032.A04;
            if (!C17880vN.A10(list).isEmpty()) {
                int i2 = ((C25271CcJ) C17880vN.A10(list).get(0)).A00;
                long j2 = BE9.A0Q(list).A02;
                this.A0D = j2;
                CZT czt = cut.A08;
                if (czt instanceof BWB) {
                    z = AnonymousClass000.A1O(((BWB) czt).A01 ? 1 : 0);
                } else {
                    z = false;
                }
                this.A0E = z;
                long j3 = C24707CGt.A00;
                if (z) {
                    j = j2 - 1;
                } else if (i2 > 0) {
                    j = (long) (BEA.A01() / ((double) i2));
                } else {
                    j = C24707CGt.A00;
                }
                this.A03 = j;
            }
        }
        this.A08 = this.A0A.BHI();
    }

    public long BQJ() {
        return this.A02;
    }

    public void release() {
        EAS eas = this.A08;
        if (eas != null) {
            eas.finish();
        }
        DRN drn = this.A06;
        if (drn != null) {
            drn.close();
        }
        CWZ cwz = this.A07;
        cwz.A01 = null;
        cwz.A03 = null;
        DRN drn2 = cwz.A02;
        if (drn2 != null) {
            drn2.close();
        }
        cwz.A02 = null;
        cwz.A00 = 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00f1 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec A[Catch:{ Exception -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r18 = this;
            r4 = r18
            X.CUT r0 = r4.A09
            X.CrM r2 = r0.A06
            r2.getClass()
            X.BzJ r1 = X.C24322BzJ.VIDEO
            int r0 = r4.A01
            X.Cmm r0 = r2.A03(r1, r0)
            r0.getClass()
            java.util.List r0 = r0.A04
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            X.CcJ r0 = (X.C25271CcJ) r0
            java.io.File r0 = r0.A05
            X.C26171Ctn.A02(r0)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            r4.A05 = r1
            X.CWZ r8 = r4.A07
            android.content.Context r0 = r4.A04
            boolean r7 = X.C18070vi.A17(r0, r1)
            r6 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0117 }
            java.io.InputStream r5 = r0.openInputStream(r1)     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x00f9
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()     // Catch:{ Exception -> 0x00f0, all -> 0x00e5 }
            X.Cv2 r10 = new X.Cv2     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r10.<init>(r5, r2)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r10.A04()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            if (r0 <= 0) goto L_0x005c
            r5.close()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            java.io.ByteArrayInputStream r5 = X.BE6.A0h(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
        L_0x005c:
            boolean r0 = r5 instanceof java.io.FileInputStream     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            if (r0 == 0) goto L_0x0081
            r0 = r5
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            java.nio.channels.FileChannel r9 = r0.getChannel()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r0 = 0
            r9.position(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
        L_0x006c:
            android.graphics.Movie r16 = android.graphics.Movie.decodeStream(r5)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            boolean r0 = r10.A01     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            if (r0 == 0) goto L_0x00d5
            java.util.List r0 = r10.A05     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r17 = r0
            int r13 = r17.size()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            goto L_0x0085
        L_0x0081:
            r5.reset()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            goto L_0x006c
        L_0x0085:
            r12 = 0
            r11 = 0
        L_0x0087:
            if (r12 >= r13) goto L_0x00b2
            boolean r0 = r10.A01     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            if (r0 == 0) goto L_0x00dc
            int r0 = r17.size()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r15 = 1
            if (r12 >= r0) goto L_0x009e
            r0 = r17
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r15 = r0[r7]     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
        L_0x009e:
            int r11 = r11 + r15
            int r14 = r16.width()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            int r1 = r16.height()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            X.CRQ r0 = new X.CRQ     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r0.<init>(r11, r15, r14, r1)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r9.add(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            int r12 = r12 + 1
            goto L_0x0087
        L_0x00b2:
            r0 = r16
            r8.A01 = r0     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r8.A03 = r9     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            X.DRN r1 = r8.A00()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            r8.A02 = r1     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            if (r0 <= r7) goto L_0x00cb
            X.By7 r0 = X.C24249By7.AnimatedImage     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
        L_0x00c6:
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            goto L_0x00ce
        L_0x00cb:
            X.By7 r0 = X.C24249By7.StaticImage     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            goto L_0x00c6
        L_0x00ce:
            r5.close()     // Catch:{ Exception -> 0x00fe }
            r2.close()     // Catch:{ Exception -> 0x00fe }
            goto L_0x00fe
        L_0x00d5:
            java.lang.String r0 = "getFrameCount called before extract"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
            goto L_0x00e2
        L_0x00dc:
            java.lang.String r0 = "getFrameDurationMs called before extract"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
        L_0x00e2:
            throw r0     // Catch:{ Exception -> 0x00f1, all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            r2 = r6
        L_0x00e7:
            r5.close()     // Catch:{ Exception -> 0x0118 }
            if (r2 == 0) goto L_0x0118
            r2.close()     // Catch:{ Exception -> 0x0118 }
            throw r0
        L_0x00f0:
            r2 = r6
        L_0x00f1:
            r5.close()     // Catch:{ Exception -> 0x00f9 }
            if (r2 == 0) goto L_0x00f9
            r2.close()     // Catch:{ Exception -> 0x00f9 }
        L_0x00f9:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r6, r6)
        L_0x00fe:
            java.lang.Object r2 = r0.first
            X.DRN r2 = (X.DRN) r2
            r4.A06 = r2
            java.lang.Object r1 = r0.second
            X.By7 r0 = X.C24249By7.AnimatedImage
            if (r1 != r0) goto L_0x010b
            r3 = 1
        L_0x010b:
            r4.A0C = r3
            if (r2 == 0) goto L_0x0110
            return
        L_0x0110:
            java.lang.String r0 = "Bitmap cannot be loaded"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0117:
            r0 = move-exception
        L_0x0118:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHZ.start():void");
    }

    public long BI6() {
        int i;
        int i2;
        A00();
        if (this.A0C) {
            CWZ cwz = this.A07;
            if (cwz.A02 != null) {
                long j = this.A02;
                int i3 = this.A00;
                List list = cwz.A03;
                if (list == null || list.size() <= i3) {
                    i = 0;
                } else {
                    i = ((CRQ) list.get(i3)).A00;
                }
                this.A02 = j + C17890vO.A03(i);
                int i4 = this.A00 + 1;
                this.A00 = i4;
                List list2 = cwz.A03;
                if (list2 != null) {
                    i2 = list2.size();
                } else {
                    i2 = 0;
                }
                if (i4 >= i2) {
                    this.A00 = 0;
                }
                int i5 = this.A00;
                Movie movie = cwz.A01;
                List list3 = cwz.A03;
                if (!(movie == null || list3 == null || list3.size() <= i5)) {
                    cwz.A00 = i5;
                    movie.setTime(((CRQ) list3.get(i5)).A02);
                }
                return this.A02;
            }
        }
        this.A02 += this.A03;
        return this.A02;
    }

    public void BI7(long j) {
        A00();
        this.A02 = j;
    }

    public void CHA(long j) {
        A00();
        this.A02 = j;
    }
}
