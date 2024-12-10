package X;

import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4QM  reason: invalid class name */
public class AnonymousClass4QM {
    public final /* synthetic */ AnonymousClass206 A00;
    public final /* synthetic */ C108905cU A01;

    public AnonymousClass4QM(AnonymousClass206 r1, C108905cU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(AnonymousClass205 r9, int i) {
        C108905cU r4;
        float f;
        float f2;
        float f3;
        float f4;
        if (r9 != null && r9.equals(this.A00.A0v)) {
            if (i != 1) {
                r4 = this.A01;
                if (i != 2) {
                    f2 = 0.0f;
                    f = 1.0f;
                } else {
                    f4 = 0.67f;
                    f2 = 0.0f;
                    f3 = 1.0f;
                    f = 0.0f;
                    WebPagePreviewView webPagePreviewView = (WebPagePreviewView) r4;
                    Boolean bool = C17970vW.A03;
                    webPagePreviewView.A09.animate().setDuration(150).alpha(f2);
                    webPagePreviewView.A00.animate().setDuration(150).alpha(f);
                    webPagePreviewView.A06.animate().setDuration(150).alpha(f);
                    webPagePreviewView.A01.animate().setDuration(150).alpha(f3);
                    webPagePreviewView.A02.animate().setDuration(150).alpha(f4);
                }
            } else {
                r4 = this.A01;
                f = 0.0f;
                f2 = 1.0f;
            }
            f3 = 0.0f;
            f4 = 0.0f;
            WebPagePreviewView webPagePreviewView2 = (WebPagePreviewView) r4;
            Boolean bool2 = C17970vW.A03;
            webPagePreviewView2.A09.animate().setDuration(150).alpha(f2);
            webPagePreviewView2.A00.animate().setDuration(150).alpha(f);
            webPagePreviewView2.A06.animate().setDuration(150).alpha(f);
            webPagePreviewView2.A01.animate().setDuration(150).alpha(f3);
            webPagePreviewView2.A02.animate().setDuration(150).alpha(f4);
        }
    }
}
