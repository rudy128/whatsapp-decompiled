package X;

import android.util.Pair;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8nG  reason: invalid class name */
public class AnonymousClass8nG extends AnonymousClass6LQ {
    public final AnonymousClass11E A00;
    public final AnonymousClass1M9 A01;
    public final C678831f A02;
    public final AnonymousClass1OZ A03;
    public final List A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        List list = this.A04;
        list.size();
        C130886kA r7 = new C130886kA((C199429zz) null, AnonymousClass000.A13(), AnonymousClass000.A13(), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null);
        if (!this.A00.A09()) {
            return r7;
        }
        try {
            this.A03.A0E(32000);
            Pair A042 = this.A02.A04(AnonymousClass2R1.A0F, list);
            if (!((C62602rf) A042.first).A01()) {
                return r7;
            }
            HashMap A11 = C17880vN.A11();
            ArrayList A13 = AnonymousClass000.A13();
            for (C188829i3 r0 : (C188829i3[]) A042.second) {
                UserJid userJid = r0.A0D;
                if (userJid != null) {
                    AnonymousClass1E7 A0H = this.A01.A0H(userJid);
                    if (A0H.A0J != null) {
                        A11.put(A0H.A0J.getRawString(), A0H);
                    }
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                try {
                    C22951Dx r02 = PhoneUserJid.Companion;
                    A13.add(A11.get(C22951Dx.A01(A0v).getRawString()));
                } catch (AnonymousClass11T unused) {
                    C17900vP.A0f("PaymentMerchantListQueryContactsTask/doInBackground unable to get phone num jid for contact: ", A0v, AnonymousClass000.A10());
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PaymentMerchantListQueryContactsTask/doInBackground query success merchants contacts: ");
            C17900vP.A0o(A10, A13.size());
            return new C130886kA((C199429zz) null, AnonymousClass000.A13(), A13, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null);
        } catch (C36811oV unused2) {
            return r7;
        }
    }

    public AnonymousClass8nG(AnonymousClass11E r1, AnonymousClass1M9 r2, ContactPickerFragment contactPickerFragment, C678831f r4, AnonymousClass1OZ r5, List list) {
        super(contactPickerFragment);
        this.A04 = list;
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = r1;
    }
}
