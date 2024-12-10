package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.flows.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2;
import com.whatsapp.jid.UserJid;

public class AQO implements AnonymousClass5ZX {
    public C19880zA A00;
    public C196149uX A01;
    public C26911Ty A02;
    public C24751Ln A03;
    public C18030ve A04;
    public ALX A05;
    public AnonymousClass1QO A06;
    public AnonymousClass1QS A07;
    public C85754Op A08;
    public C192479oS A09;
    public AnonymousClass1R2 A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;

    public void CBR(Context context, AnonymousClass5XY r18, AnonymousClass206 r19, C20285AEt aEt, int i) {
        AE0 ae0;
        Intent A1T;
        C20285AEt aEt2 = aEt;
        C20279AEn aEn = aEt2.A02;
        if (aEn != null) {
            Context context2 = context;
            AnonymousClass206 r13 = r19;
            int i2 = i;
            if (!AnonymousClass8BU.A1S(aEt2, "review_order")) {
                AnonymousClass205 r3 = r13.A0v;
                if (r3.A02 && this.A0A.A09.A0A()) {
                    AnonymousClass1R2 r2 = this.A0A;
                    if (r2.A09.A05(AnonymousClass11S.A00(r2.A00)) == 1) {
                        AnonymousClass1R2 r0 = this.A0A;
                        if (r0.A09.A05(r3.A00) == 1) {
                            if (i2 == 10) {
                                C19880zA r1 = this.A00;
                                if (r1.A07()) {
                                    r1.A03();
                                    throw AnonymousClass000.A0s("launchUpdateStatus");
                                }
                            }
                            this.A08.A01.A0N(1107);
                            if (C18020vd.A05(C18040vf.A02, this.A08.A01, 1107)) {
                                this.A08.A00.A03();
                                throw AnonymousClass000.A0s("getOrderDetailsActivity");
                            } else if (r13 instanceof AnonymousClass21K) {
                                aEt2 = AnonymousClass8BR.A0g(r13);
                            } else {
                                aEt2 = null;
                            }
                        }
                    }
                }
                this.A08.A01.A0N(1107);
            } else if (i2 != 0) {
                if (i2 == 1) {
                    A1T = this.A09.A00(context2, aEn, r13.A0v, aEn.A0I, aEn.A08, (String) null);
                    if (A1T == null) {
                        return;
                    }
                } else if (i2 == 3) {
                    A1T = AnonymousClass1LU.A1T(context2, "com.bloks.www.payments.whatsapp.f2care", (String) null);
                } else {
                    return;
                }
                context2.startActivity(A1T);
                return;
            }
            UserJid A0I = r13.A0I();
            if (A0I != null) {
                if (C18020vd.A05(C18040vf.A02, this.A04, 10765) && (ae0 = aEn.A0C) != null) {
                    int A0E = AnonymousClass8BR.A0U(this.A0D).A0E(A0I, "prefetch_conversation");
                    C188329hF r4 = (C188329hF) this.A0C.get();
                    C30451dy.A00(new C21538All(this, A0E), r4.A07, new FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(r4, A0I, Integer.valueOf(A0E), ae0.A00, (C30391dr) null, false));
                }
            }
            this.A02.A0D(new C20476AMn(context2, this, aEn, r13, aEt2, i2), r13.A0I());
        }
    }
}
