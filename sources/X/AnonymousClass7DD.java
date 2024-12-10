package X;

import com.whatsapp.util.Log;

/* renamed from: X.7DD  reason: invalid class name */
public class AnonymousClass7DD implements C1598786f {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7DD(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void Bti() {
        if (this.A00 != 0) {
            Log.i("WabaiConsentManager/sync/error");
            ((C1603388b) this.A01).C3p(false);
            return;
        }
        Log.i("BonsaiTos/error/error");
        C108945cZ.A1Q(this.A01);
    }
}
