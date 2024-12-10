package X;

import android.text.InputFilter;
import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.creator.PollCreatorViewModel;

/* renamed from: X.96g  reason: invalid class name and case insensitive filesystem */
public final class C1769196g extends AnonymousClass8IL {
    public final WaEditText A00;
    public final WaTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1769196g(View view, AnonymousClass11C r15, AnonymousClass1L2 r16, AnonymousClass1KW r17, C18030ve r18, PollCreatorViewModel pollCreatorViewModel, C18010vc r20) {
        super(view);
        AnonymousClass1KW r8 = r17;
        C18030ve r9 = r18;
        int A0G = C72453Mb.A0G(r9, r8, 1);
        AnonymousClass1L2 r7 = r16;
        C18010vc r12 = r20;
        C72473Md.A1M(r15, r12, r7, 3);
        PollCreatorViewModel pollCreatorViewModel2 = pollCreatorViewModel;
        C18070vi.A0l(view, pollCreatorViewModel2);
        WaEditText waEditText = (WaEditText) AnonymousClass3MX.A0C(view, 2131433940);
        this.A00 = waEditText;
        this.A01 = C72453Mb.A0g(view, 2131433941);
        waEditText.setRawInputType(16385);
        InputFilter[] inputFilterArr = new InputFilter[A0G];
        inputFilterArr[0] = new InputFilter.LengthFilter(5000);
        C72453Mb.A1H(waEditText, inputFilterArr, C18020vd.A00(C18040vf.A02, r9, 1406), 1);
        waEditText.setOnFocusChangeListener(new AFW(view, this, 2));
        waEditText.addTextChangedListener(new AF8(view, r15, r7, r8, r9, this, pollCreatorViewModel2, r12));
        waEditText.requestFocus();
    }
}
