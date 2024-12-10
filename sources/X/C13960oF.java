package X;

import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.0oF  reason: invalid class name and case insensitive filesystem */
public final class C13960oF extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AnonymousClass0PT $keyboardActions;
    public final /* synthetic */ C04610Ob $keyboardOptions;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leadingIcon;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C26251Cvq $mergedTextStyle;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ AnonymousClass1OS $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C16370s9 $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supportingText;
    public final /* synthetic */ AnonymousClass1OS $trailingIcon;
    public final /* synthetic */ C26224CvE $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13960oF(C17210uI r2, AnonymousClass0PT r3, C04610Ob r4, AnonymousClass0NY r5, C17090tj r6, C16370s9 r7, C26251Cvq cvq, C26224CvE cvE, EBO ebo, C22821Di r11, AnonymousClass1OS r12, AnonymousClass1OS r13, AnonymousClass1OS r14, AnonymousClass1OS r15, AnonymousClass1OS r16, AnonymousClass1OS r17, AnonymousClass1OS r18, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.$label = r12;
        this.$modifier = r6;
        this.$colors = r5;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$$dirty2 = i2;
        this.$value = cvE;
        this.$onValueChange = r11;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$mergedTextStyle = cvq;
        this.$keyboardOptions = r4;
        this.$keyboardActions = r3;
        this.$singleLine = z4;
        this.$maxLines = i3;
        this.$minLines = i4;
        this.$visualTransformation = ebo;
        this.$interactionSource = r2;
        this.$$dirty = i5;
        this.$placeholder = r13;
        this.$leadingIcon = r14;
        this.$trailingIcon = r15;
        this.$prefix = r16;
        this.$suffix = r17;
        this.$supportingText = r18;
        this.$shape = r7;
    }

    public final void A00(C17130tn r45, int i) {
        long j;
        C17130tn r10 = r45;
        if ((i & 11) != 2 || !r10.BZO()) {
            AnonymousClass1OS r0 = this.$label;
            C17090tj r3 = this.$modifier;
            if (r0 != null) {
                r3 = AnonymousClass0Q7.A06(AnonymousClass0PD.A02(r3, C11990l2.A00, true), 0.0f, 8.0f, 0.0f, 0.0f);
            }
            C17090tj CP5 = r3.CP5(new UnspecifiedConstraintsElement(280.0f, 56.0f));
            AnonymousClass0NY r2 = this.$colors;
            boolean z = this.$isError;
            r10.COB(-1885422187);
            if (z) {
                j = r2.A04;
            } else {
                j = r2.A00;
            }
            C17330uU A01 = AnonymousClass0Ou.A01(r10, new C05100Qk(j));
            AnonymousClass0VR.A0U(r10);
            AnonymousClass09Y r9 = new AnonymousClass09Y(AnonymousClass000.A0V(A01));
            C26224CvE cvE = this.$value;
            C22821Di r43 = this.$onValueChange;
            boolean z2 = this.$enabled;
            boolean z3 = this.$readOnly;
            C26251Cvq cvq = this.$mergedTextStyle;
            C04610Ob r40 = this.$keyboardOptions;
            AnonymousClass0PT r39 = this.$keyboardActions;
            boolean z4 = this.$singleLine;
            int i2 = this.$maxLines;
            int i3 = this.$minLines;
            EBO ebo = this.$visualTransformation;
            C17210uI r18 = this.$interactionSource;
            AnonymousClass1OS r15 = this.$label;
            AnonymousClass1OS r14 = this.$placeholder;
            AnonymousClass1OS r13 = this.$leadingIcon;
            AnonymousClass1OS r11 = this.$trailingIcon;
            AnonymousClass1OS r8 = this.$prefix;
            AnonymousClass1OS r7 = this.$suffix;
            AnonymousClass1OS r6 = this.$supportingText;
            AnonymousClass0NY r5 = this.$colors;
            int i4 = this.$$dirty;
            int i5 = this.$$dirty1;
            int i6 = this.$$dirty2;
            AnonymousClass04D A00 = AnonymousClass0LC.A00(r10, new C14950pq(r18, r5, this.$shape, cvE, ebo, r15, r14, r13, r11, r8, r7, r6, i4, i5, i6, z2, z4, this.$isError), -757328870);
            int i7 = this.$$dirty;
            int i8 = this.$$dirty1;
            int i9 = i8 << 3;
            C17210uI r12 = r18;
            AnonymousClass0PT r132 = r39;
            C04610Ob r142 = r40;
            C17130tn r152 = r10;
            AnonymousClass09Y r17 = r9;
            C26251Cvq cvq2 = cvq;
            C26224CvE cvE2 = cvE;
            EBO ebo2 = ebo;
            C22821Di r21 = r43;
            C02400Dw.A00(r12, r132, r142, r152, CP5, r17, cvq2, cvE2, ebo2, r21, (C22821Di) null, A00, i2, i3, (i7 & 57344) | (i7 & 14) | (i7 & 112) | (i7 & 7168) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192), ((i8 >> 27) & 14) | 196608 | ((i8 >> 9) & 112) | ((this.$$dirty2 << 9) & 7168), ZipDecompressor.UNZIP_BUFFER_SIZE, z2, z3, z4);
            return;
        }
        r10.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
