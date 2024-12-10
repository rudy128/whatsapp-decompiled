package X;

import com.whatsapp.jid.Jid;
import java.util.ListIterator;

/* renamed from: X.ATi  reason: case insensitive filesystem */
public class C20650ATi implements C22508BAp {
    public final C20079A6f A00;
    public final Jid A01;
    public final /* synthetic */ C20653ATl A02;

    public C20650ATi(C20079A6f a6f, C20653ATl aTl, Jid jid) {
        this.A02 = aTl;
        this.A00 = a6f;
        this.A01 = jid;
    }

    public void BtA(C190599lD r2, int i) {
        BAY bay = this.A02.A08;
        if (bay != null) {
            bay.Bmz(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C195699tl r5 = (C195699tl) obj;
        C20653ATl aTl = this.A02;
        if (aTl.A08 != null) {
            Jid jid = this.A01;
            if (jid != null) {
                String rawString = jid.getRawString();
                ListIterator listIterator = r5.A09.listIterator();
                while (listIterator.hasNext()) {
                    if (((AF0) listIterator.next()).A0F.equals(rawString)) {
                        listIterator.remove();
                    }
                }
            }
            C196579vI.A01(this.A00, r5.A09);
            aTl.A08.Bn0(r5);
        }
    }
}
