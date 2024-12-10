package X;

import android.widget.CompoundButton;

/* renamed from: X.4ei  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90834ei implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C98494rF A01;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C98494rF r1 = this.A01;
        String str = this.A00;
        C18070vi.A0h(r1, str);
        if (z) {
            r1.element = str;
        }
    }

    public /* synthetic */ C90834ei(String str, C98494rF r2) {
        this.A01 = r2;
        this.A00 = str;
    }
}
