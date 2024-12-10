package X;

import android.content.Context;

/* renamed from: X.9Wy  reason: invalid class name and case insensitive filesystem */
public final class C183109Wy {
    public final AnonymousClass4VT A00;

    public C183109Wy(AnonymousClass1KB r12, AnonymousClass181 r13, AnonymousClass118 r14, AnonymousClass1D9 r15, AnonymousClass10I r16) {
        C18070vi.A0d(r12, 1);
        AnonymousClass10I r8 = r16;
        C18070vi.A0p(r8, r14, r13);
        C18070vi.A0d(r15, 5);
        Context context = r14.A00;
        C86284Ra r4 = new C86284Ra(r12, r13, r15, r8, C17880vN.A0e(context.getCacheDir(), "biz_api_cache"), "biz_api_image");
        AnonymousClass8BY.A0e(context, r4);
        r4.A05 = true;
        this.A00 = r4.A00();
    }
}
