package X;

import java.util.HashSet;

/* renamed from: X.23I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass23I extends AnonymousClass1JJ implements AnonymousClass1OS {
    public static final AnonymousClass23I A00 = new AnonymousClass23I();

    public AnonymousClass23I() {
        super(2, AnonymousClass23H.class, "<init>", "<init>(Lcom/whatsapp/protocol/FMessageKey;J)V", 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.23H, X.206] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass205 r5 = (AnonymousClass205) obj;
        long longValue = ((Number) obj2).longValue();
        C18070vi.A0d(r5, 0);
        ? r1 = new AnonymousClass206(r5, 50, longValue);
        r1.A01 = new HashSet();
        return r1;
    }
}
