package X;

import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.2A3  reason: invalid class name */
public class AnonymousClass2A3 extends C70553Bn {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2A3(com.facebook.msys.mci.NetworkSession r2, X.C23081El r3, java.lang.String r4, int r5, int r6, int r7, int r8) {
        /*
            r1 = this;
            r1.A00 = r8
            if (r8 == 0) goto L_0x0017
            java.lang.String r0 = "updateDataTaskUploadProgress"
            r1.A04 = r3
            r1.A05 = r2
            r1.A06 = r4
            r1.A01 = r5
            r1.A02 = r6
            r1.A03 = r7
        L_0x0013:
            r1.<init>(r0)
            return
        L_0x0017:
            java.lang.String r0 = "updateDataTaskDownloadProgress"
            r1.A04 = r3
            r1.A05 = r2
            r1.A06 = r4
            r1.A03 = r5
            r1.A02 = r6
            r1.A01 = r7
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2A3.<init>(com.facebook.msys.mci.NetworkSession, X.1El, java.lang.String, int, int, int, int):void");
    }

    public void run() {
        int i = this.A00;
        NetworkSession networkSession = (NetworkSession) this.A05;
        String str = this.A06;
        if (i != 0) {
            networkSession.updateDataTaskUploadProgress(str, (long) this.A01, (long) this.A02, (long) this.A03);
        } else {
            networkSession.updateDataTaskDownloadProgress(str, (long) this.A03, (long) this.A02, (long) this.A01);
        }
    }
}
