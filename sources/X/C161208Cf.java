package X;

import android.os.FileObserver;

/* renamed from: X.8Cf  reason: invalid class name and case insensitive filesystem */
public class C161208Cf extends FileObserver {
    public final /* synthetic */ C20032A4b A00;
    public final /* synthetic */ C18140vp A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161208Cf(C20032A4b a4b, String str, C18140vp r4) {
        super(str, 2);
        this.A00 = a4b;
        this.A01 = r4;
    }

    public void onEvent(int i, String str) {
        if (C26294Cx6.A01.BfN(2)) {
            C26294Cx6.A01.CRf("LightSharedPreferencesFactory", "Reloading LSP due to file modification.");
        }
        C20032A4b.A00(this.A00, this.A01);
    }
}
