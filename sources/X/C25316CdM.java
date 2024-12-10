package X;

import android.content.Context;

/* renamed from: X.CdM  reason: case insensitive filesystem */
public abstract class C25316CdM {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.DEr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.DEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.DEr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.DEr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C26808DEq A00(android.content.Context r5, android.os.Handler r6, X.C24248By6 r7) {
        /*
            java.lang.String r4 = "CameraServiceFactory"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Creating a camera service backed by the Android Camera"
            r1.append(r0)
            X.By6 r3 = X.C24248By6.CAMERA1
            if (r7 != r3) goto L_0x004c
            java.lang.String r0 = "1"
        L_0x0011:
            r1.append(r0)
            java.lang.String r0 = " API"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            int r0 = X.C26175Cts.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            r0 = 0
            X.C26175Cts.A01(r1, r0, r0)
            boolean r0 = X.C24670CEk.A00
            if (r0 == 0) goto L_0x0031
            android.util.Log.d(r4, r2)
        L_0x0031:
            if (r7 != r3) goto L_0x003f
            X.DEs r2 = X.C26810DEs.A01(r5)
            X.Cqv r1 = r2.A0R
        L_0x0039:
            X.DEq r0 = new X.DEq
            r0.<init>(r6, r2, r1)
            return r0
        L_0x003f:
            X.By6 r0 = X.C24248By6.CAMERA2
            if (r7 != r0) goto L_0x0056
            if (r5 == 0) goto L_0x004f
            X.DEr r2 = X.C26809DEr.A00(r5)
            X.Cqv r1 = r2.A0a
            goto L_0x0039
        L_0x004c:
            java.lang.String r0 = "2"
            goto L_0x0011
        L_0x004f:
            java.lang.String r0 = "Context must be provided for Camera2."
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid Camera API: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25316CdM.A00(android.content.Context, android.os.Handler, X.By6):X.DEq");
    }

    public static C28614EAk A01(Context context, C24248By6 by6) {
        if (by6 == C24248By6.CAMERA1) {
            C26810DEs A01 = C26810DEs.A01(context);
            A01.A0C = true;
            return A01;
        } else if (by6 == C24248By6.CAMERA2) {
            C26809DEr A00 = C26809DEr.A00(context);
            A00.A0J = true;
            return A00;
        } else {
            throw AnonymousClass8BR.A0w(AnonymousClass001.A1E(by6, "Invalid Camera API: ", AnonymousClass000.A10()));
        }
    }
}
