package X;

import android.view.View;
import android.widget.AbsListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;

/* renamed from: X.4eZ  reason: invalid class name and case insensitive filesystem */
public class C90744eZ implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ BottomSheetListView A03;
    public final /* synthetic */ LanguageSelectorBottomSheet A04;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C90744eZ(View view, BottomSheetListView bottomSheetListView, LanguageSelectorBottomSheet languageSelectorBottomSheet, int i) {
        this.A04 = languageSelectorBottomSheet;
        this.A03 = bottomSheetListView;
        this.A02 = view;
        this.A01 = i;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        float f;
        if (i != this.A00) {
            BottomSheetBehavior bottomSheetBehavior = this.A04.A00;
            if (i != 0) {
                if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 4) {
                    bottomSheetBehavior.A0W(3);
                }
            } else if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 3) {
                bottomSheetBehavior.A0W(4);
            }
            this.A00 = i;
        }
        boolean A012 = this.A03.A01();
        View view = this.A02;
        if (A012) {
            f = (float) this.A01;
        } else {
            f = 0.0f;
        }
        view.setElevation(f);
    }
}
