package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4qw  reason: invalid class name and case insensitive filesystem */
public final class C98324qw implements AnonymousClass1TI {
    public List A00;
    public final View A01;
    public final AnonymousClass1F9 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;
    public final AnonymousClass1OX A06;

    public C98324qw(View view, AnonymousClass1F9 r3, AnonymousClass00H r4, AnonymousClass00H r5, C18600wl r6, AnonymousClass1OX r7) {
        C72473Md.A1M(r4, r5, r6, 3);
        C18070vi.A0d(r7, 6);
        this.A01 = view;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A06 = r7;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        this.A00 = list;
        AnonymousClass1F9 r5 = this.A02;
        if (((C23391Fw) r5.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            View view = this.A01;
            C23520Bik A012 = C23520Bik.A01(view, 2131895153, 0);
            A012.A0F(new C89944dH(this, 3), 2131895154);
            A012.A0E(AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130971311, 2131102579));
            List emptyList = Collections.emptyList();
            C18070vi.A0X(emptyList);
            new C90594eK(r5, A012, (AnonymousClass11C) C18070vi.A0E(this.A04), emptyList, false).A03();
        }
    }
}
