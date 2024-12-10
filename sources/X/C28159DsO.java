package X;

import android.text.InputFilter;
import android.text.SpannedString;
import com.facebook.primitive.textinput.TextInputView;
import java.util.Arrays;

/* renamed from: X.DsO  reason: case insensitive filesystem */
public final class C28159DsO extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28159DsO(BTQ btq) {
        super(2);
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        CharSequence filter;
        int intValue;
        TextInputView textInputView = (TextInputView) obj2;
        C18070vi.A0d(textInputView, 1);
        C98494rF A00 = C98494rF.A00();
        Integer num = this.$model.A0G;
        if (num != null && (intValue = num.intValue()) > -1) {
            A00.element = new InputFilter.LengthFilter(intValue);
            InputFilter[] filters = textInputView.getFilters();
            C18070vi.A0X(filters);
            Object obj3 = A00.element;
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = obj3;
            textInputView.setFilters((InputFilter[]) copyOf);
        }
        InputFilter inputFilter = (InputFilter) A00.element;
        if (!(inputFilter == null || (filter = inputFilter.filter(textInputView.getText(), 0, textInputView.getText().length(), new SpannedString(""), 0, 0)) == null || filter.equals(textInputView.getText()))) {
            textInputView.setText(filter);
        }
        return new AnonymousClass0I3(new C27801Dld(textInputView, A00));
    }
}
