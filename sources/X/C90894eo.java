package X;

import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.autodelete.NewsletterMediaSettingActivity;
import com.whatsapp.autodelete.NewsletterMediaSettingGlobalActivity;
import com.whatsapp.dmsetting.ChangeDMSettingActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity;

/* renamed from: X.4eo  reason: invalid class name and case insensitive filesystem */
public class C90894eo implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C90894eo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C107405Zo r1;
        String str;
        switch (this.A00) {
            case 0:
                C75663i0 r2 = (C75663i0) this.A01;
                C18070vi.A0d(radioGroup, 1);
                AnonymousClass200 A002 = C50482Up.A00(C72483Me.A05(radioGroup, i));
                if (r2 instanceof NewsletterMediaSettingGlobalActivity) {
                    AnonymousClass00H r0 = r2.A02;
                    if (r0 != null) {
                        AnonymousClass4MA r12 = (AnonymousClass4MA) ((AnonymousClass4M9) r0.get()).A01.get();
                        if (A002 != AnonymousClass200.DEFAULT) {
                            C17880vN.A1C(C18070vi.A03(r12.A01).edit(), "newsletter_auto_media_delete_mode", A002.value);
                            return;
                        }
                        return;
                    }
                    str = "autoDeleteMediaManager";
                } else {
                    NewsletterMediaSettingActivity newsletterMediaSettingActivity = (NewsletterMediaSettingActivity) r2;
                    AnonymousClass00H r02 = newsletterMediaSettingActivity.A02;
                    if (r02 != null) {
                        AnonymousClass4M9 r13 = (AnonymousClass4M9) r02.get();
                        C29681ch r03 = newsletterMediaSettingActivity.A00;
                        if (r03 == null) {
                            str = "newsletterJid";
                        } else {
                            AnonymousClass1Nb r22 = r13.A00;
                            C42551yM A0a = r22.A0a(r03);
                            if (A002 != A0a.A0C) {
                                A0a.A0C = A002;
                                AnonymousClass1Nb.A07(A0a, r22);
                                return;
                            }
                            return;
                        }
                    }
                    str = "autoDeleteMediaManager";
                }
                C18070vi.A11(str);
                throw null;
            case 1:
                ChangeDMSettingActivity changeDMSettingActivity = (ChangeDMSettingActivity) this.A01;
                C18070vi.A0d(radioGroup, 1);
                int A05 = C72483Me.A05(radioGroup, i);
                changeDMSettingActivity.A02 = A05;
                ChangeDMSettingActivity.A0V(changeDMSettingActivity, A05);
                return;
            case 2:
                C18070vi.A0d(radioGroup, 1);
                ((ChangeEphemeralSettingActivity) this.A01).A00 = C72483Me.A05(radioGroup, i);
                return;
            case 3:
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                C18070vi.A0d(radioGroup, 1);
                AnonymousClass1FL A1B = dialogFragment.A1B();
                if ((A1B instanceof C107405Zo) && (r1 = (C107405Zo) A1B) != null) {
                    r1.Bsk(C72483Me.A05(radioGroup, i));
                }
                dialogFragment.A28();
                return;
            case 4:
                C18070vi.A0d(radioGroup, 1);
                Object tag = radioGroup.findViewById(i).getTag();
                C18070vi.A0z(tag, "null cannot be cast to non-null type kotlin.Int");
                ((ChangeExpiringGroupsSettingActivity) this.A01).A01 = AnonymousClass000.A0M(tag);
                return;
            default:
                ((View) this.A01).setEnabled(true);
                return;
        }
    }
}
