package X;

import android.util.Base64;
import java.util.Iterator;

/* renamed from: X.8X4  reason: invalid class name */
public final class AnonymousClass8X4 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X4() {
        super(AnonymousClass8XH.DEFAULT_INSTANCE);
    }

    public static void A00(AnonymousClass8X4 r3, Iterator it) {
        byte[] decode = Base64.decode((String) it.next(), 2);
        r3.A0G(DSQ.A01(decode, 0, decode.length));
    }

    public void A0G(DSQ dsq) {
        AnonymousClass8XH r2 = (AnonymousClass8XH) C17880vN.A0G(this);
        int i = AnonymousClass8XH.SELECTED_OPTIONS_FIELD_NUMBER;
        EE9 ee9 = r2.selectedOptions_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r2.selectedOptions_ = ee9;
        }
        ee9.add(dsq);
    }
}
