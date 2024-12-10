package X;

import com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService;
import com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService;

/* renamed from: X.99y  reason: invalid class name */
public abstract class AnonymousClass99y extends C29651cd implements AnonymousClass009 {
    public final Object A00 = C17880vN.A0p();
    public volatile C008203r A01;

    public static void A00(AnonymousClass10E r2, C173698va r3) {
        r3.A02 = new C189489jK((AnonymousClass118) r2.ABY.get());
        r3.A04 = C000200d.A00(r2.A00.A3g);
        r3.A05 = C000200d.A00(r2.A9c);
    }

    public void A01() {
        if (this instanceof WifiGroupScannerP2pTransferService) {
            WifiGroupScannerP2pTransferService wifiGroupScannerP2pTransferService = (WifiGroupScannerP2pTransferService) this;
            if (!wifiGroupScannerP2pTransferService.A04) {
                wifiGroupScannerP2pTransferService.A04 = true;
                C31221fD r2 = (C31221fD) ((C008503u) wifiGroupScannerP2pTransferService.generatedComponent());
                AnonymousClass10E r1 = r2.A07;
                A00(r1, wifiGroupScannerP2pTransferService);
                wifiGroupScannerP2pTransferService.A00 = AnonymousClass3Ma.A0a(r1);
                wifiGroupScannerP2pTransferService.A01 = AnonymousClass3MZ.A0l(r1);
                wifiGroupScannerP2pTransferService.A03 = AnonymousClass10E.AL1(r1);
                wifiGroupScannerP2pTransferService.A00 = (AnonymousClass9VY) r2.A02.get();
                wifiGroupScannerP2pTransferService.A01 = (AnonymousClass9VZ) r2.A04.get();
                return;
            }
            return;
        }
        WifiGroupCreatorP2pTransferService wifiGroupCreatorP2pTransferService = (WifiGroupCreatorP2pTransferService) this;
        if (!wifiGroupCreatorP2pTransferService.A05) {
            wifiGroupCreatorP2pTransferService.A05 = true;
            C31221fD r22 = (C31221fD) ((C008503u) wifiGroupCreatorP2pTransferService.generatedComponent());
            AnonymousClass10E r12 = r22.A07;
            A00(r12, wifiGroupCreatorP2pTransferService);
            wifiGroupCreatorP2pTransferService.A00 = AnonymousClass3Ma.A0a(r12);
            wifiGroupCreatorP2pTransferService.A01 = AnonymousClass3MZ.A0l(r12);
            wifiGroupCreatorP2pTransferService.A03 = AnonymousClass10E.AL1(r12);
            wifiGroupCreatorP2pTransferService.A02 = C72463Mc.A0e(r12);
            wifiGroupCreatorP2pTransferService.A00 = (AnonymousClass9VW) r22.A00.get();
            wifiGroupCreatorP2pTransferService.A01 = (AnonymousClass9VX) r22.A01.get();
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C008203r(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public void onCreate() {
        A01();
        super.onCreate();
    }
}
