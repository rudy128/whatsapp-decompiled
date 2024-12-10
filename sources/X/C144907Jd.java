package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.7Jd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144907Jd implements C1600787a {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass21V A01;

    public final void C9F(boolean z) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass21V r3 = this.A01;
        AnonymousClass1FL A1B = mediaViewFragment.A1B();
        if (A1B != null && !A1B.isFinishing()) {
            mediaViewFragment.A0F.CGP(new C146867Qx(mediaViewFragment, r3, 2, z));
        }
    }

    public /* synthetic */ C144907Jd(MediaViewFragment mediaViewFragment, AnonymousClass21V r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }
}
