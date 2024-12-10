package X;

/* renamed from: X.33Y  reason: invalid class name */
public final class AnonymousClass33Y implements AnonymousClass3L3 {
    public void CRj(C20077A6d a6d, AnonymousClass206 r8) {
        boolean A17 = C18070vi.A17(r8, a6d);
        if (!a6d.A0L && !a6d.A0K) {
            int i = r8.A0u;
            if (i != 103 || !C22971Dz.A0f(r8)) {
                AnonymousClass206 A0K = r8.A0K();
                if (i == 103) {
                    if (A0K != null) {
                        AnonymousClass205 r0 = A0K.A0v;
                        if (r0 == null || r0.A02 != A17) {
                            C692236j A02 = C63672tV.A02(A0K);
                            if (A02 != null && A02.A01() == A17) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    throw new C32711hd(0, "Status mention message is invalid");
                }
            }
        }
    }
}
