package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.AYi  reason: case insensitive filesystem */
public class C20779AYi implements BBF {
    public final /* synthetic */ C198709ym A00;
    public final /* synthetic */ C184839bb A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C20779AYi(C198709ym r1, C184839bb r2, Boolean bool, String str, String str2, String str3, String str4) {
        this.A00 = r1;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = bool;
        this.A03 = str4;
        this.A01 = r2;
    }

    public void C26(A7B a7b) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        C184839bb r0 = this.A01;
        AnonymousClass91q.A0q(r0.A00, (Map) null, a7b.A00);
    }

    public void C27(AZ2 az2) {
        C198709ym r0 = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        AZ2 az22 = az2;
        C198709ym.A00(r0, az22, this.A01, this.A02, str, str2, str3, this.A03);
    }
}
