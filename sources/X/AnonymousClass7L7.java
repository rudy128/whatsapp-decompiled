package X;

import com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onAvatarDeleted$1;
import com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onAvatarUpdated$1;
import com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onCoinFlipOptIn$1;
import java.util.Map;

/* renamed from: X.7L7  reason: invalid class name */
public final class AnonymousClass7L7 implements AnonymousClass8B1 {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass1OX A03;
    public final AnonymousClass11S A04;
    public final C18600wl A05;

    public /* synthetic */ void Bla(String str) {
    }

    public /* synthetic */ void Blz() {
    }

    public /* synthetic */ void Bm0(String str) {
    }

    public /* synthetic */ void Bm2(String str, Map map) {
    }

    public static final void A00(AnonymousClass7L7 r2) {
        AnonymousClass1BI r1;
        AnonymousClass11S r0 = r2.A04;
        r0.A0I();
        AnonymousClass1E8 r12 = r0.A0D;
        if (r12 != null && !r12.A0g && (r1 = r12.A0J) != null) {
            ((C24671Lf) r2.A01.get()).A00(r1);
        }
    }

    public void Bly(String str) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 9156)) {
            AnonymousClass3MX.A1Q(new AvatarCoinFlipObserver$onAvatarDeleted$1(this, (C30391dr) null), this.A03);
        }
    }

    public void Bm4(boolean z, boolean z2) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 9156)) {
            AnonymousClass3MX.A1Q(new AvatarCoinFlipObserver$onAvatarUpdated$1(this, (C30391dr) null, z), this.A03);
        }
    }

    public void BpC() {
        if (C18020vd.A05(C18040vf.A02, this.A00, 9156)) {
            AnonymousClass3MX.A1Q(new AvatarCoinFlipObserver$onCoinFlipOptIn$1(this, (C30391dr) null), this.A03);
        }
    }

    public AnonymousClass7L7(AnonymousClass11S r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, C18600wl r6) {
        C18070vi.A0w(r3, r2, r4, r5, r6);
        this.A00 = r3;
        this.A04 = r2;
        this.A01 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A03 = C108995ce.A0g(r6);
    }
}
