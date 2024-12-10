package X;

/* renamed from: X.0If  reason: invalid class name and case insensitive filesystem */
public final class C03450If {
    public final C04910Pm A00 = new C04910Pm();
    public final C04910Pm A01 = new C04910Pm();

    public final void A00(C02090Cr r18, C18090vk r19, int i) {
        C04910Pm r14 = this.A00;
        AnonymousClass07t r12 = AnonymousClass07t.A00;
        r14.A06(r12);
        AnonymousClass0L9.A01(r14, r19, 0);
        int i2 = i;
        AnonymousClass0L9.A00(r14, 0, i2);
        C02090Cr r2 = r18;
        AnonymousClass0L9.A01(r14, r2, 1);
        int i3 = r14.A03;
        int i4 = r12.A00;
        if (i3 == AnonymousClass001.A0A(i4) && r14.A04 == AnonymousClass0PV.A00(r12)) {
            C04910Pm r122 = this.A01;
            C012607u r5 = C012607u.A00;
            r122.A06(r5);
            int i5 = 0;
            AnonymousClass0L9.A00(r122, 0, i2);
            AnonymousClass0L9.A01(r122, r2, 0);
            int i6 = r122.A03;
            int i7 = -1 >>> 31;
            if (i6 != i7 || r122.A04 != i7) {
                StringBuilder A10 = AnonymousClass000.A10();
                int i8 = 0;
                int i9 = 1 << 0;
                if ((i9 & i6) != 0) {
                    A10.append(r5.A04(0));
                    i5 = 1;
                }
                String obj = A10.toString();
                C18070vi.A0X(obj);
                StringBuilder A102 = AnonymousClass000.A10();
                if ((i9 & r122.A04) != 0) {
                    if (i5 > 0) {
                        A102.append(", ");
                    }
                    AnonymousClass0PV.A02(r5, A102, 0);
                    i8 = 1;
                }
                String obj2 = A102.toString();
                C18070vi.A0X(obj2);
                StringBuilder A11 = AnonymousClass000.A11("Error while pushing ");
                A11.append(r5);
                AnonymousClass000.A1E(". Not all arguments were provided. Missing ", " int arguments (", A11, i5);
                A11.append(obj);
                AnonymousClass000.A1E(") and ", " object arguments (", A11, i8);
                A11.append(obj2);
                throw AnonymousClass000.A0o(").", A11);
            }
            return;
        }
        StringBuilder A103 = AnonymousClass000.A10();
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            if ((r14.A03 & (1 << i11)) != 0) {
                if (i10 > 0) {
                    A103.append(", ");
                }
                i10 = AnonymousClass0PV.A01(r12, A103, i11, i10);
            }
        }
        String obj3 = A103.toString();
        C18070vi.A0X(obj3);
        StringBuilder A104 = AnonymousClass000.A10();
        int i12 = r12.A01;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (C04910Pm.A00(r14, i14) != 0) {
                if (i10 > 0) {
                    A104.append(", ");
                }
                AnonymousClass0PV.A02(r12, A104, i14);
                i13++;
            }
        }
        String obj4 = A104.toString();
        C18070vi.A0X(obj4);
        StringBuilder A112 = AnonymousClass000.A11("Error while pushing ");
        A112.append(r12);
        AnonymousClass000.A1E(". Not all arguments were provided. Missing ", " int arguments (", A112, i10);
        A112.append(obj3);
        AnonymousClass000.A1E(") and ", " object arguments (", A112, i13);
        A112.append(obj4);
        throw AnonymousClass000.A0o(").", A112);
    }

    public final void A01(Object obj, AnonymousClass1OS r13) {
        C04910Pm r9 = this.A00;
        C012407r r8 = C012407r.A00;
        r9.A06(r8);
        AnonymousClass0L9.A01(r9, obj, 0);
        C18070vi.A0z(r13, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        C41681wt.A04(r13, 2);
        AnonymousClass0L9.A01(r9, r13, 1);
        int i = r9.A03;
        int i2 = r8.A00;
        if (i != AnonymousClass001.A0A(i2) || r9.A04 != AnonymousClass0PV.A00(r8)) {
            StringBuilder A10 = AnonymousClass000.A10();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (((1 << i4) & r9.A03) != 0) {
                    if (i3 > 0) {
                        A10.append(", ");
                    }
                    i3 = AnonymousClass0PV.A01(r8, A10, i4, i3);
                }
            }
            String obj2 = A10.toString();
            C18070vi.A0X(obj2);
            StringBuilder A102 = AnonymousClass000.A10();
            int i5 = r8.A01;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                if (C04910Pm.A00(r9, i7) != 0) {
                    if (i3 > 0) {
                        A102.append(", ");
                    }
                    AnonymousClass0PV.A02(r8, A102, i7);
                    i6++;
                }
            }
            String obj3 = A102.toString();
            C18070vi.A0X(obj3);
            throw AnonymousClass002.A02(r8, obj2, obj3, i3, i6);
        }
    }
}
