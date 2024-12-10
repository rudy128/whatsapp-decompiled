package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.Jid;

/* renamed from: X.4mR  reason: invalid class name and case insensitive filesystem */
public class C95564mR implements C107305Ze {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C95564mR(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Bkp() {
        String str;
        if (this.A00 != 0) {
            ((AnonymousClass4aY) this.A01).A2u((AnonymousClass1E7) this.A02);
            return;
        }
        Jid jid = (Jid) this.A02;
        C92874i3 r4 = (C92874i3) ((C825248h) this.A01).A01;
        C92874i3.A02(r4, 13);
        String A002 = r4.A0Z.A00(r4.A0G);
        switch (A002.hashCode()) {
            case -839883634:
                str = "PERMANENT";
                break;
            case 181990675:
                if (A002.equals("UNBLOCKED")) {
                    C92874i3.A03(r4, 4);
                    r4.A12.A00();
                    AnonymousClass1L9 r3 = r4.A0S;
                    ContactInfoActivity contactInfoActivity = r4.A0l;
                    r3.A08(contactInfoActivity, AnonymousClass1LU.A0z(contactInfoActivity, jid, (Integer) null, 9));
                    return;
                }
                return;
            case 476614193:
                str = "TEMPORARY";
                break;
            default:
                return;
        }
        if (A002.equals(str)) {
            r4.A0e.A02(r4.A0l, A002);
        }
    }
}
