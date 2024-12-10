package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.7Nw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146117Nw implements AnonymousClass88Q {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass21W A01;
    public final /* synthetic */ AnonymousClass70X A02;

    public final void BtC(String str, String str2, boolean z) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass21W r1 = this.A01;
        AnonymousClass70X r2 = this.A02;
        if (str == null) {
            str = mediaViewFragment.A1H(2131897255);
        }
        if (!z) {
            AnonymousClass206.A00(r1).A0e = false;
            r2.A0F();
            AnonymousClass1FL A1B = mediaViewFragment.A1B();
            if (A1B != null && !A1B.isFinishing()) {
                C73203Rj A03 = AnonymousClass4a6.A03(mediaViewFragment);
                A03.A0S(str);
                A03.A0E(2131889562);
                A03.setPositiveButton(2131890172, new AnonymousClass758(mediaViewFragment, 1));
                AnonymousClass3MY.A1G(A03);
            }
        }
    }

    public /* synthetic */ C146117Nw(MediaViewFragment mediaViewFragment, AnonymousClass21W r2, AnonymousClass70X r3) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
        this.A02 = r3;
    }
}
