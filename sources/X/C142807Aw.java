package X;

import com.whatsapp.search.SearchFragment;

/* renamed from: X.7Aw  reason: invalid class name and case insensitive filesystem */
public class C142807Aw implements C38591rZ {
    public final int A00;
    public final Object A01;

    public C142807Aw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onResult(Object obj) {
        switch (this.A00) {
            case 0:
                C38631rd r2 = (C38631rd) this.A01;
                r2.A0K((C39801tf) obj);
                r2.A0d.setRepeatCount(0);
                r2.A07();
                return;
            case 1:
                C38631rd r0 = (C38631rd) this.A01;
                C18070vi.A0d(r0, 0);
                r0.A0K((C39801tf) obj);
                r0.A0d.setRepeatCount(0);
                return;
            default:
                SearchFragment searchFragment = (SearchFragment) this.A01;
                searchFragment.A06.setComposition((C39801tf) obj);
                searchFragment.A06.setRepeatCount(-1);
                searchFragment.A06.A04();
                return;
        }
    }
}
