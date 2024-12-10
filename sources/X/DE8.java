package X;

import android.view.TextureView;
import android.view.View;
import com.whatsapp.camera.litecamera.LiteCameraView;
import java.util.List;

public class DE8 implements E99 {
    public final int A00;
    public final Object A01;

    public DE8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C1g(C25742ClC clC) {
        switch (this.A00) {
            case 1:
                C22808BPw bPw = (C22808BPw) this.A01;
                boolean z = bPw.A0m;
                bPw.A0m = true;
                if (!bPw.A0b && bPw.A0a && z) {
                    C22892BUd bUd = EDE.A00;
                    C28592E9h e9h = bPw.A00;
                    C26159CtX.A01(e9h);
                    e9h.BP7(bUd);
                    return;
                }
                return;
            case 3:
                if (clC.A00() != null) {
                    List list = ((C22809BPx) this.A01).A03.A00;
                    if (0 < BE7.A08(list)) {
                        list.get(0);
                        throw AnonymousClass000.A0s("onSurfaceCreated");
                    }
                    return;
                }
                return;
            case 4:
                BUO.A02((BUO) this.A01, clC);
                return;
            case 5:
                BUN.A03((BUN) this.A01, clC);
                return;
            case 6:
                C17900vP.A0Y(clC, "LiteCamera/onPreviewOutputCreated surfaceNode: ", AnonymousClass000.A10());
                clC.A03 = ((LiteCameraView) this.A01).A01;
                return;
            default:
                return;
        }
    }

