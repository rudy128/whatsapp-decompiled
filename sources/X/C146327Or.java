package X;

import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;

/* renamed from: X.7Or  reason: invalid class name and case insensitive filesystem */
public class C146327Or implements C1605789a {
    public final int A00;
    public final Object A01;

    public C146327Or(CrossPostingUpdatesViewModel crossPostingUpdatesViewModel, int i) {
        this.A00 = i;
        this.A01 = crossPostingUpdatesViewModel;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Up, java.lang.Object] */
    public void C5S(C136056tC r11) {
        if (this.A00 != 0) {
            CrossPostingUpdatesViewModel.A00((CrossPostingUpdatesViewModel) this.A01, r11.A02, r11.A04);
            return;
        }
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = (CrossPostingUpdatesViewModel) this.A01;
        C123476Up r8 = crossPostingUpdatesViewModel.A00;
        if (r8 == null) {
            C18070vi.A11("crossPostingViewModelState");
            throw null;
        }
        boolean z = r11.A02;
        boolean z2 = r11.A04;
        C122726Rr r5 = r11.A00;
        C122726Rr r4 = r11.A01;
        boolean z3 = r11.A03;
        boolean z4 = r8.A06;
        boolean z5 = r8.A05;
        ? obj = new Object();
        obj.A04 = z;
        obj.A03 = z2;
        obj.A00 = r5;
        obj.A01 = r4;
        obj.A02 = z3;
        obj.A06 = z4;
        obj.A05 = z5;
        if (!obj.equals(r8)) {
            crossPostingUpdatesViewModel.A00 = obj;
            C131736la r0 = crossPostingUpdatesViewModel.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public void C9e(C136056tC r6) {
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = (CrossPostingUpdatesViewModel) this.A01;
        boolean z = r6.A02;
        boolean z2 = r6.A04;
        C123476Up r1 = crossPostingUpdatesViewModel.A00;
        if (r1 == null) {
            C18070vi.A11("crossPostingViewModelState");
            throw null;
        } else if (r1.A06 != z || r1.A05 != z2) {
            r1.A06 = z;
            r1.A05 = z2;
            C131736la r0 = crossPostingUpdatesViewModel.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }
}
