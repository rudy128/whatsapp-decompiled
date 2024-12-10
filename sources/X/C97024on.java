package X;

/* renamed from: X.4on  reason: invalid class name and case insensitive filesystem */
public class C97024on implements C23691Hg {
    public final int A00;
    public final int A01;
    public final String A02;

    public C97024on(String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i;
    }

    public final void CGE(Object obj) {
        C134106q3 r4;
        AnonymousClass6CG r0;
        switch (this.A00) {
            case 0:
                String str = this.A02;
                int i = this.A01;
                C134226qF r8 = (C134226qF) obj;
                C18070vi.A0d(r8, 2);
                r8.A01(str, i);
                return;
            case 1:
                String str2 = this.A02;
                int i2 = this.A01;
                AnonymousClass4LW r82 = (AnonymousClass4LW) obj;
                C18070vi.A0d(r82, 2);
                AnonymousClass4aY r3 = r82.A00;
                if (AnonymousClass4aY.A26(r3)) {
                    if (r3.A3D == null) {
                        AnonymousClass4aY.A0y(r3);
                        r3.A1M.post(new C21454AkL(r82, str2, i2, 4));
                    } else {
                        AnonymousClass4aY.A1e(r3, str2, i2, true);
                    }
                }
                C80753xv r02 = r3.A3L;
                if (r02 != null && r02.A01()) {
                    r3.A3L.A00(false);
                }
                C117015z4 r5 = r3.A3K;
                if (r5 != null && (r4 = r5.A08) != null) {
                    if (!r5.isShowing()) {
                        r5.A0K(3, r5.A0O, r5.A0D);
                        r5.A0D();
                    }
                    C117015z4.A03(r5, 3);
                    if (str2 != null && (r0 = r4.A04) != null) {
                        r0.A07(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                String str3 = this.A02;
                int i3 = this.A01;
                AnonymousClass4LW r83 = (AnonymousClass4LW) obj;
                C18070vi.A0d(r83, 2);
                AnonymousClass4aY r42 = r83.A00;
                if (AnonymousClass4aY.A26(r42)) {
                    if (r42.A3D == null) {
                        AnonymousClass4aY.A0y(r42);
                        r42.A1M.post(new C21454AkL(r83, str3, i3, 3));
                    } else {
                        AnonymousClass4aY.A1e(r42, str3, i3, false);
                    }
                }
                C80753xv r03 = r42.A3L;
                if (r03 != null && r03.A01()) {
                    r42.A3L.A00(false);
                }
                C117015z4 r04 = r42.A3K;
                if (r04 != null) {
                    r04.A0O(str3);
                    return;
                }
                return;
        }
    }
}
