package X;

import android.content.BroadcastReceiver;

/* renamed from: X.263  reason: invalid class name */
public final class AnonymousClass263 extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (X.C18070vi.A18(r1, "com.facebook.SET_FOA_BACKUP_TOKEN") == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            int r3 = r4.getResultCode()
            r0 = -1
            if (r3 != r0) goto L_0x0016
            if (r6 == 0) goto L_0x0029
            java.lang.String r1 = r6.getAction()
        L_0x000d:
            java.lang.String r0 = "com.facebook.SET_FOA_BACKUP_TOKEN"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FoaBackupTokenSenderResponseReceiver/onReceive resultCode: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", success:"
            X.C17900vP.A0n(r0, r1, r2)
            return
        L_0x0029:
            r1 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass263.onReceive(android.content.Context, android.content.Intent):void");
    }
}