    public void C1h(C25742ClC clC) {
        switch (this.A00) {
            case 1:
                ((C22808BPw) this.A01).A0m = false;
                return;
            case 3:
                if (clC.A00() != null) {
                    List list = ((C22809BPx) this.A01).A03.A00;
                    if (0 < BE7.A08(list)) {
                        list.get(0);
                        throw AnonymousClass000.A0s("onSurfaceDestroyed");
                    }
                    return;
                }
                return;
            case 4:
                BUO.A02((BUO) this.A01, (C25742ClC) null);
                return;
            case 5:
                BUN.A03((BUN) this.A01, (C25742ClC) null);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        if (r0 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r0 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r1 = r0.getRotation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r1 == 1) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r1 == 2) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r1 != 3) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r2 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r2 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r2 = 90;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1i(X.C25742ClC r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x00f4;
                case 2: goto L_0x0050;
                case 3: goto L_0x002e;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00db;
                case 6: goto L_0x00c1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.CZL r0 = (X.CZL) r0
            r0.A01(r10, r9)
            X.DAT r2 = r0.A00
            X.DAP r0 = r0.A03
            r2.CEd(r0)
            X.BUd r1 = X.EDA.A00
            X.EA4 r0 = r2.A00
            X.EDK r2 = r0.BP7(r1)
            X.EDA r2 = (X.EDA) r2
            X.BPw r2 = (X.C22808BPw) r2
            r1 = 0
            boolean r0 = r2.A0a
            if (r0 == r1) goto L_0x002d
            r2.A0a = r1
            boolean r0 = r2.A0b
            if (r0 != 0) goto L_0x002d
            X.C22808BPw.A01(r2)
        L_0x002d:
            return
        L_0x002e:
            r2 = 0
            X.C18070vi.A0d(r8, r2)
            android.view.Surface r0 = r8.A00()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r7.A01
            X.BPx r0 = (X.C22809BPx) r0
            X.CZh r0 = r0.A03
            java.util.List r1 = r0.A00
            int r0 = X.BE7.A08(r1)
            if (r2 >= r0) goto L_0x002d
            r1.get(r2)
            java.lang.String r0 = "onSurfaceChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0050:
            java.lang.Object r6 = r7.A01
            X.BUF r6 = (X.BUF) r6
            r2 = 0
            X.BUd r1 = X.EDD.A00     // Catch:{ RuntimeException -> 0x00a0 }
            X.EDK r0 = r6.A04(r1)     // Catch:{ RuntimeException -> 0x00a0 }
            X.C18070vi.A0X(r0)     // Catch:{ RuntimeException -> 0x00a0 }
            X.EDD r0 = (X.EDD) r0     // Catch:{ RuntimeException -> 0x00a0 }
            boolean r0 = r0.Bcn()     // Catch:{ RuntimeException -> 0x00a0 }
            if (r0 == 0) goto L_0x0079
            X.EDK r0 = r6.A04(r1)     // Catch:{ RuntimeException -> 0x00a0 }
            X.C18070vi.A0X(r0)     // Catch:{ RuntimeException -> 0x00a0 }
            X.EDD r0 = (X.EDD) r0     // Catch:{ RuntimeException -> 0x00a0 }
            android.view.View r0 = r0.BXX()     // Catch:{ RuntimeException -> 0x00a0 }
            android.view.Display r0 = r0.getDisplay()     // Catch:{ RuntimeException -> 0x00a0 }
            if (r0 != 0) goto L_0x008b
        L_0x0079:
            android.content.Context r1 = r6.A03     // Catch:{ RuntimeException -> 0x00a0 }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x00a0 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ RuntimeException -> 0x00a0 }
            if (r0 == 0) goto L_0x00a0
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x00a0 }
            if (r0 == 0) goto L_0x00a0
        L_0x008b:
            int r1 = r0.getRotation()     // Catch:{ RuntimeException -> 0x00a0 }
            r0 = 1
            if (r1 == r0) goto L_0x009e
            r0 = 2
            if (r1 == r0) goto L_0x009b
            r0 = 3
            if (r1 != r0) goto L_0x00a0
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00a0
        L_0x009b:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00a0
        L_0x009e:
            r2 = 90
        L_0x00a0:
            int r0 = r6.A01
            if (r0 == r2) goto L_0x002d
            r6.A01 = r2
            X.CZh r0 = r6.A04
            java.util.List r5 = r0.A00
            int r4 = X.BE7.A08(r5)
            r3 = 0
        L_0x00af:
            if (r3 >= r4) goto L_0x002d
            java.lang.Object r2 = r5.get(r3)
            X.E4B r2 = (X.E4B) r2
            int r1 = r6.A01
            int r0 = r6.A00
            r2.Bzk(r1, r0)
            int r3 = r3 + 1
            goto L_0x00af
        L_0x00c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LiteCamera/onPreviewOutputSizeChanged width= "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", height= "
            X.C17900vP.A0j(r0, r1, r10)
            java.lang.Object r0 = r7.A01
            com.whatsapp.camera.litecamera.LiteCameraView r0 = (com.whatsapp.camera.litecamera.LiteCameraView) r0
            int r0 = r0.A01
            r8.A03 = r0
            return
        L_0x00db:
            java.lang.Object r0 = r7.A01
            X.BUN r0 = (X.BUN) r0
            android.os.Handler r1 = r0.A0J
            r0 = 21
            goto L_0x00f0
        L_0x00e4:
            java.lang.Object r0 = r7.A01
            X.BUO r0 = (X.BUO) r0
            r0.A05 = r9
            r0.A04 = r10
            android.os.Handler r1 = r0.A0K
            r0 = 18
        L_0x00f0:
            X.C27082DTh.A01(r1, r7, r0)
            return
        L_0x00f4:
            java.lang.Object r1 = r7.A01
            X.BPw r1 = (X.C22808BPw) r1
            r1.A07 = r9
            r1.A05 = r10
            X.Chu r0 = r1.A0S
            X.C22808BPw.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE8.C1i(X.ClC, int, int):void");
    }

    public void C1l(View view) {
        switch (this.A00) {
            case 0:
                ((C25747ClH) this.A01).A00();
                return;
            case 1:
                boolean z = view instanceof TextureView;
                C22808BPw bPw = (C22808BPw) this.A01;
                if (z) {
                    bPw.A0A = (TextureView) view;
                } else {
                    bPw.A0A = null;
                }
                bPw.A09 = null;
                return;
            default:
                return;
        }
    }
}
