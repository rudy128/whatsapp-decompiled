package X;

import androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1;

/* renamed from: X.0kD  reason: invalid class name */
public final class AnonymousClass0kD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16200rs $bringIntoViewRequester;
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C26041Cr5 $imeOptions;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C25147CZy $textInputService;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0kD(C16200rs r2, C04940Pp r3, C05120Qm r4, C26041Cr5 cr5, EBT ebt, C26224CvE cvE, C25147CZy cZy, AnonymousClass1OX r9, boolean z, boolean z2) {
        super(1);
        this.$state = r3;
        this.$textInputService = cZy;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$value = cvE;
        this.$imeOptions = cr5;
        this.$offsetMapping = ebt;
        this.$manager = r4;
        this.$coroutineScope = r9;
        this.$bringIntoViewRequester = r2;
    }

    public final void A00(C16360s8 r10) {
        AnonymousClass0NM A02;
        if (AnonymousClass001.A1b(this.$state.A08) != r10.Ber()) {
            C04940Pp r0 = this.$state;
            AnonymousClass000.A1C(r0.A08, r10.Ber());
            if (this.$textInputService != null) {
                if (!AnonymousClass001.A1b(this.$state.A08) || !this.$enabled || this.$readOnly) {
                    C05070Qh.A02(this.$state);
                } else {
                    C25147CZy cZy = this.$textInputService;
                    C05070Qh.A03(this.$state, this.$imeOptions, this.$offsetMapping, this.$value, cZy);
                }
                if (r10.Ber() && (A02 = C04940Pp.A02(this.$state)) != null) {
                    AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$state, A02, this.$offsetMapping, this.$value, (C30391dr) null), this.$coroutineScope, 3);
                }
            }
            if (!r10.Ber()) {
                this.$manager.A0L((AnonymousClass0QY) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C16360s8) obj);
        return C27621Wu.A00;
    }
}
