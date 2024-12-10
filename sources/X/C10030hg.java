package X;

import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0hg  reason: invalid class name and case insensitive filesystem */
public final class C10030hg extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10030hg(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        int i;
        KeyEvent keyEvent = ((AnonymousClass0NA) obj).A00;
        long A0u = AnonymousClass001.A0u(keyEvent);
        if (A0u == AnonymousClass0ND.A0C) {
            i = 1;
            if (keyEvent.isShiftPressed()) {
                i = 2;
            }
        } else if (A0u == AnonymousClass0ND.A05) {
            i = 4;
        } else if (A0u == AnonymousClass0ND.A04) {
            i = 3;
        } else if (A0u == AnonymousClass0ND.A06 || A0u == AnonymousClass0ND.A0B) {
            i = 5;
        } else if (A0u == AnonymousClass0ND.A03 || A0u == AnonymousClass0ND.A0A) {
            i = 6;
        } else if (A0u == AnonymousClass0ND.A02 || A0u == AnonymousClass0ND.A07 || A0u == AnonymousClass0ND.A09) {
            i = 7;
        } else {
            if (A0u == AnonymousClass0ND.A01 || A0u == AnonymousClass0ND.A08) {
                i = 8;
            }
            z = false;
            return Boolean.valueOf(z);
        }
        AnonymousClass0N9 r2 = new AnonymousClass0N9(i);
        if (C02580Eo.A00(keyEvent) == 2) {
            z = this.this$0.getFocusOwner().Bk5(r2.A00);
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
