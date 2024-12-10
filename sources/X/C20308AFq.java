package X;

import android.webkit.ValueCallback;

/* renamed from: X.AFq  reason: case insensitive filesystem */
public final /* synthetic */ class C20308AFq implements ValueCallback {
    public final /* synthetic */ C21321Ai6 A00;

    public final void onReceiveValue(Object obj) {
        C21321Ai6 ai6 = this.A00;
        String str = (String) obj;
        if (str != null && str.length() == 9) {
            ai6.A00.A0C.A0F(str);
        }
    }

    public /* synthetic */ C20308AFq(C21321Ai6 ai6) {
        this.A00 = ai6;
    }
}
