package X;

import android.content.Intent;

/* renamed from: X.AzU  reason: case insensitive filesystem */
public final class C22214AzU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C173628vP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22214AzU(C173628vP r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C173628vP r1 = this.this$0;
        if (AnonymousClass3MX.A1a((Boolean) obj)) {
            AnonymousClass02n r5 = r1.A08;
            AnonymousClass00H r0 = r1.A07;
            if (r0 != null) {
                r0.get();
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(r1.getPackageName(), "com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity");
                A0A.putExtra("hint", 2131888240);
                A0A.putExtra("entry_point", 2);
                r5.A02((C1406772n) null, A0A);
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
