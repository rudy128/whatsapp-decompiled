package X;

import android.content.Context;

/* renamed from: X.0YM  reason: invalid class name */
public final class AnonymousClass0YM implements C16890tO {
    public final AnonymousClass0sZ A00;
    public final AnonymousClass0HI A01 = new Object();
    public final C18090vk A02;

    public AnonymousClass0I3 A00(Context context, Object obj, Object obj2) {
        C18070vi.A0d(context, 0);
        AnonymousClass0HI r2 = this.A01;
        r2.A00 = context;
        try {
            return this.A00.BD2(r2, obj, obj2);
        } finally {
            r2.A00 = null;
        }
    }

    public void A01(Context context, AnonymousClass0I3 r5) {
        C18070vi.A0d(context, 0);
        AnonymousClass0HI r2 = this.A01;
        r2.A00 = context;
        if (r5 != null) {
            try {
                r5.A00().invoke();
            } catch (Throwable th) {
                r2.A00 = null;
                throw th;
            }
        }
        r2.A00 = null;
    }

    public Class Bar() {
        return this.A00.getClass();
    }

    public boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((AnonymousClass0YU) this.A00).A00 != 0) {
            return AnonymousClass0YU.A02(obj, obj2, obj3, obj4);
        }
        return AnonymousClass0YU.A01(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        A01(context, (AnonymousClass0I3) obj4);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0HI, java.lang.Object] */
    public AnonymousClass0YM(AnonymousClass0sZ r2, C18090vk r3) {
        this.A02 = r3;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        return A00(context, obj, obj3);
    }

    public String BQX() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("binder:");
        return AnonymousClass000.A0y((String) this.A02.invoke(), A10);
    }
}
