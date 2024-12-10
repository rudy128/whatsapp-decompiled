package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.ScrollableKt;

/* renamed from: X.0e0  reason: invalid class name and case insensitive filesystem */
public final class C07760e0 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0AX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07760e0(AnonymousClass0AX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        if (!AnonymousClass000.A1Y(C02670Ex.A00(this.this$0, ScrollableKt.A01))) {
            AnonymousClass0AX r2 = this.this$0;
            long j = C02890Fu.A00;
            Object A00 = C02690Ez.A00(AnonymousClass0PK.A04, r2);
            while (true) {
                A00 = ((View) A00).getParent();
                if (A00 != null && (A00 instanceof ViewGroup)) {
                    if (((ViewGroup) A00).shouldDelayChildPressedState()) {
                        break;
                    }
                } else {
                    z = false;
                }
            }
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
