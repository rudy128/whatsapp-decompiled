package X;

import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$fetchImagineFlashImages$1;

/* renamed from: X.7D4  reason: invalid class name */
public final class AnonymousClass7D4 implements BE5 {
    public final int A00;
    public final AnonymousClass6RH A01;
    public final String A02;
    public final boolean A03;
    public final /* synthetic */ C111225jD A04;

    public AnonymousClass7D4(AnonymousClass6RH r2, C111225jD r3, String str, int i, boolean z) {
        C18070vi.A0d(str, 3);
        this.A04 = r3;
        this.A00 = i;
        this.A02 = str;
        this.A01 = r2;
        this.A03 = z;
    }

    public void Br0() {
    }

    public void Br1() {
    }

    public void run() {
        C111225jD r3 = this.A04;
        int i = this.A00;
        String str = this.A02;
        AnonymousClass6RH r2 = this.A01;
        boolean z = this.A03;
        AnonymousClass3MX.A1Q(new AiImagineBottomSheetViewModel$fetchImagineFlashImages$1(r2, r3, str, (C30391dr) null, i, z), C41561wd.A00(r3));
        C130296jC A032 = C111225jD.A03(r3);
        if (A032 == null || A032.A00 == null) {
            r3.A01 = r2;
        }
        r3.A0v.set(200);
    }
}
