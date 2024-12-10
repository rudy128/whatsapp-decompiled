package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.74m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1411474m implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ C136366th A00;
    public final /* synthetic */ FlowsWebBottomSheetContainer A01;
    public final /* synthetic */ SimpleDateFormat A02;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        C136366th r2 = this.A00;
        SimpleDateFormat simpleDateFormat = this.A02;
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.A01;
        C18070vi.A0d(simpleDateFormat, 1);
        Date A002 = A3L.A00(i, i2, i3);
        C18070vi.A0X(A002);
        String str = r2.A03;
        String str2 = r2.A04;
        String format = simpleDateFormat.format(A002);
        C18070vi.A0X(format);
        C135236rs r1 = new C135236rs(format, str, str2);
        WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0B;
        if (waFlowsViewModel == null) {
            C18070vi.A11("waFlowsViewModel");
            throw null;
        } else {
            waFlowsViewModel.A03.A0E(r1);
        }
    }

    public /* synthetic */ C1411474m(C136366th r1, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, SimpleDateFormat simpleDateFormat) {
        this.A00 = r1;
        this.A02 = simpleDateFormat;
        this.A01 = flowsWebBottomSheetContainer;
    }
}
