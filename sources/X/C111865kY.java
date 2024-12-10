package X;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import java.util.List;

/* renamed from: X.5kY  reason: invalid class name and case insensitive filesystem */
public final class C111865kY extends C41251w3 implements Filterable {
    public static final C40411uf A04 = new C111565jv(0);
    public C128386fu A00;
    public List A01;
    public List A02;
    public final CountrySelectorBottomSheet A03;

    public void Bmc(C42011xT r4, int i) {
        C18070vi.A0d(r4, 0);
        Object A0U = A0U(i);
        C18070vi.A0X(A0U);
        C128386fu r2 = (C128386fu) A0U;
        C18070vi.A0d(r2, 0);
        AppCompatRadioButton appCompatRadioButton = ((C113145mc) r4).A00;
        appCompatRadioButton.setText(r2.A01);
        appCompatRadioButton.setChecked(r2.A00);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113145mc(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625016, false), this);
    }

    public Filter getFilter() {
        return new C110305fH(this);
    }

    public C111865kY(CountrySelectorBottomSheet countrySelectorBottomSheet) {
        this();
        this.A03 = countrySelectorBottomSheet;
    }

    public C111865kY() {
        super(A04);
        this.A02 = AnonymousClass000.A13();
        this.A01 = AnonymousClass000.A13();
    }
}
