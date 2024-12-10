package X;

public class AH1 implements C24051Ir {
    public final int A00;
    public final Object A01;

    public AH1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        return new com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1J2 BG9(java.lang.Class r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x001e;
                case 2: goto L_0x0017;
                case 3: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.9iA r0 = (X.C188889iA) r0
            X.1QS r1 = r0.A0I
            X.1QL r0 = r0.A0F
            X.8FQ r2 = new X.8FQ
            r2.<init>(r0, r1)
            return r2
        L_0x0013:
            X.C60282nh.A01()
            goto L_0x007a
        L_0x0017:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r0
            X.A2y r0 = r0.A05
            goto L_0x0024
        L_0x001e:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r0
            X.A2y r0 = r0.A0E
        L_0x0024:
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r2 = new com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel
            r2.<init>(r0)
            return r2
        L_0x002a:
            java.lang.Object r1 = r14.A01
            com.whatsapp.group.GroupMembershipApprovalRequestsFragment r1 = (com.whatsapp.group.GroupMembershipApprovalRequestsFragment) r1
            X.9VT r0 = r1.A00
            if (r0 == 0) goto L_0x0072
            X.1EC r12 = r1.A07
            if (r12 == 0) goto L_0x0075
            X.1na r2 = r0.A00
            X.10E r1 = r2.A02
            X.11P r6 = X.AnonymousClass10E.A6O(r1)
            X.10I r13 = X.AnonymousClass10E.AL1(r1)
            X.1CJ r7 = X.AnonymousClass3Ma.A0d(r1)
            X.18K r10 = X.AnonymousClass3Ma.A0g(r1)
            X.1M9 r4 = X.AnonymousClass10E.A4z(r1)
            X.00S r0 = r1.A2L
            java.lang.Object r3 = r0.get()
            X.1kb r3 = (X.C34511kb) r3
            X.1Me r5 = X.AnonymousClass3MZ.A0g(r1)
            X.1MZ r9 = X.AnonymousClass3MY.A0V(r1)
            X.00S r0 = r1.A4q
            java.lang.Object r8 = r0.get()
            X.9u7 r8 = (X.C195899u7) r8
            X.1nZ r0 = r2.A01
            X.9fY r11 = X.C36241nZ.A0Y(r0)
            X.8GR r2 = new X.8GR
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
        L_0x0072:
            java.lang.String r0 = "pendingRequestsViewModelFactory"
            goto L_0x0077
        L_0x0075:
            java.lang.String r0 = "groupJid"
        L_0x0077:
            X.C18070vi.A11(r0)
        L_0x007a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AH1.BG9(java.lang.Class):X.1J2");
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r9, Class cls) {
        if (3 - this.A00 != 0) {
            return C60282nh.A00(this, cls);
        }
        C18070vi.A0d(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass8F3.class)) {
            AnonymousClass1K2 r2 = ((C182599Uz) this.A01).A00;
            AnonymousClass10E r1 = r2.A01;
            return new AnonymousClass8F3(AnonymousClass0YX.A00(r1.Ao9), AnonymousClass10E.A17(r1), AnonymousClass10E.A6Q(r1), AnonymousClass8BT.A0I(r1), AnonymousClass1K1.A17(r2.A00));
        }
        throw AnonymousClass000.A0k("Unknown ViewModel class");
    }
}
