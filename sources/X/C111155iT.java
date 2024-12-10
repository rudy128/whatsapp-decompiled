package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.5iT  reason: invalid class name and case insensitive filesystem */
public final class C111155iT extends AnonymousClass1J2 {
    public Bundle A00;
    public C135476sG A01;
    public AnonymousClass1OB A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass00H A05;
    public final String A06 = C108985cd.A0f();
    public final C18100vl A07 = AnonymousClass7S3.A00(this, 45);
    public final AnonymousClass00H A08;

    public C111155iT(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        this.A05 = r2;
        this.A08 = r3;
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M(AnonymousClass1IX.of());
        this.A04 = A0M;
        this.A03 = A0M;
    }

    public final void A0T(String str, String str2) {
        Integer num;
        C1418277c r0;
        AnonymousClass1IX r02 = (AnonymousClass1IX) this.A03.A06();
        if (r02 == null || (r0 = (C1418277c) C29431cG.A0c(r02)) == null) {
            num = null;
        } else {
            num = r0.A01;
        }
        if (num != AnonymousClass00R.A0C) {
            this.A04.A0F(AnonymousClass1IX.of(C1418277c.A0E));
        }
        AnonymousClass73N.A02((AnonymousClass73N) this.A08.get(), 26);
        C18100vl r2 = this.A07;
        ((Handler) r2.getValue()).removeMessages(1);
        AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
        C72463Mc.A1H("search_text", str, r1);
        AnonymousClass1D6.A03("artist_id", str2, r1, 1);
        this.A00 = AnonymousClass9O6.A00(r1);
        Message message = new Message();
        message.setData(this.A00);
        message.what = 1;
        ((Handler) r2.getValue()).sendMessageDelayed(message, 300);
    }
}
