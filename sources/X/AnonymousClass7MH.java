package X;

import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.util.List;

/* renamed from: X.7MH  reason: invalid class name */
public final class AnonymousClass7MH implements C1597185p {
    public boolean A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass882 A04;
    public final List A05 = AnonymousClass000.A13();
    public final AnonymousClass1DS A06;
    public final AnonymousClass1DS A07;
    public final AnonymousClass1DT A08;
    public final C22851Dl A09;

    public AnonymousClass7MH(C441822l r8, AnonymousClass882 r9) {
        this.A04 = r9;
        Object obj = null;
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M((Object) null);
        this.A08 = A0M;
        AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M((Object) null);
        this.A01 = A0M2;
        AnonymousClass1DT A0M3 = AnonymousClass3MW.A0M((Object) null);
        this.A02 = A0M3;
        C22801Dg A002 = C25357CeG.A00(A0M, A0M2, A0M3, new AnonymousClass7N5(this, 0));
        this.A06 = A002;
        AnonymousClass1DT A0D = C108965cb.A0D(-4);
        this.A03 = A0D;
        C22801Dg A003 = C25357CeG.A00(A002, A0D, A0M2, new AnonymousClass7N5(this, 1));
        this.A07 = A003;
        AnonymousClass7AP r0 = new AnonymousClass7AP(this, 19);
        this.A09 = r0;
        ((VoiceStatusContentView) r9).A05 = this;
        A003.A0C(r0);
        if (r8.A11(32768)) {
            AnonymousClass7LG r02 = (AnonymousClass7LG) r8.A00.A02;
            A0M.A0F(r02 != null ? r02.A06.getValue() : obj);
        }
    }
}
