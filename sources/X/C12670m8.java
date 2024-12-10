package X;

import androidx.compose.ui.text.input.ImeAction;

/* renamed from: X.0m8  reason: invalid class name and case insensitive filesystem */
public final class C12670m8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C04310Mr $focusRequester;
    public final /* synthetic */ C26041Cr5 $imeOptions;
    public final /* synthetic */ boolean $isPassword = false;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C25262Cc3 $transformedText;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12670m8(C04940Pp r2, C05120Qm r3, C04310Mr r4, C26041Cr5 cr5, EBT ebt, C26224CvE cvE, C25262Cc3 cc3, boolean z, boolean z2) {
        super(1);
        this.$transformedText = cc3;
        this.$value = cvE;
        this.$enabled = z;
        this.$imeOptions = cr5;
        this.$readOnly = z2;
        this.$state = r2;
        this.$offsetMapping = ebt;
        this.$manager = r3;
        this.$focusRequester = r4;
    }

    public static final void A02(C16520sO r3, C18090vk r4) {
        r3.CHj(C03120Gr.A02, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A03(C16520sO r3, C18090vk r4) {
        r3.CHj(C03120Gr.A04, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A04(C16520sO r3, C18090vk r4) {
        r3.CHj(C03120Gr.A0B, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A05(C16520sO r3, C18090vk r4) {
        r3.CHj(C03120Gr.A0G, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A0B(C16520sO r3, C18090vk r4, int i) {
        r3.CHj(C03150Gu.A09, ImeAction.A00(i));
        r3.CHj(C03120Gr.A0A, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A0D(C16520sO r3, C22821Di r4) {
        r3.CHj(C03120Gr.A08, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A0E(C16520sO r3, C22821Di r4) {
        r3.CHj(C03120Gr.A0M, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A0H(C16520sO r3, C36001nB r4) {
        r3.CHj(C03120Gr.A0L, new AnonymousClass0KP((String) null, r4));
    }

    public static final void A00(C16520sO r2) {
        r2.CHj(C03150Gu.A0H, C27621Wu.A00);
    }

    public static final void A01(C16520sO r2, long j) {
        r2.CHj(C03150Gu.A0P, C26260Cw5.A03(j));
    }

    public final void A0J(C16520sO r12) {
        C16520sO r4 = r12;
        r12.CHj(C03150Gu.A04, this.$transformedText.A00());
        A01(r12, this.$value.A01());
        if (!this.$enabled) {
            C05150Qq.A01(r12);
        }
        if (this.$isPassword) {
            A00(r12);
        }
        C05150Qq.A08(r12, new C10640if(this.$state));
        A0E(r12, new C11350jt(this.$state, r12, this.$readOnly, this.$enabled));
        A0D(r12, new C11460k4(this.$state, r4, this.$value, this.$readOnly, this.$enabled));
        EBT ebt = this.$offsetMapping;
        boolean z = this.$enabled;
        C26224CvE cvE = this.$value;
        A0H(r12, new C14920pn(this.$state, this.$manager, ebt, cvE, z));
        C26041Cr5 cr5 = this.$imeOptions;
        A0B(r12, new C08630fP(this.$state, cr5), cr5.A00());
        C05150Qq.A05(r12, (String) null, new C08390f1(this.$state, this.$focusRequester, this.$readOnly));
        A04(r12, new C07970eL(this.$manager));
        if (!C26260Cw5.A04(this.$value.A01()) && !this.$isPassword) {
            A02(r12, new C07980eM(this.$manager));
            if (this.$enabled && !this.$readOnly) {
                A03(r12, new C07990eN(this.$manager));
            }
        }
        if (this.$enabled && !this.$readOnly) {
            A05(r12, new C07960eK(this.$manager));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A0J((C16520sO) obj);
        return C27621Wu.A00;
    }
}
