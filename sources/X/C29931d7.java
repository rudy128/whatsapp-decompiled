package X;

import android.os.Handler;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;

/* renamed from: X.1d7  reason: invalid class name and case insensitive filesystem */
public final class C29931d7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29931d7(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager) {
        super(0);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(((C25151Nc) this.this$0.A02.get()).A00(), new AAL(this.this$0, 4));
    }
}
