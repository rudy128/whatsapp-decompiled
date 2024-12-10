package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog$Builder;

/* renamed from: X.0SD  reason: invalid class name */
public class AnonymousClass0SD implements C004301w, DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnKeyListener {
    public C010105w A00;
    public C004101u A01;
    public C003301m A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.01t, X.01u, java.lang.Object] */
    public void A00() {
        C003301m r3 = this.A02;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r3.A02());
        Context context = alertDialog$Builder.getContext();
        ? obj = new Object();
        obj.A00 = context;
        obj.A01 = LayoutInflater.from(context);
        this.A01 = obj;
        obj.A05 = this;
        r3.A0V(obj);
        C004101u r1 = this.A01;
        C004201v r0 = r1.A03;
        if (r0 == null) {
            r0 = new C004201v(r1);
            r1.A03 = r0;
        }
        alertDialog$Builder.A0H(this, r0);
        View A05 = r3.A05();
        if (A05 != null) {
            alertDialog$Builder.A0R(A05);
        } else {
            alertDialog$Builder.A01.A0B = r3.A03();
            alertDialog$Builder.setTitle(r3.A09());
        }
        alertDialog$Builder.A0P(this);
        C010105w create = alertDialog$Builder.create();
        this.A00 = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= A7Y.A0F;
        this.A00.show();
    }

    public void Bp9(C003301m r2, boolean z) {
        C010105w r0;
        if ((z || r2 == this.A02) && (r0 = this.A00) != null) {
            r0.dismiss();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C003301m r2 = this.A02;
        C004101u r1 = this.A01;
        C004201v r0 = r1.A03;
        if (r0 == null) {
            r0 = new C004201v(r1);
            r1.A03 = r0;
        }
        r2.A0f(0, (AnonymousClass03G) r0.getItem(i));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A01.Bp9(this.A02, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }

    public AnonymousClass0SD(C003301m r1) {
        this.A02 = r1;
    }

    public boolean Bzb(C003301m r2) {
        return false;
    }
}
