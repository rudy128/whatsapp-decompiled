package X;

import android.widget.ImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4lv  reason: invalid class name and case insensitive filesystem */
public class C95244lv implements C43451zp {
    public final int A00;
    public final Object A01;

    public C95244lv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BpK(Object obj) {
        AnonymousClass206 r1;
        if (this.A00 != 0) {
            ((C76823oU) this.A01).A07.A0E(obj);
            return;
        }
        C74253Zc r8 = (C74253Zc) this.A01;
        AnonymousClass4O5 r10 = (AnonymousClass4O5) obj;
        if (r10 != null && (r1 = r8.A00) != null) {
            C87744Wu r5 = r10.A00;
            AnonymousClass4NY r4 = r5.A00;
            r8.A01 = r4.A01;
            r8.A02 = r4.A02;
            WebPagePreviewView webPagePreviewView = r8.A08;
            int i = 0;
            if (r1 instanceof AnonymousClass23N) {
                i = 2;
            }
            webPagePreviewView.setLinkTitleTypeface(i);
            webPagePreviewView.setLinkTitle(r10.A02);
            webPagePreviewView.setLinkSnippet(r10.A01);
            r8.A06.setText(r10.A03);
            Boolean bool = r5.A01;
            if (bool == null || !bool.booleanValue()) {
                webPagePreviewView.A0K.setVisibility(0);
                ThumbnailButton thumbnailButton = webPagePreviewView.A0K;
                AnonymousClass4aX.A0B(thumbnailButton.getContext(), thumbnailButton, 2131232044, AnonymousClass1YL.A00(r8.A0A.A1n(), 2130972035, 2131103448));
                webPagePreviewView.A0K.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                webPagePreviewView.A0K.setScaleX(1.5f);
                webPagePreviewView.A0K.setScaleY(1.5f);
                ThumbnailButton thumbnailButton2 = webPagePreviewView.A0K;
                AnonymousClass3MX.A1A(thumbnailButton2.getContext(), thumbnailButton2, 2131101845);
            } else {
                r8.A0A.A0A.A0E(webPagePreviewView.A0K, r8.A00, new C98114qb(r8, 9));
            }
            webPagePreviewView.setLinkHostname(r4.A00);
        }
    }
}
