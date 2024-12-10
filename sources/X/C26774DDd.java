package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.DDd  reason: case insensitive filesystem */
public class C26774DDd implements C28551E7b {
    public final CWW A00 = new CWW();
    public final CWW A01 = new CWW();
    public final CWW A02 = new CWW();
    public volatile String A03 = null;

    /* JADX WARNING: type inference failed for: r14v0, types: [X.CK5, java.lang.Object] */
    private CK5 A00() {
        ? obj = new Object();
        String str = this.A03;
        obj.A00 = str;
        CWW cww = this.A00;
        double[] A012 = cww.A01.A01();
        double[] A013 = cww.A03.A01();
        long j = (long) A012[2];
        int i = ((int) A012[3]) + ((int) A013[3]);
        float f = (float) A012[0];
        float f2 = (float) A012[1];
        float f3 = (float) A013[0];
        float f4 = (float) A013[1];
        CWW cww2 = this.A02;
        double[] A014 = cww2.A01.A01();
        double[] A015 = cww2.A03.A01();
        long j2 = (long) A014[2];
        int i2 = ((int) A014[3]) + ((int) A015[3]);
        float f5 = (float) A014[0];
        float f6 = (float) A014[1];
        float f7 = (float) A015[0];
        float f8 = (float) A015[1];
        double[] A016 = this.A01.A02.A01();
        long j3 = (long) A016[2];
        float f9 = (float) A016[0];
        float f10 = (float) A016[1];
        Object[] objArr = new Object[17];
        BE6.A1T(objArr, f, 0);
        BE6.A1T(objArr, f2, 1);
        BE6.A1T(objArr, f3, 2);
        BE6.A1T(objArr, f4, 3);
        C17890vO.A1P(objArr, j);
        AnonymousClass3Ma.A1U(objArr, i);
        objArr[6] = Float.valueOf(f5);
        objArr[7] = Float.valueOf(f6);
        objArr[8] = Float.valueOf(f7);
        objArr[9] = Float.valueOf(f8);
        objArr[10] = Long.valueOf(j2);
        objArr[11] = Integer.valueOf(i2);
        objArr[12] = Float.valueOf(f9);
        objArr[13] = Float.valueOf(f10);
        objArr[14] = Long.valueOf(j3);
        objArr[15] = str;
        objArr[16] = false;
        if (C26294Cx6.A01.BfN(4)) {
            C26294Cx6.A06("PerformanceLoggerManagerImpl", StringFormatUtil.formatStrLocaleSafe("AVG Render Time [ms]: %.2f +/- %.2f, AVG Gap Time [ms]: %.2f +/- %.2f, Frame count: %d, Out of Order %d [=0 is valid]\nGPU: AVG Render Time [ms]: %.2f +/- %.2f, AVG Gap Time [ms]: %.2f +/- %.2f, Frame count: %d, Out of Order %d [=0 is valid]\nDELAY: AVG Delay Render Time [ms]: %.2f +/- %.2f, Frame count: %d\nEffect Id: %s, Is Recording: %b", objArr));
        }
        return obj;
    }

    public CK5 BJq() {
        CK5 A002 = A00();
        this.A00.A00();
        this.A02.A00();
        this.A01.A00();
        this.A03 = null;
        return A002;
    }

    public CK5 BJr(String str) {
        CK5 A002 = A00();
        this.A00.A00();
        this.A02.A00();
        this.A01.A00();
        this.A03 = str;
        return A002;
    }
}
