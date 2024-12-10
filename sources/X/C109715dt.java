package X;

import android.text.style.UnderlineSpan;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.5dt  reason: invalid class name and case insensitive filesystem */
public final class C109715dt extends UnderlineSpan implements C1604588o {
    public final AnonymousClass86P A00;
    public final String A01;
    public final /* synthetic */ MediaCaptionTextView A02;

    public C109715dt(AnonymousClass86P r2, MediaCaptionTextView mediaCaptionTextView, String str) {
        C18070vi.A0d(str, 2);
        this.A02 = mediaCaptionTextView;
        this.A01 = str;
        this.A00 = r2;
    }

    public void Bos() {
        this.A00.Bwf(this.A01);
    }

    public void BxU() {
        AnonymousClass86P r3 = this.A00;
        String str = this.A01;
        C142927Bi r32 = (C142927Bi) r3;
        C18070vi.A0d(str, 2);
        AnonymousClass11C r1 = r32.A01;
        AnonymousClass73K.A02(r32.A00, r1, str);
        AnonymousClass4a5.A03(r1);
    }
}
