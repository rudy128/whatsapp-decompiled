package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2lD  reason: invalid class name and case insensitive filesystem */
public class C58762lD {
    public long A00;
    public Jid A01;
    public Jid A02;
    public UserJid A03;
    public C29621ca A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final Map A0A = C17880vN.A11();

    public C60132nR A00() {
        ArrayList A10;
        Map map = this.A0A;
        if (map.isEmpty()) {
            A10 = null;
        } else {
            A10 = C17880vN.A10(map.values());
        }
        Jid jid = this.A02;
        String str = this.A06;
        String str2 = this.A08;
        C17960vV.A07(str2);
        String str3 = this.A09;
        String str4 = this.A05;
        return new C60132nR(jid, this.A01, this.A03, this.A04, str, str2, str3, str4, this.A07, A10, this.A00);
    }

    public void A01(String str) {
        this.A0A.put("error", new AnonymousClass1MD("error", str));
    }
}
