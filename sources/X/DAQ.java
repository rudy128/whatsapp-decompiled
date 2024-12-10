package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

public class DAQ implements E93 {
    public final /* synthetic */ LiteCameraView A00;

    public DAQ(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    public void BnS(Exception exc) {
        LiteCameraView liteCameraView = this.A00;
        LiteCameraView.A04(liteCameraView, exc, "/onCameraError/");
        liteCameraView.A0a = false;
        if (!liteCameraView.A0J) {
            liteCameraView.A0J = true;
            liteCameraView.pause();
            liteCameraView.CG0();
            return;
        }
        C28598E9p e9p = liteCameraView.A06;
        if (e9p != null) {
            e9p.BnT(exc, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BnZ() {
        /*
            r5 = this;
            com.whatsapp.camera.litecamera.LiteCameraView r4 = r5.A00
            r0 = 1
            r4.A0a = r0
            r1 = 0
            r4.A0J = r1
            int r0 = r4.getCameraFacing()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x005c
            java.util.List r0 = r4.A0I
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
            java.lang.String[] r2 = X.C17880vN.A1Z()
            java.lang.String r0 = "off"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "on"
            java.util.List r0 = X.AnonymousClass8BR.A15(r0, r2, r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.A0I = r0
        L_0x002f:
            com.whatsapp.camera.litecamera.LiteCameraView.A03(r4)
        L_0x0032:
            java.util.List r1 = r4.getFlashModes()
            java.lang.String r0 = r4.A0G
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "off"
            r4.A0G = r0
        L_0x0042:
            X.EDL r1 = r4.A0R
            java.lang.String r0 = r4.A0G
            int r0 = com.whatsapp.camera.litecamera.LiteCameraView.A00(r0)
            r1.CIv(r0)
            r0 = 3
            boolean r0 = r1.Beo(r0)
            r4.A0O = r0
            X.E9p r0 = r4.A06
            if (r0 == 0) goto L_0x005b
            r0.C1j()
        L_0x005b:
            return
        L_0x005c:
            java.util.List r0 = r4.A0H
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
            int r0 = r4.getCameraFacing()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 != 0) goto L_0x0099
            r0 = 3
            java.util.ArrayList r3 = X.C17880vN.A0z(r0)
            java.lang.String r0 = "off"
            r3.add(r0)
            X.EDL r2 = r4.A0R
            java.lang.String r1 = "on"
            r0 = 1
            boolean r0 = r2.Beo(r0)
            if (r0 == 0) goto L_0x0086
            r3.add(r1)
        L_0x0086:
            java.lang.String r1 = "auto"
            r0 = 2
            boolean r0 = r2.Beo(r0)
            if (r0 == 0) goto L_0x0092
            r3.add(r1)
        L_0x0092:
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r4.A0H = r0
            goto L_0x002f
        L_0x0099:
            java.lang.String r0 = "Cannot create back camera flash list while in front camera"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAQ.BnZ():void");
    }

    public void Bna(String str, String str2) {
        LiteCameraView liteCameraView = this.A00;
        C18030ve r2 = liteCameraView.A07;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 8708)) {
            r2.A0N(8233);
        }
        liteCameraView.A0a = false;
        if (liteCameraView.A06 != null) {
            if (C18020vd.A05(r1, r2, 12772)) {
                liteCameraView.A02.A0G("LiteCameraView/onCameraLocallyEvicted", C17900vP.A0H(str, ">", str2).toString(), true);
            }
            liteCameraView.A06.BnT(new Exception("CameraCustomException: Camera error evicted"), 2);
        }
    }

    public void Bni() {
        LiteCameraView liteCameraView = this.A00;
        int cameraFacing = liteCameraView.getCameraFacing();
        if (liteCameraView.A0N) {
            C17880vN.A1C(C19830z4.A00((C19830z4) liteCameraView.A0B.get()), "camera_facing", cameraFacing);
        }
        Runnable runnable = liteCameraView.A0F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
