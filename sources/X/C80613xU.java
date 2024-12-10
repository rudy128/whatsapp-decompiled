package X;

import android.content.Context;

/* renamed from: X.3xU  reason: invalid class name and case insensitive filesystem */
public final class C80613xU extends AnonymousClass1E7 {
    public static String A02;
    public final AnonymousClass118 A00;
    public final AnonymousClass11V A01;

    public static final String A04(Context context, int i) {
        C18070vi.A0d(context, 0);
        return AnonymousClass3Ma.A10(context, AnonymousClass4GC.A00(context), AnonymousClass3MW.A1a(), 0, i);
    }

    public long A0J() {
        return -2;
    }

    public boolean A0O() {
        return true;
    }

    public boolean A0P() {
        return true;
    }

    public String A0K() {
        Context context = this.A00.A00;
        C18070vi.A0X(context);
        return AnonymousClass4GC.A00(context);
    }

    public void A0N(String str) {
        C17960vV.A0F(false, "Setting verified name for ServerContact not allowed");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80613xU(AnonymousClass118 r4, C18000vb r5) {
        super(C42541yL.A00);
        C18070vi.A0j(r4, r5);
        this.A00 = r4;
        C95284lz r2 = new C95284lz();
        this.A01 = r2;
        this.A0A = 3;
        this.A0C = -2;
        r5.A09.add(r2);
    }

    public String A0L() {
        return A0K();
    }

    public void A0M(long j) {
        C17900vP.A0l("Attempting to set the id of the server contact to=", AnonymousClass000.A10(), j);
    }

    public Object clone() {
        return super.clone();
    }
}
