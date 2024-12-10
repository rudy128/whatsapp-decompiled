package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0nE  reason: invalid class name and case insensitive filesystem */
public final class C13330nE extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ AndroidComposeView $owner;
    public final /* synthetic */ C06220Xl $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13330nE(AndroidComposeView androidComposeView, C06220Xl r3, AnonymousClass1OS r4) {
        super(2);
        this.$owner = androidComposeView;
        this.$uriHandler = r3;
        this.$content = r4;
    }

    public final void A00(C17130tn r5, int i) {
        if ((i & 11) != 2 || !r5.BZO()) {
            AnonymousClass0OD.A00(r5, this.$owner, this.$uriHandler, this.$content, 72);
        } else {
            r5.CNR();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
