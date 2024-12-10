package X;

import com.whatsapp.util.Log;

/* renamed from: X.AYe  reason: case insensitive filesystem */
public class C20775AYe implements BBF {
    public final /* synthetic */ C198599yb A00;
    public final /* synthetic */ BBE A01;
    public final /* synthetic */ String A02;

    public C20775AYe(C198599yb r1, BBE bbe, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = bbe;
    }

    public void C26(A7B a7b) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        this.A01.BwU(a7b);
    }

    public void C27(AZ2 az2) {
        C198599yb.A00(this.A00, this.A01, az2, this.A02);
    }
}
