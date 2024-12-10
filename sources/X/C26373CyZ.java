package X;

import android.os.Handler;
import android.util.Log;

/* renamed from: X.CyZ  reason: case insensitive filesystem */
public class C26373CyZ implements Handler.Callback {
    public final /* synthetic */ C25986Cq0 A00;

    public C26373CyZ(C25986Cq0 cq0) {
        this.A00 = cq0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            X.Cq0 r0 = r6.A00
            X.CZh r1 = r0.A05
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            r5 = 1
            if (r0 != 0) goto L_0x0015
            java.util.List r4 = r1.A00
            int r0 = r7.what
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x002d;
                case 2: goto L_0x0044;
                case 3: goto L_0x0050;
                case 4: goto L_0x005c;
                case 5: goto L_0x0073;
                case 6: goto L_0x008a;
                default: goto L_0x0015;
            }
        L_0x0015:
            return r5
        L_0x0016:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Time to take photo: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x002d:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Time to switch camera: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0044:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0050:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r3 = r3 + 1
            goto L_0x0050
        L_0x005c:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Time for first surface texture update: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0073:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Time for first preview frame: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x0073
        L_0x008a:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Time to complete capture: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26373CyZ.handleMessage(android.os.Message):boolean");
    }

    public static void A00(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append("ms");
        Log.d("Camera1Performance", sb.toString());
    }
}
