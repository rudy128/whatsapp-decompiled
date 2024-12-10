package X;

import android.content.Intent;

/* renamed from: X.BdP  reason: case insensitive filesystem */
public final class C23213BdP extends C64172uL {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ E9G A01;

    public C23213BdP(Intent intent, E9G e9g) {
        this.A00 = intent;
        this.A01 = e9g;
    }

    public final void A00() {
        Intent intent = this.A00;
        if (intent != null) {
            this.A01.startActivityForResult(intent, 2);
        }
    }
}
