package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.WaImageButton;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.community.LinkExistingGroups;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.favorites.picker.FavoritesPickerActivity;
import java.util.List;

/* renamed from: X.4kK  reason: invalid class name and case insensitive filesystem */
public class C94254kK implements C108375bb {
    public void C4C(AnonymousClass4SL r1) {
    }

    public void C4D(AnonymousClass4SL r1, int i, boolean z) {
    }

    public void BEa(AnonymousClass3gf r9, AnonymousClass1E7 r10) {
        ValueAnimator valueAnimator;
        int i;
        SelectionCheckView selectionCheckView = (SelectionCheckView) r9.A02.findViewWithTag(r10);
        if (r9.A5C(r10) && !r10.A0y) {
            selectionCheckView = null;
        }
        boolean z = !TextUtils.isEmpty(r9.A0R);
        if (r10.A0y) {
            r10.A0y = false;
        } else {
            if (r9.A0i.size() != r9.A4f()) {
                if (!(r9 instanceof LinkExistingGroups)) {
                    C88384Zm.A00(r9);
                }
                r10.A0y = true;
            } else if (r9 instanceof FavoritesPickerActivity) {
                AnonymousClass1KB r5 = r9.A05;
                Resources resources = r9.getResources();
                int A4f = r9.A4f();
                Object[] A1a = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a, r9.A4f(), 0);
                r5.A0G(resources.getQuantityString(2131755149, A4f, A1a), 0);
                SelectionCheckView selectionCheckView2 = (SelectionCheckView) r9.A02.findViewWithTag(r10);
                if (selectionCheckView2 != null) {
                    selectionCheckView2.A04(false, false);
                    return;
                }
                return;
            } else if (r9 instanceof FavoritePicker) {
                SelectionCheckView selectionCheckView3 = (SelectionCheckView) r9.A02.findViewWithTag(r10);
                C98414r6 r52 = new C98414r6(r9, 0);
                C18000vb r4 = r9.A0F;
                Object[] A1a2 = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a2, 100, 0);
                String A0K = r4.A0K(A1a2, 2131755091, 100);
                C18070vi.A0X(A0K);
                r9.CMm(AnonymousClass4Fw.A00(r52, A0K), "MessageDialogFragment");
                if (selectionCheckView3 != null) {
                    selectionCheckView3.A04(false, false);
                    return;
                }
                return;
            } else if (r9 instanceof GroupCallParticipantPicker) {
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) r9;
                if (((AnonymousClass1VD) groupCallParticipantPicker.A0G.get()).A00.A02()) {
                    C74803cp.A0x(groupCallParticipantPicker);
                    return;
                }
                int A4f2 = groupCallParticipantPicker.A4f();
                Object[] A1a3 = AnonymousClass3MW.A1a();
                groupCallParticipantPicker.A05.A0G(groupCallParticipantPicker.A0F.A0K(A1a3, 2131755187, (long) A4f2), C72453Mb.A1b(A1a3, A4f2) ? 1 : 0);
                return;
            } else {
                SelectionCheckView selectionCheckView4 = (SelectionCheckView) r9.A02.findViewWithTag(r10);
                int A4f3 = r9.A4f();
                if (r9.A4e() != -1) {
                    r9.BhR(C72473Md.A0k(r9.getResources(), A4f3, r9.A4e()));
                }
                if (selectionCheckView4 != null) {
                    r9.A4x(selectionCheckView4, r10, false);
                    return;
                }
                return;
            }
        }
        C88384Zm.A01(r9, r10, z);
        if (selectionCheckView != null) {
            selectionCheckView.A04(r10.A0y, true);
        }
        C88384Zm.A02(r9, r9.A0i);
        r9.A4t();
        if (C88384Zm.A03(r9, r10)) {
            r9.A01.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = r9.A0A;
        if (selectedContactsList != null) {
            ViewGroup viewGroup = r9.A00;
            ListView listView = r9.A02;
            boolean z2 = r9.A0Z;
            selectedContactsList.A02();
            if (selectedContactsList.A09.isEmpty()) {
                selectedContactsList.setVisibility(4);
                if (z2) {
                    selectedContactsList.A08.CRZ();
                }
                AnimatorSet animatorSet = selectedContactsList.A02;
                if (animatorSet != null && animatorSet.isRunning()) {
                    selectedContactsList.A02.end();
                }
                int[] iArr = new int[2];
                if (!z2 || viewGroup.getVisibility() != 0) {
                    i = selectedContactsList.A01;
                } else {
                    i = selectedContactsList.A01 - viewGroup.getMeasuredHeight();
                }
                iArr[0] = i;
                iArr[1] = 0;
                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                selectedContactsList.A03 = ofInt;
                ofInt.addUpdateListener(new C88684ac(listView));
                selectedContactsList.A03.addListener(new AnonymousClass4aZ(selectedContactsList));
                selectedContactsList.A03.setDuration(240);
                if (selectedContactsList instanceof GroupCallSelectedContactsList) {
                    GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) selectedContactsList;
                    int i2 = groupCallSelectedContactsList.A00;
                    int i3 = i2 + groupCallSelectedContactsList.A00;
                    int i4 = 1;
                    int i5 = -1;
                    if (AnonymousClass3MY.A1b(groupCallSelectedContactsList.A04)) {
                        i5 = 1;
                    }
                    WaImageButton waImageButton = groupCallSelectedContactsList.A02;
                    waImageButton.setTranslationX(waImageButton.getTranslationX() + ((float) (i3 * i5)));
                    int i6 = i2 + groupCallSelectedContactsList.A01;
                    if (!AnonymousClass3MY.A1b(groupCallSelectedContactsList.A04)) {
                        i4 = -1;
                    }
                    WaImageButton waImageButton2 = groupCallSelectedContactsList.A03;
                    waImageButton2.setTranslationX(waImageButton2.getTranslationX() + ((float) (i6 * i4)));
                }
                selectedContactsList.A03.start();
            } else if (selectedContactsList.getVisibility() != 0 || ((valueAnimator = selectedContactsList.A03) != null && valueAnimator.isRunning())) {
                selectedContactsList.setVisibility(0);
                SelectedContactsList.A00(listView, viewGroup, selectedContactsList, z2);
            } else if (r10.A0y) {
                selectedContactsList.A05.A0f(AnonymousClass3MX.A01(selectedContactsList.A09));
            }
        }
    }

    public SelectedContactsList CLH(Activity activity, C108435bh r3, List list, int i) {
        SelectedContactsList selectedContactsList = (SelectedContactsList) AnonymousClass3MY.A0G(AnonymousClass3MX.A0G(activity, 2131435116), i);
        selectedContactsList.A08 = r3;
        selectedContactsList.A09 = list;
        return selectedContactsList;
    }
}
