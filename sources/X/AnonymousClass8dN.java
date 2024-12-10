package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

/* renamed from: X.8dN  reason: invalid class name */
public abstract class AnonymousClass8dN extends C166618dE {
    public AnonymousClass1L7 A00;
    public AnonymousClass11C A01;
    public AnonymousClass1LU A02;
    public AnonymousClass1CM A03;
    public AnonymousClass00H A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AnonymousClass1XL) this.A04.get()).A01(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        if (!this.A03.A04() && this.A03.A00(false) != 2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("settings/resume/wrong-state ");
            C17900vP.A0o(A10, this.A03.A00(false));
            startActivity(AnonymousClass1LU.A0A(this));
            finish();
        }
        if (Build.VERSION.SDK_INT < 23 || !((AnonymousClass1XL) this.A04.get()).A06()) {
            ((AnonymousClass1XL) this.A04.get()).A02(false);
            return;
        }
        Intent className = C17880vN.A0A().setClassName(getPackageName(), "com.whatsapp.authentication.AppAuthenticationActivity");
        className.setFlags(A7Y.A0F);
        if (!this.A03) {
            this.A00 = className;
            this.A02 = 202;
        } else {
            startActivityForResult(className, 202);
        }
        overridePendingTransition(0, 0);
    }
}
