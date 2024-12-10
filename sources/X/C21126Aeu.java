package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Aeu  reason: case insensitive filesystem */
public final /* synthetic */ class C21126Aeu implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C35151lj A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ Set A07;

    public final void accept(Object obj) {
        C35151lj r2 = this.A03;
        Map map = this.A06;
        r2.A0K.CGN(new C21404AjX(r2, this.A04, this.A05, (List) obj, map, this.A07, this.A00, this.A01, this.A02));
    }

    public /* synthetic */ C21126Aeu(C35151lj r1, DeviceJid deviceJid, String str, Map map, Set set, int i, int i2, int i3) {
        this.A03 = r1;
        this.A06 = map;
        this.A04 = deviceJid;
        this.A05 = str;
        this.A07 = set;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
