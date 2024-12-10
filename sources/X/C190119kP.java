package X;

import com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService;

/* renamed from: X.9kP  reason: invalid class name and case insensitive filesystem */
public final class C190119kP {
    public final /* synthetic */ C20276AEj A00;
    public final /* synthetic */ WifiGroupScannerP2pTransferService A01;

    public void A00(String str, int i) {
        String str2;
        C18070vi.A0d(str, 0);
        WifiGroupScannerP2pTransferService wifiGroupScannerP2pTransferService = this.A01;
        AnonymousClass00H r0 = wifiGroupScannerP2pTransferService.A04;
        if (r0 != null) {
            ((C175248yO) r0.get()).A01(AnonymousClass00R.A0C, Integer.valueOf(i));
            AnonymousClass9VZ r02 = wifiGroupScannerP2pTransferService.A01;
            if (r02 != null) {
                C20276AEj aEj = this.A00;
                C31231fE r1 = r02.A00;
                C178009Bl r03 = new C178009Bl((C182609Va) r1.A00.A03.get(), (C175248yO) r1.A01.A00.A3g.get(), aEj, str);
                wifiGroupScannerP2pTransferService.A03 = r03;
                r03.start();
                return;
            }
            str2 = "networkingThreadFactory";
        } else {
            str2 = "p2pTransferObservers";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public C190119kP(C20276AEj aEj, WifiGroupScannerP2pTransferService wifiGroupScannerP2pTransferService) {
        this.A01 = wifiGroupScannerP2pTransferService;
        this.A00 = aEj;
    }
}
