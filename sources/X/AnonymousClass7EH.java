package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7EH  reason: invalid class name */
public class AnonymousClass7EH implements C1599786p {
    public final CharSequence A00;
    public final List A01;

    public final String A00() {
        List list = this.A01;
        if (list.size() > 1) {
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0D.add(AnonymousClass17K.A02(C17880vN.A0O(it)));
            }
            return C108995ce.A0X(", ", A0D);
        }
        String A02 = AnonymousClass17K.A02(getContact());
        if (A02 == null) {
            return "";
        }
        return A02;
    }

    public AnonymousClass1E7 getContact() {
        if (this instanceof C116585yG) {
            return ((C116585yG) this).A00;
        }
        return (AnonymousClass1E7) C108955ca.A0p(this.A01);
    }

    public AnonymousClass7EH(List list, CharSequence charSequence) {
        C18070vi.A0j(charSequence, list);
        this.A00 = charSequence;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NonWhatsAppContactListItem{displayName='");
        A10.append(this.A00);
        A10.append("', waContactList=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }
}
