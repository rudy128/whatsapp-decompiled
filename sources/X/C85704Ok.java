package X;

import android.content.Context;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4Ok  reason: invalid class name and case insensitive filesystem */
public class C85704Ok {
    public final C218617r A00;
    public final AnonymousClass5XJ A01;
    public final AnonymousClass3TA A02;
    public final AnonymousClass10I A03;
    public final WebPagePreviewView A04;
    public final boolean A05;

    public C85704Ok(Context context, C218617r r5, AnonymousClass5XJ r6, AnonymousClass3TA r7, AnonymousClass10I r8, boolean z) {
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A00 = r5;
        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context);
        this.A04 = webPagePreviewView;
        this.A05 = z;
        webPagePreviewView.setImageProgressBarVisibility(false);
        webPagePreviewView.setImageCancelClickListener(new C825048f(this, 23));
        webPagePreviewView.setImageContentClickListener(new C825048f(this, 24));
        webPagePreviewView.A0H();
    }
}
