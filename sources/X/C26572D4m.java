package X;

import android.hardware.Camera;
import android.view.View;

/* renamed from: X.D4m  reason: case insensitive filesystem */
public final /* synthetic */ class C26572D4m implements View.OnClickListener {
    public final /* synthetic */ Camera.PictureCallback A00;
    public final /* synthetic */ COM A01;
    public final /* synthetic */ CUD A02;
    public final /* synthetic */ C26109CsU A03;
    public final /* synthetic */ String A04;

    public final void onClick(View view) {
        C26109CsU csU = this.A03;
        String str = this.A04;
        COM com2 = this.A01;
        CUD cud = this.A02;
        Camera.PictureCallback pictureCallback = this.A00;
        if (!csU.A00) {
            csU.A00 = true;
            int hashCode = str.hashCode();
            if (hashCode == 100313435 || hashCode != 112202875 || !str.equals("video")) {
                cud.A03.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, pictureCallback);
                return;
            }
            Bq5 bq5 = cud.A06;
            C17960vV.A05(bq5);
            C26109CsU.A00(bq5, com2, cud, (C189369iy) csU.A04.get());
        }
    }

    public /* synthetic */ C26572D4m(Camera.PictureCallback pictureCallback, COM com2, CUD cud, C26109CsU csU, String str) {
        this.A03 = csU;
        this.A04 = str;
        this.A01 = com2;
        this.A02 = cud;
        this.A00 = pictureCallback;
    }
}
