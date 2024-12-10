package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.WaTextView;

public final class A0K {
    public final AnonymousClass00H A00;
    public final AnonymousClass1L9 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1LC A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass19D A05;
    public final C18030ve A06;
    public final C36401np A07;
    public final AnonymousClass00H A08;

    public static final C010105w A00(Context context, Runnable runnable) {
        C010105w r3 = null;
        if (!AnonymousClass1L9.A00(context).isFinishing()) {
            View inflate = View.inflate(context, 2131623988, (ViewGroup) null);
            C73203Rj A002 = AnonymousClass4a6.A00(context);
            A002.A0c(inflate);
            A002.A0T(false);
            r3 = AnonymousClass3MY.A0L(A002);
            AnonymousClass3Ma.A0E(inflate, 2131429986).setText(2131897750);
            AnonymousClass3Ma.A0E(inflate, 2131429980).setText(2131897751);
            Window window = r3.getWindow();
            if (window != null) {
                AnonymousClass3Ma.A1H(window, C19740yt.A00(context, 2131102739));
            }
            C90024dP.A00(C18070vi.A05(inflate, 2131429535), r3, runnable, 31);
        }
        return r3;
    }

    public final C010105w A01(Context context, AnonymousClass1FL r21, Runnable runnable, Runnable runnable2) {
        Context context2 = context;
        View A082 = AnonymousClass3MX.A08(context2, 2131623988);
        C73203Rj A002 = AnonymousClass4a6.A00(context2);
        A002.A0c(A082);
        A002.A0T(false);
        C010105w A0L = AnonymousClass3MY.A0L(A002);
        AnonymousClass3Ma.A0E(A082, 2131429986).setText(2131897750);
        WaTextView A0N = AnonymousClass3Ma.A0N(A082, 2131429980);
        A0N.setText(2131897749);
        C18030ve r8 = this.A06;
        C36401np r9 = this.A07;
        String string = context2.getString(2131897749);
        AnonymousClass1FL r4 = r21;
        A9B.A0N(context2, r4, A0N, AnonymousClass3MW.A0a(this.A08), this.A04, r8, r9, new C21449AkG((Object) this, 46), "learn-more", string, "automatic-pn-verification");
        Window window = A0L.getWindow();
        if (window != null) {
            AnonymousClass3Ma.A1H(window, C19740yt.A00(context2, 2131102739));
        }
        C18070vi.A05(A082, 2131429535).setOnClickListener(new AnonymousClass78E(this, A0L, runnable2, runnable, 25));
        return A0L;
    }

    public A0K(AnonymousClass1L9 r2, AnonymousClass1KB r3, AnonymousClass1LC r4, AnonymousClass11C r5, AnonymousClass19D r6, C18030ve r7, C36401np r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r7, r3, r8, r9, r4);
        C18070vi.A0q(r2, r5, r6);
        C18070vi.A0d(r10, 9);
        this.A06 = r7;
        this.A02 = r3;
        this.A07 = r8;
        this.A00 = r9;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A08 = r10;
    }
}
