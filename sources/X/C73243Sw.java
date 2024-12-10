package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.calling.callrating.CategorizedUserProblemsFragment;
import java.util.List;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public final class C73243Sw extends C28861b9 {
    public final List A00;

    public C73243Sw(AnonymousClass1GP r2, List list) {
        super(r2, 0);
        this.A00 = list;
    }

    public CharSequence A0C(int i) {
        return (CharSequence) this.A00.get(i);
    }

    public int A0E() {
        return this.A00.size();
    }

    public Fragment A0I(int i) {
        CategorizedUserProblemsFragment categorizedUserProblemsFragment = new CategorizedUserProblemsFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("index", i);
        categorizedUserProblemsFragment.A1R(A0D);
        return categorizedUserProblemsFragment;
    }
}
