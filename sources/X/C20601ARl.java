package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.ARl  reason: case insensitive filesystem */
public class C20601ARl implements C22500BAh {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ BrazilOrderDetailsActivity A01;
    public final /* synthetic */ ADQ A02;
    public final /* synthetic */ AnonymousClass21K A03;
    public final /* synthetic */ String A04;

    public void C6i() {
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        brazilOrderDetailsActivity.CEx();
        String str = brazilOrderDetailsActivity.A0s;
        if (str == null) {
            BrazilPaymentActivity.A0x(this.A00.A02, brazilOrderDetailsActivity, this.A02, "p2m_context", this.A04);
        } else {
            brazilOrderDetailsActivity.A0A.A00(new C21456AkN(this, this.A00, this.A02, this.A04, 37), str);
        }
    }

    public C20601ARl(ARR arr, BrazilOrderDetailsActivity brazilOrderDetailsActivity, ADQ adq, AnonymousClass21K r4, String str) {
        this.A01 = brazilOrderDetailsActivity;
        this.A03 = r4;
        this.A00 = arr;
        this.A02 = adq;
        this.A04 = str;
    }

    public void C6l() {
        C20279AEn aEn;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        brazilOrderDetailsActivity.CEx();
        AnonymousClass21K r1 = this.A03;
        C20285AEt BPK = r1.BPK();
        if (BPK != null && (aEn = BPK.A02) != null && aEn.A0D.A02 != null) {
            Resources resources = brazilOrderDetailsActivity.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            long j = r1.BPK().A02.A0D.A02.A00;
            C18000vb r6 = brazilOrderDetailsActivity.A06;
            String A0x = AnonymousClass3MW.A0x(resources, new SimpleDateFormat("HH:mm", r6.A0N()).format(new Date(j * 1000)), A1a, 0, 2131893204);
            C73203Rj A002 = AnonymousClass4a6.A00(brazilOrderDetailsActivity);
            A002.A0T(false);
            A002.A0E(2131893202);
            A002.A0S(A0x);
            A002.A0Z((DialogInterface.OnClickListener) null, 2131893201);
            AnonymousClass3MY.A1G(A002);
        }
    }
}
