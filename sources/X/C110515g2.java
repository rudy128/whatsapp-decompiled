package X;

import android.content.Context;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5g2  reason: invalid class name and case insensitive filesystem */
public class C110515g2 extends FrameLayout implements AnonymousClass009, C160918An {
    public C28598E9p A00;
    public C160978Av A01;
    public CX2 A02;
    public AnonymousClass11C A03;
    public C18030ve A04;
    public C18010vc A05;
    public AnonymousClass8AH A06;
    public AnonymousClass031 A07;
    public boolean A08;
    public final Handler A09;

    public void CFY() {
    }

    public void CFw() {
    }

    public /* synthetic */ void setShouldUseGoogleVisionScanner(boolean z) {
    }

    public boolean Bgi() {
        return this.A01.Bgi();
    }

    public void CNk() {
        this.A01.CFx();
    }

    public void COW() {
        this.A01.pause();
    }

    public boolean COq() {
        return this.A01.COq();
    }

    public void CPa() {
        this.A01.CPa();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public C110515g2(Context context) {
        super(context);
        EDL A002;
        if (!this.A08) {
            this.A08 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A04 = AnonymousClass10E.A8r(r1);
            this.A03 = AnonymousClass3Ma.A0a(r1);
            this.A02 = (CX2) r2.A0z.A4Z.get();
            this.A05 = AnonymousClass3Ma.A0r(r1);
        }
        this.A09 = C17890vO.A0D();
        this.A00 = new AnonymousClass7DT(this, 3);
        Context context2 = getContext();
        int A022 = C24191Jf.A02(this.A03, this.A05);
        C18030ve r9 = this.A04;
        CX2 cx2 = this.A02;
        C18070vi.A0d(r9, 0);
        C18040vf r22 = C18040vf.A02;
        boolean z = !C18020vd.A05(r22, r9, 12471);
        boolean A052 = C18020vd.A05(r22, this.A04, 8708);
        C17900vP.A0n("CameraUtils/getLiteCameraImplForQRCodeScanner/useCamera1 = ", AnonymousClass000.A10(), z);
        if (A052) {
            C17900vP.A0n("CameraUtils/getLiteCameraImpl/useCamera1 = ", AnonymousClass000.A10(), z);
            Log.i("CameraUtils/getLiteCameraImpl newLiteCameraController");
            A002 = cx2.A00(context2, r9, "whatsapp_qr_code", z);
        } else {
            Log.i("CameraUtils/getLiteCameraImpl oldLiteCameraController");
            A002 = C25307CdB.A00(context2, new TextureView(context2));
        }
        LiteCameraView liteCameraView = new LiteCameraView(A022, context2, A002, (Integer) null);
        this.A01 = liteCameraView;
        liteCameraView.setQrScanningEnabled(true);
        C160978Av r12 = this.A01;
        r12.setCameraCallback(this.A00);
        View view = (View) r12;
        setupTapToFocus(view);
        addView(view);
    }

    private void setupTapToFocus(View view) {
        C1422578t.A00(view, C108965cb.A0C(getContext(), new C109765dy(this, 6)), this, 6);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C160978Av r0 = this.A01;
        if (i == 0) {
            r0.CG0();
            r0.BEu();
            return;
        }
        r0.pause();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }

    public void setQrScannerCallback(AnonymousClass8AH r1) {
        this.A06 = r1;
    }
}
