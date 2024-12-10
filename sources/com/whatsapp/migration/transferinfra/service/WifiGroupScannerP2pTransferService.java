package com.whatsapp.migration.transferinfra.service;

import X.AnonymousClass9VY;
import X.AnonymousClass9VZ;
import X.C173698va;
import X.C178009Bl;
import com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler;

public final class WifiGroupScannerP2pTransferService extends C173698va {
    public AnonymousClass9VY A00;
    public AnonymousClass9VZ A01;
    public WifiDirectScannerConnectionHandler A02;
    public C178009Bl A03;
    public boolean A04;

    public WifiGroupScannerP2pTransferService(int i) {
        this.A04 = false;
    }

    public void onCreate() {
        A01();
        super.onCreate();
    }

    public WifiGroupScannerP2pTransferService() {
        this(0);
    }
}
