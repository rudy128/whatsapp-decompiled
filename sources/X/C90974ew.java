package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.4ew  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90974ew implements TextView.OnEditorActionListener {
    public final /* synthetic */ C108515bp A00;
    public final /* synthetic */ AnonymousClass4P4 A01;
    public final /* synthetic */ boolean A02;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AnonymousClass4P4 r4 = this.A01;
        boolean z = this.A02;
        C108515bp r2 = this.A00;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        if (z) {
            r2.Bns();
            return true;
        }
        r4.A05.A0H();
        return true;
    }

    public /* synthetic */ C90974ew(C108515bp r1, AnonymousClass4P4 r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }
}
