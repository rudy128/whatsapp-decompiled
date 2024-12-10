package X;

import android.content.Context;

/* renamed from: X.9Xp  reason: invalid class name and case insensitive filesystem */
public class C183269Xp {
    public final AnonymousClass4VT A00;

    public C183269Xp(AnonymousClass1KB r11, AnonymousClass181 r12, AnonymousClass118 r13, AnonymousClass1D9 r14, AnonymousClass10I r15) {
        Context context = r13.A00;
        C86284Ra r3 = new C86284Ra(r11, r12, r14, r15, C17880vN.A0e(context.getCacheDir(), "api_biz_search_cache"), "api-biz-search-image");
        AnonymousClass8BY.A0e(context, r3);
        r3.A05 = true;
        this.A00 = r3.A00();
    }
}
