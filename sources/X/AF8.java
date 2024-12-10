package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import java.util.List;

public final class AF8 implements TextWatcher {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass11C A01;
    public final /* synthetic */ AnonymousClass1L2 A02;
    public final /* synthetic */ AnonymousClass1KW A03;
    public final /* synthetic */ C18030ve A04;
    public final /* synthetic */ C1769196g A05;
    public final /* synthetic */ PollCreatorViewModel A06;
    public final /* synthetic */ C18010vc A07;

    public void afterTextChanged(Editable editable) {
        Editable editable2 = editable;
        C18070vi.A0d(editable2, 0);
        C18030ve r10 = this.A04;
        C1769196g r1 = this.A05;
        List list = C42011xT.A0I;
        WaEditText waEditText = r1.A00;
        Context context = waEditText.getContext();
        AnonymousClass1KW r9 = this.A03;
        AnonymousClass11C r8 = this.A01;
        C18010vc r11 = this.A07;
        TextPaint paint = waEditText.getPaint();
        View view = this.A00;
        C26302CxJ.A0L(context, editable2, paint, r8, r9, r10, r11, AnonymousClass1YL.A00(view.getContext(), 2130970892, 2131102330), AnonymousClass1YL.A00(view.getContext(), 2130970132, 2131101250), true);
        C43251zV.A07(waEditText.getContext(), waEditText.getPaint(), editable2, r9, r10);
        PollCreatorViewModel pollCreatorViewModel = this.A06;
        String obj = editable2.toString();
        C18070vi.A0d(obj, 0);
        pollCreatorViewModel.A09.A00 = obj;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AF8(View view, AnonymousClass11C r2, AnonymousClass1L2 r3, AnonymousClass1KW r4, C18030ve r5, C1769196g r6, PollCreatorViewModel pollCreatorViewModel, C18010vc r8) {
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A07 = r8;
        this.A02 = r3;
        this.A00 = view;
        this.A06 = pollCreatorViewModel;
    }
}
