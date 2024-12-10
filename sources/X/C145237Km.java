package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.7Km  reason: invalid class name and case insensitive filesystem */
public class C145237Km implements C1607789w {
    public int A00;
    public C136866uX A01;
    public final View A02;
    public final LinearLayoutManager A03;
    public final C112045kq A04;
    public final ArrayList A05 = AnonymousClass000.A13();

    public void Bzy(int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        int i4 = this.A00;
        if (i != i4) {
            int i5 = 0;
            while (true) {
                arrayList = this.A05;
                if (i5 >= arrayList.size()) {
                    i5 = -1;
                    break;
                }
                C123266Tt r1 = (C123266Tt) arrayList.get(i5);
                if (r1 instanceof C121066Hp) {
                    i3 = ((C121066Hp) r1).A00;
                } else {
                    i3 = ((C121076Hq) r1).A01;
                }
                if (i4 == i3) {
                    break;
                }
                i5++;
            }
            this.A00 = i;
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    i6 = -1;
                    break;
                }
                C123266Tt r12 = (C123266Tt) arrayList.get(i6);
                if (r12 instanceof C121066Hp) {
                    i2 = ((C121066Hp) r12).A00;
                } else {
                    i2 = ((C121076Hq) r12).A01;
                }
                if (i == i2) {
                    break;
                }
                i6++;
            }
            if (i6 != i5) {
                LinearLayoutManager linearLayoutManager = this.A03;
                int A1N = linearLayoutManager.A1N();
                int A1P = linearLayoutManager.A1P();
                int i7 = ((A1P - A1N) * 2) / 5;
                int i8 = i6 - i7;
                if (i8 >= A1N) {
                    int i9 = i6 + i7;
                    if (i9 > A1P) {
                        i8 = i9;
                        if (i9 >= linearLayoutManager.A0K()) {
                            i8 = linearLayoutManager.A0K() - 1;
                        }
                    }
                } else if (i8 < 0) {
                    i8 = 0;
                }
                C111685kG r0 = new C111685kG(this.A02.getContext(), this, 4);
                r0.A00 = i8;
                linearLayoutManager.A0e(r0);
            }
            C136866uX r02 = this.A01;
            if (r02 != null) {
                r02.A04(i);
            }
            this.A04.notifyDataSetChanged();
        }
    }

    public void CIW(C136866uX r4) {
        this.A01 = r4;
        if (r4 != null) {
            int A032 = r4.A03();
            if (A032 < 0) {
                C108955ca.A1X("AvatarPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, new Object[0]);
                A032 = 0;
            }
            Bzy(A032);
        }
    }

    public C145237Km(Context context, View view) {
        this.A02 = view.findViewById(2131427973);
        RecyclerView A0U = C108945cZ.A0U(view, 2131427959);
        A0U.A0R = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.A03 = linearLayoutManager;
        linearLayoutManager.A1Z(0);
        A0U.setLayoutManager(linearLayoutManager);
        C112045kq r0 = new C112045kq(this);
        this.A04 = r0;
        A0U.setAdapter(r0);
    }

    public View BbS() {
        return this.A02;
    }
}
