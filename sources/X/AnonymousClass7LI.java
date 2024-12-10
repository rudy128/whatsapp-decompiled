package X;

/* renamed from: X.7LI  reason: invalid class name */
public final class AnonymousClass7LI implements AnonymousClass1O5 {
    public C127106do A00;
    public final AnonymousClass1OZ A01;

    public AnonymousClass7LI(AnonymousClass1OZ r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0d(r4, 1);
        C29621ca A0K = r4.A0K("error");
        if (A0K != null) {
            C17900vP.A0i("error getting 1on1 invite code ", AnonymousClass000.A10(), A0K.A0A("code", 0));
        }
        C127106do r0 = this.A00;
        if (r0 != null) {
            r0.A00.invoke();
        }
    }

    public void C7Z(C29621ca r4, String str) {
        String A02;
        C18070vi.A0d(r4, 1);
        C29621ca A0K = r4.A0K("invite");
        if (A0K == null || (A02 = C29621ca.A02(A0K, "code")) == null) {
            C127106do r0 = this.A00;
            if (r0 != null) {
                r0.A00.invoke();
                return;
            }
            return;
        }
        C127106do r02 = this.A00;
        if (r02 != null) {
            r02.A01.invoke(A02, (Object) null);
        }
    }

    public void BrD(String str) {
        C127106do r0 = this.A00;
        if (r0 != null) {
            r0.A00.invoke();
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
