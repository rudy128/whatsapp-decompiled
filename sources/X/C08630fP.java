package X;

import androidx.compose.ui.text.input.ImeAction;

/* renamed from: X.0fP  reason: invalid class name and case insensitive filesystem */
public final class C08630fP extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26041Cr5 $imeOptions;
    public final /* synthetic */ C04940Pp $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08630fP(C04940Pp r2, C26041Cr5 cr5) {
        super(0);
        this.$state = r2;
        this.$imeOptions = cr5;
    }

    /* renamed from: A00 */
    public final Boolean invoke() {
        this.$state.A09().invoke(ImeAction.A00(this.$imeOptions.A00()));
        return AnonymousClass000.A0i();
    }
}
