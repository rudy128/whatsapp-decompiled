package X;

import android.content.Intent;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity;

/* renamed from: X.B0r  reason: case insensitive filesystem */
public final class C22263B0r extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MaterialDatePicker $datePicker;
    public final /* synthetic */ FlowsCalendarPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22263B0r(MaterialDatePicker materialDatePicker, FlowsCalendarPickerActivity flowsCalendarPickerActivity) {
        super(1);
        this.$datePicker = materialDatePicker;
        this.this$0 = flowsCalendarPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Intent A0A = C17880vN.A0A();
        Long l = ((AJN) MaterialDatePicker.A01(this.$datePicker)).A01;
        String str2 = null;
        if (l == null) {
            l = null;
        }
        A0A.putExtra("selected_value", l);
        AEO aeo = this.this$0.A00;
        if (aeo != null) {
            str = aeo.A00;
        } else {
            str = null;
        }
        A0A.putExtra("input_name", str);
        AEO aeo2 = this.this$0.A00;
        if (aeo2 != null) {
            str2 = aeo2.A01;
        }
        A0A.putExtra("input_type", str2);
        this.this$0.setResult(-1, A0A);
        this.this$0.finish();
        return C27621Wu.A00;
    }
}
