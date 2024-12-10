package X;

import android.text.Editable;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.487  reason: invalid class name */
public final class AnonymousClass487 extends AnonymousClass48A {
    public final /* synthetic */ CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass487(WaEditText waEditText, CallRatingViewModel callRatingViewModel, AnonymousClass11C r18, C18000vb r19, AnonymousClass1L2 r20, AnonymousClass1KW r21, C18030ve r22, C18010vc r23) {
        super(waEditText, (TextView) null, r18, r19, r20, r21, r22, r23, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0, false, false, false);
        this.A00 = callRatingViewModel;
    }

    public void afterTextChanged(Editable editable) {
        C18070vi.A0d(editable, 0);
        super.afterTextChanged(editable);
        CallRatingViewModel callRatingViewModel = this.A00;
        String A0I = AnonymousClass1YF.A0I(editable.toString());
        C18070vi.A0d(A0I, 0);
        callRatingViewModel.A02 = A0I;
        Integer num = AnonymousClass00R.A00;
        boolean z = false;
        if (A0I.codePointCount(0, A0I.length()) >= 3) {
            z = true;
        }
        callRatingViewModel.A0T(num, z);
    }
}
