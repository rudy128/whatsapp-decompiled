package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.029  reason: invalid class name */
public class AnonymousClass029 extends Dialog implements AnonymousClass1F9, AnonymousClass1FE, AnonymousClass01B {
    public C23391Fw A00;
    public final AnonymousClass02V A01 = new AnonymousClass02V(new C06420Yg(this));
    public final AnonymousClass1GA A02 = AnonymousClass1G9.A00(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass029(Context context, int i) {
        super(context, i);
        C18070vi.A0d(context, 1);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C18070vi.A0d(view, 0);
        A03();
        super.addContentView(view, layoutParams);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C18070vi.A0d(view, 0);
        A03();
        super.setContentView(view, layoutParams);
    }

    private final C23391Fw A00() {
        C23391Fw r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C23391Fw r02 = new C23391Fw(this);
        this.A00 = r02;
        return r02;
    }

    public AnonymousClass1GB BYX() {
        return this.A02.A00();
    }

    public void onBackPressed() {
        this.A01.A07();
    }

    public void A03() {
        Window window = getWindow();
        C18070vi.A0b(window);
        View decorView = window.getDecorView();
        C18070vi.A0X(decorView);
        AnonymousClass1ZG.A01(decorView, this);
        Window window2 = getWindow();
        C18070vi.A0b(window2);
        View decorView2 = window2.getDecorView();
        C18070vi.A0X(decorView2);
        AnonymousClass03X.A00(decorView2, this);
        Window window3 = getWindow();
        C18070vi.A0b(window3);
        View decorView3 = window3.getDecorView();
        C18070vi.A0X(decorView3);
        AnonymousClass1ZI.A01(decorView3, this);
    }

    public final AnonymousClass02V BVe() {
        return this.A01;
    }

    public C23381Fv getLifecycle() {
        return A00();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            AnonymousClass02V r1 = this.A01;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C18070vi.A0X(onBackInvokedDispatcher);
            r1.A08(onBackInvokedDispatcher);
        }
        this.A02.A02(bundle);
        A00().A07(C27581Wq.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C18070vi.A0X(onSaveInstanceState);
        this.A02.A03(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        A00().A07(C27581Wq.ON_RESUME);
    }

    public void onStop() {
        A00().A07(C27581Wq.ON_DESTROY);
        this.A00 = null;
        super.onStop();
    }

    public void setContentView(View view) {
        C18070vi.A0d(view, 0);
        A03();
        super.setContentView(view);
    }

    public void setContentView(int i) {
        A03();
        super.setContentView(i);
    }
}
