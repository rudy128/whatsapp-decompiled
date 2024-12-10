package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4hy  reason: invalid class name and case insensitive filesystem */
public class C92824hy implements B77 {
    public final int A00;
    public final Object A01;

    public C92824hy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bmx(AEW aew) {
        C20042A4l a4l;
        C19830z4 r0;
        boolean z;
        switch (this.A00) {
            case 0:
                BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A01;
                if (aew != null && (a4l = businessProfileExtraFieldsActivity.A00) != null) {
                    a4l.A02(aew);
                    return;
                }
                return;
            case 1:
                ((C77833rZ) this.A01).A00 = aew;
                return;
            default:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                if (aew != null) {
                    List list = aew.A0P;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                AEQ aeq = (AEQ) it.next();
                                if (aeq != null && aeq.A00.equals("644728732639272")) {
                                    r0 = conversationsFragment.A1s;
                                    z = true;
                                }
                            } else {
                                r0 = conversationsFragment.A1s;
                                z = false;
                            }
                        }
                        C17880vN.A1F(C19830z4.A00(r0), "not_a_business", z);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
