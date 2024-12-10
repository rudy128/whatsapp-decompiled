package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.0C2  reason: invalid class name */
public final class AnonymousClass0C2 extends C05050Qf {
    public final long A00;
    public final C17110tl A01;
    public final C05050Qf A02;
    public final String A03;

    public void A0F(Context context, AnonymousClass0KR r14, AnonymousClass0Ke r15, AnonymousClass0J4 r16, C05050Qf r17, Object obj, Object obj2, Object obj3, boolean z) {
        C05050Qf r1 = r17;
        C18070vi.A0d(r1, 2);
        C18070vi.A0d(r14, 6);
        AnonymousClass0J4 r6 = r16;
        C18070vi.A0d(r6, 8);
        this.A02.A0F(context, r14, r15, r6, ((AnonymousClass0C2) r1).A02, obj, obj2, obj3, z);
        super.A0F(context, r14, r15, r16, r17, obj, obj2, obj3, z);
    }

    public void A0G(Context context, AnonymousClass0KR r8, AnonymousClass0J4 r9, Object obj, Object obj2) {
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r9, 4);
        this.A02.A0G(context, r8, r9, obj, obj2);
        super.A0G(context, r8, r9, obj, obj2);
    }

    public void A0H(Context context, AnonymousClass0KR r8, AnonymousClass0J4 r9, Object obj, Object obj2) {
        AnonymousClass0KR r2 = r8;
        C18070vi.A0d(r8, 3);
        AnonymousClass0J4 r3 = r9;
        C18070vi.A0d(r9, 4);
        Context context2 = context;
        Object obj3 = obj;
        Object obj4 = obj2;
        super.A0H(context2, r2, r3, obj3, obj4);
        this.A02.A0H(context2, r2, r3, obj3, obj4);
    }

    public void A0I(Context context, AnonymousClass0KR r8, AnonymousClass0J4 r9, Object obj, Object obj2) {
        C18070vi.A0d(obj, 1);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r9, 4);
        C05050Qf r0 = this.A02;
        Context context2 = context;
        r0.A0I(context2, r8, r9, obj, obj2);
        super.A0I(context, r8, r9, obj, obj2);
    }

    public void A0J(Context context, AnonymousClass0KR r8, AnonymousClass0J4 r9, Object obj, Object obj2) {
        AnonymousClass0KR r2 = r8;
        C18070vi.A0d(r8, 3);
        AnonymousClass0J4 r3 = r9;
        C18070vi.A0d(r9, 4);
        Context context2 = context;
        Object obj3 = obj;
        Object obj4 = obj2;
        super.A0J(context2, r2, r3, obj3, obj4);
        this.A02.A0J(context2, r2, r3, obj3, obj4);
    }

    public void A0K(AnonymousClass0Ij r5) {
        C18070vi.A0d(r5, 0);
        C05050Qf r3 = this.A02;
        Map map = r3.A00;
        if (map != null) {
            C16890tO r2 = r5.A00;
            if (map.containsKey(r2.Bar())) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Binder ");
                A10.append(r2.BQX());
                A10.append(" already exists in the wrapped ");
                throw AnonymousClass001.A12(r3.A0E(), A10);
            }
        }
        super.A0K(r5);
    }

    public void A0L(AnonymousClass0Ij r5) {
        C18070vi.A0d(r5, 0);
        C05050Qf r3 = this.A02;
        Map map = r3.A01;
        if (map != null) {
            C16890tO r2 = r5.A00;
            if (map.containsKey(r2.Bar())) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Binder ");
                A10.append(r2.BQX());
                A10.append(" already exists in the wrapped ");
                throw AnonymousClass001.A12(r3.A0E(), A10);
            }
        }
        super.A0L(r5);
    }

    public AnonymousClass0C2(C05050Qf r2, long j) {
        super(r2.A04);
        this.A02 = r2;
        this.A00 = j;
        this.A01 = r2.A0D();
        this.A03 = r2.A0E();
    }

    public long A0C() {
        return this.A00;
    }

    public C17110tl A0D() {
        return this.A01;
    }

    public String A0E() {
        return this.A03;
    }
}
