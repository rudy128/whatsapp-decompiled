package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet;
import com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.dogfood.MuteDiagnosticsDialogFragment;
import com.whatsapp.dogfood.MuteDiagnosticsDialogViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import com.whatsapp.settings.ActivityLevelNotificationSettingBottomSheet;

/* renamed from: X.4ep  reason: invalid class name and case insensitive filesystem */
public class C90904ep implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90904ep(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        View view;
        CommunitySettingsViewModel communitySettingsViewModel;
        Runnable r4;
        AnonymousClass8GZ r1;
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        String str;
        AnonymousClass4DY valueOf;
        AnonymousClass10I r12;
        int i2;
        switch (this.A00) {
            case 0:
                AllowNonAdminMembersAddBottomSheet allowNonAdminMembersAddBottomSheet = (AllowNonAdminMembersAddBottomSheet) this.A01;
                view = (View) this.A02;
                boolean z = false;
                if (!allowNonAdminMembersAddBottomSheet.A04) {
                    if (i != 2131433171) {
                        if (i == 2131433172) {
                            RadioButtonWithSubtitle radioButtonWithSubtitle2 = allowNonAdminMembersAddBottomSheet.A02;
                            if (radioButtonWithSubtitle2 != null) {
                                radioButtonWithSubtitle2.setEnabled(false);
                            }
                            communitySettingsViewModel = (CommunitySettingsViewModel) allowNonAdminMembersAddBottomSheet.A06.getValue();
                            z = true;
                        }
                        r4 = new C98764rg((Object) allowNonAdminMembersAddBottomSheet, 10);
                        break;
                    } else {
                        RadioButtonWithSubtitle radioButtonWithSubtitle3 = allowNonAdminMembersAddBottomSheet.A03;
                        if (radioButtonWithSubtitle3 != null) {
                            radioButtonWithSubtitle3.setEnabled(false);
                        }
                        communitySettingsViewModel = (CommunitySettingsViewModel) allowNonAdminMembersAddBottomSheet.A06.getValue();
                    }
                    if (!(communitySettingsViewModel.A02 == null || (r1 = communitySettingsViewModel.A01) == null)) {
                        r1.CRL(4, z);
                    }
                    r4 = new C98764rg((Object) allowNonAdminMembersAddBottomSheet, 10);
                } else {
                    return;
                }
            case 1:
                AllowNonAdminSubgroupCreationBottomSheet allowNonAdminSubgroupCreationBottomSheet = (AllowNonAdminSubgroupCreationBottomSheet) this.A01;
                View view2 = (View) this.A02;
                if (!allowNonAdminSubgroupCreationBottomSheet.A09) {
                    if (i == 2131433174) {
                        ((CommunitySettingsViewModel) allowNonAdminSubgroupCreationBottomSheet.A0A.getValue()).A0T(false);
                        radioButtonWithSubtitle = allowNonAdminSubgroupCreationBottomSheet.A05;
                    } else {
                        if (i == 2131433175) {
                            CommunitySettingsViewModel communitySettingsViewModel2 = (CommunitySettingsViewModel) allowNonAdminSubgroupCreationBottomSheet.A0A.getValue();
                            AnonymousClass1EC r2 = communitySettingsViewModel2.A03;
                            if (r2 != null) {
                                C98804rk.A01(communitySettingsViewModel2.A09, communitySettingsViewModel2, r2, 28);
                            }
                            radioButtonWithSubtitle = allowNonAdminSubgroupCreationBottomSheet.A04;
                        }
                        view2.postDelayed(new C98764rg((Object) allowNonAdminSubgroupCreationBottomSheet, 11), 500);
                        return;
                    }
                    if (radioButtonWithSubtitle != null) {
                        radioButtonWithSubtitle.setEnabled(false);
                    }
                    view2.postDelayed(new C98764rg((Object) allowNonAdminSubgroupCreationBottomSheet, 11), 500);
                    return;
                }
                return;
            case 2:
                View view3 = (View) this.A01;
                MuteDiagnosticsDialogFragment muteDiagnosticsDialogFragment = (MuteDiagnosticsDialogFragment) this.A02;
                C18070vi.A0d(view3, 0);
                View findViewById = view3.findViewById(i);
                if ((findViewById instanceof RadioButton) && findViewById != null) {
                    Object tag = findViewById.getTag();
                    if ((tag instanceof String) && (str = (String) tag) != null && (valueOf = AnonymousClass4DY.valueOf(str)) != null) {
                        ((MuteDiagnosticsDialogViewModel) muteDiagnosticsDialogFragment.A01.getValue()).A00 = valueOf;
                        return;
                    }
                    return;
                }
                return;
            default:
                ActivityLevelNotificationSettingBottomSheet activityLevelNotificationSettingBottomSheet = (ActivityLevelNotificationSettingBottomSheet) this.A01;
                view = (View) this.A02;
                if (i != 2131434312) {
                    if (i == 2131434313) {
                        RadioButtonWithSubtitle radioButtonWithSubtitle4 = activityLevelNotificationSettingBottomSheet.A00;
                        if (radioButtonWithSubtitle4 != null) {
                            radioButtonWithSubtitle4.setEnabled(false);
                        }
                        r12 = activityLevelNotificationSettingBottomSheet.A03;
                        if (r12 != null) {
                            i2 = 37;
                        }
                        AnonymousClass3MW.A1G();
                        throw null;
                    }
                    r4 = new C146777Qo((Object) activityLevelNotificationSettingBottomSheet, 38);
                    break;
                } else {
                    RadioButtonWithSubtitle radioButtonWithSubtitle5 = activityLevelNotificationSettingBottomSheet.A01;
                    if (radioButtonWithSubtitle5 != null) {
                        radioButtonWithSubtitle5.setEnabled(false);
                    }
                    r12 = activityLevelNotificationSettingBottomSheet.A03;
                    if (r12 != null) {
                        i2 = 36;
                    }
                    AnonymousClass3MW.A1G();
                    throw null;
                }
                AnonymousClass3MZ.A1U(r12, activityLevelNotificationSettingBottomSheet, i2);
                r4 = new C146777Qo((Object) activityLevelNotificationSettingBottomSheet, 38);
        }
        view.postDelayed(r4, 500);
    }
}
