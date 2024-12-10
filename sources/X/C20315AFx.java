package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import java.util.List;

/* renamed from: X.AFx  reason: case insensitive filesystem */
public final class C20315AFx implements AdapterView.OnItemSelectedListener {
    public C195299t7 A00;
    public final /* synthetic */ WaEditText A01;
    public final /* synthetic */ WaEditText A02;
    public final /* synthetic */ BrazilPaymentMethodAddPixBottomSheet A03;
    public final /* synthetic */ C98494rF A04;

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition;
        C89614ck r0;
        if (adapterView != null && (itemAtPosition = adapterView.getItemAtPosition(i)) != null && (itemAtPosition instanceof C195299t7)) {
            C98494rF r8 = this.A04;
            TextWatcher textWatcher = (TextWatcher) r8.element;
            if (textWatcher != null) {
                this.A02.removeTextChangedListener(textWatcher);
            }
            C195299t7 r02 = this.A00;
            if (r02 == null || !C18070vi.A18(r02.A03, ((C195299t7) itemAtPosition).A03)) {
                Editable text = this.A02.getText();
                if (text != null) {
                    text.clear();
                }
            } else {
                this.A00 = null;
            }
            WaEditText waEditText = this.A02;
            C195299t7 r9 = (C195299t7) itemAtPosition;
            waEditText.setInputType(r9.A00);
            int i2 = 0;
            waEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(r9.A01)});
            BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet = this.A03;
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = brazilPaymentMethodAddPixBottomSheet.A05;
            if (brazilAddPixKeyViewModel == null) {
                C18070vi.A11("brazilAddPixKeyViewModel");
                throw null;
            }
            String str = r9.A03;
            brazilAddPixKeyViewModel.A0W(str);
            String str2 = r9.A02;
            if (str2 == null) {
                r0 = null;
            } else {
                r0 = new C89614ck(waEditText, str2);
                waEditText.addTextChangedListener(r0);
            }
            r8.element = r0;
            WaEditText waEditText2 = this.A01;
            if (!"PHONE".equals(str)) {
                i2 = 8;
            }
            waEditText2.setVisibility(i2);
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = brazilPaymentMethodAddPixBottomSheet.A05;
            if (brazilAddPixKeyViewModel2 == null) {
                C18070vi.A11("brazilAddPixKeyViewModel");
                throw null;
            }
            BrazilAddPixKeyViewModel.A05(brazilAddPixKeyViewModel2, str, brazilPaymentMethodAddPixBottomSheet.A0E, brazilPaymentMethodAddPixBottomSheet.A09, 190);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public C20315AFx(WaEditText waEditText, WaEditText waEditText2, BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet, List list, C98494rF r6, int i) {
        this.A04 = r6;
        this.A02 = waEditText;
        this.A03 = brazilPaymentMethodAddPixBottomSheet;
        this.A01 = waEditText2;
        this.A00 = (C195299t7) list.get(i);
    }
}
