package X;

/* renamed from: X.5jp  reason: invalid class name and case insensitive filesystem */
public final class C111505jp extends C40411uf {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        AnonymousClass6TF r3 = (AnonymousClass6TF) obj;
        AnonymousClass6TF r4 = (AnonymousClass6TF) obj2;
        C18070vi.A0h(r3, r4);
        if (!(r3 instanceof AnonymousClass60H) || !(r4 instanceof AnonymousClass60H)) {
            return r3.equals(r4);
        }
        AnonymousClass60H r32 = (AnonymousClass60H) r3;
        AnonymousClass60H r42 = (AnonymousClass60H) r4;
        if (!C18070vi.A18(r32.A03, r42.A03) || !C18070vi.A18(r32.A01, r42.A01) || r32.A04 != r42.A04 || r32.A00 != r42.A00) {
            return false;
        }
        C1418377d r1 = r32.A02;
        C1418377d r0 = r42.A02;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
            return true;
        } else if (r0 == null || !C18070vi.A18(r1.A0F, r0.A0F)) {
            return false;
        } else {
            return true;
        }
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        AnonymousClass6TF r6 = (AnonymousClass6TF) obj;
        AnonymousClass6TF r7 = (AnonymousClass6TF) obj2;
        C18070vi.A0h(r6, r7);
        if ((r6 instanceof AnonymousClass60G) && (r7 instanceof AnonymousClass60G)) {
            AnonymousClass60G r62 = (AnonymousClass60G) r6;
            AnonymousClass60G r72 = (AnonymousClass60G) r7;
            if (!C18070vi.A18(r62.A01, r72.A01) || r62.A00 != r72.A00) {
                return false;
            }
            return true;
        } else if ((r6 instanceof AnonymousClass60I) && (r7 instanceof AnonymousClass60I)) {
            return true;
        } else {
            if (!(r6 instanceof AnonymousClass60H) || !(r7 instanceof AnonymousClass60H)) {
                return false;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass77V r1 = ((AnonymousClass60H) r6).A01;
            A10.append(r1.A06);
            A10.append('/');
            A10.append(r1.A04);
            A10.append('/');
            String A0y = AnonymousClass000.A0y(r1.A05, A10);
            StringBuilder A102 = AnonymousClass000.A10();
            AnonymousClass77V r12 = ((AnonymousClass60H) r7).A01;
            A102.append(r12.A06);
            A102.append('/');
            A102.append(r12.A04);
            A102.append('/');
            return C18070vi.A18(A0y, AnonymousClass000.A0y(r12.A05, A102));
        }
    }
}
