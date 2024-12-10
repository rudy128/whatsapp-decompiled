package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.4de  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90174de implements View.OnKeyListener {
    public final /* synthetic */ AnonymousClass4P4 A00;
    public final /* synthetic */ boolean A01;

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AnonymousClass4P4 r2 = this.A00;
        if (!this.A01 || keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 66 || !keyEvent.isCtrlPressed()) {
            return false;
        }
        C72483Me.A0o(r2.A05);
        return true;
    }

    public /* synthetic */ C90174de(AnonymousClass4P4 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
