package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* renamed from: X.8Bb  reason: invalid class name and case insensitive filesystem */
public abstract class C161028Bb extends Dialog {
    public final Activity A00;
    public final AnonymousClass11C A01;
    public final C18000vb A02;
    public final C18030ve A03;
    public final int A04;
    public final AnonymousClass11P A05;

    public C161028Bb(Activity activity, AnonymousClass11C r3, AnonymousClass11P r4, C18000vb r5, C18030ve r6, int i) {
        super(activity, 2132083330);
        this.A05 = r4;
        this.A02 = r5;
        this.A00 = activity;
        this.A04 = i;
        this.A01 = r3;
        this.A03 = r6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18030ve r2 = this.A03;
        C27641Ww.A08(getWindow(), this.A02, r2);
        setContentView(AnonymousClass3MX.A09(this.A00.getLayoutInflater(), (ViewGroup) null, this.A04));
        getWindow().setLayout(-1, -1);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }
}
