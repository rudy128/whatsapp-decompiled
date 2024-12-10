package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.util.Log;

public final class AWA implements AnonymousClass89C {
    public final /* synthetic */ AMY A00;
    public final /* synthetic */ C183219Xk A01;

    public AWA(AMY amy, C183219Xk r2) {
        this.A00 = amy;
        this.A01 = r2;
    }

    public void Bsl() {
        Log.i("p2p/fpm/ExportHelper/setIntentToMigrateFlagOnServer()/failure");
        ((C175248yO) this.A00.A0H.get()).A00(600, (String) null);
    }

    public void onSuccess() {
        Log.i("p2p/fpm/ExportHelper/setIntentToMigrateFlagOnServer()/success");
        AMY amy = this.A00;
        amy.A0I.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        amy.A0F.A0G();
        amy.A09.A03(false);
        Log.i("p2p/fpm/ExportHelper/disconnectFromServer()/success");
        ChatTransferViewModel chatTransferViewModel = this.A01.A00;
        AnonymousClass3MY.A1M(chatTransferViewModel.A0F, false);
        AnonymousClass3MX.A1K(chatTransferViewModel.A0D, 1);
        chatTransferViewModel.A0H.A06("permissions_check");
    }
}
