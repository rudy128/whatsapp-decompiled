package X;

/* renamed from: X.7KW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7KW implements C23691Hg {
    public final /* synthetic */ C122946Sn A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public final void CGE(Object obj) {
        String str;
        Class<?> cls;
        boolean z = this.A03;
        Integer num = this.A01;
        Integer num2 = this.A02;
        C122946Sn r3 = this.A00;
        C126856dP r10 = (C126856dP) obj;
        C18070vi.A0d(r10, 4);
        C130526jZ r6 = r10.A00;
        if (z) {
            C30131dR r1 = r6.A05;
            r1.A02(AnonymousClass000.A0i(), "is_account_linked");
            r1.A04("SEE_LINKING_SUCCESS");
            r1.A01();
            C1605989c r0 = r6.A00;
            if (r0 != null) {
                r0.onSuccess();
            }
        } else {
            C30131dR r7 = r6.A05;
            r7.A02(AnonymousClass000.A0h(), "is_account_linked");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Error code: ");
            A10.append(num);
            A10.append(", error subcode: ");
            A10.append(num2);
            A10.append(", exception: ");
            if (r3 == null || (cls = r3.getClass()) == null) {
                str = null;
            } else {
                str = cls.getCanonicalName();
            }
            r7.A05("SEE_LINKING_ERROR", AnonymousClass000.A0y(str, A10));
            C1605989c r02 = r6.A00;
            if (r02 != null) {
                r02.Btv(r3, num, num2);
            }
        }
        r6.A00 = null;
    }

    public /* synthetic */ AnonymousClass7KW(C122946Sn r1, Integer num, Integer num2, boolean z) {
        this.A03 = z;
        this.A01 = num;
        this.A02 = num2;
        this.A00 = r1;
    }
}
