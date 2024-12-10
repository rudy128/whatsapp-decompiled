package X;

/* renamed from: X.1OT  reason: invalid class name */
public final class AnonymousClass1OT extends AnonymousClass11G implements AnonymousClass1OS {
    public static final AnonymousClass1OT A00 = new AnonymousClass1OT();

    public AnonymousClass1OT() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C18560wh r6 = (C18560wh) obj;
        C18570wi r7 = (C18570wi) obj2;
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(r7, 1);
        C18560wh minusKey = r6.minusKey(r7.getKey());
        AnonymousClass1OR r3 = AnonymousClass1OR.A00;
        if (minusKey == r3) {
            return r7;
        }
        C23831Hu r0 = C18590wk.A00;
        C18570wi r2 = minusKey.get(r0);
        if (r2 == null) {
            return new AnonymousClass1OV(r7, minusKey);
        }
        C18560wh minusKey2 = minusKey.minusKey(r0);
        if (minusKey2 == r3) {
            return new AnonymousClass1OV(r2, r7);
        }
        return new AnonymousClass1OV(r2, new AnonymousClass1OV(r7, minusKey2));
    }
}
