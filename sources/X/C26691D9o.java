package X;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: X.D9o  reason: case insensitive filesystem */
public class C26691D9o implements E9Q {
    public E9Q A00;
    public E9Q A01;
    public E9Q A02;
    public E9Q A03;
    public E9Q A04;
    public E9Q A05;
    public E9Q A06;
    public E9Q A07;
    public final Context A08;
    public final E9Q A09;
    public final List A0A = AnonymousClass000.A13();

    public C26691D9o(Context context, String str) {
        BPL bpl = new BPL((C24846CMp) null, str, 8000);
        this.A08 = context.getApplicationContext();
        this.A09 = bpl;
    }

    private void A00(E9Q e9q) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                e9q.BBr((C28570E8b) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public Uri Bb3() {
        E9Q e9q = this.A07;
        if (e9q == null) {
            return null;
        }
        return e9q.Bb3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long CAj(X.C26115Csd r5) {
        /*
            r4 = this;
            X.E9Q r0 = r4.A07
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C26056CrS.A03(r0)
            android.net.Uri r3 = r5.A04
            java.lang.String r1 = r3.getScheme()
            java.lang.String r2 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            X.E9Q r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.BPI r0 = new X.BPI
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.E9Q r0 = r4.A01
        L_0x0043:
            r4.A07 = r0
            long r0 = r0.CAj(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            X.E9Q r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "com.facebook.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fe }
            java.lang.Object r0 = X.BEA.A0d(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fe }
            X.E9Q r0 = (X.E9Q) r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fe }
            r4.A05 = r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fe }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fe }
            goto L_0x006f
        L_0x0068:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            android.util.Log.w(r1, r0)
        L_0x006f:
            X.E9Q r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            X.E9Q r0 = r4.A09
            r4.A05 = r0
            goto L_0x0043
        L_0x0078:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            X.E9Q r0 = r4.A06
            if (r0 != 0) goto L_0x008e
            X.BPK r0 = new X.BPK
            r0.<init>()
            r4.A06 = r0
            r4.A00(r0)
        L_0x008e:
            X.E9Q r0 = r4.A06
            goto L_0x0043
        L_0x0091:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ab
            X.E9Q r0 = r4.A02
            if (r0 != 0) goto L_0x00a8
            r1 = 0
            X.BPE r0 = new X.BPE
            r0.<init>(r1)
            r4.A02 = r0
            r4.A00(r0)
        L_0x00a8:
            X.E9Q r0 = r4.A02
            goto L_0x0043
        L_0x00ab:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c7
            X.E9Q r0 = r4.A04
            if (r0 != 0) goto L_0x00c3
            android.content.Context r1 = r4.A08
            X.BPJ r0 = new X.BPJ
            r0.<init>(r1)
            r4.A04 = r0
            r4.A00(r0)
        L_0x00c3:
            X.E9Q r0 = r4.A04
            goto L_0x0043
        L_0x00c7:
            X.E9Q r0 = r4.A09
            goto L_0x0043
        L_0x00cb:
            java.lang.String r1 = r3.getPath()
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00ea
            X.E9Q r0 = r4.A03
            if (r0 != 0) goto L_0x00e6
            r1 = 0
            X.BPF r0 = new X.BPF
            r0.<init>(r1)
            r4.A03 = r0
            r4.A00(r0)
        L_0x00e6:
            X.E9Q r0 = r4.A03
            goto L_0x0043
        L_0x00ea:
            X.E9Q r0 = r4.A00
            if (r0 != 0) goto L_0x00fa
            android.content.Context r1 = r4.A08
            X.BPG r0 = new X.BPG
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00fa:
            X.E9Q r0 = r4.A00
            goto L_0x0043
        L_0x00fe:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26691D9o.CAj(X.Csd):long");
    }

    public void close() {
        E9Q e9q = this.A07;
        if (e9q != null) {
            try {
                e9q.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A07.read(bArr, i, i2);
    }

    public void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        this.A0A.add(e8b);
        E9Q e9q = this.A03;
        if (e9q != null) {
            e9q.BBr(e8b);
        }
        E9Q e9q2 = this.A00;
        if (e9q2 != null) {
            e9q2.BBr(e8b);
        }
        E9Q e9q3 = this.A01;
        if (e9q3 != null) {
            e9q3.BBr(e8b);
        }
        E9Q e9q4 = this.A04;
        if (e9q4 != null) {
            e9q4.BBr(e8b);
        }
    }
}
