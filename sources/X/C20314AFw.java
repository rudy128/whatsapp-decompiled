package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.BrazilAddPixFragment;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import java.util.List;

/* renamed from: X.AFw  reason: case insensitive filesystem */
public final class C20314AFw implements AdapterView.OnItemSelectedListener {
    public C195299t7 A00;
    public final /* synthetic */ WaEditText A01;
    public final /* synthetic */ BrazilAddPixFragment A02;
    public final /* synthetic */ C98494rF A03;

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition;
        C89614ck r0;
        if (adapterView != null && (itemAtPosition = adapterView.getItemAtPosition(i)) != null && (itemAtPosition instanceof C195299t7)) {
            C98494rF r7 = this.A03;
            TextWatcher textWatcher = (TextWatcher) r7.element;
            if (textWatcher != null) {
                this.A01.removeTextChangedListener(textWatcher);
            }
            C195299t7 r02 = this.A00;
            if (r02 == null || !C18070vi.A18(r02.A03, ((C195299t7) itemAtPosition).A03)) {
                Editable text = this.A01.getText();
                if (text != null) {
                    text.clear();
                }
            } else {
                this.A00 = null;
            }
            WaEditText waEditText = this.A01;
            C195299t7 r8 = (C195299t7) itemAtPosition;
            waEditText.setInputType(r8.A00);
            waEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(r8.A01)});
            BrazilAddPixFragment brazilAddPixFragment = this.A02;
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = brazilAddPixFragment.A05;
            if (brazilAddPixKeyViewModel == null) {
                C18070vi.A11("brazilAddPixKeyViewModel");
                throw null;
            }
            String str = r8.A03;
            brazilAddPixKeyViewModel.A0W(str);
            String str2 = r8.A02;
            if (str2 == null) {
                r0 = null;
            } else {
                r0 = new C89614ck(waEditText, str2);
                waEditText.addTextChangedListener(r0);
            }
            r7.element = r0;
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = brazilAddPixFragment.A05;
            if (brazilAddPixKeyViewModel2 == null) {
                C18070vi.A11("brazilAddPixKeyViewModel");
                throw null;
            }
            BrazilAddPixKeyViewModel.A05(brazilAddPixKeyViewModel2, str, brazilAddPixFragment.A0F, brazilAddPixFragment.A0A, 190);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public C20314AFw(WaEditText waEditText, BrazilAddPixFragment brazilAddPixFragment, List list, C98494rF r5, int i) {
        this.A03 = r5;
        this.A01 = waEditText;
        this.A02 = brazilAddPixFragment;
        this.A00 = (C195299t7) list.get(i);
    }
}
