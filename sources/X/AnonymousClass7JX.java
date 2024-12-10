package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.7JX  reason: invalid class name */
public class AnonymousClass7JX implements AnonymousClass8AR {
    public final /* synthetic */ LinkedAccountMediaViewFragment A00;

    public void BIX(int i) {
    }

    public void Bue() {
    }

    public AnonymousClass7JX(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A00 = linkedAccountMediaViewFragment;
    }

    public C19760yx BHw(int i) {
        LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) linkedAccountMediaViewFragment.A16().inflate(2131625822, (ViewGroup) null);
        ViewGroup A0C = AnonymousClass3MW.A0C(viewGroup, 2131430949);
        AnonymousClass6AB r8 = new AnonymousClass6AB(linkedAccountMediaViewFragment.A14(), this, 1);
        r8.A0K = new C177649Aa(this, 35);
        AnonymousClass1Xr.A04(r8, AnonymousClass001.A1H("thumb-transition-", ((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(i)).A01.A04, AnonymousClass000.A10()));
        int i2 = 0;
        viewGroup.addView(r8, 0);
        r8.A0P = true;
        linkedAccountMediaViewFragment.A0F.A01(r8, ((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(i)).A01, (B7F) null, new AnonymousClass7CU(r8, 2), 1);
        if (linkedAccountMediaViewFragment.A0J) {
            Object obj = linkedAccountMediaViewFragment.A0H.get(i);
            View inflate = linkedAccountMediaViewFragment.A16().inflate(2131625819, (ViewGroup) null);
            View A06 = AnonymousClass1HF.A06(inflate, 2131432674);
            inflate.setVisibility(0);
            AnonymousClass78Q.A00(A06, linkedAccountMediaViewFragment, obj, 31);
            A0C.addView(inflate);
        }
        if (!TextUtils.isEmpty(((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(i)).A02)) {
            View inflate2 = linkedAccountMediaViewFragment.A16().inflate(2131625982, (ViewGroup) null);
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) AnonymousClass1HF.A06(inflate2, 2131428830);
            A0C.addView(inflate2, 0);
            mediaCaptionTextView.setCaptionText(((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(i)).A02);
            mediaCaptionTextView.A0A.A0A(linkedAccountMediaViewFragment.A1G(), new AnonymousClass7AH(inflate2, this, 0));
        }
        if (!linkedAccountMediaViewFragment.A0I) {
            i2 = 8;
        }
        A0C.setVisibility(i2);
        return new C19760yx(viewGroup, ((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(i)).A01.A04);
    }

    public int getCount() {
        return this.A00.A0H.size();
    }

    public /* bridge */ /* synthetic */ int BXK(Object obj) {
        return 0;
    }
}
