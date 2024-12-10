package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.B1b  reason: case insensitive filesystem */
public final class C22273B1b extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Context $activityContext;
    public final /* synthetic */ AnonymousClass206 $message;
    public final /* synthetic */ C20285AEt $messageContent;
    public final /* synthetic */ AQN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22273B1b(Context context, AQN aqn, AnonymousClass206 r4, C20285AEt aEt) {
        super(1);
        this.this$0 = aqn;
        this.$activityContext = context;
        this.$message = r4;
        this.$messageContent = aEt;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C194359rb r9 = (C194359rb) obj;
        AQN aqn = this.this$0;
        Context context = this.$activityContext;
        AnonymousClass206 r5 = this.$message;
        C20285AEt aEt = this.$messageContent;
        A8Q a8q = aqn.A01;
        a8q.A08(10, (String) null, (String) null);
        AER aer = aEt.A07;
        if (aer != null) {
            AEE aee = aEt.A05;
            if (aee != null) {
                str = aee.A02;
            } else {
                str = null;
            }
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(context.getPackageName(), "com.whatsapp.biz.catalog.view.activity.ProductListActivity");
            A0A.putExtra("message_content", aer);
            A0A.putExtra("message_title", str);
            context.startActivity(A0A);
            UserJid userJid = aer.A00;
            String str2 = aer.A01.A01;
            CatalogManager catalogManager = (CatalogManager) aqn.A05.get();
            catalogManager.A08.add(new ANF(catalogManager, new C185809dB(aqn, r5, aer), str2));
            if (!catalogManager.A0G(new C195469tO(r9, userJid, 0, (Integer) null, str2, a8q.A03, false))) {
                C17900vP.A0e("ProductHeaderIntegrityChecker/AsyncCallback/Failed to get product status, reason - ", "Failed to send product request", AnonymousClass000.A10());
            }
        }
        return C27621Wu.A00;
    }
}
