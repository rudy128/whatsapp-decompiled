package X;

import android.content.Context;
import android.content.Intent;
import android.widget.RadioButton;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;

/* renamed from: X.6pz  reason: invalid class name and case insensitive filesystem */
public final class C134086pz {
    public boolean A00;
    public final Context A01;
    public final StatusAudienceSelectorShareSheetFragment A02;
    public final C136806uR A03;
    public final C111165iV A04;
    public final AnonymousClass02n A05;
    public final AnonymousClass1LU A06;
    public final AnonymousClass00H A07;

    public final void A01(int i) {
        RadioButton radioButton;
        boolean z;
        if (i != 1) {
            StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment = this.A02;
            boolean A1Y = C108965cb.A1Y(statusAudienceSelectorShareSheetFragment);
            if (i != 2) {
                if (A1Y) {
                    RadioButton radioButton2 = statusAudienceSelectorShareSheetFragment.A03;
                    if (radioButton2 != null) {
                        radioButton2.setChecked(true);
                    }
                    RadioButton radioButton3 = statusAudienceSelectorShareSheetFragment.A04;
                    if (radioButton3 != null) {
                        radioButton3.setChecked(false);
                    }
                    RadioButton radioButton4 = statusAudienceSelectorShareSheetFragment.A05;
                    if (radioButton4 != null) {
                        radioButton4.setChecked(false);
                        return;
                    }
                    return;
                }
            } else if (A1Y) {
                RadioButton radioButton5 = statusAudienceSelectorShareSheetFragment.A03;
                if (radioButton5 != null) {
                    radioButton5.setChecked(false);
                }
                RadioButton radioButton6 = statusAudienceSelectorShareSheetFragment.A04;
                if (radioButton6 != null) {
                    radioButton6.setChecked(true);
                }
                RadioButton radioButton7 = statusAudienceSelectorShareSheetFragment.A05;
                if (radioButton7 != null) {
                    radioButton7.setChecked(false);
                    return;
                }
                return;
            }
            RadioButton radioButton8 = statusAudienceSelectorShareSheetFragment.A02;
            if (radioButton8 != null) {
                radioButton8.setChecked(true);
            }
            radioButton = statusAudienceSelectorShareSheetFragment.A06;
            if (radioButton != null) {
                z = false;
            } else {
                return;
            }
        } else {
            StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment2 = this.A02;
            if (C108965cb.A1Y(statusAudienceSelectorShareSheetFragment2)) {
                RadioButton radioButton9 = statusAudienceSelectorShareSheetFragment2.A03;
                if (radioButton9 != null) {
                    radioButton9.setChecked(false);
                }
                RadioButton radioButton10 = statusAudienceSelectorShareSheetFragment2.A04;
                if (radioButton10 != null) {
                    radioButton10.setChecked(false);
                }
                radioButton = statusAudienceSelectorShareSheetFragment2.A05;
            } else {
                RadioButton radioButton11 = statusAudienceSelectorShareSheetFragment2.A02;
                if (radioButton11 != null) {
                    radioButton11.setChecked(false);
                }
                radioButton = statusAudienceSelectorShareSheetFragment2.A06;
            }
            if (radioButton != null) {
                z = true;
            } else {
                return;
            }
        }
        radioButton.setChecked(z);
    }

    public final void A00(int i) {
        Context context = this.A01;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i);
        Intent A0B = C72473Md.A0B(context, "com.whatsapp.contact.picker.AudienceSelectionContactPicker");
        A0B.putExtra("source_surface", 1);
        A0B.putExtra("use_custom_multiselect_limit", true);
        A0B.putExtra("custom_multiselect_limit", 2000);
        if (valueOf != null) {
            A0B.putExtra("status_distribution_mode", valueOf);
        }
        C111165iV r1 = this.A04;
        C108945cZ.A0u(this.A07).A03(A0B, new AnonymousClass77K(r1.A0T().A01, r1.A0T().A02, i2, r1.A0T().A05, r1.A0T().A06, false, false));
        this.A05.A02((C1406772n) null, A0B);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public C134086pz(Context context, AnonymousClass1LU r5, StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment, C136806uR r7, C111165iV r8, AnonymousClass00H r9) {
        C72473Md.A1I(r5, r9);
        this.A06 = r5;
        this.A03 = r7;
        this.A07 = r9;
        this.A01 = context;
        this.A04 = r8;
        this.A02 = statusAudienceSelectorShareSheetFragment;
        this.A05 = statusAudienceSelectorShareSheetFragment.CDw(new C1423779f(this, 0), new Object());
    }
}
