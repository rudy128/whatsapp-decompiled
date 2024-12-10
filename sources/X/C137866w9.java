package X;

/* renamed from: X.6w9  reason: invalid class name and case insensitive filesystem */
public class C137866w9 {
    public final AnonymousClass00H A00;

    public C137866w9(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(C129716iF r7) {
        String str;
        String str2;
        Class<?> cls;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FbProfileDataFetcher/handleErrorsIfAny Received response code: ");
        int i = r7.A02;
        A10.append(i);
        A10.append(", Graph status code: ");
        int i2 = r7.A00;
        A10.append(i2);
        A10.append(", Graph Error subcode: ");
        int i3 = r7.A01;
        A10.append(i3);
        A10.append(", Exception class: ");
        Exception exc = r7.A03;
        if (exc == null || (cls = exc.getClass()) == null) {
            str = null;
        } else {
            str = cls.getSimpleName();
        }
        A10.append(str);
        A10.append(", Exception message: ");
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        C108995ce.A1O(A10, str2);
        if (i == -1) {
            throw new AnonymousClass6Q9((String) null, (Throwable) null, (AnonymousClass1Y1) null, 3);
        } else if (i == 1) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Unknown error: ");
            throw new C122946Sn(C17890vO.A0V(r7.A04, A102));
        } else if (i == 2) {
            if (i3 == 459) {
                throw new AnonymousClass6QC((String) null, (Throwable) null, (AnonymousClass1Y1) null, 3);
            } else if (i3 == 467) {
                throw new AnonymousClass6Q7((String) null, (Throwable) null, (AnonymousClass1Y1) null, 3);
            } else if (i3 == 463) {
                throw new AnonymousClass6Q5((String) null, (Throwable) null, (AnonymousClass1Y1) null, 3);
            } else if (i3 == 464) {
                throw new AnonymousClass6QB((String) null, (Throwable) null, (AnonymousClass1Y1) null, 3);
            } else if (i2 == 190) {
                throw new AnonymousClass6Q8((String) null, (Throwable) null, (AnonymousClass1Y1) null, 3);
            } else {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Unknown error encountered, Code:");
                A103.append(i2);
                throw new C122946Sn(AnonymousClass001.A1I(" Error subcode:", A103, i3));
            }
        }
    }
}
