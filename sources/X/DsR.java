package X;

import android.text.InputFilter;
import com.facebook.primitive.textinput.TextInputView;
import java.util.Arrays;

public final class DsR extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsR(BTQ btq) {
        super(2);
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextInputView textInputView = (TextInputView) obj2;
        C18070vi.A0d(textInputView, 1);
        C98494rF A00 = C98494rF.A00();
        AnonymousClass1OS r2 = this.$model.A0M;
        if (r2 != null) {
            A00.element = new C1418777h(r2, 0);
            InputFilter[] filters = textInputView.getFilters();
            C18070vi.A0X(filters);
            Object obj3 = A00.element;
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = obj3;
            textInputView.setFilters((InputFilter[]) copyOf);
        }
        return new AnonymousClass0I3(new C27803Dlf(textInputView, A00));
    }
}
