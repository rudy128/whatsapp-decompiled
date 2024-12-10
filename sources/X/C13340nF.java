package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0nF  reason: invalid class name and case insensitive filesystem */
public final class C13340nF extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ AndroidComposeView $owner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13340nF(AndroidComposeView androidComposeView, AnonymousClass1OS r3, int i) {
        super(2);
        this.$owner = androidComposeView;
        this.$content = r3;
        this.$$changed = i;
    }

    public final void A00(C17130tn r4) {
        AnonymousClass0PK.A01(r4, this.$owner, this.$content, AnonymousClass0L8.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
