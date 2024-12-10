package X;

/* renamed from: X.1dy  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C30451dy {
    public static final Object A00(C30391dr r4, C18560wh r5, AnonymousClass1OS r6) {
        C18560wh context = r4.getContext();
        C18560wh A00 = C30471e0.A00(context, r5);
        C30551e8.A05(A00);
        if (A00 == context) {
            C41581wh r0 = new C41581wh(r4, A00);
            return C41671ws.A00(r0, r6, r0);
        }
        C23831Hu r02 = C18590wk.A00;
        if (C18070vi.A18(A00.get(r02), context.get(r02))) {
            C41641wp r3 = new C41641wp(r4, A00);
            C18560wh context2 = r3.getContext();
            Object A002 = C30631eG.A00((Object) null, context2);
            try {
                return C41671ws.A00(r3, r6, r3);
            } finally {
                C30631eG.A02(A002, context2);
            }
        } else {
            C41591wi r03 = new C41591wi(r4, A00);
            C30571eA.A00(r03, r03, r6);
            return r03.A14();
        }
    }

    public static final AnonymousClass5WH A01(Integer num, C18560wh r3, AnonymousClass1OS r4, AnonymousClass1OX r5) {
        AnonymousClass5WH r0 = new AnonymousClass5WH(C30471e0.A02(r3, r5));
        r0.A11(num, r0, r4);
        return r0;
    }

    public static final C30511e4 A02(Integer num, C18560wh r4, AnonymousClass1OS r5, AnonymousClass1OX r6) {
        C30511e4 r1;
        C18560wh A02 = C30471e0.A02(r4, r6);
        if (num == AnonymousClass00R.A01) {
            r1 = new AnonymousClass3JP(A02, r5);
        } else {
            r1 = new C30511e4(A02, true);
        }
        r1.A11(num, r1, r5);
        return r1;
    }
}
