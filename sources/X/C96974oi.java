package X;

import android.net.Uri;

/* renamed from: X.4oi  reason: invalid class name and case insensitive filesystem */
public class C96974oi implements C34571ki {
    public final Long A00 = Long.valueOf(AnonymousClass74D.A01());
    public final /* synthetic */ AnonymousClass4XJ A01;

    public C96974oi(AnonymousClass4XJ r3) {
        this.A01 = r3;
        AnonymousClass3Ma.A0Y(r3.A02).A0C.get();
    }

    public void Bw8(C46162Dk r4, C18090vk r5) {
        this.A01.A02.A3c.A0V(r4, AnonymousClass00R.A0F, this.A00, r5);
    }

    public void Bz7(C46162Dk r13) {
        String str = r13.A0S;
        if (str != null) {
            AnonymousClass4aY r1 = this.A01.A02;
            C36341nj r2 = AnonymousClass3Ma.A0Y(r1).A06;
            AnonymousClass1FY A0Q = AnonymousClass3MW.A0Q(r1);
            Integer num = AnonymousClass00R.A04;
            Long l = this.A00;
            C18070vi.A0d(A0Q, 0);
            r2.A02(A0Q, Uri.parse(AnonymousClass001.A1H("whatsapp://channel/", str, AnonymousClass000.A10())), (C29681ch) null, num, l, str, 0, -1);
        }
    }
}
