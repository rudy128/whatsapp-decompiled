package X;

/* renamed from: X.AUf  reason: case insensitive filesystem */
public abstract class C20673AUf implements B88 {
    public final B88 A00;
    public final B88 A01;
    public final B88 A02;
    public final B88 A03;

    public Object A00(Object obj) {
        Object obj2;
        C172848u7 r4;
        Object obj3;
        Object obj4;
        Throwable r42;
        String str;
        try {
            obj2 = this.A03.CPg(obj);
        } catch (Throwable th) {
            obj2 = C108945cZ.A1J(th);
        }
        if (obj2 instanceof AnonymousClass1IU) {
            if (C18070vi.A18(this.A03.getClass(), DPF.class)) {
                str = "Argo";
            } else {
                str = "JSON";
            }
            Throwable A002 = C30671eK.A00(obj2);
            boolean z = A002 instanceof OutOfMemoryError;
            StringBuilder A11 = AnonymousClass000.A11(str);
            if (z) {
                r42 = new C172918uE(AnonymousClass000.A0y(" OOM parsing error", A11), A002);
            } else {
                r4 = new C172848u7(AnonymousClass000.A0y(" parsing error", A11), "mex-parsing-failure", new Throwable[]{A002}, 472);
                return C30691eM.A00(r4);
            }
        } else {
            C30691eM.A01(obj2);
            try {
                obj3 = this.A02.CPg(obj2);
            } catch (Throwable th2) {
                obj3 = C108945cZ.A1J(th2);
            }
            try {
                obj4 = this.A00.CPg(obj2);
            } catch (Throwable th3) {
                obj4 = C108945cZ.A1J(th3);
            }
            boolean z2 = obj3 instanceof AnonymousClass1IU;
            if ((!z2) && (!(obj4 instanceof AnonymousClass1IU))) {
                C30691eM.A01(obj4);
                C30691eM.A01(obj3);
            } else if (z2 && (obj4 instanceof AnonymousClass1IU)) {
                r4 = new C172848u7("Failed to parse both 'data' and 'errors'", "mex-parsing-failure", new Throwable[]{C30671eK.A00(obj4), C30671eK.A00(obj3)}, 472);
                return C30691eM.A00(r4);
            } else if (obj4 instanceof AnonymousClass1IU) {
                Throwable A003 = C30671eK.A00(obj4);
                C30691eM.A01(obj3);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Failed to parse ");
                A10.append("data");
                r42 = new C172848u7(obj3, AnonymousClass001.A1E(A003, " response due to ", A10), "mex-parsing-failure", A003, 472);
            } else {
                C30691eM.A01(obj4);
                obj3 = this.A01.CPg(C30671eK.A00(obj3));
            }
            return new C199129zU(obj4, obj3);
        }
        return C108945cZ.A1J(r42);
    }

    public C20673AUf(B88 b88, B88 b882, B88 b883, B88 b884) {
        this.A03 = b88;
        this.A00 = b882;
        this.A02 = b883;
        this.A01 = b884;
    }

    public /* bridge */ /* synthetic */ Object CPg(Object obj) {
        throw AnonymousClass04E.createAndThrow();
    }
}
