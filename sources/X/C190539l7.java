package X;

import java.util.Map;

/* renamed from: X.9l7  reason: invalid class name and case insensitive filesystem */
public class C190539l7 {
    public final /* synthetic */ C35871mw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C190539l7(C35871mw r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public void A00(Integer num) {
        C23691Hg r1;
        C35871mw r4 = this.A00;
        Map map = r4.A00;
        String str = this.A02;
        map.remove(str);
        String str2 = this.A01;
        ((AnonymousClass9j4) r4.A05.get()).A00(5, str, str2);
        if (num == null || num.intValue() != 400) {
            r1 = new AnonymousClass7KS(str, str2, 2);
        } else {
            ((C195219sz) r4.A06.get()).A00(18);
            r1 = new C20735AWq(21);
        }
        r4.notifyAllObservers(r1);
    }
}
