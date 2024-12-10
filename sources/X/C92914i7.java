package X;

import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel;

/* renamed from: X.4i7  reason: invalid class name and case insensitive filesystem */
public class C92914i7 implements C72073Kn {
    public final int A00;
    public final Object A01;

    public C92914i7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C3p(boolean z) {
        switch (this.A00) {
            case 2:
                C72073Kn r0 = (C72073Kn) this.A01;
                if (r0 != null) {
                    r0.C3p(z);
                    return;
                }
                return;
            case 3:
                if (z) {
                    C78413sl r1 = (C78413sl) this.A01;
                    C78413sl.A00(r1, r1.A04);
                    return;
                }
                return;
            default:
                ((BlockReasonListViewModel) this.A01).A0B.A0F((Object) null);
                return;
        }
    }
}
