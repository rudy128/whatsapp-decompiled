package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4rA  reason: invalid class name and case insensitive filesystem */
public final class C98444rA implements C22486B9s {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public boolean BCL(C186309dz r10, C22484B9q b9q, AnonymousClass5YR r12) {
        if (!(b9q instanceof AnonymousClass4r9)) {
            Log.e("SurveyEligibilityFilter/apply qpUserFilterContext is not correct type");
            C18070vi.A0d("SurveyQpFilter/apply qpUserFilterContext is not correct type", 0);
            ((A6O) this.A02.get()).A03((C134696r0) null, (C196009uJ) null, "SurveyQpFilter/apply qpUserFilterContext is not correct type");
        } else {
            AnonymousClass00H r7 = this.A02;
            AnonymousClass00H r6 = this.A01;
            AnonymousClass4r9 r11 = (AnonymousClass4r9) b9q;
            UserJid userJid = r11.A01;
            A00((A6O) C18070vi.A0E(r7), (AnonymousClass44e) C18070vi.A0E(r6), userJid, "SurveyQpFilter/apply enter");
            ArrayList A04 = ((A5T) r6.get()).A04();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C195409tI r1 = (C195409tI) next;
                if (C18070vi.A18(r1.A02, userJid) && !((C190079kL) this.A00.get()).A00(r1)) {
                    A13.add(next);
                }
            }
            C195409tI r3 = (C195409tI) C29431cG.A0c(A13);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SurveyQpFilter/apply exit surveyInfoStore.allObjects.size=");
            A00((A6O) C18070vi.A0E(r7), (AnonymousClass44e) C18070vi.A0E(r6), userJid, C17880vN.A0t(A10, ((A5T) r6.get()).A04().size()));
            r11.A00 = r3;
            if (r3 != null) {
                return true;
            }
        }
        return false;
    }

    public C98444rA(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static final void A00(A6O a6o, AnonymousClass44e r5, UserJid userJid, String str) {
        C18070vi.A0n(str, a6o, r5);
        ArrayList A04 = r5.A04();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C18070vi.A18(((C195409tI) next).A02, userJid)) {
                A13.add(next);
            }
        }
        if (C29431cG.A0c(A13) != null) {
            a6o.A03((C134696r0) null, (C196009uJ) null, str);
        }
    }
}
