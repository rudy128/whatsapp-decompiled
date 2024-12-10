package X;

import android.view.View;

/* renamed from: X.0Yo  reason: invalid class name and case insensitive filesystem */
public class C06500Yo implements Runnable {
    public final /* synthetic */ AnonymousClass0SF A00;

    public C06500Yo(AnonymousClass0SF r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0SF r1 = this.A00;
        View view = r1.A06;
        if (view != null && view.getWindowToken() != null) {
            r1.CMX();
        }
    }
}
