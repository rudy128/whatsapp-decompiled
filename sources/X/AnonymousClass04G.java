package X;

import android.content.Context;

/* renamed from: X.04G  reason: invalid class name */
public class AnonymousClass04G implements C24051Ir {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass04G(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static AnonymousClass1J2 A00(C24091Iv r4, AnonymousClass048 r5, Class cls) {
        Class<AnonymousClass048> cls2 = AnonymousClass048.class;
        C18140vp r2 = (C18140vp) ((AnonymousClass048) C000400h.A00(cls2, r5)).A4o().get(cls);
        C22821Di r1 = (C22821Di) r4.A00(AnonymousClass044.A03);
        Object obj = ((AnonymousClass048) C000400h.A00(cls2, r5)).A4n().get(cls);
        if (obj == null) {
            if (r1 != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Found creation callback but class ");
                A10.append(cls.getName());
                throw AnonymousClass000.A0o(" does not have an assisted factory specified in @HiltViewModel.", A10);
            } else if (r2 != null) {
                return (AnonymousClass1J2) r2.get();
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Expected the @HiltViewModel-annotated class ");
                A102.append(cls.getName());
                throw AnonymousClass000.A0o(" to be available in the multi-binding of @HiltViewModelMap but none was found.", A102);
            }
        } else if (r2 != null) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Found the @HiltViewModel-annotated class ");
            A103.append(cls.getName());
            throw new AssertionError(AnonymousClass000.A0y(" in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.", A103));
        } else if (r1 != null) {
            return (AnonymousClass1J2) r1.invoke(obj);
        } else {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("Found @HiltViewModel-annotated class ");
            A104.append(cls.getName());
            throw AnonymousClass000.A0o(" using @AssistedInject but no creation callback was provided in CreationExtras.", A104);
        }
    }

    public AnonymousClass1J2 BGl(C24091Iv r4, Class cls) {
        if (this.A00 != 0) {
            C006302u r2 = new C006302u(r4);
            C006402v CG4 = ((AnonymousClass00Z) AnonymousClass00E.A00((Context) this.A02, AnonymousClass00Z.class)).CG4();
            CG4.CGq(r2);
            return new C006202t(CG4.BDR(), r2);
        }
        AnonymousClass047 r22 = new AnonymousClass047();
        AnonymousClass042 r1 = (AnonymousClass042) this.A02;
        r1.CGp(AnonymousClass1GG.A00(r4));
        r1.CRr(r22);
        AnonymousClass1J2 A002 = A00(r4, r1.BDV(), cls);
        A002.A0R(new AnonymousClass049(r22));
        return A002;
    }

    public /* synthetic */ AnonymousClass1J2 BG9(Class cls) {
        C60282nh.A01();
        throw null;
    }
}
