package X;

import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.atomic.AtomicReference;

public class BPD extends C5B {
    public CXB A00;
    public final C24466C5g A01;
    public final AtomicReference A02;

    public static boolean A00(D48 d48, List list) {
        String A002;
        String str = d48.A0R;
        if (str == null) {
            A002 = null;
        } else {
            try {
                A002 = new Locale(str).getISO3Language();
            } catch (MissingResourceException unused) {
                A002 = C24603CBh.A00(str);
            }
        }
        return list.contains(A002);
    }

    public void A01(BPB bpb) {
        D9J d9j;
        BPC bpc = new BPC(bpb);
        if (!this.A02.getAndSet(bpc).equals(bpc) && (d9j = this.A00) != null) {
            d9j.A0g.A00.sendEmptyMessage(11);
        }
    }

    public BPD(C24466C5g c5g) {
        this.A01 = c5g;
        this.A02 = new AtomicReference(BPC.A09);
    }

    public BPD() {
        this((C24466C5g) null);
    }
}
