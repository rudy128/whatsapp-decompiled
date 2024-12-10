package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.4cz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89764cz implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass11N A02;
    public final /* synthetic */ C98484rE A03;

    public final void onClick(View view) {
        C98484rE r11 = this.A03;
        View.OnClickListener onClickListener = this.A00;
        View view2 = this.A01;
        C18070vi.A0d(r11, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - r11.element > 1000) {
            r11.element = elapsedRealtime;
            onClickListener.onClick(view2);
        }
    }

    public /* synthetic */ C89764cz(View.OnClickListener onClickListener, View view, AnonymousClass11N r3, C98484rE r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = onClickListener;
        this.A01 = view;
    }
}
