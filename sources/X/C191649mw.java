package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;

/* renamed from: X.9mw  reason: invalid class name and case insensitive filesystem */
public class C191649mw {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass16R A02;
    public final A71 A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass11P A05;
    public final C18000vb A06;
    public final AnonymousClass18K A07;

    public void A00(Activity activity, A45 a45, CXY cxy, String str, HashMap hashMap) {
        C19974A1j a1j = ((AnonymousClass8k7) ((B7W) activity)).A0A;
        C181129Pg.A00(activity, a1j, a45, hashMap);
        E8A e8a = a45.A01;
        if (e8a != null) {
            a1j.A01(a45.A00, e8a, "dialog");
        }
        AnonymousClass1GP r2 = (AnonymousClass1GP) cxy.A05.get();
        DialogFragment dialogFragment = (DialogFragment) r2.A0Q("bloks-dialog");
        if (dialogFragment != null) {
            dialogFragment.A28();
        }
        BloksDialogFragment.A00(str, hashMap).A2C(r2, "bloks-dialog");
    }

    public C191649mw(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass16R r3, A71 a71, AnonymousClass11C r5, AnonymousClass11P r6, C18000vb r7, AnonymousClass18K r8) {
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = a71;
        this.A02 = r3;
    }
}
