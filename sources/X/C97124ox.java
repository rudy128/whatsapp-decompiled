package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.interopui.optin.Hilt_InteropOptInErrorDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ox  reason: invalid class name and case insensitive filesystem */
public final class C97124ox implements C160848Ae {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C86254Qx A01;
    public final /* synthetic */ AnonymousClass5a4 A02;

    public C97124ox(Context context, C86254Qx r2, AnonymousClass5a4 r3) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
    }

    public void BzG() {
        Activity A002 = AnonymousClass1L9.A00(this.A00);
        C18070vi.A0z(A002, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C20098A7b.A01(new Hilt_InteropOptInErrorDialogFragment(), ((AnonymousClass1FL) A002).getSupportFragmentManager());
    }

    public void C3C(Integer num) {
        Activity A002 = AnonymousClass1L9.A00(this.A00);
        C18070vi.A0z(A002, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C20098A7b.A01(new Hilt_InteropOptInErrorDialogFragment(), ((AnonymousClass1FL) A002).getSupportFragmentManager());
    }

    public void C9h() {
        Log.e("InteropOptInManager/onUserAcknowledged");
    }

    public void C9i() {
        Log.e("InteropOptInManager/onUserApproved");
    }

    public void C9j() {
        Log.e("InteropOptInManager/onUserDenied");
    }

    public void C9l() {
    }

    public void C9m() {
        List<C89514ca> list = AnonymousClass3MX.A0k(this.A01.A00).A01;
        ArrayList A0D = C29351c6.A0D(list);
        for (C89514ca r2 : list) {
            A0D.add(new C86884Tl(r2, true));
        }
        AnonymousClass5a4 r0 = this.A02;
        if (r0 != null) {
            r0.C9n(A0D);
        }
    }

    public void C9o() {
    }
}
