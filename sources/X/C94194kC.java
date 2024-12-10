package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4kC  reason: invalid class name and case insensitive filesystem */
public final class C94194kC implements C42971z2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C73133Pz A01;
    public final /* synthetic */ AnonymousClass1E7 A02;

    public /* synthetic */ void CBg() {
    }

    public /* synthetic */ void CIg(AnonymousClass1BI r1) {
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            CN5(imageView);
        }
    }

    public void CN5(ImageView imageView) {
        int A002;
        String A012;
        C18070vi.A0d(imageView, 0);
        AnonymousClass1E7 r5 = this.A02;
        UserJid A0x = AnonymousClass3MZ.A0x(r5);
        if (A0x != null) {
            C73133Pz r6 = this.A01;
            int i = this.A00;
            if (C22971Dz.A0e(r6.A0I)) {
                AnonymousClass1MZ groupParticipantsManager = r6.getGroupParticipantsManager();
                AnonymousClass1BI r1 = r6.A0I;
                C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                C63312sr A05 = groupParticipantsManager.A05((AnonymousClass1E9) r1, A0x);
                if (A05 != null) {
                    A002 = C73133Pz.A00(A05, r6);
                } else {
                    A002 = C19740yt.A00(r6.getContext(), 2131102080);
                }
                C27171Va initialManager = r6.getInitialManager();
                AnonymousClass1E7 A0E = initialManager.A00.A0E(A0x);
                if (!(A0E == null || (A012 = initialManager.A01(A0E)) == null)) {
                    imageView.setImageBitmap(AnonymousClass4GF.A00(AnonymousClass3MY.A04(r6), A012, i, A002, C19740yt.A00(r6.getContext(), C72473Md.A06(r6))));
                    return;
                }
            }
        }
        C73133Pz r12 = this.A01;
        if (r12.getContactAvatars().A0D()) {
            r12.getContactAvatars().A0C(imageView, r5);
        } else {
            imageView.setImageResource(2131231047);
        }
    }

    public C94194kC(C73133Pz r1, AnonymousClass1E7 r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
