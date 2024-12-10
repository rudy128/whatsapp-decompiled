package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

/* renamed from: X.46N  reason: invalid class name */
public abstract class AnonymousClass46N extends C75163e6 {
    public View A00;
    public View A01;
    public TextView A02;
    public AnonymousClass1HS A03;
    public C219217x A04;
    public WaQrScannerView A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            finish();
        } else {
            this.A05.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean A1T;
        A2r(5);
        super.onCreate(bundle);
        setTitle(2131895389);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(2131626650, (ViewGroup) null, false));
        C72473Md.A17(this);
        if (this instanceof P2pTransferQrScannerActivity) {
            A1T = false;
        } else {
            A1T = AnonymousClass3MX.A1T(C72453Mb.A0M(this), "qr_education");
        }
        this.A07 = A1T;
        this.A00 = findViewById(2131433364);
        this.A05 = (WaQrScannerView) findViewById(2131434258);
        this.A01 = findViewById(2131435338);
        this.A02 = AnonymousClass3MX.A0L(this, 2131431460);
        this.A05.setQrScannerCallback(new C97674pr(this, 1));
        View findViewById = findViewById(2131433257);
        View findViewById2 = findViewById(2131430270);
        C90024dP.A00(findViewById, this, findViewById2, 23);
        if (this.A07) {
            findViewById2.setVisibility(0);
            this.A05.setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        findViewById2.setVisibility(8);
        A4b();
    }

    public void A4b() {
        int A022 = this.A04.A02("android.permission.CAMERA");
        WaQrScannerView waQrScannerView = this.A05;
        if (A022 == 0) {
            waQrScannerView.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
            return;
        }
        waQrScannerView.setVisibility(8);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        C134126q5 r4 = new C134126q5(this);
        r4.A01 = 2131232198;
        r4.A02 = 2131894291;
        r4.A0A = new int[]{2131899103};
        r4.A03 = 2131894290;
        r4.A08 = new int[]{2131899103};
        r4.A01(new String[]{"android.permission.CAMERA"});
        r4.A06 = true;
        if ((this instanceof IndiaUpiQrCodeScanActivity) || (this instanceof P2pTransferQrScannerActivity)) {
            r4.A02 = 2131894284;
            r4.A0A = new int[]{2131899103};
            r4.A03 = 2131894285;
            r4.A08 = new int[]{2131899103};
        }
        startActivityForResult(r4.A00(), 1);
    }

    public void A4c(String str) {
        Log.i("QrScannerActivity/result");
        if (str == null || str.equals(this.A06)) {
            this.A05.CFY();
        } else {
            this.A06 = str;
            if (this instanceof DevicePairQrScannerActivity) {
                DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this;
                devicePairQrScannerActivity.A05.A0I(devicePairQrScannerActivity.A0I);
                devicePairQrScannerActivity.A05.CGP(new AnonymousClass7RB((Object) devicePairQrScannerActivity, 20));
            } else if (this instanceof IndiaUpiQrCodeScanActivity) {
                Vibrator A0H = this.A08.A0H();
                if (A0H != null) {
                    A0H.vibrate(75);
                }
                Intent intent = new Intent(this, IndiaUpiPaymentLauncherActivity.class);
                intent.putExtra("intent_source", true);
                intent.setData(Uri.parse(this.A06));
                startActivity(intent);
                finish();
            } else {
                P2pTransferQrScannerActivity p2pTransferQrScannerActivity = (P2pTransferQrScannerActivity) this;
                if (p2pTransferQrScannerActivity.A00 == 1) {
                    try {
                        if (!C20276AEj.A0E.A01(p2pTransferQrScannerActivity.A06, "tds").A08.equalsIgnoreCase("android")) {
                            new WDSBottomSheetDialogFragment().A2C(p2pTransferQrScannerActivity.getSupportFragmentManager(), "ThunderstormShowQRCodeBottomSheet");
                        }
                    } catch (AnonymousClass9L2 e) {
                        Log.e("p2p/P2pTransferQrScannerActivity/Unable to parse QR code, reason: ex.message ", e);
                        p2pTransferQrScannerActivity.CMx(2131896917, 2131896916, (Integer) null, (Integer) null, (Integer) null, "dialog_invalid_qr_code_tag", (String) null, (Object[]) null);
                    }
                }
                if (p2pTransferQrScannerActivity.A00 != 4) {
                    Intent A0A = C17880vN.A0A();
                    A0A.putExtra("qr_code_key", p2pTransferQrScannerActivity.A06);
                    p2pTransferQrScannerActivity.setResult(-1, A0A);
                } else if (p2pTransferQrScannerActivity.A01 != null) {
                    p2pTransferQrScannerActivity.startActivity(AnonymousClass1LU.A1b(p2pTransferQrScannerActivity, p2pTransferQrScannerActivity.A06, (String) null, 2, true));
                } else {
                    AnonymousClass3MW.A1F();
                    throw null;
                }
                p2pTransferQrScannerActivity.finish();
            }
        }
        C17880vN.A1F(C19830z4.A00(this.A0A), "qr_education", false);
    }

    public void onPause() {
        super.onPause();
        if (this.A05.getVisibility() == 0) {
            this.A05.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A05.getVisibility() == 4) {
            this.A05.setVisibility(0);
        }
    }
}
