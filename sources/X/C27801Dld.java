package X;

import android.text.InputFilter;
import com.facebook.primitive.textinput.TextInputView;
import java.util.ArrayList;

/* renamed from: X.Dld  reason: case insensitive filesystem */
public final class C27801Dld extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $filter;
    public final /* synthetic */ TextInputView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27801Dld(TextInputView textInputView, C98494rF r3) {
        super(0);
        this.$filter = r3;
        this.$view = textInputView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C98494rF r8 = this.$filter;
        if (r8.element != null) {
            TextInputView textInputView = this.$view;
            InputFilter[] filters = textInputView.getFilters();
            C18070vi.A0X(filters);
            ArrayList A13 = AnonymousClass000.A13();
            for (InputFilter inputFilter : filters) {
                if (inputFilter != r8.element) {
                    A13.add(inputFilter);
                }
            }
            textInputView.setFilters((InputFilter[]) A13.toArray(new InputFilter[0]));
        }
        return C27621Wu.A00;
    }
}
