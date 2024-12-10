package X;

import com.google.android.material.checkbox.MaterialCheckBox;

/* renamed from: X.5WE  reason: invalid class name */
public final class AnonymousClass5WE extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ MaterialCheckBox $checkbox;
    public final /* synthetic */ AnonymousClass47H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5WE(MaterialCheckBox materialCheckBox, AnonymousClass47H r3) {
        super(2);
        this.this$0 = r3;
        this.$checkbox = materialCheckBox;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.this$0.A4j(!this.$checkbox.isChecked());
        return C27621Wu.A00;
    }
}
