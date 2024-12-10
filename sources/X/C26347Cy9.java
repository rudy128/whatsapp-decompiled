package X;

import android.hardware.Camera;
import android.text.TextUtils;
import com.whatsapp.bloks.BloksCameraOverlay;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.Cy9  reason: case insensitive filesystem */
public final /* synthetic */ class C26347Cy9 implements Camera.PictureCallback {
    public final /* synthetic */ B6T A00;
    public final /* synthetic */ CUD A01;
    public final /* synthetic */ C26109CsU A02;

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C26109CsU csU = this.A02;
        CUD cud = this.A01;
        B6T b6t = this.A00;
        byte[] bArr2 = bArr;
        if (bArr == null) {
            csU.A01.A0J(new C21445AkC(csU, 37));
            return;
        }
        AnonymousClass00H r4 = csU.A04;
        C189369iy r7 = (C189369iy) r4.get();
        String str = cud.A07;
        if (TextUtils.isEmpty(str)) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("IMG_");
            A10.append(format);
            str = AnonymousClass000.A0y(".png", A10);
        }
        File A002 = r7.A00(str);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(cud.A00, cameraInfo);
        AnonymousClass10I r1 = csU.A02;
        boolean A1T = AnonymousClass000.A1T(cameraInfo.facing, 1);
        String str2 = cud.A07;
        int i = cud.A01;
        int i2 = cud.A02;
        BloksCameraOverlay bloksCameraOverlay = cud.A05;
        C17960vV.A05(bloksCameraOverlay);
        r1.CGM(new C24145BwB(b6t, bloksCameraOverlay, (C189369iy) r4.get(), A002, str2, bArr2, i, i2, A1T), new Void[0]);
    }

    public /* synthetic */ C26347Cy9(B6T b6t, CUD cud, C26109CsU csU) {
        this.A02 = csU;
        this.A01 = cud;
        this.A00 = b6t;
    }
}
