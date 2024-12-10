package X;

import android.content.Context;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.search.SearchFragment;
import java.util.List;

/* renamed from: X.5qh  reason: invalid class name and case insensitive filesystem */
public abstract class C114375qh extends C6J {
    /* renamed from: A02 */
    public void A00(C23520Bik bik) {
        if (this instanceof C114415ql) {
            C114415ql r1 = (C114415ql) this;
            if (3 - r1.A00 == 0) {
                C108985cd.A0X((C32741hg) ((C129246hU) r1.A01).A02.A04.get()).A04("see_status_sent_snack_bar");
            }
        } else if (this instanceof C114425qm) {
            C114425qm r2 = (C114425qm) this;
            if (r2.A00 == 0) {
                C108985cd.A0X((C32741hg) ((C41751x0) r2.A02).A04.get()).A04("see_status_sent_snack_bar");
                C114375qh r0 = (C114375qh) r2.A01;
                if (r0 != null) {
                    r0.A00(bik);
                }
            }
        }
    }

    public void A03(C23520Bik bik, int i) {
        if (this instanceof C114395qj) {
            C114395qj r0 = (C114395qj) this;
            C41821x7 r2 = r0.A02;
            Context context = r0.A01;
            int i2 = r0.A00;
            Integer num = r0.A03;
            C41821x7.A00(context, r2, num, "status_fragment", i2);
            C30131dR A13 = C108945cZ.A13(r2.A0H);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Error code: ");
            A10.append(i2);
            A13.A05("SEE_CROSSPOST_ERROR", AnonymousClass001.A1E(num, ", error subcode: ", A10));
        } else if (this instanceof C114405qk) {
            C114405qk r22 = (C114405qk) this;
            if (!r22.A00) {
                r22.A00 = true;
                C18070vi.A0d(AnonymousClass001.A1I("CrosspostManager/handleAutoCrosspostErrorWithSnackBarMessage/snackbar_callback event: ", AnonymousClass000.A10(), i), 0);
                ((C139006y3) r22.A03.A02.get()).A01(r22.A02, r22.A04, r22.A05, "status_fragment", r22.A06, r22.A07, r22.A08, r22.A01);
            }
        } else if (this instanceof C114415ql) {
            C114415ql r1 = (C114415ql) this;
            switch (r1.A00) {
                case 0:
                    C72453Mb.A1O(((ContactPickerFragment) r1.A01).A22);
                    return;
                case 1:
                    ((SearchFragment) r1.A01).A07 = null;
                    return;
                case 2:
                    C41821x7 r23 = (C41821x7) r1.A01;
                    ((AnonymousClass730) C18070vi.A0E(r23.A07)).A02("status_fragment");
                    C108945cZ.A13(r23.A0H).A05("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
                    return;
                default:
                    C108985cd.A0X((C32741hg) ((C129246hU) r1.A01).A02.A04.get()).A00();
                    return;
            }
        } else {
            C114425qm r3 = (C114425qm) this;
            if (r3.A00 != 0) {
                C41801x5 r12 = (C41801x5) r3.A02;
                r12.A02.get();
                ((C139126yG) r12.A0A.get()).A01(C139006y3.A00((List) r3.A01), "status_fragment");
                return;
            }
            C108985cd.A0X((C32741hg) ((C41751x0) r3.A02).A04.get()).A00();
            C114375qh r02 = (C114375qh) r3.A01;
            if (r02 != null) {
                r02.A03(bik, i);
            }
        }
    }
}
