package X;

import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.invitelink.ShareLinkActivityWithContactLink$initContactLinkViewModel$1;

/* renamed from: X.687  reason: invalid class name */
public abstract class AnonymousClass687 extends C114755rv {
    public TextView A00;
    public AnonymousClass6ZS A01;
    public ThumbnailButton A02;
    public AnonymousClass1VW A03;

    public final void A4i(AnonymousClass1BI r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass6ZS r3 = this.A01;
        if (r3 != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131167181);
            AnonymousClass3MX.A1Q(new ShareLinkActivityWithContactLink$initContactLinkViewModel$1((C111115iL) new C24071It(new C142587Aa(r3, r5, AnonymousClass3MW.A00(getResources(), 2131167180), dimensionPixelSize), this).A00(C111115iL.class), this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            return;
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131432903);
        C18070vi.A0d(textView, 0);
        this.A00 = textView;
        ThumbnailButton thumbnailButton = (ThumbnailButton) AnonymousClass3MY.A0H(this, 2131431496);
        C18070vi.A0d(thumbnailButton, 0);
        this.A02 = thumbnailButton;
    }
}
