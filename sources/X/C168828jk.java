package X;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8jk  reason: invalid class name and case insensitive filesystem */
public final class C168828jk extends AnonymousClass8IO {
    public int A00 = 5;
    public final Button A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1M9 A06;
    public final AnonymousClass1PM A07;
    public final C24921Me A08;
    public final UserJid A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C168828jk(View view, AnonymousClass1L9 r3, AnonymousClass11S r4, AnonymousClass1M9 r5, AnonymousClass1PM r6, C24921Me r7, UserJid userJid) {
        super(view);
        C18070vi.A0d(view, 7);
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = AnonymousClass8BR.A0A(view, 2131428898);
        this.A03 = C17880vN.A0E(view, 2131428899);
        this.A06 = r5;
        this.A08 = r7;
        this.A07 = r6;
        this.A09 = userJid;
        this.A01 = (Button) view.findViewById(2131430474);
    }
}
