package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.9AK  reason: invalid class name */
public final class AnonymousClass9AK extends C89564cf {
    public final /* synthetic */ AnonymousClass1L2 A00;
    public final /* synthetic */ AnonymousClass1KW A01;
    public final /* synthetic */ C18030ve A02;
    public final /* synthetic */ C1769296h A03;
    public final /* synthetic */ C18010vc A04;

    public void afterTextChanged(Editable editable) {
        Editable editable2 = editable;
        C18070vi.A0d(editable, 0);
        C1769296h r3 = this.A03;
        if (r3.A05() != -1) {
            String obj = editable.toString();
            String replace = obj.replace("\n", "");
            if (TextUtils.equals(obj, replace)) {
                String obj2 = editable.toString();
                C18030ve r11 = this.A02;
                WaEditText waEditText = r3.A02;
                Context context = waEditText.getContext();
                AnonymousClass1KW r10 = this.A01;
                C26302CxJ.A0J(context, waEditText.getPaint(), editable2, r3.A03, r10, r11, this.A04, 1.3f);
                C43251zV.A07(waEditText.getContext(), waEditText.getPaint(), editable, r10, r11);
                int A05 = r3.A05() - 2;
                PollCreatorViewModel pollCreatorViewModel = r3.A04;
                C18070vi.A0d(obj2, 0);
                List list = pollCreatorViewModel.A0D;
                if (list.size() < C18020vd.A00(C18040vf.A02, pollCreatorViewModel.A08, 1408) && obj2.length() == 1 && (AnonymousClass3MX.A02(list, 1) == A05 || PollCreatorViewModel.A04(pollCreatorViewModel))) {
                    int i = pollCreatorViewModel.A01;
                    pollCreatorViewModel.A01 = i + 1;
                    list.add(new C1769596k(i, C72453Mb.A1Y((Boolean) pollCreatorViewModel.A07.A06())));
                    PollCreatorViewModel.A03(pollCreatorViewModel);
                    pollCreatorViewModel.A0B.A0E(C17880vN.A0p());
                }
                if (pollCreatorViewModel.A0X(obj2, A05)) {
                    boolean A0W = pollCreatorViewModel.A0W(A05);
                    int i2 = pollCreatorViewModel.A00;
                    if (A0W) {
                        if (A05 != i2) {
                            AnonymousClass3MX.A1K(pollCreatorViewModel.A04, AnonymousClass3MX.A01(list));
                            pollCreatorViewModel.A00 = A05;
                            pollCreatorViewModel.A0B.A0E(C17880vN.A0p());
                        }
                    } else if (i2 != -1) {
                        AnonymousClass3MX.A1K(pollCreatorViewModel.A04, -1);
                        pollCreatorViewModel.A00 = -1;
                    }
                    int i3 = r3.A00;
                    List list2 = pollCreatorViewModel.A0E;
                    int size = list2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        } else if (i3 == AnonymousClass001.A0n(list2, i4)) {
                            list2.remove(i4);
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                Editable text = waEditText.getText();
                if (text != null) {
                    Drawable drawable = r3.A01;
                    int length = text.toString().length();
                    int i5 = 255;
                    if (length == 0) {
                        i5 = 0;
                    }
                    drawable.setAlpha(i5);
                    return;
                }
                return;
            }
            editable.clear();
            editable.append(replace);
        }
    }

    public AnonymousClass9AK(AnonymousClass1L2 r1, AnonymousClass1KW r2, C18030ve r3, C1769296h r4, C18010vc r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }
}
